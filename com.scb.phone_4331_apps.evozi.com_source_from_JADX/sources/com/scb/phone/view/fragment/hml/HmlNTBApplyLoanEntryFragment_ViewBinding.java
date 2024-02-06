package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class HmlNTBApplyLoanEntryFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlNTBApplyLoanEntryFragment write;

    public HmlNTBApplyLoanEntryFragment_ViewBinding(HmlNTBApplyLoanEntryFragment hmlNTBApplyLoanEntryFragment, View view) {
        super(hmlNTBApplyLoanEntryFragment, view);
        this.write = hmlNTBApplyLoanEntryFragment;
        hmlNTBApplyLoanEntryFragment.descriptionTv = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ntb_apply_loan_entry_description_tv, "field 'descriptionTv'", TextView.class);
        hmlNTBApplyLoanEntryFragment.imageIv = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ntb_apply_loan_entry_iv, "field 'imageIv'", ImageView.class);
        hmlNTBApplyLoanEntryFragment.buttonListLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ntb_apply_loan_entry_personal_button_ll_layout, "field 'buttonListLinearLayout'", LinearLayout.class);
    }

    public final void read() {
        HmlNTBApplyLoanEntryFragment hmlNTBApplyLoanEntryFragment = this.write;
        if (hmlNTBApplyLoanEntryFragment != null) {
            this.write = null;
            hmlNTBApplyLoanEntryFragment.descriptionTv = null;
            hmlNTBApplyLoanEntryFragment.imageIv = null;
            hmlNTBApplyLoanEntryFragment.buttonListLinearLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
