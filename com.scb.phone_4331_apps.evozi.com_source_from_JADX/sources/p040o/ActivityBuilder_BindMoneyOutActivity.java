package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.investment.fundswitch.FundSwitchLandingFragment;

/* renamed from: o.ActivityBuilder_BindMoneyOutActivity */
public final /* synthetic */ class ActivityBuilder_BindMoneyOutActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ isProximityOn IconCompatParcelizer;
    private final /* synthetic */ FundSwitchLandingFragment write;

    public /* synthetic */ ActivityBuilder_BindMoneyOutActivity(FundSwitchLandingFragment fundSwitchLandingFragment, isProximityOn isproximityon) {
        this.write = fundSwitchLandingFragment;
        this.IconCompatParcelizer = isproximityon;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FundSwitchLandingFragment fundSwitchLandingFragment = this.write;
        fundSwitchLandingFragment.fundSwitchLandingPresenter.IconCompatParcelizer(this.IconCompatParcelizer);
    }
}
