package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.PlaceDetectionApi */
public final class PlaceDetectionApi {
    public final boolean IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final OffsetDateTime read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceDetectionApi)) {
            return false;
        }
        PlaceDetectionApi placeDetectionApi = (PlaceDetectionApi) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) placeDetectionApi.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) placeDetectionApi.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) placeDetectionApi.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) placeDetectionApi.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) placeDetectionApi.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) placeDetectionApi.read) && this.IconCompatParcelizer == placeDetectionApi.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) placeDetectionApi.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        OffsetDateTime offsetDateTime = this.read;
        int hashCode6 = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        String str6 = this.write;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (z ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Securities(cardTitle=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", iconUrl=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", unrealizedAmt=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", unrealizedPercent=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", marketValue=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", asOfDate=");
        sb.append(this.read);
        sb.append(", allSCBSAccountClosed=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", errorDescription=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public PlaceDetectionApi(String str, String str2, String str3, String str4, String str5, OffsetDateTime offsetDateTime, boolean z, String str6) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaMetadataCompat = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.read = offsetDateTime;
        this.IconCompatParcelizer = z;
        this.write = str6;
    }
}
