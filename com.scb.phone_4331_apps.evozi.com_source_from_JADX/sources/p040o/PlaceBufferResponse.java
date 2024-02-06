package p040o;

import p040o.Place;

/* renamed from: o.PlaceBufferResponse */
public final class PlaceBufferResponse {
    public final PlaceDetectionApi IconCompatParcelizer;
    public final Place.ExtendedDetails MediaBrowserCompat$CustomActionResultReceiver;
    public zzvm read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceBufferResponse)) {
            return false;
        }
        PlaceBufferResponse placeBufferResponse = (PlaceBufferResponse) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) placeBufferResponse.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) placeBufferResponse.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) placeBufferResponse.read);
    }

    public final int hashCode() {
        PlaceDetectionApi placeDetectionApi = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = placeDetectionApi != null ? placeDetectionApi.hashCode() : 0;
        Place.ExtendedDetails extendedDetails = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = extendedDetails != null ? extendedDetails.hashCode() : 0;
        zzvm zzvm = this.read;
        if (zzvm != null) {
            i = zzvm.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentSummary(securities=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mutualFunds=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", ad=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public PlaceBufferResponse(PlaceDetectionApi placeDetectionApi, Place.ExtendedDetails extendedDetails, zzvm zzvm) {
        this.IconCompatParcelizer = placeDetectionApi;
        this.MediaBrowserCompat$CustomActionResultReceiver = extendedDetails;
        this.read = zzvm;
    }
}
