package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class ItemAdditionalMetaDataCustom_ViewBinding implements Unbinder {
    private ItemAdditionalMetaDataCustom IconCompatParcelizer;

    public ItemAdditionalMetaDataCustom_ViewBinding(ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom, View view) {
        this.IconCompatParcelizer = itemAdditionalMetaDataCustom;
        itemAdditionalMetaDataCustom.container = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container_additional_meta_data, "field 'container'", LinearLayout.class);
    }

    public final void read() {
        ItemAdditionalMetaDataCustom itemAdditionalMetaDataCustom = this.IconCompatParcelizer;
        if (itemAdditionalMetaDataCustom != null) {
            this.IconCompatParcelizer = null;
            itemAdditionalMetaDataCustom.container = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
