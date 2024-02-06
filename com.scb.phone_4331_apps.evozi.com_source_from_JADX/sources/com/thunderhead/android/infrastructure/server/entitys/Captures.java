package com.thunderhead.android.infrastructure.server.entitys;

import java.util.regex.Pattern;
import p040o.AlertController$RecycleListView;
import p040o.ECouponDetailActivity;

public class Captures {
    public String attribute;
    public int captureDelay;
    public String capturePhase;
    public String captureType;
    public AttributeData dataAdapterAttribute;
    public String dataAdapterAttributeId;
    public String domainName;
    public String elementName;
    public String elementType;
    public boolean enabled;

    /* renamed from: id */
    public String f3110id = "";
    public String interactionId;
    public int isRepeating = -1;
    public String name;
    public String pageRef;
    public String path;
    public Pattern pathPattern;
    public String propositionId;
    public String propositionRef;
    public String typeName;

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

    public Captures() {
    }

    public Captures(String str) {
        this.path = str;
    }

    public Captures(String str, String str2) {
        this.f3110id = str;
        this.path = str2;
    }

    public String getPageRef() {
        return this.pageRef;
    }

    public String getPropositionRef() {
        return this.propositionRef;
    }

    public AttributeData getDataAdapterAttribute() {
        return this.dataAdapterAttribute;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public String getDataAdapterAttributeId() {
        return this.dataAdapterAttributeId;
    }

    public String getInteractionId() {
        return this.interactionId;
    }

    public String getPropositionId() {
        return this.propositionId;
    }

    public String getName() {
        return this.name;
    }

    public String getDomainName() {
        return this.domainName;
    }

    public String getId() {
        return this.f3110id;
    }

    public String getPath() {
        return this.path;
    }

    public String getElementName() {
        return this.elementName;
    }

    public String getElementType() {
        return this.elementType;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public String getCaptureType() {
        return this.captureType;
    }

    public String getAttribute() {
        return this.attribute;
    }

    public String getCapturePhase() {
        return this.capturePhase;
    }

    public int getCaptureDelay() {
        return this.captureDelay;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"id\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.f3110id));
        sb.append(", \"path\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.path));
        sb.append(", \"elementName\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.elementName));
        sb.append(", \"elementType\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.elementType));
        sb.append(", \"typeName\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.typeName));
        sb.append(", \"captureType\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.captureType));
        sb.append(", \"attribute\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.attribute));
        sb.append(", \"capturePhase\": ");
        sb.append(AlertController$RecycleListView.MediaDescriptionCompat(this.capturePhase));
        sb.append(", \"captureDelay\": ");
        sb.append(this.captureDelay);
        return sb.toString();
    }
}
