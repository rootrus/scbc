package p040o;

import android.content.res.Resources;
import java.util.Arrays;
import p040o.Synchronized;

/* renamed from: o.getStringValues */
public class getStringValues extends writeUInt64NoTag<C6909xbc088368> {
    final Resources IconCompatParcelizer;
    public final setReferenceCounted MediaBrowserCompat$ItemReceiver;
    private final StreetViewSource MediaMetadataCompat;
    final Synchronized.SynchronizedSet read;
    public Lazy write;

    @HmlPinActivity
    public getStringValues(Resources resources, RegularImmutableBiMap regularImmutableBiMap, setReferenceCounted setreferencecounted, StreetViewSource streetViewSource, Synchronized.SynchronizedSet synchronizedSet) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = resources;
        this.MediaBrowserCompat$ItemReceiver = setreferencecounted;
        this.MediaMetadataCompat = streetViewSource;
        this.read = synchronizedSet;
    }

    public static boolean IconCompatParcelizer(String[] strArr) {
        return strArr != null && Arrays.asList(strArr).contains("CARD_UNLOCK");
    }

    public final void IconCompatParcelizer(String str) {
        nativeLoadFromFile nativeloadfromfile = nativeLoadFromFile.read;
        if (this.RatingCompat != null) {
            nativeloadfromfile.IconCompatParcelizer(this.RatingCompat);
        }
        isUnset isunset = new isUnset(str);
        setReferenceCounted setreferencecounted = this.MediaBrowserCompat$ItemReceiver;
        setreferencecounted.read(setreferencecounted.IconCompatParcelizer.IconCompatParcelizer(isunset), new ReaderException(this), new setTorch(this));
    }

    static /* synthetic */ void read(C6909xbc088368 idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver) {
        idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.read(true);
        idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.write(true);
        idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(true);
    }

    static /* synthetic */ void IconCompatParcelizer(C6909xbc088368 idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver) {
        idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.read(false);
        idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.write(false);
        idCaptureModule_GetIIdDeserializerOnDeviceFactory$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(false);
    }

    public void onDestroy() {
        super.onDestroy();
        setReferenceCounted setreferencecounted = this.MediaBrowserCompat$ItemReceiver;
        if (!setreferencecounted.MediaBrowserCompat$MediaItem.isDisposed()) {
            setreferencecounted.MediaBrowserCompat$MediaItem.dispose();
        }
        StreetViewSource streetViewSource = this.MediaMetadataCompat;
        if (!streetViewSource.MediaBrowserCompat$MediaItem.isDisposed()) {
            streetViewSource.MediaBrowserCompat$MediaItem.dispose();
        }
    }
}
