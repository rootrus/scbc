package com.scb.phone.view.custom.common;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import kotlin.TypeCastException;
import p040o.onGetStartedClick;

public final class CustomViewInlineProgressAnimation extends LinearLayout {
    private AnimatorSet MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public ImageView point1;
    @BindView
    public ImageView point2;
    @BindView
    public ImageView point3;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomViewInlineProgressAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        onGetStartedClick.write((Object) context2, "context");
        onGetStartedClick.write((Object) attributeSet, "attrs");
        Object systemService = context2.getSystemService("layout_inflater");
        if (systemService != null) {
            onGetStartedClick.IconCompatParcelizer((Object) ((LayoutInflater) systemService).inflate(R.layout.f85152131493742, this, true), "inflater.inflate(R.layou…ss_animation, this, true)");
            this.MediaBrowserCompat$CustomActionResultReceiver = new AnimatorSet();
            ButterKnife.IconCompatParcelizer(this);
            this.MediaBrowserCompat$CustomActionResultReceiver.cancel();
            AnimatorSet animatorSet = new AnimatorSet();
            ImageView imageView = this.point1;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("point1");
            }
            Animator IconCompatParcelizer = IconCompatParcelizer(imageView);
            ImageView imageView2 = this.point2;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("point2");
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, View.ALPHA, new float[]{0.3f, 1.0f});
            ofFloat.setDuration(500);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            onGetStartedClick.IconCompatParcelizer((Object) ofFloat, "ObjectAnimator.ofFloat(t…imation.REVERSE\n        }");
            Animator animator = ofFloat;
            ImageView imageView3 = this.point3;
            if (imageView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("point3");
            }
            Animator IconCompatParcelizer2 = IconCompatParcelizer(imageView3);
            ImageView imageView4 = this.point1;
            if (imageView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("point1");
            }
            Animator write = write(imageView4);
            ImageView imageView5 = this.point2;
            if (imageView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("point2");
            }
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView5, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.5f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.5f})});
            ofPropertyValuesHolder.setDuration(500);
            ofPropertyValuesHolder.setRepeatCount(-1);
            ofPropertyValuesHolder.setRepeatMode(2);
            onGetStartedClick.IconCompatParcelizer((Object) ofPropertyValuesHolder, "ObjectAnimator.ofPropert…imation.REVERSE\n        }");
            Animator animator2 = ofPropertyValuesHolder;
            ImageView imageView6 = this.point3;
            if (imageView6 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("point3");
            }
            animatorSet.playTogether(new Animator[]{IconCompatParcelizer, animator, IconCompatParcelizer2, write, animator2, write(imageView6)});
            animatorSet.setInterpolator(new LinearInterpolator());
            this.MediaBrowserCompat$CustomActionResultReceiver = animatorSet;
            animatorSet.start();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setPoint1(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.point1 = imageView;
    }

    public final void setPoint2(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.point2 = imageView;
    }

    public final void setPoint3(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.point3 = imageView;
    }

    private static Animator IconCompatParcelizer(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.3f});
        ofFloat.setDuration(500);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        onGetStartedClick.IconCompatParcelizer((Object) ofFloat, "ObjectAnimator.ofFloat(t…imation.REVERSE\n        }");
        return ofFloat;
    }

    private static Animator write(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.75f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.75f})});
        ofPropertyValuesHolder.setDuration(500);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.setRepeatMode(2);
        onGetStartedClick.IconCompatParcelizer((Object) ofPropertyValuesHolder, "ObjectAnimator.ofPropert…imation.REVERSE\n        }");
        return ofPropertyValuesHolder;
    }
}
