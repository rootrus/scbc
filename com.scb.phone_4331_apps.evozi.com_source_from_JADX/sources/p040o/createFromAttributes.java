package p040o;

import java.util.List;
import p040o.GoogleMap;

/* renamed from: o.createFromAttributes */
public final class createFromAttributes {
    public final onMyLocationClick IconCompatParcelizer;
    public final onSnapshotReady MediaBrowserCompat$CustomActionResultReceiver;
    public final GoogleMap.OnPoiClickListener MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final List<String> MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String read;
    public final GoogleMap.OnPolygonClickListener write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createFromAttributes)) {
            return false;
        }
        createFromAttributes createfromattributes = (createFromAttributes) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) createfromattributes.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) createfromattributes.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) createfromattributes.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) createfromattributes.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) createfromattributes.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) createfromattributes.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) createfromattributes.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) createfromattributes.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) createfromattributes.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        GoogleMap.OnPoiClickListener onPoiClickListener = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = onPoiClickListener != null ? onPoiClickListener.hashCode() : 0;
        String str = this.read;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaMetadataCompat;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaDescriptionCompat;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = list != null ? list.hashCode() : 0;
        onMyLocationClick onmylocationclick = this.IconCompatParcelizer;
        int hashCode7 = onmylocationclick != null ? onmylocationclick.hashCode() : 0;
        GoogleMap.OnPolygonClickListener onPolygonClickListener = this.write;
        int hashCode8 = onPolygonClickListener != null ? onPolygonClickListener.hashCode() : 0;
        onSnapshotReady onsnapshotready = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (onsnapshotready != null) {
            i = onsnapshotready.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseSourceOfFund(creditCardInstallment=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", partnerId=");
        sb.append(this.read);
        sb.append(", partnerName=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", partnerTransactionId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", partnerType=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", partnerSubType=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", billPayment=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", creditCardFullAmount=");
        sb.append(this.write);
        sb.append(", merchantMetaData=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public createFromAttributes(GoogleMap.OnPoiClickListener onPoiClickListener, String str, String str2, String str3, String str4, List<String> list, onMyLocationClick onmylocationclick, GoogleMap.OnPolygonClickListener onPolygonClickListener, onSnapshotReady onsnapshotready) {
        onGetStartedClick.write((Object) str, "partnerId");
        onGetStartedClick.write((Object) str2, "partnerName");
        onGetStartedClick.write((Object) str3, "partnerTransactionId");
        onGetStartedClick.write((Object) str4, "partnerType");
        onGetStartedClick.write((Object) list, "partnerSubType");
        this.MediaBrowserCompat$ItemReceiver = onPoiClickListener;
        this.read = str;
        this.MediaMetadataCompat = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaDescriptionCompat = str4;
        this.MediaBrowserCompat$SearchResultReceiver = list;
        this.IconCompatParcelizer = onmylocationclick;
        this.write = onPolygonClickListener;
        this.MediaBrowserCompat$CustomActionResultReceiver = onsnapshotready;
    }
}
