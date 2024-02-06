package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomDialog_ViewBinding implements Unbinder {
    private CustomDialog MediaBrowserCompat$CustomActionResultReceiver;

    public CustomDialog_ViewBinding(CustomDialog customDialog, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customDialog;
        customDialog.mTitleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_title, "field 'mTitleTextView'", TextView.class);
        customDialog.mTextTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_text, "field 'mTextTextView'", TextView.class);
        customDialog.mPositiveButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_positive_button, "field 'mPositiveButton'", Button.class);
        customDialog.mNegativeButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_negative_button, "field 'mNegativeButton'", Button.class);
        customDialog.mNeutralButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_neutral_button, "field 'mNeutralButton'", Button.class);
        customDialog.mPositiveButtonV = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_positive_button_v, "field 'mPositiveButtonV'", Button.class);
        customDialog.mNegativeButtonV = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_negative_button_v, "field 'mNegativeButtonV'", Button.class);
        customDialog.mNeutralButtonV = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_neutral_button_v, "field 'mNeutralButtonV'", Button.class);
        customDialog.mButtonHorizontalLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.buttonHorizontal, "field 'mButtonHorizontalLayout'", LinearLayout.class);
        customDialog.mButtonVerticalLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.buttonVertical, "field 'mButtonVerticalLayout'", LinearLayout.class);
    }

    public final void read() {
        CustomDialog customDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customDialog != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customDialog.mTitleTextView = null;
            customDialog.mTextTextView = null;
            customDialog.mPositiveButton = null;
            customDialog.mNegativeButton = null;
            customDialog.mNeutralButton = null;
            customDialog.mPositiveButtonV = null;
            customDialog.mNegativeButtonV = null;
            customDialog.mNeutralButtonV = null;
            customDialog.mButtonHorizontalLayout = null;
            customDialog.mButtonVerticalLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
