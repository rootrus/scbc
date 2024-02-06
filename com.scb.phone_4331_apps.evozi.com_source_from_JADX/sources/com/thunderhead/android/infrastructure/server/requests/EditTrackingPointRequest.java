package com.thunderhead.android.infrastructure.server.requests;

public class EditTrackingPointRequest {
    String dataAdapterAttributeId;
    String dataAdapterAttributeName;
    boolean enabled;
    String eventTypeId;
    String eventTypeName;
    boolean goalCompletion;

    /* renamed from: id */
    String f3119id;
    String interactionId;
    String name;
    String path;
    String propositionId;
    String propositionName;
    String trackingPointType;

    public EditTrackingPointRequest(String str) {
        this.trackingPointType = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPropositionName(String str) {
        this.propositionName = str;
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

    public void setEventTypeName(String str) {
        this.eventTypeName = str;
    }

    public void setEventTypeId(String str) {
        this.eventTypeId = str;
    }

    public void setGoalCompletion(boolean z) {
        this.goalCompletion = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setInteractionId(String str) {
        this.interactionId = str;
    }

    public void setId(String str) {
        this.f3119id = str;
    }
}
