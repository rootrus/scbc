package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.investment.redeem.FundRedeemLandingFragment;

/* renamed from: o.ActivityBuilder_BindQuickTopUpReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindQuickTopUpReviewActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ FundRedeemLandingFragment write;

    public /* synthetic */ ActivityBuilder_BindQuickTopUpReviewActivity(FundRedeemLandingFragment fundRedeemLandingFragment, String str) {
        this.write = fundRedeemLandingFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FundRedeemLandingFragment fundRedeemLandingFragment = this.write;
        fundRedeemLandingFragment.fundRedeemPresenter.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
