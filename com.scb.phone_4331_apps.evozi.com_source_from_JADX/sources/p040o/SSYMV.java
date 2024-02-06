package p040o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: o.SSYMV */
public final class SSYMV extends SSPR implements ValueAnimator.AnimatorUpdateListener {
    private DTRSV MediaBrowserCompat$MediaItem = new DTRSV();

    public SSYMV(DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        super(dSYMM$MediaBrowserCompat$ItemReceiver);
    }

    public final SSPR IconCompatParcelizer(int i, int i2, int i3, boolean z) {
        int i4 = i;
        int i5 = i3;
        boolean z2 = z;
        if (MediaBrowserCompat$CustomActionResultReceiver(i, i2, i3, z)) {
            T animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.read = animatorSet;
            this.MediaBrowserCompat$ItemReceiver = i4;
            this.IconCompatParcelizer = i2;
            this.MediaMetadataCompat = i5;
            this.MediaBrowserCompat$SearchResultReceiver = z2;
            int i6 = i5 << 1;
            this.MediaDescriptionCompat = i4 - i5;
            this.RatingCompat = i4 + i5;
            this.MediaBrowserCompat$MediaItem.write = this.MediaDescriptionCompat;
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver = this.RatingCompat;
            this.MediaBrowserCompat$MediaItem.IconCompatParcelizer = i6;
            SSPR$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(z2);
            long j = (long) (((double) this.MediaBrowserCompat$CustomActionResultReceiver) * 0.8d);
            long j2 = (long) (((double) this.MediaBrowserCompat$CustomActionResultReceiver) * 0.2d);
            long j3 = (long) (((double) this.MediaBrowserCompat$CustomActionResultReceiver) * 0.5d);
            long j4 = (long) (((double) this.MediaBrowserCompat$CustomActionResultReceiver) * 0.5d);
            long j5 = j4;
            long j6 = j;
            ValueAnimator read = read(MediaBrowserCompat$ItemReceiver.read, MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, j6, false, this.MediaBrowserCompat$MediaItem);
            ValueAnimator read2 = read(MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, j6, true, this.MediaBrowserCompat$MediaItem);
            read2.setStartDelay(j2);
            int i7 = i6;
            int i8 = i3;
            long j7 = j3;
            ValueAnimator read3 = read(i7, i8, j7);
            ValueAnimator read4 = read(i8, i7, j7);
            read4.setStartDelay(j5);
            ((AnimatorSet) this.read).playTogether(new Animator[]{read, read2, read3, read4});
        }
        return this;
    }

    private ValueAnimator read(int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(this);
        return ofInt;
    }

    /* access modifiers changed from: private */
    /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
    public SSYMV read(float f) {
        if (this.read != null) {
            long j = (long) (f * ((float) this.MediaBrowserCompat$CustomActionResultReceiver));
            int size = ((AnimatorSet) this.read).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.read).getChildAnimations().get(i);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }

    public final /* synthetic */ SGBMV MediaBrowserCompat$ItemReceiver(long j) {
        super.MediaBrowserCompat$ItemReceiver(j);
        return this;
    }

    public final /* bridge */ /* synthetic */ SSPR read(long j) {
        super.MediaBrowserCompat$ItemReceiver(j);
        return this;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (this.write != null) {
            this.write.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem);
        }
    }
}
