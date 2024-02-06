package p040o;

/* renamed from: o.setEndCap */
public final class setEndCap {
    private final Boolean IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setEndCap)) {
            return false;
        }
        setEndCap setendcap = (setEndCap) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setendcap.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setendcap.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setendcap.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Boolean bool = this.IconCompatParcelizer;
        int hashCode2 = bool != null ? bool.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentScopes(key=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", displayVisible=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", displayName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setEndCap(String str, Boolean bool, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = bool;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
