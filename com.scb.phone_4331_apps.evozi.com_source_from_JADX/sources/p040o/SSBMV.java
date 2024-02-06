package p040o;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;

/* renamed from: o.SSBMV */
public final class SSBMV extends SGER {
    public SSBMV(DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        super(dSYMM$MediaBrowserCompat$ItemReceiver);
    }

    /* access modifiers changed from: protected */
    public final PropertyValuesHolder read(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = (int) (((float) this.RatingCompat) * this.MediaBrowserCompat$MediaItem);
            i2 = this.RatingCompat;
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i = this.RatingCompat;
            i2 = (int) (((float) this.RatingCompat) * this.MediaBrowserCompat$MediaItem);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
