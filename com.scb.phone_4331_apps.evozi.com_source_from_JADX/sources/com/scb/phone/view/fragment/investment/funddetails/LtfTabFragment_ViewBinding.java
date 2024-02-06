package com.scb.phone.view.fragment.investment.funddetails;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class LtfTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private LtfTabFragment MediaBrowserCompat$ItemReceiver;

    public LtfTabFragment_ViewBinding(LtfTabFragment ltfTabFragment, View view) {
        super(ltfTabFragment, view);
        this.MediaBrowserCompat$ItemReceiver = ltfTabFragment;
        ltfTabFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_details_ltf_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        ltfTabFragment.mShowMessages = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_ltf_error, "field 'mShowMessages'", TextView.class);
        ltfTabFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        ltfTabFragment.mEmptyCenterTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_center_text_view, "field 'mEmptyCenterTitle'", TextView.class);
        ltfTabFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        ltfTabFragment.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
        ltfTabFragment.mContainerRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mContainerRelativeLayout'", RelativeLayout.class);
    }

    public final void read() {
        LtfTabFragment ltfTabFragment = this.MediaBrowserCompat$ItemReceiver;
        if (ltfTabFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            ltfTabFragment.mRecyclerView = null;
            ltfTabFragment.mShowMessages = null;
            ltfTabFragment.mEmptyTitle = null;
            ltfTabFragment.mEmptyCenterTitle = null;
            ltfTabFragment.mEmptyDescription = null;
            ltfTabFragment.mEmptyImage = null;
            ltfTabFragment.mContainerRelativeLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
