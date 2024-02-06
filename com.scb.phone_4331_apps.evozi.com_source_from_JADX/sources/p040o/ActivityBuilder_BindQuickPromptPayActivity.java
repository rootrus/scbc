package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.investment.purchase.FundPurchaseLandingFragment;

/* renamed from: o.ActivityBuilder_BindQuickPromptPayActivity */
public final /* synthetic */ class ActivityBuilder_BindQuickPromptPayActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ isProximityOn MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ FundPurchaseLandingFragment read;

    public /* synthetic */ ActivityBuilder_BindQuickPromptPayActivity(FundPurchaseLandingFragment fundPurchaseLandingFragment, isProximityOn isproximityon) {
        this.read = fundPurchaseLandingFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = isproximityon;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        FundPurchaseLandingFragment fundPurchaseLandingFragment = this.read;
        fundPurchaseLandingFragment.fundPurchasePresenter.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
