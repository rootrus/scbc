package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.purchase.PurchaseDepositInputFragment;
import p040o.CrashlyticsReport;

/* renamed from: o.ActivityBuilder_ContributeMwCurrentUserEwalletActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMwCurrentUserEwalletActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ PurchaseDepositInputFragment IconCompatParcelizer;
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Execution.Signal read;

    public /* synthetic */ ActivityBuilder_ContributeMwCurrentUserEwalletActivity(PurchaseDepositInputFragment purchaseDepositInputFragment, CrashlyticsReport.Session.Event.Application.Execution.Signal signal, boolean z) {
        this.IconCompatParcelizer = purchaseDepositInputFragment;
        this.read = signal;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PurchaseDepositInputFragment purchaseDepositInputFragment = this.IconCompatParcelizer;
        purchaseDepositInputFragment.write(purchaseDepositInputFragment.MediaBrowserCompat$ItemReceiver(this.read, this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
