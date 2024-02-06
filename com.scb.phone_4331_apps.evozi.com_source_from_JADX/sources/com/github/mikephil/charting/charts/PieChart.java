package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.List;
import p040o.C10821Element;
import p040o.addI64;
import p040o.addMatrix;
import p040o.getPos;
import p040o.isComplex;
import p040o.subFloat2;
import p040o.subInt2;
import p040o.subShort3;
import p040o.subShort4;

public class PieChart extends PieRadarChartBase<addMatrix> {
    public boolean ActionMenuItemView = false;
    public CharSequence AlertController$RecycleListView = "";
    public float AppCompatActivity = 100.0f;
    public boolean AppCompatDelegateImpl$ListMenuDecorView = true;
    public boolean AppCompatDialogFragment = true;
    public boolean AppCompatViewInflater = true;
    public subShort4 PlaybackStateCompat$CustomAction = subShort4.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    public float[] setBackgroundResource = new float[1];
    public float setCheckable = 55.0f;
    public boolean setChecked = false;
    public RectF setContentView = new RectF();
    public float setExpandedFormat = 50.0f;
    private float setGroupDividerEnabled = BitmapDescriptorFactory.HUE_RED;
    public float[] setHasDecor = new float[1];
    public boolean setIcon = false;
    private float setPadding = 360.0f;

    /* access modifiers changed from: protected */
    public final float PlaybackStateCompat() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public PieChart(Context context) {
        super(context);
    }

