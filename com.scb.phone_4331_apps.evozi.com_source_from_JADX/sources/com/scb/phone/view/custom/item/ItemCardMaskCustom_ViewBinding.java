package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class ItemCardMaskCustom_ViewBinding implements Unbinder {
    private ItemCardMaskCustom MediaBrowserCompat$ItemReceiver;

    public ItemCardMaskCustom_ViewBinding(ItemCardMaskCustom itemCardMaskCustom, View view) {
        this.MediaBrowserCompat$ItemReceiver = itemCardMaskCustom;
        itemCardMaskCustom.cardImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_image_view, "field 'cardImage'", ImageView.class);
        itemCardMaskCustom.layoutCardNumber = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_card_number, "field 'layoutCardNumber'", LinearLayout.class);
        itemCardMaskCustom.tvCardNumberFront = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_front_text_view, "field 'tvCardNumberFront'", TextView.class);
        itemCardMaskCustom.tvCardNumber2nd = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_2nd_front_text_view, "field 'tvCardNumber2nd'", TextView.class);
        itemCardMaskCustom.tvCardNumberEnd = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_text_view, "field 'tvCardNumberEnd'", TextView.class);
    }

    public final void read() {
        ItemCardMaskCustom itemCardMaskCustom = this.MediaBrowserCompat$ItemReceiver;
        if (itemCardMaskCustom != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            itemCardMaskCustom.cardImage = null;
            itemCardMaskCustom.layoutCardNumber = null;
            itemCardMaskCustom.tvCardNumberFront = null;
            itemCardMaskCustom.tvCardNumber2nd = null;
            itemCardMaskCustom.tvCardNumberEnd = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
