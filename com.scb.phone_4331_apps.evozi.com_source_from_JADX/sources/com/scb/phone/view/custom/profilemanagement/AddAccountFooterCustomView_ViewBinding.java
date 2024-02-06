package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AddAccountFooterCustomView_ViewBinding implements Unbinder {
    private AddAccountFooterCustomView write;

    public AddAccountFooterCustomView_ViewBinding(AddAccountFooterCustomView addAccountFooterCustomView, View view) {
        this.write = addAccountFooterCustomView;
        addAccountFooterCustomView.buttonContinue = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_continue, "field 'buttonContinue'", Button.class);
    }

    public final void read() {
        AddAccountFooterCustomView addAccountFooterCustomView = this.write;
        if (addAccountFooterCustomView != null) {
            this.write = null;
            addAccountFooterCustomView.buttonContinue = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
