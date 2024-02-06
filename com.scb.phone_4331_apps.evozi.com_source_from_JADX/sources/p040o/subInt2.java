package p040o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.List;
import p040o.addI16;
import p040o.isComplex;
import p040o.rsnAllocationRead1D;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subInt2 */
public final class subInt2 extends subI64 {
    private RectF AlertController$RecycleListView = new RectF();
    private Paint AppCompatActivity;
    private RectF[] AppCompatDelegateImpl$ListMenuDecorView = {new RectF(), new RectF(), new RectF()};
    private Path Keep = new Path();
    public Paint MediaBrowserCompat$MediaItem;
    public Paint MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private StaticLayout f2653x50fd9e4a;
    public TextPaint MediaDescriptionCompat;
    public WeakReference<Bitmap> MediaMetadataCompat;
    private RectF MediaSessionCompat$QueueItem = new RectF();
    private CharSequence MediaSessionCompat$ResultReceiverWrapper;
    private PieChart MediaSessionCompat$Token;
    private RectF PlaybackStateCompat = new RectF();
    private Path PlaybackStateCompat$CustomAction = new Path();
    public Paint RatingCompat;
    public Canvas read;
    private Path setHasDecor = new Path();

    public subInt2(PieChart pieChart, rsnAllocationRead1D.write write, rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer) {
        super(write, iconCompatParcelizer);
        this.MediaSessionCompat$Token = pieChart;
        Paint paint = new Paint(1);
        this.RatingCompat = paint;
        paint.setColor(-1);
        this.RatingCompat.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.MediaBrowserCompat$MediaItem = paint2;
        paint2.setColor(-1);
        this.MediaBrowserCompat$MediaItem.setStyle(Paint.Style.FILL);
        this.MediaBrowserCompat$MediaItem.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.MediaDescriptionCompat = textPaint;
        textPaint.setColor(-16777216);
        this.MediaDescriptionCompat.setTextSize(subShort3.read(12.0f));
        this.IconCompatParcelizer.setTextSize(subShort3.read(13.0f));
        this.IconCompatParcelizer.setColor(-1);
        this.IconCompatParcelizer.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.MediaBrowserCompat$SearchResultReceiver = paint3;
        paint3.setColor(-1);
        this.MediaBrowserCompat$SearchResultReceiver.setTextAlign(Paint.Align.CENTER);
        this.MediaBrowserCompat$SearchResultReceiver.setTextSize(subShort3.read(13.0f));
        Paint paint4 = new Paint(1);
        this.AppCompatActivity = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    public final void IconCompatParcelizer(Canvas canvas) {
        int i = (int) this.ParcelableVolumeInfo.IconCompatParcelizer;
        int i2 = (int) this.ParcelableVolumeInfo.write;
        WeakReference<Bitmap> weakReference = this.MediaMetadataCompat;
        Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (!(bitmap != null && bitmap.getWidth() == i && bitmap.getHeight() == i2)) {
            if (i > 0 && i2 > 0) {
                bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_4444);
                this.MediaMetadataCompat = new WeakReference<>(bitmap);
                this.read = new Canvas(bitmap);
            } else {
                return;
            }
        }
        bitmap.eraseColor(0);
        for (subFloat2 subfloat2 : ((addMatrix) this.MediaSessionCompat$Token.MediaBrowserCompat$SearchResultReceiver()).write()) {
            if (subfloat2.MediaSessionCompat$ResultReceiverWrapper() && subfloat2.PlaybackStateCompat$CustomAction() > 0) {
                IconCompatParcelizer(subfloat2);
            }
        }
    }

    private static float MediaBrowserCompat$CustomActionResultReceiver(subShort4 subshort4, float f, float f2, float f3, float f4, float f5, float f6) {
        subShort4 subshort42 = subshort4;
        double d = (double) ((f5 + f6) * 0.017453292f);
        float cos = subshort42.MediaBrowserCompat$ItemReceiver + (((float) Math.cos(d)) * f);
        float sin = subshort42.MediaBrowserCompat$CustomActionResultReceiver + (((float) Math.sin(d)) * f);
        double d2 = (double) ((f5 + (f6 / 2.0f)) * 0.017453292f);
        return (float) (((double) (f - ((float) ((Math.sqrt(Math.pow((double) (cos - f3), 2.0d) + Math.pow((double) (sin - f4), 2.0d)) / 2.0d) * Math.tan(((180.0d - ((double) f2)) / 2.0d) * 0.017453292519943295d))))) - Math.sqrt(Math.pow((double) ((subshort42.MediaBrowserCompat$ItemReceiver + (((float) Math.cos(d2)) * f)) - ((cos + f3) / 2.0f)), 2.0d) + Math.pow((double) ((subshort42.MediaBrowserCompat$CustomActionResultReceiver + (((float) Math.sin(d2)) * f)) - ((sin + f4) / 2.0f)), 2.0d)));
    }

