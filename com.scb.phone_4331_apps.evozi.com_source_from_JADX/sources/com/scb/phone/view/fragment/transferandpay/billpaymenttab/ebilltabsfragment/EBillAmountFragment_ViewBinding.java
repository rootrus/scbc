package com.scb.phone.view.fragment.transferandpay.billpaymenttab.ebilltabsfragment;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class EBillAmountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EBillAmountFragment MediaBrowserCompat$CustomActionResultReceiver;

    public EBillAmountFragment_ViewBinding(EBillAmountFragment eBillAmountFragment, View view) {
        super(eBillAmountFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = eBillAmountFragment;
        eBillAmountFragment.mTextInputEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_amount_value_edit_text, "field 'mTextInputEditText'", AmountEditText.class);
        eBillAmountFragment.mInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_amount_value_input_layout, "field 'mInputLayout'", TextInputLayout.class);
    }

    public final void read() {
        EBillAmountFragment eBillAmountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (eBillAmountFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            eBillAmountFragment.mTextInputEditText = null;
            eBillAmountFragment.mInputLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
