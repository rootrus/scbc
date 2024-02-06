package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AddAccountSubheaderCustomView_ViewBinding implements Unbinder {
    private AddAccountSubheaderCustomView IconCompatParcelizer;

    public AddAccountSubheaderCustomView_ViewBinding(AddAccountSubheaderCustomView addAccountSubheaderCustomView, View view) {
        this.IconCompatParcelizer = addAccountSubheaderCustomView;
        addAccountSubheaderCustomView.header = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_text, "field 'header'", TextView.class);
    }

    public final void read() {
        AddAccountSubheaderCustomView addAccountSubheaderCustomView = this.IconCompatParcelizer;
        if (addAccountSubheaderCustomView != null) {
            this.IconCompatParcelizer = null;
            addAccountSubheaderCustomView.header = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
