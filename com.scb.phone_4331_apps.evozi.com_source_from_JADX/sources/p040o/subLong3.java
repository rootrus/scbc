package p040o;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p040o.rsnScriptInvokeV;

/* renamed from: o.subLong3 */
public final class subLong3 extends MyQRCoachMarkActivity {
    private List<rsnScriptInvokeV> IconCompatParcelizer = new ArrayList(16);
    private Paint MediaBrowserCompat$CustomActionResultReceiver;
    public Paint MediaBrowserCompat$ItemReceiver;
    private Path MediaDescriptionCompat = new Path();
    private Paint.FontMetrics read = new Paint.FontMetrics();
    private FieldPacker write;

    public subLong3(rsnScriptInvokeV.IconCompatParcelizer iconCompatParcelizer, FieldPacker fieldPacker) {
        super(iconCompatParcelizer);
        this.write = fieldPacker;
        Paint paint = new Paint(1);
        this.MediaBrowserCompat$ItemReceiver = paint;
        paint.setTextSize(subShort3.read(9.0f));
        this.MediaBrowserCompat$ItemReceiver.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = paint2;
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: o.addF64<?>} */
    /* JADX WARNING: type inference failed for: r8v1, types: [o.subByte2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(p040o.addF64<?> r19) {
        /*
            r18 = this;
            r0 = r18
            java.util.List<o.rsnScriptInvokeV> r1 = r0.IconCompatParcelizer
            r1.clear()
            r3 = r19
            r2 = 0
        L_0x000a:
            int r4 = r19.read()
            if (r2 >= r4) goto L_0x0188
            o.subByte2 r4 = r3.write(r2)
            java.util.List r5 = r4.MediaBrowserCompat$CustomActionResultReceiver()
            int r6 = r4.PlaybackStateCompat$CustomAction()
            boolean r7 = r4 instanceof p040o.subDouble3
            if (r7 == 0) goto L_0x0088
            r7 = r4
            o.subDouble3 r7 = (p040o.subDouble3) r7
            boolean r8 = r7.setContentView()
            if (r8 == 0) goto L_0x0088
            java.lang.String[] r6 = r7.AppCompatDelegateImpl$ListMenuDecorView()
            r8 = 0
        L_0x002e:
            int r9 = r5.size()
            if (r8 >= r9) goto L_0x0065
            int r9 = r7.setBackgroundResource()
            if (r8 >= r9) goto L_0x0065
            java.util.List<o.rsnScriptInvokeV> r9 = r0.IconCompatParcelizer
            int r10 = r6.length
            int r10 = r8 % r10
            r12 = r6[r10]
            o.FieldPacker$MediaBrowserCompat$ItemReceiver r13 = r4.MediaBrowserCompat$ItemReceiver()
            float r14 = r4.write()
            float r15 = r4.read()
            o.rsnScriptInvokeV r10 = new o.rsnScriptInvokeV
            r16 = 0
            java.lang.Object r11 = r5.get(r8)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r17 = r11.intValue()
            r11 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r9.add(r10)
            int r8 = r8 + 1
            goto L_0x002e
        L_0x0065:
            java.lang.String r5 = r7.MediaDescriptionCompat()
            if (r5 == 0) goto L_0x0084
            java.util.List<o.rsnScriptInvokeV> r5 = r0.IconCompatParcelizer
            o.rsnScriptInvokeV r13 = new o.rsnScriptInvokeV
            java.lang.String r7 = r4.MediaDescriptionCompat()
            o.FieldPacker$MediaBrowserCompat$ItemReceiver r8 = p040o.FieldPacker$MediaBrowserCompat$ItemReceiver.NONE
            r9 = 2143289344(0x7fc00000, float:NaN)
            r10 = 2143289344(0x7fc00000, float:NaN)
            r11 = 0
            r12 = 1122867(0x112233, float:1.573472E-39)
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.add(r13)
        L_0x0084:
            r7 = r19
            goto L_0x0184
        L_0x0088:
            boolean r3 = r4 instanceof p040o.subFloat2
            if (r3 == 0) goto L_0x00e6
            r3 = r4
            o.subFloat2 r3 = (p040o.subFloat2) r3
            r7 = 0
        L_0x0090:
            int r8 = r5.size()
            if (r7 >= r8) goto L_0x00c5
            if (r7 >= r6) goto L_0x00c5
            java.util.List<o.rsnScriptInvokeV> r8 = r0.IconCompatParcelizer
            o.addI8 r9 = r3.MediaBrowserCompat$ItemReceiver((int) r7)
            o.addI64 r9 = (p040o.addI64) r9
            java.lang.String r11 = r9.MediaBrowserCompat$CustomActionResultReceiver
            o.FieldPacker$MediaBrowserCompat$ItemReceiver r12 = r4.MediaBrowserCompat$ItemReceiver()
            float r13 = r4.write()
            float r14 = r4.read()
            o.rsnScriptInvokeV r9 = new o.rsnScriptInvokeV
            r15 = 0
            java.lang.Object r10 = r5.get(r7)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r16 = r10.intValue()
            r10 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r8.add(r9)
            int r7 = r7 + 1
            goto L_0x0090
        L_0x00c5:
            java.lang.String r3 = r3.MediaDescriptionCompat()
            if (r3 == 0) goto L_0x0181
            java.util.List<o.rsnScriptInvokeV> r3 = r0.IconCompatParcelizer
            o.rsnScriptInvokeV r12 = new o.rsnScriptInvokeV
            java.lang.String r6 = r4.MediaDescriptionCompat()
            o.FieldPacker$MediaBrowserCompat$ItemReceiver r7 = p040o.FieldPacker$MediaBrowserCompat$ItemReceiver.NONE
            r8 = 2143289344(0x7fc00000, float:NaN)
            r9 = 2143289344(0x7fc00000, float:NaN)
            r10 = 0
            r11 = 1122867(0x112233, float:1.573472E-39)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.add(r12)
            goto L_0x0181
        L_0x00e6:
            boolean r3 = r4 instanceof p040o.subByte3
            if (r3 == 0) goto L_0x0134
            r3 = r4
            o.subByte3 r3 = (p040o.subByte3) r3
            int r7 = r3.setBackgroundResource()
            r8 = 1122867(0x112233, float:1.573472E-39)
            if (r7 == r8) goto L_0x0134
            int r15 = r3.setBackgroundResource()
            int r3 = r3.AppCompatDelegateImpl$ListMenuDecorView()
            java.util.List<o.rsnScriptInvokeV> r5 = r0.IconCompatParcelizer
            o.FieldPacker$MediaBrowserCompat$ItemReceiver r11 = r4.MediaBrowserCompat$ItemReceiver()
            float r12 = r4.write()
            float r13 = r4.read()
            o.rsnScriptInvokeV r6 = new o.rsnScriptInvokeV
            r10 = 0
            r14 = 0
            r9 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r5.add(r6)
            java.util.List<o.rsnScriptInvokeV> r12 = r0.IconCompatParcelizer
            java.lang.String r6 = r4.MediaDescriptionCompat()
            o.FieldPacker$MediaBrowserCompat$ItemReceiver r7 = r4.MediaBrowserCompat$ItemReceiver()
            float r8 = r4.write()
            float r9 = r4.read()
            o.rsnScriptInvokeV r4 = new o.rsnScriptInvokeV
            r5 = r4
            r11 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.add(r4)
            goto L_0x0181
        L_0x0134:
            r3 = 0
        L_0x0135:
            int r7 = r5.size()
            if (r3 >= r7) goto L_0x0181
            if (r3 >= r6) goto L_0x0181
            int r7 = r5.size()
            int r7 = r7 + -1
            if (r3 >= r7) goto L_0x014e
            int r7 = r6 + -1
            if (r3 >= r7) goto L_0x014e
            r7 = 0
            r10 = r7
            r7 = r19
            goto L_0x0159
        L_0x014e:
            r7 = r19
            o.subByte2 r8 = r7.write(r2)
            java.lang.String r8 = r8.MediaDescriptionCompat()
            r10 = r8
        L_0x0159:
            java.util.List<o.rsnScriptInvokeV> r8 = r0.IconCompatParcelizer
            o.FieldPacker$MediaBrowserCompat$ItemReceiver r11 = r4.MediaBrowserCompat$ItemReceiver()
            float r12 = r4.write()
            float r13 = r4.read()
            o.rsnScriptInvokeV r15 = new o.rsnScriptInvokeV
            r14 = 0
            java.lang.Object r9 = r5.get(r3)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r16 = r9.intValue()
            r9 = r15
            r1 = r15
            r15 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.add(r1)
            int r3 = r3 + 1
            goto L_0x0135
        L_0x0181:
            r7 = r19
            r3 = r7
        L_0x0184:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0188:
            o.FieldPacker r1 = r0.write
            java.util.List<o.rsnScriptInvokeV> r2 = r0.IconCompatParcelizer
            int r3 = r2.size()
            o.rsnScriptInvokeV[] r3 = new p040o.rsnScriptInvokeV[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            o.rsnScriptInvokeV[] r2 = (p040o.rsnScriptInvokeV[]) r2
            r1.IconCompatParcelizer = r2
            android.graphics.Paint r1 = r0.MediaBrowserCompat$ItemReceiver
            o.FieldPacker r2 = r0.write
            float r2 = r2.MediaBrowserCompat$ItemReceiver()
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r0.MediaBrowserCompat$ItemReceiver
            o.FieldPacker r2 = r0.write
            int r2 = r2.ParcelableVolumeInfo
            r1.setColor(r2)
            o.FieldPacker r1 = r0.write
            android.graphics.Paint r2 = r0.MediaBrowserCompat$ItemReceiver
            o.rsnScriptInvokeV$IconCompatParcelizer r3 = r0.ParcelableVolumeInfo
            r1.IconCompatParcelizer(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.subLong3.MediaBrowserCompat$ItemReceiver(o.addF64):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(android.graphics.Canvas r35) {
        /*
            r34 = this;
            r6 = r34
            r7 = r35
            o.FieldPacker r0 = r6.write
            boolean r0 = r0.MediaSessionCompat$ResultReceiverWrapper
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            android.graphics.Paint r0 = r6.MediaBrowserCompat$ItemReceiver
            o.FieldPacker r1 = r6.write
            float r1 = r1.MediaBrowserCompat$ItemReceiver()
            r0.setTextSize(r1)
            android.graphics.Paint r0 = r6.MediaBrowserCompat$ItemReceiver
            o.FieldPacker r1 = r6.write
            int r1 = r1.ParcelableVolumeInfo
            r0.setColor(r1)
            android.graphics.Paint r0 = r6.MediaBrowserCompat$ItemReceiver
            android.graphics.Paint$FontMetrics r1 = r6.read
            float r8 = p040o.subShort3.MediaBrowserCompat$CustomActionResultReceiver(r0, r1)
            android.graphics.Paint r0 = r6.MediaBrowserCompat$ItemReceiver
            android.graphics.Paint$FontMetrics r1 = r6.read
            float r0 = p040o.subShort3.MediaBrowserCompat$ItemReceiver((android.graphics.Paint) r0, (android.graphics.Paint.FontMetrics) r1)
            r9 = 0
            float r1 = p040o.subShort3.read((float) r9)
            float r10 = r0 + r1
            android.graphics.Paint r0 = r6.MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = "ABC"
            int r0 = p040o.subShort3.MediaBrowserCompat$ItemReceiver((android.graphics.Paint) r0, (java.lang.String) r1)
            float r0 = (float) r0
            r11 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r11
            float r12 = r8 - r0
            o.FieldPacker r0 = r6.write
            o.rsnScriptInvokeV[] r13 = r0.IconCompatParcelizer
            o.FieldPacker r0 = r6.write
            float r0 = r0.MediaMetadataCompat
            float r14 = p040o.subShort3.read((float) r0)
            o.FieldPacker r0 = r6.write
            float r0 = r0.setContentView
            float r15 = p040o.subShort3.read((float) r0)
            o.FieldPacker r0 = r6.write
            o.FieldPacker$write r0 = r0.Keep
            o.FieldPacker r1 = r6.write
            o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r5 = r1.MediaBrowserCompat$SearchResultReceiver
            o.FieldPacker r1 = r6.write
            o.FieldPacker$read r1 = r1.AppCompatDialogFragment
            o.FieldPacker r2 = r6.write
            o.FieldPacker$IconCompatParcelizer r4 = r2.read
            o.FieldPacker r2 = r6.write
            float r2 = r2.MediaBrowserCompat$MediaItem
            float r16 = p040o.subShort3.read((float) r2)
            o.FieldPacker r2 = r6.write
            float r2 = r2.AlertController$RecycleListView
            float r3 = p040o.subShort3.read((float) r2)
            o.FieldPacker r2 = r6.write
            float r2 = r2.write()
            o.FieldPacker r9 = r6.write
            float r9 = r9.read()
            int[] r18 = p040o.subLong3.C15905.MediaBrowserCompat$CustomActionResultReceiver
            int r19 = r5.ordinal()
            r11 = r18[r19]
            r18 = r3
            r3 = 2
            r21 = r15
            r15 = 1
            if (r11 == r15) goto L_0x011e
            if (r11 == r3) goto L_0x00fe
            r3 = 3
            if (r11 == r3) goto L_0x00a2
            r25 = r8
            r27 = r10
            r26 = r14
            r9 = 0
            goto L_0x0139
        L_0x00a2:
            o.FieldPacker$write r3 = p040o.FieldPacker.write.VERTICAL
            if (r0 != r3) goto L_0x00ae
            o.rsnScriptInvokeV$IconCompatParcelizer r3 = r6.ParcelableVolumeInfo
            float r3 = r3.IconCompatParcelizer
            r11 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r11
            goto L_0x00c0
        L_0x00ae:
            r11 = 1073741824(0x40000000, float:2.0)
            o.rsnScriptInvokeV$IconCompatParcelizer r3 = r6.ParcelableVolumeInfo
            android.graphics.RectF r3 = r3.MediaBrowserCompat$ItemReceiver
            float r3 = r3.left
            o.rsnScriptInvokeV$IconCompatParcelizer r15 = r6.ParcelableVolumeInfo
            android.graphics.RectF r15 = r15.MediaBrowserCompat$ItemReceiver
            float r15 = r15.width()
            float r15 = r15 / r11
            float r3 = r3 + r15
        L_0x00c0:
            o.FieldPacker$IconCompatParcelizer r11 = p040o.FieldPacker.IconCompatParcelizer.LEFT_TO_RIGHT
            if (r4 != r11) goto L_0x00c6
            r11 = r9
            goto L_0x00c7
        L_0x00c6:
            float r11 = -r9
        L_0x00c7:
            float r3 = r3 + r11
            o.FieldPacker$write r11 = p040o.FieldPacker.write.VERTICAL
            if (r0 != r11) goto L_0x00f7
            r15 = r10
            double r10 = (double) r3
            o.FieldPacker$IconCompatParcelizer r3 = p040o.FieldPacker.IconCompatParcelizer.LEFT_TO_RIGHT
            r23 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r4 != r3) goto L_0x00e5
            o.FieldPacker r3 = r6.write
            float r3 = r3.setHasDecor
            float r3 = -r3
            r25 = r8
            double r7 = (double) r3
            double r7 = r7 / r23
            r26 = r14
            r27 = r15
            double r14 = (double) r9
            double r7 = r7 + r14
            goto L_0x00f4
        L_0x00e5:
            r25 = r8
            r26 = r14
            r27 = r15
            o.FieldPacker r3 = r6.write
            float r3 = r3.setHasDecor
            double r7 = (double) r3
            double r7 = r7 / r23
            double r14 = (double) r9
            double r7 = r7 - r14
        L_0x00f4:
            double r10 = r10 + r7
            float r3 = (float) r10
            goto L_0x0138
        L_0x00f7:
            r25 = r8
            r27 = r10
            r26 = r14
            goto L_0x0138
        L_0x00fe:
            r25 = r8
            r27 = r10
            r26 = r14
            o.FieldPacker$write r3 = p040o.FieldPacker.write.VERTICAL
            if (r0 != r3) goto L_0x010d
            o.rsnScriptInvokeV$IconCompatParcelizer r3 = r6.ParcelableVolumeInfo
            float r3 = r3.IconCompatParcelizer
            goto L_0x0113
        L_0x010d:
            o.rsnScriptInvokeV$IconCompatParcelizer r3 = r6.ParcelableVolumeInfo
            android.graphics.RectF r3 = r3.MediaBrowserCompat$ItemReceiver
            float r3 = r3.right
        L_0x0113:
            float r3 = r3 - r9
            o.FieldPacker$IconCompatParcelizer r7 = p040o.FieldPacker.IconCompatParcelizer.LEFT_TO_RIGHT
            if (r4 != r7) goto L_0x0138
            o.FieldPacker r7 = r6.write
            float r7 = r7.setHasDecor
            float r3 = r3 - r7
            goto L_0x0138
        L_0x011e:
            r25 = r8
            r27 = r10
            r26 = r14
            o.FieldPacker$write r3 = p040o.FieldPacker.write.VERTICAL
            if (r0 == r3) goto L_0x012f
            o.rsnScriptInvokeV$IconCompatParcelizer r3 = r6.ParcelableVolumeInfo
            android.graphics.RectF r3 = r3.MediaBrowserCompat$ItemReceiver
            float r3 = r3.left
            float r9 = r9 + r3
        L_0x012f:
            o.FieldPacker$IconCompatParcelizer r3 = p040o.FieldPacker.IconCompatParcelizer.RIGHT_TO_LEFT
            if (r4 != r3) goto L_0x0139
            o.FieldPacker r3 = r6.write
            float r3 = r3.setHasDecor
            float r3 = r3 + r9
        L_0x0138:
            r9 = r3
        L_0x0139:
            int[] r3 = p040o.subLong3.C15905.write
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            if (r0 == r3) goto L_0x0249
            r8 = 2
            if (r0 != r8) goto L_0x03a0
            int[] r0 = p040o.subLong3.C15905.IconCompatParcelizer
            int r1 = r1.ordinal()
            r0 = r0[r1]
            if (r0 == r3) goto L_0x0183
            if (r0 == r8) goto L_0x016d
            r1 = 3
            if (r0 == r1) goto L_0x0158
            r0 = 0
            goto L_0x0190
        L_0x0158:
            o.rsnScriptInvokeV$IconCompatParcelizer r0 = r6.ParcelableVolumeInfo
            float r0 = r0.write
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            o.FieldPacker r2 = r6.write
            float r2 = r2.PlaybackStateCompat
            float r2 = r2 / r1
            o.FieldPacker r1 = r6.write
            float r0 = r0 - r2
            float r1 = r1.write()
            float r0 = r0 + r1
            goto L_0x0190
        L_0x016d:
            o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r0 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.CENTER
            if (r5 != r0) goto L_0x0176
            o.rsnScriptInvokeV$IconCompatParcelizer r0 = r6.ParcelableVolumeInfo
            float r0 = r0.write
            goto L_0x017c
        L_0x0176:
            o.rsnScriptInvokeV$IconCompatParcelizer r0 = r6.ParcelableVolumeInfo
            android.graphics.RectF r0 = r0.MediaBrowserCompat$ItemReceiver
            float r0 = r0.bottom
        L_0x017c:
            o.FieldPacker r1 = r6.write
            float r1 = r1.PlaybackStateCompat
            float r1 = r1 + r2
            float r0 = r0 - r1
            goto L_0x0190
        L_0x0183:
            o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r0 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.CENTER
            if (r5 != r0) goto L_0x0189
            r0 = 0
            goto L_0x018f
        L_0x0189:
            o.rsnScriptInvokeV$IconCompatParcelizer r0 = r6.ParcelableVolumeInfo
            android.graphics.RectF r0 = r0.MediaBrowserCompat$ItemReceiver
            float r0 = r0.top
        L_0x018f:
            float r0 = r0 + r2
        L_0x0190:
            r8 = r0
            r10 = 0
            r11 = 0
            r14 = 0
        L_0x0194:
            int r0 = r13.length
            if (r11 >= r0) goto L_0x03a0
            r15 = r13[r11]
            o.FieldPacker$MediaBrowserCompat$ItemReceiver r0 = r15.MediaBrowserCompat$ItemReceiver
            o.FieldPacker$MediaBrowserCompat$ItemReceiver r1 = p040o.FieldPacker$MediaBrowserCompat$ItemReceiver.NONE
            if (r0 == r1) goto L_0x01a2
            r19 = 1
            goto L_0x01a4
        L_0x01a2:
            r19 = 0
        L_0x01a4:
            float r0 = r15.write
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x01af
            r20 = r16
            goto L_0x01b7
        L_0x01af:
            float r0 = r15.write
            float r0 = p040o.subShort3.read((float) r0)
            r20 = r0
        L_0x01b7:
            if (r19 == 0) goto L_0x01e0
            o.FieldPacker$IconCompatParcelizer r0 = p040o.FieldPacker.IconCompatParcelizer.LEFT_TO_RIGHT
            if (r4 != r0) goto L_0x01c0
            float r0 = r9 + r14
            goto L_0x01c4
        L_0x01c0:
            float r0 = r20 - r14
            float r0 = r9 - r0
        L_0x01c4:
            r21 = r0
            float r3 = r8 + r12
            o.FieldPacker r5 = r6.write
            r0 = r34
            r1 = r35
            r2 = r21
            r7 = r18
            r18 = r12
            r12 = r4
            r4 = r15
            r0.MediaBrowserCompat$ItemReceiver(r1, r2, r3, r4, r5)
            o.FieldPacker$IconCompatParcelizer r0 = p040o.FieldPacker.IconCompatParcelizer.LEFT_TO_RIGHT
            if (r12 != r0) goto L_0x01e7
            float r21 = r21 + r20
            goto L_0x01e7
        L_0x01e0:
            r7 = r18
            r18 = r12
            r12 = r4
            r21 = r9
        L_0x01e7:
            java.lang.String r0 = r15.RatingCompat
            if (r0 == 0) goto L_0x0235
            if (r19 == 0) goto L_0x01fd
            if (r10 != 0) goto L_0x01fd
            o.FieldPacker$IconCompatParcelizer r0 = p040o.FieldPacker.IconCompatParcelizer.LEFT_TO_RIGHT
            if (r12 != r0) goto L_0x01f7
            r0 = r26
            r4 = r0
            goto L_0x01fa
        L_0x01f7:
            r4 = r26
            float r0 = -r4
        L_0x01fa:
            float r21 = r21 + r0
            goto L_0x0203
        L_0x01fd:
            r4 = r26
            if (r10 == 0) goto L_0x0203
            r21 = r9
        L_0x0203:
            o.FieldPacker$IconCompatParcelizer r0 = p040o.FieldPacker.IconCompatParcelizer.RIGHT_TO_LEFT
            if (r12 != r0) goto L_0x0212
            android.graphics.Paint r0 = r6.MediaBrowserCompat$ItemReceiver
            java.lang.String r1 = r15.RatingCompat
            int r0 = p040o.subShort3.read(r0, r1)
            float r0 = (float) r0
            float r21 = r21 - r0
        L_0x0212:
            r0 = r21
            if (r10 != 0) goto L_0x0222
            float r1 = r8 + r25
            java.lang.String r2 = r15.RatingCompat
            android.graphics.Paint r3 = r6.MediaBrowserCompat$ItemReceiver
            r5 = r35
            r5.drawText(r2, r0, r1, r3)
            goto L_0x0230
        L_0x0222:
            r5 = r35
            float r1 = r25 + r27
            float r8 = r8 + r1
            float r1 = r8 + r25
            java.lang.String r2 = r15.RatingCompat
            android.graphics.Paint r3 = r6.MediaBrowserCompat$ItemReceiver
            r5.drawText(r2, r0, r1, r3)
        L_0x0230:
            float r0 = r25 + r27
            float r8 = r8 + r0
            r14 = 0
            goto L_0x023e
        L_0x0235:
            r5 = r35
            r4 = r26
            float r20 = r20 + r7
            float r14 = r14 + r20
            r10 = 1
        L_0x023e:
            int r11 = r11 + 1
            r26 = r4
            r4 = r12
            r12 = r18
            r18 = r7
            goto L_0x0194
        L_0x0249:
            r8 = r35
            r7 = r18
            r18 = r12
            r12 = r4
            r4 = r26
            o.FieldPacker r0 = r6.write
            java.util.List<o.Float2> r10 = r0.MediaBrowserCompat$ItemReceiver
            o.FieldPacker r0 = r6.write
            java.util.List<o.Float2> r11 = r0.MediaBrowserCompat$CustomActionResultReceiver
            o.FieldPacker r0 = r6.write
            java.util.List<java.lang.Boolean> r14 = r0.write
            int[] r0 = p040o.subLong3.C15905.IconCompatParcelizer
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r15 = 1
            if (r0 == r15) goto L_0x028a
            r1 = 2
            if (r0 == r1) goto L_0x027f
            r1 = 3
            if (r0 == r1) goto L_0x0271
            r0 = 0
            goto L_0x028b
        L_0x0271:
            o.rsnScriptInvokeV$IconCompatParcelizer r0 = r6.ParcelableVolumeInfo
            float r0 = r0.write
            o.FieldPacker r1 = r6.write
            float r1 = r1.PlaybackStateCompat
            float r0 = r0 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r0 = r0 + r2
            goto L_0x028b
        L_0x027f:
            o.rsnScriptInvokeV$IconCompatParcelizer r0 = r6.ParcelableVolumeInfo
            float r0 = r0.write
            float r0 = r0 - r2
            o.FieldPacker r1 = r6.write
            float r1 = r1.PlaybackStateCompat
            float r0 = r0 - r1
            goto L_0x028b
        L_0x028a:
            r0 = r2
        L_0x028b:
            int r3 = r13.length
            r1 = r9
            r2 = 0
            r15 = 0
        L_0x028f:
            if (r2 >= r3) goto L_0x03a0
            r17 = r7
            r7 = r13[r2]
            r19 = r1
            o.FieldPacker$MediaBrowserCompat$ItemReceiver r1 = r7.MediaBrowserCompat$ItemReceiver
            r22 = r3
            o.FieldPacker$MediaBrowserCompat$ItemReceiver r3 = p040o.FieldPacker$MediaBrowserCompat$ItemReceiver.NONE
            if (r1 == r3) goto L_0x02a2
            r24 = 1
            goto L_0x02a4
        L_0x02a2:
            r24 = 0
        L_0x02a4:
            float r1 = r7.write
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L_0x02af
            r26 = r16
            goto L_0x02b7
        L_0x02af:
            float r1 = r7.write
            float r1 = p040o.subShort3.read((float) r1)
            r26 = r1
        L_0x02b7:
            int r1 = r14.size()
            if (r2 >= r1) goto L_0x02d0
            java.lang.Object r1 = r14.get(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02d0
            float r1 = r25 + r27
            float r0 = r0 + r1
            r19 = r0
            r1 = r9
            goto L_0x02d4
        L_0x02d0:
            r1 = r19
            r19 = r0
        L_0x02d4:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0300
            o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r0 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.CENTER
            if (r5 != r0) goto L_0x0300
            int r0 = r10.size()
            if (r15 >= r0) goto L_0x0300
            o.FieldPacker$IconCompatParcelizer r0 = p040o.FieldPacker.IconCompatParcelizer.RIGHT_TO_LEFT
            if (r12 != r0) goto L_0x02ef
            java.lang.Object r0 = r10.get(r15)
            o.Float2 r0 = (p040o.Float2) r0
            float r0 = r0.write
            goto L_0x02f8
        L_0x02ef:
            java.lang.Object r0 = r10.get(r15)
            o.Float2 r0 = (p040o.Float2) r0
            float r0 = r0.write
            float r0 = -r0
        L_0x02f8:
            r20 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r20
            float r1 = r1 + r0
            int r15 = r15 + 1
            goto L_0x0302
        L_0x0300:
            r20 = 1073741824(0x40000000, float:2.0)
        L_0x0302:
            java.lang.String r0 = r7.RatingCompat
            if (r0 != 0) goto L_0x0309
            r28 = 1
            goto L_0x030b
        L_0x0309:
            r28 = 0
        L_0x030b:
            if (r24 == 0) goto L_0x0339
            o.FieldPacker$IconCompatParcelizer r0 = p040o.FieldPacker.IconCompatParcelizer.RIGHT_TO_LEFT
            if (r12 != r0) goto L_0x0313
            float r1 = r1 - r26
        L_0x0313:
            r29 = r1
            float r3 = r19 + r18
            o.FieldPacker r1 = r6.write
            r0 = r34
            r30 = r1
            r1 = r35
            r31 = r9
            r9 = r2
            r2 = r29
            r32 = r10
            r10 = r4
            r4 = r7
            r33 = r5
            r5 = r30
            r0.MediaBrowserCompat$ItemReceiver(r1, r2, r3, r4, r5)
            o.FieldPacker$IconCompatParcelizer r0 = p040o.FieldPacker.IconCompatParcelizer.LEFT_TO_RIGHT
            if (r12 != r0) goto L_0x0336
            float r1 = r29 + r26
            goto L_0x0341
        L_0x0336:
            r1 = r29
            goto L_0x0341
        L_0x0339:
            r33 = r5
            r31 = r9
            r32 = r10
            r9 = r2
            r10 = r4
        L_0x0341:
            if (r28 != 0) goto L_0x037f
            if (r24 == 0) goto L_0x034d
            o.FieldPacker$IconCompatParcelizer r0 = p040o.FieldPacker.IconCompatParcelizer.RIGHT_TO_LEFT
            if (r12 != r0) goto L_0x034b
            float r4 = -r10
            goto L_0x034c
        L_0x034b:
            r4 = r10
        L_0x034c:
            float r1 = r1 + r4
        L_0x034d:
            o.FieldPacker$IconCompatParcelizer r0 = p040o.FieldPacker.IconCompatParcelizer.RIGHT_TO_LEFT
            if (r12 != r0) goto L_0x035a
            java.lang.Object r0 = r11.get(r9)
            o.Float2 r0 = (p040o.Float2) r0
            float r0 = r0.write
            float r1 = r1 - r0
        L_0x035a:
            float r0 = r19 + r25
            java.lang.String r2 = r7.RatingCompat
            android.graphics.Paint r3 = r6.MediaBrowserCompat$ItemReceiver
            r8.drawText(r2, r1, r0, r3)
            o.FieldPacker$IconCompatParcelizer r0 = p040o.FieldPacker.IconCompatParcelizer.LEFT_TO_RIGHT
            if (r12 != r0) goto L_0x0370
            java.lang.Object r0 = r11.get(r9)
            o.Float2 r0 = (p040o.Float2) r0
            float r0 = r0.write
            float r1 = r1 + r0
        L_0x0370:
            o.FieldPacker$IconCompatParcelizer r0 = p040o.FieldPacker.IconCompatParcelizer.RIGHT_TO_LEFT
            if (r12 != r0) goto L_0x0378
            r0 = r21
            float r2 = -r0
            goto L_0x037b
        L_0x0378:
            r0 = r21
            r2 = r0
        L_0x037b:
            float r1 = r1 + r2
            r2 = r17
            goto L_0x038d
        L_0x037f:
            r0 = r21
            o.FieldPacker$IconCompatParcelizer r2 = p040o.FieldPacker.IconCompatParcelizer.RIGHT_TO_LEFT
            if (r12 != r2) goto L_0x0389
            r2 = r17
            float r3 = -r2
            goto L_0x038c
        L_0x0389:
            r2 = r17
            r3 = r2
        L_0x038c:
            float r1 = r1 + r3
        L_0x038d:
            int r3 = r9 + 1
            r21 = r0
            r7 = r2
            r2 = r3
            r4 = r10
            r0 = r19
            r3 = r22
            r9 = r31
            r10 = r32
            r5 = r33
            goto L_0x028f
        L_0x03a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.subLong3.read(android.graphics.Canvas):void");
    }

    private void MediaBrowserCompat$ItemReceiver(Canvas canvas, float f, float f2, rsnScriptInvokeV rsnscriptinvokev, FieldPacker fieldPacker) {
        float f3;
        float f4;
        DashPathEffect dashPathEffect;
        if (rsnscriptinvokev.MediaBrowserCompat$CustomActionResultReceiver != 1122868 && rsnscriptinvokev.MediaBrowserCompat$CustomActionResultReceiver != 1122867 && rsnscriptinvokev.MediaBrowserCompat$CustomActionResultReceiver != 0) {
            int save = canvas.save();
            FieldPacker$MediaBrowserCompat$ItemReceiver fieldPacker$MediaBrowserCompat$ItemReceiver = rsnscriptinvokev.MediaBrowserCompat$ItemReceiver;
            if (fieldPacker$MediaBrowserCompat$ItemReceiver == FieldPacker$MediaBrowserCompat$ItemReceiver.DEFAULT) {
                fieldPacker$MediaBrowserCompat$ItemReceiver = fieldPacker.PlaybackStateCompat$CustomAction;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.setColor(rsnscriptinvokev.MediaBrowserCompat$CustomActionResultReceiver);
            if (Float.isNaN(rsnscriptinvokev.write)) {
                f3 = fieldPacker.MediaBrowserCompat$MediaItem;
            } else {
                f3 = rsnscriptinvokev.write;
            }
            float read2 = subShort3.read(f3);
            float f5 = read2 / 2.0f;
            int i = C15905.MediaBrowserCompat$ItemReceiver[fieldPacker$MediaBrowserCompat$ItemReceiver.ordinal()];
            if (i == 3 || i == 4) {
                this.MediaBrowserCompat$CustomActionResultReceiver.setStyle(Paint.Style.FILL);
                canvas.drawCircle(f + f5, f2, f5, this.MediaBrowserCompat$CustomActionResultReceiver);
            } else if (i == 5) {
                this.MediaBrowserCompat$CustomActionResultReceiver.setStyle(Paint.Style.FILL);
                canvas.drawRect(f, f2 - f5, f + read2, f2 + f5, this.MediaBrowserCompat$CustomActionResultReceiver);
            } else if (i == 6) {
                if (Float.isNaN(rsnscriptinvokev.IconCompatParcelizer)) {
                    f4 = fieldPacker.MediaDescriptionCompat;
                } else {
                    f4 = rsnscriptinvokev.IconCompatParcelizer;
                }
                float read3 = subShort3.read(f4);
                if (rsnscriptinvokev.read == null) {
                    dashPathEffect = null;
                } else {
                    dashPathEffect = rsnscriptinvokev.read;
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.setStyle(Paint.Style.STROKE);
                this.MediaBrowserCompat$CustomActionResultReceiver.setStrokeWidth(read3);
                this.MediaBrowserCompat$CustomActionResultReceiver.setPathEffect(dashPathEffect);
                this.MediaDescriptionCompat.reset();
                this.MediaDescriptionCompat.moveTo(f, f2);
                this.MediaDescriptionCompat.lineTo(f + read2, f2);
                canvas.drawPath(this.MediaDescriptionCompat, this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: o.subLong3$5 */
    static /* synthetic */ class C15905 {
        static final /* synthetic */ int[] IconCompatParcelizer;
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|(2:21|22)|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|31|33|34|35|36|37|38|40) */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a4 */
        static {
            /*
                o.FieldPacker$MediaBrowserCompat$ItemReceiver[] r0 = p040o.FieldPacker$MediaBrowserCompat$ItemReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                r1 = 1
                o.FieldPacker$MediaBrowserCompat$ItemReceiver r2 = p040o.FieldPacker$MediaBrowserCompat$ItemReceiver.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.FieldPacker$MediaBrowserCompat$ItemReceiver r3 = p040o.FieldPacker$MediaBrowserCompat$ItemReceiver.EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.FieldPacker$MediaBrowserCompat$ItemReceiver r4 = p040o.FieldPacker$MediaBrowserCompat$ItemReceiver.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.FieldPacker$MediaBrowserCompat$ItemReceiver r4 = p040o.FieldPacker$MediaBrowserCompat$ItemReceiver.CIRCLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.FieldPacker$MediaBrowserCompat$ItemReceiver r4 = p040o.FieldPacker$MediaBrowserCompat$ItemReceiver.SQUARE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.FieldPacker$MediaBrowserCompat$ItemReceiver r4 = p040o.FieldPacker$MediaBrowserCompat$ItemReceiver.LINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                o.FieldPacker$write[] r3 = p040o.FieldPacker.write.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                write = r3
                o.FieldPacker$write r4 = p040o.FieldPacker.write.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x005a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r3 = write     // Catch:{ NoSuchFieldError -> 0x0064 }
                o.FieldPacker$write r4 = p040o.FieldPacker.write.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                o.FieldPacker$read[] r3 = p040o.FieldPacker.read.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                IconCompatParcelizer = r3
                o.FieldPacker$read r4 = p040o.FieldPacker.read.TOP     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                int[] r3 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x007f }
                o.FieldPacker$read r4 = p040o.FieldPacker.read.BOTTOM     // Catch:{ NoSuchFieldError -> 0x007f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                int[] r3 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0089 }
                o.FieldPacker$read r4 = p040o.FieldPacker.read.CENTER     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver[] r3 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                MediaBrowserCompat$CustomActionResultReceiver = r3
                o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r4 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.LEFT     // Catch:{ NoSuchFieldError -> 0x009a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x009a }
            L_0x009a:
                int[] r1 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x00a4 }
                o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r3 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.RIGHT     // Catch:{ NoSuchFieldError -> 0x00a4 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a4 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00a4 }
            L_0x00a4:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x00ae }
                o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver r1 = p040o.FieldPacker$MediaBrowserCompat$CustomActionResultReceiver.CENTER     // Catch:{ NoSuchFieldError -> 0x00ae }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ae }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ae }
            L_0x00ae:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.subLong3.C15905.<clinit>():void");
        }
    }
}
