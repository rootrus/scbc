package p040o;

import android.view.View;
import com.scb.phone.view.adapter.cardmanagement.UnbilledTransactionsAdapter;

/* renamed from: o.JuristicApi */
public final /* synthetic */ class JuristicApi implements View.OnClickListener {
    private final /* synthetic */ UnbilledTransactionsAdapter IconCompatParcelizer;
    private final /* synthetic */ FirebaseApp read;
    private final /* synthetic */ UnbilledTransactionsAdapter.TransactionViewHolder write;

    public /* synthetic */ JuristicApi(UnbilledTransactionsAdapter unbilledTransactionsAdapter, UnbilledTransactionsAdapter.TransactionViewHolder transactionViewHolder, FirebaseApp firebaseApp) {
        this.IconCompatParcelizer = unbilledTransactionsAdapter;
        this.write = transactionViewHolder;
        this.read = firebaseApp;
    }

    public final void onClick(View view) {
        UnbilledTransactionsAdapter unbilledTransactionsAdapter = this.IconCompatParcelizer;
        UnbilledTransactionsAdapter.TransactionViewHolder transactionViewHolder = this.write;
        FirebaseApp firebaseApp = this.read;
        if (!(!transactionViewHolder.checkboxUnbilledTransaction.isChecked())) {
            firebaseApp.IconCompatParcelizer = false;
            transactionViewHolder.checkboxUnbilledTransaction.setChecked(firebaseApp.IconCompatParcelizer);
            unbilledTransactionsAdapter.read.MediaBrowserCompat$CustomActionResultReceiver(firebaseApp, firebaseApp.IconCompatParcelizer);
        } else if (!unbilledTransactionsAdapter.read.read()) {
            firebaseApp.IconCompatParcelizer = true;
            transactionViewHolder.checkboxUnbilledTransaction.setChecked(firebaseApp.IconCompatParcelizer);
            unbilledTransactionsAdapter.read.MediaBrowserCompat$CustomActionResultReceiver(firebaseApp, firebaseApp.IconCompatParcelizer);
        }
    }
}
