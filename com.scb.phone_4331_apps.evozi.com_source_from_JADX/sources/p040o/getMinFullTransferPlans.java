package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.funddetails.LtfSummaryAdapter;

/* renamed from: o.getMinFullTransferPlans */
public final /* synthetic */ class getMinFullTransferPlans implements View.OnClickListener {
    private final /* synthetic */ LtfSummaryAdapter MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getMinFullTransferPlans(LtfSummaryAdapter ltfSummaryAdapter) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ltfSummaryAdapter;
    }

    public final void onClick(View view) {
        LtfSummaryAdapter.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, view);
    }
}
