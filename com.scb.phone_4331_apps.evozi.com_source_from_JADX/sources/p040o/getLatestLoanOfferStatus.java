package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.merchant.bankaccount.BankAccountAdapter;

/* renamed from: o.getLatestLoanOfferStatus */
public final /* synthetic */ class getLatestLoanOfferStatus implements View.OnClickListener {
    private final /* synthetic */ BankAccountAdapter.BankAccountViewHolder IconCompatParcelizer;

    public /* synthetic */ getLatestLoanOfferStatus(BankAccountAdapter.BankAccountViewHolder bankAccountViewHolder) {
        this.IconCompatParcelizer = bankAccountViewHolder;
    }

    public final void onClick(View view) {
        int i;
        BankAccountAdapter.BankAccountViewHolder bankAccountViewHolder = this.IconCompatParcelizer;
        BankAccountAdapter bankAccountAdapter = BankAccountAdapter.this;
        RecyclerView recyclerView = bankAccountViewHolder.MediaMetadataCompat;
        if (recyclerView == null) {
            i = -1;
        } else {
            i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) bankAccountViewHolder);
        }
        int unused = bankAccountAdapter.read = i;
        BankAccountAdapter.this.IconCompatParcelizer.write();
        if (BankAccountAdapter.this.write != null) {
            BankAccountAdapter.this.write.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
