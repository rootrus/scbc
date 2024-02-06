package com.thunderhead.android.infrastructure.server.requests;

public class AddEditCapturePointRequest {
    private String attribute;
    private int captureDelay;
    private String captureType;
    private String dataAdapterAttributeId;
    private String domainType;
    private String elementName;
    private String elementType;
    private boolean enabled;
    private String interactionId;
    private String name;
    private String path;
    private String propositionId;
    private String typeName;

    public void setTypeName(String str) {
        this.typeName = str;
    }

    public void setInteractionId(String str) {
        this.interactionId = str;
    }

    public void setElementName(String str) {
        this.elementName = str;
    }

    public void setPropositionId(String str) {
        this.propositionId = str;
    }

    public void setCaptureType(String str) {
        this.captureType = str;
    }

    public void setElementType(String str) {
        this.elementType = str;
    }

    public void setCaptureDelay(int i) {
        this.captureDelay = i;
    }

    public void setDomainType(String str) {
        this.domainType = str;
    }

    public void setDataAdapterAttributeId(String str) {
        this.dataAdapterAttributeId = str;
    }

    public void setAttribute(String str) {
        this.attribute = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("attribute:");
        sb.append(this.attribute);
        sb.append(", dataAdapterAttributeId:");
        sb.append(this.dataAdapterAttributeId);
        sb.append(", path:");
        sb.append(this.path);
        sb.append(", domainType:");
        sb.append(this.domainType);
        sb.append(", captureDelay:");
        sb.append(this.captureDelay);
        sb.append(", elementType:");
        sb.append(this.elementType);
        sb.append(", enabled:");
        sb.append(this.enabled);
        sb.append(", captureType:");
        sb.append(this.captureType);
        sb.append(", propositionId:");
        sb.append(this.propositionId);
        sb.append(", elementName:");
        sb.append(this.elementName);
        sb.append(", interactionId:");
        sb.append(this.interactionId);
        sb.append(", name:");
        sb.append(this.name);
        sb.append(", typeName:");
        sb.append(this.typeName);
        return sb.toString();
    }
}
