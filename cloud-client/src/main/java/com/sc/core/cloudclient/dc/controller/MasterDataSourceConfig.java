package com.sc.core.cloudclient.dc.controller;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = MasterDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "clusterSqlSessionFactory")
public class MasterDataSourceConfig {

    //dao层扫描路径
    static final String PACKAGE = "com.sc.core.cloudclient.controller.*.dao";
    //mapper.xml扫描路径
    static final String MAPPER_LOCATION = "classpath:mapper/postgresql/*/*.xml";

    @Value("${spring.datasource.druid.url}")
    private String url;

    @Value("${spring.datasource.druid.username}")
    private String user;

    @Value("${spring.datasource.druid.password}")
    private String password;

    @Value("${spring.datasource.druid.driver-class-name}")
    private String driverClass;

    /*@Autowired
    @Qualifier("postgresqlDataSource")
    private DataSource postgresqlDataSource;*/

    @Bean(name = "postgresqlDataSource")
    @Primary
    public DataSource masterDataSource() {
        /*List filterList=new ArrayList<>();
        filterList.add(wallFilter());*/
        DruidDataSource druidDataSource = new DruidDataSource();
        //druidDataSource.setProxyFilters(filterList);
        druidDataSource.setDriverClassName(this.driverClass);
        druidDataSource.setUrl(this.url);
        druidDataSource.setUsername(this.user);
        druidDataSource.setPassword(this.password);
        return druidDataSource;
        //return DataSourceBuilder.create().type(com.alibaba.druid.pool.DruidDataSource.class).build();
    }

    @Bean(name = "clusterTransactionManager")
    public DataSourceTransactionManager clusterTransactionManager() {
        return new DataSourceTransactionManager(masterDataSource());
    }

    @Bean(name = "clusterSqlSessionFactory")
    public SqlSessionFactory clusterSqlSessionFactory(@Qualifier("postgresqlDataSource") DataSource postgresqlDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(postgresqlDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(MasterDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

    /*@Bean(name = "mysqlDataSource")
    @Qualifier("mysqlDataSource")
    @ConfigurationProperties(prefix="spring.datasource.primary")
    public DataSource primaryDataSource() {
        DataSource dataSource = new DruidDataSource();
        return dataSource;
    }*/

    /*@Bean(name = "postgresqlDataSource")
    @Qualifier("postgresqlDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.secondary")
    public DataSource secondaryDataSource() {
        DataSource dataSource = new DruidDataSource();
        return dataSource;
    }*/

}
