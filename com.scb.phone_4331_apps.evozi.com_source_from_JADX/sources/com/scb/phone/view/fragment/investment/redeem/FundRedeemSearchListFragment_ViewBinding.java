package com.scb.phone.view.fragment.investment.redeem;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class FundRedeemSearchListFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FundRedeemSearchListFragment MediaBrowserCompat$ItemReceiver;

    public FundRedeemSearchListFragment_ViewBinding(FundRedeemSearchListFragment fundRedeemSearchListFragment, View view) {
        super(fundRedeemSearchListFragment, view);
        this.MediaBrowserCompat$ItemReceiver = fundRedeemSearchListFragment;
        fundRedeemSearchListFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_search_list_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        fundRedeemSearchListFragment.mShowMessages = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_search_list_error, "field 'mShowMessages'", TextView.class);
        fundRedeemSearchListFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        fundRedeemSearchListFragment.mEmptyCenterTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_center_text_view, "field 'mEmptyCenterTitle'", TextView.class);
        fundRedeemSearchListFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        fundRedeemSearchListFragment.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
        fundRedeemSearchListFragment.mContainerRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mContainerRelativeLayout'", RelativeLayout.class);
    }

    public final void read() {
        FundRedeemSearchListFragment fundRedeemSearchListFragment = this.MediaBrowserCompat$ItemReceiver;
        if (fundRedeemSearchListFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            fundRedeemSearchListFragment.mRecyclerView = null;
            fundRedeemSearchListFragment.mShowMessages = null;
            fundRedeemSearchListFragment.mEmptyTitle = null;
            fundRedeemSearchListFragment.mEmptyCenterTitle = null;
            fundRedeemSearchListFragment.mEmptyDescription = null;
            fundRedeemSearchListFragment.mEmptyImage = null;
            fundRedeemSearchListFragment.mContainerRelativeLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
