package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class ItemRemarkCustom_ViewBinding implements Unbinder {
    private ItemRemarkCustom write;

    public ItemRemarkCustom_ViewBinding(ItemRemarkCustom itemRemarkCustom, View view) {
        this.write = itemRemarkCustom;
        itemRemarkCustom.remarkInfo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark_info, "field 'remarkInfo'", TextView.class);
    }

    public final void read() {
        ItemRemarkCustom itemRemarkCustom = this.write;
        if (itemRemarkCustom != null) {
            this.write = null;
            itemRemarkCustom.remarkInfo = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
