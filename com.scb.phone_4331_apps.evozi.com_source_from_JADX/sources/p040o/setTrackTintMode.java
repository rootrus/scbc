package p040o;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.setTrackTintMode */
public abstract class setTrackTintMode implements View.OnTouchListener {
    private static final int MediaBrowserCompat$SearchResultReceiver = ViewConfiguration.getTapTimeout();
    boolean IconCompatParcelizer;
    private Runnable Keep;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    final View MediaBrowserCompat$MediaItem;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int f2649x50fd9e4a;
    private boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private float[] MediaSessionCompat$QueueItem = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] MediaSessionCompat$ResultReceiverWrapper = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private float[] MediaSessionCompat$Token = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] ParcelableVolumeInfo = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private float[] PlaybackStateCompat = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    private final Interpolator RatingCompat = new AccelerateInterpolator();
    final IconCompatParcelizer read = new IconCompatParcelizer();
    boolean write;

    static float IconCompatParcelizer(float f, float f2, float f3) {
        if (f > 1.0f) {
            return 1.0f;
        }
        return f < BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : f;
    }

    public abstract void MediaBrowserCompat$ItemReceiver(int i);

    public abstract boolean read(int i);

    public setTrackTintMode(View view) {
        this.MediaBrowserCompat$MediaItem = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float[] fArr = this.MediaSessionCompat$QueueItem;
        float f = ((float) ((int) ((displayMetrics.density * 1575.0f) + 0.5f))) / 1000.0f;
        fArr[0] = f;
        fArr[1] = f;
        float[] fArr2 = this.MediaSessionCompat$ResultReceiverWrapper;
        float f2 = ((float) ((int) ((displayMetrics.density * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f2;
        fArr2[1] = f2;
        this.f2649x50fd9e4a = 1;
        float[] fArr3 = this.MediaSessionCompat$Token;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.ParcelableVolumeInfo;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.PlaybackStateCompat;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.MediaMetadataCompat = MediaBrowserCompat$SearchResultReceiver;
        this.read.MediaMetadataCompat = 500;
        this.read.read = 500;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 == 3) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.MediaBrowserCompat$ItemReceiver
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x0019
            if (r0 == r2) goto L_0x0015
            r3 = 2
            if (r0 == r3) goto L_0x001d
            r6 = 3
            if (r0 != r6) goto L_0x007c
        L_0x0015:
            r5.IconCompatParcelizer()
            goto L_0x007c
        L_0x0019:
            r5.IconCompatParcelizer = r2
            r5.MediaDescriptionCompat = r1
        L_0x001d:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.MediaBrowserCompat$MediaItem
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.IconCompatParcelizer(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.MediaBrowserCompat$MediaItem
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.IconCompatParcelizer(r2, r7, r6, r3)
            o.setTrackTintMode$IconCompatParcelizer r7 = r5.read
            r7.MediaBrowserCompat$MediaItem = r0
            r7.ParcelableVolumeInfo = r6
            boolean r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            if (r6 != 0) goto L_0x007c
            boolean r6 = r5.write()
            if (r6 == 0) goto L_0x007c
            java.lang.Runnable r6 = r5.Keep
            if (r6 != 0) goto L_0x0060
            o.setTrackTintMode$MediaBrowserCompat$ItemReceiver r6 = new o.setTrackTintMode$MediaBrowserCompat$ItemReceiver
            r6.<init>(r5)
            r5.Keep = r6
        L_0x0060:
            r5.MediaBrowserCompat$CustomActionResultReceiver = r2
            r5.write = r2
            boolean r6 = r5.MediaDescriptionCompat
            if (r6 != 0) goto L_0x0075
            int r6 = r5.MediaMetadataCompat
            if (r6 <= 0) goto L_0x0075
            android.view.View r7 = r5.MediaBrowserCompat$MediaItem
            java.lang.Runnable r0 = r5.Keep
            long r3 = (long) r6
            p040o.SwitchCompat.MediaBrowserCompat$CustomActionResultReceiver((android.view.View) r7, (java.lang.Runnable) r0, (long) r3)
            goto L_0x007a
        L_0x0075:
            java.lang.Runnable r6 = r5.Keep
            r6.run()
        L_0x007a:
            r5.MediaDescriptionCompat = r2
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTrackTintMode.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean write() {
        IconCompatParcelizer iconCompatParcelizer = this.read;
        float f = iconCompatParcelizer.ParcelableVolumeInfo;
        int abs = (int) (f / Math.abs(f));
        float f2 = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
        int abs2 = (int) (f2 / Math.abs(f2));
        return abs != 0 && read(abs);
    }

    public void IconCompatParcelizer() {
        int i = 0;
        if (this.write) {
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = this.read;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
        int i3 = iconCompatParcelizer.read;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        iconCompatParcelizer.IconCompatParcelizer = i;
        iconCompatParcelizer.MediaDescriptionCompat = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(currentAnimationTimeMillis);
        iconCompatParcelizer.RatingCompat = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float IconCompatParcelizer(int r5, float r6, float r7, float r8) {
        /*
            r4 = this;
            float[] r0 = r4.ParcelableVolumeInfo
            r0 = r0[r5]
            float[] r1 = r4.MediaSessionCompat$Token
            r1 = r1[r5]
            float r0 = r0 * r7
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            if (r2 <= 0) goto L_0x000f
            goto L_0x0016
        L_0x000f:
            int r1 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0015
            r1 = r3
            goto L_0x0016
        L_0x0015:
            r1 = r0
        L_0x0016:
            float r0 = r4.MediaBrowserCompat$CustomActionResultReceiver(r6, r1)
            float r7 = r7 - r6
            float r6 = r4.MediaBrowserCompat$CustomActionResultReceiver(r7, r1)
            float r6 = r6 - r0
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 >= 0) goto L_0x0031
            android.view.animation.Interpolator r7 = r4.RatingCompat
            float r6 = -r6
            float r6 = r7.getInterpolation(r6)
            float r6 = -r6
            goto L_0x003b
        L_0x0031:
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0048
            android.view.animation.Interpolator r7 = r4.RatingCompat
            float r6 = r7.getInterpolation(r6)
        L_0x003b:
            int r7 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0041
            r0 = r1
            goto L_0x0049
        L_0x0041:
            int r7 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            r0 = r6
            goto L_0x0049
        L_0x0048:
            r0 = r3
        L_0x0049:
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x004e
            return r3
        L_0x004e:
            float[] r7 = r4.PlaybackStateCompat
            r7 = r7[r5]
            float[] r1 = r4.MediaSessionCompat$ResultReceiverWrapper
            r1 = r1[r5]
            float[] r2 = r4.MediaSessionCompat$QueueItem
            r5 = r2[r5]
            float r7 = r7 * r8
            if (r6 <= 0) goto L_0x0069
            float r0 = r0 * r7
            int r6 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0063
            return r5
        L_0x0063:
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0068
            return r1
        L_0x0068:
            return r0
        L_0x0069:
            float r6 = -r0
            float r6 = r6 * r7
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0071
            r1 = r5
            goto L_0x0077
        L_0x0071:
            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r1 = r6
        L_0x0077:
            float r5 = -r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setTrackTintMode.IconCompatParcelizer(int, float, float, float):float");
    }

    private float MediaBrowserCompat$CustomActionResultReceiver(float f, float f2) {
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i = this.f2649x50fd9e4a;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= BitmapDescriptorFactory.HUE_RED) {
                    return 1.0f - (f / f2);
                }
                if (!this.MediaBrowserCompat$CustomActionResultReceiver || this.f2649x50fd9e4a != 1) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                return 1.0f;
            }
        } else if (i == 2 && f < BitmapDescriptorFactory.HUE_RED) {
            return f / (-f2);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: o.setTrackTintMode$IconCompatParcelizer */
    static class IconCompatParcelizer {
        int IconCompatParcelizer;
        int MediaBrowserCompat$CustomActionResultReceiver = 0;
        long MediaBrowserCompat$ItemReceiver = 0;
        float MediaBrowserCompat$MediaItem;
        long MediaBrowserCompat$SearchResultReceiver = Long.MIN_VALUE;
        float MediaDescriptionCompat;
        int MediaMetadataCompat;
        float ParcelableVolumeInfo;
        long RatingCompat = -1;
        int read;
        int write = 0;

        IconCompatParcelizer() {
        }

        /* access modifiers changed from: package-private */
        public final float MediaBrowserCompat$ItemReceiver(long j) {
            if (j < this.MediaBrowserCompat$SearchResultReceiver) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            long j2 = this.RatingCompat;
            if (j2 < 0 || j < j2) {
                return setTrackTintMode.IconCompatParcelizer(((float) (j - this.MediaBrowserCompat$SearchResultReceiver)) / ((float) this.MediaMetadataCompat), BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.5f;
            }
            float f = this.MediaDescriptionCompat;
            return (1.0f - f) + (f * setTrackTintMode.IconCompatParcelizer(((float) (j - j2)) / ((float) this.IconCompatParcelizer), BitmapDescriptorFactory.HUE_RED, 1.0f));
        }
    }
}
