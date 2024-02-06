package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AddAccountItemCustomView_ViewBinding implements Unbinder {
    private AddAccountItemCustomView MediaBrowserCompat$CustomActionResultReceiver;

    public AddAccountItemCustomView_ViewBinding(AddAccountItemCustomView addAccountItemCustomView, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = addAccountItemCustomView;
        addAccountItemCustomView.accountText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_text, "field 'accountText'", TextView.class);
        addAccountItemCustomView.accountType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.type_text, "field 'accountType'", TextView.class);
        addAccountItemCustomView.branchText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.branch_text, "field 'branchText'", TextView.class);
        addAccountItemCustomView.selectorCheckBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.selector_check_box, "field 'selectorCheckBox'", CheckBox.class);
        addAccountItemCustomView.separator = onStart.IconCompatParcelizer(view, R.id.separator_view, "field 'separator'");
    }

    public final void read() {
        AddAccountItemCustomView addAccountItemCustomView = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (addAccountItemCustomView != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            addAccountItemCustomView.accountText = null;
            addAccountItemCustomView.accountType = null;
            addAccountItemCustomView.branchText = null;
            addAccountItemCustomView.selectorCheckBox = null;
            addAccountItemCustomView.separator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
