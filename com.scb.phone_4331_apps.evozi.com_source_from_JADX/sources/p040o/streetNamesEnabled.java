package p040o;

/* renamed from: o.streetNamesEnabled */
public final class streetNamesEnabled {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof streetNamesEnabled)) {
            return false;
        }
        streetNamesEnabled streetnamesenabled = (streetNamesEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) streetnamesenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) streetnamesenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) streetnamesenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) streetnamesenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) streetnamesenabled.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Biller(merchantName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", billerLogo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", ref1Label=");
        sb.append(this.read);
        sb.append(", ref2Label=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", ref3Label=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public streetNamesEnabled(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str3, "ref1Label");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.write = str5;
    }
}
