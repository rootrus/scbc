package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.funddetails.DividendSummaryAdapter;

/* renamed from: o.getDeejungTransactionPlans */
public final /* synthetic */ class getDeejungTransactionPlans implements View.OnClickListener {
    private final /* synthetic */ DividendSummaryAdapter write;

    public /* synthetic */ getDeejungTransactionPlans(DividendSummaryAdapter dividendSummaryAdapter) {
        this.write = dividendSummaryAdapter;
    }

    public final void onClick(View view) {
        DividendSummaryAdapter.write(this.write, view);
    }
}
