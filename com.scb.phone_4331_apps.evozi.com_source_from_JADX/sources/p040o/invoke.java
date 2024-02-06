package p040o;

import com.google.zxing.NotFoundException;
import com.pingan.p031ai.face.common.PaFaceConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.C10822Sampler;

/* renamed from: o.invoke */
public final class invoke extends bindAllocation {
    private static final int[] IconCompatParcelizer = {0, 336, 1036, 1516};
    private static final int[] MediaBrowserCompat$CustomActionResultReceiver = {1, 10, 34, 70, 126};
    private static final int[] MediaBrowserCompat$ItemReceiver = {2, 4, 6, 8};
    private static final int[] MediaBrowserCompat$MediaItem = {0, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, 961, PaFaceConstants.EnvironmentalTips.TOO_FAR, 2715};
    private static final int[] MediaMetadataCompat = {8, 6, 4, 3, 1};
    private static final int[] read = {4, 20, 48, 81};
    private static final int[][] write = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    private final List<C10822Sampler.Value> MediaBrowserCompat$SearchResultReceiver = new ArrayList();
    private final List<C10822Sampler.Value> MediaDescriptionCompat = new ArrayList();

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, Map<rsnIncContextCreate, ?> map) throws NotFoundException {
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver, MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate, false, i, map));
        rsnscriptintrinsiccreate.IconCompatParcelizer();
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat, MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate, true, i, map));
        rsnscriptintrinsiccreate.IconCompatParcelizer();
        for (C10822Sampler.Value next : this.MediaBrowserCompat$SearchResultReceiver) {
            if (next.MediaBrowserCompat$ItemReceiver > 1) {
                for (C10822Sampler.Value next2 : this.MediaDescriptionCompat) {
                    if (next2.MediaBrowserCompat$ItemReceiver > 1) {
                        int i2 = next.write;
                        int i3 = next2.write;
                        int i4 = (next.IconCompatParcelizer.write * 9) + next2.IconCompatParcelizer.write;
                        if (i4 > 72) {
                            i4--;
                        }
                        if (i4 > 8) {
                            i4--;
                        }
                        if ((i2 + (i3 << 4)) % 79 == i4) {
                            String valueOf = String.valueOf((((long) next.read) * 4537077) + ((long) next2.read));
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(valueOf);
                            int i5 = 0;
                            for (int i6 = 0; i6 < 13; i6++) {
                                int charAt = sb.charAt(i6) - '0';
                                if ((i6 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i5 += charAt;
                            }
                            int i7 = 10 - (i5 % 10);
                            if (i7 == 10) {
                                i7 = 0;
                            }
                            sb.append(i7);
                            rsnScriptForEach[] rsnscriptforeachArr = next.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                            rsnScriptForEach[] rsnscriptforeachArr2 = next2.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                            return new getLayers$MediaBrowserCompat$CustomActionResultReceiver(sb.toString(), (byte[]) null, new rsnScriptForEach[]{rsnscriptforeachArr[0], rsnscriptforeachArr[1], rsnscriptforeachArr2[0], rsnscriptforeachArr2[1]}, rsnIncAllocationCreateTyped.RSS_14);
                        }
                    }
                }
                continue;
            }
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(Collection<C10822Sampler.Value> collection, C10822Sampler.Value value) {
        boolean z;
        if (value != null) {
            Iterator<C10822Sampler.Value> it = collection.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    break;
                }
                C10822Sampler.Value next = it.next();
                if (next.read == value.read) {
                    next.MediaBrowserCompat$ItemReceiver++;
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(value);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver.clear();
        this.MediaDescriptionCompat.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        if (r10 < 4) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d4, code lost:
        if (r10 < 4) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        r14 = false;
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d9, code lost:
        r13 = false;
        r14 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p040o.C10823Script MediaBrowserCompat$ItemReceiver(p040o.rsnScriptIntrinsicCreate r17, p040o.createInvokeID r18, boolean r19) throws com.google.zxing.NotFoundException {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int[] r3 = r16.write()
            r4 = 0
            r5 = r4
        L_0x000c:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x0014
            r3[r5] = r4
            int r5 = r5 + 1
            goto L_0x000c
        L_0x0014:
            r5 = 1
            if (r2 == 0) goto L_0x001f
            int[] r1 = r1.IconCompatParcelizer
            r1 = r1[r4]
            write(r0, r1, r3)
            goto L_0x0039
        L_0x001f:
            int[] r1 = r1.IconCompatParcelizer
            r1 = r1[r5]
            int r1 = r1 + r5
            MediaBrowserCompat$ItemReceiver(r0, r1, r3)
            int r0 = r3.length
            int r0 = r0 - r5
            r1 = r4
        L_0x002a:
            if (r1 >= r0) goto L_0x0039
            r6 = r3[r1]
            r7 = r3[r0]
            r3[r1] = r7
            r3[r0] = r6
            int r1 = r1 + 1
            int r0 = r0 + -1
            goto L_0x002a
        L_0x0039:
            if (r2 == 0) goto L_0x003e
            r0 = 16
            goto L_0x0040
        L_0x003e:
            r0 = 15
        L_0x0040:
            int r1 = r3.length
            r6 = r4
            r7 = r6
        L_0x0043:
            if (r6 >= r1) goto L_0x004b
            r8 = r3[r6]
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x0043
        L_0x004b:
            float r1 = (float) r7
            float r6 = (float) r0
            float r1 = r1 / r6
            int[] r6 = r16.RatingCompat()
            int[] r7 = r16.IconCompatParcelizer()
            float[] r8 = r16.MediaMetadataCompat()
            float[] r9 = r16.read()
            r10 = r4
        L_0x005f:
            int r11 = r3.length
            if (r10 >= r11) goto L_0x0089
            r11 = r3[r10]
            float r11 = (float) r11
            float r11 = r11 / r1
            r12 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r11
            int r12 = (int) r12
            r13 = 8
            if (r12 > 0) goto L_0x0070
            r12 = r5
            goto L_0x0073
        L_0x0070:
            if (r12 <= r13) goto L_0x0073
            r12 = r13
        L_0x0073:
            int r13 = r10 / 2
            r14 = r10 & 1
            if (r14 != 0) goto L_0x0080
            r6[r13] = r12
            float r12 = (float) r12
            float r11 = r11 - r12
            r8[r13] = r11
            goto L_0x0086
        L_0x0080:
            r7[r13] = r12
            float r12 = (float) r12
            float r11 = r11 - r12
            r9[r13] = r11
        L_0x0086:
            int r10 = r10 + 1
            goto L_0x005f
        L_0x0089:
            int[] r1 = r16.RatingCompat()
            int r3 = r1.length
            r8 = r4
            r9 = r8
        L_0x0090:
            if (r8 >= r3) goto L_0x0098
            r10 = r1[r8]
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L_0x0090
        L_0x0098:
            int[] r1 = r16.IconCompatParcelizer()
            int r3 = r1.length
            r8 = r4
            r10 = r8
        L_0x009f:
            if (r8 >= r3) goto L_0x00a7
            r11 = r1[r8]
            int r10 = r10 + r11
            int r8 = r8 + 1
            goto L_0x009f
        L_0x00a7:
            r1 = 10
            r3 = 12
            r8 = 4
            if (r2 == 0) goto L_0x00c0
            if (r9 <= r3) goto L_0x00b3
            r11 = r4
            r12 = r5
            goto L_0x00ba
        L_0x00b3:
            if (r9 >= r8) goto L_0x00b8
            r12 = r4
            r11 = r5
            goto L_0x00ba
        L_0x00b8:
            r11 = r4
            r12 = r11
        L_0x00ba:
            if (r10 <= r3) goto L_0x00bd
            goto L_0x00d1
        L_0x00bd:
            if (r10 >= r8) goto L_0x00d9
            goto L_0x00d6
        L_0x00c0:
            r11 = 11
            if (r9 <= r11) goto L_0x00c7
            r11 = r4
            r12 = r5
            goto L_0x00cf
        L_0x00c7:
            r11 = 5
            if (r9 >= r11) goto L_0x00cd
            r12 = r4
            r11 = r5
            goto L_0x00cf
        L_0x00cd:
            r11 = r4
            r12 = r11
        L_0x00cf:
            if (r10 <= r1) goto L_0x00d4
        L_0x00d1:
            r13 = r4
            r14 = r5
            goto L_0x00db
        L_0x00d4:
            if (r10 >= r8) goto L_0x00d9
        L_0x00d6:
            r14 = r4
            r13 = r5
            goto L_0x00db
        L_0x00d9:
            r13 = r4
            r14 = r13
        L_0x00db:
            int r15 = r9 + r10
            int r15 = r15 - r0
            r0 = r9 & 1
            if (r0 != r2) goto L_0x00e4
            r0 = r5
            goto L_0x00e5
        L_0x00e4:
            r0 = r4
        L_0x00e5:
            r1 = r10 & 1
            if (r1 != r5) goto L_0x00eb
            r1 = r5
            goto L_0x00ec
        L_0x00eb:
            r1 = r4
        L_0x00ec:
            if (r15 != r5) goto L_0x0102
            if (r0 == 0) goto L_0x00f9
            if (r1 != 0) goto L_0x00f4
            r12 = r5
            goto L_0x012e
        L_0x00f4:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x00f9:
            if (r1 == 0) goto L_0x00fd
            r14 = r5
            goto L_0x012e
        L_0x00fd:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x0102:
            r4 = -1
            if (r15 != r4) goto L_0x0119
            if (r0 == 0) goto L_0x0110
            if (r1 != 0) goto L_0x010b
            r11 = r5
            goto L_0x012e
        L_0x010b:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x0110:
            if (r1 == 0) goto L_0x0114
            r13 = r5
            goto L_0x012e
        L_0x0114:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x0119:
            if (r15 != 0) goto L_0x0200
            if (r0 == 0) goto L_0x012c
            if (r1 == 0) goto L_0x0127
            if (r9 >= r10) goto L_0x0124
            r11 = r5
            r14 = r11
            goto L_0x012e
        L_0x0124:
            r12 = r5
            r13 = r12
            goto L_0x012e
        L_0x0127:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x012c:
            if (r1 != 0) goto L_0x01fb
        L_0x012e:
            if (r11 == 0) goto L_0x0143
            if (r12 != 0) goto L_0x013e
            int[] r0 = r16.RatingCompat()
            float[] r1 = r16.MediaMetadataCompat()
            MediaBrowserCompat$ItemReceiver(r0, r1)
            goto L_0x0143
        L_0x013e:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x0143:
            if (r12 == 0) goto L_0x0150
            int[] r0 = r16.RatingCompat()
            float[] r1 = r16.MediaMetadataCompat()
            read(r0, r1)
        L_0x0150:
            if (r13 == 0) goto L_0x0165
            if (r14 != 0) goto L_0x0160
            int[] r0 = r16.IconCompatParcelizer()
            float[] r1 = r16.MediaMetadataCompat()
            MediaBrowserCompat$ItemReceiver(r0, r1)
            goto L_0x0165
        L_0x0160:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x0165:
            if (r14 == 0) goto L_0x0172
            int[] r0 = r16.IconCompatParcelizer()
            float[] r1 = r16.read()
            read(r0, r1)
        L_0x0172:
            int r0 = r6.length
            int r0 = r0 - r5
            r1 = 0
            r4 = 0
        L_0x0176:
            if (r0 < 0) goto L_0x0183
            int r1 = r1 * 9
            r9 = r6[r0]
            int r1 = r1 + r9
            r9 = r6[r0]
            int r4 = r4 + r9
            int r0 = r0 + -1
            goto L_0x0176
        L_0x0183:
            int r0 = r7.length
            int r0 = r0 - r5
            r9 = 0
            r10 = 0
        L_0x0187:
            if (r0 < 0) goto L_0x0194
            int r9 = r9 * 9
            r11 = r7[r0]
            int r9 = r9 + r11
            r11 = r7[r0]
            int r10 = r10 + r11
            int r0 = r0 + -1
            goto L_0x0187
        L_0x0194:
            int r9 = r9 * 3
            int r1 = r1 + r9
            if (r2 == 0) goto L_0x01c9
            r0 = r4 & 1
            if (r0 != 0) goto L_0x01c4
            if (r4 > r3) goto L_0x01c4
            if (r4 < r8) goto L_0x01c4
            int r3 = r3 - r4
            int r3 = r3 / 2
            int[] r0 = MediaMetadataCompat
            r0 = r0[r3]
            r2 = 0
            int r2 = p040o.AlertController$RecycleListView.IconCompatParcelizer((int[]) r6, (int) r0, (boolean) r2)
            int r0 = 9 - r0
            int r0 = p040o.AlertController$RecycleListView.IconCompatParcelizer((int[]) r7, (int) r0, (boolean) r5)
            int[] r4 = MediaBrowserCompat$CustomActionResultReceiver
            r4 = r4[r3]
            int[] r5 = MediaBrowserCompat$MediaItem
            r3 = r5[r3]
            o.Script r5 = new o.Script
            int r2 = r2 * r4
            int r2 = r2 + r0
            int r2 = r2 + r3
            r5.<init>(r2, r1)
            return r5
        L_0x01c4:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x01c9:
            r0 = r10 & 1
            if (r0 != 0) goto L_0x01f6
            r0 = 10
            if (r10 > r0) goto L_0x01f6
            if (r10 < r8) goto L_0x01f6
            int r0 = r0 - r10
            int r0 = r0 / 2
            int[] r2 = MediaBrowserCompat$ItemReceiver
            r2 = r2[r0]
            int r3 = p040o.AlertController$RecycleListView.IconCompatParcelizer((int[]) r6, (int) r2, (boolean) r5)
            int r2 = 9 - r2
            r4 = 0
            int r2 = p040o.AlertController$RecycleListView.IconCompatParcelizer((int[]) r7, (int) r2, (boolean) r4)
            int[] r4 = read
            r4 = r4[r0]
            int[] r5 = IconCompatParcelizer
            r0 = r5[r0]
            o.Script r5 = new o.Script
            int r2 = r2 * r4
            int r2 = r2 + r3
            int r2 = r2 + r0
            r5.<init>(r2, r1)
            return r5
        L_0x01f6:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x01fb:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        L_0x0200:
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.MediaBrowserCompat$CustomActionResultReceiver()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.invoke.MediaBrowserCompat$ItemReceiver(o.rsnScriptIntrinsicCreate, o.createInvokeID, boolean):o.Script");
    }

    private C10822Sampler.Value MediaBrowserCompat$ItemReceiver(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, boolean z, int i, Map<rsnIncContextCreate, ?> map) {
        int i2;
        int i3;
        rsnScriptFieldIDCreate rsnscriptfieldidcreate;
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate2 = rsnscriptintrinsiccreate;
        boolean z2 = z;
        Map<rsnIncContextCreate, ?> map2 = map;
        try {
            int[] MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver2[0] = 0;
            MediaBrowserCompat$ItemReceiver2[1] = 0;
            MediaBrowserCompat$ItemReceiver2[2] = 0;
            MediaBrowserCompat$ItemReceiver2[3] = 0;
            int i4 = rsnscriptintrinsiccreate2.read;
            int i5 = 0;
            boolean z3 = false;
            while (i5 < i4) {
                z3 = !(((1 << (i5 & 31)) & rsnscriptintrinsiccreate2.write[i5 / 32]) != 0);
                if (z2 == z3) {
                    break;
                }
                i5++;
            }
            int i6 = 0;
            boolean z4 = z3;
            int i7 = i5;
            while (i5 < i4) {
                if (((rsnscriptintrinsiccreate2.write[i5 / 32] & (1 << (i5 & 31))) != 0) != z4) {
                    MediaBrowserCompat$ItemReceiver2[i6] = MediaBrowserCompat$ItemReceiver2[i6] + 1;
                    int i8 = i;
                } else {
                    if (i6 != 3) {
                        int i9 = i;
                        i6++;
                    } else if (IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2)) {
                        int[] iArr = {i7, i5};
                        int i10 = iArr[0];
                        boolean z5 = (rsnscriptintrinsiccreate2.write[i10 / 32] & (1 << (i10 & 31))) != 0;
                        int i11 = iArr[0] - 1;
                        while (i11 >= 0) {
                            if (z5 == (((1 << (i11 & 31)) & rsnscriptintrinsiccreate2.write[i11 / 32]) != 0)) {
                                break;
                            }
                            i11--;
                        }
                        int i12 = i11 + 1;
                        int i13 = iArr[0];
                        int[] MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver();
                        System.arraycopy(MediaBrowserCompat$ItemReceiver3, 0, MediaBrowserCompat$ItemReceiver3, 1, MediaBrowserCompat$ItemReceiver3.length - 1);
                        MediaBrowserCompat$ItemReceiver3[0] = i13 - i12;
                        int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver3, write);
                        int i14 = iArr[1];
                        if (z2) {
                            i3 = (rsnscriptintrinsiccreate2.read - 1) - i12;
                            i2 = (rsnscriptintrinsiccreate2.read - 1) - i14;
                        } else {
                            i2 = i14;
                            i3 = i12;
                        }
                        createInvokeID createinvokeid = new createInvokeID(MediaBrowserCompat$CustomActionResultReceiver2, new int[]{i12, iArr[1]}, i3, i2, i);
                        if (map2 == null) {
                            rsnscriptfieldidcreate = null;
                        } else {
                            rsnscriptfieldidcreate = (rsnScriptFieldIDCreate) map2.get(rsnIncContextCreate.NEED_RESULT_POINT_CALLBACK);
                        }
                        if (rsnscriptfieldidcreate != null) {
                            float f = ((float) (iArr[0] + iArr[1])) / 2.0f;
                            if (z2) {
                                f = ((float) (rsnscriptintrinsiccreate2.read - 1)) - f;
                            }
                            rsnscriptfieldidcreate.MediaBrowserCompat$CustomActionResultReceiver(new rsnScriptForEach(f, (float) i));
                        }
                        C10823Script MediaBrowserCompat$ItemReceiver4 = MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate2, createinvokeid, true);
                        C10823Script MediaBrowserCompat$ItemReceiver5 = MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate2, createinvokeid, false);
                        return new C10822Sampler.Value((MediaBrowserCompat$ItemReceiver4.read * 1597) + MediaBrowserCompat$ItemReceiver5.read, MediaBrowserCompat$ItemReceiver4.write + (MediaBrowserCompat$ItemReceiver5.write << 2), createinvokeid);
                    } else {
                        int i15 = i;
                        i7 += MediaBrowserCompat$ItemReceiver2[0] + MediaBrowserCompat$ItemReceiver2[1];
                        MediaBrowserCompat$ItemReceiver2[0] = MediaBrowserCompat$ItemReceiver2[2];
                        MediaBrowserCompat$ItemReceiver2[1] = MediaBrowserCompat$ItemReceiver2[3];
                        MediaBrowserCompat$ItemReceiver2[2] = 0;
                        MediaBrowserCompat$ItemReceiver2[3] = 0;
                        i6--;
                    }
                    MediaBrowserCompat$ItemReceiver2[i6] = 1;
                    z4 = !z4;
                }
                i5++;
            }
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        } catch (NotFoundException unused) {
            return null;
        }
    }
}
