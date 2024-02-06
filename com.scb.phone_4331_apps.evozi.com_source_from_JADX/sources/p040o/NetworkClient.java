package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import p040o.cancelExtraction;
import p040o.writeUInt64NoTag;

/* renamed from: o.NetworkClient */
public final /* synthetic */ class NetworkClient implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ NetworkClient(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getFoldedOrTornDocumentCorners) obj).write(((RetrofitException) this.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer.write.read);
    }

    /* renamed from: o.NetworkClient$Error */
    public final /* synthetic */ class Error implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ cancelExtraction.C41712 MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ Error(cancelExtraction.C41712 r1) {
            this.MediaBrowserCompat$ItemReceiver = r1;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getFoldedOrTornDocumentCorners) obj).MediaBrowserCompat$ItemReceiver(cancelExtraction.this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(false));
        }
    }
}
