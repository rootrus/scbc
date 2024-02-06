package p040o;

import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.setOnMyLocationChangeListener */
public enum setOnMyLocationChangeListener {
    SETUP("0"),
    NORMAL(DiskLruCache.VERSION_1),
    WITHOUT_PRE_REQUISITE("2"),
    ERROR("-1");
    
    public String type;

    private setOnMyLocationChangeListener(String str) {
        this.type = str;
    }

    public static setOnMyLocationChangeListener read(String str) {
        if (WITHOUT_PRE_REQUISITE.type.equals(str)) {
            return WITHOUT_PRE_REQUISITE;
        }
        if (NORMAL.type.equals(str)) {
            return NORMAL;
        }
        if (ERROR.type.equals(str)) {
            return ERROR;
        }
        return SETUP;
    }
}
