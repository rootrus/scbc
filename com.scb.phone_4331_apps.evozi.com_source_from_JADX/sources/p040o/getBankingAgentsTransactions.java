package p040o;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.view.custom.common.AmountEditText;

/* renamed from: o.getBankingAgentsTransactions */
public final /* synthetic */ class getBankingAgentsTransactions implements View.OnFocusChangeListener {
    private final /* synthetic */ TextInputLayout read;
    private final /* synthetic */ AmountEditText write;

    public /* synthetic */ getBankingAgentsTransactions(TextInputLayout textInputLayout, AmountEditText amountEditText) {
        this.read = textInputLayout;
        this.write = amountEditText;
    }

    public final void onFocusChange(View view, boolean z) {
        getCardManagementActivation.IconCompatParcelizer(this.read, this.write, z);
    }
}
