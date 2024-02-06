package p040o;

import android.view.View;
import com.scb.phone.view.fragment.purchase.PurchaseDepositFragment;
import p040o.C10178z;

/* renamed from: o.ActivityBuilder_ContributeMwCoachMarkActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMwCoachMarkActivity implements View.OnClickListener {
    private final /* synthetic */ PurchaseDepositFragment write;

    public /* synthetic */ ActivityBuilder_ContributeMwCoachMarkActivity(PurchaseDepositFragment purchaseDepositFragment) {
        this.write = purchaseDepositFragment;
    }

    public final void onClick(View view) {
        C10178z.C54691 r4 = this.write.mPresenter;
        C4862jX jXVar = C4862jX.MediaBrowserCompat$ItemReceiver;
        if (r4.RatingCompat != null) {
            jXVar.IconCompatParcelizer(r4.RatingCompat);
        }
        r4.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        r4.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C10178z.C54691.IconCompatParcelizer());
    }
}
