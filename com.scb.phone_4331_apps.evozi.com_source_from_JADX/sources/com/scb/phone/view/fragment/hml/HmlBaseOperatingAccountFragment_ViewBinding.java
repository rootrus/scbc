package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class HmlBaseOperatingAccountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlBaseOperatingAccountFragment IconCompatParcelizer;

    public HmlBaseOperatingAccountFragment_ViewBinding(HmlBaseOperatingAccountFragment hmlBaseOperatingAccountFragment, View view) {
        super(hmlBaseOperatingAccountFragment, view);
        this.IconCompatParcelizer = hmlBaseOperatingAccountFragment;
        hmlBaseOperatingAccountFragment.bankLogo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_operatingaccount_logo, "field 'bankLogo'", ImageView.class);
        hmlBaseOperatingAccountFragment.bankName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_operatingaccount_bank, "field 'bankName'", TextView.class);
        hmlBaseOperatingAccountFragment.buttonsContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_operatingaccount_buttons_container, "field 'buttonsContainer'", LinearLayout.class);
        hmlBaseOperatingAccountFragment.accountEditText = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.civg_operatingaccount_account, "field 'accountEditText'", CommonInputViewGroup.class);
    }

    public final void read() {
        HmlBaseOperatingAccountFragment hmlBaseOperatingAccountFragment = this.IconCompatParcelizer;
        if (hmlBaseOperatingAccountFragment != null) {
            this.IconCompatParcelizer = null;
            hmlBaseOperatingAccountFragment.bankLogo = null;
            hmlBaseOperatingAccountFragment.bankName = null;
            hmlBaseOperatingAccountFragment.buttonsContainer = null;
            hmlBaseOperatingAccountFragment.accountEditText = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
