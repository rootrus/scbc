package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.withGservicePrefix */
public final class withGservicePrefix implements OPRStatusRewardsLandingActivity_ViewBinding<ExperimentTokens> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<AbstractMultimap.MultisetEntry> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private withGservicePrefix(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.MultisetEntry> hmlReviewDocumentActivity3) {
        this.write = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static withGservicePrefix IconCompatParcelizer(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<AbstractMultimap.MultisetEntry> hmlReviewDocumentActivity3) {
        return new withGservicePrefix(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new ExperimentTokens(this.write.get(), this.IconCompatParcelizer.get(), this.read.get());
    }
}
