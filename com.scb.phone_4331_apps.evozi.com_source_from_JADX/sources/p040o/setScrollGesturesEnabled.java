package p040o;

/* renamed from: o.setScrollGesturesEnabled */
public final class setScrollGesturesEnabled {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public setScrollGesturesEnabled() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setScrollGesturesEnabled)) {
            return false;
        }
        setScrollGesturesEnabled setscrollgesturesenabled = (setScrollGesturesEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setscrollgesturesenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setscrollgesturesenabled.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CodeDescription(code=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setScrollGesturesEnabled(String str, String str2) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    private /* synthetic */ setScrollGesturesEnabled(byte b) {
        this((String) null, (String) null);
    }
}
