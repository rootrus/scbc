package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.access$2300;

/* renamed from: o.KofaxWebServiceObjectBase$MediaBrowserCompat$ItemReceiver */
public class KofaxWebServiceObjectBase$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ KofaxWebServiceObjectBase read;

    /* synthetic */ KofaxWebServiceObjectBase$MediaBrowserCompat$ItemReceiver(KofaxWebServiceObjectBase kofaxWebServiceObjectBase, String str, byte b) {
        this(kofaxWebServiceObjectBase, str);
    }

    private KofaxWebServiceObjectBase$MediaBrowserCompat$ItemReceiver(KofaxWebServiceObjectBase kofaxWebServiceObjectBase, String str) {
        this.read = kofaxWebServiceObjectBase;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void onComplete() {
        KofaxWebServiceObjectBase.read(this.read);
        boolean z = true;
        if (DiskLruCache.VERSION_1.equals(this.MediaBrowserCompat$CustomActionResultReceiver)) {
            KofaxWebServiceObjectBase kofaxWebServiceObjectBase = this.read;
            getRegionLeft getregionleft = getRegionLeft.MediaBrowserCompat$CustomActionResultReceiver;
            if (kofaxWebServiceObjectBase.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getregionleft.IconCompatParcelizer(kofaxWebServiceObjectBase.RatingCompat);
                return;
            }
            return;
        }
        KofaxWebServiceObjectBase kofaxWebServiceObjectBase2 = this.read;
        setDisplayName setdisplayname = setDisplayName.write;
        if (kofaxWebServiceObjectBase2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setdisplayname.IconCompatParcelizer(kofaxWebServiceObjectBase2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
