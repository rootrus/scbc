package com.scb.phone.view.activity.privacymanagement;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class PrivacyManagementLandingViewHolder_ViewBinding implements Unbinder {
    private PrivacyManagementLandingViewHolder IconCompatParcelizer;

    public PrivacyManagementLandingViewHolder_ViewBinding(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, View view) {
        this.IconCompatParcelizer = privacyManagementLandingViewHolder;
        privacyManagementLandingViewHolder.label = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_privacy_label, "field 'label'", TextView.class);
    }

    public final void read() {
        PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder = this.IconCompatParcelizer;
        if (privacyManagementLandingViewHolder != null) {
            this.IconCompatParcelizer = null;
            privacyManagementLandingViewHolder.label = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
