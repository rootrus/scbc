package com.scb.phone.view.custom.mailingaddress;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class MailingAddressAccountDetailsCustomItem_ViewBinding implements Unbinder {
    private MailingAddressAccountDetailsCustomItem MediaBrowserCompat$ItemReceiver;

    public MailingAddressAccountDetailsCustomItem_ViewBinding(MailingAddressAccountDetailsCustomItem mailingAddressAccountDetailsCustomItem, View view) {
        this.MediaBrowserCompat$ItemReceiver = mailingAddressAccountDetailsCustomItem;
        mailingAddressAccountDetailsCustomItem.accountText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_text, "field 'accountText'", TextView.class);
        mailingAddressAccountDetailsCustomItem.accountType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.type_text, "field 'accountType'", TextView.class);
        mailingAddressAccountDetailsCustomItem.addressText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.address_text, "field 'addressText'", TextView.class);
        mailingAddressAccountDetailsCustomItem.selectorCheckBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.selector_check_box, "field 'selectorCheckBox'", CheckBox.class);
        mailingAddressAccountDetailsCustomItem.separator = onStart.IconCompatParcelizer(view, R.id.separator_view, "field 'separator'");
        mailingAddressAccountDetailsCustomItem.expandIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.expand_icon_image_view, "field 'expandIcon'", ImageView.class);
        mailingAddressAccountDetailsCustomItem.loading = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_progress, "field 'loading'", LinearLayout.class);
        mailingAddressAccountDetailsCustomItem.groupAddressDetails = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_account_address, "field 'groupAddressDetails'", Group.class);
        mailingAddressAccountDetailsCustomItem.groupAccountAddressError = (Group) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.group_account_address_error, "field 'groupAccountAddressError'", Group.class);
        mailingAddressAccountDetailsCustomItem.reloadAddress = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.reload_button, "field 'reloadAddress'", ImageView.class);
        mailingAddressAccountDetailsCustomItem.spaceSeparator = (Space) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.space_separator, "field 'spaceSeparator'", Space.class);
    }

    public final void read() {
        MailingAddressAccountDetailsCustomItem mailingAddressAccountDetailsCustomItem = this.MediaBrowserCompat$ItemReceiver;
        if (mailingAddressAccountDetailsCustomItem != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            mailingAddressAccountDetailsCustomItem.accountText = null;
            mailingAddressAccountDetailsCustomItem.accountType = null;
            mailingAddressAccountDetailsCustomItem.addressText = null;
            mailingAddressAccountDetailsCustomItem.selectorCheckBox = null;
            mailingAddressAccountDetailsCustomItem.separator = null;
            mailingAddressAccountDetailsCustomItem.expandIcon = null;
            mailingAddressAccountDetailsCustomItem.loading = null;
            mailingAddressAccountDetailsCustomItem.groupAddressDetails = null;
            mailingAddressAccountDetailsCustomItem.groupAccountAddressError = null;
            mailingAddressAccountDetailsCustomItem.reloadAddress = null;
            mailingAddressAccountDetailsCustomItem.spaceSeparator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
