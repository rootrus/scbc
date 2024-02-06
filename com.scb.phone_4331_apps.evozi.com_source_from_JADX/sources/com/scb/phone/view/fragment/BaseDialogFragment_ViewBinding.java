package com.scb.phone.view.fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class BaseDialogFragment_ViewBinding implements Unbinder {
    private BaseDialogFragment MediaBrowserCompat$ItemReceiver;

    public BaseDialogFragment_ViewBinding(BaseDialogFragment baseDialogFragment, View view) {
        this.MediaBrowserCompat$ItemReceiver = baseDialogFragment;
        baseDialogFragment.mProgress = (ViewGroup) onStart.IconCompatParcelizer(view, R.id.view_group_progress, "field 'mProgress'", ViewGroup.class);
        baseDialogFragment.mToolbar = (Toolbar) onStart.IconCompatParcelizer(view, R.id.toolbar, "field 'mToolbar'", Toolbar.class);
        baseDialogFragment.mActionBarTitle = (TextView) onStart.IconCompatParcelizer(view, R.id.title_text_view, "field 'mActionBarTitle'", TextView.class);
        baseDialogFragment.mSwipeRefreshLayout = (SwipeRefreshLayout) onStart.IconCompatParcelizer(view, R.id.swipe_refresh, "field 'mSwipeRefreshLayout'", SwipeRefreshLayout.class);
    }

    public void read() {
        BaseDialogFragment baseDialogFragment = this.MediaBrowserCompat$ItemReceiver;
        if (baseDialogFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseDialogFragment.mProgress = null;
            baseDialogFragment.mToolbar = null;
            baseDialogFragment.mActionBarTitle = null;
            baseDialogFragment.mSwipeRefreshLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
