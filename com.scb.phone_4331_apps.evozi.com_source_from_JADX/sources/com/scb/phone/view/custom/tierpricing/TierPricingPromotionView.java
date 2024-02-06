package com.scb.phone.view.custom.tierpricing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.CrashlyticsReport;
import p040o.onGetStartedClick;

public final class TierPricingPromotionView extends ConstraintLayout {
    @BindView
    public TextView promo;
    @BindView
    public TierPricingSimplePromotionView tierPricingSimplePromo;
    @BindView
    public TextView validUntil;

    public TierPricingPromotionView(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public TierPricingPromotionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ TierPricingPromotionView(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TierPricingPromotionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.f85012131493728, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public final void setPromo(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.promo = textView;
    }

    public final void setValidUntil(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.validUntil = textView;
    }

    public final void setTierPricingSimplePromo(TierPricingSimplePromotionView tierPricingSimplePromotionView) {
        onGetStartedClick.write((Object) tierPricingSimplePromotionView, "<set-?>");
        this.tierPricingSimplePromo = tierPricingSimplePromotionView;
    }

    public final void setDisplay(CrashlyticsReport.Session session) {
        onGetStartedClick.write((Object) session, "display");
        TextView textView = this.validUntil;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("validUntil");
        }
        textView.setText(session.write);
        TierPricingSimplePromotionView tierPricingSimplePromotionView = this.tierPricingSimplePromo;
        if (tierPricingSimplePromotionView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tierPricingSimplePromo");
        }
        tierPricingSimplePromotionView.setDisplay(session.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
