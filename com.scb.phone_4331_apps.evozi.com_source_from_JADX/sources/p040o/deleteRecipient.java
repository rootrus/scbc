package p040o;

import android.view.inputmethod.InputMethodManager;
import com.scb.phone.view.adapter.hml.HmlOutcomeCounterAdapter;
import com.scb.phone.view.custom.common.CustomDeltaInputPressed;

/* renamed from: o.deleteRecipient */
public final /* synthetic */ class deleteRecipient implements Runnable {
    private final /* synthetic */ HmlOutcomeCounterAdapter.UpsellOfferViewHolder write;

    public /* synthetic */ deleteRecipient(HmlOutcomeCounterAdapter.UpsellOfferViewHolder upsellOfferViewHolder) {
        this.write = upsellOfferViewHolder;
    }

    public final void run() {
        HmlOutcomeCounterAdapter.UpsellOfferViewHolder upsellOfferViewHolder = this.write;
        upsellOfferViewHolder.headerTitle.requestFocus();
        CustomDeltaInputPressed customDeltaInputPressed = upsellOfferViewHolder.loanAmount;
        if (customDeltaInputPressed != null) {
            ((InputMethodManager) customDeltaInputPressed.getContext().getSystemService("input_method")).hideSoftInputFromWindow(customDeltaInputPressed.getWindowToken(), 0);
        }
    }
}
