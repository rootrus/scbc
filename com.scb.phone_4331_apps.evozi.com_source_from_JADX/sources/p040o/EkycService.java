package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import java.lang.reflect.Array;

/* renamed from: o.EkycService */
public interface EkycService {

    /* renamed from: o.EkycService$read */
    public static final class read implements getIIdDeserializerOnDevice {
        public static int IconCompatParcelizer(RecyclerView recyclerView, setStatusBarBackgroundColor setstatusbarbackgroundcolor) {
            onGetStartedClick.write((Object) recyclerView, "recyclerView");
            onGetStartedClick.write((Object) setstatusbarbackgroundcolor, "helper");
            RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver = recyclerView.AppCompatActivity;
            if (recyclerView$MediaBrowserCompat$SearchResultReceiver == null) {
                return -1;
            }
            onGetStartedClick.IconCompatParcelizer((Object) recyclerView$MediaBrowserCompat$SearchResultReceiver, "recyclerView.layoutManag… RecyclerView.NO_POSITION");
            View read = setstatusbarbackgroundcolor.read(recyclerView$MediaBrowserCompat$SearchResultReceiver);
            if (read == null) {
                return -1;
            }
            onGetStartedClick.IconCompatParcelizer((Object) read, "helper.findSnapView(layo… RecyclerView.NO_POSITION");
            return RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(read);
        }

        private static rsnScriptSetVarI read(byte[][] bArr, int i) {
            int i2 = i << 1;
            rsnScriptSetVarI rsnscriptsetvari = new rsnScriptSetVarI(bArr[0].length + i2, bArr.length + i2);
            int length = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver.length;
            for (int i3 = 0; i3 < length; i3++) {
                rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver[i3] = 0;
            }
            int i4 = (rsnscriptsetvari.write - i) - 1;
            int i5 = 0;
            while (i5 < bArr.length) {
                byte[] bArr2 = bArr[i5];
                for (int i6 = 0; i6 < bArr[0].length; i6++) {
                    if (bArr2[i6] == 1) {
                        int i7 = i6 + i;
                        int i8 = (rsnscriptsetvari.read * i4) + (i7 / 32);
                        int[] iArr = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver;
                        iArr[i8] = (1 << (i7 & 31)) | iArr[i8];
                    }
                }
                i5++;
                i4--;
            }
            return rsnscriptsetvari;
        }

