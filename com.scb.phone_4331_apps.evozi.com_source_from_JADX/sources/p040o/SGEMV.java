package p040o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;

/* renamed from: o.SGEMV */
public final class SGEMV extends SGBMV<AnimatorSet> {
    private int IconCompatParcelizer;
    private int MediaBrowserCompat$ItemReceiver;
    private DTBMV MediaBrowserCompat$MediaItem = new DTBMV();
    private int MediaBrowserCompat$SearchResultReceiver;
    private int MediaDescriptionCompat;
    private int RatingCompat;

    public SGEMV(DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        super(dSYMM$MediaBrowserCompat$ItemReceiver);
    }

    public final SGEMV IconCompatParcelizer(long j) {
        super.MediaBrowserCompat$ItemReceiver(j);
        return this;
    }

    private ValueAnimator MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, long j, final SGEMV$MediaBrowserCompat$CustomActionResultReceiver sGEMV$MediaBrowserCompat$CustomActionResultReceiver) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SGEMV.MediaBrowserCompat$ItemReceiver(SGEMV.this, valueAnimator, sGEMV$MediaBrowserCompat$CustomActionResultReceiver);
            }
        });
        return ofInt;
    }

    /* renamed from: o.SGEMV$3 */
    static /* synthetic */ class C12593 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.SGEMV$MediaBrowserCompat$CustomActionResultReceiver[] r0 = p040o.SGEMV$MediaBrowserCompat$CustomActionResultReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                IconCompatParcelizer = r0
                o.SGEMV$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.SGEMV$MediaBrowserCompat$CustomActionResultReceiver.Width     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.SGEMV$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.SGEMV$MediaBrowserCompat$CustomActionResultReceiver.Height     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.SGEMV$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.SGEMV$MediaBrowserCompat$CustomActionResultReceiver.Radius     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.SGEMV.C12593.<clinit>():void");
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(SGEMV sgemv, ValueAnimator valueAnimator, SGEMV$MediaBrowserCompat$CustomActionResultReceiver sGEMV$MediaBrowserCompat$CustomActionResultReceiver) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = C12593.IconCompatParcelizer[sGEMV$MediaBrowserCompat$CustomActionResultReceiver.ordinal()];
        if (i == 1) {
            sgemv.MediaBrowserCompat$MediaItem.write = intValue;
        } else if (i == 2) {
            sgemv.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver = intValue;
        } else if (i == 3) {
            sgemv.MediaBrowserCompat$MediaItem.IconCompatParcelizer = intValue;
        }
        if (sgemv.write != null) {
            sgemv.write.MediaBrowserCompat$ItemReceiver(sgemv.MediaBrowserCompat$MediaItem);
        }
    }

    public final /* synthetic */ Animator MediaBrowserCompat$CustomActionResultReceiver() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final /* bridge */ /* synthetic */ SGBMV MediaBrowserCompat$ItemReceiver(long j) {
        super.MediaBrowserCompat$ItemReceiver(j);
        return this;
    }

    public final /* synthetic */ SGBMV IconCompatParcelizer(float f) {
        if (this.read != null) {
            long j = (long) (f * ((float) this.MediaBrowserCompat$CustomActionResultReceiver));
            boolean z = false;
            Iterator<Animator> it = ((AnimatorSet) this.read).getChildAnimations().iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                long j2 = z ? j - duration : j;
                if (j2 >= 0) {
                    if (j2 >= duration) {
                        j2 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j2);
                    }
                    if (!z && duration >= this.MediaBrowserCompat$CustomActionResultReceiver) {
                        z = true;
                    }
                }
            }
        }
        return this;
    }

    public final SGEMV write(int i, int i2, int i3, int i4, int i5) {
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        boolean z = true;
        if (this.MediaDescriptionCompat == i6 && this.RatingCompat == i7 && this.IconCompatParcelizer == i8 && this.MediaBrowserCompat$ItemReceiver == i9 && this.MediaBrowserCompat$SearchResultReceiver == i10) {
            z = false;
        }
        if (z) {
            T animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.read = animatorSet;
            this.MediaDescriptionCompat = i6;
            this.RatingCompat = i7;
            this.IconCompatParcelizer = i8;
            this.MediaBrowserCompat$ItemReceiver = i9;
            this.MediaBrowserCompat$SearchResultReceiver = i10;
            int i11 = (int) (((double) i10) / 1.5d);
            long j = this.MediaBrowserCompat$CustomActionResultReceiver / 2;
            ValueAnimator MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(i, i2, this.MediaBrowserCompat$CustomActionResultReceiver, SGEMV$MediaBrowserCompat$CustomActionResultReceiver.Width);
            long j2 = j;
            ValueAnimator MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(i3, i4, j2, SGEMV$MediaBrowserCompat$CustomActionResultReceiver.Height);
            ValueAnimator MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(i5, i11, j2, SGEMV$MediaBrowserCompat$CustomActionResultReceiver.Radius);
            ValueAnimator MediaBrowserCompat$CustomActionResultReceiver4 = MediaBrowserCompat$CustomActionResultReceiver(i4, i3, j2, SGEMV$MediaBrowserCompat$CustomActionResultReceiver.Height);
            ((AnimatorSet) this.read).play(MediaBrowserCompat$CustomActionResultReceiver2).with(MediaBrowserCompat$CustomActionResultReceiver3).with(MediaBrowserCompat$CustomActionResultReceiver).before(MediaBrowserCompat$CustomActionResultReceiver4).before(MediaBrowserCompat$CustomActionResultReceiver(i11, i5, j2, SGEMV$MediaBrowserCompat$CustomActionResultReceiver.Radius));
        }
        return this;
    }
}
