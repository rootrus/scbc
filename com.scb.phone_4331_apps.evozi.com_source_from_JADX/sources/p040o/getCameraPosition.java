package p040o;

/* renamed from: o.getCameraPosition */
public final class getCameraPosition {
    public String MediaBrowserCompat$ItemReceiver;
    public String write;

    public getCameraPosition() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCameraPosition)) {
            return false;
        }
        getCameraPosition getcameraposition = (getCameraPosition) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcameraposition.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcameraposition.write);
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
        sb.append("Ekyc(productName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", remark=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    private getCameraPosition(String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = null;
        this.write = null;
    }

    public /* synthetic */ getCameraPosition(byte b) {
        this((String) null, (String) null);
    }
}
