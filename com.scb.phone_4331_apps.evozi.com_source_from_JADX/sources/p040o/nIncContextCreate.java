package p040o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.Iterables;

/* renamed from: o.nIncContextCreate */
public final class nIncContextCreate extends Drawable implements setOnFitSystemWindowsListener {
    private int AlertController$RecycleListView;
    private PorterDuff.Mode AppCompatDelegateImpl$ListMenuDecorView;
    private ColorStateList AppCompatDialogFragment;
    public Paint.Style IconCompatParcelizer;
    private int Keep;
    public float MediaBrowserCompat$CustomActionResultReceiver;
    private final nIncContextFinish[] MediaBrowserCompat$ItemReceiver;
    private final Matrix[] MediaBrowserCompat$MediaItem;
    private final Matrix[] MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final Region f5546x50fd9e4a;
    private final Matrix MediaDescriptionCompat;
    private final Path MediaMetadataCompat;
    private float MediaSessionCompat$QueueItem;
    private final float[] MediaSessionCompat$ResultReceiverWrapper;
    private final float[] MediaSessionCompat$Token;
    private final PointF ParcelableVolumeInfo;
    private Iterables.C35273.RatingCompat PlaybackStateCompat;
    private int PlaybackStateCompat$CustomAction;
    private final Paint RatingCompat;
    public boolean read;
    private PorterDuffColorFilter setBackgroundResource;
    private final Region setContentView;
    private final nIncContextFinish setHasDecor;
    private int write;

    public final int getOpacity() {
        return -3;
    }

    public nIncContextCreate() {
        this((Iterables.C35273.RatingCompat) null);
    }

