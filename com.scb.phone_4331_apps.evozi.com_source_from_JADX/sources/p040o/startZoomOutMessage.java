package p040o;

import p040o.Floats;
import p040o.showIndicators;

/* renamed from: o.startZoomOutMessage */
public class startZoomOutMessage extends showIndicators {
    @HmlPinActivity
    public startZoomOutMessage(RegularImmutableBiMap regularImmutableBiMap, SquareCap squareCap, Floats.LexicographicalComparator lexicographicalComparator) {
        super(regularImmutableBiMap, squareCap, lexicographicalComparator);
    }

    public final void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            boolean z = true;
            this.MediaBrowserCompat$ItemReceiver = true;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            SquareCap squareCap = this.write;
            unsetEntry MediaBrowserCompat$CustomActionResultReceiver = unsetEntry.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver.read = setuuidfromutf8bytes.MediaBrowserCompat$MediaItem();
            squareCap.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver);
            this.write.IconCompatParcelizer(new showIndicators.IconCompatParcelizer(setuuidfromutf8bytes));
        }
    }
}
