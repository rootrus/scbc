package p040o;

import p040o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory;

/* renamed from: o.loadFromString */
public class loadFromString extends writeUInt64NoTag<IdCaptureModule_GetIIdDeserializerOnDeviceFactory.read> {
    public boolean IconCompatParcelizer = false;
    public final setReferenceCounted MediaBrowserCompat$ItemReceiver;
    public boolean read = false;
    public nonNull write;

    @HmlPinActivity
    public loadFromString(RegularImmutableBiMap regularImmutableBiMap, setReferenceCounted setreferencecounted) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = setreferencecounted;
    }

    public void onDestroy() {
        super.onDestroy();
        setReferenceCounted setreferencecounted = this.MediaBrowserCompat$ItemReceiver;
        if (!setreferencecounted.MediaBrowserCompat$MediaItem.isDisposed()) {
            setreferencecounted.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(nonNull nonnull, IdCaptureModule_GetIIdDeserializerOnDeviceFactory.read read2) {
        if (nonnull.MediaBrowserCompat$ItemReceiver.contains("CARD_LIMIT_WITHDRAWAL")) {
            read2.IconCompatParcelizer(nonnull);
        }
        if (nonnull.MediaBrowserCompat$ItemReceiver.contains("CARD_LIMIT_PURCHASE")) {
            read2.write(nonnull);
        }
    }
}