    public nIncContextCreate(Iterables.C35273.RatingCompat ratingCompat) {
        this.RatingCompat = new Paint();
        this.MediaBrowserCompat$SearchResultReceiver = new Matrix[4];
        this.MediaBrowserCompat$MediaItem = new Matrix[4];
        this.MediaBrowserCompat$ItemReceiver = new nIncContextFinish[4];
        this.MediaDescriptionCompat = new Matrix();
        this.MediaMetadataCompat = new Path();
        this.ParcelableVolumeInfo = new PointF();
        this.setHasDecor = new nIncContextFinish();
        this.setContentView = new Region();
        this.f5546x50fd9e4a = new Region();
        this.MediaSessionCompat$ResultReceiverWrapper = new float[2];
        this.MediaSessionCompat$Token = new float[2];
        this.PlaybackStateCompat = null;
        this.read = false;
        this.MediaBrowserCompat$CustomActionResultReceiver = 1.0f;
        this.AlertController$RecycleListView = -16777216;
        this.PlaybackStateCompat$CustomAction = 5;
        this.Keep = 10;
        this.write = 255;
        this.MediaSessionCompat$QueueItem = 1.0f;
        this.IconCompatParcelizer = Paint.Style.FILL_AND_STROKE;
        this.AppCompatDelegateImpl$ListMenuDecorView = PorterDuff.Mode.SRC_IN;
        this.AppCompatDialogFragment = null;
        this.PlaybackStateCompat = ratingCompat;
        for (int i = 0; i < 4; i++) {
            this.MediaBrowserCompat$SearchResultReceiver[i] = new Matrix();
            this.MediaBrowserCompat$MediaItem[i] = new Matrix();
            this.MediaBrowserCompat$ItemReceiver[i] = new nIncContextFinish();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.AppCompatDialogFragment = colorStateList;
        write();
        invalidateSelf();
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.AppCompatDelegateImpl$ListMenuDecorView = mode;
        write();
        invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public final void setAlpha(int i) {
        this.write = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.RatingCompat.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.setContentView.set(bounds);
        MediaBrowserCompat$CustomActionResultReceiver(bounds.width(), bounds.height(), this.MediaMetadataCompat);
        this.f5546x50fd9e4a.setPath(this.MediaMetadataCompat, this.setContentView);
        this.setContentView.op(this.f5546x50fd9e4a, Region.Op.DIFFERENCE);
        return this.setContentView;
    }

    public final void draw(Canvas canvas) {
        this.RatingCompat.setColorFilter(this.setBackgroundResource);
        int alpha = this.RatingCompat.getAlpha();
        Paint paint = this.RatingCompat;
        int i = this.write;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        this.RatingCompat.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        this.RatingCompat.setStyle(this.IconCompatParcelizer);
        int i2 = this.PlaybackStateCompat$CustomAction;
        if (i2 > 0 && this.read) {
            this.RatingCompat.setShadowLayer((float) this.Keep, BitmapDescriptorFactory.HUE_RED, (float) i2, this.AlertController$RecycleListView);
        }
        if (this.PlaybackStateCompat != null) {
            MediaBrowserCompat$CustomActionResultReceiver(canvas.getWidth(), canvas.getHeight(), this.MediaMetadataCompat);
            canvas.drawPath(this.MediaMetadataCompat, this.RatingCompat);
        } else {
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight(), this.RatingCompat);
        }
        this.RatingCompat.setAlpha(alpha);
    }

    private static void IconCompatParcelizer(int i, int i2, int i3, PointF pointF) {
        if (i == 1) {
            pointF.set((float) i2, BitmapDescriptorFactory.HUE_RED);
        } else if (i == 2) {
            pointF.set((float) i2, (float) i3);
        } else if (i != 3) {
            pointF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            pointF.set(BitmapDescriptorFactory.HUE_RED, (float) i3);
        }
    }

    private float MediaBrowserCompat$ItemReceiver(int i, int i2, int i3) {
        IconCompatParcelizer(i, i2, i3, this.ParcelableVolumeInfo);
        float f = this.ParcelableVolumeInfo.x;
        float f2 = this.ParcelableVolumeInfo.y;
        IconCompatParcelizer((i + 1) % 4, i2, i3, this.ParcelableVolumeInfo);
        return (float) Math.atan2((double) (this.ParcelableVolumeInfo.y - f2), (double) (this.ParcelableVolumeInfo.x - f));
    }

    private void write() {
        ColorStateList colorStateList = this.AppCompatDialogFragment;
        if (colorStateList == null || this.AppCompatDelegateImpl$ListMenuDecorView == null) {
            this.setBackgroundResource = null;
        } else {
            this.setBackgroundResource = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.AppCompatDelegateImpl$ListMenuDecorView);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, Path path) {
        int i3;
        Iterables$3$MediaBrowserCompat$CustomActionResultReceiver iterables$3$MediaBrowserCompat$CustomActionResultReceiver;
        char c;
        int i4 = i;
        int i5 = i2;
        Path path2 = path;
        path.rewind();
        if (this.PlaybackStateCompat != null) {
            int i6 = 0;
            while (true) {
                if (i6 >= 4) {
                    break;
                }
                IconCompatParcelizer(i6, i4, i5, this.ParcelableVolumeInfo);
                int i7 = ((i6 - 1) + 4) % 4;
                IconCompatParcelizer(i7, i4, i5, this.ParcelableVolumeInfo);
                float f = this.ParcelableVolumeInfo.x;
                float f2 = this.ParcelableVolumeInfo.y;
                int i8 = i6 + 1;
                IconCompatParcelizer(i8 % 4, i4, i5, this.ParcelableVolumeInfo);
                float f3 = this.ParcelableVolumeInfo.x;
                float f4 = this.ParcelableVolumeInfo.y;
                IconCompatParcelizer(i6, i4, i5, this.ParcelableVolumeInfo);
                float f5 = this.ParcelableVolumeInfo.x;
                float f6 = this.ParcelableVolumeInfo.y;
                if (i6 == 1) {
                    Iterables$3$MediaBrowserCompat$ItemReceiver iterables$3$MediaBrowserCompat$ItemReceiver = this.PlaybackStateCompat.MediaBrowserCompat$MediaItem;
                } else if (i6 == 2) {
                    Iterables$3$MediaBrowserCompat$ItemReceiver iterables$3$MediaBrowserCompat$ItemReceiver2 = this.PlaybackStateCompat.write;
                } else if (i6 != 3) {
                    Iterables$3$MediaBrowserCompat$ItemReceiver iterables$3$MediaBrowserCompat$ItemReceiver3 = this.PlaybackStateCompat.MediaDescriptionCompat;
                } else {
                    Iterables$3$MediaBrowserCompat$ItemReceiver iterables$3$MediaBrowserCompat$ItemReceiver4 = this.PlaybackStateCompat.read;
                }
                float MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i7, i4, i5);
                this.MediaBrowserCompat$SearchResultReceiver[i6].reset();
                this.MediaBrowserCompat$SearchResultReceiver[i6].setTranslate(this.ParcelableVolumeInfo.x, this.ParcelableVolumeInfo.y);
                this.MediaBrowserCompat$SearchResultReceiver[i6].preRotate((float) Math.toDegrees((double) (MediaBrowserCompat$ItemReceiver2 + 1.5707964f)));
                this.MediaSessionCompat$ResultReceiverWrapper[0] = this.MediaBrowserCompat$ItemReceiver[i6].write;
                this.MediaSessionCompat$ResultReceiverWrapper[1] = this.MediaBrowserCompat$ItemReceiver[i6].IconCompatParcelizer;
                this.MediaBrowserCompat$SearchResultReceiver[i6].mapPoints(this.MediaSessionCompat$ResultReceiverWrapper);
                float MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(i6, i4, i5);
                this.MediaBrowserCompat$MediaItem[i6].reset();
                Matrix matrix = this.MediaBrowserCompat$MediaItem[i6];
                float[] fArr = this.MediaSessionCompat$ResultReceiverWrapper;
                matrix.setTranslate(fArr[0], fArr[1]);
                this.MediaBrowserCompat$MediaItem[i6].preRotate((float) Math.toDegrees((double) MediaBrowserCompat$ItemReceiver3));
                i6 = i8;
            }
            int i9 = 0;
            for (i3 = 4; i9 < i3; i3 = 4) {
                float[] fArr2 = this.MediaSessionCompat$ResultReceiverWrapper;
                fArr2[0] = 0.0f;
                fArr2[1] = 0.0f;
                this.MediaBrowserCompat$SearchResultReceiver[i9].mapPoints(fArr2);
                if (i9 == 0) {
                    float[] fArr3 = this.MediaSessionCompat$ResultReceiverWrapper;
                    path2.moveTo(fArr3[0], fArr3[1]);
                } else {
                    float[] fArr4 = this.MediaSessionCompat$ResultReceiverWrapper;
                    path2.lineTo(fArr4[0], fArr4[1]);
                }
                this.MediaBrowserCompat$ItemReceiver[i9].MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$SearchResultReceiver[i9], path2);
                int i10 = i9 + 1;
                this.MediaSessionCompat$ResultReceiverWrapper[0] = this.MediaBrowserCompat$ItemReceiver[i9].write;
                this.MediaSessionCompat$ResultReceiverWrapper[1] = this.MediaBrowserCompat$ItemReceiver[i9].IconCompatParcelizer;
                this.MediaBrowserCompat$SearchResultReceiver[i9].mapPoints(this.MediaSessionCompat$ResultReceiverWrapper);
                float[] fArr5 = this.MediaSessionCompat$Token;
                fArr5[0] = 0.0f;
                fArr5[1] = 0.0f;
                this.MediaBrowserCompat$SearchResultReceiver[i10 % 4].mapPoints(fArr5);
                float[] fArr6 = this.MediaSessionCompat$ResultReceiverWrapper;
                float f7 = fArr6[0];
                float[] fArr7 = this.MediaSessionCompat$Token;
                float hypot = (float) Math.hypot((double) (f7 - fArr7[0]), (double) (fArr6[1] - fArr7[1]));
                nIncContextFinish ninccontextfinish = this.setHasDecor;
                ninccontextfinish.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
                ninccontextfinish.read = BitmapDescriptorFactory.HUE_RED;
                ninccontextfinish.write = BitmapDescriptorFactory.HUE_RED;
                ninccontextfinish.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
                ninccontextfinish.MediaBrowserCompat$ItemReceiver.clear();
                if (i9 == 1) {
                    c = 3;
                    iterables$3$MediaBrowserCompat$CustomActionResultReceiver = this.PlaybackStateCompat.MediaBrowserCompat$ItemReceiver;
                } else if (i9 != 2) {
                    c = 3;
                    if (i9 != 3) {
                        iterables$3$MediaBrowserCompat$CustomActionResultReceiver = this.PlaybackStateCompat.RatingCompat;
                    } else {
                        iterables$3$MediaBrowserCompat$CustomActionResultReceiver = this.PlaybackStateCompat.IconCompatParcelizer;
                    }
                } else {
                    c = 3;
                    iterables$3$MediaBrowserCompat$CustomActionResultReceiver = this.PlaybackStateCompat.MediaBrowserCompat$CustomActionResultReceiver;
                }
                iterables$3$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(hypot, this.MediaBrowserCompat$CustomActionResultReceiver, this.setHasDecor);
                this.setHasDecor.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem[i9], path2);
                char c2 = c;
                i9 = i10;
            }
            path.close();
        }
        if (this.MediaSessionCompat$QueueItem != 1.0f) {
            this.MediaDescriptionCompat.reset();
            Matrix matrix2 = this.MediaDescriptionCompat;
            float f8 = this.MediaSessionCompat$QueueItem;
            matrix2.setScale(f8, f8, (float) (i4 / 2), (float) (i5 / 2));
            path2.transform(this.MediaDescriptionCompat);
        }
    }
}
