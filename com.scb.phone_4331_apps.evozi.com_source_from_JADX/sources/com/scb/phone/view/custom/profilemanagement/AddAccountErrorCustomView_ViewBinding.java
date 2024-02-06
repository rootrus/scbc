package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AddAccountErrorCustomView_ViewBinding implements Unbinder {
    private AddAccountErrorCustomView write;

    public AddAccountErrorCustomView_ViewBinding(AddAccountErrorCustomView addAccountErrorCustomView, View view) {
        this.write = addAccountErrorCustomView;
        addAccountErrorCustomView.errorText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text, "field 'errorText'", TextView.class);
    }

    public final void read() {
        AddAccountErrorCustomView addAccountErrorCustomView = this.write;
        if (addAccountErrorCustomView != null) {
            this.write = null;
            addAccountErrorCustomView.errorText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
