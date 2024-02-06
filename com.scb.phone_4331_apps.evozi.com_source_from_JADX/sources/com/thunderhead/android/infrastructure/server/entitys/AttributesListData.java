package com.thunderhead.android.infrastructure.server.entitys;

public class AttributesListData {
    private boolean cacheable;
    private String cachingPeriod;
    private String dataAdapterType;
    private String definitionDescription;
    private String definitionExtendedDescription;
    private String definitionName;
    private String description;

    /* renamed from: id */
    private String f3108id;
    private String name;
    private Object[] properties;
    private String pushOperationDefinitions;
    private AttributeData rootAttribute;
    private String type;
    private boolean workspaceDefault;

    public AttributeData getRootAttribute() {
        return this.rootAttribute;
    }

    public String getId() {
        return this.f3108id;
    }
}
