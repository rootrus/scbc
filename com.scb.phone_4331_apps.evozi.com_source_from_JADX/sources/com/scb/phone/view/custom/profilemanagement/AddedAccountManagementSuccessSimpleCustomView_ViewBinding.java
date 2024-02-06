package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class AddedAccountManagementSuccessSimpleCustomView_ViewBinding implements Unbinder {
    private AddedAccountManagementSuccessSimpleCustomView write;

    public AddedAccountManagementSuccessSimpleCustomView_ViewBinding(AddedAccountManagementSuccessSimpleCustomView addedAccountManagementSuccessSimpleCustomView, View view) {
        this.write = addedAccountManagementSuccessSimpleCustomView;
        addedAccountManagementSuccessSimpleCustomView.leftText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_left_text, "field 'leftText'", TextView.class);
    }

    public final void read() {
        AddedAccountManagementSuccessSimpleCustomView addedAccountManagementSuccessSimpleCustomView = this.write;
        if (addedAccountManagementSuccessSimpleCustomView != null) {
            this.write = null;
            addedAccountManagementSuccessSimpleCustomView.leftText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
