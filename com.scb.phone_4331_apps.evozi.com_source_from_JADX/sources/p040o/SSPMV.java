package p040o;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: o.SSPMV */
public class SSPMV extends SGBMV<ValueAnimator> {
    int IconCompatParcelizer;
    int MediaBrowserCompat$ItemReceiver;
    private DTBSV MediaBrowserCompat$MediaItem = new DTBSV();

    public SSPMV(DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        super(dSYMM$MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: write */
    public ValueAnimator MediaBrowserCompat$CustomActionResultReceiver() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SSPMV.MediaBrowserCompat$ItemReceiver(SSPMV.this, valueAnimator);
            }
        });
        return valueAnimator;
    }

    public final SSPMV MediaBrowserCompat$ItemReceiver(int i, int i2) {
        boolean z;
        if (this.read != null) {
            if (this.IconCompatParcelizer == i && this.MediaBrowserCompat$ItemReceiver == i2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.IconCompatParcelizer = i;
                this.MediaBrowserCompat$ItemReceiver = i2;
                ((ValueAnimator) this.read).setValues(new PropertyValuesHolder[]{MediaBrowserCompat$ItemReceiver(false), MediaBrowserCompat$ItemReceiver(true)});
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final PropertyValuesHolder MediaBrowserCompat$ItemReceiver(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.MediaBrowserCompat$ItemReceiver;
            i2 = this.IconCompatParcelizer;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i = this.IconCompatParcelizer;
            i2 = this.MediaBrowserCompat$ItemReceiver;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(SSPMV sspmv, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        sspmv.MediaBrowserCompat$MediaItem.write = intValue;
        sspmv.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver = intValue2;
        if (sspmv.write != null) {
            sspmv.write.MediaBrowserCompat$ItemReceiver(sspmv.MediaBrowserCompat$MediaItem);
        }
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
