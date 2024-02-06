package p040o;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: o.SGEMM */
public final class SGEMM extends SSPMV implements ValueAnimator.AnimatorUpdateListener {
    private int MediaDescriptionCompat;
    private DTPSV MediaMetadataCompat = new DTPSV();
    private int RatingCompat;

    public final /* synthetic */ Animator MediaBrowserCompat$CustomActionResultReceiver() {
        return MediaBrowserCompat$CustomActionResultReceiver();
    }

    public SGEMM(DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        super(dSYMM$MediaBrowserCompat$ItemReceiver);
    }

    public final ValueAnimator write() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(this);
        return valueAnimator;
    }

    public final SGEMM write(int i, int i2, int i3, int i4) {
        boolean z;
        if (this.read != null) {
            if (this.IconCompatParcelizer == i && this.MediaBrowserCompat$ItemReceiver == i2 && this.MediaDescriptionCompat == i3 && this.RatingCompat == i4) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.IconCompatParcelizer = i;
                this.MediaBrowserCompat$ItemReceiver = i2;
                this.MediaDescriptionCompat = i3;
                this.RatingCompat = i4;
                ((ValueAnimator) this.read).setValues(new PropertyValuesHolder[]{MediaBrowserCompat$ItemReceiver(false), MediaBrowserCompat$ItemReceiver(true), read(false), read(true), MediaBrowserCompat$CustomActionResultReceiver(false), MediaBrowserCompat$CustomActionResultReceiver(true)});
            }
        }
        return this;
    }

    private PropertyValuesHolder read(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.MediaDescriptionCompat;
            i2 = i / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i2 = this.MediaDescriptionCompat;
            i = i2 / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private PropertyValuesHolder MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.MediaDescriptionCompat;
            str = "ANIMATION_STROKE_REVERSE";
            i2 = 0;
        } else {
            str = "ANIMATION_STROKE";
            i2 = this.MediaDescriptionCompat;
            i = 0;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int intValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int intValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        this.MediaMetadataCompat.write = intValue;
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver = intValue2;
        this.MediaMetadataCompat.read = intValue3;
        this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver = intValue4;
        this.MediaMetadataCompat.IconCompatParcelizer = intValue5;
        this.MediaMetadataCompat.MediaBrowserCompat$MediaItem = intValue6;
        if (this.write != null) {
            this.write.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat);
        }
    }
}
