package p040o;

import p040o.Api;

/* renamed from: o.isForNewAccount */
public final class isForNewAccount implements OPRStatusRewardsLandingActivity_ViewBinding<Api.AnyClientKey> {
    private final HmlReviewDocumentActivity<setShowCancelButton> IconCompatParcelizer;

    private isForNewAccount(HmlReviewDocumentActivity<setShowCancelButton> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static isForNewAccount IconCompatParcelizer(HmlReviewDocumentActivity<setShowCancelButton> hmlReviewDocumentActivity) {
        return new isForNewAccount(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new Api.AnyClientKey(this.IconCompatParcelizer.get());
    }
}
