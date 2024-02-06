package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AccountManagementHeaderCustomView_ViewBinding implements Unbinder {
    private AccountManagementHeaderCustomView write;

    public AccountManagementHeaderCustomView_ViewBinding(AccountManagementHeaderCustomView accountManagementHeaderCustomView, View view) {
        this.write = accountManagementHeaderCustomView;
        accountManagementHeaderCustomView.header = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_text, "field 'header'", TextView.class);
    }

    public final void read() {
        AccountManagementHeaderCustomView accountManagementHeaderCustomView = this.write;
        if (accountManagementHeaderCustomView != null) {
            this.write = null;
            accountManagementHeaderCustomView.header = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
