package com.scb.phone.view.custom.ndid;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomIdpTitleWithLabelView_ViewBinding implements Unbinder {
    private CustomIdpTitleWithLabelView write;

    public CustomIdpTitleWithLabelView_ViewBinding(CustomIdpTitleWithLabelView customIdpTitleWithLabelView, View view) {
        this.write = customIdpTitleWithLabelView;
        customIdpTitleWithLabelView.tvLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_label, "field 'tvLabel'", TextView.class);
        customIdpTitleWithLabelView.tvValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_value, "field 'tvValue'", TextView.class);
    }

    public final void read() {
        CustomIdpTitleWithLabelView customIdpTitleWithLabelView = this.write;
        if (customIdpTitleWithLabelView != null) {
            this.write = null;
            customIdpTitleWithLabelView.tvLabel = null;
            customIdpTitleWithLabelView.tvValue = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
