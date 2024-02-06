package p040o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.setOnHierarchyChangeListener */
public final class setOnHierarchyChangeListener extends Drawable implements Animatable {
    private static final int[] MediaBrowserCompat$CustomActionResultReceiver = {-16777216};
    private static final Interpolator MediaBrowserCompat$ItemReceiver = new LinearInterpolator();
    private static final Interpolator MediaMetadataCompat = new setMinimumHeight();
    float IconCompatParcelizer;
    private Resources MediaBrowserCompat$MediaItem;
    private Animator MediaBrowserCompat$SearchResultReceiver;
    private float MediaDescriptionCompat;
    boolean read;
    public final IconCompatParcelizer write;

    private static int read(float f, int i, int i2) {
        int i3 = i >>> 24;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) ((i2 >>> 24) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    public final int getOpacity() {
        return -3;
    }

    public setOnHierarchyChangeListener(Context context) {
        if (context != null) {
            this.MediaBrowserCompat$MediaItem = context.getResources();
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
            this.write = iconCompatParcelizer;
            iconCompatParcelizer.MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver;
            iconCompatParcelizer.MediaMetadataCompat = 0;
            iconCompatParcelizer.MediaDescriptionCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem[0];
            IconCompatParcelizer iconCompatParcelizer2 = this.write;
            iconCompatParcelizer2.setHasDecor = 2.5f;
            iconCompatParcelizer2.ParcelableVolumeInfo.setStrokeWidth(2.5f);
            invalidateSelf();
            final IconCompatParcelizer iconCompatParcelizer3 = this.write;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    setOnHierarchyChangeListener.MediaBrowserCompat$CustomActionResultReceiver(floatValue, iconCompatParcelizer3);
                    setOnHierarchyChangeListener.this.MediaBrowserCompat$ItemReceiver(floatValue, iconCompatParcelizer3, false);
                    setOnHierarchyChangeListener.this.invalidateSelf();
                }
            });
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(MediaBrowserCompat$ItemReceiver);
            ofFloat.addListener(new Animator.AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    setOnHierarchyChangeListener.this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
                }

