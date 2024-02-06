package p040o;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: o.SGER */
public class SGER extends SSPMV implements ValueAnimator.AnimatorUpdateListener {
    float MediaBrowserCompat$MediaItem;
    private DSYRK MediaDescriptionCompat = new DSYRK();
    int RatingCompat;

    public final /* synthetic */ Animator MediaBrowserCompat$CustomActionResultReceiver() {
        return MediaBrowserCompat$CustomActionResultReceiver();
    }

    public SGER(DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        super(dSYMM$MediaBrowserCompat$ItemReceiver);
    }

    public final ValueAnimator write() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(this);
        return valueAnimator;
    }

    public final SGER MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, float f) {
        boolean z;
        if (this.read != null) {
            if (this.IconCompatParcelizer == i && this.MediaBrowserCompat$ItemReceiver == i2 && this.RatingCompat == i3 && this.MediaBrowserCompat$MediaItem == f) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.IconCompatParcelizer = i;
                this.MediaBrowserCompat$ItemReceiver = i2;
                this.RatingCompat = i3;
                this.MediaBrowserCompat$MediaItem = f;
                ((ValueAnimator) this.read).setValues(new PropertyValuesHolder[]{MediaBrowserCompat$ItemReceiver(false), MediaBrowserCompat$ItemReceiver(true), read(false), read(true)});
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public PropertyValuesHolder read(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.RatingCompat;
            i2 = (int) (((float) i) * this.MediaBrowserCompat$MediaItem);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i2 = this.RatingCompat;
            i = (int) (((float) i2) * this.MediaBrowserCompat$MediaItem);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        this.MediaDescriptionCompat.write = intValue;
        this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver = intValue2;
        this.MediaDescriptionCompat.IconCompatParcelizer = intValue3;
        this.MediaDescriptionCompat.read = intValue4;
        if (this.write != null) {
            this.write.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat);
        }
    }
}
