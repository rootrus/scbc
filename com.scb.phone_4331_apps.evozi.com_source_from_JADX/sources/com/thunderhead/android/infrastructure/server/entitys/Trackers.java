package com.thunderhead.android.infrastructure.server.entitys;

import java.util.regex.Pattern;
import p040o.AlertController$RecycleListView;
import p040o.ECouponDetailActivity;

public class Trackers {

    /* renamed from: id */
    private String f3115id;
    private int isRepeating = -1;
    private String overlappingItemPath;
    private String path;
    private Pattern pathPattern;

    public boolean isRepeating() {
        if (this.isRepeating == -1) {
            this.isRepeating = ECouponDetailActivity.write(this.path) ? 1 : 0;
        }
        return this.isRepeating == 1;
    }

    public Pattern getPattern() {
        if (this.pathPattern == null) {
            this.pathPattern = ECouponDetailActivity.MediaBrowserCompat$ItemReceiver(this.path);
        }
        return this.pathPattern;
    }

    public Trackers() {
    }

    public Trackers(String str, String str2) {
        this.f3115id = str;
        this.path = str2;
    }

    public String getId() {
        return this.f3115id;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String getOverlappingItemPath() {
        return this.overlappingItemPath;
    }

    public void setOverlappingItemPath(String str) {
        this.overlappingItemPath = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"id\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.f3115id));
        sb.append(", \"path\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.path));
        return sb.toString();
    }
}
