package p040o;

/* renamed from: o.getRamSize */
public class getRamSize extends writeUInt64NoTag<getLar$MediaBrowserCompat$ItemReceiver> {
    public final StreetViewSource MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public getRamSize(StreetViewSource streetViewSource, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = streetViewSource;
    }

    public void onDestroy() {
        super.onDestroy();
        StreetViewSource streetViewSource = this.MediaBrowserCompat$ItemReceiver;
        if (!streetViewSource.MediaBrowserCompat$MediaItem.isDisposed()) {
            streetViewSource.MediaBrowserCompat$MediaItem.dispose();
        }
    }
}
