package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.LinearLayout;
import com.scb.phone.R;
import p040o.onStart;

public final class ItemRevampSuccessfulHeaderCustom_ViewBinding extends ItemSuccessfulHeaderCustom_ViewBinding {
    private ItemRevampSuccessfulHeaderCustom IconCompatParcelizer;

    public ItemRevampSuccessfulHeaderCustom_ViewBinding(ItemRevampSuccessfulHeaderCustom itemRevampSuccessfulHeaderCustom, View view) {
        super(itemRevampSuccessfulHeaderCustom, view);
        this.IconCompatParcelizer = itemRevampSuccessfulHeaderCustom;
        itemRevampSuccessfulHeaderCustom.layoutHeaderTitle = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_header_title, "field 'layoutHeaderTitle'", LinearLayout.class);
    }

    public final void read() {
        ItemRevampSuccessfulHeaderCustom itemRevampSuccessfulHeaderCustom = this.IconCompatParcelizer;
        if (itemRevampSuccessfulHeaderCustom != null) {
            this.IconCompatParcelizer = null;
            itemRevampSuccessfulHeaderCustom.layoutHeaderTitle = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
