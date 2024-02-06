package p040o;

/* renamed from: o.setPageTransformer */
public enum setPageTransformer {
    SUCCESS("1000"),
    RESTRICTED("1001"),
    ERROR("error");
    
    public String status;

    private setPageTransformer(String str) {
        this.status = str;
    }

    public static setPageTransformer MediaBrowserCompat$ItemReceiver(String str) {
        if (SUCCESS.status.equals(str)) {
            return SUCCESS;
        }
        if (RESTRICTED.status.equals(str)) {
            return RESTRICTED;
        }
        return ERROR;
    }
}
