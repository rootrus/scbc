package p040o;

/* renamed from: o.GeofencingApi */
public final class GeofencingApi {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaMetadataCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeofencingApi)) {
            return false;
        }
        GeofencingApi geofencingApi = (GeofencingApi) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) geofencingApi.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) geofencingApi.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) geofencingApi.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) geofencingApi.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) geofencingApi.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) geofencingApi.write);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PaymentInfo(type=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", title=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(", header=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", imageURL=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", QRstring=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public GeofencingApi(String str, String str2, String str3, String str4, String str5, String str6) {
        this.MediaMetadataCompat = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
        this.write = str6;
    }
}
