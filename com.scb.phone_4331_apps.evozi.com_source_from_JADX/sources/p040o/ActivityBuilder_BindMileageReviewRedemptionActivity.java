package p040o;

import android.content.Intent;
import com.scb.phone.view.fragment.investment.funddetails.FundDetailSummaryFragment;

/* renamed from: o.ActivityBuilder_BindMileageReviewRedemptionActivity */
public final /* synthetic */ class ActivityBuilder_BindMileageReviewRedemptionActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FundDetailSummaryFragment read;

    public /* synthetic */ ActivityBuilder_BindMileageReviewRedemptionActivity(FundDetailSummaryFragment fundDetailSummaryFragment) {
        this.read = fundDetailSummaryFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        FundDetailSummaryFragment fundDetailSummaryFragment = this.read;
        Intent intent = (Intent) obj;
        if (intent.getExtras() != null) {
            logException logexception = (logException) intent.getParcelableExtra("INVESTMENT_FUND_LIST");
            fundDetailSummaryFragment.mFundName.setText(logexception.MediaBrowserCompat$SearchResultReceiver);
            fundDetailSummaryFragment.mFundDescription.setText(logexception.read);
            fundDetailSummaryFragment.mAverageUnit.setText(logexception.IconCompatParcelizer);
            fundDetailSummaryFragment.mCurrentUnit.setText(logexception.MediaDescriptionCompat);
            fundDetailSummaryFragment.mAverageCost.setText(logexception.MediaBrowserCompat$CustomActionResultReceiver);
            fundDetailSummaryFragment.mCurrentValue.setText(logexception.AppCompatDialogFragment);
        }
    }
}
