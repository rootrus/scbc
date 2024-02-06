package com.thunderhead.android.infrastructure.server.entitys;

public class TrackingPointData {
    public static final String ON_CLICK_TYPE = "ON_CLICK";
    public static final String ON_LOAD_TYPE = "ON_LOAD";
    public String createdDate = "";
    public String dataAdapterAttributeId = "";
    public String dataAdapterAttributeName = "";
    public boolean enabled = false;
    public String eventTypeId = "";
    public String eventTypeName = "";
    public boolean goalCompletion = false;

    /* renamed from: id */
    public String f3116id = "";
    public String interactionId = "";
    public String name = "";
    public String path = null;
    public String propositionId = "";
    public String propositionName = "";
    public String trackingPointType = "";

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public String getPropositionName() {
        return this.propositionName;
    }

    public String getPropositionId() {
        return this.propositionId;
    }

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    public String getEventTypeId() {
        return this.eventTypeId;
    }

    public String getInteractionId() {
        return this.interactionId;
    }

    public String getTrackingPointType() {
        return this.trackingPointType;
    }

    public boolean isGoalCompletion() {
        return this.goalCompletion;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public String getId() {
        return this.f3116id;
    }

    public String getDataAdapterAttributeId() {
        return this.dataAdapterAttributeId;
    }

    public String getDataAdapterAttributeName() {
        return this.dataAdapterAttributeName;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackingPointData{name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", path='");
        sb.append(this.path);
        sb.append('\'');
        sb.append(", propositionName='");
        sb.append(this.propositionName);
        sb.append('\'');
        sb.append(", propositionId='");
        sb.append(this.propositionId);
        sb.append('\'');
        sb.append(", eventTypeName='");
        sb.append(this.eventTypeName);
        sb.append('\'');
        sb.append(", eventTypeId='");
        sb.append(this.eventTypeId);
        sb.append('\'');
        sb.append(", interactionId='");
        sb.append(this.interactionId);
        sb.append('\'');
        sb.append(", trackingPointType='");
        sb.append(this.trackingPointType);
        sb.append('\'');
        sb.append(", goalCompletion=");
        sb.append(this.goalCompletion);
        sb.append(", enabled=");
        sb.append(this.enabled);
        sb.append(", createDate=");
        sb.append(this.createdDate);
        sb.append(", id='");
        sb.append(this.f3116id);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
