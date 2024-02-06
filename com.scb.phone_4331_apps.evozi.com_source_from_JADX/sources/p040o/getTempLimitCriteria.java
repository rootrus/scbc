package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.onboarding.FundSourceListAdapter;

/* renamed from: o.getTempLimitCriteria */
public final /* synthetic */ class getTempLimitCriteria implements View.OnClickListener {
    private final /* synthetic */ FundSourceListAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int read;

    public /* synthetic */ getTempLimitCriteria(FundSourceListAdapter fundSourceListAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fundSourceListAdapter;
        this.read = i;
    }

    public final void onClick(View view) {
        FundSourceListAdapter fundSourceListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.read;
        FragmentBuilder_BindCardlessWithdrawAmountFragment fragmentBuilder_BindCardlessWithdrawAmountFragment = fundSourceListAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindCardlessWithdrawAmountFragment != null) {
            fragmentBuilder_BindCardlessWithdrawAmountFragment.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }
}
