package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.setOutput */
public final class setOutput {
    public final List<getValue> IconCompatParcelizer = new ArrayList();
    private final int[] MediaBrowserCompat$CustomActionResultReceiver = new int[5];
    public final rsnScriptSetVarI MediaBrowserCompat$ItemReceiver;
    private final rsnScriptFieldIDCreate read;
    public boolean write;

    public setOutput(rsnScriptSetVarI rsnscriptsetvari, rsnScriptFieldIDCreate rsnscriptfieldidcreate) {
        this.MediaBrowserCompat$ItemReceiver = rsnscriptsetvari;
        this.read = rsnscriptfieldidcreate;
    }

    public static boolean read(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2) {
            if (Math.abs((f * 3.0f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f A[LOOP:5: B:38:0x006f->B:44:0x007c, LOOP_START, PHI: r11 
      PHI: (r11v3 int) = (r11v2 int), (r11v10 int) binds: [B:36:0x006c, B:44:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float read(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            o.rsnScriptSetVarI r0 = r10.MediaBrowserCompat$ItemReceiver
            int r1 = r0.write
            int[] r2 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r3 = 0
            r4 = r3
        L_0x0008:
            int r5 = r2.length
            if (r4 >= r5) goto L_0x0010
            r2[r4] = r3
            int r4 = r4 + 1
            goto L_0x0008
        L_0x0010:
            int[] r2 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r4 = r11
        L_0x0013:
            r5 = 2
            r6 = 1
            if (r4 < 0) goto L_0x0025
            boolean r7 = r0.MediaBrowserCompat$ItemReceiver(r12, r4)
            if (r7 == 0) goto L_0x0025
            r7 = r2[r5]
            int r7 = r7 + r6
            r2[r5] = r7
            int r4 = r4 + -1
            goto L_0x0013
        L_0x0025:
            r7 = 2143289344(0x7fc00000, float:NaN)
            if (r4 >= 0) goto L_0x002a
            return r7
        L_0x002a:
            if (r4 < 0) goto L_0x003e
            boolean r8 = r0.MediaBrowserCompat$ItemReceiver(r12, r4)
            if (r8 != 0) goto L_0x003e
            r8 = r2[r6]
            if (r8 > r13) goto L_0x003e
            r8 = r2[r6]
            int r8 = r8 + r6
            r2[r6] = r8
            int r4 = r4 + -1
            goto L_0x002a
        L_0x003e:
            if (r4 < 0) goto L_0x00d3
            r8 = r2[r6]
            if (r8 > r13) goto L_0x00d3
        L_0x0044:
            if (r4 < 0) goto L_0x0058
            boolean r8 = r0.MediaBrowserCompat$ItemReceiver(r12, r4)
            if (r8 == 0) goto L_0x0058
            r8 = r2[r3]
            if (r8 > r13) goto L_0x0058
            r8 = r2[r3]
            int r8 = r8 + r6
            r2[r3] = r8
            int r4 = r4 + -1
            goto L_0x0044
        L_0x0058:
            r4 = r2[r3]
            if (r4 <= r13) goto L_0x005d
            return r7
        L_0x005d:
            int r11 = r11 + r6
            if (r11 >= r1) goto L_0x006c
            boolean r4 = r0.MediaBrowserCompat$ItemReceiver(r12, r11)
            if (r4 == 0) goto L_0x006c
            r4 = r2[r5]
            int r4 = r4 + r6
            r2[r5] = r4
            goto L_0x005d
        L_0x006c:
            if (r11 != r1) goto L_0x006f
            return r7
        L_0x006f:
            r4 = 3
            if (r11 >= r1) goto L_0x0084
            boolean r8 = r0.MediaBrowserCompat$ItemReceiver(r12, r11)
            if (r8 != 0) goto L_0x0084
            r8 = r2[r4]
            if (r8 >= r13) goto L_0x0084
            r8 = r2[r4]
            int r8 = r8 + r6
            r2[r4] = r8
            int r11 = r11 + 1
            goto L_0x006f
        L_0x0084:
            if (r11 == r1) goto L_0x00d3
            r8 = r2[r4]
            if (r8 >= r13) goto L_0x00d3
        L_0x008a:
            r8 = 4
            if (r11 >= r1) goto L_0x009f
            boolean r9 = r0.MediaBrowserCompat$ItemReceiver(r12, r11)
            if (r9 == 0) goto L_0x009f
            r9 = r2[r8]
            if (r9 >= r13) goto L_0x009f
            r9 = r2[r8]
            int r9 = r9 + r6
            r2[r8] = r9
            int r11 = r11 + 1
            goto L_0x008a
        L_0x009f:
            r12 = r2[r8]
            if (r12 < r13) goto L_0x00a4
            return r7
        L_0x00a4:
            r12 = r2[r3]
            r13 = r2[r6]
            r0 = r2[r5]
            r1 = r2[r4]
            r3 = r2[r8]
            int r12 = r12 + r13
            int r12 = r12 + r0
            int r12 = r12 + r1
            int r12 = r12 + r3
            int r12 = r12 - r14
            int r12 = java.lang.Math.abs(r12)
            int r12 = r12 * 5
            int r13 = r14 << 1
            if (r12 < r13) goto L_0x00be
            return r7
        L_0x00be:
            boolean r12 = read(r2)
            if (r12 == 0) goto L_0x00d3
            r12 = r2[r8]
            int r11 = r11 - r12
            r12 = r2[r4]
            int r11 = r11 - r12
            float r11 = (float) r11
            r12 = r2[r5]
            float r12 = (float) r12
            r13 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r13
            float r11 = r11 - r12
            return r11
        L_0x00d3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setOutput.read(int, int, int, int):float");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f A[LOOP:5: B:38:0x006f->B:44:0x007c, LOOP_START, PHI: r11 
      PHI: (r11v3 int) = (r11v2 int), (r11v10 int) binds: [B:36:0x006c, B:44:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float IconCompatParcelizer(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            o.rsnScriptSetVarI r0 = r10.MediaBrowserCompat$ItemReceiver
            int r1 = r0.IconCompatParcelizer
            int[] r2 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r3 = 0
            r4 = r3
        L_0x0008:
            int r5 = r2.length
            if (r4 >= r5) goto L_0x0010
            r2[r4] = r3
            int r4 = r4 + 1
            goto L_0x0008
        L_0x0010:
            int[] r2 = r10.MediaBrowserCompat$CustomActionResultReceiver
            r4 = r11
        L_0x0013:
            r5 = 2
            r6 = 1
            if (r4 < 0) goto L_0x0025
            boolean r7 = r0.MediaBrowserCompat$ItemReceiver(r4, r12)
            if (r7 == 0) goto L_0x0025
            r7 = r2[r5]
            int r7 = r7 + r6
            r2[r5] = r7
            int r4 = r4 + -1
            goto L_0x0013
        L_0x0025:
            r7 = 2143289344(0x7fc00000, float:NaN)
            if (r4 >= 0) goto L_0x002a
            return r7
        L_0x002a:
            if (r4 < 0) goto L_0x003e
            boolean r8 = r0.MediaBrowserCompat$ItemReceiver(r4, r12)
            if (r8 != 0) goto L_0x003e
            r8 = r2[r6]
            if (r8 > r13) goto L_0x003e
            r8 = r2[r6]
            int r8 = r8 + r6
            r2[r6] = r8
            int r4 = r4 + -1
            goto L_0x002a
        L_0x003e:
            if (r4 < 0) goto L_0x00d1
            r8 = r2[r6]
            if (r8 > r13) goto L_0x00d1
        L_0x0044:
            if (r4 < 0) goto L_0x0058
            boolean r8 = r0.MediaBrowserCompat$ItemReceiver(r4, r12)
            if (r8 == 0) goto L_0x0058
            r8 = r2[r3]
            if (r8 > r13) goto L_0x0058
            r8 = r2[r3]
            int r8 = r8 + r6
            r2[r3] = r8
            int r4 = r4 + -1
            goto L_0x0044
        L_0x0058:
            r4 = r2[r3]
            if (r4 <= r13) goto L_0x005d
            return r7
        L_0x005d:
            int r11 = r11 + r6
            if (r11 >= r1) goto L_0x006c
            boolean r4 = r0.MediaBrowserCompat$ItemReceiver(r11, r12)
            if (r4 == 0) goto L_0x006c
            r4 = r2[r5]
            int r4 = r4 + r6
            r2[r5] = r4
            goto L_0x005d
        L_0x006c:
            if (r11 != r1) goto L_0x006f
            return r7
        L_0x006f:
            r4 = 3
            if (r11 >= r1) goto L_0x0084
            boolean r8 = r0.MediaBrowserCompat$ItemReceiver(r11, r12)
            if (r8 != 0) goto L_0x0084
            r8 = r2[r4]
            if (r8 >= r13) goto L_0x0084
            r8 = r2[r4]
            int r8 = r8 + r6
            r2[r4] = r8
            int r11 = r11 + 1
            goto L_0x006f
        L_0x0084:
            if (r11 == r1) goto L_0x00d1
            r8 = r2[r4]
            if (r8 >= r13) goto L_0x00d1
        L_0x008a:
            r8 = 4
            if (r11 >= r1) goto L_0x009f
            boolean r9 = r0.MediaBrowserCompat$ItemReceiver(r11, r12)
            if (r9 == 0) goto L_0x009f
            r9 = r2[r8]
            if (r9 >= r13) goto L_0x009f
            r9 = r2[r8]
            int r9 = r9 + r6
            r2[r8] = r9
            int r11 = r11 + 1
            goto L_0x008a
        L_0x009f:
            r12 = r2[r8]
            if (r12 < r13) goto L_0x00a4
            return r7
        L_0x00a4:
            r12 = r2[r3]
            r13 = r2[r6]
            r0 = r2[r5]
            r1 = r2[r4]
            r3 = r2[r8]
            int r12 = r12 + r13
            int r12 = r12 + r0
            int r12 = r12 + r1
            int r12 = r12 + r3
            int r12 = r12 - r14
            int r12 = java.lang.Math.abs(r12)
            int r12 = r12 * 5
            if (r12 < r14) goto L_0x00bc
            return r7
        L_0x00bc:
            boolean r12 = read(r2)
            if (r12 == 0) goto L_0x00d1
            r12 = r2[r8]
            int r11 = r11 - r12
            r12 = r2[r4]
            int r11 = r11 - r12
            float r11 = (float) r11
            r12 = r2[r5]
            float r12 = (float) r12
            r13 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r13
            float r11 = r11 - r12
            return r11
        L_0x00d1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setOutput.IconCompatParcelizer(int, int, int, int):float");
    }

    public boolean write(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int i4 = (int) (((float) ((i2 - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f));
        float read2 = read(i, i4, iArr[2], i3);
        if (!Float.isNaN(read2)) {
            int i5 = (int) read2;
            float IconCompatParcelizer2 = IconCompatParcelizer(i4, i5, iArr[2], i3);
            if (!Float.isNaN(IconCompatParcelizer2) && MediaBrowserCompat$ItemReceiver(i5, (int) IconCompatParcelizer2)) {
                float f = ((float) i3) / 7.0f;
                int i6 = 0;
                while (true) {
                    if (i6 >= this.IconCompatParcelizer.size()) {
                        break;
                    }
                    getValue getvalue = this.IconCompatParcelizer.get(i6);
                    if (getvalue.IconCompatParcelizer(f, read2, IconCompatParcelizer2)) {
                        this.IconCompatParcelizer.set(i6, getvalue.MediaBrowserCompat$ItemReceiver(read2, IconCompatParcelizer2, f));
                        z = true;
                        break;
                    }
                    i6++;
                }
                if (!z) {
                    getValue getvalue2 = new getValue(IconCompatParcelizer2, read2, f);
                    this.IconCompatParcelizer.add(getvalue2);
                    rsnScriptFieldIDCreate rsnscriptfieldidcreate = this.read;
                    if (rsnscriptfieldidcreate != null) {
                        rsnscriptfieldidcreate.MediaBrowserCompat$CustomActionResultReceiver(getvalue2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean MediaBrowserCompat$ItemReceiver() {
        int size = this.IconCompatParcelizer.size();
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = 0.0f;
        int i = 0;
        for (getValue next : this.IconCompatParcelizer) {
            if (next.IconCompatParcelizer >= 2) {
                i++;
                f2 += next.write;
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (getValue getvalue : this.IconCompatParcelizer) {
            f += Math.abs(getvalue.write - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    /* renamed from: o.setOutput$write */
    public static final class write implements Serializable, Comparator<getValue> {
        private final float write;

        public /* synthetic */ write(float f, byte b) {
            this(f);
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            getValue getvalue = (getValue) obj;
            getValue getvalue2 = (getValue) obj2;
            int compare = Integer.compare(getvalue2.IconCompatParcelizer, getvalue.IconCompatParcelizer);
            return compare == 0 ? Float.compare(Math.abs(getvalue.write - this.write), Math.abs(getvalue2.write - this.write)) : compare;
        }

        private write(float f) {
            this.write = f;
        }
    }

    private boolean MediaBrowserCompat$ItemReceiver(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] iArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            iArr[i6] = 0;
        }
        int[] iArr2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i7 = 0;
        while (i >= i7 && i2 >= i7 && this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(i2 - i7, i - i7)) {
            iArr2[2] = iArr2[2] + 1;
            i7++;
        }
        if (iArr2[2] == 0) {
            return false;
        }
        while (i >= i7 && i2 >= i7 && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(i2 - i7, i - i7)) {
            iArr2[1] = iArr2[1] + 1;
            i7++;
        }
        if (iArr2[1] == 0) {
            return false;
        }
        while (i >= i7 && i2 >= i7 && this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(i2 - i7, i - i7)) {
            iArr2[0] = iArr2[0] + 1;
            i7++;
        }
        if (iArr2[0] == 0) {
            return false;
        }
        int i8 = this.MediaBrowserCompat$ItemReceiver.write;
        int i9 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        int i10 = 1;
        while (true) {
            int i11 = i + i10;
            if (i11 < i8 && (i5 = i2 + i10) < i9 && this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(i5, i11)) {
                iArr2[2] = iArr2[2] + 1;
                i10++;
            }
        }
        while (true) {
            int i12 = i + i10;
            if (i12 < i8 && (i4 = i2 + i10) < i9 && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(i4, i12)) {
                iArr2[3] = iArr2[3] + 1;
                i10++;
            }
        }
        if (iArr2[3] == 0) {
            return false;
        }
        while (true) {
            int i13 = i + i10;
            if (i13 < i8 && (i3 = i2 + i10) < i9 && this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(i3, i13)) {
                iArr2[4] = iArr2[4] + 1;
                i10++;
            }
        }
        if (iArr2[4] == 0) {
            return false;
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 < 5) {
                int i16 = iArr2[i14];
                if (i16 == 0) {
                    break;
                }
                i15 += i16;
                i14++;
            } else if (i15 >= 7) {
                float f = ((float) i15) / 7.0f;
                float f2 = f / 1.333f;
                if (Math.abs(f - ((float) iArr2[0])) < f2 && Math.abs(f - ((float) iArr2[1])) < f2) {
                    if (Math.abs((f * 3.0f) - ((float) iArr2[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr2[3])) >= f2 || Math.abs(f - ((float) iArr2[4])) >= f2) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
