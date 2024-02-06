package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.writeUInt64NoTag;

/* renamed from: o.BarCodeReader */
public final /* synthetic */ class BarCodeReader implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ BarCodeReader MediaBrowserCompat$ItemReceiver = new BarCodeReader();

    /* renamed from: o.BarCodeReader$Direction */
    public final /* synthetic */ class Direction implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ submitTask MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ Direction(submitTask submittask) {
            this.MediaBrowserCompat$ItemReceiver = submittask;
        }

        public final void IconCompatParcelizer(Object obj) {
            ImageClassificationResult.write(this.MediaBrowserCompat$ItemReceiver, (CheckExtractActivity_MembersInjector.setTitle) obj);
        }
    }

    /* renamed from: o.BarCodeReader$Symbology */
    public final /* synthetic */ class Symbology implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ Symbology read = new Symbology();

        private /* synthetic */ Symbology() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckExtractActivity_MembersInjector.ParcelableVolumeInfo) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.BarCodeReader$BarcodeReadCompleteEvent */
    public final /* synthetic */ class BarcodeReadCompleteEvent implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ CrashlyticsBackgroundWorker.C32131 MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ BarcodeReadCompleteEvent(CrashlyticsBackgroundWorker.C32131 r1) {
            this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckExtractActivity_MembersInjector.setTitle) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.BarCodeReader$BarcodeReadCompleteListener */
    public final /* synthetic */ class BarcodeReadCompleteListener implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ CrashlyticsBackgroundWorker.C32131 MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ BarcodeReadCompleteListener(CrashlyticsBackgroundWorker.C32131 r1) {
            this.MediaBrowserCompat$ItemReceiver = r1;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckExtractActivity_MembersInjector.setTitle) obj).read(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    private /* synthetic */ BarCodeReader() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.setBackgroundResource) obj).IconCompatParcelizer((Throwable) null);
    }
}
