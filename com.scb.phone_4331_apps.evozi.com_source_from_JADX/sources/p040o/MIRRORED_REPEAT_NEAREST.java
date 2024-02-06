package p040o;

import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: o.MIRRORED_REPEAT_NEAREST */
public final class MIRRORED_REPEAT_NEAREST extends getWrapS {
    private static final int[] IconCompatParcelizer = {1, 1, 1, 1};
    private static final int[] MediaBrowserCompat$ItemReceiver = {3, 1, 1};
    private static final int[][] read = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    public final rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException {
        if (rsnincallocationcreatetyped == rsnIncAllocationCreateTyped.ITF) {
            return super.write(str, rsnincallocationcreatetyped, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode ITF, but got ");
        sb.append(rsnincallocationcreatetyped);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean[] MediaBrowserCompat$ItemReceiver(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        } else if (length <= 80) {
            boolean[] zArr = new boolean[((length * 9) + 9)];
            int read2 = read(zArr, 0, IconCompatParcelizer, true);
            for (int i = 0; i < length; i += 2) {
                int digit = Character.digit(str.charAt(i), 10);
                int digit2 = Character.digit(str.charAt(i + 1), 10);
                int[] iArr = new int[10];
                for (int i2 = 0; i2 < 5; i2++) {
                    int i3 = i2 << 1;
                    int[][] iArr2 = read;
                    iArr[i3] = iArr2[digit][i2];
                    iArr[i3 + 1] = iArr2[digit2][i2];
                }
                read2 += read(zArr, read2, iArr, true);
            }
            read(zArr, read2, MediaBrowserCompat$ItemReceiver, true);
            return zArr;
        } else {
            StringBuilder sb = new StringBuilder("Requested contents should be less than 80 digits long, but got ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
