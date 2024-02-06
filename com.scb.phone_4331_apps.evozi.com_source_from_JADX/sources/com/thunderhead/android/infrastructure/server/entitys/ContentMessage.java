package com.thunderhead.android.infrastructure.server.entitys;

import android.text.Html;
import com.google.gson.annotations.SerializedName;

public class ContentMessage {
    @SerializedName("text")
    public String text;
    @SerializedName("text-color")
    public String textColor;
    @SerializedName("text-size")
    public int textSize;

    public /* synthetic */ ContentMessage() {
    }

    public ContentMessage(String str, int i, String str2) {
        this.text = null;
        this.textSize = 0;
        this.textColor = null;
        this.text = str;
        this.textSize = i;
        this.textColor = str2;
    }

    public String getText() {
        return Html.fromHtml(this.text).toString();
    }

    public int getTextSize() {
        return this.textSize;
    }

    public String getTextColor() {
        return this.textColor;
    }
}
