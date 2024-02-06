package com.scb.phone.view.adapter.ccrredemption.product;

import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class PaginationViewFooterHolder_ViewBinding implements Unbinder {
    private PaginationViewFooterHolder MediaBrowserCompat$ItemReceiver;

    public PaginationViewFooterHolder_ViewBinding(PaginationViewFooterHolder paginationViewFooterHolder, View view) {
        this.MediaBrowserCompat$ItemReceiver = paginationViewFooterHolder;
        paginationViewFooterHolder.paginationStatusView = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pagination_status_view, "field 'paginationStatusView'", ViewGroup.class);
        paginationViewFooterHolder.inlineLoader = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_progress, "field 'inlineLoader'", ViewGroup.class);
        paginationViewFooterHolder.tapToRetryView = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tap_to_retry, "field 'tapToRetryView'", ViewGroup.class);
    }

    public final void read() {
        PaginationViewFooterHolder paginationViewFooterHolder = this.MediaBrowserCompat$ItemReceiver;
        if (paginationViewFooterHolder != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            paginationViewFooterHolder.paginationStatusView = null;
            paginationViewFooterHolder.inlineLoader = null;
            paginationViewFooterHolder.tapToRetryView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
