package com.scb.phone.view.custom.profilemanagement;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ReviewAccountFooterCustomView_ViewBinding implements Unbinder {
    private ReviewAccountFooterCustomView IconCompatParcelizer;

    public ReviewAccountFooterCustomView_ViewBinding(ReviewAccountFooterCustomView reviewAccountFooterCustomView, View view) {
        this.IconCompatParcelizer = reviewAccountFooterCustomView;
        reviewAccountFooterCustomView.buttonConfirm = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_confirm, "field 'buttonConfirm'", Button.class);
    }

    public final void read() {
        ReviewAccountFooterCustomView reviewAccountFooterCustomView = this.IconCompatParcelizer;
        if (reviewAccountFooterCustomView != null) {
            this.IconCompatParcelizer = null;
            reviewAccountFooterCustomView.buttonConfirm = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
