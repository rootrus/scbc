package com.scb.phone.view.custom.mailingaddress;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class MailingAddressErrorCustomItem_ViewBinding implements Unbinder {
    private MailingAddressErrorCustomItem write;

    public MailingAddressErrorCustomItem_ViewBinding(MailingAddressErrorCustomItem mailingAddressErrorCustomItem, View view) {
        this.write = mailingAddressErrorCustomItem;
        mailingAddressErrorCustomItem.reloadButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reload_button, "field 'reloadButton'", ImageView.class);
    }

    public final void read() {
        MailingAddressErrorCustomItem mailingAddressErrorCustomItem = this.write;
        if (mailingAddressErrorCustomItem != null) {
            this.write = null;
            mailingAddressErrorCustomItem.reloadButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
