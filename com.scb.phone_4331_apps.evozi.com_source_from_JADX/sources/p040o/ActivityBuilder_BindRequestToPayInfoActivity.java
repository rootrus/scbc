package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.investment.redeem.FundRedeemLandingFragment;

/* renamed from: o.ActivityBuilder_BindRequestToPayInfoActivity */
public final /* synthetic */ class ActivityBuilder_BindRequestToPayInfoActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ FundRedeemLandingFragment IconCompatParcelizer;
    private final /* synthetic */ isProximityOn MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_BindRequestToPayInfoActivity(FundRedeemLandingFragment fundRedeemLandingFragment, isProximityOn isproximityon) {
        this.IconCompatParcelizer = fundRedeemLandingFragment;
        this.MediaBrowserCompat$ItemReceiver = isproximityon;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FundRedeemLandingFragment fundRedeemLandingFragment = this.IconCompatParcelizer;
        fundRedeemLandingFragment.fundRedeemPresenter.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }
}