        private static byte[][] MediaBrowserCompat$ItemReceiver(byte[][] bArr) {
            int length = bArr[0].length;
            int[] iArr = new int[2];
            iArr[1] = bArr.length;
            iArr[0] = length;
            byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
            for (int i = 0; i < bArr.length; i++) {
                int length2 = bArr.length;
                for (int i2 = 0; i2 < bArr[0].length; i2++) {
                    bArr2[i2][(length2 - i) - 1] = bArr[i][i2];
                }
            }
            return bArr2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01eb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.rsnScriptSetVarI write(java.lang.String r18, p040o.rsnIncAllocationCreateTyped r19, int r20, int r21, java.util.Map<p040o.rsnIncObjDestroy, ?> r22) throws com.google.zxing.WriterException {
            /*
                r17 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                r3 = r22
                o.rsnIncAllocationCreateTyped r4 = p040o.rsnIncAllocationCreateTyped.PDF_417
                if (r0 != r4) goto L_0x01f3
                o.ScriptC r0 = new o.ScriptC
                r0.<init>()
                r4 = 30
                r5 = 2
                if (r3 == 0) goto L_0x00b2
                o.rsnIncObjDestroy r6 = p040o.rsnIncObjDestroy.PDF417_COMPACT
                boolean r6 = r3.containsKey(r6)
                if (r6 == 0) goto L_0x0032
                o.rsnIncObjDestroy r6 = p040o.rsnIncObjDestroy.PDF417_COMPACT
                java.lang.Object r6 = r3.get(r6)
                java.lang.String r6 = r6.toString()
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                boolean r6 = r6.booleanValue()
                r0.MediaBrowserCompat$ItemReceiver = r6
            L_0x0032:
                o.rsnIncObjDestroy r6 = p040o.rsnIncObjDestroy.PDF417_COMPACTION
                boolean r6 = r3.containsKey(r6)
                if (r6 == 0) goto L_0x004a
                o.rsnIncObjDestroy r6 = p040o.rsnIncObjDestroy.PDF417_COMPACTION
                java.lang.Object r6 = r3.get(r6)
                java.lang.String r6 = r6.toString()
                o.getYStart r6 = p040o.getYStart.valueOf(r6)
                r0.read = r6
            L_0x004a:
                o.rsnIncObjDestroy r6 = p040o.rsnIncObjDestroy.PDF417_DIMENSIONS
                boolean r6 = r3.containsKey(r6)
                if (r6 == 0) goto L_0x006a
                o.rsnIncObjDestroy r6 = p040o.rsnIncObjDestroy.PDF417_DIMENSIONS
                java.lang.Object r6 = r3.get(r6)
                o.AlertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver r6 = (p040o.C1133x65c1ec57) r6
                int r7 = r6.MediaBrowserCompat$SearchResultReceiver
                int r8 = r6.MediaSessionCompat$Token
                int r9 = r6.f2531x50fd9e4a
                int r6 = r6.ParcelableVolumeInfo
                r0.write = r7
                r0.MediaBrowserCompat$SearchResultReceiver = r8
                r0.MediaMetadataCompat = r9
                r0.RatingCompat = r6
            L_0x006a:
                o.rsnIncObjDestroy r6 = p040o.rsnIncObjDestroy.MARGIN
                boolean r6 = r3.containsKey(r6)
                if (r6 == 0) goto L_0x0080
                o.rsnIncObjDestroy r4 = p040o.rsnIncObjDestroy.MARGIN
                java.lang.Object r4 = r3.get(r4)
                java.lang.String r4 = r4.toString()
                int r4 = java.lang.Integer.parseInt(r4)
            L_0x0080:
                o.rsnIncObjDestroy r6 = p040o.rsnIncObjDestroy.ERROR_CORRECTION
                boolean r6 = r3.containsKey(r6)
                if (r6 == 0) goto L_0x0097
                o.rsnIncObjDestroy r6 = p040o.rsnIncObjDestroy.ERROR_CORRECTION
                java.lang.Object r6 = r3.get(r6)
                java.lang.String r6 = r6.toString()
                int r6 = java.lang.Integer.parseInt(r6)
                goto L_0x0098
            L_0x0097:
                r6 = r5
            L_0x0098:
                o.rsnIncObjDestroy r7 = p040o.rsnIncObjDestroy.CHARACTER_SET
                boolean r7 = r3.containsKey(r7)
                if (r7 == 0) goto L_0x00b0
                o.rsnIncObjDestroy r7 = p040o.rsnIncObjDestroy.CHARACTER_SET
                java.lang.Object r3 = r3.get(r7)
                java.lang.String r3 = r3.toString()
                java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)
                r0.MediaBrowserCompat$CustomActionResultReceiver = r3
            L_0x00b0:
                r9 = r6
                goto L_0x00b3
            L_0x00b2:
                r9 = r5
            L_0x00b3:
                int r3 = p040o.setZ.MediaBrowserCompat$CustomActionResultReceiver(r9)
                o.getYStart r6 = r0.read
                java.nio.charset.Charset r7 = r0.MediaBrowserCompat$CustomActionResultReceiver
                r8 = r18
                java.lang.String r6 = p040o.internalStringCreate.read((java.lang.String) r8, (p040o.getYStart) r6, (java.nio.charset.Charset) r7)
                int r7 = r6.length()
                int r10 = r0.MediaBrowserCompat$SearchResultReceiver
                r11 = 0
                r12 = 0
            L_0x00c9:
                int r13 = r0.write
                r15 = 1
                if (r10 > r13) goto L_0x0117
                int r13 = r7 + 1
                int r13 = r13 + r3
                int r16 = r13 / r10
                int r16 = r16 + 1
                int r15 = r10 * r16
                int r13 = r13 + r10
                if (r15 < r13) goto L_0x00dc
                int r16 = r16 + -1
            L_0x00dc:
                r13 = r16
                int r15 = r0.RatingCompat
                if (r13 < r15) goto L_0x0117
                int r15 = r0.MediaMetadataCompat
                if (r13 > r15) goto L_0x0114
                int r15 = r10 * 17
                int r15 = r15 + 69
                float r15 = (float) r15
                r16 = 1052166324(0x3eb6c8b4, float:0.357)
                float r15 = r15 * r16
                float r14 = (float) r13
                r16 = 1073741824(0x40000000, float:2.0)
                float r14 = r14 * r16
                float r15 = r15 / r14
                if (r12 == 0) goto L_0x010a
                r14 = 1077936128(0x40400000, float:3.0)
                float r16 = r15 - r14
                float r16 = java.lang.Math.abs(r16)
                float r14 = r11 - r14
                float r14 = java.lang.Math.abs(r14)
                int r14 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r14 > 0) goto L_0x0114
            L_0x010a:
                int[] r11 = new int[r5]
                r12 = 0
                r11[r12] = r10
                r12 = 1
                r11[r12] = r13
                r12 = r11
                r11 = r15
            L_0x0114:
                int r10 = r10 + 1
                goto L_0x00c9
            L_0x0117:
                if (r12 != 0) goto L_0x0138
                int r10 = r0.MediaBrowserCompat$SearchResultReceiver
                int r11 = r7 + 1
                int r11 = r11 + r3
                int r13 = r11 / r10
                r14 = 1
                int r13 = r13 + r14
                int r14 = r10 * r13
                int r11 = r11 + r10
                if (r14 < r11) goto L_0x0129
                int r13 = r13 + -1
            L_0x0129:
                int r10 = r0.RatingCompat
                if (r13 >= r10) goto L_0x0138
                int[] r12 = new int[r5]
                int r5 = r0.MediaBrowserCompat$SearchResultReceiver
                r11 = 0
                r12[r11] = r5
                r5 = 1
                r12[r5] = r10
                goto L_0x013a
            L_0x0138:
                r5 = 1
                r11 = 0
            L_0x013a:
                if (r12 == 0) goto L_0x01eb
                r10 = r12[r11]
                r11 = r12[r5]
                int r12 = p040o.ScriptC.MediaBrowserCompat$CustomActionResultReceiver(r7, r3, r10, r11)
                int r3 = r3 + r7
                int r3 = r3 + r5
                r13 = 929(0x3a1, float:1.302E-42)
                if (r3 > r13) goto L_0x01ce
                int r7 = r7 + r12
                int r7 = r7 + r5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r7)
                char r5 = (char) r7
                r3.append(r5)
                r3.append(r6)
                r5 = 0
            L_0x0159:
                if (r5 >= r12) goto L_0x0163
                r6 = 900(0x384, float:1.261E-42)
                r3.append(r6)
                int r5 = r5 + 1
                goto L_0x0159
            L_0x0163:
                java.lang.String r3 = r3.toString()
                java.lang.String r5 = p040o.setZ.IconCompatParcelizer(r3, r9)
                o.addScope$write r6 = new o.addScope$write
                r6.<init>(r11, r10)
                r0.IconCompatParcelizer = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                r6.append(r5)
                java.lang.String r6 = r6.toString()
                o.addScope$write r3 = r0.IconCompatParcelizer
                r5 = r0
                r7 = r10
                r8 = r11
                r10 = r3
                r5.IconCompatParcelizer(r6, r7, r8, r9, r10)
                o.addScope$write r3 = r0.IconCompatParcelizer
                r5 = 4
                r6 = 1
                byte[][] r3 = r3.MediaBrowserCompat$ItemReceiver(r6, r5)
                r5 = 0
                if (r2 <= r1) goto L_0x0197
                r12 = 1
                goto L_0x0198
            L_0x0197:
                r12 = 0
            L_0x0198:
                r6 = r3[r5]
                int r6 = r6.length
                int r7 = r3.length
                if (r6 >= r7) goto L_0x01a0
                r6 = 1
                goto L_0x01a1
            L_0x01a0:
                r6 = r5
            L_0x01a1:
                if (r12 == r6) goto L_0x01a9
                byte[][] r3 = MediaBrowserCompat$ItemReceiver(r3)
                r12 = 1
                goto L_0x01aa
            L_0x01a9:
                r12 = r5
            L_0x01aa:
                r5 = r3[r5]
                int r5 = r5.length
                int r1 = r1 / r5
                int r5 = r3.length
                int r2 = r2 / r5
                if (r1 < r2) goto L_0x01b3
                r1 = r2
            L_0x01b3:
                r2 = 1
                if (r1 <= r2) goto L_0x01c9
                o.addScope$write r0 = r0.IconCompatParcelizer
                int r2 = r1 << 2
                byte[][] r0 = r0.MediaBrowserCompat$ItemReceiver(r1, r2)
                if (r12 == 0) goto L_0x01c4
                byte[][] r0 = MediaBrowserCompat$ItemReceiver(r0)
            L_0x01c4:
                o.rsnScriptSetVarI r0 = read(r0, r4)
                return r0
            L_0x01c9:
                o.rsnScriptSetVarI r0 = read(r3, r4)
                return r0
            L_0x01ce:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Encoded message contains too many code words, message too big ("
                r0.<init>(r1)
                int r1 = r18.length()
                r0.append(r1)
                java.lang.String r1 = " bytes)"
                r0.append(r1)
                com.google.zxing.WriterException r1 = new com.google.zxing.WriterException
                java.lang.String r0 = r0.toString()
                r1.<init>((java.lang.String) r0)
                throw r1
            L_0x01eb:
                com.google.zxing.WriterException r0 = new com.google.zxing.WriterException
                java.lang.String r1 = "Unable to fit message in columns"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x01f3:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Can only encode PDF_417, but got "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.EkycService.read.write(java.lang.String, o.rsnIncAllocationCreateTyped, int, int, java.util.Map):o.rsnScriptSetVarI");
        }
    }
}
