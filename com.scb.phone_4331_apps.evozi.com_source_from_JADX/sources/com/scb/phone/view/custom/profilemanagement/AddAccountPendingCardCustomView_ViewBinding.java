package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AddAccountPendingCardCustomView_ViewBinding implements Unbinder {
    private AddAccountPendingCardCustomView MediaBrowserCompat$CustomActionResultReceiver;

    public AddAccountPendingCardCustomView_ViewBinding(AddAccountPendingCardCustomView addAccountPendingCardCustomView, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = addAccountPendingCardCustomView;
        addAccountPendingCardCustomView.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pending_card_title, "field 'title'", TextView.class);
        addAccountPendingCardCustomView.subTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pending_card_subtitle, "field 'subTitle'", TextView.class);
        addAccountPendingCardCustomView.buttonActivate = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.activate_button, "field 'buttonActivate'", Button.class);
        addAccountPendingCardCustomView.separator = onStart.IconCompatParcelizer(view, R.id.separator_view, "field 'separator'");
    }

    public final void read() {
        AddAccountPendingCardCustomView addAccountPendingCardCustomView = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (addAccountPendingCardCustomView != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            addAccountPendingCardCustomView.title = null;
            addAccountPendingCardCustomView.subTitle = null;
            addAccountPendingCardCustomView.buttonActivate = null;
            addAccountPendingCardCustomView.separator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
