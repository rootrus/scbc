package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class CreditLimitDisplayFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CreditLimitDisplayFragment MediaBrowserCompat$ItemReceiver;

    public CreditLimitDisplayFragment_ViewBinding(CreditLimitDisplayFragment creditLimitDisplayFragment, View view) {
        super(creditLimitDisplayFragment, view);
        this.MediaBrowserCompat$ItemReceiver = creditLimitDisplayFragment;
        creditLimitDisplayFragment.mCustomHorizontalProgressBar = (CustomHorizontalProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_horizontal_progress, "field 'mCustomHorizontalProgressBar'", CustomHorizontalProgressBar.class);
    }

    public final void read() {
        CreditLimitDisplayFragment creditLimitDisplayFragment = this.MediaBrowserCompat$ItemReceiver;
        if (creditLimitDisplayFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            creditLimitDisplayFragment.mCustomHorizontalProgressBar = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
