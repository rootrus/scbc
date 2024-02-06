package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import com.scb.phone.R;
import p040o.onStart;

public class ItemRevampSimpleCustom_ViewBinding extends ItemSimpleCustom_ViewBinding {
    private ItemRevampSimpleCustom IconCompatParcelizer;

    public ItemRevampSimpleCustom_ViewBinding(ItemRevampSimpleCustom itemRevampSimpleCustom, View view) {
        super(itemRevampSimpleCustom, view);
        this.IconCompatParcelizer = itemRevampSimpleCustom;
        itemRevampSimpleCustom.layoutCustomSimpleItem = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_custom_simple_item, "field 'layoutCustomSimpleItem'", LinearLayout.class);
        itemRevampSimpleCustom.spaceTop = (Space) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sp_space_top, "field 'spaceTop'", Space.class);
        itemRevampSimpleCustom.spaceBottom = (Space) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sp_space_bottom, "field 'spaceBottom'", Space.class);
    }

    public final void read() {
        ItemRevampSimpleCustom itemRevampSimpleCustom = this.IconCompatParcelizer;
        if (itemRevampSimpleCustom != null) {
            this.IconCompatParcelizer = null;
            itemRevampSimpleCustom.layoutCustomSimpleItem = null;
            itemRevampSimpleCustom.spaceTop = null;
            itemRevampSimpleCustom.spaceBottom = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
