package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.addF64;
import p040o.addI8;
import p040o.subByte2;
import p040o.subFloat4;
import p040o.subShort3;
import p040o.subShort4;

public abstract class PieRadarChartBase<T extends addF64<? extends subByte2<? extends addI8>>> extends Chart<T> {
    private float setHasDecor = BitmapDescriptorFactory.HUE_RED;
    public boolean setItemInvoker = true;
    public float setPopupCallback = 270.0f;
    public float setShortcut = 270.0f;

    public abstract int IconCompatParcelizer(float f);

    public abstract float Keep();

    /* access modifiers changed from: protected */
    public abstract float PlaybackStateCompat();

    /* access modifiers changed from: protected */
    public void read() {
    }

    /* access modifiers changed from: protected */
    public abstract float setHasDecor();

    public PieRadarChartBase(Context context) {
        super(context);
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void ParcelableVolumeInfo() {
        super.ParcelableVolumeInfo();
        this.MediaBrowserCompat$ItemReceiver = new subFloat4(this);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f43x50fd9e4a || this.MediaBrowserCompat$ItemReceiver == null) {
            return super.onTouchEvent(motionEvent);
        }
        return this.MediaBrowserCompat$ItemReceiver.onTouch(this, motionEvent);
    }

    public void computeScroll() {
        if (this.MediaBrowserCompat$ItemReceiver instanceof subFloat4) {
            ((subFloat4) this.MediaBrowserCompat$ItemReceiver).read();
        }
    }

