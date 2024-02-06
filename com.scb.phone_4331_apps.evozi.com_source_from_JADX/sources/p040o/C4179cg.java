package p040o;

import p040o.Iterables;
import p040o.KtaJsonCheck;

/* renamed from: o.cg */
public class C4179cg extends writeUInt64NoTag<KtaJsonCheck.ParcelableVolumeInfo> {
    public final Iterables.C352212 IconCompatParcelizer;
    public final nullToEmpty MediaBrowserCompat$ItemReceiver;
    public final getRootCause MediaBrowserCompat$MediaItem;
    public final logEventNoInterceptor MediaBrowserCompat$SearchResultReceiver;
    private final onUnbind MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public final getConditionalUserPropertiesAs read;
    public final synchronizedSupplier write;

    @HmlPinActivity
    public C4179cg(RegularImmutableBiMap regularImmutableBiMap, onUnbind onunbind, getRootCause getrootcause, Iterables.C352212 r4, nullToEmpty nulltoempty, synchronizedSupplier synchronizedsupplier, getConditionalUserPropertiesAs getconditionaluserpropertiesas, logEventNoInterceptor logeventnointerceptor) {
        super(regularImmutableBiMap);
        this.MediaDescriptionCompat = onunbind;
        this.MediaBrowserCompat$MediaItem = getrootcause;
        this.IconCompatParcelizer = r4;
        this.MediaBrowserCompat$ItemReceiver = nulltoempty;
        this.write = synchronizedsupplier;
        this.read = getconditionaluserpropertiesas;
        this.MediaBrowserCompat$SearchResultReceiver = logeventnointerceptor;
    }

    public void onDestroy() {
        onUnbind onunbind = this.MediaDescriptionCompat;
        if (!onunbind.MediaBrowserCompat$MediaItem.isDisposed()) {
            onunbind.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
