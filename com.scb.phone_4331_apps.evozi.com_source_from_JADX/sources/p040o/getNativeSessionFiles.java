package p040o;

/* renamed from: o.getNativeSessionFiles */
public final class getNativeSessionFiles {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNativeSessionFiles)) {
            return false;
        }
        getNativeSessionFiles getnativesessionfiles = (getNativeSessionFiles) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getnativesessionfiles.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getnativesessionfiles.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getnativesessionfiles.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getnativesessionfiles.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendsLandingDisplay(imagePath=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", referCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tncUrl=");
        sb.append(this.write);
        sb.append(", sharedText=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getNativeSessionFiles(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "imagePath");
        onGetStartedClick.write((Object) str2, "referCode");
        onGetStartedClick.write((Object) str3, "tncUrl");
        onGetStartedClick.write((Object) str4, "sharedText");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
    }
}
