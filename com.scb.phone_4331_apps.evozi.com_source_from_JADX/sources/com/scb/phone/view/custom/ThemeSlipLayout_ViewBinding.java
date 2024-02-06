package com.scb.phone.view.custom;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ThemeSlipLayout_ViewBinding implements Unbinder {
    private ThemeSlipLayout MediaBrowserCompat$ItemReceiver;

    public ThemeSlipLayout_ViewBinding(ThemeSlipLayout themeSlipLayout, View view) {
        this.MediaBrowserCompat$ItemReceiver = themeSlipLayout;
        themeSlipLayout.imageSlipHeader = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_slip_header, "field 'imageSlipHeader'", ImageView.class);
        themeSlipLayout.slipContent = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.slip_content, "field 'slipContent'", FrameLayout.class);
        themeSlipLayout.imageSlipBorderLeft = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_slip_border_left, "field 'imageSlipBorderLeft'", ImageView.class);
        themeSlipLayout.imageSlipBorderRight = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_slip_border_right, "field 'imageSlipBorderRight'", ImageView.class);
        themeSlipLayout.imageSlipBottom = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_slip_bottom, "field 'imageSlipBottom'", ImageView.class);
        themeSlipLayout.imageSlipBottomBorder = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_slip_bottom_border, "field 'imageSlipBottomBorder'", ImageView.class);
    }

    public final void read() {
        ThemeSlipLayout themeSlipLayout = this.MediaBrowserCompat$ItemReceiver;
        if (themeSlipLayout != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            themeSlipLayout.imageSlipHeader = null;
            themeSlipLayout.slipContent = null;
            themeSlipLayout.imageSlipBorderLeft = null;
            themeSlipLayout.imageSlipBorderRight = null;
            themeSlipLayout.imageSlipBottom = null;
            themeSlipLayout.imageSlipBottomBorder = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
