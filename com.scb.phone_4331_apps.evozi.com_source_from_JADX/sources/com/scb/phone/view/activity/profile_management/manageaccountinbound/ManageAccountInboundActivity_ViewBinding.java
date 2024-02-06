package com.scb.phone.view.activity.profile_management.manageaccountinbound;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class ManageAccountInboundActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ManageAccountInboundActivity MediaBrowserCompat$CustomActionResultReceiver;

    public ManageAccountInboundActivity_ViewBinding(ManageAccountInboundActivity manageAccountInboundActivity, View view) {
        super(manageAccountInboundActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = manageAccountInboundActivity;
        manageAccountInboundActivity.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_manage_inbound, "field 'recyclerView'", RecyclerView.class);
        manageAccountInboundActivity.errorLayout = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_layout, "field 'errorLayout'", FrameLayout.class);
    }

    public final void read() {
        ManageAccountInboundActivity manageAccountInboundActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (manageAccountInboundActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            manageAccountInboundActivity.recyclerView = null;
            manageAccountInboundActivity.errorLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
