package com.scb.phone.view.fragment.ccsof;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class CcSofCreditCardOnlyFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CcSofCreditCardOnlyFragment MediaBrowserCompat$CustomActionResultReceiver;

    public CcSofCreditCardOnlyFragment_ViewBinding(CcSofCreditCardOnlyFragment ccSofCreditCardOnlyFragment, View view) {
        super(ccSofCreditCardOnlyFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = ccSofCreditCardOnlyFragment;
        ccSofCreditCardOnlyFragment.mSourceOfFundContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_of_fund_container, "field 'mSourceOfFundContainer'", FrameLayout.class);
        ccSofCreditCardOnlyFragment.mInputContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_container, "field 'mInputContainer'", FrameLayout.class);
        ccSofCreditCardOnlyFragment.mLayoutError = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_error, "field 'mLayoutError'", RelativeLayout.class);
        ccSofCreditCardOnlyFragment.mSourceOfFundEmptyStateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_empty_state, "field 'mSourceOfFundEmptyStateTextView'", TextView.class);
    }

    public final void read() {
        CcSofCreditCardOnlyFragment ccSofCreditCardOnlyFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (ccSofCreditCardOnlyFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            ccSofCreditCardOnlyFragment.mSourceOfFundContainer = null;
            ccSofCreditCardOnlyFragment.mInputContainer = null;
            ccSofCreditCardOnlyFragment.mLayoutError = null;
            ccSofCreditCardOnlyFragment.mSourceOfFundEmptyStateTextView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
