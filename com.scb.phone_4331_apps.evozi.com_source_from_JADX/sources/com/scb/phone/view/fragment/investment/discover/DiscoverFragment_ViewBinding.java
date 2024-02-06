package com.scb.phone.view.fragment.investment.discover;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p032rd.PageIndicatorView;
import com.scb.phone.R;
import com.scb.phone.view.custom.InfiniteRecyclerView;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class DiscoverFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DiscoverFragment write;

    public DiscoverFragment_ViewBinding(DiscoverFragment discoverFragment, View view) {
        super(discoverFragment, view);
        this.write = discoverFragment;
        discoverFragment.clBanner = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.clBanner, "field 'clBanner'", ViewGroup.class);
        discoverFragment.clError = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.clError, "field 'clError'", ViewGroup.class);
        discoverFragment.layoutSearch = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layoutSearch, "field 'layoutSearch'", ViewGroup.class);
        discoverFragment.llHighlightHolder = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.llHighlightHolder, "field 'llHighlightHolder'", ViewGroup.class);
        discoverFragment.llRecommendHeader = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.llRecommendHeader, "field 'llRecommendHeader'", ViewGroup.class);
        discoverFragment.llRecommendHolder = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.llRecommendHolder, "field 'llRecommendHolder'", ViewGroup.class);
        discoverFragment.indicatorHighLightBanner = (PageIndicatorView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicatorHighLightBanner, "field 'indicatorHighLightBanner'", PageIndicatorView.class);
        discoverFragment.indicatorRecommendBanner = (PageIndicatorView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.indicatorRecommendBanner, "field 'indicatorRecommendBanner'", PageIndicatorView.class);
        discoverFragment.tvRecommendDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvRecommendDate, "field 'tvRecommendDate'", TextView.class);
        discoverFragment.vpHighLightBanner = (InfiniteRecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vpHighLightBanner, "field 'vpHighLightBanner'", InfiniteRecyclerView.class);
        discoverFragment.vpRecommendBanner = (InfiniteRecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vpRecommendBanner, "field 'vpRecommendBanner'", InfiniteRecyclerView.class);
    }

    public final void read() {
        DiscoverFragment discoverFragment = this.write;
        if (discoverFragment != null) {
            this.write = null;
            discoverFragment.clBanner = null;
            discoverFragment.clError = null;
            discoverFragment.layoutSearch = null;
            discoverFragment.llHighlightHolder = null;
            discoverFragment.llRecommendHeader = null;
            discoverFragment.llRecommendHolder = null;
            discoverFragment.indicatorHighLightBanner = null;
            discoverFragment.indicatorRecommendBanner = null;
            discoverFragment.tvRecommendDate = null;
            discoverFragment.vpHighLightBanner = null;
            discoverFragment.vpRecommendBanner = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
