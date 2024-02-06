package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBackendId$MediaBrowserCompat$CustomActionResultReceiver */
public final class getBackendId$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
    final /* synthetic */ getGeoDataClient MediaBrowserCompat$ItemReceiver;
    final /* synthetic */ getBackendId read;

    /* renamed from: o.getBackendId$MediaBrowserCompat$CustomActionResultReceiver$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getFrontBarcodes> {
        private /* synthetic */ getBackendId$MediaBrowserCompat$CustomActionResultReceiver write;

        read(getBackendId$MediaBrowserCompat$CustomActionResultReceiver getbackendid_mediabrowsercompat_customactionresultreceiver) {
            this.write = getbackendid_mediabrowsercompat_customactionresultreceiver;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            this.write.read.MediaBrowserCompat$CustomActionResultReceiver(this.write.MediaBrowserCompat$ItemReceiver, (getFrontBarcodes) obj);
        }
    }

    getBackendId$MediaBrowserCompat$CustomActionResultReceiver(getBackendId getbackendid, getGeoDataClient getgeodataclient) {
        this.read = getbackendid;
        this.MediaBrowserCompat$ItemReceiver = getgeodataclient;
    }

    public final void onComplete() {
        super.onComplete();
        getBackendId.write(this.read);
        getBackendId getbackendid = this.read;
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(this);
        if (getbackendid.RatingCompat != null) {
            read2.IconCompatParcelizer(getbackendid.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        getBackendId getbackendid = this.read;
        getbackendid.MediaBrowserCompat$ItemReceiver(getbackendid.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
