package p040o;

/* renamed from: o.setLoiteringDelay */
public final class setLoiteringDelay {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaDescriptionCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLoiteringDelay)) {
            return false;
        }
        setLoiteringDelay setloiteringdelay = (setLoiteringDelay) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setloiteringdelay.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setloiteringdelay.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setloiteringdelay.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setloiteringdelay.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setloiteringdelay.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setloiteringdelay.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MerchantInfo(id=");
        sb.append(this.read);
        sb.append(", name=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", code=");
        sb.append(this.write);
        sb.append(", terminal=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", urlLogo=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", referenceOrder=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setLoiteringDelay(String str, String str2, String str3, String str4, String str5, String str6) {
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaDescriptionCompat = str5;
        this.MediaBrowserCompat$ItemReceiver = str6;
    }
}
