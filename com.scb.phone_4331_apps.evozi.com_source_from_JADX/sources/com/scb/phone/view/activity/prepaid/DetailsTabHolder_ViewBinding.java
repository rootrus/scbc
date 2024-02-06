package com.scb.phone.view.activity.prepaid;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class DetailsTabHolder_ViewBinding implements Unbinder {
    private DetailsTabHolder MediaBrowserCompat$ItemReceiver;

    public DetailsTabHolder_ViewBinding(DetailsTabHolder detailsTabHolder, View view) {
        this.MediaBrowserCompat$ItemReceiver = detailsTabHolder;
        detailsTabHolder.mRecyclerViewPrepaid = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_transactions, "field 'mRecyclerViewPrepaid'", RecyclerView.class);
        detailsTabHolder.mTextMessagePrepaid = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_message, "field 'mTextMessagePrepaid'", TextView.class);
        detailsTabHolder.mToolbarTxnPrepaid = (Toolbar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.toolbar_txn_header, "field 'mToolbarTxnPrepaid'", Toolbar.class);
        detailsTabHolder.mTextTxnPrepaid = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_header, "field 'mTextTxnPrepaid'", TextView.class);
        detailsTabHolder.mTextTxnMonthPrepaid = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_month_header, "field 'mTextTxnMonthPrepaid'", TextView.class);
        detailsTabHolder.mEmptyTitlePrepaid = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_title_text_view, "field 'mEmptyTitlePrepaid'", TextView.class);
        detailsTabHolder.mEmptyDescriptionPrepaid = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_description_text_view, "field 'mEmptyDescriptionPrepaid'", TextView.class);
        detailsTabHolder.mEmptyImagePrepaid = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_button_image_view, "field 'mEmptyImagePrepaid'", ImageView.class);
        detailsTabHolder.mEmptyCard = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_container_relative_layout, "field 'mEmptyCard'", RelativeLayout.class);
        detailsTabHolder.mLoadingView = onStart.IconCompatParcelizer(view, R.id.view_group_progress, "field 'mLoadingView'");
        detailsTabHolder.customError = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_error, "field 'customError'", LinearLayout.class);
    }

    public final void read() {
        DetailsTabHolder detailsTabHolder = this.MediaBrowserCompat$ItemReceiver;
        if (detailsTabHolder != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            detailsTabHolder.mRecyclerViewPrepaid = null;
            detailsTabHolder.mTextMessagePrepaid = null;
            detailsTabHolder.mToolbarTxnPrepaid = null;
            detailsTabHolder.mTextTxnPrepaid = null;
            detailsTabHolder.mTextTxnMonthPrepaid = null;
            detailsTabHolder.mEmptyTitlePrepaid = null;
            detailsTabHolder.mEmptyDescriptionPrepaid = null;
            detailsTabHolder.mEmptyImagePrepaid = null;
            detailsTabHolder.mEmptyCard = null;
            detailsTabHolder.mLoadingView = null;
            detailsTabHolder.customError = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
