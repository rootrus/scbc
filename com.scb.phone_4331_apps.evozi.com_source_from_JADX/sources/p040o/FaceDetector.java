package p040o;

import p040o.LocalProjectProvider;

/* renamed from: o.FaceDetector */
public final class FaceDetector extends IndoorBuilding {
    @HmlPinActivity
    public FaceDetector(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
    }

    /* renamed from: o.FaceDetector$Builder */
    public final class Builder extends IndoorBuilding {
        private final LocalProjectProvider.C69353 write;

        @HmlPinActivity
        public Builder(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69353 r3) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            this.write = r3;
        }

        public final DebitCardResetOtpActivity read() {
            return write(this.write.read());
        }

        public final DebitCardResetOtpActivity write(String str) {
            return write(this.write.IconCompatParcelizer(str));
        }
    }
}
