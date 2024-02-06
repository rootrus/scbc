package p040o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: o.setSupportBackgroundTintMode */
final class setSupportBackgroundTintMode extends Drawable {
    private ColorStateList IconCompatParcelizer;
    float MediaBrowserCompat$CustomActionResultReceiver;
    float MediaBrowserCompat$ItemReceiver;
    private PorterDuffColorFilter MediaBrowserCompat$MediaItem;
    private final Rect MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private PorterDuff.Mode f2643x50fd9e4a = PorterDuff.Mode.SRC_IN;
    private final RectF MediaDescriptionCompat;
    private ColorStateList MediaMetadataCompat;
    private final Paint RatingCompat;
    boolean read = true;
    boolean write = false;

    public final int getOpacity() {
        return -3;
    }

    setSupportBackgroundTintMode(ColorStateList colorStateList, float f) {
        this.MediaBrowserCompat$ItemReceiver = f;
        this.RatingCompat = new Paint(5);
        MediaBrowserCompat$CustomActionResultReceiver(colorStateList);
        this.MediaDescriptionCompat = new RectF();
        this.MediaBrowserCompat$SearchResultReceiver = new Rect();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.IconCompatParcelizer = colorStateList;
        this.RatingCompat.setColor(colorStateList.getColorForState(getState(), this.IconCompatParcelizer.getDefaultColor()));
    }

    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.RatingCompat;
        if (this.MediaBrowserCompat$MediaItem == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.MediaBrowserCompat$MediaItem);
            z = true;
        }
        RectF rectF = this.MediaDescriptionCompat;
        float f = this.MediaBrowserCompat$ItemReceiver;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.MediaDescriptionCompat.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.MediaBrowserCompat$SearchResultReceiver.set(rect);
        if (this.write) {
            float MediaBrowserCompat$ItemReceiver2 = AppCompatButton.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read);
            this.MediaBrowserCompat$SearchResultReceiver.inset((int) Math.ceil((double) AppCompatButton.read(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.read)), (int) Math.ceil((double) MediaBrowserCompat$ItemReceiver2));
            this.MediaDescriptionCompat.set(this.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        MediaBrowserCompat$CustomActionResultReceiver(rect);
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$ItemReceiver);
    }

    public final void setAlpha(int i) {
        this.RatingCompat.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.RatingCompat.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.MediaMetadataCompat = colorStateList;
        PorterDuff.Mode mode = this.f2643x50fd9e4a;
        this.MediaBrowserCompat$MediaItem = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.f2643x50fd9e4a = mode;
        ColorStateList colorStateList = this.MediaMetadataCompat;
        this.MediaBrowserCompat$MediaItem = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.IconCompatParcelizer;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.RatingCompat.getColor();
        if (z) {
            this.RatingCompat.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.MediaMetadataCompat;
        if (colorStateList2 == null || (mode = this.f2643x50fd9e4a) == null) {
            return z;
        }
        this.MediaBrowserCompat$MediaItem = (colorStateList2 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList2.getColorForState(getState(), 0), mode);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.IconCompatParcelizer;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.MediaMetadataCompat
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.IconCompatParcelizer
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setSupportBackgroundTintMode.isStateful():boolean");
    }
}
