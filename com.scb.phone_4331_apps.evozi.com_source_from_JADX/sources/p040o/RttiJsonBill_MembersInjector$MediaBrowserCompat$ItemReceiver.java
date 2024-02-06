package p040o;

/* renamed from: o.RttiJsonBill_MembersInjector$MediaBrowserCompat$ItemReceiver */
public enum RttiJsonBill_MembersInjector$MediaBrowserCompat$ItemReceiver {
    BLURRY("is_blurry"),
    MISSING_BORDERS("missing_borders"),
    LOW_CONTRAST("low_contrast"),
    WRONG_SATURATION("wrong_saturation"),
    WRONG_FILE("wrong_file");
    
    public String error;

    private RttiJsonBill_MembersInjector$MediaBrowserCompat$ItemReceiver(String str) {
        this.error = str;
    }

    public static RttiJsonBill_MembersInjector$MediaBrowserCompat$ItemReceiver write(String str) {
        if (BLURRY.error.equalsIgnoreCase(str)) {
            return BLURRY;
        }
        if (MISSING_BORDERS.error.equalsIgnoreCase(str)) {
            return MISSING_BORDERS;
        }
        if (LOW_CONTRAST.error.equalsIgnoreCase(str)) {
            return LOW_CONTRAST;
        }
        if (WRONG_SATURATION.error.equalsIgnoreCase(str)) {
            return WRONG_SATURATION;
        }
        return WRONG_FILE;
    }
}
