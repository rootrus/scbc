package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.investment.fundswitch.FundSwitchLandingFragment;
import p040o.ExecutorUtils;

/* renamed from: o.ActivityBuilder_BindMutualFundTermsAndConditionsActivity */
public final /* synthetic */ class ActivityBuilder_BindMutualFundTermsAndConditionsActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ FundSwitchLandingFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ ExecutorUtils.C33371 write;

    public /* synthetic */ ActivityBuilder_BindMutualFundTermsAndConditionsActivity(FundSwitchLandingFragment fundSwitchLandingFragment, ExecutorUtils.C33371 r2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fundSwitchLandingFragment;
        this.write = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FundSwitchLandingFragment fundSwitchLandingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        fundSwitchLandingFragment.fundSwitchLandingPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.write);
    }
}
