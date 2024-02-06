package p040o;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: o.SSYR */
public final class SSYR extends SGBMV<ValueAnimator> {
    private int IconCompatParcelizer = -1;
    private int MediaBrowserCompat$ItemReceiver = -1;
    private DTRMV MediaDescriptionCompat = new DTRMV();

    public SSYR(DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        super(dSYMM$MediaBrowserCompat$ItemReceiver);
    }

    public final SSYR write(int i, int i2) {
        boolean z;
        if (this.read != null) {
            if (this.MediaBrowserCompat$ItemReceiver == i && this.IconCompatParcelizer == i2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.MediaBrowserCompat$ItemReceiver = i;
                this.IconCompatParcelizer = i2;
                PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{i, i2});
                ofInt.setEvaluator(new IntEvaluator());
                PropertyValuesHolder ofInt2 = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE_REVERSE", new int[]{i2, i});
                ofInt2.setEvaluator(new IntEvaluator());
                ((ValueAnimator) this.read).setValues(new PropertyValuesHolder[]{ofInt, ofInt2});
            }
        }
        return this;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(SSYR ssyr, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        ssyr.MediaDescriptionCompat.IconCompatParcelizer = intValue;
        ssyr.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver = intValue2;
        if (ssyr.write != null) {
            ssyr.write.MediaBrowserCompat$ItemReceiver(ssyr.MediaDescriptionCompat);
        }
    }

    public final /* synthetic */ Animator MediaBrowserCompat$CustomActionResultReceiver() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SSYR.MediaBrowserCompat$ItemReceiver(SSYR.this, valueAnimator);
            }
        });
        return valueAnimator;
    }

    public final /* synthetic */ SGBMV IconCompatParcelizer(float f) {
        if (this.read != null) {
            long j = (long) (f * ((float) this.MediaBrowserCompat$CustomActionResultReceiver));
            if (((ValueAnimator) this.read).getValues() != null && ((ValueAnimator) this.read).getValues().length > 0) {
                ((ValueAnimator) this.read).setCurrentPlayTime(j);
            }
        }
        return this;
    }
}
