package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class ItemCardCustom_ViewBinding implements Unbinder {
    private ItemCardCustom IconCompatParcelizer;

    public ItemCardCustom_ViewBinding(ItemCardCustom itemCardCustom, View view) {
        this.IconCompatParcelizer = itemCardCustom;
        itemCardCustom.cardImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_image_view, "field 'cardImage'", ImageView.class);
        itemCardCustom.cardNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_no, "field 'cardNo'", TextView.class);
    }

    public final void read() {
        ItemCardCustom itemCardCustom = this.IconCompatParcelizer;
        if (itemCardCustom != null) {
            this.IconCompatParcelizer = null;
            itemCardCustom.cardImage = null;
            itemCardCustom.cardNo = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
