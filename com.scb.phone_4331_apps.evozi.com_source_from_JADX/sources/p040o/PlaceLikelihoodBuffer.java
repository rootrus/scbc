package p040o;

import java.util.List;
import java.util.Objects;

/* renamed from: o.PlaceLikelihoodBuffer */
public final class PlaceLikelihoodBuffer extends PlacePhotoResponse {
    public List<PlaceDetectionClient> MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public static PlaceLikelihoodBuffer read() {
        return new PlaceLikelihoodBuffer();
    }

    public final PlaceLikelihoodBuffer write(long j) {
        super.MediaBrowserCompat$CustomActionResultReceiver(j);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaBrowserCompat$ItemReceiver(long j) {
        super.IconCompatParcelizer(j);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaBrowserCompat$ItemReceiver(String str) {
        super.MediaMetadataCompat(str);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaDescriptionCompat(int i) {
        super.MediaBrowserCompat$MediaItem(i);
        return this;
    }

    public final PlaceLikelihoodBuffer write(setLocale setlocale) {
        super.MediaBrowserCompat$CustomActionResultReceiver(setlocale);
        return this;
    }

    public final PlaceLikelihoodBuffer write(getGeoDataClient getgeodataclient) {
        super.IconCompatParcelizer(getgeodataclient);
        return this;
    }

    public final PlaceLikelihoodBuffer PlaybackStateCompat(String str) {
        super.Keep(str);
        return this;
    }

    public final PlaceLikelihoodBuffer RatingCompat(boolean z) {
        super.MediaBrowserCompat$SearchResultReceiver(z);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaMetadataCompat(boolean z) {
        super.MediaBrowserCompat$MediaItem(z);
        return this;
    }

    public final PlaceLikelihoodBuffer RatingCompat(String str) {
        super.MediaBrowserCompat$MediaItem(str);
        return this;
    }

    public final PlaceLikelihoodBuffer write(String str) {
        super.read(str);
        return this;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final PlaceLikelihoodBuffer mo26268x50fd9e4a(int i) {
        super.MediaSessionCompat$QueueItem(i);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaMetadataCompat(int i) {
        super.RatingCompat(0);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaBrowserCompat$SearchResultReceiver(String str) {
        super.MediaDescriptionCompat(str);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaBrowserCompat$ItemReceiver(PlacesStatusCodes placesStatusCodes) {
        super.read(placesStatusCodes);
        return this;
    }

    public final PlaceLikelihoodBuffer IconCompatParcelizer(int i) {
        super.read(i);
        return this;
    }

    public final PlaceLikelihoodBuffer AlertController$RecycleListView(String str) {
        super.setHasDecor(str);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        super.MediaBrowserCompat$ItemReceiver(z);
        return this;
    }

    public final PlaceLikelihoodBuffer IconCompatParcelizer(List<PlaceLikelihoodBuffer> list) {
        super.read(list);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaBrowserCompat$ItemReceiver(List<zzvm> list) {
        super.MediaBrowserCompat$CustomActionResultReceiver(list);
        return this;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return super.MediaBrowserCompat$ItemReceiver();
    }

    public final PlaceLikelihoodBuffer write(int i) {
        super.MediaBrowserCompat$SearchResultReceiver(i);
        return this;
    }

    public final PlaceLikelihoodBuffer IconCompatParcelizer(boolean z) {
        super.read(z);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaBrowserCompat$ItemReceiver(int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver(i);
        return this;
    }

    public final PlaceLikelihoodBuffer IconCompatParcelizer(String str) {
        super.MediaBrowserCompat$CustomActionResultReceiver(str);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaSessionCompat$ResultReceiverWrapper(int i) {
        super.ParcelableVolumeInfo(i);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaSessionCompat$Token(int i) {
        super.Keep(i);
        return this;
    }

    public final PlaceLikelihoodBuffer ParcelableVolumeInfo(String str) {
        super.MediaSessionCompat$ResultReceiverWrapper(str);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaSessionCompat$QueueItem(String str) {
        super.PlaybackStateCompat$CustomAction(str);
        return this;
    }

    public final PlaceLikelihoodBuffer MediaSessionCompat$Token(String str) {
        super.mo26269x50fd9e4a(str);
        return this;
    }

    public final PlaceLikelihoodBuffer write(boolean z) {
        super.MediaDescriptionCompat(z);
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LandingPageTile{applicationId='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", firebaseParameters=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", adsId='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", adsName='");
        sb.append(this.write);
        sb.append('\'');
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        PlaceLikelihoodBuffer placeLikelihoodBuffer = (PlaceLikelihoodBuffer) obj;
        if (!Objects.equals(this.read, placeLikelihoodBuffer.read) || !Objects.equals(this.MediaBrowserCompat$CustomActionResultReceiver, placeLikelihoodBuffer.MediaBrowserCompat$CustomActionResultReceiver) || !Objects.equals(this.MediaBrowserCompat$ItemReceiver, placeLikelihoodBuffer.MediaBrowserCompat$ItemReceiver) || !Objects.equals(this.write, placeLikelihoodBuffer.write)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.write});
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaBrowserCompat$CustomActionResultReceiver(List list) {
        super.MediaBrowserCompat$CustomActionResultReceiver((List<zzvm>) list);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaBrowserCompat$CustomActionResultReceiver(String str) {
        super.MediaBrowserCompat$CustomActionResultReceiver(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaBrowserCompat$ItemReceiver(boolean z) {
        super.MediaBrowserCompat$ItemReceiver(z);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse read(String str) {
        super.read(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaBrowserCompat$CustomActionResultReceiver(int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaMetadataCompat(String str) {
        super.MediaMetadataCompat(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse read(int i) {
        super.read(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaBrowserCompat$MediaItem(String str) {
        super.MediaBrowserCompat$MediaItem(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaBrowserCompat$SearchResultReceiver(int i) {
        super.MediaBrowserCompat$SearchResultReceiver(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse read(boolean z) {
        super.read(z);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse IconCompatParcelizer(long j) {
        super.IconCompatParcelizer(j);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse RatingCompat(int i) {
        super.RatingCompat(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaDescriptionCompat(boolean z) {
        super.MediaDescriptionCompat(z);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaBrowserCompat$MediaItem(int i) {
        super.MediaBrowserCompat$MediaItem(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaSessionCompat$QueueItem(int i) {
        super.MediaSessionCompat$QueueItem(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaDescriptionCompat(String str) {
        super.MediaDescriptionCompat(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaBrowserCompat$SearchResultReceiver(boolean z) {
        super.MediaBrowserCompat$SearchResultReceiver(z);
        return this;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* bridge */ /* synthetic */ PlacePhotoResponse mo26269x50fd9e4a(String str) {
        super.mo26269x50fd9e4a(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse ParcelableVolumeInfo(int i) {
        super.ParcelableVolumeInfo(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaSessionCompat$ResultReceiverWrapper(String str) {
        super.MediaSessionCompat$ResultReceiverWrapper(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaBrowserCompat$MediaItem(boolean z) {
        super.MediaBrowserCompat$MediaItem(z);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse PlaybackStateCompat$CustomAction(String str) {
        super.PlaybackStateCompat$CustomAction(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaBrowserCompat$CustomActionResultReceiver(long j) {
        super.MediaBrowserCompat$CustomActionResultReceiver(j);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse Keep(String str) {
        super.Keep(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse read(PlacesStatusCodes placesStatusCodes) {
        super.read(placesStatusCodes);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse Keep(int i) {
        super.Keep(i);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse IconCompatParcelizer(getGeoDataClient getgeodataclient) {
        super.IconCompatParcelizer(getgeodataclient);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse MediaBrowserCompat$CustomActionResultReceiver(setLocale setlocale) {
        super.MediaBrowserCompat$CustomActionResultReceiver(setlocale);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse read(List list) {
        super.read((List<PlaceLikelihoodBuffer>) list);
        return this;
    }

    public final /* bridge */ /* synthetic */ PlacePhotoResponse setHasDecor(String str) {
        super.setHasDecor(str);
        return this;
    }
}
