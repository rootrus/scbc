package p040o;

import android.view.View;
import com.scb.phone.view.custom.ntb.NTBAdsDialog;

/* renamed from: o.inquiryMerchantSweepTransactions */
public final /* synthetic */ class inquiryMerchantSweepTransactions implements View.OnClickListener {
    private final /* synthetic */ NTBAdsDialog IconCompatParcelizer;

    public /* synthetic */ inquiryMerchantSweepTransactions(NTBAdsDialog nTBAdsDialog) {
        this.IconCompatParcelizer = nTBAdsDialog;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.dismiss();
    }
}