    public PieChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PieChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void ParcelableVolumeInfo() {
        super.ParcelableVolumeInfo();
        this.MediaSessionCompat$Token = new subInt2(this, this.IconCompatParcelizer, this.Keep);
        this.PlaybackStateCompat = null;
        this.MediaBrowserCompat$SearchResultReceiver = new getPos(this);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.read != null) {
            this.MediaSessionCompat$Token.IconCompatParcelizer(canvas);
            if (PlaybackStateCompat$CustomAction()) {
                this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(canvas, this.RatingCompat);
            }
            this.MediaSessionCompat$Token.read(canvas);
            this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(canvas);
            this.MediaSessionCompat$ResultReceiverWrapper.read(canvas);
            MediaBrowserCompat$ItemReceiver(canvas);
            write();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaBrowserCompat$ItemReceiver();
        if (this.read != null) {
            float AppCompatActivity2 = AppCompatActivity() / 2.0f;
            subShort4 MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
            float backgroundResource = ((addMatrix) this.read).MediaDescriptionCompat().setBackgroundResource();
            this.setContentView.set((MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver - AppCompatActivity2) + backgroundResource, (MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver - AppCompatActivity2) + backgroundResource, (MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver + AppCompatActivity2) - backgroundResource, (MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver + AppCompatActivity2) - backgroundResource);
            subShort4.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(int i) {
        if (!PlaybackStateCompat$CustomAction()) {
            return false;
        }
        for (isComplex.C13709 r2 : this.RatingCompat) {
            if (((int) r2.MediaBrowserCompat$SearchResultReceiver) == i) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public final C10821Element.DataType MediaSessionCompat$ResultReceiverWrapper() {
        throw new RuntimeException("PieChart has no XAxis");
    }

    public void setHoleColor(int i) {
        ((subInt2) this.MediaSessionCompat$Token).RatingCompat.setColor(i);
    }

    public void setDrawSlicesUnderHole(boolean z) {
        this.ActionMenuItemView = z;
    }

    public void setDrawHoleEnabled(boolean z) {
        this.AppCompatViewInflater = z;
    }

    public void setCenterText(CharSequence charSequence) {
        if (charSequence == null) {
            this.AlertController$RecycleListView = "";
        } else {
            this.AlertController$RecycleListView = charSequence;
        }
    }

    public void setDrawCenterText(boolean z) {
        this.AppCompatDelegateImpl$ListMenuDecorView = z;
    }

    /* access modifiers changed from: protected */
    public final float setHasDecor() {
        return this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.getTextSize() * 2.0f;
    }

    public final float Keep() {
        RectF rectF = this.setContentView;
        if (rectF == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return Math.min(rectF.width() / 2.0f, this.setContentView.height() / 2.0f);
    }

    public void setCenterTextTypeface(Typeface typeface) {
        ((subInt2) this.MediaSessionCompat$Token).MediaDescriptionCompat.setTypeface(typeface);
    }

    public void setCenterTextSize(float f) {
        ((subInt2) this.MediaSessionCompat$Token).MediaDescriptionCompat.setTextSize(subShort3.read(f));
    }

    public void setCenterTextSizePixels(float f) {
        ((subInt2) this.MediaSessionCompat$Token).MediaDescriptionCompat.setTextSize(f);
    }

    public void setCenterTextOffset(float f, float f2) {
        this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$ItemReceiver = subShort3.read(f);
        this.PlaybackStateCompat$CustomAction.MediaBrowserCompat$CustomActionResultReceiver = subShort3.read(f2);
    }

    public void setCenterTextColor(int i) {
        ((subInt2) this.MediaSessionCompat$Token).MediaDescriptionCompat.setColor(i);
    }

    public void setHoleRadius(float f) {
        this.setExpandedFormat = f;
    }

    public void setTransparentCircleColor(int i) {
        Paint paint = ((subInt2) this.MediaSessionCompat$Token).MediaBrowserCompat$MediaItem;
        int alpha = paint.getAlpha();
        paint.setColor(i);
        paint.setAlpha(alpha);
    }

    public void setTransparentCircleRadius(float f) {
        this.setCheckable = f;
    }

    public void setTransparentCircleAlpha(int i) {
        ((subInt2) this.MediaSessionCompat$Token).MediaBrowserCompat$MediaItem.setAlpha(i);
    }

    @Deprecated
    public void setDrawSliceText(boolean z) {
        this.AppCompatDialogFragment = z;
    }

    public void setDrawEntryLabels(boolean z) {
        this.AppCompatDialogFragment = z;
    }

    public void setEntryLabelColor(int i) {
        ((subInt2) this.MediaSessionCompat$Token).MediaBrowserCompat$SearchResultReceiver.setColor(i);
    }

    public void setEntryLabelTypeface(Typeface typeface) {
        ((subInt2) this.MediaSessionCompat$Token).MediaBrowserCompat$SearchResultReceiver.setTypeface(typeface);
    }

    public void setEntryLabelTextSize(float f) {
        ((subInt2) this.MediaSessionCompat$Token).MediaBrowserCompat$SearchResultReceiver.setTextSize(subShort3.read(f));
    }

    public void setDrawRoundedSlices(boolean z) {
        this.setChecked = z;
    }

    public void setUsePercentValues(boolean z) {
        this.setIcon = z;
    }

    public void setCenterTextRadiusPercent(float f) {
        this.AppCompatActivity = f;
    }

    public void setMaxAngle(float f) {
        if (f > 360.0f) {
            f = 360.0f;
        }
        if (f < 90.0f) {
            f = 90.0f;
        }
        this.setPadding = f;
    }

    public void setMinAngleForSlices(float f) {
        float f2 = this.setPadding / 2.0f;
        if (f > f2) {
            f = f2;
        } else if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        this.setGroupDividerEnabled = f;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (this.MediaSessionCompat$Token != null && (this.MediaSessionCompat$Token instanceof subInt2)) {
            subInt2 subint2 = (subInt2) this.MediaSessionCompat$Token;
            Canvas canvas = subint2.read;
            if (canvas != null) {
                canvas.setBitmap((Bitmap) null);
                subint2.read = null;
            }
            WeakReference<Bitmap> weakReference = subint2.MediaMetadataCompat;
            if (weakReference != null) {
                Bitmap bitmap = weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                subint2.MediaMetadataCompat.clear();
                subint2.MediaMetadataCompat = null;
            }
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void read() {
        int MediaBrowserCompat$CustomActionResultReceiver = ((addMatrix) this.read).MediaBrowserCompat$CustomActionResultReceiver();
        if (this.setBackgroundResource.length != MediaBrowserCompat$CustomActionResultReceiver) {
            this.setBackgroundResource = new float[MediaBrowserCompat$CustomActionResultReceiver];
        } else {
            for (int i = 0; i < MediaBrowserCompat$CustomActionResultReceiver; i++) {
                this.setBackgroundResource[i] = 0.0f;
            }
        }
        if (this.setHasDecor.length != MediaBrowserCompat$CustomActionResultReceiver) {
            this.setHasDecor = new float[MediaBrowserCompat$CustomActionResultReceiver];
        } else {
            for (int i2 = 0; i2 < MediaBrowserCompat$CustomActionResultReceiver; i2++) {
                this.setHasDecor[i2] = 0.0f;
            }
        }
        float RatingCompat = ((addMatrix) this.read).RatingCompat();
        List write = ((addMatrix) this.read).write();
        float f = this.setGroupDividerEnabled;
        boolean z = f != BitmapDescriptorFactory.HUE_RED && ((float) MediaBrowserCompat$CustomActionResultReceiver) * f <= this.setPadding;
        float[] fArr = new float[MediaBrowserCompat$CustomActionResultReceiver];
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < ((addMatrix) this.read).read(); i4++) {
            subFloat2 subfloat2 = (subFloat2) write.get(i4);
            for (int i5 = 0; i5 < subfloat2.PlaybackStateCompat$CustomAction(); i5++) {
                float abs = (Math.abs(((addI64) subfloat2.MediaBrowserCompat$ItemReceiver(i5)).IconCompatParcelizer) / RatingCompat) * this.setPadding;
                if (z) {
                    float f4 = this.setGroupDividerEnabled;
                    float f5 = abs - f4;
                    if (f5 <= BitmapDescriptorFactory.HUE_RED) {
                        fArr[i3] = f4;
                        f3 -= f5;
                    } else {
                        fArr[i3] = abs;
                        f2 += f5;
                    }
                }
                float[] fArr2 = this.setBackgroundResource;
                fArr2[i3] = abs;
                if (i3 == 0) {
                    this.setHasDecor[i3] = fArr2[i3];
                } else {
                    float[] fArr3 = this.setHasDecor;
                    fArr3[i3] = fArr3[i3 - 1] + fArr2[i3];
                }
                i3++;
            }
        }
        if (z) {
            for (int i6 = 0; i6 < MediaBrowserCompat$CustomActionResultReceiver; i6++) {
                fArr[i6] = fArr[i6] - (((fArr[i6] - this.setGroupDividerEnabled) / f2) * f3);
                if (i6 == 0) {
                    this.setHasDecor[0] = fArr[0];
                } else {
                    float[] fArr4 = this.setHasDecor;
                    fArr4[i6] = fArr4[i6 - 1] + fArr[i6];
                }
            }
            this.setBackgroundResource = fArr;
        }
    }

    public final int IconCompatParcelizer(float f) {
        float IconCompatParcelizer = subShort3.IconCompatParcelizer(f - this.setPopupCallback);
        int i = 0;
        while (true) {
            float[] fArr = this.setHasDecor;
            if (i >= fArr.length) {
                return -1;
            }
            if (fArr[i] > IconCompatParcelizer) {
                return i;
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public final float[] IconCompatParcelizer(isComplex.C13709 r11) {
        float f;
        subShort4 read = subShort4.read(this.setContentView.centerX(), this.setContentView.centerY());
        RectF rectF = this.setContentView;
        if (rectF == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = Math.min(rectF.width() / 2.0f, this.setContentView.height() / 2.0f);
        }
        float f2 = (f / 10.0f) * 3.6f;
        if (this.AppCompatViewInflater) {
            f2 = (f - ((f / 100.0f) * this.setExpandedFormat)) / 2.0f;
        }
        float f3 = this.setPopupCallback;
        int i = (int) r11.MediaBrowserCompat$SearchResultReceiver;
        float f4 = this.setBackgroundResource[i] / 2.0f;
        double d = (double) (f - f2);
        float cos = (float) ((Math.cos(Math.toRadians((double) (((this.setHasDecor[i] + f3) - f4) * this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver))) * d) + ((double) read.MediaBrowserCompat$ItemReceiver));
        float f5 = this.setHasDecor[i];
        subShort4.IconCompatParcelizer(read);
        return new float[]{cos, (float) ((d * Math.sin(Math.toRadians((double) (((f3 + f5) - f4) * this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver)))) + ((double) read.MediaBrowserCompat$CustomActionResultReceiver))};
    }
}
