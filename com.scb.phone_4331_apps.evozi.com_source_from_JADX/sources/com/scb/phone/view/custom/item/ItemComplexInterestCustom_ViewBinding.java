package com.scb.phone.view.custom.item;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class ItemComplexInterestCustom_ViewBinding implements Unbinder {
    private ItemComplexInterestCustom MediaBrowserCompat$ItemReceiver;

    public ItemComplexInterestCustom_ViewBinding(ItemComplexInterestCustom itemComplexInterestCustom, View view) {
        this.MediaBrowserCompat$ItemReceiver = itemComplexInterestCustom;
        itemComplexInterestCustom.divider = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fl_divider, "field 'divider'", FrameLayout.class);
        itemComplexInterestCustom.promo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_tierpricingsimple_promo, "field 'promo'", TextView.class);
        itemComplexInterestCustom.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_tierpricingsimple_title, "field 'title'", TextView.class);
        itemComplexInterestCustom.installments = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_tierpricingsimple_installments, "field 'installments'", RecyclerView.class);
        itemComplexInterestCustom.remark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_tierpricingsimple_remark, "field 'remark'", TextView.class);
    }

    public final void read() {
        ItemComplexInterestCustom itemComplexInterestCustom = this.MediaBrowserCompat$ItemReceiver;
        if (itemComplexInterestCustom != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            itemComplexInterestCustom.divider = null;
            itemComplexInterestCustom.promo = null;
            itemComplexInterestCustom.title = null;
            itemComplexInterestCustom.installments = null;
            itemComplexInterestCustom.remark = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
