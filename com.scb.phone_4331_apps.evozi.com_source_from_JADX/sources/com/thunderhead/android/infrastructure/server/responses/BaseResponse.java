package com.thunderhead.android.infrastructure.server.responses;

import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.Optimizations;
import com.thunderhead.android.infrastructure.server.entitys.Trackers;
import p040o.AlertController$RecycleListView;

public class BaseResponse {
    protected Captures[] captures;
    protected String interactionPath = "";
    protected Optimizations[] optimizations;
    protected int statusCode;
    protected String tid;
    protected String trace;
    protected Trackers[] trackers;

    protected BaseResponse() {
    }

    public BaseResponse(int i, String str, Trackers[] trackersArr, Captures[] capturesArr, Optimizations[] optimizationsArr, String str2) {
        this.statusCode = i;
        this.tid = str;
        this.trackers = trackersArr;
        this.captures = capturesArr;
        this.optimizations = optimizationsArr;
        this.trace = str2;
    }

    public BaseResponse(int i, String str, Trackers[] trackersArr, Captures[] capturesArr, Optimizations[] optimizationsArr, String str2, String str3) {
        this.statusCode = i;
        this.tid = str;
        this.trackers = trackersArr;
        this.captures = capturesArr;
        this.optimizations = optimizationsArr;
        this.trace = str2;
        this.interactionPath = str3;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getTid() {
        return this.tid;
    }

    public Trackers[] getTrackers() {
        return this.trackers;
    }

    public Captures[] getCaptures() {
        return this.captures;
    }

    public Optimizations[] getOptimizations() {
        return this.optimizations;
    }

    public String getTrace() {
        return this.trace;
    }

    public String getInteractionPath() {
        return this.interactionPath;
    }

    public void setInteractionPath(String str) {
        this.interactionPath = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"statusCode\": ");
        sb.append(this.statusCode);
        sb.append(", \"tid\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.tid));
        if (this.trackers != null) {
            sb.append(", \"trackers\": [");
            for (int i = 0; i < this.trackers.length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("{");
                sb2.append(this.trackers[i].toString());
                sb2.append("}");
                sb.append(sb2.toString());
            }
            sb.append("]");
        } else {
            sb.append(", \"trackers\": null");
        }
        if (this.captures != null) {
            sb.append(", \"captures\": [");
            for (int i2 = 0; i2 < this.captures.length; i2++) {
                if (i2 != 0) {
                    sb.append(", ");
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("{");
                sb3.append(this.captures[i2].toString());
                sb3.append("}");
                sb.append(sb3.toString());
            }
            sb.append("]");
        } else {
            sb.append(", \"captures\": null");
        }
        if (this.optimizations != null) {
            sb.append(", \"optimizations\": [");
            for (int i3 = 0; i3 < this.optimizations.length; i3++) {
                if (i3 != 0) {
                    sb.append(", ");
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("{");
                sb4.append(this.optimizations[i3].toString());
                sb4.append("}");
                sb.append(sb4.toString());
            }
            sb.append("]");
        } else {
            sb.append(", \"optimizations\": null");
        }
        sb.append(", \"trace\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.trace));
        sb.append("}");
        return sb.toString();
    }
}
