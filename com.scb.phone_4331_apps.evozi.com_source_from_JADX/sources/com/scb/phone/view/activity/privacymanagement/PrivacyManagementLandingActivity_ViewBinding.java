package com.scb.phone.view.activity.privacymanagement;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class PrivacyManagementLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private PrivacyManagementLandingActivity IconCompatParcelizer;

    public PrivacyManagementLandingActivity_ViewBinding(PrivacyManagementLandingActivity privacyManagementLandingActivity, View view) {
        super(privacyManagementLandingActivity, view);
        this.IconCompatParcelizer = privacyManagementLandingActivity;
        privacyManagementLandingActivity.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_privacy_management_landing, "field 'mRecyclerView'", RecyclerView.class);
        privacyManagementLandingActivity.mTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_privacy_management, "field 'mTextView'", TextView.class);
    }

    public final void read() {
        PrivacyManagementLandingActivity privacyManagementLandingActivity = this.IconCompatParcelizer;
        if (privacyManagementLandingActivity != null) {
            this.IconCompatParcelizer = null;
            privacyManagementLandingActivity.mRecyclerView = null;
            privacyManagementLandingActivity.mTextView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
