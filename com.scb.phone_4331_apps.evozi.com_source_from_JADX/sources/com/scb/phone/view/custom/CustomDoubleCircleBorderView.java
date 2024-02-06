package com.scb.phone.view.custom;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import p040o.onGetStartedClick;

public final class CustomDoubleCircleBorderView extends View {
    private List<Animator> AlertController$RecycleListView;
    private float AppCompatActivity;
    /* access modifiers changed from: private */
    public List<Float> AppCompatDelegateImpl$ListMenuDecorView;
    private boolean AppCompatDialogFragment;
    private float AppCompatViewInflater;
    public long IconCompatParcelizer;
    private int Keep;
    public float MediaBrowserCompat$CustomActionResultReceiver;
    private IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    private List<Float> MediaBrowserCompat$MediaItem;
    private float MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int[] f3069x50fd9e4a;
    private long MediaDescriptionCompat;
    private PointF MediaMetadataCompat;
    private Paint MediaSessionCompat$QueueItem;
    private float MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private RectF ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private int[] PlaybackStateCompat$CustomAction;
    private float RatingCompat;
    public AnimatorSet read;
    private RectF setBackgroundResource;
    private Paint setContentView;
    private int setHasDecor;
    public float write;

    public interface IconCompatParcelizer {
        void MediaBrowserCompat$CustomActionResultReceiver();
    }

    public CustomDoubleCircleBorderView(Context context) {
        this(context, (AttributeSet) null, 6, (byte) 0);
    }

    public CustomDoubleCircleBorderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    public final void setImageWidth(float f) {
        this.RatingCompat = f;
        requestLayout();
        invalidate();
    }

    public final void setBorderWidth(float f) {
        this.MediaBrowserCompat$SearchResultReceiver = f;
        this.MediaSessionCompat$QueueItem.setStrokeWidth(f);
        this.setContentView.setStrokeWidth(f);
        requestLayout();
        invalidate();
    }

