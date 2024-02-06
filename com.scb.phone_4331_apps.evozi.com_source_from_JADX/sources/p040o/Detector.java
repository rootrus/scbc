package p040o;

import p040o.LocalProjectProvider;

/* renamed from: o.Detector */
public final class Detector extends IndoorBuilding {
    private final LocalProjectProvider.C69375 read;

    /* renamed from: o.Detector$Processor */
    public final class Processor extends IndoorBuilding {
        private final LocalProjectProvider.C69375 IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public Processor(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
            onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
            onGetStartedClick.write((Object) r4, "easycashRepositoryContractor");
            this.IconCompatParcelizer = r4;
        }

        public final DebitCardResetOtpActivity<Object> MediaBrowserCompat$CustomActionResultReceiver(nextInChain nextinchain) {
            onGetStartedClick.write((Object) nextinchain, "request");
            return write(this.IconCompatParcelizer.IconCompatParcelizer(nextinchain));
        }
    }

    /* renamed from: o.Detector$Detections */
    public final class Detections extends IndoorBuilding {
        private final LocalProjectProvider.C69375 IconCompatParcelizer;

        @HmlPinActivity
        public Detections(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r3) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            this.IconCompatParcelizer = r3;
        }

        public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver() {
            return write(this.IconCompatParcelizer.IconCompatParcelizer());
        }
    }

    @HmlPinActivity
    public Detector(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r3) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.read = r3;
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(getValueReference getvaluereference) {
        return write(this.read.MediaBrowserCompat$CustomActionResultReceiver(getvaluereference));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(getNextEvictable getnextevictable) {
        return write(this.read.MediaBrowserCompat$CustomActionResultReceiver(getnextevictable));
    }
}
