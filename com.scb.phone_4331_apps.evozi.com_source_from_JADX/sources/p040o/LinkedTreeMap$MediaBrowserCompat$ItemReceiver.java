package p040o;

import p040o.access$2300;

/* renamed from: o.LinkedTreeMap$MediaBrowserCompat$ItemReceiver */
public final class LinkedTreeMap$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getLanguage> {
    private /* synthetic */ LinkedTreeMap MediaBrowserCompat$ItemReceiver;
    private final setUuidFromUtf8Bytes read;

    public final /* synthetic */ void onNext(Object obj) {
        getUuidUtf8Bytes read2 = this.MediaBrowserCompat$ItemReceiver.read.read(this.read, (getLanguage) obj);
        LinkedTreeMap linkedTreeMap = this.MediaBrowserCompat$ItemReceiver;
        floatValue floatvalue = new floatValue(read2);
        if (linkedTreeMap.RatingCompat != null) {
            floatvalue.IconCompatParcelizer(linkedTreeMap.RatingCompat);
        }
        boolean unused = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = false;
    }

    public LinkedTreeMap$MediaBrowserCompat$ItemReceiver(LinkedTreeMap linkedTreeMap, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$ItemReceiver = linkedTreeMap;
        this.read = setuuidfromutf8bytes;
    }

    public final void onComplete() {
        LinkedTreeMap.write(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        boolean unused = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = false;
    }
}
