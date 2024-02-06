package com.scb.phone.view.fragment.donations;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class DonationsLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DonationsLandingFragment MediaBrowserCompat$CustomActionResultReceiver;

    public DonationsLandingFragment_ViewBinding(DonationsLandingFragment donationsLandingFragment, View view) {
        super(donationsLandingFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = donationsLandingFragment;
        donationsLandingFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_view_pager, "field 'mViewPager'", ViewPager.class);
        donationsLandingFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        donationsLandingFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
    }

    public final void read() {
        DonationsLandingFragment donationsLandingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (donationsLandingFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            donationsLandingFragment.mViewPager = null;
            donationsLandingFragment.mCircleIndicator = null;
            donationsLandingFragment.mRecyclerView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
