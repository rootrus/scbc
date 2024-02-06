package com.scb.phone.view.fragment.investment.funddetails;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DividendTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DividendTabFragment write;

    public DividendTabFragment_ViewBinding(DividendTabFragment dividendTabFragment, View view) {
        super(dividendTabFragment, view);
        this.write = dividendTabFragment;
        dividendTabFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_details_dividend_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        dividendTabFragment.mShowMessages = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fund_dividend_error, "field 'mShowMessages'", TextView.class);
        dividendTabFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        dividendTabFragment.mEmptyCenterTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_center_text_view, "field 'mEmptyCenterTitle'", TextView.class);
        dividendTabFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        dividendTabFragment.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
        dividendTabFragment.mContainerRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mContainerRelativeLayout'", RelativeLayout.class);
    }

    public final void read() {
        DividendTabFragment dividendTabFragment = this.write;
        if (dividendTabFragment != null) {
            this.write = null;
            dividendTabFragment.mRecyclerView = null;
            dividendTabFragment.mShowMessages = null;
            dividendTabFragment.mEmptyTitle = null;
            dividendTabFragment.mEmptyCenterTitle = null;
            dividendTabFragment.mEmptyDescription = null;
            dividendTabFragment.mEmptyImage = null;
            dividendTabFragment.mContainerRelativeLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
