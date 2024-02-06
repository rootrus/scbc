package p040o;

/* renamed from: o.getVisibleRegion */
public final class getVisibleRegion {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getVisibleRegion)) {
            return false;
        }
        getVisibleRegion getvisibleregion = (getVisibleRegion) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getvisibleregion.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getvisibleregion.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getvisibleregion.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Item(label=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", value=");
        sb.append(this.read);
        sb.append(", type=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getVisibleRegion(String str, String str2, String str3) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
        this.write = str3;
    }
}
