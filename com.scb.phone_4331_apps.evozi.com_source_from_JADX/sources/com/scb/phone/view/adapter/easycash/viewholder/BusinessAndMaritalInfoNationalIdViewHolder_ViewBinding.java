package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import p040o.onStart;

public final class BusinessAndMaritalInfoNationalIdViewHolder_ViewBinding implements Unbinder {
    private BusinessAndMaritalInfoNationalIdViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public BusinessAndMaritalInfoNationalIdViewHolder_ViewBinding(BusinessAndMaritalInfoNationalIdViewHolder businessAndMaritalInfoNationalIdViewHolder, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = businessAndMaritalInfoNationalIdViewHolder;
        businessAndMaritalInfoNationalIdViewHolder.ivgInputField = (CommonInputViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivg_business_marital_input, "field 'ivgInputField'", CommonInputViewGroup.class);
        businessAndMaritalInfoNationalIdViewHolder.paddingBottom = onStart.IconCompatParcelizer(view, R.id.view_padding_bottom, "field 'paddingBottom'");
    }

    public final void read() {
        BusinessAndMaritalInfoNationalIdViewHolder businessAndMaritalInfoNationalIdViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (businessAndMaritalInfoNationalIdViewHolder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            businessAndMaritalInfoNationalIdViewHolder.ivgInputField = null;
            businessAndMaritalInfoNationalIdViewHolder.paddingBottom = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
