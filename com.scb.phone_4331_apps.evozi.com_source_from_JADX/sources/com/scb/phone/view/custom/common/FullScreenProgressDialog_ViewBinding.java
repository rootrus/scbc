package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class FullScreenProgressDialog_ViewBinding implements Unbinder {
    private FullScreenProgressDialog MediaBrowserCompat$CustomActionResultReceiver;

    public FullScreenProgressDialog_ViewBinding(FullScreenProgressDialog fullScreenProgressDialog, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fullScreenProgressDialog;
        fullScreenProgressDialog.animationView = (CustomViewProgressAnimationFull) onStart.IconCompatParcelizer(view, R.id.animation_view, "field 'animationView'", CustomViewProgressAnimationFull.class);
        fullScreenProgressDialog.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'title'", TextView.class);
        fullScreenProgressDialog.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text_view, "field 'description'", TextView.class);
    }

    public final void read() {
        FullScreenProgressDialog fullScreenProgressDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fullScreenProgressDialog != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            fullScreenProgressDialog.animationView = null;
            fullScreenProgressDialog.title = null;
            fullScreenProgressDialog.description = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
