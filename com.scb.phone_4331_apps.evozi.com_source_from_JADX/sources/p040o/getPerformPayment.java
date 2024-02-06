package p040o;

import android.view.View;
import com.scb.phone.view.adapter.easycash.IssuerSearchAdapter;

/* renamed from: o.getPerformPayment */
public final /* synthetic */ class getPerformPayment implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ IssuerSearchAdapter read;

    public /* synthetic */ getPerformPayment(IssuerSearchAdapter issuerSearchAdapter, int i) {
        this.read = issuerSearchAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        IssuerSearchAdapter issuerSearchAdapter = this.read;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindCardlessWithdrawAmountFragment fragmentBuilder_BindCardlessWithdrawAmountFragment = issuerSearchAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindCardlessWithdrawAmountFragment != null) {
            fragmentBuilder_BindCardlessWithdrawAmountFragment.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }
}
