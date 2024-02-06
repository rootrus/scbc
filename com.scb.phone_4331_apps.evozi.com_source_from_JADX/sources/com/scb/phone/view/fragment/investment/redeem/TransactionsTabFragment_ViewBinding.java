package com.scb.phone.view.fragment.investment.redeem;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class TransactionsTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private TransactionsTabFragment IconCompatParcelizer;

    public TransactionsTabFragment_ViewBinding(TransactionsTabFragment transactionsTabFragment, View view) {
        super(transactionsTabFragment, view);
        this.IconCompatParcelizer = transactionsTabFragment;
        transactionsTabFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.awaiting_transactions_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        transactionsTabFragment.mShowMessages = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.investment_details_awaiting_transactions_error, "field 'mShowMessages'", TextView.class);
        transactionsTabFragment.mEmptyTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitle'", TextView.class);
        transactionsTabFragment.mEmptyDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescription'", TextView.class);
        transactionsTabFragment.mEmptyImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImage'", ImageView.class);
        transactionsTabFragment.mContainerRelativeLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mContainerRelativeLayout'", RelativeLayout.class);
        transactionsTabFragment.mEmptyCenterTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_center_text_view, "field 'mEmptyCenterTitle'", TextView.class);
    }

    public final void read() {
        TransactionsTabFragment transactionsTabFragment = this.IconCompatParcelizer;
        if (transactionsTabFragment != null) {
            this.IconCompatParcelizer = null;
            transactionsTabFragment.mRecyclerView = null;
            transactionsTabFragment.mShowMessages = null;
            transactionsTabFragment.mEmptyTitle = null;
            transactionsTabFragment.mEmptyDescription = null;
            transactionsTabFragment.mEmptyImage = null;
            transactionsTabFragment.mContainerRelativeLayout = null;
            transactionsTabFragment.mEmptyCenterTitle = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
