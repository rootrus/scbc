package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.purchase.FundSearchListAdapter;

/* renamed from: o.getCardlessInfo */
public final /* synthetic */ class getCardlessInfo implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ FundSearchListAdapter read;

    public /* synthetic */ getCardlessInfo(FundSearchListAdapter fundSearchListAdapter, int i) {
        this.read = fundSearchListAdapter;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        FundSearchListAdapter fundSearchListAdapter = this.read;
        int i = this.IconCompatParcelizer;
        FragmentBuilder_BindChequeSuccessFragment fragmentBuilder_BindChequeSuccessFragment = fundSearchListAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindChequeSuccessFragment != null) {
            fragmentBuilder_BindChequeSuccessFragment.IconCompatParcelizer(fundSearchListAdapter.write.get(i));
        }
    }
}
