package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.CustomExternalSelector;
import p040o.onStart;

public final class BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding implements Unbinder {
    private BusinessAndMaritalInfoYearMonthSelectorViewHolder IconCompatParcelizer;

    public BusinessAndMaritalInfoYearMonthSelectorViewHolder_ViewBinding(BusinessAndMaritalInfoYearMonthSelectorViewHolder businessAndMaritalInfoYearMonthSelectorViewHolder, View view) {
        this.IconCompatParcelizer = businessAndMaritalInfoYearMonthSelectorViewHolder;
        businessAndMaritalInfoYearMonthSelectorViewHolder.cesSelector = (CustomExternalSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ces_selector, "field 'cesSelector'", CustomExternalSelector.class);
    }

    public final void read() {
        BusinessAndMaritalInfoYearMonthSelectorViewHolder businessAndMaritalInfoYearMonthSelectorViewHolder = this.IconCompatParcelizer;
        if (businessAndMaritalInfoYearMonthSelectorViewHolder != null) {
            this.IconCompatParcelizer = null;
            businessAndMaritalInfoYearMonthSelectorViewHolder.cesSelector = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
