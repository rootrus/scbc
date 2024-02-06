package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomInputDialog_ViewBinding implements Unbinder {
    private CustomInputDialog IconCompatParcelizer;

    public CustomInputDialog_ViewBinding(CustomInputDialog customInputDialog, View view) {
        this.IconCompatParcelizer = customInputDialog;
        customInputDialog.mTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_title, "field 'mTitleTextView'", TextView.class);
        customInputDialog.mTextTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_text, "field 'mTextTextView'", TextView.class);
        customInputDialog.mEditTextView = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_edit_text, "field 'mEditTextView'", EditText.class);
        customInputDialog.mPositiveButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_positive_button, "field 'mPositiveButton'", Button.class);
        customInputDialog.mNegativeButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_negative_button, "field 'mNegativeButton'", Button.class);
        customInputDialog.mErrorTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_text_view, "field 'mErrorTextView'", TextView.class);
    }

    public final void read() {
        CustomInputDialog customInputDialog = this.IconCompatParcelizer;
        if (customInputDialog != null) {
            this.IconCompatParcelizer = null;
            customInputDialog.mTitleTextView = null;
            customInputDialog.mTextTextView = null;
            customInputDialog.mEditTextView = null;
            customInputDialog.mPositiveButton = null;
            customInputDialog.mNegativeButton = null;
            customInputDialog.mErrorTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
