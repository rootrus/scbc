package com.thunderhead.android.infrastructure.server.entitys;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class CreatedBy implements Serializable {
    private static final long serialVersionUID = 7843457551911639068L;
    @SerializedName("name")
    @Expose
    private String name;

    public CreatedBy() {
    }

    public CreatedBy(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }
}
