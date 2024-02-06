package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomSwitchCell_ViewBinding implements Unbinder {
    private CustomSwitchCell MediaBrowserCompat$CustomActionResultReceiver;

    public CustomSwitchCell_ViewBinding(CustomSwitchCell customSwitchCell, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customSwitchCell;
        customSwitchCell.text = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_cell_text_view, "field 'text'", TextView.class);
        customSwitchCell.switchCompat = (SwitchCompat) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_cell_switch, "field 'switchCompat'", SwitchCompat.class);
        customSwitchCell.divider = onStart.IconCompatParcelizer(view, R.id.custom_cell_divider, "field 'divider'");
        customSwitchCell.ripple = onStart.IconCompatParcelizer(view, R.id.custom_cell_ripple, "field 'ripple'");
    }

    public final void read() {
        CustomSwitchCell customSwitchCell = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customSwitchCell != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customSwitchCell.text = null;
            customSwitchCell.switchCompat = null;
            customSwitchCell.divider = null;
            customSwitchCell.ripple = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
