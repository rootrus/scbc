package p040o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.setBackgroundDrawable;

/* renamed from: o.AppCompatButton */
public final class AppCompatButton extends Drawable {
    public static read MediaBrowserCompat$CustomActionResultReceiver;
    private static final double MediaBrowserCompat$MediaItem = Math.cos(Math.toRadians(45.0d));
    private float AlertController$RecycleListView;
    public final int IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver = true;
    public float MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private Paint f2533x50fd9e4a;
    private ColorStateList MediaDescriptionCompat;
    public float MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem = false;
    private Paint MediaSessionCompat$ResultReceiverWrapper;
    private Paint MediaSessionCompat$Token;
    private Path ParcelableVolumeInfo;
    private final int PlaybackStateCompat;
    private final RectF RatingCompat;
    public boolean read = true;
    private final int setHasDecor;
    public float write;

    /* renamed from: o.AppCompatButton$read */
    public interface read {
        void read(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public final int getOpacity() {
        return -3;
    }

    public AppCompatButton(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.setHasDecor = resources.getColor(setBackgroundDrawable.read.cardview_shadow_start_color);
        this.PlaybackStateCompat = resources.getColor(setBackgroundDrawable.read.cardview_shadow_end_color);
        this.IconCompatParcelizer = resources.getDimensionPixelSize(C1454x8d0f0ffb.cardview_compat_inset_shadow);
        this.MediaSessionCompat$ResultReceiverWrapper = new Paint(5);
        read(colorStateList);
        Paint paint = new Paint(5);
        this.MediaSessionCompat$Token = paint;
        paint.setStyle(Paint.Style.FILL);
        this.write = (float) ((int) (f + 0.5f));
        this.RatingCompat = new RectF();
        Paint paint2 = new Paint(this.MediaSessionCompat$Token);
        this.f2533x50fd9e4a = paint2;
        paint2.setAntiAlias(false);
        read(f2, f3);
    }

    public final void read(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.MediaDescriptionCompat = colorStateList;
        this.MediaSessionCompat$ResultReceiverWrapper.setColor(colorStateList.getColorForState(getState(), this.MediaDescriptionCompat.getDefaultColor()));
    }

    public final void setAlpha(int i) {
        this.MediaSessionCompat$ResultReceiverWrapper.setAlpha(i);
        this.MediaSessionCompat$Token.setAlpha(i);
        this.f2533x50fd9e4a.setAlpha(i);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.MediaBrowserCompat$ItemReceiver = true;
    }

    public final boolean getPadding(Rect rect) {
        float f = this.MediaBrowserCompat$SearchResultReceiver;
        int ceil = (int) Math.ceil((double) (this.read ? (float) (((double) (f * 1.5f)) + ((1.0d - MediaBrowserCompat$MediaItem) * ((double) this.write))) : f * 1.5f));
        float f2 = this.MediaBrowserCompat$SearchResultReceiver;
        float f3 = this.write;
        if (this.read) {
            f2 = (float) (((double) f2) + ((1.0d - MediaBrowserCompat$MediaItem) * ((double) f3)));
        }
        int ceil2 = (int) Math.ceil((double) f2);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    static float MediaBrowserCompat$ItemReceiver(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - MediaBrowserCompat$MediaItem) * ((double) f2))) : f * 1.5f;
    }

