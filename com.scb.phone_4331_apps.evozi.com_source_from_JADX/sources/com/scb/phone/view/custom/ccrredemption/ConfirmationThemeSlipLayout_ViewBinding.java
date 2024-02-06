package com.scb.phone.view.custom.ccrredemption;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ConfirmationThemeSlipLayout_ViewBinding implements Unbinder {
    private ConfirmationThemeSlipLayout MediaBrowserCompat$ItemReceiver;

    public ConfirmationThemeSlipLayout_ViewBinding(ConfirmationThemeSlipLayout confirmationThemeSlipLayout, View view) {
        this.MediaBrowserCompat$ItemReceiver = confirmationThemeSlipLayout;
        confirmationThemeSlipLayout.imageSlipHeader = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_slip_header, "field 'imageSlipHeader'", ImageView.class);
        confirmationThemeSlipLayout.imageSlipBorderLeft = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_slip_border_left, "field 'imageSlipBorderLeft'", ImageView.class);
        confirmationThemeSlipLayout.imageSlipBorderRight = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_slip_border_right, "field 'imageSlipBorderRight'", ImageView.class);
        confirmationThemeSlipLayout.imageSlipBottom = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_slip_bottom, "field 'imageSlipBottom'", ImageView.class);
        confirmationThemeSlipLayout.imageSlipBottomBorder = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_slip_bottom_border, "field 'imageSlipBottomBorder'", ImageView.class);
        confirmationThemeSlipLayout.slipContent = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.slip_content, "field 'slipContent'", FrameLayout.class);
    }

    public final void read() {
        ConfirmationThemeSlipLayout confirmationThemeSlipLayout = this.MediaBrowserCompat$ItemReceiver;
        if (confirmationThemeSlipLayout != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            confirmationThemeSlipLayout.imageSlipHeader = null;
            confirmationThemeSlipLayout.imageSlipBorderLeft = null;
            confirmationThemeSlipLayout.imageSlipBorderRight = null;
            confirmationThemeSlipLayout.imageSlipBottom = null;
            confirmationThemeSlipLayout.imageSlipBottomBorder = null;
            confirmationThemeSlipLayout.slipContent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
