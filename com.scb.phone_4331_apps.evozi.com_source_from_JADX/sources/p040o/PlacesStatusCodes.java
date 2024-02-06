package p040o;

import java.util.Objects;

/* renamed from: o.PlacesStatusCodes */
public final class PlacesStatusCodes extends zzuk {
    public StreetViewPanoramaOptions MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public onInfoWindowLongClick f2773x50fd9e4a;
    public int MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public setZoomControlsEnabled MediaSessionCompat$QueueItem;
    public onInfoWindowLongClick MediaSessionCompat$ResultReceiverWrapper;
    public getGeoDataClient MediaSessionCompat$Token;
    public PlacesOptions ParcelableVolumeInfo;
    public String RatingCompat;
    public String read;
    public int write;

    public static PlacesStatusCodes MediaBrowserCompat$ItemReceiver() {
        return new PlacesStatusCodes();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TileProperties{dataId='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", billPaymentBiller=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", tileHistory=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", favouriteTarget=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", topUpBiller=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", functionId=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", transfer=");
        sb.append(this.f2773x50fd9e4a);
        sb.append(", payeeLogo='");
        sb.append((String) null);
        sb.append('\'');
        sb.append(", demoUrlEN='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append(", demoUrlTH='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", customUserAgentFlag=");
        sb.append(this.write);
        sb.append(", applicationURL='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", disclaimerFlag=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", disclaimerTitle='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append(", demoDisplayedLogo='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append("} ");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlacesStatusCodes placesStatusCodes = (PlacesStatusCodes) obj;
        if (this.write != placesStatusCodes.write || this.MediaDescriptionCompat != placesStatusCodes.MediaDescriptionCompat || !Objects.equals(this.MediaBrowserCompat$ItemReceiver, placesStatusCodes.MediaBrowserCompat$ItemReceiver) || !Objects.equals(this.MediaBrowserCompat$CustomActionResultReceiver, placesStatusCodes.MediaBrowserCompat$CustomActionResultReceiver) || !Objects.equals(this.ParcelableVolumeInfo, placesStatusCodes.ParcelableVolumeInfo) || !Objects.equals(this.MediaSessionCompat$ResultReceiverWrapper, placesStatusCodes.MediaSessionCompat$ResultReceiverWrapper) || !Objects.equals(this.MediaSessionCompat$QueueItem, placesStatusCodes.MediaSessionCompat$QueueItem) || this.MediaSessionCompat$Token != placesStatusCodes.MediaSessionCompat$Token || !Objects.equals(this.f2773x50fd9e4a, placesStatusCodes.f2773x50fd9e4a) || !Objects.equals((Object) null, (Object) null) || !Objects.equals(this.MediaBrowserCompat$SearchResultReceiver, placesStatusCodes.MediaBrowserCompat$SearchResultReceiver) || !Objects.equals(this.MediaMetadataCompat, placesStatusCodes.MediaMetadataCompat) || !Objects.equals(this.read, placesStatusCodes.read) || !Objects.equals(this.MediaBrowserCompat$MediaItem, placesStatusCodes.MediaBrowserCompat$MediaItem) || !Objects.equals(this.RatingCompat, placesStatusCodes.RatingCompat)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.ParcelableVolumeInfo, this.MediaSessionCompat$ResultReceiverWrapper, this.MediaSessionCompat$QueueItem, this.MediaSessionCompat$Token, this.f2773x50fd9e4a, null, this.MediaBrowserCompat$SearchResultReceiver, this.MediaMetadataCompat, Integer.valueOf(this.write), this.read, Integer.valueOf(this.MediaDescriptionCompat), this.MediaBrowserCompat$MediaItem, this.RatingCompat});
    }
}
