package com.thunderhead.android.infrastructure.server.entitys;

import com.google.gson.annotations.SerializedName;

public class ContentImage {
    @SerializedName("image-url")
    public String imageUrl;

    public /* synthetic */ ContentImage() {
    }

    public ContentImage(String str) {
        this.imageUrl = null;
        this.imageUrl = str;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
}
