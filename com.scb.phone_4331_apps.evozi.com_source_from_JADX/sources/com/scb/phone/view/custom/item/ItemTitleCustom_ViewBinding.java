package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ItemTitleCustom_ViewBinding implements Unbinder {
    private ItemTitleCustom write;

    public ItemTitleCustom_ViewBinding(ItemTitleCustom itemTitleCustom, View view) {
        this.write = itemTitleCustom;
        itemTitleCustom.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'title'", TextView.class);
    }

    public final void read() {
        ItemTitleCustom itemTitleCustom = this.write;
        if (itemTitleCustom != null) {
            this.write = null;
            itemTitleCustom.title = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
