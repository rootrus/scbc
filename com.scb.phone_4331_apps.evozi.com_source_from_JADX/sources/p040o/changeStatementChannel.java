package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.InvestmentDetailsTransactionAdapter;

/* renamed from: o.changeStatementChannel */
public final /* synthetic */ class changeStatementChannel implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ InvestmentDetailsTransactionAdapter write;

    public /* synthetic */ changeStatementChannel(InvestmentDetailsTransactionAdapter investmentDetailsTransactionAdapter, int i) {
        this.write = investmentDetailsTransactionAdapter;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        InvestmentDetailsTransactionAdapter investmentDetailsTransactionAdapter = this.write;
        int i = this.MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindBondNoAccountsErrorFragment fragmentBuilder_BindBondNoAccountsErrorFragment = investmentDetailsTransactionAdapter.write;
        if (fragmentBuilder_BindBondNoAccountsErrorFragment != null) {
            fragmentBuilder_BindBondNoAccountsErrorFragment.MediaBrowserCompat$ItemReceiver(i);
        }
    }
}
