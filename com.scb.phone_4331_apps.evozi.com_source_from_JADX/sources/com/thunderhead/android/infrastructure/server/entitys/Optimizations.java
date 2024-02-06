package com.thunderhead.android.infrastructure.server.entitys;

import p040o.AlertController$RecycleListView;

public class Optimizations {
    public String data;
    public String dataMimeType;
    public String directives;
    public String name;
    public String path;
    public String responseId;
    public Viewpoint viewpoint;

    public String getData() {
        return this.data;
    }

    public String getPath() {
        return this.path;
    }

    public String getResponseId() {
        return this.responseId;
    }

    public String getDataMimeType() {
        return this.dataMimeType;
    }

    public String getDirectives() {
        return this.directives;
    }

    public String getName() {
        return this.name;
    }

    public Viewpoint getViewpoint() {
        return this.viewpoint;
    }

    public boolean dataObjectIsPresent() {
        String str = this.data;
        return str != null && !str.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"data\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.data));
        sb.append(", \"path\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.path));
        sb.append(", \"responseId\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.responseId));
        sb.append(", \"dataMimeType\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.dataMimeType));
        sb.append(", \"directives\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.directives));
        return sb.toString();
    }
}
