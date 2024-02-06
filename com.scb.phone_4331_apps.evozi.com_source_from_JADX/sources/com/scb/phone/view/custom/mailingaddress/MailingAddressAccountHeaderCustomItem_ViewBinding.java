package com.scb.phone.view.custom.mailingaddress;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class MailingAddressAccountHeaderCustomItem_ViewBinding implements Unbinder {
    private MailingAddressAccountHeaderCustomItem MediaBrowserCompat$CustomActionResultReceiver;

    public MailingAddressAccountHeaderCustomItem_ViewBinding(MailingAddressAccountHeaderCustomItem mailingAddressAccountHeaderCustomItem, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = mailingAddressAccountHeaderCustomItem;
        mailingAddressAccountHeaderCustomItem.header = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_text, "field 'header'", TextView.class);
    }

    public final void read() {
        MailingAddressAccountHeaderCustomItem mailingAddressAccountHeaderCustomItem = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mailingAddressAccountHeaderCustomItem != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            mailingAddressAccountHeaderCustomItem.header = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
