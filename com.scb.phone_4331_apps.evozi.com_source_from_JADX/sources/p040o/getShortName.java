package p040o;

import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.getShortName */
public enum getShortName {
    TYPE_UNKNOWN("-1"),
    TYPE_LONG_TERM("0"),
    TYPE_FIXED(DiskLruCache.VERSION_1),
    TYPE_SAVING("2"),
    TYPE_CURRENT("3");
    
    public String value;

    private getShortName(String str) {
        this.value = str;
    }

    public static getShortName IconCompatParcelizer(String str) {
        if (TYPE_LONG_TERM.value.equals(str)) {
            return TYPE_LONG_TERM;
        }
        if (TYPE_FIXED.value.equals(str)) {
            return TYPE_FIXED;
        }
        if (TYPE_SAVING.value.equals(str)) {
            return TYPE_SAVING;
        }
        if (TYPE_CURRENT.value.equals(str)) {
            return TYPE_CURRENT;
        }
        return TYPE_UNKNOWN;
    }
}
