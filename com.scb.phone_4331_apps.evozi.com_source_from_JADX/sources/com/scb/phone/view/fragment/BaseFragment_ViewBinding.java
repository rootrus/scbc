package com.scb.phone.view.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class BaseFragment_ViewBinding implements Unbinder {
    private BaseFragment MediaBrowserCompat$CustomActionResultReceiver;

    public BaseFragment_ViewBinding(BaseFragment baseFragment, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseFragment;
        baseFragment.mProgress = (ViewGroup) onStart.IconCompatParcelizer(view, R.id.view_group_progress, "field 'mProgress'", ViewGroup.class);
        baseFragment.mToolbar = (Toolbar) onStart.IconCompatParcelizer(view, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
        baseFragment.mActionBarTitle = (TextView) onStart.IconCompatParcelizer(view, R.id.title_text_view, "field 'mActionBarTitle'", TextView.class);
        baseFragment.mSwipeRefreshLayout = (SwipeRefreshLayout) onStart.IconCompatParcelizer(view, R.id.swipe_refresh, "field 'mSwipeRefreshLayout'", SwipeRefreshLayout.class);
    }

    public void read() {
        BaseFragment baseFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (baseFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            baseFragment.mProgress = null;
            baseFragment.mToolbar = null;
            baseFragment.mActionBarTitle = null;
            baseFragment.mSwipeRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
