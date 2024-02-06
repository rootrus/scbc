package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AccountManagementFooterCustomView_ViewBinding implements Unbinder {
    private AccountManagementFooterCustomView MediaBrowserCompat$CustomActionResultReceiver;

    public AccountManagementFooterCustomView_ViewBinding(AccountManagementFooterCustomView accountManagementFooterCustomView, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = accountManagementFooterCustomView;
        accountManagementFooterCustomView.doneButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.done_button, "field 'doneButton'", Button.class);
    }

    public final void read() {
        AccountManagementFooterCustomView accountManagementFooterCustomView = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (accountManagementFooterCustomView != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            accountManagementFooterCustomView.doneButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
