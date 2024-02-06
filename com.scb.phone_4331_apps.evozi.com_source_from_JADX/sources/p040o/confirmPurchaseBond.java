package p040o;

import android.view.View;
import com.scb.phone.view.adapter.ebillsubscription.C5753x4ef7ff3;
import com.scb.phone.view.adapter.ebillsubscription.EBillSubscriptionAdapter;

/* renamed from: o.confirmPurchaseBond */
public final /* synthetic */ class confirmPurchaseBond implements View.OnClickListener {
    private final /* synthetic */ EBillSubscriptionAdapter MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int read;

    public /* synthetic */ confirmPurchaseBond(EBillSubscriptionAdapter eBillSubscriptionAdapter, int i) {
        this.MediaBrowserCompat$ItemReceiver = eBillSubscriptionAdapter;
        this.read = i;
    }

    public final void onClick(View view) {
        EBillSubscriptionAdapter eBillSubscriptionAdapter = this.MediaBrowserCompat$ItemReceiver;
        int i = this.read;
        C5753x4ef7ff3 eBillSubscriptionAdapter$MediaBrowserCompat$CustomActionResultReceiver = eBillSubscriptionAdapter.read;
        if (eBillSubscriptionAdapter$MediaBrowserCompat$CustomActionResultReceiver != null) {
            eBillSubscriptionAdapter$MediaBrowserCompat$CustomActionResultReceiver.read(i);
        }
    }
}
