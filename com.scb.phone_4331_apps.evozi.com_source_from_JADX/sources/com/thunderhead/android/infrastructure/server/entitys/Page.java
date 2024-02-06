package com.thunderhead.android.infrastructure.server.entitys;

public class Page {
    private int pageNumber;
    private long pageSize;
    private int totalPages;
    private int totalResults;

    public int getPageNumber() {
        return this.pageNumber;
    }

    public long getPageSize() {
        return this.pageSize;
    }

    public int getTotalResults() {
        return this.totalResults;
    }

    public int getTotalPages() {
        return this.totalPages;
    }
}
