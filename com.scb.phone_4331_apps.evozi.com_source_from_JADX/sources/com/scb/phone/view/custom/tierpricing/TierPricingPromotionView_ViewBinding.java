package com.scb.phone.view.custom.tierpricing;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class TierPricingPromotionView_ViewBinding implements Unbinder {
    private TierPricingPromotionView write;

    public TierPricingPromotionView_ViewBinding(TierPricingPromotionView tierPricingPromotionView, View view) {
        this.write = tierPricingPromotionView;
        tierPricingPromotionView.promo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_tierpricing_promo, "field 'promo'", TextView.class);
        tierPricingPromotionView.validUntil = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_tierpricing_valid_until, "field 'validUntil'", TextView.class);
        tierPricingPromotionView.tierPricingSimplePromo = (TierPricingSimplePromotionView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tpspv_tierpricing_promo, "field 'tierPricingSimplePromo'", TierPricingSimplePromotionView.class);
    }

    public final void read() {
        TierPricingPromotionView tierPricingPromotionView = this.write;
        if (tierPricingPromotionView != null) {
            this.write = null;
            tierPricingPromotionView.promo = null;
            tierPricingPromotionView.validUntil = null;
            tierPricingPromotionView.tierPricingSimplePromo = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
