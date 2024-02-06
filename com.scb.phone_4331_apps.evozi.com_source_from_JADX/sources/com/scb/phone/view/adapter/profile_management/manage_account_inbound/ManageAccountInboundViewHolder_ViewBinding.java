package com.scb.phone.view.adapter.profile_management.manage_account_inbound;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class ManageAccountInboundViewHolder_ViewBinding implements Unbinder {
    private ManageAccountInboundViewHolder MediaBrowserCompat$CustomActionResultReceiver;

    public ManageAccountInboundViewHolder_ViewBinding(ManageAccountInboundViewHolder manageAccountInboundViewHolder, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = manageAccountInboundViewHolder;
        manageAccountInboundViewHolder.tvAccountNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_no, "field 'tvAccountNo'", TextView.class);
        manageAccountInboundViewHolder.tvAccountType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_type, "field 'tvAccountType'", TextView.class);
        manageAccountInboundViewHolder.tvNickName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_account_nickname, "field 'tvNickName'", TextView.class);
        manageAccountInboundViewHolder.toggleView = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.toggle_view, "field 'toggleView'", CheckBox.class);
    }

    public final void read() {
        ManageAccountInboundViewHolder manageAccountInboundViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (manageAccountInboundViewHolder != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            manageAccountInboundViewHolder.tvAccountNo = null;
            manageAccountInboundViewHolder.tvAccountType = null;
            manageAccountInboundViewHolder.tvNickName = null;
            manageAccountInboundViewHolder.toggleView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
