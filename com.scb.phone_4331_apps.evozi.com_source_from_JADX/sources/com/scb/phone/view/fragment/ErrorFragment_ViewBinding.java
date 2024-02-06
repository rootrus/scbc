package com.scb.phone.view.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onStart;

public class ErrorFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ErrorFragment MediaBrowserCompat$ItemReceiver;

    public ErrorFragment_ViewBinding(ErrorFragment errorFragment, View view) {
        super(errorFragment, view);
        this.MediaBrowserCompat$ItemReceiver = errorFragment;
        errorFragment.errorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_title, "field 'errorTitle'", TextView.class);
        errorFragment.errorDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_generic_error, "field 'errorDescription'", TextView.class);
        errorFragment.errorIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_icon, "field 'errorIcon'", ImageView.class);
    }

    public final void read() {
        ErrorFragment errorFragment = this.MediaBrowserCompat$ItemReceiver;
        if (errorFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            errorFragment.errorTitle = null;
            errorFragment.errorDescription = null;
            errorFragment.errorIcon = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
