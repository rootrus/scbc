package com.scb.phone.view.fragment.purchase;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class PurchaseFromTabSelectionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PurchaseFromTabSelectionFragment write;

    public PurchaseFromTabSelectionFragment_ViewBinding(PurchaseFromTabSelectionFragment purchaseFromTabSelectionFragment, View view) {
        super(purchaseFromTabSelectionFragment, view);
        this.write = purchaseFromTabSelectionFragment;
        purchaseFromTabSelectionFragment.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.debit_and_credit_card_view_pager, "field 'viewPager'", ViewPager.class);
        purchaseFromTabSelectionFragment.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tab_layout, "field 'tabLayout'", TabLayout.class);
    }

    public final void read() {
        PurchaseFromTabSelectionFragment purchaseFromTabSelectionFragment = this.write;
        if (purchaseFromTabSelectionFragment != null) {
            this.write = null;
            purchaseFromTabSelectionFragment.viewPager = null;
            purchaseFromTabSelectionFragment.tabLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