    public void AlertController$RecycleListView() {
        if (this.read != null) {
            read();
            if (this.ParcelableVolumeInfo != null) {
                this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(this.read);
            }
            MediaBrowserCompat$ItemReceiver();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        if (r3 != 2) goto L_0x0176;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void MediaBrowserCompat$ItemReceiver() {
        /*
            r18 = this;
            r0 = r18
            o.FieldPacker r1 = r0.ParcelableVolumeInfo
            r2 = 0
            if (r1 == 0) goto L_0x0198
            o.FieldPacker r1 = r0.ParcelableVolumeInfo
            boolean r1 = r1.MediaSessionCompat$ResultReceiverWrapper
            if (r1 == 0) goto L_0x0198
            o.FieldPacker r1 = r0.ParcelableVolumeInfo
            float r1 = r1.setHasDecor
            o.rsnScriptInvokeV$IconCompatParcelizer r3 = r0.Keep
            float r3 = r3.IconCompatParcelizer
            o.FieldPacker r4 = r0.ParcelableVolumeInfo
            float r4 = r4.RatingCompat
            float r3 = r3 * r4
            float r1 = java.lang.Math.min(r1, r3)
            int[] r3 = com.github.mikephil.charting.charts.PieRadarChartBase.C01511.IconCompatParcelizer
            o.FieldPacker r4 = r0.ParcelableVolumeInfo
            o.FieldPacker$write r4 = r4.Keep
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 2
            r5 = 1
            if (r3 == r5) goto L_0x0068
            if (r3 != r4) goto L_0x0176
            o.FieldPacker r1 = r0.ParcelableVolumeInfo
            o.FieldPacker$read r1 = r1.AppCompatDialogFragment
            o.FieldPacker$read r3 = p040o.FieldPacker.read.TOP
            if (r1 == r3) goto L_0x0040
            o.FieldPacker r1 = r0.ParcelableVolumeInfo
            o.FieldPacker$read r1 = r1.AppCompatDialogFragment
            o.FieldPacker$read r3 = p040o.FieldPacker.read.BOTTOM
            if (r1 != r3) goto L_0x0176
        L_0x0040:
            float r1 = r18.setHasDecor()
            o.FieldPacker r3 = r0.ParcelableVolumeInfo
            float r3 = r3.PlaybackStateCompat
            o.rsnScriptInvokeV$IconCompatParcelizer r6 = r0.Keep
            float r6 = r6.write
            o.FieldPacker r7 = r0.ParcelableVolumeInfo
            float r7 = r7.RatingCompat
            float r3 = r3 + r1
            float r6 = r6 * r7
            float r1 = java.lang.Math.min(r3, r6)
            int[] r3 = com.github.mikephil.charting.charts.PieRadarChartBase.C01511.read
            o.FieldPacker r6 = r0.ParcelableVolumeInfo
            o.FieldPacker$read r6 = r6.AppCompatDialogFragment
            int r6 = r6.ordinal()
            r3 = r3[r6]
            if (r3 == r5) goto L_0x0172
            if (r3 == r4) goto L_0x015d
            goto L_0x0176
        L_0x0068:
            o.FieldPacker r3 = r0.ParcelableVolumeInfo
            o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r3 = r3.MediaBrowserCompat$SearchResultReceiver
            o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r6 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.LEFT
            if (r3 == r6) goto L_0x007b
            o.FieldPacker r3 = r0.ParcelableVolumeInfo
            o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r3 = r3.MediaBrowserCompat$SearchResultReceiver
            o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r6 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.RIGHT
            if (r3 == r6) goto L_0x007b
            r1 = r2
            goto L_0x0128
        L_0x007b:
            o.FieldPacker r3 = r0.ParcelableVolumeInfo
            o.FieldPacker$read r3 = r3.AppCompatDialogFragment
            o.FieldPacker$read r6 = p040o.FieldPacker.read.CENTER
            if (r3 != r6) goto L_0x008c
            r3 = 1095761920(0x41500000, float:13.0)
            float r3 = p040o.subShort3.read((float) r3)
            float r1 = r1 + r3
            goto L_0x0128
        L_0x008c:
            r3 = 1090519040(0x41000000, float:8.0)
            float r3 = p040o.subShort3.read((float) r3)
            float r1 = r1 + r3
            o.FieldPacker r3 = r0.ParcelableVolumeInfo
            float r3 = r3.PlaybackStateCompat
            o.FieldPacker r6 = r0.ParcelableVolumeInfo
            float r6 = r6.AppCompatActivity
            int r7 = r18.getWidth()
            float r7 = (float) r7
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r8
            int r9 = r18.getHeight()
            float r9 = (float) r9
            float r9 = r9 / r8
            o.subShort4 r7 = p040o.subShort4.read(r7, r9)
            o.FieldPacker r8 = r0.ParcelableVolumeInfo
            o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r8 = r8.MediaBrowserCompat$SearchResultReceiver
            o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r9 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.RIGHT
            r10 = 1097859072(0x41700000, float:15.0)
            if (r8 != r9) goto L_0x00bf
            int r8 = r18.getWidth()
            float r8 = (float) r8
            float r8 = r8 - r1
            float r8 = r8 + r10
            goto L_0x00c1
        L_0x00bf:
            float r8 = r1 - r10
        L_0x00c1:
            float r3 = r3 + r6
            float r3 = r3 + r10
            float r6 = r0.MediaBrowserCompat$ItemReceiver(r8, r3)
            float r9 = r18.Keep()
            float r8 = r0.write(r8, r3)
            o.subShort4 r10 = p040o.subShort4.read(r2, r2)
            float r11 = r7.MediaBrowserCompat$ItemReceiver
            double r11 = (double) r11
            double r13 = (double) r9
            double r8 = (double) r8
            double r15 = java.lang.Math.toRadians(r8)
            double r15 = java.lang.Math.cos(r15)
            double r15 = r15 * r13
            double r11 = r11 + r15
            float r11 = (float) r11
            r10.MediaBrowserCompat$ItemReceiver = r11
            float r11 = r7.MediaBrowserCompat$CustomActionResultReceiver
            double r11 = (double) r11
            double r8 = java.lang.Math.toRadians(r8)
            double r8 = java.lang.Math.sin(r8)
            double r13 = r13 * r8
            double r11 = r11 + r13
            float r8 = (float) r11
            r10.MediaBrowserCompat$CustomActionResultReceiver = r8
            float r8 = r10.MediaBrowserCompat$ItemReceiver
            float r9 = r10.MediaBrowserCompat$CustomActionResultReceiver
            float r8 = r0.MediaBrowserCompat$ItemReceiver(r8, r9)
            r9 = 1084227584(0x40a00000, float:5.0)
            float r9 = p040o.subShort3.read((float) r9)
            float r11 = r7.MediaBrowserCompat$CustomActionResultReceiver
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 < 0) goto L_0x0119
            int r3 = r18.getHeight()
            float r3 = (float) r3
            float r3 = r3 - r1
            int r11 = r18.getWidth()
            float r11 = (float) r11
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0119
            goto L_0x0122
        L_0x0119:
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0121
            float r8 = r8 - r6
            float r9 = r9 + r8
            r1 = r9
            goto L_0x0122
        L_0x0121:
            r1 = r2
        L_0x0122:
            p040o.subShort4.IconCompatParcelizer(r7)
            p040o.subShort4.IconCompatParcelizer(r10)
        L_0x0128:
            int[] r3 = com.github.mikephil.charting.charts.PieRadarChartBase.C01511.MediaBrowserCompat$CustomActionResultReceiver
            o.FieldPacker r6 = r0.ParcelableVolumeInfo
            o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r6 = r6.MediaBrowserCompat$SearchResultReceiver
            int r6 = r6.ordinal()
            r3 = r3[r6]
            if (r3 == r5) goto L_0x017a
            if (r3 == r4) goto L_0x0177
            r1 = 3
            if (r3 != r1) goto L_0x0176
            int[] r1 = com.github.mikephil.charting.charts.PieRadarChartBase.C01511.read
            o.FieldPacker r3 = r0.ParcelableVolumeInfo
            o.FieldPacker$read r3 = r3.AppCompatDialogFragment
            int r3 = r3.ordinal()
            r1 = r1[r3]
            if (r1 == r5) goto L_0x0161
            if (r1 == r4) goto L_0x014c
            goto L_0x0176
        L_0x014c:
            o.FieldPacker r1 = r0.ParcelableVolumeInfo
            float r1 = r1.PlaybackStateCompat
            o.rsnScriptInvokeV$IconCompatParcelizer r3 = r0.Keep
            float r3 = r3.write
            o.FieldPacker r4 = r0.ParcelableVolumeInfo
            float r4 = r4.RatingCompat
            float r3 = r3 * r4
            float r1 = java.lang.Math.min(r1, r3)
        L_0x015d:
            r4 = r1
            r1 = r2
            r3 = r1
            goto L_0x017e
        L_0x0161:
            o.FieldPacker r1 = r0.ParcelableVolumeInfo
            float r1 = r1.PlaybackStateCompat
            o.rsnScriptInvokeV$IconCompatParcelizer r3 = r0.Keep
            float r3 = r3.write
            o.FieldPacker r4 = r0.ParcelableVolumeInfo
            float r4 = r4.RatingCompat
            float r3 = r3 * r4
            float r1 = java.lang.Math.min(r1, r3)
        L_0x0172:
            r3 = r1
            r1 = r2
            r4 = r1
            goto L_0x017e
        L_0x0176:
            r1 = r2
        L_0x0177:
            r3 = r2
            r4 = r3
            goto L_0x017e
        L_0x017a:
            r3 = r2
            r4 = r3
            r2 = r1
            r1 = r4
        L_0x017e:
            float r5 = r18.PlaybackStateCompat()
            float r2 = r2 + r5
            float r5 = r18.PlaybackStateCompat()
            float r1 = r1 + r5
            float r5 = r18.PlaybackStateCompat()
            float r3 = r3 + r5
            float r5 = r18.PlaybackStateCompat()
            float r4 = r4 + r5
            r17 = r4
            r4 = r2
            r2 = r17
            goto L_0x019b
        L_0x0198:
            r1 = r2
            r3 = r1
            r4 = r3
        L_0x019b:
            float r5 = r0.setHasDecor
            float r5 = p040o.subShort3.read((float) r5)
            boolean r6 = r0 instanceof com.github.mikephil.charting.charts.RadarChart
            if (r6 == 0) goto L_0x01b8
            o.Element$DataType r6 = r18.MediaSessionCompat$ResultReceiverWrapper()
            boolean r7 = r6.MediaSessionCompat$ResultReceiverWrapper
            if (r7 == 0) goto L_0x01b8
            boolean r7 = r6.MediaBrowserCompat$SearchResultReceiver
            if (r7 == 0) goto L_0x01b8
            int r6 = r6.PlaybackStateCompat$CustomAction
            float r6 = (float) r6
            float r5 = java.lang.Math.max(r5, r6)
        L_0x01b8:
            float r6 = r18.MediaDescriptionCompat()
            float r7 = r18.RatingCompat()
            float r8 = r18.MediaBrowserCompat$MediaItem()
            float r9 = r18.MediaMetadataCompat()
            float r4 = r4 + r9
            float r4 = java.lang.Math.max(r5, r4)
            float r3 = r3 + r6
            float r3 = java.lang.Math.max(r5, r3)
            float r1 = r1 + r7
            float r1 = java.lang.Math.max(r5, r1)
            float r6 = r18.PlaybackStateCompat()
            float r2 = r2 + r8
            float r2 = java.lang.Math.max(r6, r2)
            float r2 = java.lang.Math.max(r5, r2)
            o.rsnScriptInvokeV$IconCompatParcelizer r5 = r0.Keep
            android.graphics.RectF r6 = r5.MediaBrowserCompat$ItemReceiver
            float r7 = r5.IconCompatParcelizer
            float r7 = r7 - r1
            float r5 = r5.write
            float r5 = r5 - r2
            r6.set(r4, r3, r7, r5)
            boolean r5 = r0.MediaSessionCompat$QueueItem
            if (r5 == 0) goto L_0x0223
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "offsetLeft: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = ", offsetTop: "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = ", offsetRight: "
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = ", offsetBottom: "
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = "MPAndroidChart"
            android.util.Log.i(r2, r1)
        L_0x0223:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieRadarChartBase.MediaBrowserCompat$ItemReceiver():void");
    }

    /* renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$1 */
    static /* synthetic */ class C01511 {
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(2:13|14)|15|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        static {
            /*
                o.FieldPacker$write[] r0 = p040o.FieldPacker.write.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                IconCompatParcelizer = r0
                r1 = 1
                o.FieldPacker$write r2 = p040o.FieldPacker.write.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.FieldPacker$write r3 = p040o.FieldPacker.write.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver[] r2 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                MediaBrowserCompat$CustomActionResultReceiver = r2
                o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r3 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.LEFT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0038 }
                o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r3 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.RIGHT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0043 }
                o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r3 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                o.FieldPacker$read[] r2 = p040o.FieldPacker.read.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                read = r2
                o.FieldPacker$read r3 = p040o.FieldPacker.read.TOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = read     // Catch:{ NoSuchFieldError -> 0x005e }
                o.FieldPacker$read r2 = p040o.FieldPacker.read.BOTTOM     // Catch:{ NoSuchFieldError -> 0x005e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieRadarChartBase.C01511.<clinit>():void");
        }
    }

    public final float write(float f, float f2) {
        subShort4 MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
        double d = (double) (f - MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
        double d2 = (double) (f2 - MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        float degrees = (float) Math.toDegrees(Math.acos(d2 / Math.sqrt((d * d) + (d2 * d2))));
        if (f > MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        subShort4.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
        return f3;
    }

    public final float MediaBrowserCompat$ItemReceiver(float f, float f2) {
        float f3;
        float f4;
        subShort4 MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
        if (f > MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) {
            f3 = f - MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        } else {
            f3 = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver - f;
        }
        if (f2 > MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            f4 = f2 - MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            f4 = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver - f2;
        }
        float sqrt = (float) Math.sqrt(Math.pow((double) f3, 2.0d) + Math.pow((double) f4, 2.0d));
        subShort4.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
        return sqrt;
    }

    public void setRotationAngle(float f) {
        this.setShortcut = f;
        this.setPopupCallback = subShort3.IconCompatParcelizer(f);
    }

    public void setRotationEnabled(boolean z) {
        this.setItemInvoker = z;
    }

    public void setMinOffset(float f) {
        this.setHasDecor = f;
    }

    public final float AppCompatActivity() {
        RectF rectF = this.Keep.MediaBrowserCompat$ItemReceiver;
        rectF.left += MediaMetadataCompat();
        rectF.top += MediaDescriptionCompat();
        rectF.right -= RatingCompat();
        rectF.bottom -= MediaBrowserCompat$MediaItem();
        return Math.min(rectF.width(), rectF.height());
    }
}
