package com.scb.phone.view.fragment.loan;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class SmeLoanSelectorFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SmeLoanSelectorFragment write;

    public SmeLoanSelectorFragment_ViewBinding(SmeLoanSelectorFragment smeLoanSelectorFragment, View view) {
        super(smeLoanSelectorFragment, view);
        this.write = smeLoanSelectorFragment;
        smeLoanSelectorFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_pager_select_account, "field 'mViewPager'", ViewPager.class);
        smeLoanSelectorFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.circle_indicator, "field 'mCircleIndicator'", CircleIndicator.class);
    }

    public final void read() {
        SmeLoanSelectorFragment smeLoanSelectorFragment = this.write;
        if (smeLoanSelectorFragment != null) {
            this.write = null;
            smeLoanSelectorFragment.mViewPager = null;
            smeLoanSelectorFragment.mCircleIndicator = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
