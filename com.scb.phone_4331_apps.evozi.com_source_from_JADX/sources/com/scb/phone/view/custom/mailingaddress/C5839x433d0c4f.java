package com.scb.phone.view.custom.mailingaddress;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import p040o.onGetStartedClick;
import p040o.setLength;

/* renamed from: com.scb.phone.view.custom.mailingaddress.MailingAddressAccountDetailsCustomItem$MediaBrowserCompat$CustomActionResultReceiver */
final class C5839x433d0c4f implements View.OnClickListener {
    private /* synthetic */ setLength MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ MailingAddressAccountDetailsCustomItem write;

    C5839x433d0c4f(MailingAddressAccountDetailsCustomItem mailingAddressAccountDetailsCustomItem, setLength setlength) {
        this.write = mailingAddressAccountDetailsCustomItem;
        this.MediaBrowserCompat$CustomActionResultReceiver = setlength;
    }

    public final void onClick(View view) {
        Group group = this.write.groupAccountAddressError;
        if (group == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("groupAccountAddressError");
        }
        group.setVisibility(8);
        MailingAddressAccountDetailsCustomItem.MediaBrowserCompat$CustomActionResultReceiver(this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
