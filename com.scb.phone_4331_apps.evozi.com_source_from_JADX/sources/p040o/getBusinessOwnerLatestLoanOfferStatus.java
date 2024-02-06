package p040o;

import android.view.View;
import com.scb.phone.view.adapter.loan.SmeLoanDetailCommercialItemAdapter;

/* renamed from: o.getBusinessOwnerLatestLoanOfferStatus */
public final /* synthetic */ class getBusinessOwnerLatestLoanOfferStatus implements View.OnClickListener {
    private final /* synthetic */ SmeLoanDetailCommercialItemAdapter read;

    public /* synthetic */ getBusinessOwnerLatestLoanOfferStatus(SmeLoanDetailCommercialItemAdapter smeLoanDetailCommercialItemAdapter) {
        this.read = smeLoanDetailCommercialItemAdapter;
    }

    public final void onClick(View view) {
        this.read.MediaBrowserCompat$ItemReceiver(view);
    }
}
