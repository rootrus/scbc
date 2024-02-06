package p040o;

/* renamed from: o.getMaxWaitTime */
public final class getMaxWaitTime {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMaxWaitTime)) {
            return false;
        }
        getMaxWaitTime getmaxwaittime = (getMaxWaitTime) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getmaxwaittime.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getmaxwaittime.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getmaxwaittime.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getmaxwaittime.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getmaxwaittime.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiscoverHighlight(picturePath=");
        sb.append(this.write);
        sb.append(", caption=");
        sb.append(this.read);
        sb.append(", header=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", description=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", webviewUrl=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getMaxWaitTime(String str, String str2, String str3, String str4, String str5) {
        this.write = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
    }
}
