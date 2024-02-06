package com.thunderhead.android.infrastructure.server.entitys;

public class Proposition {
    public static final String SEARCH_GROUP_ID = "SEARCH_GROUP_ID";
    private Proposition[] children;
    private String code;

    /* renamed from: id */
    private String f3112id;
    private String name;
    private String parentId;
    private String path;
    private String type;

    public Proposition() {
        this((String) null, (String) null);
    }

    public Proposition(String str, String str2) {
        this.f3112id = str;
        this.name = str2;
        this.children = new Proposition[0];
    }

    public Proposition(String str) {
        this((String) null, str);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public String getParentId() {
        return this.parentId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getId() {
        return this.f3112id;
    }

    public void setId(String str) {
        this.f3112id = str;
    }

    public Proposition[] getChildren() {
        return this.children;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }
}
