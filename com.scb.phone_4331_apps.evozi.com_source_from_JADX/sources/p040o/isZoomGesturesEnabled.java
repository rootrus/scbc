package p040o;

import java.util.List;

/* renamed from: o.isZoomGesturesEnabled */
public final class isZoomGesturesEnabled {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final orientationToPoint MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final pointToOrientation RatingCompat;
    public final List<getVisibleRegion> read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isZoomGesturesEnabled)) {
            return false;
        }
        isZoomGesturesEnabled iszoomgesturesenabled = (isZoomGesturesEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iszoomgesturesenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) iszoomgesturesenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iszoomgesturesenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) iszoomgesturesenabled.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) iszoomgesturesenabled.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iszoomgesturesenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) iszoomgesturesenabled.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) iszoomgesturesenabled.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iszoomgesturesenabled.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        pointToOrientation pointtoorientation = this.RatingCompat;
        int hashCode7 = pointtoorientation != null ? pointtoorientation.hashCode() : 0;
        orientationToPoint orientationtopoint = this.MediaDescriptionCompat;
        int hashCode8 = orientationtopoint != null ? orientationtopoint.hashCode() : 0;
        List<getVisibleRegion> list = this.read;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product(symbol=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", marketValue=");
        sb.append(this.write);
        sb.append(", currency=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", unrealizedAmt=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", unrealizedPercent=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", side=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", symbolPrice=");
        sb.append(this.RatingCompat);
        sb.append(", symbolFullName=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", items=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public isZoomGesturesEnabled(String str, String str2, String str3, String str4, String str5, String str6, pointToOrientation pointtoorientation, orientationToPoint orientationtopoint, List<getVisibleRegion> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
        this.MediaMetadataCompat = str5;
        this.MediaBrowserCompat$ItemReceiver = str6;
        this.RatingCompat = pointtoorientation;
        this.MediaDescriptionCompat = orientationtopoint;
        this.read = list;
    }
}
