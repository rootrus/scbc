package p040o;

/* renamed from: o.setBoolValue */
public class setBoolValue extends writeUInt64NoTag<getLar$MediaBrowserCompat$ItemReceiver> {
    public final setReferenceCounted IconCompatParcelizer;

    @HmlPinActivity
    public setBoolValue(RegularImmutableBiMap regularImmutableBiMap, setReferenceCounted setreferencecounted) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = setreferencecounted;
    }

    public void onDestroy() {
        super.onDestroy();
        setReferenceCounted setreferencecounted = this.IconCompatParcelizer;
        if (!setreferencecounted.MediaBrowserCompat$MediaItem.isDisposed()) {
            setreferencecounted.MediaBrowserCompat$MediaItem.dispose();
        }
    }
}
