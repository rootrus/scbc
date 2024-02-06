package p040o;

import android.view.View;
import com.scb.phone.view.fragment.purchase.PurchaseDepositInputFragment;

/* renamed from: o.ActivityBuilder_ContributeMwEditCreateQrActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMwEditCreateQrActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ PurchaseDepositInputFragment read;

    public /* synthetic */ ActivityBuilder_ContributeMwEditCreateQrActivity(PurchaseDepositInputFragment purchaseDepositInputFragment) {
        this.read = purchaseDepositInputFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        this.read.write(z);
    }
}
