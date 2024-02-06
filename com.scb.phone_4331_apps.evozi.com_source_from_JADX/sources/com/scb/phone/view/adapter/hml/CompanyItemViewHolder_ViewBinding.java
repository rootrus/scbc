package com.scb.phone.view.adapter.hml;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class CompanyItemViewHolder_ViewBinding implements Unbinder {
    private CompanyItemViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public CompanyItemViewHolder_ViewBinding(CompanyItemViewHolder companyItemViewHolder, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = companyItemViewHolder;
        companyItemViewHolder.tvName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.occupation_description, "field 'tvName'", TextView.class);
    }

    public final void read() {
        CompanyItemViewHolder companyItemViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (companyItemViewHolder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            companyItemViewHolder.tvName = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
