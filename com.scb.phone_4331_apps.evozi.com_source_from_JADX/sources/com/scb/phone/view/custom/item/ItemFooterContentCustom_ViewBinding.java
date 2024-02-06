package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class ItemFooterContentCustom_ViewBinding implements Unbinder {
    private ItemFooterContentCustom IconCompatParcelizer;

    public ItemFooterContentCustom_ViewBinding(ItemFooterContentCustom itemFooterContentCustom, View view) {
        this.IconCompatParcelizer = itemFooterContentCustom;
        itemFooterContentCustom.textView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvContent, "field 'textView'", TextView.class);
        itemFooterContentCustom.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tvRemark, "field 'tvRemark'", TextView.class);
        itemFooterContentCustom.ivImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ivImage, "field 'ivImage'", ImageView.class);
    }

    public final void read() {
        ItemFooterContentCustom itemFooterContentCustom = this.IconCompatParcelizer;
        if (itemFooterContentCustom != null) {
            this.IconCompatParcelizer = null;
            itemFooterContentCustom.textView = null;
            itemFooterContentCustom.tvRemark = null;
            itemFooterContentCustom.ivImage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
