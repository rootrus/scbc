package p040o;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.ProxySourceAdapter;

/* renamed from: o.getEasycashSalesheets */
public final /* synthetic */ class getEasycashSalesheets implements View.OnClickListener {
    private final /* synthetic */ ProxySourceAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getEasycashSalesheets(ProxySourceAdapter proxySourceAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = proxySourceAdapter;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        ProxySourceAdapter proxySourceAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment = proxySourceAdapter.read;
        if (fragmentBuilder_BindCcSofBillPaymentOnlyFragment != null) {
            fragmentBuilder_BindCcSofBillPaymentOnlyFragment.read(i);
        }
    }
}
