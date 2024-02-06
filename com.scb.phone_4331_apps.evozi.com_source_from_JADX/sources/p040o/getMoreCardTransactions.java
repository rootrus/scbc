package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.onboarding.FundAccountPagerAdapter;

/* renamed from: o.getMoreCardTransactions */
public final /* synthetic */ class getMoreCardTransactions implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ FundAccountPagerAdapter MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getMoreCardTransactions(FundAccountPagerAdapter fundAccountPagerAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fundAccountPagerAdapter;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        FundAccountPagerAdapter fundAccountPagerAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.IconCompatParcelizer;
        fundAccountPagerAdapter.write = i;
        FundAccountPagerAdapter.read read = fundAccountPagerAdapter.MediaBrowserCompat$ItemReceiver;
        if (read != null) {
            read.write(i);
        }
        fundAccountPagerAdapter.notifyDataSetChanged();
    }
}
