package com.scb.phone.view.custom.hml;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class HmlCommonCustomDialog_ViewBinding implements Unbinder {
    private HmlCommonCustomDialog write;

    public HmlCommonCustomDialog_ViewBinding(HmlCommonCustomDialog hmlCommonCustomDialog, View view) {
        this.write = hmlCommonCustomDialog;
        hmlCommonCustomDialog.titleText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'titleText'", TextView.class);
        hmlCommonCustomDialog.messageText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_message, "field 'messageText'", TextView.class);
        hmlCommonCustomDialog.positiveButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_retake, "field 'positiveButton'", Button.class);
        hmlCommonCustomDialog.negativeButton = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_proceed_button, "field 'negativeButton'", TextView.class);
        hmlCommonCustomDialog.rootView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_root, "field 'rootView'", LinearLayout.class);
    }

    public final void read() {
        HmlCommonCustomDialog hmlCommonCustomDialog = this.write;
        if (hmlCommonCustomDialog != null) {
            this.write = null;
            hmlCommonCustomDialog.titleText = null;
            hmlCommonCustomDialog.messageText = null;
            hmlCommonCustomDialog.positiveButton = null;
            hmlCommonCustomDialog.negativeButton = null;
            hmlCommonCustomDialog.rootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
