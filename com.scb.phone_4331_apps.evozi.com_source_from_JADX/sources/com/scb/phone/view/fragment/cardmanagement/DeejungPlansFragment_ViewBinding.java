package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DeejungPlansFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DeejungPlansFragment write;

    public DeejungPlansFragment_ViewBinding(DeejungPlansFragment deejungPlansFragment, View view) {
        super(deejungPlansFragment, view);
        this.write = deejungPlansFragment;
        deejungPlansFragment.plansHorizontalScrollView = (HorizontalScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.plans_months_horizontal_scroll, "field 'plansHorizontalScrollView'", HorizontalScrollView.class);
        deejungPlansFragment.plansView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_months, "field 'plansView'", LinearLayout.class);
        deejungPlansFragment.viewPager = (FragmentWrapContentViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.plans_selected_view_pager, "field 'viewPager'", FragmentWrapContentViewPager.class);
    }

    public final void read() {
        DeejungPlansFragment deejungPlansFragment = this.write;
        if (deejungPlansFragment != null) {
            this.write = null;
            deejungPlansFragment.plansHorizontalScrollView = null;
            deejungPlansFragment.plansView = null;
            deejungPlansFragment.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
