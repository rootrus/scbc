package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ItemSimpleCustom_ViewBinding implements Unbinder {
    private ItemSimpleCustom write;

    public ItemSimpleCustom_ViewBinding(ItemSimpleCustom itemSimpleCustom, View view) {
        this.write = itemSimpleCustom;
        itemSimpleCustom.componentLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_left, "field 'componentLabel'", TextView.class);
        itemSimpleCustom.componentExtra = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_right, "field 'componentExtra'", TextView.class);
    }

    public void read() {
        ItemSimpleCustom itemSimpleCustom = this.write;
        if (itemSimpleCustom != null) {
            this.write = null;
            itemSimpleCustom.componentLabel = null;
            itemSimpleCustom.componentExtra = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
