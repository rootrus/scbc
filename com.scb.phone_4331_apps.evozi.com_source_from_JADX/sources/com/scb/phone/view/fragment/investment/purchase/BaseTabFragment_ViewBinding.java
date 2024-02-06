package com.scb.phone.view.fragment.investment.purchase;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class BaseTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private BaseTabFragment MediaBrowserCompat$ItemReceiver;

    public BaseTabFragment_ViewBinding(BaseTabFragment baseTabFragment, View view) {
        super(baseTabFragment, view);
        this.MediaBrowserCompat$ItemReceiver = baseTabFragment;
        baseTabFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_search_list_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        baseTabFragment.mShowMessages = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_search_list_error, "field 'mShowMessages'", TextView.class);
        baseTabFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        baseTabFragment.mEmptyCenterTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_center_text_view, "field 'mEmptyCenterTitle'", TextView.class);
        baseTabFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        baseTabFragment.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
        baseTabFragment.mContainerRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mContainerRelativeLayout'", RelativeLayout.class);
    }

    public final void read() {
        BaseTabFragment baseTabFragment = this.MediaBrowserCompat$ItemReceiver;
        if (baseTabFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            baseTabFragment.mRecyclerView = null;
            baseTabFragment.mShowMessages = null;
            baseTabFragment.mEmptyTitle = null;
            baseTabFragment.mEmptyCenterTitle = null;
            baseTabFragment.mEmptyDescription = null;
            baseTabFragment.mEmptyImage = null;
            baseTabFragment.mContainerRelativeLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
