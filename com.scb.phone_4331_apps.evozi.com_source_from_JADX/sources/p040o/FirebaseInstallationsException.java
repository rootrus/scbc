package p040o;

import p040o.withUnregisteredFid;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseInstallationsException */
public final /* synthetic */ class FirebaseInstallationsException implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ SimpleTimeLimiter MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ FirebaseInstallationsException(SimpleTimeLimiter simpleTimeLimiter) {
        this.MediaBrowserCompat$CustomActionResultReceiver = simpleTimeLimiter;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1422x86f1bdff) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat);
    }

    /* renamed from: o.FirebaseInstallationsException$Status */
    public final /* synthetic */ class Status implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ withUnregisteredFid.IconCompatParcelizer write;

        public /* synthetic */ Status(withUnregisteredFid.IconCompatParcelizer iconCompatParcelizer) {
            this.write = iconCompatParcelizer;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((C1422x86f1bdff) obj).MediaBrowserCompat$ItemReceiver(withUnregisteredFid.this.IconCompatParcelizer);
        }
    }
}
