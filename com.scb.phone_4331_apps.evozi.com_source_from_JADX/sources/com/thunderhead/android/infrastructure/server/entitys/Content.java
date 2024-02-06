package com.thunderhead.android.infrastructure.server.entitys;

import com.google.gson.annotations.SerializedName;
import p040o.FragmentBuilder_BindHmlETBSummaryFragment;

public class Content {
    @SerializedName("background-color")
    public String backgroundColor;
    public ContentImage image;
    public ContentMessage message;
    @SerializedName("presentation-time")
    public long presentationTime;
    public String type;
    public String webOneTagUrl;

    public /* synthetic */ Content() {
    }

    public Content(String str, ContentMessage contentMessage, ContentImage contentImage, long j, String str2) {
        this.backgroundColor = null;
        this.type = str;
        this.message = contentMessage;
        this.image = contentImage;
        this.presentationTime = j;
        this.backgroundColor = str2;
    }

    public String getWebOneTagUrl() {
        return this.webOneTagUrl;
    }

    public String getType() {
        return this.type;
    }

    public String getMessage() {
        ContentMessage contentMessage = this.message;
        if (contentMessage == null) {
            return "";
        }
        return contentMessage.getText();
    }

    public String getImageUrl() {
        ContentImage contentImage = this.image;
        if (contentImage == null) {
            return "";
        }
        return contentImage.getImageUrl();
    }

    public String getTextColor() {
        ContentMessage contentMessage = this.message;
        if (contentMessage == null) {
            return "";
        }
        return contentMessage.getTextColor();
    }

    public int getTextSize() {
        ContentMessage contentMessage = this.message;
        if (contentMessage == null) {
            return 0;
        }
        return contentMessage.getTextSize();
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public long getPresentationTime() {
        return this.presentationTime;
    }

    public Boolean getShowOnTop() {
        return Boolean.valueOf(FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.MINI_NOTIFICATION_TOP.toString().equals(this.type));
    }
}
