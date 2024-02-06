package p040o;

/* renamed from: o.setMyLocationEnabled */
public final class setMyLocationEnabled extends zzuk {
    public final setOnCameraChangeListener MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMyLocationEnabled)) {
            return false;
        }
        setMyLocationEnabled setmylocationenabled = (setMyLocationEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setmylocationenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setmylocationenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setmylocationenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setmylocationenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setmylocationenabled.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        setOnCameraChangeListener setoncamerachangelistener = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = setoncamerachangelistener != null ? setoncamerachangelistener.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartnerConsent(callbackUrl=");
        sb.append(this.write);
        sb.append(", information=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", consentDescription=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", consentHtml=");
        sb.append(this.read);
        sb.append(", consentVersion=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }

    public setMyLocationEnabled(String str, setOnCameraChangeListener setoncamerachangelistener, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "callbackUrl");
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = setoncamerachangelistener;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.MediaBrowserCompat$MediaItem = str4;
    }
}
