package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomNoteEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.onStart;

public class AddedAccountManagementSuccessItemCustomView_ViewBinding implements Unbinder {
    private AddedAccountManagementSuccessItemCustomView MediaBrowserCompat$CustomActionResultReceiver;

    public AddedAccountManagementSuccessItemCustomView_ViewBinding(AddedAccountManagementSuccessItemCustomView addedAccountManagementSuccessItemCustomView, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = addedAccountManagementSuccessItemCustomView;
        addedAccountManagementSuccessItemCustomView.accountNoText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_no_text, "field 'accountNoText'", TextView.class);
        addedAccountManagementSuccessItemCustomView.accountTypeText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_type_text, "field 'accountTypeText'", TextView.class);
        addedAccountManagementSuccessItemCustomView.accountNicknameText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_nickname_text, "field 'accountNicknameText'", TextView.class);
        addedAccountManagementSuccessItemCustomView.editButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_button, "field 'editButton'", Button.class);
        addedAccountManagementSuccessItemCustomView.doneButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.done_button, "field 'doneButton'", DefaultButton.class);
        addedAccountManagementSuccessItemCustomView.editClearButton = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_clear, "field 'editClearButton'", ImageButton.class);
        addedAccountManagementSuccessItemCustomView.editText = (CustomNoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_input, "field 'editText'", CustomNoteEditText.class);
        addedAccountManagementSuccessItemCustomView.mErrorText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'mErrorText'", TextView.class);
    }

    public final void read() {
        AddedAccountManagementSuccessItemCustomView addedAccountManagementSuccessItemCustomView = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (addedAccountManagementSuccessItemCustomView != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            addedAccountManagementSuccessItemCustomView.accountNoText = null;
            addedAccountManagementSuccessItemCustomView.accountTypeText = null;
            addedAccountManagementSuccessItemCustomView.accountNicknameText = null;
            addedAccountManagementSuccessItemCustomView.editButton = null;
            addedAccountManagementSuccessItemCustomView.doneButton = null;
            addedAccountManagementSuccessItemCustomView.editClearButton = null;
            addedAccountManagementSuccessItemCustomView.editText = null;
            addedAccountManagementSuccessItemCustomView.mErrorText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
