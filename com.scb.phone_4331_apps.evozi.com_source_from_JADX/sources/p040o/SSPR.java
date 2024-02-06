package p040o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;

/* renamed from: o.SSPR */
public class SSPR extends SGBMV<AnimatorSet> {
    int IconCompatParcelizer;
    int MediaBrowserCompat$ItemReceiver;
    private DTRSM MediaBrowserCompat$MediaItem = new DTRSM();
    boolean MediaBrowserCompat$SearchResultReceiver;
    int MediaDescriptionCompat;
    int MediaMetadataCompat;
    int RatingCompat;

    public SSPR(DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        super(dSYMM$MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: read */
    public SSPR MediaBrowserCompat$ItemReceiver(long j) {
        super.MediaBrowserCompat$ItemReceiver(j);
        return this;
    }

    public SSPR IconCompatParcelizer(int i, int i2, int i3, boolean z) {
        if (MediaBrowserCompat$CustomActionResultReceiver(i, i2, i3, z)) {
            T animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.read = animatorSet;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.IconCompatParcelizer = i2;
            this.MediaMetadataCompat = i3;
            this.MediaBrowserCompat$SearchResultReceiver = z;
            int i4 = i - i3;
            this.MediaDescriptionCompat = i4;
            this.RatingCompat = i + i3;
            this.MediaBrowserCompat$MediaItem.write = i4;
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver = this.RatingCompat;
            SSPR$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(z);
            long j = this.MediaBrowserCompat$CustomActionResultReceiver / 2;
            ((AnimatorSet) this.read).playSequentially(new Animator[]{read(MediaBrowserCompat$ItemReceiver2.read, MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer, j, false, this.MediaBrowserCompat$MediaItem), read(MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver, j, true, this.MediaBrowserCompat$MediaItem)});
        }
        return this;
    }

    /* renamed from: read */
    public SSPR IconCompatParcelizer(float f) {
        if (this.read == null) {
            return this;
        }
        long j = (long) (f * ((float) this.MediaBrowserCompat$CustomActionResultReceiver));
        Iterator<Animator> it = ((AnimatorSet) this.read).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            long duration = valueAnimator.getDuration();
            if (j <= duration) {
                duration = j;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j -= duration;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final ValueAnimator read(int i, int i2, long j, final boolean z, final DTRSM dtrsm) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SSPR.MediaBrowserCompat$ItemReceiver(SSPR.this, dtrsm, valueAnimator, z);
            }
        });
        return ofInt;
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3, boolean z) {
        if (this.MediaBrowserCompat$ItemReceiver == i && this.IconCompatParcelizer == i2 && this.MediaMetadataCompat == i3 && this.MediaBrowserCompat$SearchResultReceiver == z) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final SSPR$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.MediaBrowserCompat$ItemReceiver;
            int i6 = this.MediaMetadataCompat;
            i4 = i5 + i6;
            int i7 = this.IconCompatParcelizer;
            i2 = i7 + i6;
            i = i5 - i6;
            i3 = i7 - i6;
        } else {
            int i8 = this.MediaBrowserCompat$ItemReceiver;
            int i9 = this.MediaMetadataCompat;
            i4 = i8 - i9;
            int i10 = this.IconCompatParcelizer;
            i2 = i10 - i9;
            i = i8 + i9;
            i3 = i10 + i9;
        }
        return new SSPR$MediaBrowserCompat$CustomActionResultReceiver(i4, i2, i, i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(p040o.SSPR r1, p040o.DTRSM r2, android.animation.ValueAnimator r3, boolean r4) {
        /*
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r0 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r0 == 0) goto L_0x0013
            if (r4 == 0) goto L_0x0018
            r2.write = r3
            goto L_0x001a
        L_0x0013:
            if (r4 != 0) goto L_0x0018
            r2.write = r3
            goto L_0x001a
        L_0x0018:
            r2.MediaBrowserCompat$CustomActionResultReceiver = r3
        L_0x001a:
            o.DSYMM$MediaBrowserCompat$ItemReceiver r3 = r1.write
            if (r3 == 0) goto L_0x0023
            o.DSYMM$MediaBrowserCompat$ItemReceiver r1 = r1.write
            r1.MediaBrowserCompat$ItemReceiver(r2)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.SSPR.MediaBrowserCompat$ItemReceiver(o.SSPR, o.DTRSM, android.animation.ValueAnimator, boolean):void");
    }

    public final /* synthetic */ Animator MediaBrowserCompat$CustomActionResultReceiver() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }
}
