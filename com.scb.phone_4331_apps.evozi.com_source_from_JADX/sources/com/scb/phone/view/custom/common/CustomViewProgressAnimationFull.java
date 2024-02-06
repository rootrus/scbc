package com.scb.phone.view.custom.common;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import kotlin.TypeCastException;
import p040o.onGetStartedClick;

public final class CustomViewProgressAnimationFull extends LinearLayout {
    public AnimatorSet IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public ImageView bottomPoint;
    @BindView
    public ImageView leftPoint;
    @BindView
    public ImageView rightPoint;
    @BindView
    public ImageView topPoint;

    public CustomViewProgressAnimationFull(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, (byte) 0);
    }

    public CustomViewProgressAnimationFull(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, (byte) 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CustomViewProgressAnimationFull(Context context, AttributeSet attributeSet, int i, int i2, byte b) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private CustomViewProgressAnimationFull(android.content.Context r19, android.util.AttributeSet r20, int r21, int r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "context"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r3)
            java.lang.String r3 = "attrs"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r3)
            r3 = 0
            r4 = r21
            r0.<init>(r1, r2, r4, r3)
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r1 = r1.getSystemService(r2)
            if (r1 == 0) goto L_0x012b
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            r2 = 2131493744(0x7f0c0370, float:1.8610977E38)
            r4 = r0
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r5 = 1
            android.view.View r1 = r1.inflate(r2, r4, r5)
            java.lang.String r2 = "inflater.inflate(R.layou…imation_full, this, true)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r2)
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r0.IconCompatParcelizer = r1
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            butterknife.ButterKnife.IconCompatParcelizer(r1)
            android.content.Context r1 = r18.getContext()
            r2 = 2131099862(0x7f0600d6, float:1.781209E38)
            int r1 = p040o.setLastBaselineToBottomHeight.read(r1, r2)
            android.content.Context r2 = r18.getContext()
            r4 = 2131099860(0x7f0600d4, float:1.7812085E38)
            int r2 = p040o.setLastBaselineToBottomHeight.read(r2, r4)
            android.content.Context r4 = r18.getContext()
            r6 = 2131099859(0x7f0600d3, float:1.7812083E38)
            int r4 = p040o.setLastBaselineToBottomHeight.read(r4, r6)
            android.content.Context r6 = r18.getContext()
            r7 = 2131099861(0x7f0600d5, float:1.7812087E38)
            int r6 = p040o.setLastBaselineToBottomHeight.read(r6, r7)
            android.animation.AnimatorSet r7 = r0.IconCompatParcelizer
            r7.cancel()
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet
            r7.<init>()
            android.view.View r8 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r9 = 2
            float[] r10 = new float[r9]
            r10 = {0, 1119092736} // fill-array
            java.lang.String r11 = "rotation"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r8, r11, r10)
            r10 = 1000(0x3e8, double:4.94E-321)
            r8.setDuration(r10)
            r10 = -1
            r8.setRepeatCount(r10)
            r8.setRepeatMode(r10)
            android.animation.Animator r8 = (android.animation.Animator) r8
            android.widget.ImageView r10 = r0.topPoint
            java.lang.String r11 = "topPoint"
            if (r10 != 0) goto L_0x009a
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r11)
        L_0x009a:
            r12 = 1092616192(0x41200000, float:10.0)
            java.lang.String r13 = "translationY"
            android.animation.Animator r10 = MediaBrowserCompat$CustomActionResultReceiver(r10, r13, r12)
            android.widget.ImageView r14 = r0.leftPoint
            java.lang.String r15 = "leftPoint"
            if (r14 != 0) goto L_0x00ab
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r15)
        L_0x00ab:
            java.lang.String r9 = "translationX"
            android.animation.Animator r12 = MediaBrowserCompat$CustomActionResultReceiver(r14, r9, r12)
            android.widget.ImageView r14 = r0.rightPoint
            java.lang.String r16 = "rightPoint"
            if (r14 != 0) goto L_0x00ba
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r16)
        L_0x00ba:
            r5 = -1054867456(0xffffffffc1200000, float:-10.0)
            android.animation.Animator r9 = MediaBrowserCompat$CustomActionResultReceiver(r14, r9, r5)
            android.widget.ImageView r14 = r0.bottomPoint
            java.lang.String r17 = "bottomPoint"
            if (r14 != 0) goto L_0x00c9
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r17)
        L_0x00c9:
            android.animation.Animator r5 = MediaBrowserCompat$CustomActionResultReceiver(r14, r13, r5)
            android.widget.ImageView r13 = r0.topPoint
            if (r13 != 0) goto L_0x00d4
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r11)
        L_0x00d4:
            android.animation.Animator r11 = write(r13, r1, r6)
            android.widget.ImageView r13 = r0.leftPoint
            if (r13 != 0) goto L_0x00df
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r15)
        L_0x00df:
            android.animation.Animator r1 = write(r13, r2, r1)
            android.widget.ImageView r13 = r0.rightPoint
            if (r13 != 0) goto L_0x00ea
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r16)
        L_0x00ea:
            android.animation.Animator r6 = write(r13, r6, r4)
            android.widget.ImageView r13 = r0.bottomPoint
            if (r13 != 0) goto L_0x00f5
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r17)
        L_0x00f5:
            android.animation.Animator r2 = write(r13, r4, r2)
            r4 = 9
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r4[r3] = r8
            r3 = 1
            r4[r3] = r10
            r3 = 2
            r4[r3] = r12
            r3 = 3
            r4[r3] = r9
            r3 = 4
            r4[r3] = r5
            r3 = 5
            r4[r3] = r11
            r3 = 6
            r4[r3] = r1
            r1 = 7
            r4[r1] = r6
            r1 = 8
            r4[r1] = r2
            r7.playTogether(r4)
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            android.animation.TimeInterpolator r1 = (android.animation.TimeInterpolator) r1
            r7.setInterpolator(r1)
            r0.IconCompatParcelizer = r7
            r7.start()
            return
        L_0x012b:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type android.view.LayoutInflater"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.custom.common.CustomViewProgressAnimationFull.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public final void setTopPoint(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.topPoint = imageView;
    }

    public final void setLeftPoint(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.leftPoint = imageView;
    }

    public final void setRightPoint(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.rightPoint = imageView;
    }

    public final void setBottomPoint(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.bottomPoint = imageView;
    }

    private static Animator MediaBrowserCompat$CustomActionResultReceiver(ImageView imageView, String str, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, str, new float[]{-f});
        ofFloat.setDuration(500);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        return ofFloat;
    }

    private static Animator write(ImageView imageView, int i, int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{i, i2});
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new write(imageView));
        valueAnimator.setDuration(1000);
        valueAnimator.setRepeatCount(-1);
        return valueAnimator;
    }

    static final class write implements ValueAnimator.AnimatorUpdateListener {
        private /* synthetic */ ImageView MediaBrowserCompat$ItemReceiver;

        write(ImageView imageView) {
            this.MediaBrowserCompat$ItemReceiver = imageView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Drawable background = this.MediaBrowserCompat$ItemReceiver.getBackground();
            onGetStartedClick.IconCompatParcelizer((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                background.setTint(((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }
}
