package com.scb.phone.view.fragment.accountsummary;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class BaseCardFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseCardFragment IconCompatParcelizer;

    public BaseCardFragment_ViewBinding(BaseCardFragment baseCardFragment, View view) {
        super(baseCardFragment, view);
        this.IconCompatParcelizer = baseCardFragment;
        baseCardFragment.mViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_view_pager, "field 'mViewPager'", ViewPager.class);
        baseCardFragment.mCircleIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicator, "field 'mCircleIndicator'", CircleIndicator.class);
        baseCardFragment.mParentLayout = (RelativeLayout) onStart.IconCompatParcelizer(view, R.id.parent_relative_layout, "field 'mParentLayout'", RelativeLayout.class);
        baseCardFragment.bannerContainer = (FrameLayout) onStart.IconCompatParcelizer(view, R.id.banner_container, "field 'bannerContainer'", FrameLayout.class);
    }

    public void read() {
        BaseCardFragment baseCardFragment = this.IconCompatParcelizer;
        if (baseCardFragment != null) {
            this.IconCompatParcelizer = null;
            baseCardFragment.mViewPager = null;
            baseCardFragment.mCircleIndicator = null;
            baseCardFragment.mParentLayout = null;
            baseCardFragment.bannerContainer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
