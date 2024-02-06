package p040o;

import p040o.Frame;

/* renamed from: o.IsgPassportDetector */
final class IsgPassportDetector implements Runnable {
    private final /* synthetic */ FundActionsSuccessActivity IconCompatParcelizer;

    IsgPassportDetector(FundActionsSuccessActivity fundActionsSuccessActivity) {
        this.IconCompatParcelizer = fundActionsSuccessActivity;
    }

    public final /* synthetic */ void run() {
        onGetStartedClick.IconCompatParcelizer(this.IconCompatParcelizer.invoke(), "invoke(...)");
    }

    /* renamed from: o.IsgPassportDetector$a */
    public class C3516a extends IsgDetectionModule_GetDocumentDetectorFactory<Check> {
        private final detectorIsOperational MediaBrowserCompat$ItemReceiver;
        public Frame.Metadata read;

        @HmlPinActivity
        public C3516a(RegularImmutableBiMap regularImmutableBiMap, detectorIsOperational detectorisoperational, Frame.Metadata metadata) {
            super(regularImmutableBiMap);
            this.MediaBrowserCompat$ItemReceiver = detectorisoperational;
            this.read = metadata;
        }

        public void onDestroy() {
            super.onDestroy();
            detectorIsOperational detectorisoperational = this.MediaBrowserCompat$ItemReceiver;
            if (!detectorisoperational.MediaBrowserCompat$MediaItem.isDisposed()) {
                detectorisoperational.MediaBrowserCompat$MediaItem.dispose();
            }
        }
    }
}
