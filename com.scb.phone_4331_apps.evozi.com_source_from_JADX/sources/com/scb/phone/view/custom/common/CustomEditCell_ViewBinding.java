package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomEditCell_ViewBinding implements Unbinder {
    private CustomEditCell IconCompatParcelizer;

    public CustomEditCell_ViewBinding(CustomEditCell customEditCell, View view) {
        this.IconCompatParcelizer = customEditCell;
        customEditCell.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_cell_title_text_view, "field 'title'", TextView.class);
        customEditCell.text = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_cell_value_text_view, "field 'text'", TextView.class);
        customEditCell.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_cell_icon_image_view, "field 'icon'", ImageView.class);
        customEditCell.divider = onStart.IconCompatParcelizer(view, R.id.custom_cell_divider, "field 'divider'");
        customEditCell.ripple = onStart.IconCompatParcelizer(view, R.id.custom_cell_ripple, "field 'ripple'");
    }

    public final void read() {
        CustomEditCell customEditCell = this.IconCompatParcelizer;
        if (customEditCell != null) {
            this.IconCompatParcelizer = null;
            customEditCell.title = null;
            customEditCell.text = null;
            customEditCell.icon = null;
            customEditCell.divider = null;
            customEditCell.ripple = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
