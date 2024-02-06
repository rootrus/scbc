package p040o;

import java.util.List;
import p040o.FusedLocationProviderClient;

/* renamed from: o.setExpirationDuration */
public final class setExpirationDuration {
    public final GeofencingEvent IconCompatParcelizer;
    public final setCircularRegion MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final List<String> MediaMetadataCompat;
    public final String RatingCompat;
    public final String read;
    public final FusedLocationProviderClient.zza write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setExpirationDuration)) {
            return false;
        }
        setExpirationDuration setexpirationduration = (setExpirationDuration) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setexpirationduration.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setexpirationduration.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setexpirationduration.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setexpirationduration.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setexpirationduration.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setexpirationduration.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setexpirationduration.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setexpirationduration.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setexpirationduration.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setexpirationduration.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        List<String> list = this.MediaMetadataCompat;
        int hashCode7 = list != null ? list.hashCode() : 0;
        setCircularRegion setcircularregion = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode8 = setcircularregion != null ? setcircularregion.hashCode() : 0;
        FusedLocationProviderClient.zza zza = this.write;
        int hashCode9 = zza != null ? zza.hashCode() : 0;
        GeofencingEvent geofencingEvent = this.IconCompatParcelizer;
        if (geofencingEvent != null) {
            i = geofencingEvent.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InitiatePayment(insAcctId=");
        sb.append(this.read);
        sb.append(", dataSource=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", partnerId=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", partnerName=");
        sb.append(this.RatingCompat);
        sb.append(", partnerTransactionId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", partnerType=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", partnerSubType=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", billPayment=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", creditCardFullAmount=");
        sb.append(this.write);
        sb.append(", merchantMetaData=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setExpirationDuration(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, setCircularRegion setcircularregion, FusedLocationProviderClient.zza zza, GeofencingEvent geofencingEvent) {
        onGetStartedClick.write((Object) str, "insAcctId");
        onGetStartedClick.write((Object) str2, "dataSource");
        onGetStartedClick.write((Object) str3, "partnerId");
        onGetStartedClick.write((Object) str4, "partnerName");
        onGetStartedClick.write((Object) str5, "partnerTransactionId");
        onGetStartedClick.write((Object) str6, "partnerType");
        onGetStartedClick.write((Object) list, "partnerSubType");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaDescriptionCompat = str3;
        this.RatingCompat = str4;
        this.MediaBrowserCompat$MediaItem = str5;
        this.MediaBrowserCompat$SearchResultReceiver = str6;
        this.MediaMetadataCompat = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = setcircularregion;
        this.write = zza;
        this.IconCompatParcelizer = geofencingEvent;
    }
}
