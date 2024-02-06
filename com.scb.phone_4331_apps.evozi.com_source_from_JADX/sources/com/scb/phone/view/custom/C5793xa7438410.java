package com.scb.phone.view.custom;

import android.animation.ValueAnimator;
import kotlin.TypeCastException;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.custom.CustomDoubleCircleBorderView$MediaBrowserCompat$CustomActionResultReceiver */
final class C5793xa7438410 implements ValueAnimator.AnimatorUpdateListener {
    private /* synthetic */ CustomDoubleCircleBorderView IconCompatParcelizer;

    C5793xa7438410(CustomDoubleCircleBorderView customDoubleCircleBorderView) {
        this.IconCompatParcelizer = customDoubleCircleBorderView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        onGetStartedClick.IconCompatParcelizer((Object) valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue != null) {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = ((Float) animatedValue).floatValue() - 45.0f;
            this.IconCompatParcelizer.invalidate();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
    }
}
