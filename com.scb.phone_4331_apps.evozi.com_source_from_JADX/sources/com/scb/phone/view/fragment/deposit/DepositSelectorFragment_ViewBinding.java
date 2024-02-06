package com.scb.phone.view.fragment.deposit;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class DepositSelectorFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DepositSelectorFragment IconCompatParcelizer;

    public DepositSelectorFragment_ViewBinding(DepositSelectorFragment depositSelectorFragment, View view) {
        super(depositSelectorFragment, view);
        this.IconCompatParcelizer = depositSelectorFragment;
        depositSelectorFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager_select_account, "field 'mViewPager'", ViewPager.class);
        depositSelectorFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.circle_indicator, "field 'mCircleIndicator'", CircleIndicator.class);
    }

    public final void read() {
        DepositSelectorFragment depositSelectorFragment = this.IconCompatParcelizer;
        if (depositSelectorFragment != null) {
            this.IconCompatParcelizer = null;
            depositSelectorFragment.mViewPager = null;
            depositSelectorFragment.mCircleIndicator = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
