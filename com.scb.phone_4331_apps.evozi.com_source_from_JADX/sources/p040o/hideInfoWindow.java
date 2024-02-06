package p040o;

import p040o.GeoDataClient;

/* renamed from: o.hideInfoWindow */
public final class hideInfoWindow {
    public final GeoDataClient.read IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hideInfoWindow)) {
            return false;
        }
        hideInfoWindow hideinfowindow = (hideInfoWindow) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) hideinfowindow.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) hideinfowindow.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) hideinfowindow.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) hideinfowindow.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) hideinfowindow.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        GeoDataClient.read read2 = this.IconCompatParcelizer;
        int hashCode3 = read2 != null ? read2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FixedTransferDetailsAccount(accountNo=");
        sb.append(this.write);
        sb.append(", accountNickname=");
        sb.append(this.read);
        sb.append(", accountType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", allowFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountStatus=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public hideInfoWindow(String str, String str2, GeoDataClient.read read2, String str3, String str4) {
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = read2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
    }
}
