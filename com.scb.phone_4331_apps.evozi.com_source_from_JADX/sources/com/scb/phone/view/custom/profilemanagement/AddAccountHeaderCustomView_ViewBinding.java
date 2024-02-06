package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AddAccountHeaderCustomView_ViewBinding implements Unbinder {
    private AddAccountHeaderCustomView write;

    public AddAccountHeaderCustomView_ViewBinding(AddAccountHeaderCustomView addAccountHeaderCustomView, View view) {
        this.write = addAccountHeaderCustomView;
        addAccountHeaderCustomView.header = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_text, "field 'header'", TextView.class);
    }

    public final void read() {
        AddAccountHeaderCustomView addAccountHeaderCustomView = this.write;
        if (addAccountHeaderCustomView != null) {
            this.write = null;
            addAccountHeaderCustomView.header = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
