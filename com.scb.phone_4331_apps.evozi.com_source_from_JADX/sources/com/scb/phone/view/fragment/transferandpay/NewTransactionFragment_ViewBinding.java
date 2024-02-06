package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class NewTransactionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private NewTransactionFragment write;

    public NewTransactionFragment_ViewBinding(final NewTransactionFragment newTransactionFragment, View view) {
        super(newTransactionFragment, view);
        this.write = newTransactionFragment;
        newTransactionFragment.mTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.new_transaction_tab_layout, "field 'mTabLayout'", TabLayout.class);
        newTransactionFragment.mTabPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.new_transaction_view_pager, "field 'mTabPager'", NoSwipeViewPager.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.new_transfer_pay_tutorial_linear_layout, "field 'mTutorialContainer' and method 'onTutorialClicked'");
        newTransactionFragment.mTutorialContainer = (LinearLayout) onStart.write(IconCompatParcelizer, R.id.new_transfer_pay_tutorial_linear_layout, "field 'mTutorialContainer'", LinearLayout.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NewTransactionFragment.this.onTutorialClicked();
            }
        });
        newTransactionFragment.mOverlayNewTransfer = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overlay_new_transfer_tutorial_image_view, "field 'mOverlayNewTransfer'", ImageView.class);
        newTransactionFragment.mRootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root_test, "field 'mRootView'", RelativeLayout.class);
    }

    public final void read() {
        NewTransactionFragment newTransactionFragment = this.write;
        if (newTransactionFragment != null) {
            this.write = null;
            newTransactionFragment.mTabLayout = null;
            newTransactionFragment.mTabPager = null;
            newTransactionFragment.mTutorialContainer = null;
            newTransactionFragment.mOverlayNewTransfer = null;
            newTransactionFragment.mRootView = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
