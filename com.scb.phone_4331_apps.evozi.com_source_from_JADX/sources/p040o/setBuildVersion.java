package p040o;

/* renamed from: o.setBuildVersion */
public enum setBuildVersion {
    RTP_ACTION_ID("501"),
    GIFT_ACTION_ID("511A"),
    NONE("null");
    
    private String actionId;

    private setBuildVersion(String str) {
        this.actionId = str;
    }

    public static setBuildVersion MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (RTP_ACTION_ID.actionId.equals(str)) {
            return RTP_ACTION_ID;
        }
        if (GIFT_ACTION_ID.actionId.equals(str)) {
            return GIFT_ACTION_ID;
        }
        return NONE;
    }
}
