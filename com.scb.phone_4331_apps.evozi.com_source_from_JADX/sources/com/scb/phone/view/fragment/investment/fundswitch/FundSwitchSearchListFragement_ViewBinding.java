package com.scb.phone.view.fragment.investment.fundswitch;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class FundSwitchSearchListFragement_ViewBinding extends BaseFragment_ViewBinding {
    private FundSwitchSearchListFragement write;

    public FundSwitchSearchListFragement_ViewBinding(FundSwitchSearchListFragement fundSwitchSearchListFragement, View view) {
        super(fundSwitchSearchListFragement, view);
        this.write = fundSwitchSearchListFragement;
        fundSwitchSearchListFragement.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_search_list_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        fundSwitchSearchListFragement.mShowMessages = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_search_list_error, "field 'mShowMessages'", TextView.class);
        fundSwitchSearchListFragement.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        fundSwitchSearchListFragement.mEmptyCenterTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_center_text_view, "field 'mEmptyCenterTitle'", TextView.class);
        fundSwitchSearchListFragement.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        fundSwitchSearchListFragement.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
        fundSwitchSearchListFragement.mContainerRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mContainerRelativeLayout'", RelativeLayout.class);
    }

    public final void read() {
        FundSwitchSearchListFragement fundSwitchSearchListFragement = this.write;
        if (fundSwitchSearchListFragement != null) {
            this.write = null;
            fundSwitchSearchListFragement.mRecyclerView = null;
            fundSwitchSearchListFragement.mShowMessages = null;
            fundSwitchSearchListFragement.mEmptyTitle = null;
            fundSwitchSearchListFragement.mEmptyCenterTitle = null;
            fundSwitchSearchListFragement.mEmptyDescription = null;
            fundSwitchSearchListFragement.mEmptyImage = null;
            fundSwitchSearchListFragement.mContainerRelativeLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
