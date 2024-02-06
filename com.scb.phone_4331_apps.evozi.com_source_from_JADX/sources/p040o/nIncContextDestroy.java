package p040o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.nAllocationSetSurface;

/* renamed from: o.nIncContextDestroy */
public final class nIncContextDestroy extends setChecked {
    public static final double MediaBrowserCompat$ItemReceiver = Math.cos(Math.toRadians(45.0d));
    private final int AlertController$RecycleListView;
    public float IconCompatParcelizer;
    private float Keep;
    public float MediaBrowserCompat$MediaItem;
    private Paint MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final int f2610x50fd9e4a;
    private Path MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private final int MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper = true;
    private boolean MediaSessionCompat$Token = false;
    private Paint ParcelableVolumeInfo;
    private RectF RatingCompat;
    public float read;
    public boolean write = true;

    public final int getOpacity() {
        return -3;
    }

    public nIncContextDestroy(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.AlertController$RecycleListView = setLastBaselineToBottomHeight.read(context, nAllocationSetSurface.write.design_fab_shadow_start_color);
        this.MediaSessionCompat$QueueItem = setLastBaselineToBottomHeight.read(context, nAllocationSetSurface.write.design_fab_shadow_mid_color);
        this.f2610x50fd9e4a = setLastBaselineToBottomHeight.read(context, nAllocationSetSurface.write.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.MediaBrowserCompat$SearchResultReceiver = paint;
        paint.setStyle(Paint.Style.FILL);
        this.MediaMetadataCompat = (float) Math.round(f);
        this.RatingCompat = new RectF();
        Paint paint2 = new Paint(this.MediaBrowserCompat$SearchResultReceiver);
        this.ParcelableVolumeInfo = paint2;
        paint2.setAntiAlias(false);
        MediaBrowserCompat$CustomActionResultReceiver(f2, f3);
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.MediaBrowserCompat$SearchResultReceiver.setAlpha(i);
        this.ParcelableVolumeInfo.setAlpha(i);
    }

    public final void onBoundsChange(Rect rect) {
        this.MediaSessionCompat$ResultReceiverWrapper = true;
    }

    public final boolean getPadding(Rect rect) {
        float f = this.IconCompatParcelizer;
        int ceil = (int) Math.ceil((double) (this.write ? (float) (((double) (f * 1.5f)) + ((1.0d - MediaBrowserCompat$ItemReceiver) * ((double) this.MediaMetadataCompat))) : f * 1.5f));
        float f2 = this.IconCompatParcelizer;
        float f3 = this.MediaMetadataCompat;
        if (this.write) {
            f2 = (float) (((double) f2) + ((1.0d - MediaBrowserCompat$ItemReceiver) * ((double) f3)));
        }
        int ceil2 = (int) Math.ceil((double) f2);
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        float f;
        Canvas canvas2 = canvas;
        if (this.MediaSessionCompat$ResultReceiverWrapper) {
            Rect bounds = getBounds();
            float f2 = this.IconCompatParcelizer * 1.5f;
            this.RatingCompat.set(((float) bounds.left) + this.IconCompatParcelizer, ((float) bounds.top) + f2, ((float) bounds.right) - this.IconCompatParcelizer, ((float) bounds.bottom) - f2);
            this.MediaBrowserCompat$CustomActionResultReceiver.setBounds((int) this.RatingCompat.left, (int) this.RatingCompat.top, (int) this.RatingCompat.right, (int) this.RatingCompat.bottom);
            float f3 = this.MediaMetadataCompat;
            float f4 = -f3;
            RectF rectF = new RectF(f4, f4, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f5 = -this.Keep;
            rectF2.inset(f5, f5);
            Path path = this.MediaDescriptionCompat;
            if (path == null) {
                this.MediaDescriptionCompat = new Path();
            } else {
                path.reset();
            }
            this.MediaDescriptionCompat.setFillType(Path.FillType.EVEN_ODD);
            this.MediaDescriptionCompat.moveTo(-this.MediaMetadataCompat, BitmapDescriptorFactory.HUE_RED);
            this.MediaDescriptionCompat.rLineTo(-this.Keep, BitmapDescriptorFactory.HUE_RED);
            this.MediaDescriptionCompat.arcTo(rectF2, 180.0f, 90.0f, false);
            this.MediaDescriptionCompat.arcTo(rectF, 270.0f, -90.0f, false);
            this.MediaDescriptionCompat.close();
            float f6 = -rectF2.top;
            if (f6 > BitmapDescriptorFactory.HUE_RED) {
                float f7 = this.MediaMetadataCompat / f6;
                this.MediaBrowserCompat$SearchResultReceiver.setShader(new RadialGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f6, new int[]{0, this.AlertController$RecycleListView, this.MediaSessionCompat$QueueItem, this.f2610x50fd9e4a}, new float[]{0.0f, f7, ((1.0f - f7) / 2.0f) + f7, 1.0f}, Shader.TileMode.CLAMP));
            }
            z = true;
            this.ParcelableVolumeInfo.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, rectF.top, BitmapDescriptorFactory.HUE_RED, rectF2.top, new int[]{this.AlertController$RecycleListView, this.MediaSessionCompat$QueueItem, this.f2610x50fd9e4a}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.ParcelableVolumeInfo.setAntiAlias(false);
            this.MediaSessionCompat$ResultReceiverWrapper = false;
        } else {
            z = true;
        }
        int save = canvas.save();
        canvas2.rotate(this.MediaBrowserCompat$MediaItem, this.RatingCompat.centerX(), this.RatingCompat.centerY());
        float f8 = this.MediaMetadataCompat;
        float f9 = (-f8) - this.Keep;
        float f10 = f8 * 2.0f;
        boolean z2 = this.RatingCompat.width() - f10 > BitmapDescriptorFactory.HUE_RED ? z : false;
        if (this.RatingCompat.height() - f10 <= BitmapDescriptorFactory.HUE_RED) {
            z = false;
        }
        float f11 = this.read;
        float f12 = f8 / ((f11 - (0.5f * f11)) + f8);
        float f13 = f8 / ((f11 - (0.25f * f11)) + f8);
        float f14 = f8 / ((f11 - f11) + f8);
        int save2 = canvas.save();
        canvas2.translate(this.RatingCompat.left + f8, this.RatingCompat.top + f8);
        canvas2.scale(f12, f13);
        canvas2.drawPath(this.MediaDescriptionCompat, this.MediaBrowserCompat$SearchResultReceiver);
        if (z2) {
            canvas2.scale(1.0f / f12, 1.0f);
            i2 = save2;
            i = save;
            f = f14;
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f9, this.RatingCompat.width() - f10, -this.MediaMetadataCompat, this.ParcelableVolumeInfo);
        } else {
            i2 = save2;
            i = save;
            f = f14;
        }
        canvas2.restoreToCount(i2);
        int save3 = canvas.save();
        canvas2.translate(this.RatingCompat.right - f8, this.RatingCompat.bottom - f8);
        canvas2.scale(f12, f);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.MediaDescriptionCompat, this.MediaBrowserCompat$SearchResultReceiver);
        if (z2) {
            canvas2.scale(1.0f / f12, 1.0f);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f9, this.RatingCompat.width() - f10, (-this.MediaMetadataCompat) + this.Keep, this.ParcelableVolumeInfo);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas.save();
        canvas2.translate(this.RatingCompat.left + f8, this.RatingCompat.bottom - f8);
        canvas2.scale(f12, f);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.MediaDescriptionCompat, this.MediaBrowserCompat$SearchResultReceiver);
        if (z) {
            canvas2.scale(1.0f / f, 1.0f);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f9, this.RatingCompat.height() - f10, -this.MediaMetadataCompat, this.ParcelableVolumeInfo);
        }
        canvas2.restoreToCount(save4);
        int save5 = canvas.save();
        canvas2.translate(this.RatingCompat.right - f8, this.RatingCompat.top + f8);
        canvas2.scale(f12, f13);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.MediaDescriptionCompat, this.MediaBrowserCompat$SearchResultReceiver);
        if (z) {
            canvas2.scale(1.0f / f13, 1.0f);
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, f9, this.RatingCompat.height() - f10, -this.MediaMetadataCompat, this.ParcelableVolumeInfo);
        }
        canvas2.restoreToCount(save5);
        canvas2.restoreToCount(i);
        super.draw(canvas);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(float f, float f2) {
        if (f < BitmapDescriptorFactory.HUE_RED || f2 < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        int round = Math.round(f);
        if (round % 2 == 1) {
            round--;
        }
        float f3 = (float) round;
        int round2 = Math.round(f2);
        if (round2 % 2 == 1) {
            round2--;
        }
        float f4 = (float) round2;
        if (f3 > f4) {
            if (!this.MediaSessionCompat$Token) {
                this.MediaSessionCompat$Token = true;
            }
            f3 = f4;
        }
        if (this.read != f3 || this.IconCompatParcelizer != f4) {
            this.read = f3;
            this.IconCompatParcelizer = f4;
            this.Keep = (float) Math.round(f3 * 1.5f);
            this.MediaSessionCompat$ResultReceiverWrapper = true;
            invalidateSelf();
        }
    }
}
