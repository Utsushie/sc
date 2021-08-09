package com.sc.core.cloudprovider.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

/**
 * User: YanXin
 * Date: 2020/9/24
 * Time: 18:14
 */
@Getter
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class PageBean {

    private int page = 1;

    private int pageSize = 10;

    private int start;

    private int end;

    private int pageType;

    private int offset;

    private int total;

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setPageType(int pageType) {
        this.pageType = pageType;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPage(int page) {
        this.page = page;
    }
    
    public void setPageSize(int pageSize) {
        this.start = (this.page - 1) * pageSize;
        this.pageSize = pageSize;
    }
    
}
