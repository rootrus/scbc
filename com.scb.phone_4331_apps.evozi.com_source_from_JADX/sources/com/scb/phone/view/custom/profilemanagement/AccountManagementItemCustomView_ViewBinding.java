package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomNoteEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.onStart;

public class AccountManagementItemCustomView_ViewBinding implements Unbinder {
    private AccountManagementItemCustomView MediaBrowserCompat$ItemReceiver;

    public AccountManagementItemCustomView_ViewBinding(AccountManagementItemCustomView accountManagementItemCustomView, View view) {
        this.MediaBrowserCompat$ItemReceiver = accountManagementItemCustomView;
        accountManagementItemCustomView.accountNoText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_no_text, "field 'accountNoText'", TextView.class);
        accountManagementItemCustomView.accountTypeText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_type_text, "field 'accountTypeText'", TextView.class);
        accountManagementItemCustomView.accountNicknameText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_nickname_text, "field 'accountNicknameText'", TextView.class);
        accountManagementItemCustomView.editButtons = onStart.IconCompatParcelizer(view, R.id.button_layout, "field 'editButtons'");
        accountManagementItemCustomView.editField = onStart.IconCompatParcelizer(view, R.id.edit_layout, "field 'editField'");
        accountManagementItemCustomView.editButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_button, "field 'editButton'", ImageView.class);
        accountManagementItemCustomView.deleteButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.delete_button, "field 'deleteButton'", ImageView.class);
        accountManagementItemCustomView.deleteSCBSButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.delete_scbs_button, "field 'deleteSCBSButton'", ImageView.class);
        accountManagementItemCustomView.doneButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.done_button, "field 'doneButton'", DefaultButton.class);
        accountManagementItemCustomView.editClearButton = (ImageButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_clear, "field 'editClearButton'", ImageButton.class);
        accountManagementItemCustomView.separator = onStart.IconCompatParcelizer(view, R.id.top_separator, "field 'separator'");
        accountManagementItemCustomView.editText = (CustomNoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_input, "field 'editText'", CustomNoteEditText.class);
        accountManagementItemCustomView.mErrorText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'mErrorText'", TextView.class);
    }

    public final void read() {
        AccountManagementItemCustomView accountManagementItemCustomView = this.MediaBrowserCompat$ItemReceiver;
        if (accountManagementItemCustomView != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            accountManagementItemCustomView.accountNoText = null;
            accountManagementItemCustomView.accountTypeText = null;
            accountManagementItemCustomView.accountNicknameText = null;
            accountManagementItemCustomView.editButtons = null;
            accountManagementItemCustomView.editField = null;
            accountManagementItemCustomView.editButton = null;
            accountManagementItemCustomView.deleteButton = null;
            accountManagementItemCustomView.deleteSCBSButton = null;
            accountManagementItemCustomView.doneButton = null;
            accountManagementItemCustomView.editClearButton = null;
            accountManagementItemCustomView.separator = null;
            accountManagementItemCustomView.editText = null;
            accountManagementItemCustomView.mErrorText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