    private void IconCompatParcelizer(subFloat2 subfloat2) {
        RectF rectF;
        float f;
        int i;
        int i2;
        float[] fArr;
        float f2;
        int i3;
        float f3;
        float f4;
        RectF rectF2;
        int i4;
        int i5;
        RectF rectF3;
        float f5;
        int i6;
        subFloat2 subfloat22 = subfloat2;
        float f6 = this.MediaSessionCompat$Token.setPopupCallback;
        float f7 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        float f8 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        RectF rectF4 = this.MediaSessionCompat$Token.setContentView;
        int PlaybackStateCompat$CustomAction2 = subfloat2.PlaybackStateCompat$CustomAction();
        float[] fArr2 = this.MediaSessionCompat$Token.setBackgroundResource;
        PieChart pieChart = this.MediaSessionCompat$Token;
        subShort4 read2 = subShort4.read(pieChart.setContentView.centerX(), pieChart.setContentView.centerY());
        float Keep2 = this.MediaSessionCompat$Token.Keep();
        boolean z = this.MediaSessionCompat$Token.AppCompatViewInflater && !this.MediaSessionCompat$Token.ActionMenuItemView;
        float f9 = z ? (this.MediaSessionCompat$Token.setExpandedFormat / 100.0f) * Keep2 : 0.0f;
        float f10 = (Keep2 - ((this.MediaSessionCompat$Token.setExpandedFormat * Keep2) / 100.0f)) / 2.0f;
        RectF rectF5 = new RectF();
        boolean z2 = z && this.MediaSessionCompat$Token.setChecked;
        int i7 = 0;
        for (int i8 = 0; i8 < PlaybackStateCompat$CustomAction2; i8++) {
            if (Math.abs(((addI64) subfloat22.MediaBrowserCompat$ItemReceiver(i8)).IconCompatParcelizer) > subShort3.read) {
                i7++;
            }
        }
        float AppCompatDelegateImpl$ListMenuDecorView2 = i7 <= 1 ? 0.0f : subfloat2.AppCompatDelegateImpl$ListMenuDecorView();
        int i9 = 0;
        float f11 = 0.0f;
        while (i9 < PlaybackStateCompat$CustomAction2) {
            float f12 = fArr2[i9];
            if (Math.abs(subfloat22.MediaBrowserCompat$ItemReceiver(i9).IconCompatParcelizer) > subShort3.read && (!this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(i9) || z2)) {
                boolean z3 = AppCompatDelegateImpl$ListMenuDecorView2 > BitmapDescriptorFactory.HUE_RED && f12 <= 180.0f;
                i3 = PlaybackStateCompat$CustomAction2;
                this.write.setColor(subfloat22.MediaBrowserCompat$CustomActionResultReceiver(i9));
                float f13 = i7 == 1 ? 0.0f : AppCompatDelegateImpl$ListMenuDecorView2 / (Keep2 * 0.017453292f);
                float f14 = f6 + ((f11 + (f13 / 2.0f)) * f8);
                float f15 = (f12 - f13) * f8;
                float f16 = f15 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f15;
                this.PlaybackStateCompat$CustomAction.reset();
                if (z2) {
                    float f17 = Keep2 - f10;
                    fArr = fArr2;
                    i = i9;
                    i2 = i7;
                    double d = (double) (f14 * 0.017453292f);
                    f3 = f6;
                    f = f7;
                    float cos = read2.MediaBrowserCompat$ItemReceiver + (((float) Math.cos(d)) * f17);
                    float sin = read2.MediaBrowserCompat$CustomActionResultReceiver + (f17 * ((float) Math.sin(d)));
                    rectF5.set(cos - f10, sin - f10, cos + f10, sin + f10);
                } else {
                    f = f7;
                    fArr = fArr2;
                    i = i9;
                    i2 = i7;
                    f3 = f6;
                }
                double d2 = (double) (f14 * 0.017453292f);
                f2 = f8;
                float cos2 = read2.MediaBrowserCompat$ItemReceiver + (((float) Math.cos(d2)) * Keep2);
                float sin2 = read2.MediaBrowserCompat$CustomActionResultReceiver + (((float) Math.sin(d2)) * Keep2);
                int i10 = (f16 > 360.0f ? 1 : (f16 == 360.0f ? 0 : -1));
                if (i10 < 0 || f16 % 360.0f > subShort3.read) {
                    if (z2) {
                        this.PlaybackStateCompat$CustomAction.arcTo(rectF5, f14 + 180.0f, -180.0f);
                    }
                    this.PlaybackStateCompat$CustomAction.arcTo(rectF4, f14, f16);
                } else {
                    this.PlaybackStateCompat$CustomAction.addCircle(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, Keep2, Path.Direction.CW);
                }
                rectF = rectF4;
                this.AlertController$RecycleListView.set(read2.MediaBrowserCompat$ItemReceiver - f9, read2.MediaBrowserCompat$CustomActionResultReceiver - f9, read2.MediaBrowserCompat$ItemReceiver + f9, read2.MediaBrowserCompat$CustomActionResultReceiver + f9);
                if (!z || (f9 <= BitmapDescriptorFactory.HUE_RED && !z3)) {
                    rectF2 = rectF5;
                    f4 = f9;
                    if (f16 % 360.0f > subShort3.read) {
                        if (z3) {
                            float f18 = f16 / 2.0f;
                            float MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(read2, Keep2, f12 * f2, cos2, sin2, f14, f16);
                            double d3 = (double) ((f14 + f18) * 0.017453292f);
                            this.PlaybackStateCompat$CustomAction.lineTo(read2.MediaBrowserCompat$ItemReceiver + (((float) Math.cos(d3)) * MediaBrowserCompat$CustomActionResultReceiver), read2.MediaBrowserCompat$CustomActionResultReceiver + (MediaBrowserCompat$CustomActionResultReceiver * ((float) Math.sin(d3))));
                        } else {
                            this.PlaybackStateCompat$CustomAction.lineTo(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver);
                        }
                    }
                } else {
                    if (z3) {
                        int i11 = i;
                        i4 = i2;
                        RectF rectF6 = rectF5;
                        float f19 = cos2;
                        f5 = f9;
                        float f20 = sin2;
                        rectF3 = rectF6;
                        i5 = 1;
                        float MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(read2, Keep2, f12 * f2, f19, f20, f14, f16);
                        if (MediaBrowserCompat$CustomActionResultReceiver2 < BitmapDescriptorFactory.HUE_RED) {
                            MediaBrowserCompat$CustomActionResultReceiver2 = -MediaBrowserCompat$CustomActionResultReceiver2;
                        }
                        f9 = Math.max(f5, MediaBrowserCompat$CustomActionResultReceiver2);
                    } else {
                        rectF3 = rectF5;
                        f5 = f9;
                        i4 = i2;
                        i5 = 1;
                    }
                    float f21 = (i4 == i5 || f9 == BitmapDescriptorFactory.HUE_RED) ? 0.0f : AppCompatDelegateImpl$ListMenuDecorView2 / (f9 * 0.017453292f);
                    float f22 = f21 / 2.0f;
                    float f23 = (f12 - f21) * f2;
                    if (f23 < BitmapDescriptorFactory.HUE_RED) {
                        f23 = 0.0f;
                    }
                    float f24 = ((f11 + f22) * f2) + f3 + f23;
                    if (i10 < 0 || f16 % 360.0f > subShort3.read) {
                        if (z2) {
                            float f25 = Keep2 - f10;
                            double d4 = (double) (0.017453292f * f24);
                            float cos3 = read2.MediaBrowserCompat$ItemReceiver + (((float) Math.cos(d4)) * f25);
                            float sin3 = read2.MediaBrowserCompat$CustomActionResultReceiver + (f25 * ((float) Math.sin(d4)));
                            rectF3.set(cos3 - f10, sin3 - f10, cos3 + f10, sin3 + f10);
                            this.PlaybackStateCompat$CustomAction.arcTo(rectF3, f24, 180.0f);
                            i6 = i4;
                        } else {
                            double d5 = (double) (0.017453292f * f24);
                            i6 = i4;
                            this.PlaybackStateCompat$CustomAction.lineTo(read2.MediaBrowserCompat$ItemReceiver + (((float) Math.cos(d5)) * f9), read2.MediaBrowserCompat$CustomActionResultReceiver + (f9 * ((float) Math.sin(d5))));
                        }
                        this.PlaybackStateCompat$CustomAction.arcTo(this.AlertController$RecycleListView, f24, -f23);
                        f4 = f5;
                        rectF2 = rectF3;
                    } else {
                        this.PlaybackStateCompat$CustomAction.addCircle(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, f9, Path.Direction.CCW);
                        rectF2 = rectF3;
                        i2 = i4;
                        f4 = f5;
                    }
                }
                this.PlaybackStateCompat$CustomAction.close();
                this.read.drawPath(this.PlaybackStateCompat$CustomAction, this.write);
                f11 += f12 * f;
            } else {
                f11 += f12 * f7;
                f = f7;
                f2 = f8;
                rectF = rectF4;
                i3 = PlaybackStateCompat$CustomAction2;
                fArr = fArr2;
                i = i9;
                i2 = i7;
                rectF2 = rectF5;
                f4 = f9;
                f3 = f6;
            }
            i9 = i + 1;
            subfloat22 = subfloat2;
            rectF5 = rectF2;
            f9 = f4;
            f6 = f3;
            PlaybackStateCompat$CustomAction2 = i3;
            f8 = f2;
            fArr2 = fArr;
            i7 = i2;
            f7 = f;
            rectF4 = rectF;
        }
        subShort4.IconCompatParcelizer(read2);
    }

