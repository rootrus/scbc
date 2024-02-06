package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.C10821Element;
import p040o.FieldPacker;
import p040o.add;
import p040o.addF64;
import p040o.addI8;
import p040o.addObj;
import p040o.addSafely;
import p040o.addU16;
import p040o.align;
import p040o.getData;
import p040o.getImageDimensionMismatch;
import p040o.isComplex;
import p040o.rsnAllocationRead1D;
import p040o.rsnScriptInvokeV;
import p040o.subByte2;
import p040o.subDouble4;
import p040o.subF64;
import p040o.subI32;
import p040o.subI64;
import p040o.subLong3;
import p040o.subShort3;
import p040o.subShort4;

public abstract class Chart<T extends addF64<? extends subByte2<? extends addI8>>> extends ViewGroup implements getData {
    private float ActionMenuItemView = BitmapDescriptorFactory.HUE_RED;
    private Paint AlertController$RecycleListView;
    private float AppCompatActivity = BitmapDescriptorFactory.HUE_RED;
    private float AppCompatDelegateImpl$ListMenuDecorView = BitmapDescriptorFactory.HUE_RED;
    private float AppCompatDialogFragment = BitmapDescriptorFactory.HUE_RED;
    private ArrayList<Runnable> AppCompatViewInflater = new ArrayList<>();
    protected rsnAllocationRead1D.write IconCompatParcelizer;
    protected rsnScriptInvokeV.IconCompatParcelizer Keep = new rsnScriptInvokeV.IconCompatParcelizer();
    public add MediaBrowserCompat$CustomActionResultReceiver;
    protected subF64 MediaBrowserCompat$ItemReceiver;
    public subDouble4 MediaBrowserCompat$MediaItem;
    protected getImageDimensionMismatch MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    protected boolean f43x50fd9e4a = true;
    public boolean MediaDescriptionCompat = true;
    public float MediaMetadataCompat = 0.9f;
    protected boolean MediaSessionCompat$QueueItem = false;
    protected subLong3 MediaSessionCompat$ResultReceiverWrapper;
    protected subI64 MediaSessionCompat$Token;
    protected FieldPacker ParcelableVolumeInfo;
    protected C10821Element.DataType PlaybackStateCompat;
    private addObj PlaybackStateCompat$CustomAction = new addObj(0);
    protected isComplex.C13709[] RatingCompat;
    protected T read = null;
    private Paint setBackgroundResource;
    private String setCheckable = "No chart data available.";
    private boolean setChecked = false;
    private float setContentView = BitmapDescriptorFactory.HUE_RED;
    private addSafely setExpandedFormat;
    private boolean setHasDecor = true;
    private subI32 setIcon;
    private boolean setItemInvoker = false;
    public boolean write = true;

    public abstract void AlertController$RecycleListView();

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver();

    /* access modifiers changed from: protected */
    public abstract void read();

