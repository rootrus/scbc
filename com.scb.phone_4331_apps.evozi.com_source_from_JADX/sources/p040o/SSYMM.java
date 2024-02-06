package p040o;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: o.SSYMM */
public final class SSYMM extends SGBMV<ValueAnimator> {
    private int IconCompatParcelizer = -1;
    private int MediaBrowserCompat$ItemReceiver = -1;
    private DTPMV MediaBrowserCompat$SearchResultReceiver = new DTPMV();

    public SSYMM(DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        super(dSYMM$MediaBrowserCompat$ItemReceiver);
    }

    public final SSYMM read(int i, int i2) {
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
                ((ValueAnimator) this.read).setValues(new PropertyValuesHolder[]{ofInt});
            }
        }
        return this;
    }

    static /* synthetic */ void IconCompatParcelizer(SSYMM ssymm, ValueAnimator valueAnimator) {
        ssymm.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        if (ssymm.write != null) {
            ssymm.write.MediaBrowserCompat$ItemReceiver(ssymm.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public final /* synthetic */ Animator MediaBrowserCompat$CustomActionResultReceiver() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SSYMM.IconCompatParcelizer(SSYMM.this, valueAnimator);
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
