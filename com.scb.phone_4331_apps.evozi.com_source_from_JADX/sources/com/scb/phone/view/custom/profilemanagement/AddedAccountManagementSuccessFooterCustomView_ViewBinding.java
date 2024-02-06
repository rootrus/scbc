package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AddedAccountManagementSuccessFooterCustomView_ViewBinding implements Unbinder {
    private AddedAccountManagementSuccessFooterCustomView write;

    public AddedAccountManagementSuccessFooterCustomView_ViewBinding(AddedAccountManagementSuccessFooterCustomView addedAccountManagementSuccessFooterCustomView, View view) {
        this.write = addedAccountManagementSuccessFooterCustomView;
        addedAccountManagementSuccessFooterCustomView.doneButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.done_button, "field 'doneButton'", Button.class);
    }

    public final void read() {
        AddedAccountManagementSuccessFooterCustomView addedAccountManagementSuccessFooterCustomView = this.write;
        if (addedAccountManagementSuccessFooterCustomView != null) {
            this.write = null;
            addedAccountManagementSuccessFooterCustomView.doneButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