                public final void onAnimationRepeat(Animator animator) {
                    setOnHierarchyChangeListener.this.MediaBrowserCompat$ItemReceiver(1.0f, iconCompatParcelizer3, true);
                    IconCompatParcelizer iconCompatParcelizer = iconCompatParcelizer3;
                    iconCompatParcelizer.PlaybackStateCompat = iconCompatParcelizer.Keep;
                    iconCompatParcelizer.PlaybackStateCompat$CustomAction = iconCompatParcelizer.MediaSessionCompat$QueueItem;
                    iconCompatParcelizer.AlertController$RecycleListView = iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
                    IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer3;
                    int length = (iconCompatParcelizer2.MediaMetadataCompat + 1) % iconCompatParcelizer2.MediaBrowserCompat$MediaItem.length;
                    iconCompatParcelizer2.MediaMetadataCompat = length;
                    iconCompatParcelizer2.MediaDescriptionCompat = iconCompatParcelizer2.MediaBrowserCompat$MediaItem[length];
                    if (setOnHierarchyChangeListener.this.read) {
                        setOnHierarchyChangeListener.this.read = false;
                        animator.cancel();
                        animator.setDuration(1332);
                        animator.start();
                        IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizer3;
                        if (iconCompatParcelizer3.f2635x50fd9e4a) {
                            iconCompatParcelizer3.f2635x50fd9e4a = false;
                            return;
                        }
                        return;
                    }
                    setOnHierarchyChangeListener.this.IconCompatParcelizer += 1.0f;
                }
            });
            this.MediaBrowserCompat$SearchResultReceiver = ofFloat;
            return;
        }
        throw null;
    }

    private void IconCompatParcelizer(float f, float f2, float f3, float f4) {
        IconCompatParcelizer iconCompatParcelizer = this.write;
        float f5 = this.MediaBrowserCompat$MediaItem.getDisplayMetrics().density;
        float f6 = f2 * f5;
        iconCompatParcelizer.setHasDecor = f6;
        iconCompatParcelizer.ParcelableVolumeInfo.setStrokeWidth(f6);
        iconCompatParcelizer.MediaSessionCompat$Token = f * f5;
        iconCompatParcelizer.MediaMetadataCompat = 0;
        iconCompatParcelizer.MediaDescriptionCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem[0];
        iconCompatParcelizer.RatingCompat = (int) (f3 * f5);
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = (int) (f4 * f5);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            IconCompatParcelizer(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            IconCompatParcelizer(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.MediaDescriptionCompat, bounds.exactCenterX(), bounds.exactCenterY());
        IconCompatParcelizer iconCompatParcelizer = this.write;
        RectF rectF = iconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView;
        float f = iconCompatParcelizer.MediaSessionCompat$Token;
        float f2 = (iconCompatParcelizer.setHasDecor / 2.0f) + f;
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) iconCompatParcelizer.RatingCompat) * iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) / 2.0f, iconCompatParcelizer.setHasDecor / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = iconCompatParcelizer.Keep;
        float f4 = iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((iconCompatParcelizer.MediaSessionCompat$QueueItem + f4) * 360.0f) - f5;
        iconCompatParcelizer.ParcelableVolumeInfo.setColor(iconCompatParcelizer.MediaDescriptionCompat);
        iconCompatParcelizer.ParcelableVolumeInfo.setAlpha(iconCompatParcelizer.read);
        float f7 = iconCompatParcelizer.setHasDecor / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, iconCompatParcelizer.ParcelableVolumeInfo);
        if (iconCompatParcelizer.f2635x50fd9e4a) {
            Path path = iconCompatParcelizer.write;
            if (path == null) {
                Path path2 = new Path();
                iconCompatParcelizer.write = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            iconCompatParcelizer.write.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            iconCompatParcelizer.write.lineTo(((float) iconCompatParcelizer.RatingCompat) * iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, BitmapDescriptorFactory.HUE_RED);
            Path path3 = iconCompatParcelizer.write;
            float f9 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            path3.lineTo((((float) iconCompatParcelizer.RatingCompat) * f9) / 2.0f, ((float) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) * f9);
            iconCompatParcelizer.write.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) iconCompatParcelizer.RatingCompat) * iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) / 2.0f), rectF.centerY() + (iconCompatParcelizer.setHasDecor / 2.0f));
            iconCompatParcelizer.write.close();
            iconCompatParcelizer.IconCompatParcelizer.setColor(iconCompatParcelizer.MediaDescriptionCompat);
            iconCompatParcelizer.IconCompatParcelizer.setAlpha(iconCompatParcelizer.read);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(iconCompatParcelizer.write, iconCompatParcelizer.IconCompatParcelizer);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void setAlpha(int i) {
        this.write.read = i;
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.write.read;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.write.ParcelableVolumeInfo.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean isRunning() {
        return this.MediaBrowserCompat$SearchResultReceiver.isRunning();
    }

    public final void start() {
        this.MediaBrowserCompat$SearchResultReceiver.cancel();
        IconCompatParcelizer iconCompatParcelizer = this.write;
        iconCompatParcelizer.PlaybackStateCompat = iconCompatParcelizer.Keep;
        iconCompatParcelizer.PlaybackStateCompat$CustomAction = iconCompatParcelizer.MediaSessionCompat$QueueItem;
        iconCompatParcelizer.AlertController$RecycleListView = iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
        if (this.write.MediaSessionCompat$QueueItem != this.write.Keep) {
            this.read = true;
            this.MediaBrowserCompat$SearchResultReceiver.setDuration(666);
            this.MediaBrowserCompat$SearchResultReceiver.start();
            return;
        }
        IconCompatParcelizer iconCompatParcelizer2 = this.write;
        iconCompatParcelizer2.MediaMetadataCompat = 0;
        iconCompatParcelizer2.MediaDescriptionCompat = iconCompatParcelizer2.MediaBrowserCompat$MediaItem[0];
        IconCompatParcelizer iconCompatParcelizer3 = this.write;
        iconCompatParcelizer3.PlaybackStateCompat = BitmapDescriptorFactory.HUE_RED;
        iconCompatParcelizer3.PlaybackStateCompat$CustomAction = BitmapDescriptorFactory.HUE_RED;
        iconCompatParcelizer3.AlertController$RecycleListView = BitmapDescriptorFactory.HUE_RED;
        iconCompatParcelizer3.Keep = BitmapDescriptorFactory.HUE_RED;
        iconCompatParcelizer3.MediaSessionCompat$QueueItem = BitmapDescriptorFactory.HUE_RED;
        iconCompatParcelizer3.MediaSessionCompat$ResultReceiverWrapper = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompat$SearchResultReceiver.setDuration(1332);
        this.MediaBrowserCompat$SearchResultReceiver.start();
    }

    public final void stop() {
        this.MediaBrowserCompat$SearchResultReceiver.cancel();
        this.MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
        IconCompatParcelizer iconCompatParcelizer = this.write;
        if (iconCompatParcelizer.f2635x50fd9e4a) {
            iconCompatParcelizer.f2635x50fd9e4a = false;
        }
        IconCompatParcelizer iconCompatParcelizer2 = this.write;
        iconCompatParcelizer2.MediaMetadataCompat = 0;
        iconCompatParcelizer2.MediaDescriptionCompat = iconCompatParcelizer2.MediaBrowserCompat$MediaItem[0];
        IconCompatParcelizer iconCompatParcelizer3 = this.write;
        iconCompatParcelizer3.PlaybackStateCompat = BitmapDescriptorFactory.HUE_RED;
        iconCompatParcelizer3.PlaybackStateCompat$CustomAction = BitmapDescriptorFactory.HUE_RED;
        iconCompatParcelizer3.AlertController$RecycleListView = BitmapDescriptorFactory.HUE_RED;
        iconCompatParcelizer3.Keep = BitmapDescriptorFactory.HUE_RED;
        iconCompatParcelizer3.MediaSessionCompat$QueueItem = BitmapDescriptorFactory.HUE_RED;
        iconCompatParcelizer3.MediaSessionCompat$ResultReceiverWrapper = BitmapDescriptorFactory.HUE_RED;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(float f, IconCompatParcelizer iconCompatParcelizer, boolean z) {
        float f2;
        float f3;
        if (this.read) {
            MediaBrowserCompat$CustomActionResultReceiver(f, iconCompatParcelizer);
            float floor = (float) (Math.floor((double) (iconCompatParcelizer.AlertController$RecycleListView / 0.8f)) + 1.0d);
            iconCompatParcelizer.Keep = iconCompatParcelizer.PlaybackStateCompat + (((iconCompatParcelizer.PlaybackStateCompat$CustomAction - 0.01f) - iconCompatParcelizer.PlaybackStateCompat) * f);
            iconCompatParcelizer.MediaSessionCompat$QueueItem = iconCompatParcelizer.PlaybackStateCompat$CustomAction;
            iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper = iconCompatParcelizer.AlertController$RecycleListView + ((floor - iconCompatParcelizer.AlertController$RecycleListView) * f);
        } else if (f != 1.0f || z) {
            float f4 = iconCompatParcelizer.AlertController$RecycleListView;
            if (f < 0.5f) {
                f2 = iconCompatParcelizer.PlaybackStateCompat;
                f3 = (MediaMetadataCompat.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float f5 = iconCompatParcelizer.PlaybackStateCompat + 0.79f;
                float f6 = f5;
                f2 = f5 - (((1.0f - MediaMetadataCompat.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f6;
            }
            float f7 = this.IconCompatParcelizer;
            iconCompatParcelizer.Keep = f2;
            iconCompatParcelizer.MediaSessionCompat$QueueItem = f3;
            iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper = f4 + (0.20999998f * f);
            this.MediaDescriptionCompat = (f + f7) * 216.0f;
        }
    }

    /* renamed from: o.setOnHierarchyChangeListener$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        float AlertController$RecycleListView;
        final RectF AppCompatDelegateImpl$ListMenuDecorView = new RectF();
        final Paint IconCompatParcelizer = new Paint();
        public float Keep = BitmapDescriptorFactory.HUE_RED;
        public float MediaBrowserCompat$CustomActionResultReceiver = 1.0f;
        int MediaBrowserCompat$ItemReceiver;
        public int[] MediaBrowserCompat$MediaItem;
        final Paint MediaBrowserCompat$SearchResultReceiver = new Paint();

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public boolean f2635x50fd9e4a;
        public int MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public float MediaSessionCompat$QueueItem = BitmapDescriptorFactory.HUE_RED;
        public float MediaSessionCompat$ResultReceiverWrapper = BitmapDescriptorFactory.HUE_RED;
        float MediaSessionCompat$Token;
        final Paint ParcelableVolumeInfo = new Paint();
        float PlaybackStateCompat;
        float PlaybackStateCompat$CustomAction;
        int RatingCompat;
        int read = 255;
        float setHasDecor = 5.0f;
        Path write;

        IconCompatParcelizer() {
            this.ParcelableVolumeInfo.setStrokeCap(Paint.Cap.SQUARE);
            this.ParcelableVolumeInfo.setAntiAlias(true);
            this.ParcelableVolumeInfo.setStyle(Paint.Style.STROKE);
            this.IconCompatParcelizer.setStyle(Paint.Style.FILL);
            this.IconCompatParcelizer.setAntiAlias(true);
            this.MediaBrowserCompat$SearchResultReceiver.setColor(0);
        }
    }

    static void MediaBrowserCompat$CustomActionResultReceiver(float f, IconCompatParcelizer iconCompatParcelizer) {
        if (f > 0.75f) {
            iconCompatParcelizer.MediaDescriptionCompat = read((f - 0.75f) / 0.25f, iconCompatParcelizer.MediaBrowserCompat$MediaItem[iconCompatParcelizer.MediaMetadataCompat], iconCompatParcelizer.MediaBrowserCompat$MediaItem[(iconCompatParcelizer.MediaMetadataCompat + 1) % iconCompatParcelizer.MediaBrowserCompat$MediaItem.length]);
        } else {
            iconCompatParcelizer.MediaDescriptionCompat = iconCompatParcelizer.MediaBrowserCompat$MediaItem[iconCompatParcelizer.MediaMetadataCompat];
        }
    }
}