    static float read(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - MediaBrowserCompat$MediaItem) * ((double) f2))) : f;
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.MediaDescriptionCompat;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.MediaSessionCompat$ResultReceiverWrapper.getColor() == colorForState) {
            return false;
        }
        this.MediaSessionCompat$ResultReceiverWrapper.setColor(colorForState);
        this.MediaBrowserCompat$ItemReceiver = true;
        invalidateSelf();
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.MediaDescriptionCompat;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.MediaSessionCompat$ResultReceiverWrapper.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        if (this.MediaBrowserCompat$ItemReceiver) {
            Rect bounds = getBounds();
            float f = this.MediaBrowserCompat$SearchResultReceiver * 1.5f;
            this.RatingCompat.set(((float) bounds.left) + this.MediaBrowserCompat$SearchResultReceiver, ((float) bounds.top) + f, ((float) bounds.right) - this.MediaBrowserCompat$SearchResultReceiver, ((float) bounds.bottom) - f);
            float f2 = this.write;
            float f3 = -f2;
            RectF rectF = new RectF(f3, f3, f2, f2);
            RectF rectF2 = new RectF(rectF);
            float f4 = -this.AlertController$RecycleListView;
            rectF2.inset(f4, f4);
            Path path = this.ParcelableVolumeInfo;
            if (path == null) {
                this.ParcelableVolumeInfo = new Path();
            } else {
                path.reset();
            }
            this.ParcelableVolumeInfo.setFillType(Path.FillType.EVEN_ODD);
            this.ParcelableVolumeInfo.moveTo(-this.write, BitmapDescriptorFactory.HUE_RED);
            this.ParcelableVolumeInfo.rLineTo(-this.AlertController$RecycleListView, BitmapDescriptorFactory.HUE_RED);
            this.ParcelableVolumeInfo.arcTo(rectF2, 180.0f, 90.0f, false);
            this.ParcelableVolumeInfo.arcTo(rectF, 270.0f, -90.0f, false);
            this.ParcelableVolumeInfo.close();
            float f5 = this.write;
            float f6 = this.AlertController$RecycleListView;
            Paint paint = this.MediaSessionCompat$Token;
            int i2 = this.setHasDecor;
            paint.setShader(new RadialGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5 + f6, new int[]{i2, i2, this.PlaybackStateCompat}, new float[]{0.0f, f5 / (f6 + f5), 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.f2533x50fd9e4a;
            float f7 = -this.write;
            float f8 = this.AlertController$RecycleListView;
            int i3 = this.setHasDecor;
            paint2.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, f7 + f8, BitmapDescriptorFactory.HUE_RED, f7 - f8, new int[]{i3, i3, this.PlaybackStateCompat}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f2533x50fd9e4a.setAntiAlias(false);
            this.MediaBrowserCompat$ItemReceiver = false;
        }
        canvas2.translate(BitmapDescriptorFactory.HUE_RED, this.MediaMetadataCompat / 2.0f);
        float f9 = this.write;
        float f10 = (-f9) - this.AlertController$RecycleListView;
        float f11 = f9 + ((float) this.IconCompatParcelizer) + (this.MediaMetadataCompat / 2.0f);
        float f12 = f11 * 2.0f;
        boolean z = this.RatingCompat.width() - f12 > BitmapDescriptorFactory.HUE_RED;
        boolean z2 = this.RatingCompat.height() - f12 > BitmapDescriptorFactory.HUE_RED;
        int save = canvas.save();
        canvas2.translate(this.RatingCompat.left + f11, this.RatingCompat.top + f11);
        canvas2.drawPath(this.ParcelableVolumeInfo, this.MediaSessionCompat$Token);
        if (z) {
            i = save;
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f10, this.RatingCompat.width() - f12, -this.write, this.f2533x50fd9e4a);
        } else {
            i = save;
        }
        canvas2.restoreToCount(i);
        int save2 = canvas.save();
        canvas2.translate(this.RatingCompat.right - f11, this.RatingCompat.bottom - f11);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.ParcelableVolumeInfo, this.MediaSessionCompat$Token);
        if (z) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f10, this.RatingCompat.width() - f12, (-this.write) + this.AlertController$RecycleListView, this.f2533x50fd9e4a);
        }
        canvas2.restoreToCount(save2);
        int save3 = canvas.save();
        canvas2.translate(this.RatingCompat.left + f11, this.RatingCompat.bottom - f11);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.ParcelableVolumeInfo, this.MediaSessionCompat$Token);
        if (z2) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f10, this.RatingCompat.height() - f12, -this.write, this.f2533x50fd9e4a);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.RatingCompat.right - f11, this.RatingCompat.top + f11);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.ParcelableVolumeInfo, this.MediaSessionCompat$Token);
        if (z2) {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f10, this.RatingCompat.height() - f12, -this.write, this.f2533x50fd9e4a);
        }
        canvas2.restoreToCount(save4);
        canvas2.translate(BitmapDescriptorFactory.HUE_RED, (-this.MediaMetadataCompat) / 2.0f);
        MediaBrowserCompat$CustomActionResultReceiver.read(canvas2, this.RatingCompat, this.write, this.MediaSessionCompat$ResultReceiverWrapper);
    }

    public final void read(float f, float f2) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid shadow size ");
            sb.append(f);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= BitmapDescriptorFactory.HUE_RED) {
            int i = (int) (f + 0.5f);
            if (i % 2 == 1) {
                i--;
            }
            float f3 = (float) i;
            int i2 = (int) (f2 + 0.5f);
            if (i2 % 2 == 1) {
                i2--;
            }
            float f4 = (float) i2;
            if (f3 > f4) {
                if (!this.MediaSessionCompat$QueueItem) {
                    this.MediaSessionCompat$QueueItem = true;
                }
                f3 = f4;
            }
            if (this.MediaMetadataCompat != f3 || this.MediaBrowserCompat$SearchResultReceiver != f4) {
                this.MediaMetadataCompat = f3;
                this.MediaBrowserCompat$SearchResultReceiver = f4;
                this.AlertController$RecycleListView = (float) ((int) ((f3 * 1.5f) + ((float) this.IconCompatParcelizer) + 0.5f));
                this.MediaBrowserCompat$ItemReceiver = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(". Must be >= 0");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
