package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BillPaymentTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BillPaymentTabFragment IconCompatParcelizer;

    public BillPaymentTabFragment_ViewBinding(BillPaymentTabFragment billPaymentTabFragment, View view) {
        super(billPaymentTabFragment, view);
        this.IconCompatParcelizer = billPaymentTabFragment;
        billPaymentTabFragment.billPaymentTabNestedScrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_payment_tab_nested_scrollview, "field 'billPaymentTabNestedScrollView'", NestedScrollView.class);
        billPaymentTabFragment.fragmentContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fragment_container_bill_payment_tabs, "field 'fragmentContainer'", FrameLayout.class);
        billPaymentTabFragment.banner = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.banner_text_view, "field 'banner'", TextView.class);
    }

    public final void read() {
        BillPaymentTabFragment billPaymentTabFragment = this.IconCompatParcelizer;
        if (billPaymentTabFragment != null) {
            this.IconCompatParcelizer = null;
            billPaymentTabFragment.billPaymentTabNestedScrollView = null;
            billPaymentTabFragment.fragmentContainer = null;
            billPaymentTabFragment.banner = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
