package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.investment.purchase.FundPurchaseLandingFragment;

/* renamed from: o.ActivityBuilder_BindPromptPayQRActivity */
public final /* synthetic */ class ActivityBuilder_BindPromptPayQRActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ getOsBuildVersionString IconCompatParcelizer;
    private final /* synthetic */ FundPurchaseLandingFragment write;

    public /* synthetic */ ActivityBuilder_BindPromptPayQRActivity(FundPurchaseLandingFragment fundPurchaseLandingFragment, getOsBuildVersionString getosbuildversionstring) {
        this.write = fundPurchaseLandingFragment;
        this.IconCompatParcelizer = getosbuildversionstring;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FundPurchaseLandingFragment fundPurchaseLandingFragment = this.write;
        fundPurchaseLandingFragment.fundPurchasePresenter.write(this.IconCompatParcelizer);
    }
}
