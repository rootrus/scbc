package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomDisclosureCell_ViewBinding implements Unbinder {
    private CustomDisclosureCell MediaBrowserCompat$CustomActionResultReceiver;

    public CustomDisclosureCell_ViewBinding(CustomDisclosureCell customDisclosureCell, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customDisclosureCell;
        customDisclosureCell.text = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_cell_text_view, "field 'text'", TextView.class);
        customDisclosureCell.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_cell_icon_image_view, "field 'icon'", ImageView.class);
        customDisclosureCell.divider = onStart.IconCompatParcelizer(view, R.id.custom_cell_divider, "field 'divider'");
        customDisclosureCell.ripple = onStart.IconCompatParcelizer(view, R.id.custom_cell_ripple, "field 'ripple'");
    }

    public final void read() {
        CustomDisclosureCell customDisclosureCell = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customDisclosureCell != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customDisclosureCell.text = null;
            customDisclosureCell.icon = null;
            customDisclosureCell.divider = null;
            customDisclosureCell.ripple = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
