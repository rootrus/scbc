package com.thunderhead.android.infrastructure.server.entitys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class TouchpointData implements Serializable {
    private static final long serialVersionUID = -392279464778385395L;
    @SerializedName("baseUrl")
    @Expose
    private String baseUrl;
    @SerializedName("channel")
    @Expose
    private String channel;
    @SerializedName("createdBy")
    @Expose
    private CreatedBy createdBy;
    @SerializedName("createdDate")
    @Expose
    private Long createdDate;
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private String f3114id;
    @SerializedName("interactionsCount")
    @Expose
    private int interactionsCount;
    @SerializedName("lastModifiedBy")
    @Expose
    private LastModifiedBy lastModifiedBy;
    @SerializedName("lastModifiedDate")
    @Expose
    private Long lastModifiedDate;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("published")
    @Expose
    private boolean published;
    @SerializedName("publishedState")
    @Expose
    private String publishedState;

    public int getInteractionsCount() {
        return this.interactionsCount;
    }

    public void setInteractionsCount(int i) {
        this.interactionsCount = i;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public void setBaseUrl(String str) {
        this.baseUrl = str;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public boolean isPublished() {
        return this.published;
    }

    public void setPublished(boolean z) {
        this.published = z;
    }

    public String getPublishedState() {
        return this.publishedState;
    }

    public void setPublishedState(String str) {
        this.publishedState = str;
    }

    public Long getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Long l) {
        this.lastModifiedDate = l;
    }

    public CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(CreatedBy createdBy2) {
        this.createdBy = createdBy2;
    }

    public Long getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Long l) {
        this.createdDate = l;
    }

    public LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setLastModifiedBy(LastModifiedBy lastModifiedBy2) {
        this.lastModifiedBy = lastModifiedBy2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getId() {
        return this.f3114id;
    }

    public void setId(String str) {
        this.f3114id = str;
    }
}
