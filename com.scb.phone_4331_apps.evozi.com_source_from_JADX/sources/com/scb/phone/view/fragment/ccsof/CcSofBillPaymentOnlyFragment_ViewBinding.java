package com.scb.phone.view.fragment.ccsof;

import android.view.View;
import android.widget.FrameLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class CcSofBillPaymentOnlyFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CcSofBillPaymentOnlyFragment MediaBrowserCompat$CustomActionResultReceiver;

    public CcSofBillPaymentOnlyFragment_ViewBinding(CcSofBillPaymentOnlyFragment ccSofBillPaymentOnlyFragment, View view) {
        super(ccSofBillPaymentOnlyFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = ccSofBillPaymentOnlyFragment;
        ccSofBillPaymentOnlyFragment.sourceOfFundContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_of_fund_container, "field 'sourceOfFundContainer'", FrameLayout.class);
        ccSofBillPaymentOnlyFragment.inputContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_container, "field 'inputContainer'", FrameLayout.class);
    }

    public final void read() {
        CcSofBillPaymentOnlyFragment ccSofBillPaymentOnlyFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (ccSofBillPaymentOnlyFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            ccSofBillPaymentOnlyFragment.sourceOfFundContainer = null;
            ccSofBillPaymentOnlyFragment.inputContainer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
