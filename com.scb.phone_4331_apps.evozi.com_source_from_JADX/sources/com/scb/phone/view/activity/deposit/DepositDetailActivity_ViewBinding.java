package com.scb.phone.view.activity.deposit;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import p040o.onStart;

public class DepositDetailActivity_ViewBinding extends BaseActivity_ViewBinding {
    private DepositDetailActivity IconCompatParcelizer;

    public DepositDetailActivity_ViewBinding(DepositDetailActivity depositDetailActivity, View view) {
        super(depositDetailActivity, view);
        this.IconCompatParcelizer = depositDetailActivity;
        depositDetailActivity.scrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scroll_view, "field 'scrollView'", NestedScrollView.class);
        depositDetailActivity.rootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root, "field 'rootView'", RelativeLayout.class);
        depositDetailActivity.depositTutorialContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_tutorial_relative_layout, "field 'depositTutorialContainer'", RelativeLayout.class);
        depositDetailActivity.depositCoachMarkViewPager = (NoSwipeViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deposit_coach_mark_view_pager, "field 'depositCoachMarkViewPager'", NoSwipeViewPager.class);
    }

    public final void read() {
        DepositDetailActivity depositDetailActivity = this.IconCompatParcelizer;
        if (depositDetailActivity != null) {
            this.IconCompatParcelizer = null;
            depositDetailActivity.scrollView = null;
            depositDetailActivity.rootView = null;
            depositDetailActivity.depositTutorialContainer = null;
            depositDetailActivity.depositCoachMarkViewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
