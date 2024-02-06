package p040o;

/* renamed from: o.setIndoorEnabled */
public final class setIndoorEnabled {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIndoorEnabled)) {
            return false;
        }
        setIndoorEnabled setindoorenabled = (setIndoorEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setindoorenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setindoorenabled.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchPointUserInfo(name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", logoPath=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setIndoorEnabled(String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
    }
}
