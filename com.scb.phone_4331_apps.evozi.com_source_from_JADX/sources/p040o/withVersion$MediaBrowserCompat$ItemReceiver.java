package p040o;

import p040o.access$2300;

/* renamed from: o.withVersion$MediaBrowserCompat$ItemReceiver */
public final class withVersion$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getLanguage> {
    private final setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ withVersion write;

    public final /* synthetic */ void onNext(Object obj) {
        getUuidUtf8Bytes read = this.write.IconCompatParcelizer.read(this.MediaBrowserCompat$ItemReceiver, (getLanguage) obj);
        withVersion withversion = this.write;
        isValidVersion isvalidversion = new isValidVersion(read);
        if (withversion.RatingCompat != null) {
            isvalidversion.IconCompatParcelizer(withversion.RatingCompat);
        }
        boolean unused = this.write.read = false;
    }

    public withVersion$MediaBrowserCompat$ItemReceiver(withVersion withversion, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.write = withversion;
        this.MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes;
    }

    public final void onComplete() {
        withVersion.MediaBrowserCompat$ItemReceiver(this.write);
    }

    public final void onError(Throwable th) {
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        boolean unused = this.write.read = false;
    }
}
