package p040o;

import p040o.FirebaseVisionCloudDetectorOptions;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.TokenResult */
public final /* synthetic */ class TokenResult implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ FirebaseVisionCloudDetectorOptions.Builder.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ TokenResult(FirebaseVisionCloudDetectorOptions.Builder.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        FirebaseVisionCloudDetectorOptions.Builder.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        ((C7509tS) obj).write(FirebaseVisionCloudDetectorOptions.Builder.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS));
    }

    /* renamed from: o.TokenResult$Builder */
    public final /* synthetic */ class Builder implements FundFactSheetActivity {
        private final /* synthetic */ FirebaseVisionImageMetadata write;

        public /* synthetic */ Builder(FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
            this.write = firebaseVisionImageMetadata;
        }

        public final Object invoke(Object obj) {
            FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.write;
            isEnabled isenabled = new isEnabled(firebaseVisionImageMetadata, (Throwable) obj);
            if (firebaseVisionImageMetadata.RatingCompat != null) {
                isenabled.IconCompatParcelizer(firebaseVisionImageMetadata.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.TokenResult$ResponseCode */
    public final /* synthetic */ class ResponseCode implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ constrainedSortedSet MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ C9742xdf6f648 write;

        public /* synthetic */ ResponseCode(C9742xdf6f648 firebaseVisionImageMetadata$MediaBrowserCompat$CustomActionResultReceiver, constrainedSortedSet constrainedsortedset) {
            this.write = firebaseVisionImageMetadata$MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver = constrainedsortedset;
        }

        public final void IconCompatParcelizer(Object obj) {
            C9742xdf6f648 firebaseVisionImageMetadata$MediaBrowserCompat$CustomActionResultReceiver = this.write;
            constrainedSortedSet constrainedsortedset = this.MediaBrowserCompat$CustomActionResultReceiver;
            Extractor extractor = (Extractor) obj;
            extractor.IconCompatParcelizer(firebaseVisionImageMetadata$MediaBrowserCompat$CustomActionResultReceiver.write.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(constrainedsortedset.MediaBrowserCompat$ItemReceiver, constrainedsortedset.IconCompatParcelizer, extractor.MediaBrowserCompat$CustomActionResultReceiver(), extractor.MediaBrowserCompat$ItemReceiver()));
        }
    }
}
