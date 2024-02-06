package p040o;

import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: o.CLAMP_NEAREST */
public final class CLAMP_NEAREST extends getWrapS {
    public final rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException {
        if (rsnincallocationcreatetyped == rsnIncAllocationCreateTyped.CODE_93) {
            return super.write(str, rsnincallocationcreatetyped, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode CODE_93, but got ");
        sb.append(rsnincallocationcreatetyped);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean[] MediaBrowserCompat$ItemReceiver(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int length2 = str.length();
            write(MIRRORED_REPEAT_LINEAR.read[47], iArr);
            boolean[] zArr = new boolean[(((length2 + 2 + 2) * 9) + 1)];
            int MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(zArr, 0, iArr);
            for (int i = 0; i < length; i++) {
                write(MIRRORED_REPEAT_LINEAR.read["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], iArr);
                MediaBrowserCompat$ItemReceiver += MediaBrowserCompat$ItemReceiver(zArr, MediaBrowserCompat$ItemReceiver, iArr);
            }
            int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(str, 20);
            write(MIRRORED_REPEAT_LINEAR.read[MediaBrowserCompat$ItemReceiver2], iArr);
            int MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver + MediaBrowserCompat$ItemReceiver(zArr, MediaBrowserCompat$ItemReceiver, iArr);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(MediaBrowserCompat$ItemReceiver2));
            write(MIRRORED_REPEAT_LINEAR.read[MediaBrowserCompat$ItemReceiver(sb.toString(), 15)], iArr);
            int MediaBrowserCompat$ItemReceiver4 = MediaBrowserCompat$ItemReceiver3 + MediaBrowserCompat$ItemReceiver(zArr, MediaBrowserCompat$ItemReceiver3, iArr);
            write(MIRRORED_REPEAT_LINEAR.read[47], iArr);
            MediaBrowserCompat$ItemReceiver(zArr, MediaBrowserCompat$ItemReceiver4, iArr);
            zArr[MediaBrowserCompat$ItemReceiver4 + 9] = true;
            return zArr;
        }
        StringBuilder sb2 = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static void write(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    private static int MediaBrowserCompat$ItemReceiver(boolean[] zArr, int i, int[] iArr) {
        int i2 = 0;
        while (i2 < 9) {
            zArr[i] = iArr[i2] != 0;
            i2++;
            i++;
        }
        return 9;
    }

    private static int MediaBrowserCompat$ItemReceiver(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }
}
