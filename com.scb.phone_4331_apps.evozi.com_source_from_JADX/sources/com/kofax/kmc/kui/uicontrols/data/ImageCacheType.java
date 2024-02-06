package com.kofax.kmc.kui.uicontrols.data;

public enum ImageCacheType {
    MEMORY(IMAGE_CACHE_TYPE_MEMORY),
    DISK(IMAGE_CACHE_TYPE_DISK);
    
    public static final String IMAGE_CACHE_TYPE_DISK = "IMAGE_CACHE_TYPE_DISK";
    public static final String IMAGE_CACHE_TYPE_MEMORY = "IMAGE_CACHE_TYPE_MEMORY";

    /* renamed from: nw */
    private final String f706nw;

    private ImageCacheType(String str) {
        this.f706nw = str;
    }

    public final String getIdentifier() {
        return this.f706nw;
    }
}
