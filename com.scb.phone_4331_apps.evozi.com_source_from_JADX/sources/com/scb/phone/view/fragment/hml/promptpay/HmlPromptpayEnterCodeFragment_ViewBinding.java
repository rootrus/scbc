package com.scb.phone.view.fragment.hml.promptpay;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.hml.CustomDecimalAmountVerification;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class HmlPromptpayEnterCodeFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlPromptpayEnterCodeFragment MediaBrowserCompat$CustomActionResultReceiver;

    public HmlPromptpayEnterCodeFragment_ViewBinding(HmlPromptpayEnterCodeFragment hmlPromptpayEnterCodeFragment, View view) {
        super(hmlPromptpayEnterCodeFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlPromptpayEnterCodeFragment;
        hmlPromptpayEnterCodeFragment.aboutImg = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_about, "field 'aboutImg'", ImageView.class);
        hmlPromptpayEnterCodeFragment.firstCode = (CustomDecimalAmountVerification) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dav_first, "field 'firstCode'", CustomDecimalAmountVerification.class);
        hmlPromptpayEnterCodeFragment.secondCode = (CustomDecimalAmountVerification) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dav_second, "field 'secondCode'", CustomDecimalAmountVerification.class);
        hmlPromptpayEnterCodeFragment.thirdCode = (CustomDecimalAmountVerification) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dav_third, "field 'thirdCode'", CustomDecimalAmountVerification.class);
        hmlPromptpayEnterCodeFragment.errorText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_code_error, "field 'errorText'", TextView.class);
        hmlPromptpayEnterCodeFragment.verifyBtn = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.btn_verify, "field 'verifyBtn'", Button.class);
    }

    public final void read() {
        HmlPromptpayEnterCodeFragment hmlPromptpayEnterCodeFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlPromptpayEnterCodeFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            hmlPromptpayEnterCodeFragment.aboutImg = null;
            hmlPromptpayEnterCodeFragment.firstCode = null;
            hmlPromptpayEnterCodeFragment.secondCode = null;
            hmlPromptpayEnterCodeFragment.thirdCode = null;
            hmlPromptpayEnterCodeFragment.errorText = null;
            hmlPromptpayEnterCodeFragment.verifyBtn = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
