package com.scb.phone.view.activity.ccrredemption.product;

import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class QuantitySelectionActivity_ViewBinding extends BaseActivity_ViewBinding {
    private QuantitySelectionActivity write;

    public QuantitySelectionActivity_ViewBinding(QuantitySelectionActivity quantitySelectionActivity, View view) {
        super(quantitySelectionActivity, view);
        this.write = quantitySelectionActivity;
        quantitySelectionActivity.txvRewardPoints = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_points, "field 'txvRewardPoints'", TextView.class);
        quantitySelectionActivity.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tab_layout, "field 'tabLayout'", TabLayout.class);
        quantitySelectionActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager_quantity_selection, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        QuantitySelectionActivity quantitySelectionActivity = this.write;
        if (quantitySelectionActivity != null) {
            this.write = null;
            quantitySelectionActivity.txvRewardPoints = null;
            quantitySelectionActivity.tabLayout = null;
            quantitySelectionActivity.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
