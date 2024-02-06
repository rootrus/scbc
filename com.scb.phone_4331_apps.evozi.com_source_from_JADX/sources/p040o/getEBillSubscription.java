package p040o;

import android.view.View;
import com.scb.phone.view.adapter.purchase.PurchaseAccountSourceAdapter;

/* renamed from: o.getEBillSubscription */
public final /* synthetic */ class getEBillSubscription implements View.OnClickListener {
    private final /* synthetic */ PurchaseAccountSourceAdapter IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getEBillSubscription(PurchaseAccountSourceAdapter purchaseAccountSourceAdapter, int i) {
        this.IconCompatParcelizer = purchaseAccountSourceAdapter;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        PurchaseAccountSourceAdapter purchaseAccountSourceAdapter = this.IconCompatParcelizer;
        int i = this.MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment = purchaseAccountSourceAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindCcSofBillPaymentOnlyFragment != null) {
            fragmentBuilder_BindCcSofBillPaymentOnlyFragment.read(i);
        }
    }
}
