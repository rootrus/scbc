package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class SelectPurchaseFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private SelectPurchaseFragment write;

    public SelectPurchaseFragment_ViewBinding(final SelectPurchaseFragment selectPurchaseFragment, View view) {
        super(selectPurchaseFragment, view);
        this.write = selectPurchaseFragment;
        selectPurchaseFragment.txvPurchaseLimitText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.purchase_limit, "field 'txvPurchaseLimitText'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_done, "field 'btnDone' and method 'handleClickOfDoneButton'");
        selectPurchaseFragment.btnDone = (Button) onStart.write(IconCompatParcelizer, R.id.btn_done, "field 'btnDone'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SelectPurchaseFragment.this.handleClickOfDoneButton();
            }
        });
        selectPurchaseFragment.txvTotalAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.total_amount, "field 'txvTotalAmount'", TextView.class);
        selectPurchaseFragment.mTabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tlDeejung, "field 'mTabLayout'", TabLayout.class);
        selectPurchaseFragment.mTabPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vpDeejung, "field 'mTabPager'", ViewPager.class);
    }

    public final void read() {
        SelectPurchaseFragment selectPurchaseFragment = this.write;
        if (selectPurchaseFragment != null) {
            this.write = null;
            selectPurchaseFragment.txvPurchaseLimitText = null;
            selectPurchaseFragment.btnDone = null;
            selectPurchaseFragment.txvTotalAmount = null;
            selectPurchaseFragment.mTabLayout = null;
            selectPurchaseFragment.mTabPager = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
