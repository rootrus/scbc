package p040o;

/* renamed from: o.setMapToolbarEnabled */
public enum setMapToolbarEnabled {
    SUCCESS("SUCCESS"),
    CASA_FAIL("CASA_FAIL"),
    CARD_FAIL("CARD_FAIL"),
    FAIL("FAIL");
    
    public static final setMapToolbarEnabled$MediaBrowserCompat$ItemReceiver Companion = null;
    public final String key;

    public static final setMapToolbarEnabled read(String str) {
        return setMapToolbarEnabled$MediaBrowserCompat$ItemReceiver.write(str);
    }

    private setMapToolbarEnabled(String str) {
        this.key = str;
    }

    static {
        Companion = new setMapToolbarEnabled$MediaBrowserCompat$ItemReceiver((byte) 0);
    }
}
