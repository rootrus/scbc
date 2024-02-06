package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.ScriptGroup;

/* renamed from: o.ListenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver */
public final class ListenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver {
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompat$CustomActionResultReceiver;
    public final List<ScriptGroup.Builder> MediaBrowserCompat$ItemReceiver;
    private final rsnScriptFieldIDCreate MediaBrowserCompat$SearchResultReceiver;
    private final int[] MediaDescriptionCompat;
    private final float MediaMetadataCompat;
    public final int RatingCompat;
    public final int read;
    public final rsnScriptSetVarI write;

    private ListenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver() {
    }

    public ListenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver(rsnScriptSetVarI rsnscriptsetvari, int i, int i2, int i3, int i4, float f, rsnScriptFieldIDCreate rsnscriptfieldidcreate) {
        this.write = rsnscriptsetvari;
        this.MediaBrowserCompat$ItemReceiver = new ArrayList(5);
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.read = i2;
        this.RatingCompat = i3;
        this.IconCompatParcelizer = i4;
        this.MediaMetadataCompat = f;
        this.MediaDescriptionCompat = new int[3];
        this.MediaBrowserCompat$SearchResultReceiver = rsnscriptfieldidcreate;
    }

    public boolean read(int[] iArr) {
        float f = this.MediaMetadataCompat;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086 A[LOOP:3: B:30:0x007a->B:35:0x0086, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040o.ScriptGroup.Builder MediaBrowserCompat$ItemReceiver(int[] r16, int r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = 0
            r2 = r16[r1]
            r3 = 1
            r4 = r16[r3]
            r5 = 2
            r6 = r16[r5]
            r7 = r16[r5]
            int r7 = r18 - r7
            float r7 = (float) r7
            r8 = r16[r3]
            float r8 = (float) r8
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            float r7 = r7 - r8
            int r8 = (int) r7
            r10 = r16[r3]
            int r10 = r10 << r3
            int r2 = r2 + r4
            int r2 = r2 + r6
            o.rsnScriptSetVarI r4 = r0.write
            int r6 = r4.write
            int[] r11 = r0.MediaDescriptionCompat
            r11[r1] = r1
            r11[r3] = r1
            r11[r5] = r1
            r12 = r17
        L_0x002a:
            if (r12 < 0) goto L_0x003e
            boolean r13 = r4.MediaBrowserCompat$ItemReceiver(r8, r12)
            if (r13 == 0) goto L_0x003e
            r13 = r11[r3]
            if (r13 > r10) goto L_0x003e
            r13 = r11[r3]
            int r13 = r13 + r3
            r11[r3] = r13
            int r12 = r12 + -1
            goto L_0x002a
        L_0x003e:
            r13 = 2143289344(0x7fc00000, float:NaN)
            if (r12 < 0) goto L_0x00b6
            r14 = r11[r3]
            if (r14 > r10) goto L_0x00b6
        L_0x0046:
            if (r12 < 0) goto L_0x005a
            boolean r14 = r4.MediaBrowserCompat$ItemReceiver(r8, r12)
            if (r14 != 0) goto L_0x005a
            r14 = r11[r1]
            if (r14 > r10) goto L_0x005a
            r14 = r11[r1]
            int r14 = r14 + r3
            r11[r1] = r14
            int r12 = r12 + -1
            goto L_0x0046
        L_0x005a:
            r12 = r11[r1]
            if (r12 <= r10) goto L_0x005f
            goto L_0x00b6
        L_0x005f:
            r12 = r17
        L_0x0061:
            int r12 = r12 + r3
            if (r12 >= r6) goto L_0x0074
            boolean r14 = r4.MediaBrowserCompat$ItemReceiver(r8, r12)
            if (r14 == 0) goto L_0x0074
            r14 = r11[r3]
            if (r14 > r10) goto L_0x0074
            r14 = r11[r3]
            int r14 = r14 + r3
            r11[r3] = r14
            goto L_0x0061
        L_0x0074:
            if (r12 == r6) goto L_0x00b6
            r14 = r11[r3]
            if (r14 > r10) goto L_0x00b6
        L_0x007a:
            if (r12 >= r6) goto L_0x008e
            boolean r14 = r4.MediaBrowserCompat$ItemReceiver(r8, r12)
            if (r14 != 0) goto L_0x008e
            r14 = r11[r5]
            if (r14 > r10) goto L_0x008e
            r14 = r11[r5]
            int r14 = r14 + r3
            r11[r5] = r14
            int r12 = r12 + 1
            goto L_0x007a
        L_0x008e:
            r4 = r11[r5]
            if (r4 <= r10) goto L_0x0093
            goto L_0x00b6
        L_0x0093:
            r4 = r11[r1]
            r6 = r11[r3]
            r8 = r11[r5]
            int r4 = r4 + r6
            int r4 = r4 + r8
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            int r4 = r4 * 5
            int r2 = r2 << r3
            if (r4 < r2) goto L_0x00a6
            goto L_0x00b6
        L_0x00a6:
            boolean r2 = r15.read(r11)
            if (r2 == 0) goto L_0x00b6
            r2 = r11[r5]
            int r12 = r12 - r2
            float r2 = (float) r12
            r4 = r11[r3]
            float r4 = (float) r4
            float r4 = r4 / r9
            float r13 = r2 - r4
        L_0x00b6:
            boolean r2 = java.lang.Float.isNaN(r13)
            if (r2 != 0) goto L_0x012e
            r2 = r16[r1]
            r4 = r16[r3]
            int r2 = r2 + r4
            r4 = r16[r5]
            int r2 = r2 + r4
            float r2 = (float) r2
            r4 = 1077936128(0x40400000, float:3.0)
            float r2 = r2 / r4
            java.util.List<o.ScriptGroup$Builder> r4 = r0.MediaBrowserCompat$ItemReceiver
            java.util.Iterator r4 = r4.iterator()
        L_0x00ce:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x011d
            java.lang.Object r5 = r4.next()
            o.ScriptGroup$Builder r5 = (p040o.ScriptGroup.Builder) r5
            float r6 = r5.read
            float r6 = r13 - r6
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x0108
            float r6 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r6 = r7 - r6
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x0108
            float r6 = r5.write
            float r6 = r2 - r6
            float r6 = java.lang.Math.abs(r6)
            r8 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0106
            float r8 = r5.write
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0108
        L_0x0106:
            r6 = r3
            goto L_0x0109
        L_0x0108:
            r6 = r1
        L_0x0109:
            if (r6 == 0) goto L_0x00ce
            float r1 = r5.MediaBrowserCompat$CustomActionResultReceiver
            float r1 = r1 + r7
            float r1 = r1 / r9
            float r3 = r5.read
            float r3 = r3 + r13
            float r3 = r3 / r9
            float r4 = r5.write
            float r4 = r4 + r2
            float r4 = r4 / r9
            o.ScriptGroup$Builder r2 = new o.ScriptGroup$Builder
            r2.<init>(r1, r3, r4)
            return r2
        L_0x011d:
            o.ScriptGroup$Builder r1 = new o.ScriptGroup$Builder
            r1.<init>(r7, r13, r2)
            java.util.List<o.ScriptGroup$Builder> r2 = r0.MediaBrowserCompat$ItemReceiver
            r2.add(r1)
            o.rsnScriptFieldIDCreate r2 = r0.MediaBrowserCompat$SearchResultReceiver
            if (r2 == 0) goto L_0x012e
            r2.MediaBrowserCompat$CustomActionResultReceiver(r1)
        L_0x012e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ListenerHolder$ListenerKey$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(int[], int, int):o.ScriptGroup$Builder");
    }
}
