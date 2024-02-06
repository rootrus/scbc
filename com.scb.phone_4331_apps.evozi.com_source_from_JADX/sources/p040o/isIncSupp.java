package p040o;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.math.Primes;
import org.jmrtd.cbeff.ISO781611;
import p040o.C10823Script;
import p040o.hash;

/* renamed from: o.isIncSupp */
public final class isIncSupp extends bindAllocation {
    private static final int[][] IconCompatParcelizer = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    private static final int[][] MediaBrowserCompat$CustomActionResultReceiver = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[] MediaBrowserCompat$ItemReceiver = {0, 348, 1388, 2948, 3988};
    private static final int[][] MediaDescriptionCompat = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256, 118, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 7, 21, 63}, new int[]{CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 13, 39, 117, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, 209, 205}, new int[]{CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, 49, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 19, 57, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 91}, new int[]{62, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 136, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384, 85, 44, 132}, new int[]{CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 97, 80, 29, 87, 50}, new int[]{CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA, 28, 84, 41, EACTags.SECURITY_ENVIRONMENT_TEMPLATE, 158, 52, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256}, new int[]{46, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 203, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 206, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256}, new int[]{76, 17, 51, 153, 37, 111, 122, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA}, new int[]{43, 129, CipherSuite.TLS_PSK_WITH_NULL_SHA256, 106, 107, 110, 119, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA}, new int[]{16, 48, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, 10, 30, 90, 59, CipherSuite.TLS_PSK_WITH_NULL_SHA384}, new int[]{109, 116, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256, 112, 125, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256}, new int[]{70, 210, 208, 202, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, ISO781611.BIOMETRIC_SUBTYPE_TAG, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 115}, new int[]{134, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 151, 31, 93, 68, 204, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256}, new int[]{CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, 22, 66, 198, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 94, 71, 2}, new int[]{6, 18, 54, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, 64, 192, CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA, 40}, new int[]{120, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, 25, 75, 14, 42, 126, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384}, new int[]{79, 26, 78, 23, 69, 207, 199, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384}, new int[]{103, 98, 83, 38, 114, 131, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE}, new int[]{CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, 61, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384, 127, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 88, 53, CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384}, new int[]{55, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 160, 58, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 100, 89}};
    private static final int[] read = {7, 5, 4, 3, 1};
    private static final int[] write = {4, 20, 52, 104, 204};
    private final List<forEach> MediaBrowserCompat$MediaItem = new ArrayList(11);
    private final List<getDummyAlloc> MediaBrowserCompat$SearchResultReceiver = new ArrayList();
    private final int[] MediaMetadataCompat = new int[2];
    private boolean RatingCompat;

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, Map<rsnIncContextCreate, ?> map) throws NotFoundException, FormatException {
        this.MediaBrowserCompat$MediaItem.clear();
        this.RatingCompat = false;
        try {
            return read(read(i, rsnscriptintrinsiccreate));
        } catch (NotFoundException unused) {
            this.MediaBrowserCompat$MediaItem.clear();
            this.RatingCompat = true;
            return read(read(i, rsnscriptintrinsiccreate));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$MediaItem.clear();
        this.MediaBrowserCompat$SearchResultReceiver.clear();
    }

    private List<forEach> read(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) throws NotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        while (true) {
            try {
                this.MediaBrowserCompat$MediaItem.add(write(rsnscriptintrinsiccreate, this.MediaBrowserCompat$MediaItem, i));
            } catch (NotFoundException e) {
                if (this.MediaBrowserCompat$MediaItem.isEmpty()) {
                    throw e;
                } else if (MediaBrowserCompat$SearchResultReceiver()) {
                    return this.MediaBrowserCompat$MediaItem;
                } else {
                    boolean isEmpty = this.MediaBrowserCompat$SearchResultReceiver.isEmpty();
                    int i2 = 0;
                    boolean z7 = false;
                    while (true) {
                        if (i2 >= this.MediaBrowserCompat$SearchResultReceiver.size()) {
                            z = false;
                            break;
                        }
                        getDummyAlloc getdummyalloc = this.MediaBrowserCompat$SearchResultReceiver.get(i2);
                        if (getdummyalloc.MediaBrowserCompat$CustomActionResultReceiver > i) {
                            z = getdummyalloc.write.equals(this.MediaBrowserCompat$MediaItem);
                            break;
                        }
                        z7 = getdummyalloc.write.equals(this.MediaBrowserCompat$MediaItem);
                        i2++;
                    }
                    if (!z && !z7) {
                        List<forEach> list = this.MediaBrowserCompat$MediaItem;
                        Iterator<T> it = this.MediaBrowserCompat$SearchResultReceiver.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            getDummyAlloc getdummyalloc2 = (getDummyAlloc) it.next();
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z5 = true;
                                    continue;
                                    break;
                                }
                                forEach foreach = (forEach) it2.next();
                                Iterator<forEach> it3 = getdummyalloc2.write.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (foreach.equals(it3.next())) {
                                            z6 = true;
                                            continue;
                                            break;
                                        }
                                    } else {
                                        z6 = false;
                                        continue;
                                        break;
                                    }
                                }
                                if (!z6) {
                                    z5 = false;
                                    continue;
                                    break;
                                }
                            }
                            if (z5) {
                                z2 = true;
                                break;
                            }
                        }
                        if (!z2) {
                            this.MediaBrowserCompat$SearchResultReceiver.add(i2, new getDummyAlloc(this.MediaBrowserCompat$MediaItem, i, false));
                            List<forEach> list2 = this.MediaBrowserCompat$MediaItem;
                            Iterator<getDummyAlloc> it4 = this.MediaBrowserCompat$SearchResultReceiver.iterator();
                            while (it4.hasNext()) {
                                getDummyAlloc next = it4.next();
                                if (next.write.size() != list2.size()) {
                                    Iterator<forEach> it5 = next.write.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            z3 = true;
                                            break;
                                        }
                                        forEach next2 = it5.next();
                                        Iterator<forEach> it6 = list2.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                if (next2.equals(it6.next())) {
                                                    z4 = true;
                                                    continue;
                                                    break;
                                                }
                                            } else {
                                                z4 = false;
                                                continue;
                                                break;
                                            }
                                        }
                                        if (!z4) {
                                            z3 = false;
                                            break;
                                        }
                                    }
                                    if (z3) {
                                        it4.remove();
                                    }
                                }
                            }
                        }
                    }
                    if (!isEmpty) {
                        List<forEach> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(false);
                        if (MediaBrowserCompat$ItemReceiver2 != null) {
                            return MediaBrowserCompat$ItemReceiver2;
                        }
                        List<forEach> MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(true);
                        if (MediaBrowserCompat$ItemReceiver3 != null) {
                            return MediaBrowserCompat$ItemReceiver3;
                        }
                    }
                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
        }
    }

    private List<forEach> MediaBrowserCompat$ItemReceiver(boolean z) {
        List<forEach> list = null;
        if (this.MediaBrowserCompat$SearchResultReceiver.size() > 25) {
            this.MediaBrowserCompat$SearchResultReceiver.clear();
            return null;
        }
        this.MediaBrowserCompat$MediaItem.clear();
        if (z) {
            Collections.reverse(this.MediaBrowserCompat$SearchResultReceiver);
        }
        try {
            list = MediaBrowserCompat$CustomActionResultReceiver(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.MediaBrowserCompat$SearchResultReceiver);
        }
        return list;
    }

    private List<forEach> MediaBrowserCompat$CustomActionResultReceiver(List<getDummyAlloc> list, int i) throws NotFoundException {
        boolean z;
        while (i < this.MediaBrowserCompat$SearchResultReceiver.size()) {
            getDummyAlloc getdummyalloc = this.MediaBrowserCompat$SearchResultReceiver.get(i);
            this.MediaBrowserCompat$MediaItem.clear();
            for (getDummyAlloc getdummyalloc2 : list) {
                this.MediaBrowserCompat$MediaItem.addAll(getdummyalloc2.write);
            }
            this.MediaBrowserCompat$MediaItem.addAll(getdummyalloc.write);
            List<forEach> list2 = this.MediaBrowserCompat$MediaItem;
            int[][] iArr = IconCompatParcelizer;
            int length = iArr.length;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                int[] iArr2 = iArr[i2];
                if (list2.size() <= iArr2.length) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= list2.size()) {
                            z = true;
                            break;
                        } else if (list2.get(i3).IconCompatParcelizer.write != iArr2[i3]) {
                            z = false;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
                i2++;
            }
            if (!z2) {
                i++;
            } else if (MediaBrowserCompat$SearchResultReceiver()) {
                return this.MediaBrowserCompat$MediaItem;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(getdummyalloc);
                try {
                    return MediaBrowserCompat$CustomActionResultReceiver(arrayList, i + 1);
                } catch (NotFoundException unused) {
                }
            }
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private boolean MediaBrowserCompat$SearchResultReceiver() {
        forEach foreach = this.MediaBrowserCompat$MediaItem.get(0);
        C10823Script script = foreach.write;
        C10823Script script2 = foreach.MediaBrowserCompat$ItemReceiver;
        if (script2 == null) {
            return false;
        }
        int i = script2.write;
        int i2 = 2;
        for (int i3 = 1; i3 < this.MediaBrowserCompat$MediaItem.size(); i3++) {
            forEach foreach2 = this.MediaBrowserCompat$MediaItem.get(i3);
            i += foreach2.write.write;
            i2++;
            C10823Script script3 = foreach2.MediaBrowserCompat$ItemReceiver;
            if (script3 != null) {
                i += script3.write;
                i2++;
            }
        }
        if (((i2 - 4) * Primes.SMALL_FACTOR_LIMIT) + (i % Primes.SMALL_FACTOR_LIMIT) == script.read) {
            return true;
        }
        return false;
    }

    private forEach write(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, List<forEach> list, int i) throws NotFoundException {
        int i2;
        C10823Script script;
        int i3;
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate2 = rsnscriptintrinsiccreate;
        List<forEach> list2 = list;
        int i4 = 2;
        int i5 = 0;
        boolean z = true;
        boolean z2 = list.size() % 2 == 0;
        if (this.RatingCompat) {
            z2 = !z2;
        }
        int i6 = -1;
        boolean z3 = true;
        while (true) {
            int[] MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver2[i5] = i5;
            MediaBrowserCompat$ItemReceiver2[1] = i5;
            MediaBrowserCompat$ItemReceiver2[i4] = i5;
            MediaBrowserCompat$ItemReceiver2[3] = i5;
            int i7 = rsnscriptintrinsiccreate2.read;
            if (i6 < 0) {
                i2 = list.isEmpty() ? i5 : list2.get(list.size() - 1).IconCompatParcelizer.IconCompatParcelizer[1];
            } else {
                i2 = i6;
            }
            int i8 = list.size() % i4 != 0 ? 1 : i5;
            if (this.RatingCompat) {
                i8 ^= 1;
            }
            int i9 = i5;
            while (i2 < i7) {
                i9 = (((1 << (i2 & 31)) & rsnscriptintrinsiccreate2.write[i2 / 32]) != 0 ? 1 : i5) ^ 1;
                if (i9 == 0) {
                    break;
                }
                i2++;
            }
            int i10 = i5;
            int i11 = i9;
            int i12 = i2;
            while (i2 < i7) {
                if ((((1 << (i2 & 31)) & rsnscriptintrinsiccreate2.write[i2 / 32]) != 0 ? 1 : 0) != i11) {
                    MediaBrowserCompat$ItemReceiver2[i10] = MediaBrowserCompat$ItemReceiver2[i10] + 1;
                } else {
                    if (i10 == 3) {
                        if (i8 != 0) {
                            MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
                        }
                        if (IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2)) {
                            int[] iArr = this.MediaMetadataCompat;
                            iArr[0] = i12;
                            iArr[1] = i2;
                            createInvokeID MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate2, i, z2);
                            if (MediaBrowserCompat$ItemReceiver3 == null) {
                                int i13 = this.MediaMetadataCompat[0];
                                if (((1 << (i13 & 31)) & rsnscriptintrinsiccreate2.write[i13 / 32]) != 0) {
                                    i3 = rsnscriptintrinsiccreate2.read(rsnscriptintrinsiccreate2.write(i13));
                                } else {
                                    i3 = rsnscriptintrinsiccreate2.write(rsnscriptintrinsiccreate2.read(i13));
                                }
                                i6 = i3;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                C10823Script write2 = write(rsnscriptintrinsiccreate2, MediaBrowserCompat$ItemReceiver3, z2, true);
                                if (!list.isEmpty()) {
                                    if (list2.get(list.size() - 1).MediaBrowserCompat$ItemReceiver != null) {
                                        z = false;
                                    }
                                    if (z) {
                                        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                                    }
                                }
                                try {
                                    script = write(rsnscriptintrinsiccreate2, MediaBrowserCompat$ItemReceiver3, z2, false);
                                } catch (NotFoundException unused) {
                                    script = null;
                                }
                                return new forEach(write2, script, MediaBrowserCompat$ItemReceiver3);
                            }
                            i4 = 2;
                            i5 = 0;
                        } else {
                            if (i8 != 0) {
                                MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
                            }
                            i12 += MediaBrowserCompat$ItemReceiver2[0] + MediaBrowserCompat$ItemReceiver2[1];
                            MediaBrowserCompat$ItemReceiver2[0] = MediaBrowserCompat$ItemReceiver2[2];
                            MediaBrowserCompat$ItemReceiver2[1] = MediaBrowserCompat$ItemReceiver2[3];
                            MediaBrowserCompat$ItemReceiver2[2] = 0;
                            MediaBrowserCompat$ItemReceiver2[3] = 0;
                            i10--;
                        }
                    } else {
                        i10++;
                    }
                    MediaBrowserCompat$ItemReceiver2[i10] = 1;
                    i11 ^= 1;
                }
                i2++;
            }
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    private static void MediaBrowserCompat$ItemReceiver(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    private createInvokeID MediaBrowserCompat$ItemReceiver(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.MediaMetadataCompat[0] - 1;
            while (i5 >= 0) {
                if (((1 << (i5 & 31)) & rsnscriptintrinsiccreate.write[i5 / 32]) != 0) {
                    break;
                }
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.MediaMetadataCompat;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.MediaMetadataCompat;
            int i7 = iArr2[0];
            int write2 = rsnscriptintrinsiccreate.write(iArr2[1] + 1);
            i2 = write2;
            i3 = i7;
            i4 = write2 - this.MediaMetadataCompat[1];
        }
        int[] MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        System.arraycopy(MediaBrowserCompat$ItemReceiver2, 0, MediaBrowserCompat$ItemReceiver2, 1, MediaBrowserCompat$ItemReceiver2.length - 1);
        MediaBrowserCompat$ItemReceiver2[0] = i4;
        try {
            return new createInvokeID(MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$CustomActionResultReceiver), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private C10823Script write(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, createInvokeID createinvokeid, boolean z, boolean z2) throws NotFoundException {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate2 = rsnscriptintrinsiccreate;
        createInvokeID createinvokeid2 = createinvokeid;
        int[] write2 = write();
        for (int i = 0; i < write2.length; i++) {
            write2[i] = 0;
        }
        if (z2) {
            write(rsnscriptintrinsiccreate2, createinvokeid2.IconCompatParcelizer[0], write2);
        } else {
            MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate2, createinvokeid2.IconCompatParcelizer[1], write2);
            int i2 = 0;
            for (int length = write2.length - 1; i2 < length; length--) {
                int i3 = write2[i2];
                write2[i2] = write2[length];
                write2[length] = i3;
                i2++;
            }
        }
        int i4 = 0;
        for (int i5 : write2) {
            i4 += i5;
        }
        float f = ((float) i4) / 17.0f;
        float f2 = ((float) (createinvokeid2.IconCompatParcelizer[1] - createinvokeid2.IconCompatParcelizer[0])) / 15.0f;
        if (Math.abs(f - f2) / f2 <= 0.3f) {
            int[] RatingCompat2 = RatingCompat();
            int[] IconCompatParcelizer2 = IconCompatParcelizer();
            float[] MediaMetadataCompat2 = MediaMetadataCompat();
            float[] read2 = read();
            for (int i6 = 0; i6 < write2.length; i6++) {
                float f3 = ((float) write2[i6]) / f;
                int i7 = (int) (0.5f + f3);
                if (i7 <= 0) {
                    if (f3 >= 0.3f) {
                        i7 = 1;
                    } else {
                        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                } else if (i7 > 8) {
                    if (f3 <= 8.7f) {
                        i7 = 8;
                    } else {
                        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                }
                int i8 = i6 / 2;
                if ((i6 & 1) == 0) {
                    RatingCompat2[i8] = i7;
                    MediaMetadataCompat2[i8] = f3 - ((float) i7);
                } else {
                    IconCompatParcelizer2[i8] = i7;
                    read2[i8] = f3 - ((float) i7);
                }
            }
            int i9 = 0;
            for (int i10 : RatingCompat()) {
                i9 += i10;
            }
            int i11 = 0;
            for (int i12 : IconCompatParcelizer()) {
                i11 += i12;
            }
            if (i9 > 13) {
                z3 = false;
                z4 = true;
            } else {
                z4 = false;
                z3 = i9 < 4;
            }
            if (i11 > 13) {
                z6 = false;
                z5 = true;
            } else if (i11 < 4) {
                z5 = false;
                z6 = true;
            } else {
                z6 = false;
                z5 = false;
            }
            int i13 = (i9 + i11) - 17;
            boolean z7 = (i9 & 1) == 1;
            boolean z8 = (i11 & 1) == 0;
            if (i13 == 1) {
                if (z7) {
                    if (!z8) {
                        z4 = true;
                    } else {
                        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                } else if (z8) {
                    z5 = true;
                } else {
                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                }
            } else if (i13 == -1) {
                if (z7) {
                    if (!z8) {
                        z3 = true;
                    } else {
                        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                } else if (z8) {
                    z6 = true;
                } else {
                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                }
            } else if (i13 != 0) {
                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
            } else if (z7) {
                if (!z8) {
                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                } else if (i9 < i11) {
                    z3 = true;
                    z5 = true;
                } else {
                    z4 = true;
                    z6 = true;
                }
            } else if (z8) {
                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (z3) {
                if (!z4) {
                    MediaBrowserCompat$ItemReceiver(RatingCompat(), MediaMetadataCompat());
                } else {
                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
            if (z4) {
                read(RatingCompat(), MediaMetadataCompat());
            }
            if (z6) {
                if (!z5) {
                    MediaBrowserCompat$ItemReceiver(IconCompatParcelizer(), MediaMetadataCompat());
                } else {
                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
            if (z5) {
                read(IconCompatParcelizer(), read());
            }
            int i14 = (((createinvokeid2.write << 2) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i15 = 0;
            int i16 = 0;
            for (int length2 = RatingCompat2.length - 1; length2 >= 0; length2--) {
                if (createinvokeid2.write != 0 || !z || !z2) {
                    i15 += RatingCompat2[length2] * MediaDescriptionCompat[i14][length2 << 1];
                }
                i16 += RatingCompat2[length2];
            }
            int i17 = 0;
            for (int length3 = IconCompatParcelizer2.length - 1; length3 >= 0; length3--) {
                if (createinvokeid2.write != 0 || !z || !z2) {
                    i17 += IconCompatParcelizer2[length3] * MediaDescriptionCompat[i14][(length3 << 1) + 1];
                }
            }
            if ((i16 & 1) != 0 || i16 > 13 || i16 < 4) {
                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
            }
            int i18 = (13 - i16) / 2;
            int i19 = read[i18];
            return new C10823Script((AlertController$RecycleListView.IconCompatParcelizer(RatingCompat2, i19, true) * write[i18]) + AlertController$RecycleListView.IconCompatParcelizer(IconCompatParcelizer2, 9 - i19, false) + MediaBrowserCompat$ItemReceiver[i18], i15 + i17);
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private static getLayers$MediaBrowserCompat$CustomActionResultReceiver read(List<forEach> list) throws NotFoundException, FormatException {
        init init;
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).MediaBrowserCompat$ItemReceiver == null) {
            size--;
        }
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate = new rsnScriptIntrinsicCreate(size * 12);
        int i = list.get(0).MediaBrowserCompat$ItemReceiver.read;
        int i2 = 0;
        for (int i3 = 11; i3 >= 0; i3--) {
            if (((1 << i3) & i) != 0) {
                int[] iArr = rsnscriptintrinsiccreate.write;
                int i4 = i2 / 32;
                iArr[i4] = (1 << (i2 & 31)) | iArr[i4];
            }
            i2++;
        }
        for (int i5 = 1; i5 < list.size(); i5++) {
            forEach foreach = list.get(i5);
            int i6 = foreach.write.read;
            for (int i7 = 11; i7 >= 0; i7--) {
                if (((1 << i7) & i6) != 0) {
                    int[] iArr2 = rsnscriptintrinsiccreate.write;
                    int i8 = i2 / 32;
                    iArr2[i8] = (1 << (i2 & 31)) | iArr2[i8];
                }
                i2++;
            }
            if (foreach.MediaBrowserCompat$ItemReceiver != null) {
                int i9 = foreach.MediaBrowserCompat$ItemReceiver.read;
                for (int i10 = 11; i10 >= 0; i10--) {
                    if (((1 << i10) & i9) != 0) {
                        int[] iArr3 = rsnscriptintrinsiccreate.write;
                        int i11 = i2 / 32;
                        iArr3[i11] = (1 << (i2 & 31)) | iArr3[i11];
                    }
                    i2++;
                }
            }
        }
        if ((rsnscriptintrinsiccreate.write[0] & 2) != 0) {
            init = new updateAllocation(rsnscriptintrinsiccreate);
        } else {
            if (!((rsnscriptintrinsiccreate.write[0] & 4) != 0)) {
                init = new getAllocation(rsnscriptintrinsiccreate);
            } else {
                int MediaBrowserCompat$CustomActionResultReceiver2 = hash.write.MediaBrowserCompat$CustomActionResultReceiver(rsnscriptintrinsiccreate, 1, 4);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == 4) {
                    init = new createKernelID(rsnscriptintrinsiccreate);
                } else if (MediaBrowserCompat$CustomActionResultReceiver2 != 5) {
                    int MediaBrowserCompat$CustomActionResultReceiver3 = hash.write.MediaBrowserCompat$CustomActionResultReceiver(rsnscriptintrinsiccreate, 1, 5);
                    if (MediaBrowserCompat$CustomActionResultReceiver3 == 12) {
                        init = new setTimeZone(rsnscriptintrinsiccreate);
                    } else if (MediaBrowserCompat$CustomActionResultReceiver3 != 13) {
                        switch (hash.write.MediaBrowserCompat$CustomActionResultReceiver(rsnscriptintrinsiccreate, 1, 7)) {
                            case 56:
                                init = new setIncSupp(rsnscriptintrinsiccreate, "310", "11");
                                break;
                            case 57:
                                init = new setIncSupp(rsnscriptintrinsiccreate, "320", "11");
                                break;
                            case 58:
                                init = new setIncSupp(rsnscriptintrinsiccreate, "310", "13");
                                break;
                            case 59:
                                init = new setIncSupp(rsnscriptintrinsiccreate, "320", "13");
                                break;
                            case 60:
                                init = new setIncSupp(rsnscriptintrinsiccreate, "310", "15");
                                break;
                            case 61:
                                init = new setIncSupp(rsnscriptintrinsiccreate, "320", "15");
                                break;
                            case 62:
                                init = new setIncSupp(rsnscriptintrinsiccreate, "310", "17");
                                break;
                            case 63:
                                init = new setIncSupp(rsnscriptintrinsiccreate, "320", "17");
                                break;
                            default:
                                StringBuilder sb = new StringBuilder("unknown decoder: ");
                                sb.append(rsnscriptintrinsiccreate);
                                throw new IllegalStateException(sb.toString());
                        }
                    } else {
                        init = new C10823Script.Builder(rsnscriptintrinsiccreate);
                    }
                } else {
                    init = new reduce(rsnscriptintrinsiccreate);
                }
            }
        }
        String write2 = init.write();
        rsnScriptForEach[] rsnscriptforeachArr = list.get(0).IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        rsnScriptForEach[] rsnscriptforeachArr2 = list.get(list.size() - 1).IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        return new getLayers$MediaBrowserCompat$CustomActionResultReceiver(write2, (byte[]) null, new rsnScriptForEach[]{rsnscriptforeachArr[0], rsnscriptforeachArr[1], rsnscriptforeachArr2[0], rsnscriptforeachArr2[1]}, rsnIncAllocationCreateTyped.RSS_EXPANDED);
    }
}