    public final void MediaBrowserCompat$ItemReceiver(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        float f3;
        float[] fArr;
        float[] fArr2;
        float f4;
        List list;
        int i;
        int i2;
        Canvas canvas2;
        subShort4 subshort4;
        float f5;
        subShort4 subshort42;
        float f6;
        boolean z2;
        addU16 addu16;
        addI16.write write;
        String str;
        subFloat2 subfloat2;
        addI16.write write2;
        Canvas canvas3;
        subShort4 subshort43;
        float f7;
        float f8;
        float f9;
        addI16.write write3;
        float f10;
        Canvas canvas4 = canvas;
        PieChart pieChart = this.MediaSessionCompat$Token;
        subShort4 read2 = subShort4.read(pieChart.setContentView.centerX(), pieChart.setContentView.centerY());
        float Keep2 = this.MediaSessionCompat$Token.Keep();
        float f11 = this.MediaSessionCompat$Token.setPopupCallback;
        float[] fArr3 = this.MediaSessionCompat$Token.setBackgroundResource;
        float[] fArr4 = this.MediaSessionCompat$Token.setHasDecor;
        float f12 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        float f13 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        float f14 = (Keep2 - ((this.MediaSessionCompat$Token.setExpandedFormat * Keep2) / 100.0f)) / 2.0f;
        float f15 = this.MediaSessionCompat$Token.setExpandedFormat / 100.0f;
        float f16 = (Keep2 / 10.0f) * 3.6f;
        if (this.MediaSessionCompat$Token.AppCompatViewInflater) {
            f16 = (Keep2 - (Keep2 * f15)) / 2.0f;
            if (!this.MediaSessionCompat$Token.ActionMenuItemView && this.MediaSessionCompat$Token.setChecked) {
                f11 = (float) (((double) f11) + (((double) (f14 * 360.0f)) / (((double) Keep2) * 6.283185307179586d)));
            }
        }
        float f17 = f11;
        float f18 = Keep2 - f16;
        addMatrix addmatrix = (addMatrix) this.MediaSessionCompat$Token.MediaBrowserCompat$SearchResultReceiver();
        List write4 = addmatrix.write();
        float RatingCompat2 = addmatrix.RatingCompat();
        boolean z3 = this.MediaSessionCompat$Token.AppCompatDialogFragment;
        canvas.save();
        float read3 = subShort3.read(5.0f);
        int i3 = 0;
        int i4 = 0;
        while (i4 < write4.size()) {
            subFloat2 subfloat22 = (subFloat2) write4.get(i4);
            boolean ParcelableVolumeInfo = subfloat22.ParcelableVolumeInfo();
            if (ParcelableVolumeInfo || z3) {
                addI16.write AppCompatViewInflater = subfloat22.AppCompatViewInflater();
                addI16.write expandedFormat = subfloat22.setExpandedFormat();
                MediaBrowserCompat$ItemReceiver((subByte2) subfloat22);
                i2 = i3;
                i = i4;
                float MediaBrowserCompat$ItemReceiver = ((float) subShort3.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, "Q")) + subShort3.read(4.0f);
                addU16 RatingCompat3 = subfloat22.RatingCompat();
                int PlaybackStateCompat$CustomAction2 = subfloat22.PlaybackStateCompat$CustomAction();
                list = write4;
                subShort4 subshort44 = read2;
                this.AppCompatActivity.setColor(subfloat22.AppCompatDialogFragment());
                this.AppCompatActivity.setStrokeWidth(subShort3.read(subfloat22.ActionMenuItemView()));
                float AppCompatDelegateImpl$ListMenuDecorView2 = subfloat22.AppCompatDelegateImpl$ListMenuDecorView();
                subShort4 read4 = subShort4.read(subfloat22.MediaBrowserCompat$MediaItem());
                f4 = Keep2;
                read4.MediaBrowserCompat$ItemReceiver = subShort3.read(read4.MediaBrowserCompat$ItemReceiver);
                read4.MediaBrowserCompat$CustomActionResultReceiver = subShort3.read(read4.MediaBrowserCompat$CustomActionResultReceiver);
                int i5 = 0;
                while (i5 < PlaybackStateCompat$CustomAction2) {
                    int i6 = PlaybackStateCompat$CustomAction2;
                    addI64 addi64 = (addI64) subfloat22.MediaBrowserCompat$ItemReceiver(i5);
                    if (i2 == 0) {
                        f5 = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        f5 = fArr4[i2 - 1] * f12;
                    }
                    subShort4 subshort45 = read4;
                    float f19 = f17 + ((f5 + ((fArr3[i2] - ((AppCompatDelegateImpl$ListMenuDecorView2 / (f18 * 0.017453292f)) / 2.0f)) / 2.0f)) * f13);
                    float f20 = AppCompatDelegateImpl$ListMenuDecorView2;
                    String IconCompatParcelizer = RatingCompat3.IconCompatParcelizer(this.MediaSessionCompat$Token.setIcon ? (addi64.IconCompatParcelizer / RatingCompat2) * 100.0f : addi64.IconCompatParcelizer);
                    String str2 = addi64.MediaBrowserCompat$CustomActionResultReceiver;
                    float[] fArr5 = fArr3;
                    float[] fArr6 = fArr4;
                    double d = (double) (f19 * 0.017453292f);
                    float f21 = f12;
                    float f22 = f13;
                    float cos = (float) Math.cos(d);
                    float f23 = f17;
                    float sin = (float) Math.sin(d);
                    boolean z4 = z3 && AppCompatViewInflater == addI16.write.OUTSIDE_SLICE;
                    boolean z5 = ParcelableVolumeInfo && expandedFormat == addI16.write.OUTSIDE_SLICE;
                    boolean z6 = z3 && AppCompatViewInflater == addI16.write.INSIDE_SLICE;
                    boolean z7 = ParcelableVolumeInfo && expandedFormat == addI16.write.INSIDE_SLICE;
                    if (z4 || z5) {
                        float AppCompatActivity2 = subfloat22.AppCompatActivity();
                        float checked = subfloat22.setChecked();
                        float contentView = subfloat22.setContentView() / 100.0f;
                        addI16.write write5 = AppCompatViewInflater;
                        if (this.MediaSessionCompat$Token.AppCompatViewInflater) {
                            float f24 = f4 * f15;
                            f7 = ((f4 - f24) * contentView) + f24;
                        } else {
                            f7 = f4 * contentView;
                        }
                        float abs = subfloat22.setCheckable() ? checked * f18 * Math.abs((float) Math.sin(d)) : checked * f18;
                        subShort4 subshort46 = subshort44;
                        float f25 = subshort46.MediaBrowserCompat$ItemReceiver;
                        float f26 = subshort46.MediaBrowserCompat$CustomActionResultReceiver;
                        float f27 = (AppCompatActivity2 + 1.0f) * f18;
                        addu16 = RatingCompat3;
                        float f28 = (f27 * cos) + subshort46.MediaBrowserCompat$ItemReceiver;
                        float f29 = subshort46.MediaBrowserCompat$CustomActionResultReceiver + (f27 * sin);
                        boolean z8 = z3;
                        double d2 = ((double) f19) % 360.0d;
                        if (d2 < 90.0d || d2 > 270.0d) {
                            f8 = f28 + abs;
                            this.IconCompatParcelizer.setTextAlign(Paint.Align.LEFT);
                            if (z4) {
                                this.MediaBrowserCompat$SearchResultReceiver.setTextAlign(Paint.Align.LEFT);
                            }
                            f9 = f8 + read3;
                        } else {
                            float f30 = f28 - abs;
                            this.IconCompatParcelizer.setTextAlign(Paint.Align.RIGHT);
                            if (z4) {
                                this.MediaBrowserCompat$SearchResultReceiver.setTextAlign(Paint.Align.RIGHT);
                            }
                            f9 = f30 - read3;
                            f8 = f30;
                        }
                        float f31 = f9;
                        if (subfloat22.AppCompatDialogFragment() != 1122867) {
                            float f32 = f25 + (f7 * cos);
                            float f33 = (f7 * sin) + f26;
                            String str3 = str2;
                            Canvas canvas5 = canvas;
                            write = write5;
                            write3 = expandedFormat;
                            subfloat2 = subfloat22;
                            z2 = z8;
                            f6 = sin;
                            str = str3;
                            float f34 = f29;
                            subshort42 = subshort46;
                            f10 = f31;
                            canvas5.drawLine(f32, f33, f28, f34, this.AppCompatActivity);
                            canvas5.drawLine(f28, f29, f8, f34, this.AppCompatActivity);
                        } else {
                            subshort42 = subshort46;
                            z2 = z8;
                            f10 = f31;
                            f6 = sin;
                            str = str2;
                            write = write5;
                            write3 = expandedFormat;
                            subfloat2 = subfloat22;
                        }
                        if (!z4 || !z5) {
                            canvas3 = canvas;
                            write2 = write3;
                            float f35 = f29;
                            if (z4) {
                                if (i5 < addmatrix.MediaBrowserCompat$CustomActionResultReceiver() && str != null) {
                                    canvas3.drawText(str, f10, f35 + (MediaBrowserCompat$ItemReceiver / 2.0f), this.MediaBrowserCompat$SearchResultReceiver);
                                }
                            } else if (z5) {
                                this.IconCompatParcelizer.setColor(subfloat2.read(i5));
                                canvas3.drawText(IconCompatParcelizer, f10, f35 + (MediaBrowserCompat$ItemReceiver / 2.0f), this.IconCompatParcelizer);
                            }
                        } else {
                            this.IconCompatParcelizer.setColor(subfloat2.read(i5));
                            canvas3 = canvas;
                            write2 = write3;
                            float f36 = f29;
                            canvas3.drawText(IconCompatParcelizer, f10, f36, this.IconCompatParcelizer);
                            if (i5 < addmatrix.MediaBrowserCompat$CustomActionResultReceiver() && str != null) {
                                canvas3.drawText(str, f10, f36 + MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$SearchResultReceiver);
                            }
                        }
                    } else {
                        addu16 = RatingCompat3;
                        z2 = z3;
                        f6 = sin;
                        subshort42 = subshort44;
                        str = str2;
                        write = AppCompatViewInflater;
                        canvas3 = canvas;
                        addI16.write write6 = expandedFormat;
                        subfloat2 = subfloat22;
                        write2 = write6;
                    }
                    if (z6 || z7) {
                        subshort43 = subshort42;
                        float f37 = (cos * f18) + subshort43.MediaBrowserCompat$ItemReceiver;
                        float f38 = (f18 * f6) + subshort43.MediaBrowserCompat$CustomActionResultReceiver;
                        this.IconCompatParcelizer.setTextAlign(Paint.Align.CENTER);
                        if (!z6 || !z7) {
                            if (z6) {
                                if (i5 < addmatrix.MediaBrowserCompat$CustomActionResultReceiver() && str != null) {
                                    canvas3.drawText(str, f37, f38 + (MediaBrowserCompat$ItemReceiver / 2.0f), this.MediaBrowserCompat$SearchResultReceiver);
                                }
                            } else if (z7) {
                                this.IconCompatParcelizer.setColor(subfloat2.read(i5));
                                canvas3.drawText(IconCompatParcelizer, f37, f38 + (MediaBrowserCompat$ItemReceiver / 2.0f), this.IconCompatParcelizer);
                            }
                            i2++;
                            i5++;
                            subshort44 = subshort43;
                            AppCompatDelegateImpl$ListMenuDecorView2 = f20;
                            PlaybackStateCompat$CustomAction2 = i6;
                            read4 = subshort45;
                            fArr3 = fArr5;
                            AppCompatViewInflater = write;
                            fArr4 = fArr6;
                            f12 = f21;
                            f13 = f22;
                            f17 = f23;
                            RatingCompat3 = addu16;
                            z3 = z2;
                            subFloat2 subfloat23 = subfloat2;
                            expandedFormat = write2;
                            subfloat22 = subfloat23;
                        } else {
                            this.IconCompatParcelizer.setColor(subfloat2.read(i5));
                            canvas3.drawText(IconCompatParcelizer, f37, f38, this.IconCompatParcelizer);
                            if (i5 < addmatrix.MediaBrowserCompat$CustomActionResultReceiver() && str != null) {
                                canvas3.drawText(str, f37, f38 + MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$SearchResultReceiver);
                            }
                        }
                    } else {
                        subshort43 = subshort42;
                    }
                    i2++;
                    i5++;
                    subshort44 = subshort43;
                    AppCompatDelegateImpl$ListMenuDecorView2 = f20;
                    PlaybackStateCompat$CustomAction2 = i6;
                    read4 = subshort45;
                    fArr3 = fArr5;
                    AppCompatViewInflater = write;
                    fArr4 = fArr6;
                    f12 = f21;
                    f13 = f22;
                    f17 = f23;
                    RatingCompat3 = addu16;
                    z3 = z2;
                    subFloat2 subfloat232 = subfloat2;
                    expandedFormat = write2;
                    subfloat22 = subfloat232;
                }
                canvas2 = canvas;
                z = z3;
                fArr2 = fArr3;
                fArr = fArr4;
                f3 = f12;
                f2 = f13;
                f = f17;
                subshort4 = subshort44;
                subShort4.IconCompatParcelizer(read4);
            } else {
                i2 = i3;
                i = i4;
                z = z3;
                list = write4;
                canvas2 = canvas4;
                subshort4 = read2;
                f4 = Keep2;
                fArr2 = fArr3;
                fArr = fArr4;
                f3 = f12;
                f2 = f13;
                f = f17;
            }
            i4 = i + 1;
            read2 = subshort4;
            canvas4 = canvas2;
            i3 = i2;
            write4 = list;
            Keep2 = f4;
            fArr3 = fArr2;
            fArr4 = fArr;
            f12 = f3;
            f13 = f2;
            f17 = f;
            z3 = z;
        }
        Canvas canvas6 = canvas4;
        subShort4.IconCompatParcelizer(read2);
        canvas.restore();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Canvas canvas, isComplex.C13709[] r35) {
        float f;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        RectF rectF;
        float f3;
        float f4;
        int i;
        subFloat2 MediaBrowserCompat$CustomActionResultReceiver;
        float f5;
        float f6;
        float f7;
        int i2;
        float f8;
        RectF rectF2;
        float f9;
        float f10;
        float f11;
        isComplex.C13709[] r1 = r35;
        boolean z2 = this.MediaSessionCompat$Token.AppCompatViewInflater && !this.MediaSessionCompat$Token.ActionMenuItemView;
        if (!z2 || !this.MediaSessionCompat$Token.setChecked) {
            float f12 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            float f13 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            float f14 = this.MediaSessionCompat$Token.setPopupCallback;
            float[] fArr3 = this.MediaSessionCompat$Token.setBackgroundResource;
            float[] fArr4 = this.MediaSessionCompat$Token.setHasDecor;
            PieChart pieChart = this.MediaSessionCompat$Token;
            subShort4 read2 = subShort4.read(pieChart.setContentView.centerX(), pieChart.setContentView.centerY());
            float Keep2 = this.MediaSessionCompat$Token.Keep();
            float f15 = z2 ? (this.MediaSessionCompat$Token.setExpandedFormat / 100.0f) * Keep2 : 0.0f;
            RectF rectF3 = this.PlaybackStateCompat;
            rectF3.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            int i3 = 0;
            while (i3 < r1.length) {
                int i4 = (int) r1[i3].MediaBrowserCompat$SearchResultReceiver;
                if (i4 >= fArr3.length || (MediaBrowserCompat$CustomActionResultReceiver = ((addMatrix) this.MediaSessionCompat$Token.MediaBrowserCompat$SearchResultReceiver()).MediaBrowserCompat$CustomActionResultReceiver(r1[i3].write)) == null || !MediaBrowserCompat$CustomActionResultReceiver.mo18473x50fd9e4a()) {
                    z = z2;
                    f2 = f12;
                    f = f14;
                    fArr2 = fArr3;
                    fArr = fArr4;
                    i = i3;
                    rectF = rectF3;
                    f3 = f13;
                    f4 = f15;
                } else {
                    int PlaybackStateCompat$CustomAction2 = MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat$CustomAction();
                    z = z2;
                    int i5 = 0;
                    int i6 = 0;
                    while (i5 < PlaybackStateCompat$CustomAction2) {
                        int i7 = i3;
                        if (Math.abs(((addI64) MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i5)).IconCompatParcelizer) > subShort3.read) {
                            i6++;
                        }
                        i5++;
                        i3 = i7;
                    }
                    int i8 = i3;
                    if (i4 == 0) {
                        f5 = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        f5 = fArr4[i4 - 1] * f12;
                    }
                    if (i6 <= 1) {
                        f6 = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        f6 = MediaBrowserCompat$CustomActionResultReceiver.AppCompatDelegateImpl$ListMenuDecorView();
                    }
                    float f16 = fArr3[i4];
                    float backgroundResource = MediaBrowserCompat$CustomActionResultReceiver.setBackgroundResource();
                    float f17 = Keep2 + backgroundResource;
                    f2 = f12;
                    rectF3.set(this.MediaSessionCompat$Token.setContentView);
                    float f18 = -backgroundResource;
                    rectF3.inset(f18, f18);
                    boolean z3 = f6 > BitmapDescriptorFactory.HUE_RED && f16 <= 180.0f;
                    this.write.setColor(MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(i4));
                    float f19 = i6 == 1 ? BitmapDescriptorFactory.HUE_RED : f6 / (Keep2 * 0.017453292f);
                    float f20 = i6 == 1 ? BitmapDescriptorFactory.HUE_RED : f6 / (f17 * 0.017453292f);
                    float f21 = f14 + (((f19 / 2.0f) + f5) * f13);
                    float f22 = (f16 - f19) * f13;
                    float f23 = f22 < BitmapDescriptorFactory.HUE_RED ? 0.0f : f22;
                    float f24 = (((f20 / 2.0f) + f5) * f13) + f14;
                    float f25 = (f16 - f20) * f13;
                    if (f25 < BitmapDescriptorFactory.HUE_RED) {
                        f25 = 0.0f;
                    }
                    this.PlaybackStateCompat$CustomAction.reset();
                    int i9 = (f23 > 360.0f ? 1 : (f23 == 360.0f ? 0 : -1));
                    if (i9 < 0 || f23 % 360.0f > subShort3.read) {
                        fArr2 = fArr3;
                        fArr = fArr4;
                        f7 = f5;
                        i2 = i6;
                        double d = (double) (f24 * 0.017453292f);
                        f3 = f13;
                        f = f14;
                        this.PlaybackStateCompat$CustomAction.moveTo(read2.MediaBrowserCompat$ItemReceiver + (((float) Math.cos(d)) * f17), read2.MediaBrowserCompat$CustomActionResultReceiver + (f17 * ((float) Math.sin(d))));
                        this.PlaybackStateCompat$CustomAction.arcTo(rectF3, f24, f25);
                    } else {
                        fArr2 = fArr3;
                        this.PlaybackStateCompat$CustomAction.addCircle(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, f17, Path.Direction.CW);
                        f7 = f5;
                        i2 = i6;
                        f = f14;
                        fArr = fArr4;
                        f3 = f13;
                    }
                    if (z3) {
                        double d2 = (double) (f21 * 0.017453292f);
                        float cos = (((float) Math.cos(d2)) * Keep2) + read2.MediaBrowserCompat$ItemReceiver;
                        float sin = read2.MediaBrowserCompat$CustomActionResultReceiver + (((float) Math.sin(d2)) * Keep2);
                        i = i8;
                        rectF2 = rectF3;
                        f4 = f15;
                        f9 = 0.0f;
                        f8 = MediaBrowserCompat$CustomActionResultReceiver(read2, Keep2, f16 * f3, cos, sin, f21, f23);
                    } else {
                        rectF2 = rectF3;
                        f4 = f15;
                        f9 = 0.0f;
                        i = i8;
                        f8 = 0.0f;
                    }
                    this.AlertController$RecycleListView.set(read2.MediaBrowserCompat$ItemReceiver - f4, read2.MediaBrowserCompat$CustomActionResultReceiver - f4, read2.MediaBrowserCompat$ItemReceiver + f4, read2.MediaBrowserCompat$CustomActionResultReceiver + f4);
                    if (!z) {
                        rectF = rectF2;
                        f10 = 360.0f;
                    } else if (f4 > f9 || z3) {
                        if (z3) {
                            if (f8 < f9) {
                                f8 = -f8;
                            }
                            f11 = Math.max(f4, f8);
                        } else {
                            f11 = f4;
                        }
                        float f26 = (i2 == 1 || f11 == f9) ? f9 : f6 / (f11 * 0.017453292f);
                        float f27 = f26 / 2.0f;
                        float f28 = (f16 - f26) * f3;
                        if (f28 < f9) {
                            f28 = f9;
                        }
                        float f29 = ((f7 + f27) * f3) + f + f28;
                        if (i9 < 0 || f23 % 360.0f > subShort3.read) {
                            double d3 = (double) (0.017453292f * f29);
                            rectF = rectF2;
                            this.PlaybackStateCompat$CustomAction.lineTo(read2.MediaBrowserCompat$ItemReceiver + (((float) Math.cos(d3)) * f11), read2.MediaBrowserCompat$CustomActionResultReceiver + (f11 * ((float) Math.sin(d3))));
                            this.PlaybackStateCompat$CustomAction.arcTo(this.AlertController$RecycleListView, f29, -f28);
                        } else {
                            this.PlaybackStateCompat$CustomAction.addCircle(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, f11, Path.Direction.CCW);
                            rectF = rectF2;
                        }
                        this.PlaybackStateCompat$CustomAction.close();
                        this.read.drawPath(this.PlaybackStateCompat$CustomAction, this.write);
                    } else {
                        rectF = rectF2;
                        f10 = 360.0f;
                    }
                    if (f23 % f10 > subShort3.read) {
                        if (z3) {
                            double d4 = (double) (0.017453292f * (f21 + (f23 / 2.0f)));
                            this.PlaybackStateCompat$CustomAction.lineTo(read2.MediaBrowserCompat$ItemReceiver + (((float) Math.cos(d4)) * f8), read2.MediaBrowserCompat$CustomActionResultReceiver + (f8 * ((float) Math.sin(d4))));
                        } else {
                            this.PlaybackStateCompat$CustomAction.lineTo(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver);
                        }
                    }
                    this.PlaybackStateCompat$CustomAction.close();
                    this.read.drawPath(this.PlaybackStateCompat$CustomAction, this.write);
                }
                i3 = i + 1;
                r1 = r35;
                f15 = f4;
                f13 = f3;
                rectF3 = rectF;
                z2 = z;
                f12 = f2;
                fArr3 = fArr2;
                fArr4 = fArr;
                f14 = f;
            }
            subShort4.IconCompatParcelizer(read2);
        }
    }

    public final void read(Canvas canvas) {
        float f;
        RectF rectF;
        Canvas canvas2 = canvas;
        if (this.MediaSessionCompat$Token.AppCompatViewInflater && this.read != null) {
            float Keep2 = this.MediaSessionCompat$Token.Keep();
            float f2 = (this.MediaSessionCompat$Token.setExpandedFormat / 100.0f) * Keep2;
            PieChart pieChart = this.MediaSessionCompat$Token;
            subShort4 read2 = subShort4.read(pieChart.setContentView.centerX(), pieChart.setContentView.centerY());
            if (Color.alpha(this.RatingCompat.getColor()) > 0) {
                this.read.drawCircle(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, f2, this.RatingCompat);
            }
            if (Color.alpha(this.MediaBrowserCompat$MediaItem.getColor()) > 0 && this.MediaSessionCompat$Token.setCheckable > this.MediaSessionCompat$Token.setExpandedFormat) {
                int alpha = this.MediaBrowserCompat$MediaItem.getAlpha();
                this.MediaBrowserCompat$MediaItem.setAlpha((int) (((float) alpha) * this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer * this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver));
                this.setHasDecor.reset();
                this.setHasDecor.addCircle(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, Keep2 * (this.MediaSessionCompat$Token.setCheckable / 100.0f), Path.Direction.CW);
                this.setHasDecor.addCircle(read2.MediaBrowserCompat$ItemReceiver, read2.MediaBrowserCompat$CustomActionResultReceiver, f2, Path.Direction.CCW);
                this.read.drawPath(this.setHasDecor, this.MediaBrowserCompat$MediaItem);
                this.MediaBrowserCompat$MediaItem.setAlpha(alpha);
            }
            subShort4.IconCompatParcelizer(read2);
        }
        canvas2.drawBitmap(this.MediaMetadataCompat.get(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        CharSequence charSequence = this.MediaSessionCompat$Token.AlertController$RecycleListView;
        if (this.MediaSessionCompat$Token.AppCompatDelegateImpl$ListMenuDecorView && charSequence != null) {
            PieChart pieChart2 = this.MediaSessionCompat$Token;
            subShort4 read3 = subShort4.read(pieChart2.setContentView.centerX(), pieChart2.setContentView.centerY());
            PieChart pieChart3 = this.MediaSessionCompat$Token;
            subShort4 read4 = subShort4.read(pieChart3.PlaybackStateCompat$CustomAction.MediaBrowserCompat$ItemReceiver, pieChart3.PlaybackStateCompat$CustomAction.MediaBrowserCompat$CustomActionResultReceiver);
            float f3 = read3.MediaBrowserCompat$ItemReceiver + read4.MediaBrowserCompat$ItemReceiver;
            float f4 = read3.MediaBrowserCompat$CustomActionResultReceiver + read4.MediaBrowserCompat$CustomActionResultReceiver;
            if (!this.MediaSessionCompat$Token.AppCompatViewInflater || this.MediaSessionCompat$Token.ActionMenuItemView) {
                f = this.MediaSessionCompat$Token.Keep();
            } else {
                f = this.MediaSessionCompat$Token.Keep() * (this.MediaSessionCompat$Token.setExpandedFormat / 100.0f);
            }
            RectF rectF2 = this.AppCompatDelegateImpl$ListMenuDecorView[0];
            rectF2.left = f3 - f;
            rectF2.top = f4 - f;
            rectF2.right = f3 + f;
            rectF2.bottom = f4 + f;
            RectF rectF3 = this.AppCompatDelegateImpl$ListMenuDecorView[1];
            rectF3.set(rectF2);
            float f5 = this.MediaSessionCompat$Token.AppCompatActivity / 100.0f;
            if (((double) f5) > 0.0d) {
                rectF3.inset((rectF3.width() - (rectF3.width() * f5)) / 2.0f, (rectF3.height() - (rectF3.height() * f5)) / 2.0f);
            }
            if (!charSequence.equals(this.MediaSessionCompat$ResultReceiverWrapper) || !rectF3.equals(this.MediaSessionCompat$QueueItem)) {
                this.MediaSessionCompat$QueueItem.set(rectF3);
                this.MediaSessionCompat$ResultReceiverWrapper = charSequence;
                StaticLayout staticLayout = r4;
                rectF = rectF3;
                StaticLayout staticLayout2 = new StaticLayout(charSequence, 0, charSequence.length(), this.MediaDescriptionCompat, (int) Math.max(Math.ceil((double) this.MediaSessionCompat$QueueItem.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, BitmapDescriptorFactory.HUE_RED, false);
                this.f2653x50fd9e4a = staticLayout;
            } else {
                rectF = rectF3;
            }
            float height = (float) this.f2653x50fd9e4a.getHeight();
            canvas.save();
            if (Build.VERSION.SDK_INT >= 18) {
                Path path = this.Keep;
                path.reset();
                path.addOval(rectF2, Path.Direction.CW);
                canvas2.clipPath(path);
            }
            canvas2.translate(rectF.left, rectF.top + ((rectF.height() - height) / 2.0f));
            this.f2653x50fd9e4a.draw(canvas2);
            canvas.restore();
            subShort4.IconCompatParcelizer(read3);
            subShort4.IconCompatParcelizer(read4);
        }
    }
}
