package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.investment.redeem.FundRedeemLandingFragment;

/* renamed from: o.ActivityBuilder_BindRequestToPayActivity */
public final /* synthetic */ class ActivityBuilder_BindRequestToPayActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ FundRedeemLandingFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ ActivityBuilder_BindRequestToPayActivity(FundRedeemLandingFragment fundRedeemLandingFragment, String str) {
        this.MediaBrowserCompat$ItemReceiver = fundRedeemLandingFragment;
        this.read = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FundRedeemLandingFragment fundRedeemLandingFragment = this.MediaBrowserCompat$ItemReceiver;
        fundRedeemLandingFragment.fundRedeemPresenter.IconCompatParcelizer(this.read);
    }
}
