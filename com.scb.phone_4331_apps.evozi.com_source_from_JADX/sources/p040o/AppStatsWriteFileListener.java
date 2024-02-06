package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatsWriteFileListener */
public final /* synthetic */ class AppStatsWriteFileListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.AppStatsWriteFileListener$WriteFileStatus */
    public final /* synthetic */ class WriteFileStatus implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ WriteFileStatus MediaBrowserCompat$ItemReceiver = new WriteFileStatus();

        private /* synthetic */ WriteFileStatus() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((classificationConfidence$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public /* synthetic */ AppStatsWriteFileListener(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCheckParameters) obj).MediaBrowserCompat$ItemReceiver();
    }
}
