package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AddAccountSelectorCustomView_ViewBinding implements Unbinder {
    private AddAccountSelectorCustomView IconCompatParcelizer;

    public AddAccountSelectorCustomView_ViewBinding(AddAccountSelectorCustomView addAccountSelectorCustomView, View view) {
        this.IconCompatParcelizer = addAccountSelectorCustomView;
        addAccountSelectorCustomView.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.selector_title_text, "field 'title'", TextView.class);
        addAccountSelectorCustomView.subTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.selector_subtitle_text, "field 'subTitle'", TextView.class);
        addAccountSelectorCustomView.selectorCheckBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.selector_check_box, "field 'selectorCheckBox'", CheckBox.class);
    }

    public final void read() {
        AddAccountSelectorCustomView addAccountSelectorCustomView = this.IconCompatParcelizer;
        if (addAccountSelectorCustomView != null) {
            this.IconCompatParcelizer = null;
            addAccountSelectorCustomView.title = null;
            addAccountSelectorCustomView.subTitle = null;
            addAccountSelectorCustomView.selectorCheckBox = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
