package com.thunderhead.android.infrastructure.server.requests;

public abstract class AddTrackingPointRequest {
    String dataAdapterAttributeId = "";
    String dataAdapterAttributeName = "";
    boolean enabled = false;
    String eventTypeId = "";
    boolean goalCompletion = false;
    String interactionId = "";
    String name = "";
    String path = null;
    String propositionId = "";
    String trackingPointType = "";

    protected AddTrackingPointRequest(String str, String str2) {
        this.trackingPointType = str;
        this.path = str2;
    }

    public void setGoalCompletion(boolean z) {
        this.goalCompletion = z;
    }

    public void setPropositionId(String str) {
        this.propositionId = str;
    }

    public void setDataAdapterAttributeId(String str) {
        this.dataAdapterAttributeId = str;
    }

    public void setDataAdapterAttributeName(String str) {
        this.dataAdapterAttributeName = str;
    }

    public void setEventTypeId(String str) {
        this.eventTypeId = str;
    }

    public void setInteractionId(String str) {
        this.interactionId = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AddTrackingPointRequest{name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", path='");
        sb.append(this.path);
        sb.append('\'');
        sb.append(", propositionId='");
        sb.append(this.propositionId);
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
        sb.append('}');
        return sb.toString();
    }
}
