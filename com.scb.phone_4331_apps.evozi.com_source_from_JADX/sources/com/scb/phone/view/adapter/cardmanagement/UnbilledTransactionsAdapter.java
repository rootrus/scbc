package com.scb.phone.view.adapter.cardmanagement;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.FirebaseApp;
import p040o.JuristicApi;
import p040o.onStart;
import p040o.postAddressesValidation;
import p040o.setExtractorListener;

public final class UnbilledTransactionsAdapter extends postAddressesValidation {
    public setExtractorListener read;
    public List<FirebaseApp> write;

    public class TransactionViewHolder_ViewBinding implements Unbinder {
        private TransactionViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public TransactionViewHolder_ViewBinding(TransactionViewHolder transactionViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = transactionViewHolder;
            transactionViewHolder.checkboxUnbilledTransaction = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.checkbox_purchase, "field 'checkboxUnbilledTransaction'", CheckBox.class);
            transactionViewHolder.txvMerchName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_merch_name, "field 'txvMerchName'", TextView.class);
            transactionViewHolder.txvTransactionAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_amount, "field 'txvTransactionAmount'", TextView.class);
            transactionViewHolder.txvTransactionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transaction_date, "field 'txvTransactionDate'", TextView.class);
        }

        public final void read() {
            TransactionViewHolder transactionViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (transactionViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                transactionViewHolder.checkboxUnbilledTransaction = null;
                transactionViewHolder.txvMerchName = null;
                transactionViewHolder.txvTransactionAmount = null;
                transactionViewHolder.txvTransactionDate = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup) {
        return new TransactionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f92012131494428, viewGroup, false));
    }

    public final int write() {
        List<FirebaseApp> list = this.write;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof TransactionViewHolder) {
            FirebaseApp firebaseApp = this.write.get(i);
            TransactionViewHolder transactionViewHolder = (TransactionViewHolder) setcontentview;
            transactionViewHolder.txvMerchName.setText(firebaseApp.MediaBrowserCompat$CustomActionResultReceiver);
            transactionViewHolder.txvTransactionAmount.setText(firebaseApp.MediaBrowserCompat$MediaItem);
            transactionViewHolder.txvTransactionDate.setText(firebaseApp.MediaDescriptionCompat);
            transactionViewHolder.checkboxUnbilledTransaction.setChecked(firebaseApp.IconCompatParcelizer);
            setcontentview.write.setOnClickListener(new JuristicApi(this, transactionViewHolder, firebaseApp));
        }
    }

    public class TransactionViewHolder extends RecyclerView.setContentView {
        @BindView
        public CheckBox checkboxUnbilledTransaction;
        @BindView
        TextView txvMerchName;
        @BindView
        TextView txvTransactionAmount;
        @BindView
        TextView txvTransactionDate;

        public TransactionViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
