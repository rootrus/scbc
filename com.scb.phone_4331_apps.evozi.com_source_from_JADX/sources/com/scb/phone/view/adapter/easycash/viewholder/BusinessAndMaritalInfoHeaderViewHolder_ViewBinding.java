package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import p040o.onStart;

public final class BusinessAndMaritalInfoHeaderViewHolder_ViewBinding implements Unbinder {
    private BusinessAndMaritalInfoHeaderViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public BusinessAndMaritalInfoHeaderViewHolder_ViewBinding(BusinessAndMaritalInfoHeaderViewHolder businessAndMaritalInfoHeaderViewHolder, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = businessAndMaritalInfoHeaderViewHolder;
        businessAndMaritalInfoHeaderViewHolder.tvHeader = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_header, "field 'tvHeader'", CustomEasyCashSectionLabel.class);
    }

    public final void read() {
        BusinessAndMaritalInfoHeaderViewHolder businessAndMaritalInfoHeaderViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (businessAndMaritalInfoHeaderViewHolder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            businessAndMaritalInfoHeaderViewHolder.tvHeader = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