    public final void setOuterColors(int[] iArr) {
        onGetStartedClick.write((Object) iArr, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.PlaybackStateCompat$CustomAction = iArr;
        read(this.setContentView, iArr);
        requestLayout();
        invalidate();
    }

    public final void setInnerColors(int[] iArr) {
        onGetStartedClick.write((Object) iArr, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f3069x50fd9e4a = iArr;
        read(this.MediaSessionCompat$QueueItem, iArr);
        requestLayout();
        invalidate();
    }

    public final void setDuration(long j) {
        this.MediaDescriptionCompat = j;
    }

    public final void setInsightIconDrawableResId(int i) {
        this.MediaSessionCompat$Token = i;
    }

    public final void setDefaultBorder(boolean z) {
        this.PlaybackStateCompat = z;
    }

    public CustomDoubleCircleBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.PlaybackStateCompat$CustomAction = new int[0];
        this.f3069x50fd9e4a = new int[0];
        this.setContentView = new Paint(1);
        this.MediaSessionCompat$QueueItem = new Paint(1);
        this.ParcelableVolumeInfo = new RectF();
        this.setBackgroundResource = new RectF();
        this.MediaBrowserCompat$CustomActionResultReceiver = -45.0f;
        this.AppCompatViewInflater = -45.0f;
        this.write = -360.0f;
        this.AlertController$RecycleListView = new ArrayList();
        this.AppCompatDelegateImpl$ListMenuDecorView = new ArrayList();
        this.MediaBrowserCompat$MediaItem = new ArrayList();
        this.Keep = 3;
        Paint paint = this.MediaSessionCompat$QueueItem;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.MediaBrowserCompat$SearchResultReceiver);
        paint.setStrokeCap(Paint.Cap.ROUND);
        read(paint, this.f3069x50fd9e4a);
        Paint paint2 = this.setContentView;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(this.MediaBrowserCompat$SearchResultReceiver);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        read(paint2, this.PlaybackStateCompat$CustomAction);
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CustomDoubleCircleBorderView(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.AppCompatDelegateImpl$ListMenuDecorView.clear();
        this.MediaBrowserCompat$MediaItem.clear();
        for (int i = 0; i < 5; i++) {
            this.AppCompatDelegateImpl$ListMenuDecorView.add(Float.valueOf(-60.0f));
            if (i == 4) {
                this.MediaBrowserCompat$MediaItem.add(Float.valueOf(-180.0f));
            } else {
                this.MediaBrowserCompat$MediaItem.add(Float.valueOf(1.0f));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = this.RatingCompat + (this.MediaBrowserCompat$SearchResultReceiver * 4.0f);
        if (this.MediaSessionCompat$Token != 0 || this.PlaybackStateCompat) {
            float f2 = f / 10.0f;
            this.MediaSessionCompat$ResultReceiverWrapper = f2;
            f += f2;
        }
        int i3 = (int) f;
        setMeasuredDimension(i3, i3);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.MediaBrowserCompat$SearchResultReceiver / 2.0f;
        float f2 = ((float) i) / 2.0f;
        this.MediaMetadataCompat = new PointF(f2, ((float) i2) / 2.0f);
        this.AppCompatActivity = f2 - this.MediaSessionCompat$ResultReceiverWrapper;
        if (this.MediaSessionCompat$Token != 0 || this.PlaybackStateCompat) {
            this.setBackgroundResource.left = this.MediaSessionCompat$ResultReceiverWrapper;
            this.setBackgroundResource.top = this.MediaSessionCompat$ResultReceiverWrapper;
            this.setBackgroundResource.right = ((float) getWidth()) - this.MediaSessionCompat$ResultReceiverWrapper;
            this.setBackgroundResource.bottom = ((float) getHeight()) - this.MediaSessionCompat$ResultReceiverWrapper;
            this.ParcelableVolumeInfo.left = this.MediaBrowserCompat$SearchResultReceiver + this.MediaSessionCompat$ResultReceiverWrapper;
            this.ParcelableVolumeInfo.top = this.MediaBrowserCompat$SearchResultReceiver + this.MediaSessionCompat$ResultReceiverWrapper;
            this.ParcelableVolumeInfo.right = (((float) getWidth()) - this.MediaBrowserCompat$SearchResultReceiver) - this.MediaSessionCompat$ResultReceiverWrapper;
            this.ParcelableVolumeInfo.bottom = (((float) getHeight()) - this.MediaBrowserCompat$SearchResultReceiver) - this.MediaSessionCompat$ResultReceiverWrapper;
        } else {
            this.setBackgroundResource.left = f;
            this.setBackgroundResource.top = f;
            this.setBackgroundResource.right = ((float) getWidth()) - f;
            this.setBackgroundResource.bottom = ((float) getHeight()) - f;
            this.ParcelableVolumeInfo.left = this.MediaBrowserCompat$SearchResultReceiver + f;
            this.ParcelableVolumeInfo.top = this.MediaBrowserCompat$SearchResultReceiver + f;
            this.ParcelableVolumeInfo.right = (((float) getWidth()) - this.MediaBrowserCompat$SearchResultReceiver) - f;
            this.ParcelableVolumeInfo.bottom = (((float) getHeight()) - this.MediaBrowserCompat$SearchResultReceiver) - f;
        }
        read(this.MediaSessionCompat$QueueItem, this.f3069x50fd9e4a);
        read(this.setContentView, this.PlaybackStateCompat$CustomAction);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawArc(this.ParcelableVolumeInfo, BitmapDescriptorFactory.HUE_RED, 360.0f, false, this.MediaSessionCompat$QueueItem);
        }
        if (this.MediaSessionCompat$Token != 0 && !this.PlaybackStateCompat) {
            if (canvas != null) {
                canvas.drawArc(this.setBackgroundResource, this.AppCompatViewInflater, this.write, false, this.setContentView);
            }
            int size = this.AppCompatDelegateImpl$ListMenuDecorView.size();
            for (int i = 0; i < size; i++) {
                if (canvas != null) {
                    canvas.drawArc(this.setBackgroundResource, this.AppCompatDelegateImpl$ListMenuDecorView.get(i).floatValue(), this.MediaBrowserCompat$MediaItem.get(i).floatValue(), false, this.setContentView);
                }
            }
            PointF pointF = this.MediaMetadataCompat;
            if (pointF == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("centerPointF");
            }
            float f = this.AppCompatActivity;
            double d = (double) f;
            double d2 = (double) this.MediaBrowserCompat$CustomActionResultReceiver;
            PointF pointF2 = new PointF((float) (((double) pointF.x) + (Math.cos(Math.toRadians(d2)) * d)), (float) (((double) pointF.y) + (d * Math.sin(Math.toRadians(d2)))));
            int i2 = (int) (this.MediaSessionCompat$ResultReceiverWrapper * 2.0f);
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), this.MediaSessionCompat$Token);
            onGetStartedClick.IconCompatParcelizer((Object) decodeResource, "BitmapFactory.decodeReso…insightIconDrawableResId)");
            Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f2 = (float) i2;
            float width = f2 / ((float) decodeResource.getWidth());
            float height = f2 / ((float) decodeResource.getHeight());
            Matrix matrix = new Matrix();
            matrix.postScale(width, height);
            canvas2.drawBitmap(decodeResource, matrix, (Paint) null);
            onGetStartedClick.IconCompatParcelizer((Object) createBitmap, "bitmapResized");
            float f3 = pointF2.x;
            float f4 = this.MediaSessionCompat$ResultReceiverWrapper;
            float f5 = pointF2.y;
            float f6 = this.MediaSessionCompat$ResultReceiverWrapper;
            if (canvas != null) {
                canvas.drawBitmap(createBitmap, f3 - f4, f5 - f6, (Paint) null);
            }
        } else if (canvas != null) {
            canvas.drawArc(this.setBackgroundResource, this.AppCompatViewInflater, this.write, false, this.setContentView);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.read;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void write() {
        AnimatorSet animatorSet = this.read;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.AlertController$RecycleListView.clear();
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.AlertController$RecycleListView.add(MediaBrowserCompat$ItemReceiver());
        this.AlertController$RecycleListView.add(IconCompatParcelizer());
        this.AlertController$RecycleListView.addAll(read());
        animatorSet2.playTogether(this.AlertController$RecycleListView);
        animatorSet2.setInterpolator(new LinearInterpolator());
        this.read = animatorSet2;
        animatorSet2.addListener(new MediaDescriptionCompat(this));
        AnimatorSet animatorSet3 = this.read;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public static final class MediaDescriptionCompat implements Animator.AnimatorListener {
        private boolean IconCompatParcelizer;
        private /* synthetic */ CustomDoubleCircleBorderView MediaBrowserCompat$ItemReceiver;

        public final void onAnimationRepeat(Animator animator) {
        }

        MediaDescriptionCompat(CustomDoubleCircleBorderView customDoubleCircleBorderView) {
            this.MediaBrowserCompat$ItemReceiver = customDoubleCircleBorderView;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.IconCompatParcelizer) {
                CustomDoubleCircleBorderView.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.IconCompatParcelizer = true;
        }

        public final void onAnimationStart(Animator animator) {
            this.IconCompatParcelizer = false;
        }
    }

    private final void read(Paint paint, int[] iArr) {
        int length = iArr.length;
        if (length == 1) {
            paint.setColor(iArr[0]);
            paint.setShader((Shader) null);
        } else if (2 <= length && Integer.MAX_VALUE >= length) {
            paint.setShader(MediaBrowserCompat$CustomActionResultReceiver(iArr));
        }
    }

    private final Shader MediaBrowserCompat$CustomActionResultReceiver(int[] iArr) {
        float f = this.MediaSessionCompat$ResultReceiverWrapper;
        float f2 = this.MediaSessionCompat$ResultReceiverWrapper;
        float f3 = this.MediaSessionCompat$ResultReceiverWrapper;
        return new LinearGradient(f, ((float) getWidth()) - f2, ((float) getWidth()) - f3, ((float) getWidth()) / 2.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    private final Animator MediaBrowserCompat$ItemReceiver() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 360.0f});
        ofFloat.setDuration(this.MediaDescriptionCompat);
        ofFloat.addUpdateListener(new read(this));
        onGetStartedClick.IconCompatParcelizer((Object) ofFloat, "ValueAnimator.ofFloat(ST…)\n            }\n        }");
        return ofFloat;
    }

    static final class read implements ValueAnimator.AnimatorUpdateListener {
        private /* synthetic */ CustomDoubleCircleBorderView MediaBrowserCompat$ItemReceiver;

        read(CustomDoubleCircleBorderView customDoubleCircleBorderView) {
            this.MediaBrowserCompat$ItemReceiver = customDoubleCircleBorderView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            onGetStartedClick.IconCompatParcelizer((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.MediaBrowserCompat$ItemReceiver.write = ((Float) animatedValue).floatValue() - 360.0f;
                this.MediaBrowserCompat$ItemReceiver.invalidate();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    private final Animator IconCompatParcelizer() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 360.0f});
        ofFloat.setDuration(this.MediaDescriptionCompat);
        ofFloat.addUpdateListener(new C5793xa7438410(this));
        onGetStartedClick.IconCompatParcelizer((Object) ofFloat, "ValueAnimator.ofFloat(ST…)\n            }\n        }");
        return ofFloat;
    }

    private final List<Animator> read() {
        float f;
        float f2;
        long j = this.MediaDescriptionCompat;
        List<Animator> arrayList = new ArrayList<>();
        List<Float> list = this.AppCompatDelegateImpl$ListMenuDecorView;
        onGetStartedClick.write((Object) list, "$this$lastIndex");
        int size = list.size() - 1;
        int size2 = this.AppCompatDelegateImpl$ListMenuDecorView.size();
        for (int i = 0; i < size2; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 360.0f});
            onGetStartedClick.IconCompatParcelizer((Object) ofFloat, "animator");
            ofFloat.setDuration(j);
            ofFloat.addUpdateListener(new write(this, i));
            long j2 = this.IconCompatParcelizer;
            if (i < size - 1) {
                f2 = (float) j;
                f = 0.1f;
            } else {
                f2 = (float) j;
                f = 0.09f;
            }
            long j3 = j2 + ((long) (f2 * f));
            this.IconCompatParcelizer = j3;
            ofFloat.setStartDelay(j3);
            arrayList.add(ofFloat);
        }
        return arrayList;
    }

    static final class write implements ValueAnimator.AnimatorUpdateListener {
        private /* synthetic */ int MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ CustomDoubleCircleBorderView write;

        write(CustomDoubleCircleBorderView customDoubleCircleBorderView, int i) {
            this.write = customDoubleCircleBorderView;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            onGetStartedClick.IconCompatParcelizer((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue() - 60.0f;
                this.write.AppCompatDelegateImpl$ListMenuDecorView.set(this.MediaBrowserCompat$ItemReceiver, Float.valueOf(floatValue));
                CustomDoubleCircleBorderView.MediaBrowserCompat$CustomActionResultReceiver(this.write, this.MediaBrowserCompat$ItemReceiver, floatValue);
                this.write.invalidate();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    public final void setBorderAnimationListener(IconCompatParcelizer iconCompatParcelizer, boolean z) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "borderAnimationListener");
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.AppCompatDialogFragment = z;
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(CustomDoubleCircleBorderView customDoubleCircleBorderView) {
        int i = customDoubleCircleBorderView.setHasDecor + 1;
        customDoubleCircleBorderView.setHasDecor = i;
        if (i < customDoubleCircleBorderView.Keep) {
            customDoubleCircleBorderView.write();
            return;
        }
        customDoubleCircleBorderView.setHasDecor = 0;
        if (customDoubleCircleBorderView.AppCompatDialogFragment) {
            IconCompatParcelizer iconCompatParcelizer = customDoubleCircleBorderView.MediaBrowserCompat$ItemReceiver;
            if (iconCompatParcelizer == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("borderAnimationListener");
            }
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(CustomDoubleCircleBorderView customDoubleCircleBorderView, int i, float f) {
        List<Float> list = customDoubleCircleBorderView.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) list, "$this$lastIndex");
        int size = list.size() - 1;
        if (i == size) {
            if (f == 300.0f) {
                customDoubleCircleBorderView.IconCompatParcelizer = 0;
                customDoubleCircleBorderView.MediaBrowserCompat$CustomActionResultReceiver = -45.0f;
                customDoubleCircleBorderView.write = -360.0f;
                customDoubleCircleBorderView.MediaBrowserCompat$CustomActionResultReceiver();
                return;
            }
            customDoubleCircleBorderView.MediaBrowserCompat$MediaItem.set(i, Float.valueOf(-180.0f - (f * 0.5f)));
        } else if (i == size - 1) {
            customDoubleCircleBorderView.MediaBrowserCompat$MediaItem.set(i, Float.valueOf(-(f / customDoubleCircleBorderView.MediaBrowserCompat$SearchResultReceiver)));
        } else {
            customDoubleCircleBorderView.MediaBrowserCompat$MediaItem.set(i, Float.valueOf(f / customDoubleCircleBorderView.MediaBrowserCompat$SearchResultReceiver));
        }
    }
}
