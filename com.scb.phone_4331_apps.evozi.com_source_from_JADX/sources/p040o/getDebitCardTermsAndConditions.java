package p040o;

import com.scb.phone.view.adapter.chequemanagement.stopcheque.StopChequeHistoryAdapter;
import com.scb.phone.view.fragment.chequemanagement.stopcheque.StopChequeHistoryFragment;

/* renamed from: o.getDebitCardTermsAndConditions */
public final /* synthetic */ class getDebitCardTermsAndConditions implements Runnable {
    private final /* synthetic */ StopChequeHistoryFragment IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getDebitCardTermsAndConditions(StopChequeHistoryFragment stopChequeHistoryFragment, String str) {
        this.IconCompatParcelizer = stopChequeHistoryFragment;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void run() {
        StopChequeHistoryFragment stopChequeHistoryFragment = this.IconCompatParcelizer;
        stopChequeHistoryFragment.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(true, (StopChequeHistoryAdapter.IconCompatParcelizer) new getCcSofCreditCardTermsAndConditions(stopChequeHistoryFragment, this.MediaBrowserCompat$ItemReceiver));
    }
}
