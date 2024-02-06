package p040o;

import com.scb.phone.view.adapter.chequemanagement.stopcheque.StopChequeHistoryAdapter;
import com.scb.phone.view.fragment.chequemanagement.stopcheque.StopChequeHistoryFragment;

/* renamed from: o.getCcSofCreditCardTermsAndConditions */
public final /* synthetic */ class getCcSofCreditCardTermsAndConditions implements StopChequeHistoryAdapter.IconCompatParcelizer {
    private final /* synthetic */ StopChequeHistoryFragment IconCompatParcelizer;
    private final /* synthetic */ String write;

    public /* synthetic */ getCcSofCreditCardTermsAndConditions(StopChequeHistoryFragment stopChequeHistoryFragment, String str) {
        this.IconCompatParcelizer = stopChequeHistoryFragment;
        this.write = str;
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        StopChequeHistoryFragment stopChequeHistoryFragment = this.IconCompatParcelizer;
        String str = this.write;
        if (z) {
            stopChequeHistoryFragment.presenter.IconCompatParcelizer(stopChequeHistoryFragment.IconCompatParcelizer, str, true);
        }
    }
}
