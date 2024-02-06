package p040o;

import android.view.View;
import com.scb.phone.view.adapter.mwpartner.MwMarketMallSearchAdapter;

/* renamed from: o.getLoanPayment */
public final /* synthetic */ class getLoanPayment implements View.OnClickListener {
    private final /* synthetic */ MwMarketMallSearchAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ getLoanPayment(MwMarketMallSearchAdapter mwMarketMallSearchAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = mwMarketMallSearchAdapter;
        this.write = i;
    }

    public final void onClick(View view) {
        MwMarketMallSearchAdapter mwMarketMallSearchAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.write;
        if (mwMarketMallSearchAdapter.write != null && i < mwMarketMallSearchAdapter.read.size()) {
            mwMarketMallSearchAdapter.write.MediaBrowserCompat$ItemReceiver(mwMarketMallSearchAdapter.read.get(i));
        }
    }
}
