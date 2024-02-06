package com.scb.phone.view.adapter.creditcardpurchase;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class TenureViewHolder_ViewBinding implements Unbinder {
    private TenureViewHolder MediaBrowserCompat$ItemReceiver;

    public TenureViewHolder_ViewBinding(TenureViewHolder tenureViewHolder, View view) {
        this.MediaBrowserCompat$ItemReceiver = tenureViewHolder;
        tenureViewHolder.tvTenure = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_month_text, "field 'tvTenure'", TextView.class);
        tenureViewHolder.rlContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container, "field 'rlContainer'", RelativeLayout.class);
    }

    public final void read() {
        TenureViewHolder tenureViewHolder = this.MediaBrowserCompat$ItemReceiver;
        if (tenureViewHolder != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            tenureViewHolder.tvTenure = null;
            tenureViewHolder.rlContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
