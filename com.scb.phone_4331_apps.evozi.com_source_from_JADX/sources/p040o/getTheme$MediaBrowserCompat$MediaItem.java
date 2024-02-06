package p040o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p040o.getTheme;

/* renamed from: o.getTheme$MediaBrowserCompat$MediaItem */
class getTheme$MediaBrowserCompat$MediaItem extends Drawable.ConstantState {
    boolean IconCompatParcelizer;
    Bitmap MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    PorterDuff.Mode MediaBrowserCompat$MediaItem;
    Paint MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    PorterDuff.Mode f2597x50fd9e4a;
    ColorStateList MediaDescriptionCompat;
    ColorStateList MediaMetadataCompat;
    getTheme.MediaDescriptionCompat ParcelableVolumeInfo;
    int RatingCompat;
    boolean read;
    int write;

    public getTheme$MediaBrowserCompat$MediaItem(getTheme$MediaBrowserCompat$MediaItem gettheme_mediabrowsercompat_mediaitem) {
        this.MediaMetadataCompat = null;
        this.f2597x50fd9e4a = getTheme.MediaBrowserCompat$CustomActionResultReceiver;
        if (gettheme_mediabrowsercompat_mediaitem != null) {
            this.RatingCompat = gettheme_mediabrowsercompat_mediaitem.RatingCompat;
            this.ParcelableVolumeInfo = new getTheme.MediaDescriptionCompat(gettheme_mediabrowsercompat_mediaitem.ParcelableVolumeInfo);
            if (gettheme_mediabrowsercompat_mediaitem.ParcelableVolumeInfo.IconCompatParcelizer != null) {
                this.ParcelableVolumeInfo.IconCompatParcelizer = new Paint(gettheme_mediabrowsercompat_mediaitem.ParcelableVolumeInfo.IconCompatParcelizer);
            }
            if (gettheme_mediabrowsercompat_mediaitem.ParcelableVolumeInfo.MediaBrowserCompat$MediaItem != null) {
                this.ParcelableVolumeInfo.MediaBrowserCompat$MediaItem = new Paint(gettheme_mediabrowsercompat_mediaitem.ParcelableVolumeInfo.MediaBrowserCompat$MediaItem);
            }
            this.MediaMetadataCompat = gettheme_mediabrowsercompat_mediaitem.MediaMetadataCompat;
            this.f2597x50fd9e4a = gettheme_mediabrowsercompat_mediaitem.f2597x50fd9e4a;
            this.IconCompatParcelizer = gettheme_mediabrowsercompat_mediaitem.IconCompatParcelizer;
        }
    }

    public void write(Canvas canvas, ColorFilter colorFilter, Rect rect) {
        canvas.drawBitmap(this.MediaBrowserCompat$CustomActionResultReceiver, (Rect) null, rect, read(colorFilter));
    }

    public boolean read() {
        return this.ParcelableVolumeInfo.getRootAlpha() < 255;
    }

    public Paint read(ColorFilter colorFilter) {
        if (!read() && colorFilter == null) {
            return null;
        }
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            Paint paint = new Paint();
            this.MediaBrowserCompat$SearchResultReceiver = paint;
            paint.setFilterBitmap(true);
        }
        this.MediaBrowserCompat$SearchResultReceiver.setAlpha(this.ParcelableVolumeInfo.getRootAlpha());
        this.MediaBrowserCompat$SearchResultReceiver.setColorFilter(colorFilter);
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        this.MediaBrowserCompat$CustomActionResultReceiver.eraseColor(0);
        this.ParcelableVolumeInfo.IconCompatParcelizer(new Canvas(this.MediaBrowserCompat$CustomActionResultReceiver), i, i2, (ColorFilter) null);
    }

    public void IconCompatParcelizer(int i, int i2) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null || !MediaBrowserCompat$CustomActionResultReceiver(i, i2)) {
            this.MediaBrowserCompat$CustomActionResultReceiver = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.MediaBrowserCompat$ItemReceiver = true;
        }
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        return i == this.MediaBrowserCompat$CustomActionResultReceiver.getWidth() && i2 == this.MediaBrowserCompat$CustomActionResultReceiver.getHeight();
    }

    public boolean MediaBrowserCompat$ItemReceiver() {
        return !this.MediaBrowserCompat$ItemReceiver && this.MediaDescriptionCompat == this.MediaMetadataCompat && this.MediaBrowserCompat$MediaItem == this.f2597x50fd9e4a && this.read == this.IconCompatParcelizer && this.write == this.ParcelableVolumeInfo.getRootAlpha();
    }

    public void write() {
        this.MediaDescriptionCompat = this.MediaMetadataCompat;
        this.MediaBrowserCompat$MediaItem = this.f2597x50fd9e4a;
        this.write = this.ParcelableVolumeInfo.getRootAlpha();
        this.read = this.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = false;
    }

    public getTheme$MediaBrowserCompat$MediaItem() {
        this.MediaMetadataCompat = null;
        this.f2597x50fd9e4a = getTheme.MediaBrowserCompat$CustomActionResultReceiver;
        this.ParcelableVolumeInfo = new getTheme.MediaDescriptionCompat();
    }

    public Drawable newDrawable() {
        return new getTheme(this);
    }

    public Drawable newDrawable(Resources resources) {
        return new getTheme(this);
    }

    public int getChangingConfigurations() {
        return this.RatingCompat;
    }

    public boolean IconCompatParcelizer() {
        return this.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(int[] iArr) {
        boolean read2 = this.ParcelableVolumeInfo.read(iArr);
        this.MediaBrowserCompat$ItemReceiver |= read2;
        return read2;
    }
}
