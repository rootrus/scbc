package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ItemIconCustom_ViewBinding implements Unbinder {
    private ItemIconCustom write;

    public ItemIconCustom_ViewBinding(ItemIconCustom itemIconCustom, View view) {
        this.write = itemIconCustom;
        itemIconCustom.labelLeft = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_left, "field 'labelLeft'", TextView.class);
        itemIconCustom.labelRight = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_right, "field 'labelRight'", TextView.class);
        itemIconCustom.labelRightExtra = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_right_extra, "field 'labelRightExtra'", TextView.class);
        itemIconCustom.labelRightExtraWithPSL = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_right_extra_PSLfont, "field 'labelRightExtraWithPSL'", TextView.class);
        itemIconCustom.layoutCustomItemIcon = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_custom_item_icon, "field 'layoutCustomItemIcon'", ConstraintLayout.class);
    }

    public final void read() {
        ItemIconCustom itemIconCustom = this.write;
        if (itemIconCustom != null) {
            this.write = null;
            itemIconCustom.labelLeft = null;
            itemIconCustom.labelRight = null;
            itemIconCustom.labelRightExtra = null;
            itemIconCustom.labelRightExtraWithPSL = null;
            itemIconCustom.layoutCustomItemIcon = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
