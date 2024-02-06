package com.thunderhead.android.infrastructure.server.entitys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class LastModifiedBy implements Serializable {
    private static final long serialVersionUID = 6119973829985942378L;
    @SerializedName("name")
    @Expose
    private String name;

    public LastModifiedBy() {
    }

    public LastModifiedBy(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }
}
