package p040o;

import com.scb.phone.view.adapter.investment.onboarding.SelectableChoiceAdapter;
import com.scb.phone.view.fragment.investment.scbs.open.SCBSRiskLevelFragment;

/* renamed from: o.ActivityBuilder_BindTopUpReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindTopUpReviewActivity implements SelectableChoiceAdapter.IconCompatParcelizer {
    private final /* synthetic */ SCBSRiskLevelFragment write;

    public /* synthetic */ ActivityBuilder_BindTopUpReviewActivity(SCBSRiskLevelFragment sCBSRiskLevelFragment) {
        this.write = sCBSRiskLevelFragment;
    }

    public final void IconCompatParcelizer(String str, int i) {
        getTextSize gettextsize = this.write.riskLevelPresenter;
        getPitchThreshold getpitchthreshold = getPitchThreshold.MediaBrowserCompat$CustomActionResultReceiver;
        if (gettextsize.RatingCompat != null) {
            getpitchthreshold.IconCompatParcelizer(gettextsize.RatingCompat);
        }
    }
}