    public Chart(Context context) {
        super(context);
        ParcelableVolumeInfo();
    }

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ParcelableVolumeInfo();
    }

    public Chart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ParcelableVolumeInfo();
    }

    /* access modifiers changed from: protected */
    public void ParcelableVolumeInfo() {
        setWillNotDraw(false);
        this.IconCompatParcelizer = new rsnAllocationRead1D.write(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Chart.this.postInvalidate();
            }
        });
        subShort3.IconCompatParcelizer(getContext());
        this.ActionMenuItemView = subShort3.read(500.0f);
        this.MediaBrowserCompat$CustomActionResultReceiver = new add();
        FieldPacker fieldPacker = new FieldPacker();
        this.ParcelableVolumeInfo = fieldPacker;
        this.MediaSessionCompat$ResultReceiverWrapper = new subLong3(this.Keep, fieldPacker);
        this.PlaybackStateCompat = new C10821Element.DataType();
        this.AlertController$RecycleListView = new Paint(1);
        Paint paint = new Paint(1);
        this.setBackgroundResource = paint;
        paint.setColor(Color.rgb(247, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, 51));
        this.setBackgroundResource.setTextAlign(Paint.Align.CENTER);
        this.setBackgroundResource.setTextSize(subShort3.read(12.0f));
        if (this.MediaSessionCompat$QueueItem) {
            Log.i("", "Chart.init()");
        }
    }

    public void setData(T t) {
        float f;
        this.read = t;
        this.setChecked = false;
        if (t != null) {
            float f2 = t.MediaMetadataCompat;
            float f3 = t.MediaDescriptionCompat;
            T t2 = this.read;
            if (t2 == null || t2.MediaBrowserCompat$CustomActionResultReceiver() < 2) {
                f = Math.max(Math.abs(f2), Math.abs(f3));
            } else {
                f = Math.abs(f3 - f2);
            }
            this.PlaybackStateCompat$CustomAction.read(subShort3.MediaBrowserCompat$CustomActionResultReceiver(f));
            for (subByte2 subbyte2 : this.read.write()) {
                if (subbyte2.MediaSessionCompat$QueueItem() || subbyte2.RatingCompat() == this.PlaybackStateCompat$CustomAction) {
                    subbyte2.MediaBrowserCompat$ItemReceiver((addU16) this.PlaybackStateCompat$CustomAction);
                }
            }
            AlertController$RecycleListView();
            if (this.MediaSessionCompat$QueueItem) {
                Log.i("MPAndroidChart", "Data is set.");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.read == null) {
            if (!TextUtils.isEmpty(this.setCheckable)) {
                subShort4 read2 = subShort4.read(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
                canvas.drawText(this.setCheckable, read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, this.setBackgroundResource);
            }
        } else if (!this.setChecked) {
            MediaBrowserCompat$ItemReceiver();
            this.setChecked = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(Canvas canvas) {
        add add = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (add != null && add.MediaSessionCompat$ResultReceiverWrapper) {
            this.AlertController$RecycleListView.setTypeface((Typeface) null);
            this.AlertController$RecycleListView.setTextSize(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver());
            this.AlertController$RecycleListView.setColor(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
            this.AlertController$RecycleListView.setTextAlign(this.MediaBrowserCompat$CustomActionResultReceiver.write);
            rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer = this.Keep;
            float width = (((float) getWidth()) - (iconCompatParcelizer.IconCompatParcelizer - iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.right)) - this.MediaBrowserCompat$CustomActionResultReceiver.read();
            rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer2 = this.Keep;
            canvas.drawText(this.MediaBrowserCompat$CustomActionResultReceiver.read, width, (((float) getHeight()) - (iconCompatParcelizer2.write - iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver.bottom)) - this.MediaBrowserCompat$CustomActionResultReceiver.write(), this.AlertController$RecycleListView);
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final float mo3114x50fd9e4a() {
        return null.ActionMenuItemView;
    }

    public void setMaxHighlightDistance(float f) {
        this.ActionMenuItemView = subShort3.read(f);
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    public final boolean PlaybackStateCompat$CustomAction() {
        isComplex.C13709[] r0 = this.RatingCompat;
        return (r0 == null || r0.length <= 0 || r0[0] == null) ? false : true;
    }

    private void IconCompatParcelizer(isComplex.C13709[] r3) {
        if (r3 == null || r3.length <= 0 || r3[0] == null) {
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = null;
            return;
        }
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = r3[0];
    }

    public final void MediaSessionCompat$Token() {
        this.RatingCompat = null;
        IconCompatParcelizer((isComplex.C13709[]) null);
        invalidate();
    }

    public final void write(isComplex.C13709 r4) {
        if (r4 == null) {
            this.RatingCompat = null;
        } else {
            if (this.MediaSessionCompat$QueueItem) {
                StringBuilder sb = new StringBuilder();
                sb.append("Highlighted: ");
                sb.append(r4.toString());
                Log.i("MPAndroidChart", sb.toString());
            }
            if (this.read.MediaBrowserCompat$ItemReceiver(r4) == null) {
                this.RatingCompat = null;
            } else {
                this.RatingCompat = new isComplex.C13709[]{r4};
            }
        }
        IconCompatParcelizer(this.RatingCompat);
        if (this.setIcon != null) {
            PlaybackStateCompat$CustomAction();
        }
        invalidate();
    }

    public final isComplex.C13709 read(float f, float f2) {
        if (this.read != null) {
            return this.MediaBrowserCompat$SearchResultReceiver.read(f, f2);
        }
        Log.e("MPAndroidChart", "Can't select by touch. No data set.");
        return null;
    }

    public void setOnTouchListener(subF64 subf64) {
        this.MediaBrowserCompat$ItemReceiver = subf64;
    }

    /* access modifiers changed from: protected */
    public final void write() {
        if (this.setExpandedFormat != null && this.setHasDecor && PlaybackStateCompat$CustomAction()) {
            int i = 0;
            while (true) {
                isComplex.C13709[] r2 = this.RatingCompat;
                if (i < r2.length) {
                    isComplex.C13709 r22 = r2[i];
                    subByte2 write2 = this.read.write(r22.write);
                    addI8 MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$ItemReceiver(this.RatingCompat[i]);
                    int write3 = write2.write(MediaBrowserCompat$ItemReceiver2);
                    if (MediaBrowserCompat$ItemReceiver2 != null && ((float) write3) <= ((float) write2.PlaybackStateCompat$CustomAction()) * this.IconCompatParcelizer.IconCompatParcelizer) {
                        float[] IconCompatParcelizer2 = IconCompatParcelizer(r22);
                        rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer = this.Keep;
                        float f = IconCompatParcelizer2[0];
                        float f2 = IconCompatParcelizer2[1];
                        if (((iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.left > (1.0f + f) ? 1 : (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.left == (1.0f + f) ? 0 : -1)) <= 0) && iconCompatParcelizer.read(f)) {
                            if (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.top <= f2) {
                                if (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.bottom >= ((float) ((int) (f2 * 100.0f))) / 100.0f) {
                                }
                            }
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final rsnAllocationRead1D.write IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.write = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.MediaMetadataCompat = f;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(isComplex.read read2) {
        rsnAllocationRead1D.write write2 = this.IconCompatParcelizer;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(write2, "phaseY", new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
        ofFloat.setInterpolator(read2);
        ofFloat.setDuration(1400);
        ofFloat.addUpdateListener(write2.MediaBrowserCompat$CustomActionResultReceiver);
        ofFloat.start();
    }

    public C10821Element.DataType MediaSessionCompat$ResultReceiverWrapper() {
        return this.PlaybackStateCompat;
    }

    public void setOnChartValueSelectedListener(subI32 subi32) {
        this.setIcon = subi32;
    }

    public void setOnChartGestureListener(subDouble4 subdouble4) {
        this.MediaBrowserCompat$MediaItem = subdouble4;
    }

    public final subShort4 MediaBrowserCompat$CustomActionResultReceiver() {
        rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer = this.Keep;
        return subShort4.read(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.centerX(), iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.centerY());
    }

    public void setExtraOffsets(float f, float f2, float f3, float f4) {
        setExtraLeftOffset(f);
        setExtraTopOffset(f2);
        setExtraRightOffset(f3);
        setExtraBottomOffset(f4);
    }

    public void setExtraTopOffset(float f) {
        this.AppCompatDialogFragment = subShort3.read(f);
    }

    public final float MediaDescriptionCompat() {
        return this.AppCompatDialogFragment;
    }

    public void setExtraRightOffset(float f) {
        this.AppCompatActivity = subShort3.read(f);
    }

    public final float RatingCompat() {
        return this.AppCompatActivity;
    }

    public void setExtraBottomOffset(float f) {
        this.AppCompatDelegateImpl$ListMenuDecorView = subShort3.read(f);
    }

    public final float MediaBrowserCompat$MediaItem() {
        return this.AppCompatDelegateImpl$ListMenuDecorView;
    }

    public void setExtraLeftOffset(float f) {
        this.setContentView = subShort3.read(f);
    }

    public final float MediaMetadataCompat() {
        return this.setContentView;
    }

    public void setLogEnabled(boolean z) {
        this.MediaSessionCompat$QueueItem = z;
    }

    public void setNoDataText(String str) {
        this.setCheckable = str;
    }

    public void setNoDataTextColor(int i) {
        this.setBackgroundResource.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.setBackgroundResource.setTypeface(typeface);
    }

    public void setTouchEnabled(boolean z) {
        this.f43x50fd9e4a = z;
    }

    public void setMarker(addSafely addsafely) {
        this.setExpandedFormat = addsafely;
    }

    @Deprecated
    public void setMarkerView(addSafely addsafely) {
        setMarker(addsafely);
    }

    public void setDescription(add add) {
        this.MediaBrowserCompat$CustomActionResultReceiver = add;
    }

    public final FieldPacker MediaSessionCompat$QueueItem() {
        return this.ParcelableVolumeInfo;
    }

    public void setPaint(Paint paint, int i) {
        if (i == 7) {
            this.setBackgroundResource = paint;
        } else if (i == 11) {
            this.AlertController$RecycleListView = paint;
        }
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setDrawMarkers(boolean z) {
        this.setHasDecor = z;
    }

    public final T MediaBrowserCompat$SearchResultReceiver() {
        return this.read;
    }

    public void setRenderer(subI64 subi64) {
        if (subi64 != null) {
            this.MediaSessionCompat$Token = subi64;
        }
    }

    public void setHighlighter(align align) {
        this.MediaBrowserCompat$SearchResultReceiver = align;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int read2 = (int) subShort3.read(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), resolveSize(read2, i)), Math.max(getSuggestedMinimumHeight(), resolveSize(read2, i2)));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.MediaSessionCompat$QueueItem) {
            Log.i("MPAndroidChart", "OnSizeChanged()");
        }
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            if (this.MediaSessionCompat$QueueItem) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting chart dimens, width: ");
                sb.append(i);
                sb.append(", height: ");
                sb.append(i2);
                Log.i("MPAndroidChart", sb.toString());
            }
            rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer = this.Keep;
            float f = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.left;
            float f2 = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.top;
            float f3 = iconCompatParcelizer.IconCompatParcelizer - iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.right;
            iconCompatParcelizer.write = (float) i2;
            iconCompatParcelizer.IconCompatParcelizer = (float) i;
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.set(f, f2, iconCompatParcelizer.IconCompatParcelizer - f3, iconCompatParcelizer.write - (iconCompatParcelizer.write - iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.bottom));
        } else if (this.MediaSessionCompat$QueueItem) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("*Avoiding* setting chart dimens! width: ");
            sb2.append(i);
            sb2.append(", height: ");
            sb2.append(i2);
            Log.w("MPAndroidChart", sb2.toString());
        }
        AlertController$RecycleListView();
        Iterator<Runnable> it = this.AppCompatViewInflater.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.AppCompatViewInflater.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, (Paint) null);
        } else {
            setLayerType(1, (Paint) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setItemInvoker) {
            write((View) this);
        }
    }

    private void write(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback((Drawable.Callback) null);
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    write(viewGroup.getChildAt(i));
                    i++;
                } else {
                    viewGroup.removeAllViews();
                    return;
                }
            }
        }
    }

    public void setUnbindEnabled(boolean z) {
        this.setItemInvoker = z;
    }

    /* access modifiers changed from: protected */
    public float[] IconCompatParcelizer(isComplex.C13709 r4) {
        return new float[]{r4.MediaBrowserCompat$ItemReceiver, r4.read};
    }
}
