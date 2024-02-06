package p040o;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.Map;
import p040o.PassportCaptureModule;

/* renamed from: o.setMinification */
public abstract class setMinification extends getMinification {
    static final int[][] IconCompatParcelizer;
    static final int[] MediaBrowserCompat$CustomActionResultReceiver = {1, 1, 1, 1, 1};
    static final int[] MediaDescriptionCompat = {1, 1, 1};
    public static final int[][] read;
    static final int[] write = {1, 1, 1, 1, 1, 1};
    private final StringBuilder MediaBrowserCompat$ItemReceiver = new StringBuilder(20);
    private final setMagnification MediaBrowserCompat$SearchResultReceiver = new setMagnification();
    private final PassportCaptureModule.C6975b.IconCompatParcelizer RatingCompat = new PassportCaptureModule.C6975b.IconCompatParcelizer();

    /* access modifiers changed from: package-private */
    public abstract rsnIncAllocationCreateTyped IconCompatParcelizer();

    /* access modifiers changed from: protected */
    public abstract int read(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int[] iArr, StringBuilder sb) throws NotFoundException;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        IconCompatParcelizer = iArr;
        int[][] iArr2 = new int[20][];
        read = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = IconCompatParcelizer[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            read[i] = iArr4;
        }
    }

    protected setMinification() {
    }

    static int[] MediaBrowserCompat$ItemReceiver(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate) throws NotFoundException {
        int[] iArr = new int[MediaDescriptionCompat.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            Arrays.fill(iArr, 0, MediaDescriptionCompat.length, 0);
            iArr2 = MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate, i, false, MediaDescriptionCompat, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = rsnscriptintrinsiccreate.IconCompatParcelizer(i4, i2);
            }
            i = i3;
        }
        return iArr2;
    }

    public getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, Map<rsnIncContextCreate, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return MediaBrowserCompat$CustomActionResultReceiver(i, rsnscriptintrinsiccreate, MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate), map);
    }

    public getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int[] iArr, Map<rsnIncContextCreate, ?> map) throws NotFoundException, ChecksumException, FormatException {
        rsnScriptFieldIDCreate rsnscriptfieldidcreate;
        int i2;
        String read2;
        int[] iArr2 = null;
        if (map == null) {
            rsnscriptfieldidcreate = null;
        } else {
            rsnscriptfieldidcreate = (rsnScriptFieldIDCreate) map.get(rsnIncContextCreate.NEED_RESULT_POINT_CALLBACK);
        }
        boolean z = true;
        if (rsnscriptfieldidcreate != null) {
            rsnscriptfieldidcreate.MediaBrowserCompat$CustomActionResultReceiver(new rsnScriptForEach(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.MediaBrowserCompat$ItemReceiver;
        sb.setLength(0);
        int read3 = read(rsnscriptintrinsiccreate, iArr, sb);
        if (rsnscriptfieldidcreate != null) {
            rsnscriptfieldidcreate.MediaBrowserCompat$CustomActionResultReceiver(new rsnScriptForEach((float) read3, (float) i));
        }
        int[] write2 = write(rsnscriptintrinsiccreate, read3);
        if (rsnscriptfieldidcreate != null) {
            rsnscriptfieldidcreate.MediaBrowserCompat$CustomActionResultReceiver(new rsnScriptForEach(((float) (write2[0] + write2[1])) / 2.0f, (float) i));
        }
        int i3 = write2[1];
        int i4 = (i3 - write2[0]) + i3;
        if (i4 >= rsnscriptintrinsiccreate.read || !rsnscriptintrinsiccreate.IconCompatParcelizer(i3, i4)) {
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
        String obj = sb.toString();
        if (obj.length() < 8) {
            throw FormatException.read();
        } else if (MediaBrowserCompat$ItemReceiver(obj)) {
            rsnIncAllocationCreateTyped IconCompatParcelizer2 = IconCompatParcelizer();
            float f = (float) i;
            getLayers$MediaBrowserCompat$CustomActionResultReceiver getlayers_mediabrowsercompat_customactionresultreceiver = new getLayers$MediaBrowserCompat$CustomActionResultReceiver(obj, (byte[]) null, new rsnScriptForEach[]{new rsnScriptForEach(((float) (iArr[1] + iArr[0])) / 2.0f, f), new rsnScriptForEach(((float) (write2[1] + write2[0])) / 2.0f, f)}, IconCompatParcelizer2);
            try {
                getLayers$MediaBrowserCompat$CustomActionResultReceiver write3 = this.MediaBrowserCompat$SearchResultReceiver.write(i, rsnscriptintrinsiccreate, write2[1]);
                getlayers_mediabrowsercompat_customactionresultreceiver.read(rsnInvokeClosureCreate.UPC_EAN_EXTENSION, write3.IconCompatParcelizer);
                Map<rsnInvokeClosureCreate, Object> map2 = write3.read;
                if (map2 != null) {
                    Map<rsnInvokeClosureCreate, Object> map3 = getlayers_mediabrowsercompat_customactionresultreceiver.read;
                    if (map3 == null) {
                        getlayers_mediabrowsercompat_customactionresultreceiver.read = map2;
                    } else {
                        map3.putAll(map2);
                    }
                }
                rsnScriptForEach[] rsnscriptforeachArr = write3.MediaBrowserCompat$ItemReceiver;
                rsnScriptForEach[] rsnscriptforeachArr2 = getlayers_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
                if (rsnscriptforeachArr2 == null) {
                    getlayers_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = rsnscriptforeachArr;
                } else if (rsnscriptforeachArr != null && rsnscriptforeachArr.length > 0) {
                    rsnScriptForEach[] rsnscriptforeachArr3 = new rsnScriptForEach[(rsnscriptforeachArr2.length + rsnscriptforeachArr.length)];
                    System.arraycopy(rsnscriptforeachArr2, 0, rsnscriptforeachArr3, 0, rsnscriptforeachArr2.length);
                    System.arraycopy(rsnscriptforeachArr, 0, rsnscriptforeachArr3, rsnscriptforeachArr2.length, rsnscriptforeachArr.length);
                    getlayers_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = rsnscriptforeachArr3;
                }
                i2 = write3.IconCompatParcelizer.length();
            } catch (ReaderException unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(rsnIncContextCreate.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
            if ((IconCompatParcelizer2 == rsnIncAllocationCreateTyped.EAN_13 || IconCompatParcelizer2 == rsnIncAllocationCreateTyped.UPC_A) && (read2 = this.RatingCompat.read(obj)) != null) {
                getlayers_mediabrowsercompat_customactionresultreceiver.read(rsnInvokeClosureCreate.POSSIBLE_COUNTRY, read2);
            }
            return getlayers_mediabrowsercompat_customactionresultreceiver;
        } else {
            throw ChecksumException.write();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean MediaBrowserCompat$ItemReceiver(String str) throws FormatException {
        return MediaBrowserCompat$ItemReceiver((CharSequence) str);
    }

    static boolean MediaBrowserCompat$ItemReceiver(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        if (MediaBrowserCompat$CustomActionResultReceiver(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10)) {
            return true;
        }
        return false;
    }

    static int MediaBrowserCompat$CustomActionResultReceiver(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.read();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.read();
            }
            i3 += charAt2;
        }
        return (1000 - i3) % 10;
    }

    /* access modifiers changed from: package-private */
    public int[] write(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i) throws NotFoundException {
        int[] iArr = MediaDescriptionCompat;
        return MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate, i, false, iArr, new int[iArr.length]);
    }

    static int[] write(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i, boolean z, int[] iArr) throws NotFoundException {
        return MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate, i, z, iArr, new int[iArr.length]);
    }

    public static int IconCompatParcelizer(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int[] iArr, int i, int[][] iArr2) throws NotFoundException {
        MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float IconCompatParcelizer2 = IconCompatParcelizer(iArr, iArr2[i3], 0.7f);
            if (IconCompatParcelizer2 < f) {
                i2 = i3;
                f = IconCompatParcelizer2;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    private static int[] MediaBrowserCompat$ItemReceiver(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i, boolean z, int[] iArr, int[] iArr2) throws NotFoundException {
        int i2 = rsnscriptintrinsiccreate.read;
        int write2 = z ? rsnscriptintrinsiccreate.write(i) : rsnscriptintrinsiccreate.read(i);
        int length = iArr.length;
        boolean z2 = z;
        int i3 = 0;
        int i4 = write2;
        while (write2 < i2) {
            if ((((1 << (write2 & 31)) & rsnscriptintrinsiccreate.write[write2 / 32]) != 0) != z2) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (IconCompatParcelizer(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i4, write2};
                } else {
                    i4 += iArr2[0] + iArr2[1];
                    int i5 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z2 = !z2;
            }
            write2++;
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
