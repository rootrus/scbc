package com.scb.phone.view.fragment.purchase;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class PurchaseDepositFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PurchaseDepositFragment MediaBrowserCompat$CustomActionResultReceiver;

    public PurchaseDepositFragment_ViewBinding(PurchaseDepositFragment purchaseDepositFragment, View view) {
        super(purchaseDepositFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = purchaseDepositFragment;
        purchaseDepositFragment.layoutNoAccount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_no_account, "field 'layoutNoAccount'", LinearLayout.class);
        purchaseDepositFragment.mViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_select_view_pager, "field 'mViewPager'", NoSwipeViewPager.class);
        purchaseDepositFragment.mIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_select_indicator, "field 'mIndicator'", CircleIndicator.class);
        purchaseDepositFragment.tvNoCardTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.no_card_text_view_title, "field 'tvNoCardTitle'", TextView.class);
    }

    public final void read() {
        PurchaseDepositFragment purchaseDepositFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (purchaseDepositFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            purchaseDepositFragment.layoutNoAccount = null;
            purchaseDepositFragment.mViewPager = null;
            purchaseDepositFragment.mIndicator = null;
            purchaseDepositFragment.tvNoCardTitle = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
