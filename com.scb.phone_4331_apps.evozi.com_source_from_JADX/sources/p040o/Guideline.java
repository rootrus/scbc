package p040o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: o.Guideline */
public final class Guideline {
    private static final Comparator<Guideline$MediaBrowserCompat$SearchResultReceiver> write = new Comparator<Guideline$MediaBrowserCompat$SearchResultReceiver>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            Guideline$MediaBrowserCompat$SearchResultReceiver guideline$MediaBrowserCompat$SearchResultReceiver = (Guideline$MediaBrowserCompat$SearchResultReceiver) obj;
            Guideline$MediaBrowserCompat$SearchResultReceiver guideline$MediaBrowserCompat$SearchResultReceiver2 = (Guideline$MediaBrowserCompat$SearchResultReceiver) obj2;
            int i = guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver - guideline$MediaBrowserCompat$SearchResultReceiver2.MediaBrowserCompat$ItemReceiver;
            return i == 0 ? guideline$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer - guideline$MediaBrowserCompat$SearchResultReceiver2.IconCompatParcelizer : i;
        }
    };

    /* renamed from: o.Guideline$IconCompatParcelizer */
    public static abstract class IconCompatParcelizer {
        public abstract boolean MediaBrowserCompat$CustomActionResultReceiver(int i, int i2);

        public abstract int MediaBrowserCompat$ItemReceiver();

        public Object read(int i, int i2) {
            return null;
        }

        public abstract int write();

        public abstract boolean write(int i, int i2);
    }

    /* renamed from: o.Guideline$write */
    public static abstract class write<T> {
        public abstract boolean MediaBrowserCompat$CustomActionResultReceiver(T t, T t2);

        public abstract boolean read(T t, T t2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r1[r13 - 1] >= r1[r13 + r7]) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        if (r2[r12 - 1] >= r2[r12 + 1]) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099 A[LOOP:1: B:10:0x0031->B:33:0x0099, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x007e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p040o.Guideline$MediaBrowserCompat$SearchResultReceiver write(p040o.Guideline.IconCompatParcelizer r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            if (r3 <= 0) goto L_0x0130
            if (r4 <= 0) goto L_0x0130
            int r5 = r3 - r4
            int r6 = r3 + r4
            r7 = 1
            int r6 = r6 + r7
            int r6 = r6 / 2
            int r8 = r26 - r6
            int r8 = r8 - r7
            int r9 = r26 + r6
            int r9 = r9 + r7
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r5
            int r9 = r9 + r5
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r5 % 2
            if (r8 == 0) goto L_0x002b
            r8 = r7
            goto L_0x002c
        L_0x002b:
            r8 = r10
        L_0x002c:
            r9 = r10
        L_0x002d:
            if (r9 > r6) goto L_0x0128
            int r11 = -r9
            r12 = r11
        L_0x0031:
            if (r12 > r9) goto L_0x009f
            if (r12 == r11) goto L_0x004a
            if (r12 == r9) goto L_0x0042
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r7
            r13 = r1[r13]
            if (r14 < r13) goto L_0x004a
        L_0x0042:
            int r13 = r26 + r12
            int r13 = r13 - r7
            r13 = r1[r13]
            int r13 = r13 + r7
            r14 = r7
            goto L_0x0050
        L_0x004a:
            int r13 = r26 + r12
            int r13 = r13 + r7
            r13 = r1[r13]
            r14 = r10
        L_0x0050:
            int r15 = r13 - r12
        L_0x0052:
            if (r13 >= r3) goto L_0x0067
            if (r15 >= r4) goto L_0x0067
            int r10 = r20 + r13
            int r7 = r22 + r15
            boolean r7 = r0.MediaBrowserCompat$CustomActionResultReceiver(r10, r7)
            if (r7 == 0) goto L_0x0067
            int r13 = r13 + 1
            int r15 = r15 + 1
            r7 = 1
            r10 = 0
            goto L_0x0052
        L_0x0067:
            int r7 = r26 + r12
            r1[r7] = r13
            if (r8 == 0) goto L_0x0099
            int r10 = r5 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x0099
            int r10 = r5 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x0099
            r10 = r1[r7]
            r13 = r2[r7]
            if (r10 < r13) goto L_0x0099
            o.Guideline$MediaBrowserCompat$SearchResultReceiver r0 = new o.Guideline$MediaBrowserCompat$SearchResultReceiver
            r0.<init>()
            r3 = r2[r7]
            r0.MediaBrowserCompat$ItemReceiver = r3
            int r3 = r0.MediaBrowserCompat$ItemReceiver
            int r3 = r3 - r12
            r0.IconCompatParcelizer = r3
            r1 = r1[r7]
            r2 = r2[r7]
            int r1 = r1 - r2
            r0.read = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r14
            r13 = 0
            r0.write = r13
            return r0
        L_0x0099:
            r13 = 0
            int r12 = r12 + 2
            r10 = r13
            r7 = 1
            goto L_0x0031
        L_0x009f:
            r13 = r10
            r7 = r11
        L_0x00a1:
            if (r7 > r9) goto L_0x011d
            int r10 = r7 + r5
            int r12 = r9 + r5
            if (r10 == r12) goto L_0x00c3
            int r12 = r11 + r5
            if (r10 == r12) goto L_0x00ba
            int r12 = r26 + r10
            int r14 = r12 + -1
            r14 = r2[r14]
            r15 = 1
            int r12 = r12 + r15
            r12 = r2[r12]
            if (r14 < r12) goto L_0x00c4
            goto L_0x00bb
        L_0x00ba:
            r15 = 1
        L_0x00bb:
            int r12 = r26 + r10
            int r12 = r12 + r15
            r12 = r2[r12]
            int r12 = r12 - r15
            r14 = r15
            goto L_0x00ca
        L_0x00c3:
            r15 = 1
        L_0x00c4:
            int r12 = r26 + r10
            int r12 = r12 - r15
            r12 = r2[r12]
            r14 = r13
        L_0x00ca:
            int r16 = r12 - r10
        L_0x00cc:
            if (r12 <= 0) goto L_0x00e9
            if (r16 <= 0) goto L_0x00e9
            int r17 = r20 + r12
            int r13 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.MediaBrowserCompat$CustomActionResultReceiver(r13, r3)
            if (r3 == 0) goto L_0x00eb
            int r12 = r12 + -1
            int r16 = r16 + -1
            r3 = r18
            r13 = 0
            r15 = 1
            goto L_0x00cc
        L_0x00e9:
            r18 = r3
        L_0x00eb:
            int r3 = r26 + r10
            r2[r3] = r12
            if (r8 != 0) goto L_0x0116
            if (r10 < r11) goto L_0x0116
            if (r10 > r9) goto L_0x0116
            r12 = r1[r3]
            r13 = r2[r3]
            if (r12 < r13) goto L_0x0116
            o.Guideline$MediaBrowserCompat$SearchResultReceiver r0 = new o.Guideline$MediaBrowserCompat$SearchResultReceiver
            r0.<init>()
            r4 = r2[r3]
            r0.MediaBrowserCompat$ItemReceiver = r4
            int r4 = r0.MediaBrowserCompat$ItemReceiver
            int r4 = r4 - r10
            r0.IconCompatParcelizer = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.read = r1
            r0.MediaBrowserCompat$CustomActionResultReceiver = r14
            r3 = 1
            r0.write = r3
            return r0
        L_0x0116:
            r3 = 1
            int r7 = r7 + 2
            r3 = r18
            r13 = 0
            goto L_0x00a1
        L_0x011d:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r7 = r3
            r3 = r18
            r10 = 0
            goto L_0x002d
        L_0x0128:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x0130:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.Guideline.write(o.Guideline$IconCompatParcelizer, int, int, int, int, int[], int[], int):o.Guideline$MediaBrowserCompat$SearchResultReceiver");
    }

    /* renamed from: o.Guideline$read */
    static class read {
        int MediaBrowserCompat$ItemReceiver;
        int read;
        boolean write;

        public read(int i, int i2, boolean z) {
            this.MediaBrowserCompat$ItemReceiver = i;
            this.read = i2;
            this.write = z;
        }
    }

    public static Guideline$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer iconCompatParcelizer) {
        int write2 = iconCompatParcelizer.write();
        int MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Guideline$MediaBrowserCompat$ItemReceiver(write2, MediaBrowserCompat$ItemReceiver));
        int abs = write2 + MediaBrowserCompat$ItemReceiver + Math.abs(write2 - MediaBrowserCompat$ItemReceiver);
        int i = abs << 1;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Guideline$MediaBrowserCompat$ItemReceiver guideline$MediaBrowserCompat$ItemReceiver = (Guideline$MediaBrowserCompat$ItemReceiver) arrayList2.remove(arrayList2.size() - 1);
            Guideline$MediaBrowserCompat$SearchResultReceiver write3 = write(iconCompatParcelizer, guideline$MediaBrowserCompat$ItemReceiver.write, guideline$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, guideline$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, guideline$MediaBrowserCompat$ItemReceiver.read, iArr, iArr2, abs);
            if (write3 != null) {
                if (write3.read > 0) {
                    arrayList.add(write3);
                }
                write3.MediaBrowserCompat$ItemReceiver += guideline$MediaBrowserCompat$ItemReceiver.write;
                write3.IconCompatParcelizer += guideline$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                Guideline$MediaBrowserCompat$ItemReceiver guideline$MediaBrowserCompat$ItemReceiver2 = arrayList3.isEmpty() ? new Guideline$MediaBrowserCompat$ItemReceiver() : (Guideline$MediaBrowserCompat$ItemReceiver) arrayList3.remove(arrayList3.size() - 1);
                guideline$MediaBrowserCompat$ItemReceiver2.write = guideline$MediaBrowserCompat$ItemReceiver.write;
                guideline$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver = guideline$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                if (write3.write) {
                    guideline$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = write3.MediaBrowserCompat$ItemReceiver;
                    guideline$MediaBrowserCompat$ItemReceiver2.read = write3.IconCompatParcelizer;
                } else if (write3.MediaBrowserCompat$CustomActionResultReceiver) {
                    guideline$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = write3.MediaBrowserCompat$ItemReceiver - 1;
                    guideline$MediaBrowserCompat$ItemReceiver2.read = write3.IconCompatParcelizer;
                } else {
                    guideline$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver = write3.MediaBrowserCompat$ItemReceiver;
                    guideline$MediaBrowserCompat$ItemReceiver2.read = write3.IconCompatParcelizer - 1;
                }
                arrayList2.add(guideline$MediaBrowserCompat$ItemReceiver2);
                if (!write3.write) {
                    guideline$MediaBrowserCompat$ItemReceiver.write = write3.MediaBrowserCompat$ItemReceiver + write3.read;
                    guideline$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = write3.IconCompatParcelizer + write3.read;
                } else if (write3.MediaBrowserCompat$CustomActionResultReceiver) {
                    guideline$MediaBrowserCompat$ItemReceiver.write = write3.MediaBrowserCompat$ItemReceiver + write3.read + 1;
                    guideline$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = write3.IconCompatParcelizer + write3.read;
                } else {
                    guideline$MediaBrowserCompat$ItemReceiver.write = write3.MediaBrowserCompat$ItemReceiver + write3.read;
                    guideline$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = write3.IconCompatParcelizer + write3.read + 1;
                }
                arrayList2.add(guideline$MediaBrowserCompat$ItemReceiver);
            } else {
                arrayList3.add(guideline$MediaBrowserCompat$ItemReceiver);
            }
        }
        Collections.sort(arrayList, write);
        return new Guideline$MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer, arrayList, iArr, iArr2, true);
    }
}
