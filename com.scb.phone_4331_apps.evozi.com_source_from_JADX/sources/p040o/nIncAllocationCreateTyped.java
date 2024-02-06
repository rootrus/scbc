package p040o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.nIncAllocationCreateTyped */
public class nIncAllocationCreateTyped extends Drawable {
    public int IconCompatParcelizer;
    public final Paint MediaBrowserCompat$CustomActionResultReceiver;
    public float MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public float MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private nIncAllocationCreateTyped$MediaBrowserCompat$ItemReceiver f2609x50fd9e4a = new nIncAllocationCreateTyped$MediaBrowserCompat$ItemReceiver(this, (byte) 0);
    public int MediaDescriptionCompat;
    private ColorStateList MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem;
    private RectF ParcelableVolumeInfo = new RectF();
    final Rect RatingCompat = new Rect();
    public boolean read = true;
    public int write;

    public nIncAllocationCreateTyped() {
        Paint paint = new Paint(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f2609x50fd9e4a;
    }

    public void draw(Canvas canvas) {
        if (this.read) {
            Paint paint = this.MediaBrowserCompat$CustomActionResultReceiver;
            Rect rect = this.RatingCompat;
            copyBounds(rect);
            float height = this.MediaBrowserCompat$ItemReceiver / ((float) rect.height());
            paint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, (float) rect.top, BitmapDescriptorFactory.HUE_RED, (float) rect.bottom, new int[]{AlertController$RecycleListView.IconCompatParcelizer(this.MediaDescriptionCompat, this.MediaSessionCompat$QueueItem), AlertController$RecycleListView.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, this.MediaSessionCompat$QueueItem), AlertController$RecycleListView.IconCompatParcelizer(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, 0), this.MediaSessionCompat$QueueItem), AlertController$RecycleListView.IconCompatParcelizer(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.write, 0), this.MediaSessionCompat$QueueItem), AlertController$RecycleListView.IconCompatParcelizer(this.write, this.MediaSessionCompat$QueueItem), AlertController$RecycleListView.IconCompatParcelizer(this.IconCompatParcelizer, this.MediaSessionCompat$QueueItem)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.read = false;
        }
        float strokeWidth = this.MediaBrowserCompat$CustomActionResultReceiver.getStrokeWidth() / 2.0f;
        RectF rectF = this.ParcelableVolumeInfo;
        copyBounds(this.RatingCompat);
        rectF.set(this.RatingCompat);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.MediaBrowserCompat$SearchResultReceiver, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.MediaBrowserCompat$CustomActionResultReceiver);
        canvas.restore();
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.MediaBrowserCompat$ItemReceiver);
        rect.set(round, round, round, round);
        return true;
    }

    public void setAlpha(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setAlpha(i);
        invalidateSelf();
    }

    public final void MediaBrowserCompat$ItemReceiver(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.MediaSessionCompat$QueueItem = colorStateList.getColorForState(getState(), this.MediaSessionCompat$QueueItem);
        }
        this.MediaMetadataCompat = colorStateList;
        this.read = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.MediaBrowserCompat$ItemReceiver > BitmapDescriptorFactory.HUE_RED ? -3 : -2;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.read = true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.MediaMetadataCompat;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.MediaMetadataCompat;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.MediaSessionCompat$QueueItem)) == this.MediaSessionCompat$QueueItem)) {
            this.read = true;
            this.MediaSessionCompat$QueueItem = colorForState;
        }
        if (this.read) {
            invalidateSelf();
        }
        return this.read;
    }
}
