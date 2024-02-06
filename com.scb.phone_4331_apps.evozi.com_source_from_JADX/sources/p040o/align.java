package p040o;

import java.util.List;
import p040o.Keep;
import p040o.Keep.read;
import p040o.isComplex;

/* renamed from: o.align */
public class align<T extends Keep.read> implements getImageDimensionMismatch {
    private static float MediaBrowserCompat$CustomActionResultReceiver(List<isComplex.C13709> list, float f, addToPack$MediaBrowserCompat$ItemReceiver addtopack_mediabrowsercompat_itemreceiver) {
        float f2 = Float.MAX_VALUE;
        int i = 0;
        while (true) {
            List list2 = null;
            if (i >= list2.size()) {
                return f2;
            }
            isComplex.C13709 r1 = (isComplex.C13709) list2.get(i);
            if (r1.IconCompatParcelizer == addtopack_mediabrowsercompat_itemreceiver) {
                float abs = Math.abs(r1.MediaBrowserCompat$MediaItem - f);
                if (abs < f2) {
                    f2 = abs;
                }
            }
            i++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: o.isComplex$9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: o.isComplex$9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: o.isComplex$9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p040o.isComplex.C13709 MediaBrowserCompat$ItemReceiver(java.util.List<p040o.isComplex.C13709> r7, float r8, float r9, p040o.addToPack$MediaBrowserCompat$ItemReceiver r10, float r11) {
        /*
            r7 = 0
            r0 = 0
            r1 = r7
        L_0x0003:
            int r2 = r7.size()
            if (r0 >= r2) goto L_0x002d
            java.lang.Object r2 = r7.get(r0)
            o.isComplex$9 r2 = (p040o.isComplex.C13709) r2
            if (r10 == 0) goto L_0x0015
            o.addToPack$MediaBrowserCompat$ItemReceiver r3 = r2.IconCompatParcelizer
            if (r3 != r10) goto L_0x002a
        L_0x0015:
            float r3 = r2.RatingCompat
            float r4 = r2.MediaBrowserCompat$MediaItem
            float r3 = r8 - r3
            double r5 = (double) r3
            float r3 = r9 - r4
            double r3 = (double) r3
            double r3 = java.lang.Math.hypot(r5, r3)
            float r3 = (float) r3
            int r4 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x002a
            r1 = r2
            r11 = r3
        L_0x002a:
            int r0 = r0 + 1
            goto L_0x0003
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.align.MediaBrowserCompat$ItemReceiver(java.util.List, float, float, o.addToPack$MediaBrowserCompat$ItemReceiver, float):o.isComplex$9");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: int} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List, o.Keep$read] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.List, o.Keep$read, o.isComplex$9] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v13, types: [float[], o.Keep$read] */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.isComplex.C13709 read(float r19, float r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            o.addToPack$MediaBrowserCompat$ItemReceiver r2 = p040o.addToPack$MediaBrowserCompat$ItemReceiver.LEFT
            r2 = 0
            o.AlertController$RecycleListView$MediaBrowserCompat$CustomActionResultReceiver r3 = r2.read()
            o.Float3 r3 = r3.read(r0, r1)
            double r4 = r3.MediaBrowserCompat$CustomActionResultReceiver
            float r4 = (float) r4
            p040o.Float3.MediaBrowserCompat$CustomActionResultReceiver(r3)
            r2.clear()
            o.addBoolean r3 = r2.MediaBrowserCompat$ItemReceiver()
            if (r3 == 0) goto L_0x00b8
            int r5 = r3.read()
            r6 = 0
            r14 = r6
        L_0x0024:
            if (r14 >= r5) goto L_0x00b8
            o.subByte2 r15 = r3.write(r14)
            boolean r7 = r15.mo18473x50fd9e4a()
            if (r7 == 0) goto L_0x00b1
            o.createFromArray$write r7 = p040o.createFromArray.write.CLOSEST
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.List r8 = r15.MediaBrowserCompat$CustomActionResultReceiver((float) r4)
            int r9 = r8.size()
            if (r9 != 0) goto L_0x0051
            r9 = 2143289344(0x7fc00000, float:NaN)
            o.addI8 r7 = r15.MediaBrowserCompat$ItemReceiver(r4, r9, r7)
            if (r7 == 0) goto L_0x0051
            float r7 = r7.MediaBrowserCompat$CustomActionResultReceiver()
            java.util.List r8 = r15.MediaBrowserCompat$CustomActionResultReceiver((float) r7)
        L_0x0051:
            int r7 = r8.size()
            if (r7 == 0) goto L_0x00ab
            java.util.Iterator r16 = r8.iterator()
        L_0x005b:
            boolean r7 = r16.hasNext()
            if (r7 == 0) goto L_0x00ab
            java.lang.Object r7 = r16.next()
            o.addI8 r7 = (p040o.addI8) r7
            r15.IconCompatParcelizer()
            r2.read()
            float r8 = r7.MediaBrowserCompat$CustomActionResultReceiver()
            float r9 = r7.IconCompatParcelizer
            r2[r6] = r8
            r8 = 1
            r2[r8] = r9
            p040o.C1133x65c1ec57.MediaBrowserCompat$CustomActionResultReceiver((float[]) r2)
            r9 = r2[r6]
            double r9 = (double) r9
            r8 = r2[r8]
            double r11 = (double) r8
            o.Float3 r8 = p040o.Float3.IconCompatParcelizer(r9, r11)
            float r9 = r7.MediaBrowserCompat$CustomActionResultReceiver()
            float r10 = r7.IconCompatParcelizer
            double r11 = r8.MediaBrowserCompat$CustomActionResultReceiver
            float r11 = (float) r11
            double r7 = r8.IconCompatParcelizer
            float r12 = (float) r7
            o.isComplex$9 r8 = new o.isComplex$9
            o.addToPack$MediaBrowserCompat$ItemReceiver r17 = r15.IconCompatParcelizer()
            r7 = r8
            r6 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r2 = r13
            r13 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r2.add(r6)
            r13 = r2
            r2 = 0
            r6 = 0
            goto L_0x005b
        L_0x00ab:
            r2 = r13
            r6 = 0
            r6.addAll(r2)
            goto L_0x00b2
        L_0x00b1:
            r6 = r2
        L_0x00b2:
            int r14 = r14 + 1
            r2 = r6
            r6 = 0
            goto L_0x0024
        L_0x00b8:
            r6 = r2
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x00c0
            return r6
        L_0x00c0:
            o.addToPack$MediaBrowserCompat$ItemReceiver r2 = p040o.addToPack$MediaBrowserCompat$ItemReceiver.LEFT
            float r2 = MediaBrowserCompat$CustomActionResultReceiver(r6, r1, r2)
            o.addToPack$MediaBrowserCompat$ItemReceiver r3 = p040o.addToPack$MediaBrowserCompat$ItemReceiver.RIGHT
            float r3 = MediaBrowserCompat$CustomActionResultReceiver(r6, r1, r3)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d3
            o.addToPack$MediaBrowserCompat$ItemReceiver r2 = p040o.addToPack$MediaBrowserCompat$ItemReceiver.LEFT
            goto L_0x00d5
        L_0x00d3:
            o.addToPack$MediaBrowserCompat$ItemReceiver r2 = p040o.addToPack$MediaBrowserCompat$ItemReceiver.RIGHT
        L_0x00d5:
            float r3 = r6.mo3114x50fd9e4a()
            o.isComplex$9 r0 = MediaBrowserCompat$ItemReceiver(r6, r0, r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.align.read(float, float):o.isComplex$9");
    }
}
