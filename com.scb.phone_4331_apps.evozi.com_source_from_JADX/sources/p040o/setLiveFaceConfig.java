package p040o;

import com.scb.phone.view.activity.mwpartner.MwBankAccountActivity;
import com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter;

/* renamed from: o.setLiveFaceConfig */
public final /* synthetic */ class setLiveFaceConfig implements BankAccountAdapter.write {
    private final /* synthetic */ MwBankAccountActivity write;

    public /* synthetic */ setLiveFaceConfig(MwBankAccountActivity mwBankAccountActivity) {
        this.write = mwBankAccountActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.write.btnReview.setEnabled(true);
    }
}
