package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding implements Unbinder {
    private BusinessAndMaritalInfoSpouseSelectorViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public BusinessAndMaritalInfoSpouseSelectorViewHolder_ViewBinding(BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = businessAndMaritalInfoSpouseSelectorViewHolder;
        businessAndMaritalInfoSpouseSelectorViewHolder.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_spinner_title, "field 'tvTitle'", TextView.class);
        businessAndMaritalInfoSpouseSelectorViewHolder.spinnerSpouse = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spn_spinner, "field 'spinnerSpouse'", Spinner.class);
    }

    public final void read() {
        BusinessAndMaritalInfoSpouseSelectorViewHolder businessAndMaritalInfoSpouseSelectorViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (businessAndMaritalInfoSpouseSelectorViewHolder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            businessAndMaritalInfoSpouseSelectorViewHolder.tvTitle = null;
            businessAndMaritalInfoSpouseSelectorViewHolder.spinnerSpouse = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
