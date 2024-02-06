package com.scb.phone.view.activity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class BaseActivity_ViewBinding implements Unbinder {
    private BaseActivity MediaBrowserCompat$ItemReceiver;

    public BaseActivity_ViewBinding(BaseActivity baseActivity, View view) {
        this.MediaBrowserCompat$ItemReceiver = baseActivity;
        baseActivity.mProgress = (ViewGroup) onStart.IconCompatParcelizer(view, R.id.view_group_progress, "field 'mProgress'", ViewGroup.class);
        baseActivity.mToolbar = (Toolbar) onStart.IconCompatParcelizer(view, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
        baseActivity.mActionBarTitle = (TextView) onStart.IconCompatParcelizer(view, R.id.title_text_view, "field 'mActionBarTitle'", TextView.class);
        baseActivity.mSwipeRefreshLayout = (SwipeRefreshLayout) onStart.IconCompatParcelizer(view, R.id.swipe_refresh, "field 'mSwipeRefreshLayout'", SwipeRefreshLayout.class);
    }

    public void read() {
        BaseActivity baseActivity = this.MediaBrowserCompat$ItemReceiver;
        if (baseActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseActivity.mProgress = null;
            baseActivity.mToolbar = null;
            baseActivity.mActionBarTitle = null;
            baseActivity.mSwipeRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
