package com.thunderhead.android.infrastructure.server.entitys;

public class Criteria {
    private String filter;
    private Page page;
    private Sort[] sort;

    public String getFilter() {
        return this.filter;
    }

    public Page getPage() {
        return this.page;
    }

    private Sort[] getSort() {
        return this.sort;
    }
}
