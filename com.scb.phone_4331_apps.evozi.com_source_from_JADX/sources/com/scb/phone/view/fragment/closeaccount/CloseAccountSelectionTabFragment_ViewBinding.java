package com.scb.phone.view.fragment.closeaccount;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class CloseAccountSelectionTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CloseAccountSelectionTabFragment write;

    public CloseAccountSelectionTabFragment_ViewBinding(CloseAccountSelectionTabFragment closeAccountSelectionTabFragment, View view) {
        super(closeAccountSelectionTabFragment, view);
        this.write = closeAccountSelectionTabFragment;
        closeAccountSelectionTabFragment.tabLayout = (TabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.secondary_tab_layout, "field 'tabLayout'", TabLayout.class);
        closeAccountSelectionTabFragment.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.secondary_view_pager, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        CloseAccountSelectionTabFragment closeAccountSelectionTabFragment = this.write;
        if (closeAccountSelectionTabFragment != null) {
            this.write = null;
            closeAccountSelectionTabFragment.tabLayout = null;
            closeAccountSelectionTabFragment.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
