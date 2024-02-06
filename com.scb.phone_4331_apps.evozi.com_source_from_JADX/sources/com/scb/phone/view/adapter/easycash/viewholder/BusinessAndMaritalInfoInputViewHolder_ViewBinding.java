package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.onStart;

public final class BusinessAndMaritalInfoInputViewHolder_ViewBinding implements Unbinder {
    private BusinessAndMaritalInfoInputViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public BusinessAndMaritalInfoInputViewHolder_ViewBinding(BusinessAndMaritalInfoInputViewHolder businessAndMaritalInfoInputViewHolder, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = businessAndMaritalInfoInputViewHolder;
        businessAndMaritalInfoInputViewHolder.ivgInputField = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_business_marital_input, "field 'ivgInputField'", CommonInputViewGroup.class);
        businessAndMaritalInfoInputViewHolder.paddingBottom = onStart.IconCompatParcelizer(view, R.id.view_padding_bottom, "field 'paddingBottom'");
    }

    public final void read() {
        BusinessAndMaritalInfoInputViewHolder businessAndMaritalInfoInputViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (businessAndMaritalInfoInputViewHolder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            businessAndMaritalInfoInputViewHolder.ivgInputField = null;
            businessAndMaritalInfoInputViewHolder.paddingBottom = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
