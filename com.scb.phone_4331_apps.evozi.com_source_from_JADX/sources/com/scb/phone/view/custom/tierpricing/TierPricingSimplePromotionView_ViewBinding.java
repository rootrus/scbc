package com.scb.phone.view.custom.tierpricing;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class TierPricingSimplePromotionView_ViewBinding implements Unbinder {
    private TierPricingSimplePromotionView MediaBrowserCompat$ItemReceiver;

    public TierPricingSimplePromotionView_ViewBinding(TierPricingSimplePromotionView tierPricingSimplePromotionView, View view) {
        this.MediaBrowserCompat$ItemReceiver = tierPricingSimplePromotionView;
        tierPricingSimplePromotionView.divider = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fl_divider, "field 'divider'", FrameLayout.class);
        tierPricingSimplePromotionView.promo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_tierpricingsimple_promo, "field 'promo'", TextView.class);
        tierPricingSimplePromotionView.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_tierpricingsimple_title, "field 'title'", TextView.class);
        tierPricingSimplePromotionView.installments = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_tierpricingsimple_installments, "field 'installments'", RecyclerView.class);
        tierPricingSimplePromotionView.remark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_tierpricingsimple_remark, "field 'remark'", TextView.class);
    }

    public final void read() {
        TierPricingSimplePromotionView tierPricingSimplePromotionView = this.MediaBrowserCompat$ItemReceiver;
        if (tierPricingSimplePromotionView != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            tierPricingSimplePromotionView.divider = null;
            tierPricingSimplePromotionView.promo = null;
            tierPricingSimplePromotionView.title = null;
            tierPricingSimplePromotionView.installments = null;
            tierPricingSimplePromotionView.remark = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
