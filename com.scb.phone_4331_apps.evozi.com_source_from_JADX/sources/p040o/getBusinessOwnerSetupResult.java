package p040o;

import android.view.View;
import com.scb.phone.view.adapter.merchant.MerchantWalletOutgoingTransactionAdapter;

/* renamed from: o.getBusinessOwnerSetupResult */
public final /* synthetic */ class getBusinessOwnerSetupResult implements View.OnClickListener {
    private final /* synthetic */ MerchantWalletOutgoingTransactionAdapter read;

    public /* synthetic */ getBusinessOwnerSetupResult(MerchantWalletOutgoingTransactionAdapter merchantWalletOutgoingTransactionAdapter) {
        this.read = merchantWalletOutgoingTransactionAdapter;
    }

    public final void onClick(View view) {
        this.read.read(view);
    }
}
