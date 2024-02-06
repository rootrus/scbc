package p040o;

/* renamed from: o.getCamera */
public final class getCamera {
    private final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCamera)) {
            return false;
        }
        getCamera getcamera = (getCamera) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcamera.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcamera.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcamera.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getcamera.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcamera.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country(countryCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", countryDescTh=");
        sb.append(this.write);
        sb.append(", countryDescEn=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", status=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", lastUpdateDate=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getCamera(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "countryCode");
        onGetStartedClick.write((Object) str2, "countryDescTh");
        onGetStartedClick.write((Object) str3, "countryDescEn");
        onGetStartedClick.write((Object) str4, "status");
        onGetStartedClick.write((Object) str5, "lastUpdateDate");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.IconCompatParcelizer = str4;
        this.read = str5;
    }
}
