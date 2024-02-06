package p040o;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;
import p040o.PointDouble;

/* renamed from: o.rsnTypeCreate */
public final class rsnTypeCreate implements getIIdDeserializerKta {
    private static final rsnScriptForEach[] write = new rsnScriptForEach[0];
    private final PointDouble.read read = new PointDouble.read();

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver read(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver) throws NotFoundException, ChecksumException, FormatException {
        return IconCompatParcelizer(setfontassetdelegate_mediabrowsercompat_itemreceiver, (Map<rsnIncContextCreate, ?>) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0347, code lost:
        if ((java.lang.Math.abs(r1 - r2.read(r10, r7).IconCompatParcelizer) + java.lang.Math.abs(r6 - r2.read(r12, r7).IconCompatParcelizer)) <= (java.lang.Math.abs(r1 - r2.read(r10, r3).IconCompatParcelizer) + java.lang.Math.abs(r6 - r2.read(r12, r3).IconCompatParcelizer))) goto L_0x0349;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(p040o.setFontAssetDelegate$MediaBrowserCompat$ItemReceiver r25, java.util.Map<p040o.rsnIncContextCreate, ?> r26) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x00a9
            o.rsnIncContextCreate r5 = p040o.rsnIncContextCreate.PURE_BARCODE
            boolean r2 = r2.containsKey(r5)
            if (r2 == 0) goto L_0x00a9
            o.rsnScriptSetVarI r2 = r1.read
            if (r2 != 0) goto L_0x001e
            o.rsnElementCreate2 r2 = r1.MediaBrowserCompat$ItemReceiver
            o.rsnScriptSetVarI r2 = r2.read()
            r1.read = r2
        L_0x001e:
            o.rsnScriptSetVarI r1 = r1.read
            int[] r2 = r1.IconCompatParcelizer()
            int[] r5 = r1.write()
            if (r2 == 0) goto L_0x00a4
            if (r5 == 0) goto L_0x00a4
            int r6 = r1.IconCompatParcelizer
            r7 = r2[r3]
            r8 = r2[r4]
        L_0x0032:
            if (r7 >= r6) goto L_0x003d
            boolean r9 = r1.MediaBrowserCompat$ItemReceiver(r7, r8)
            if (r9 == 0) goto L_0x003d
            int r7 = r7 + 1
            goto L_0x0032
        L_0x003d:
            if (r7 == r6) goto L_0x009f
            r6 = r2[r3]
            int r7 = r7 - r6
            if (r7 == 0) goto L_0x009a
            r6 = r2[r4]
            r8 = r5[r4]
            r2 = r2[r3]
            r5 = r5[r3]
            int r5 = r5 - r2
            int r5 = r5 + r4
            int r5 = r5 / r7
            int r8 = r8 - r6
            int r8 = r8 + r4
            int r8 = r8 / r7
            if (r5 <= 0) goto L_0x0095
            if (r8 <= 0) goto L_0x0095
            int r9 = r7 / 2
            o.rsnScriptSetVarI r10 = new o.rsnScriptSetVarI
            r10.<init>(r5, r8)
            r11 = r3
        L_0x005e:
            if (r11 >= r8) goto L_0x008b
            r12 = r3
        L_0x0061:
            if (r12 >= r5) goto L_0x0088
            int r13 = r12 * r7
            int r14 = r2 + r9
            int r13 = r13 + r14
            int r14 = r11 * r7
            int r15 = r6 + r9
            int r14 = r14 + r15
            boolean r13 = r1.MediaBrowserCompat$ItemReceiver(r13, r14)
            if (r13 == 0) goto L_0x0085
            int r13 = r10.read
            int r13 = r13 * r11
            int r14 = r12 / 32
            int r13 = r13 + r14
            int[] r14 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r15 = r12 & 31
            int r15 = r4 << r15
            r16 = r14[r13]
            r15 = r15 | r16
            r14[r13] = r15
        L_0x0085:
            int r12 = r12 + 1
            goto L_0x0061
        L_0x0088:
            int r11 = r11 + 1
            goto L_0x005e
        L_0x008b:
            o.PointDouble$read r1 = r0.read
            o.getMaskAnimations$read r1 = r1.MediaBrowserCompat$ItemReceiver(r10)
            o.rsnScriptForEach[] r2 = write
            goto L_0x0395
        L_0x0095:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x009a:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x009f:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x00a4:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        L_0x00a9:
            o.setErrorHandler r2 = new o.setErrorHandler
            o.rsnScriptSetVarI r5 = r1.read
            if (r5 != 0) goto L_0x00b7
            o.rsnElementCreate2 r5 = r1.MediaBrowserCompat$ItemReceiver
            o.rsnScriptSetVarI r5 = r5.read()
            r1.read = r5
        L_0x00b7:
            o.rsnScriptSetVarI r1 = r1.read
            r2.<init>(r1)
            o.onActivityStarted$MediaBrowserCompat$CustomActionResultReceiver r1 = r2.write
            o.rsnScriptForEach[] r1 = r1.write()
            r5 = r1[r3]
            r6 = r1[r4]
            r7 = 2
            r8 = r1[r7]
            r9 = 3
            r1 = r1[r9]
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 4
            r10.<init>(r11)
            o.setErrorHandler$write r12 = r2.read(r5, r6)
            r10.add(r12)
            o.setErrorHandler$write r12 = r2.read(r5, r8)
            r10.add(r12)
            o.setErrorHandler$write r12 = r2.read(r6, r1)
            r10.add(r12)
            o.setErrorHandler$write r12 = r2.read(r8, r1)
            r10.add(r12)
            o.setErrorHandler$MediaBrowserCompat$CustomActionResultReceiver r12 = new o.setErrorHandler$MediaBrowserCompat$CustomActionResultReceiver
            r12.<init>(r3)
            java.util.Collections.sort(r10, r12)
            java.lang.Object r12 = r10.get(r3)
            o.setErrorHandler$write r12 = (p040o.setErrorHandler.write) r12
            java.lang.Object r10 = r10.get(r4)
            o.setErrorHandler$write r10 = (p040o.setErrorHandler.write) r10
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            o.rsnScriptForEach r14 = r12.MediaBrowserCompat$CustomActionResultReceiver
            p040o.setErrorHandler.MediaBrowserCompat$ItemReceiver(r13, r14)
            o.rsnScriptForEach r12 = r12.read
            p040o.setErrorHandler.MediaBrowserCompat$ItemReceiver(r13, r12)
            o.rsnScriptForEach r12 = r10.MediaBrowserCompat$CustomActionResultReceiver
            p040o.setErrorHandler.MediaBrowserCompat$ItemReceiver(r13, r12)
            o.rsnScriptForEach r10 = r10.read
            p040o.setErrorHandler.MediaBrowserCompat$ItemReceiver(r13, r10)
            java.util.Set r10 = r13.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0127:
            boolean r17 = r10.hasNext()
            if (r17 == 0) goto L_0x0150
            java.lang.Object r17 = r10.next()
            java.util.Map$Entry r17 = (java.util.Map.Entry) r17
            java.lang.Object r18 = r17.getKey()
            o.rsnScriptForEach r18 = (p040o.rsnScriptForEach) r18
            java.lang.Object r17 = r17.getValue()
            java.lang.Integer r17 = (java.lang.Integer) r17
            int r12 = r17.intValue()
            if (r12 != r7) goto L_0x0148
            r15 = r18
            goto L_0x0127
        L_0x0148:
            if (r14 != 0) goto L_0x014d
            r14 = r18
            goto L_0x0127
        L_0x014d:
            r16 = r18
            goto L_0x0127
        L_0x0150:
            if (r14 == 0) goto L_0x03b3
            if (r15 == 0) goto L_0x03b3
            if (r16 == 0) goto L_0x03b3
            o.rsnScriptForEach[] r10 = new p040o.rsnScriptForEach[r9]
            r10[r3] = r14
            r10[r4] = r15
            r10[r7] = r16
            p040o.rsnScriptForEach.IconCompatParcelizer(r10)
            r12 = r10[r3]
            r14 = r10[r4]
            r10 = r10[r7]
            boolean r15 = r13.containsKey(r5)
            if (r15 != 0) goto L_0x016e
            goto L_0x017f
        L_0x016e:
            boolean r5 = r13.containsKey(r6)
            if (r5 != 0) goto L_0x0176
            r5 = r6
            goto L_0x017f
        L_0x0176:
            boolean r5 = r13.containsKey(r8)
            if (r5 != 0) goto L_0x017e
            r5 = r8
            goto L_0x017f
        L_0x017e:
            r5 = r1
        L_0x017f:
            o.setErrorHandler$write r1 = r2.read(r10, r5)
            int r1 = r1.IconCompatParcelizer
            o.setErrorHandler$write r6 = r2.read(r12, r5)
            int r6 = r6.IconCompatParcelizer
            r8 = r1 & 1
            if (r8 != r4) goto L_0x0191
            int r1 = r1 + 1
        L_0x0191:
            int r1 = r1 + r7
            r8 = r6 & 1
            if (r8 != r4) goto L_0x0198
            int r6 = r6 + 1
        L_0x0198:
            int r6 = r6 + r7
            int r8 = r1 << 2
            int r13 = r6 * 7
            r16 = 1056964608(0x3f000000, float:0.5)
            r17 = 0
            if (r8 >= r13) goto L_0x028c
            int r8 = r6 << 2
            int r13 = r1 * 7
            if (r8 >= r13) goto L_0x028c
            int r1 = java.lang.Math.min(r6, r1)
            float r6 = p040o.rsnScriptForEach.IconCompatParcelizer(r14, r12)
            int r8 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r8 >= 0) goto L_0x01b8
            r8 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L_0x01ba
        L_0x01b8:
            r8 = r16
        L_0x01ba:
            float r6 = r6 + r8
            int r6 = (int) r6
            float r6 = (float) r6
            float r1 = (float) r1
            float r6 = r6 / r1
            float r8 = p040o.rsnScriptForEach.IconCompatParcelizer(r10, r5)
            int r13 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x01ca
            r13 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L_0x01cc
        L_0x01ca:
            r13 = r16
        L_0x01cc:
            float r8 = r8 + r13
            int r8 = (int) r8
            float r13 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r15 = r10.MediaBrowserCompat$CustomActionResultReceiver
            float r8 = (float) r8
            float r13 = r13 - r15
            float r13 = r13 / r8
            float r15 = r5.read
            float r9 = r10.read
            float r15 = r15 - r9
            float r15 = r15 / r8
            o.rsnScriptForEach r8 = new o.rsnScriptForEach
            float r9 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r13 = r13 * r6
            float r9 = r9 + r13
            float r13 = r5.read
            float r6 = r6 * r15
            float r13 = r13 + r6
            r8.<init>(r9, r13)
            float r6 = p040o.rsnScriptForEach.IconCompatParcelizer(r14, r10)
            int r9 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x01f3
            r9 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L_0x01f5
        L_0x01f3:
            r9 = r16
        L_0x01f5:
            float r6 = r6 + r9
            int r6 = (int) r6
            float r6 = (float) r6
            float r6 = r6 / r1
            float r1 = p040o.rsnScriptForEach.IconCompatParcelizer(r12, r5)
            int r9 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x0204
            r15 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L_0x0206
        L_0x0204:
            r15 = r16
        L_0x0206:
            float r1 = r1 + r15
            int r1 = (int) r1
            float r9 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r13 = r12.MediaBrowserCompat$CustomActionResultReceiver
            float r1 = (float) r1
            float r9 = r9 - r13
            float r9 = r9 / r1
            float r13 = r5.read
            float r15 = r12.read
            float r13 = r13 - r15
            float r13 = r13 / r1
            o.rsnScriptForEach r1 = new o.rsnScriptForEach
            float r15 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r9 = r9 * r6
            float r15 = r15 + r9
            float r9 = r5.read
            float r6 = r6 * r13
            float r9 = r9 + r6
            r1.<init>(r15, r9)
            boolean r6 = r2.MediaBrowserCompat$CustomActionResultReceiver(r8)
            if (r6 != 0) goto L_0x0230
            boolean r6 = r2.MediaBrowserCompat$CustomActionResultReceiver(r1)
            if (r6 != 0) goto L_0x025c
            r1 = 0
            goto L_0x025c
        L_0x0230:
            boolean r6 = r2.MediaBrowserCompat$CustomActionResultReceiver(r1)
            if (r6 != 0) goto L_0x0237
            goto L_0x025b
        L_0x0237:
            o.setErrorHandler$write r6 = r2.read(r10, r8)
            int r6 = r6.IconCompatParcelizer
            o.setErrorHandler$write r9 = r2.read(r12, r8)
            int r9 = r9.IconCompatParcelizer
            int r6 = r6 - r9
            int r6 = java.lang.Math.abs(r6)
            o.setErrorHandler$write r9 = r2.read(r10, r1)
            int r9 = r9.IconCompatParcelizer
            o.setErrorHandler$write r13 = r2.read(r12, r1)
            int r13 = r13.IconCompatParcelizer
            int r9 = r9 - r13
            int r9 = java.lang.Math.abs(r9)
            if (r6 > r9) goto L_0x025c
        L_0x025b:
            r1 = r8
        L_0x025c:
            if (r1 == 0) goto L_0x025f
            r5 = r1
        L_0x025f:
            o.setErrorHandler$write r1 = r2.read(r10, r5)
            int r1 = r1.IconCompatParcelizer
            o.setErrorHandler$write r6 = r2.read(r12, r5)
            int r6 = r6.IconCompatParcelizer
            int r1 = java.lang.Math.max(r1, r6)
            int r1 = r1 + r4
            r6 = r1 & 1
            if (r6 != r4) goto L_0x0276
            int r1 = r1 + 1
        L_0x0276:
            r23 = r1
            o.rsnScriptSetVarI r1 = r2.MediaBrowserCompat$ItemReceiver
            r17 = r1
            r18 = r10
            r19 = r14
            r20 = r12
            r21 = r5
            r22 = r23
            o.rsnScriptSetVarI r1 = p040o.setErrorHandler.MediaBrowserCompat$ItemReceiver(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0379
        L_0x028c:
            float r8 = p040o.rsnScriptForEach.IconCompatParcelizer(r14, r12)
            int r9 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x0297
            r9 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L_0x0299
        L_0x0297:
            r9 = r16
        L_0x0299:
            float r8 = r8 + r9
            int r8 = (int) r8
            float r8 = (float) r8
            float r9 = (float) r1
            float r8 = r8 / r9
            float r9 = p040o.rsnScriptForEach.IconCompatParcelizer(r10, r5)
            int r13 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x02a9
            r13 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L_0x02ab
        L_0x02a9:
            r13 = r16
        L_0x02ab:
            float r9 = r9 + r13
            int r9 = (int) r9
            float r13 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r15 = r10.MediaBrowserCompat$CustomActionResultReceiver
            float r9 = (float) r9
            float r13 = r13 - r15
            float r13 = r13 / r9
            float r15 = r5.read
            float r7 = r10.read
            float r15 = r15 - r7
            float r15 = r15 / r9
            o.rsnScriptForEach r7 = new o.rsnScriptForEach
            float r9 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r13 = r13 * r8
            float r9 = r9 + r13
            float r13 = r5.read
            float r8 = r8 * r15
            float r13 = r13 + r8
            r7.<init>(r9, r13)
            float r8 = p040o.rsnScriptForEach.IconCompatParcelizer(r14, r10)
            int r9 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x02d2
            r9 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L_0x02d4
        L_0x02d2:
            r9 = r16
        L_0x02d4:
            float r8 = r8 + r9
            int r8 = (int) r8
            float r8 = (float) r8
            float r9 = (float) r6
            float r8 = r8 / r9
            float r9 = p040o.rsnScriptForEach.IconCompatParcelizer(r12, r5)
            int r13 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x02e4
            r15 = -1090519040(0xffffffffbf000000, float:-0.5)
            goto L_0x02e6
        L_0x02e4:
            r15 = r16
        L_0x02e6:
            float r9 = r9 + r15
            int r9 = (int) r9
            float r13 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r15 = r12.MediaBrowserCompat$CustomActionResultReceiver
            float r9 = (float) r9
            float r13 = r13 - r15
            float r13 = r13 / r9
            float r15 = r5.read
            float r3 = r12.read
            float r15 = r15 - r3
            float r15 = r15 / r9
            o.rsnScriptForEach r3 = new o.rsnScriptForEach
            float r9 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r13 = r13 * r8
            float r9 = r9 + r13
            float r13 = r5.read
            float r8 = r8 * r15
            float r13 = r13 + r8
            r3.<init>(r9, r13)
            boolean r8 = r2.MediaBrowserCompat$CustomActionResultReceiver(r7)
            if (r8 != 0) goto L_0x0310
            boolean r1 = r2.MediaBrowserCompat$CustomActionResultReceiver(r3)
            if (r1 != 0) goto L_0x034a
            r3 = 0
            goto L_0x034a
        L_0x0310:
            boolean r8 = r2.MediaBrowserCompat$CustomActionResultReceiver(r3)
            if (r8 != 0) goto L_0x0317
            goto L_0x0349
        L_0x0317:
            o.setErrorHandler$write r8 = r2.read(r10, r7)
            int r8 = r8.IconCompatParcelizer
            int r8 = r1 - r8
            int r8 = java.lang.Math.abs(r8)
            o.setErrorHandler$write r9 = r2.read(r12, r7)
            int r9 = r9.IconCompatParcelizer
            int r9 = r6 - r9
            int r9 = java.lang.Math.abs(r9)
            o.setErrorHandler$write r13 = r2.read(r10, r3)
            int r13 = r13.IconCompatParcelizer
            int r1 = r1 - r13
            int r1 = java.lang.Math.abs(r1)
            int r8 = r8 + r9
            o.setErrorHandler$write r9 = r2.read(r12, r3)
            int r9 = r9.IconCompatParcelizer
            int r6 = r6 - r9
            int r6 = java.lang.Math.abs(r6)
            int r1 = r1 + r6
            if (r8 > r1) goto L_0x034a
        L_0x0349:
            r3 = r7
        L_0x034a:
            if (r3 == 0) goto L_0x034d
            r5 = r3
        L_0x034d:
            o.setErrorHandler$write r1 = r2.read(r10, r5)
            int r1 = r1.IconCompatParcelizer
            o.setErrorHandler$write r3 = r2.read(r12, r5)
            int r3 = r3.IconCompatParcelizer
            r6 = r1 & 1
            if (r6 != r4) goto L_0x035f
            int r1 = r1 + 1
        L_0x035f:
            r22 = r1
            r1 = r3 & 1
            if (r1 != r4) goto L_0x0367
            int r3 = r3 + 1
        L_0x0367:
            r23 = r3
            o.rsnScriptSetVarI r1 = r2.MediaBrowserCompat$ItemReceiver
            r17 = r1
            r18 = r10
            r19 = r14
            r20 = r12
            r21 = r5
            o.rsnScriptSetVarI r1 = p040o.setErrorHandler.MediaBrowserCompat$ItemReceiver(r17, r18, r19, r20, r21, r22, r23)
        L_0x0379:
            o.rsnScriptForEach[] r2 = new p040o.rsnScriptForEach[r11]
            r3 = 0
            r2[r3] = r10
            r2[r4] = r14
            r3 = 2
            r2[r3] = r12
            r3 = 3
            r2[r3] = r5
            o.isScaleIdentity$MediaBrowserCompat$ItemReceiver r3 = new o.isScaleIdentity$MediaBrowserCompat$ItemReceiver
            r3.<init>(r1, r2)
            o.PointDouble$read r1 = r0.read
            o.rsnScriptSetVarI r2 = r3.MediaBrowserCompat$CustomActionResultReceiver
            o.getMaskAnimations$read r1 = r1.MediaBrowserCompat$ItemReceiver(r2)
            o.rsnScriptForEach[] r2 = r3.IconCompatParcelizer
        L_0x0395:
            o.getLayers$MediaBrowserCompat$CustomActionResultReceiver r3 = new o.getLayers$MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r1.RatingCompat
            byte[] r5 = r1.read
            o.rsnIncAllocationCreateTyped r6 = p040o.rsnIncAllocationCreateTyped.DATA_MATRIX
            r3.<init>(r4, r5, r2, r6)
            java.util.List<byte[]> r2 = r1.IconCompatParcelizer
            if (r2 == 0) goto L_0x03a9
            o.rsnInvokeClosureCreate r4 = p040o.rsnInvokeClosureCreate.BYTE_SEGMENTS
            r3.read(r4, r2)
        L_0x03a9:
            java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver
            if (r1 == 0) goto L_0x03b2
            o.rsnInvokeClosureCreate r2 = p040o.rsnInvokeClosureCreate.ERROR_CORRECTION_LEVEL
            r3.read(r2, r1)
        L_0x03b2:
            return r3
        L_0x03b3:
            com.google.zxing.NotFoundException r1 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.rsnTypeCreate.IconCompatParcelizer(o.setFontAssetDelegate$MediaBrowserCompat$ItemReceiver, java.util.Map):o.getLayers$MediaBrowserCompat$CustomActionResultReceiver");
    }
}
