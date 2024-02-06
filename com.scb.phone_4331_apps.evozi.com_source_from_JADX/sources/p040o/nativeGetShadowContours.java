package p040o;

import p040o.Iterables;
import p040o.StreetViewPanoramaOrientation;
import p040o.Synchronized;

/* renamed from: o.nativeGetShadowContours */
public class nativeGetShadowContours extends writeUInt64NoTag<getAdditionalRightScanLinesWidth> {
    final checkModCount IconCompatParcelizer;
    public final countIn MediaBrowserCompat$ItemReceiver;
    public final getRootCause MediaBrowserCompat$MediaItem;
    public final Iterables.C352212 MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f2898x50fd9e4a = false;
    public final StreetViewPanoramaOrientation.Builder MediaDescriptionCompat;
    public final synchronizedSupplier MediaMetadataCompat;
    public final setBackingMap ParcelableVolumeInfo;
    public final nullToEmpty read;
    final Synchronized.SynchronizedAsMapEntries.C38351.C38361 write;

    @HmlPinActivity
    public nativeGetShadowContours(RegularImmutableBiMap regularImmutableBiMap, checkModCount checkmodcount, countIn countin, Synchronized.SynchronizedAsMapEntries.C38351.C38361 r4, StreetViewPanoramaOrientation.Builder builder, setBackingMap setbackingmap, Iterables.C352212 r7, getRootCause getrootcause, synchronizedSupplier synchronizedsupplier, nullToEmpty nulltoempty) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = checkmodcount;
        this.MediaBrowserCompat$ItemReceiver = countin;
        this.write = r4;
        this.MediaDescriptionCompat = builder;
        this.ParcelableVolumeInfo = setbackingmap;
        this.MediaBrowserCompat$SearchResultReceiver = r7;
        this.MediaBrowserCompat$MediaItem = getrootcause;
        this.MediaMetadataCompat = synchronizedsupplier;
        this.read = nulltoempty;
    }

    public final void read() {
        boolean z;
        if (this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.write() != null && this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.write().MediaBrowserCompat$CustomActionResultReceiver != null) {
            isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.write().MediaBrowserCompat$CustomActionResultReceiver;
            boolean MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver);
            boolean z2 = true;
            if (isrestrictedtoplacesopennow != null) {
                if (!(isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver == null || isrestrictedtoplacesopennow.MediaBrowserCompat$SearchResultReceiver == null || isrestrictedtoplacesopennow.read == null)) {
                    z = !((isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver != null && isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver.isEmpty()) || (isrestrictedtoplacesopennow.MediaBrowserCompat$SearchResultReceiver != null && isrestrictedtoplacesopennow.MediaBrowserCompat$SearchResultReceiver.isEmpty()) || (isrestrictedtoplacesopennow.read != null && isrestrictedtoplacesopennow.read.isEmpty()));
                    if (!z && this.f2898x50fd9e4a && !MediaBrowserCompat$CustomActionResultReceiver) {
                        DocumentCropper documentCropper = new DocumentCropper(this, isrestrictedtoplacesopennow);
                        if (this.RatingCompat == null) {
                            z2 = false;
                        }
                        if (z2) {
                            documentCropper.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    }
                }
            }
            z = false;
            if (!z && this.f2898x50fd9e4a) {
            }
        }
    }
}
