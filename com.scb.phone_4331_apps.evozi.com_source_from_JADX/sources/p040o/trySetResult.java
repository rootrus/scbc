package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.trySetResult */
public final class trySetResult implements OPRStatusRewardsLandingActivity_ViewBinding<continueWith> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<AbstractMultimap.Entries> write;

    private trySetResult(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.Entries> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static trySetResult read(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.Entries> hmlReviewDocumentActivity3) {
        return new trySetResult(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity = this.IconCompatParcelizer;
        HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.write.get();
        return new continueWith(hmlReviewDocumentActivity.get(), hmlReviewDocumentActivity2.get());
    }
}
