package com.scb.phone.view.custom.mailingaddress;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class MailingAddressAccountSelectorCustomItem_ViewBinding implements Unbinder {
    private MailingAddressAccountSelectorCustomItem write;

    public MailingAddressAccountSelectorCustomItem_ViewBinding(MailingAddressAccountSelectorCustomItem mailingAddressAccountSelectorCustomItem, View view) {
        this.write = mailingAddressAccountSelectorCustomItem;
        mailingAddressAccountSelectorCustomItem.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.selector_title_text, "field 'title'", TextView.class);
        mailingAddressAccountSelectorCustomItem.subTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.selector_subtitle_text, "field 'subTitle'", TextView.class);
        mailingAddressAccountSelectorCustomItem.selectorCheckBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.selector_check_box, "field 'selectorCheckBox'", CheckBox.class);
        mailingAddressAccountSelectorCustomItem.selectorLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.selector, "field 'selectorLayout'", LinearLayout.class);
    }

    public final void read() {
        MailingAddressAccountSelectorCustomItem mailingAddressAccountSelectorCustomItem = this.write;
        if (mailingAddressAccountSelectorCustomItem != null) {
            this.write = null;
            mailingAddressAccountSelectorCustomItem.title = null;
            mailingAddressAccountSelectorCustomItem.subTitle = null;
            mailingAddressAccountSelectorCustomItem.selectorCheckBox = null;
            mailingAddressAccountSelectorCustomItem.selectorLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
