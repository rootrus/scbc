package p040o;

import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;

/* renamed from: o.setPartNumber */
public final class setPartNumber implements OPRStatusRewardsLandingActivity_ViewBinding<ScbsAccountDetailPresenter> {
    public static ScbsAccountDetailPresenter write(RegularImmutableBiMap regularImmutableBiMap, include include, lessThanUnsigned lessthanunsigned) {
        return new ScbsAccountDetailPresenter(regularImmutableBiMap, include, lessthanunsigned);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        ScbsAccountDetailPresenter scbsAccountDetailPresenter = new ScbsAccountDetailPresenter((RegularImmutableBiMap) hmlReviewDocumentActivity.get(), (include) hmlReviewDocumentActivity.get(), (lessThanUnsigned) hmlReviewDocumentActivity.get());
        setWscClientType.write(scbsAccountDetailPresenter, (include) hmlReviewDocumentActivity.get());
        return scbsAccountDetailPresenter;
    }
}
