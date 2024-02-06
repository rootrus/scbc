package p040o;

/* renamed from: o.setDimensions */
public enum setDimensions {
    OPEN("OPEN"),
    CLOSED("CLOSED"),
    UNDEFINED("UNDEFINED");
    
    public String status;

    private setDimensions(String str) {
        this.status = str;
    }

    public static setDimensions MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (OPEN.status.equals(str)) {
            return OPEN;
        }
        if (CLOSED.status.equals(str)) {
            return CLOSED;
        }
        return UNDEFINED;
    }
}
