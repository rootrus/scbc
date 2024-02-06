package p040o;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: o.WRAP_NEAREST */
public final class WRAP_NEAREST extends setAnisotropy {
    public final rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException {
        if (rsnincallocationcreatetyped == rsnIncAllocationCreateTyped.EAN_8) {
            return super.write(str, rsnincallocationcreatetyped, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode EAN_8, but got ");
        sb.append(rsnincallocationcreatetyped);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean[] MediaBrowserCompat$ItemReceiver(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                int MediaBrowserCompat$CustomActionResultReceiver = setMinification.MediaBrowserCompat$CustomActionResultReceiver(str);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                str = sb.toString();
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!setMinification.MediaBrowserCompat$ItemReceiver((CharSequence) str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Requested contents should be 8 digits long, but got ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        boolean[] zArr = new boolean[67];
        int read = read(zArr, 0, setMinification.MediaDescriptionCompat, true);
        for (int i = 0; i <= 3; i++) {
            read += read(zArr, read, setMinification.IconCompatParcelizer[Character.digit(str.charAt(i), 10)], false);
        }
        int read2 = read + read(zArr, read, setMinification.MediaBrowserCompat$CustomActionResultReceiver, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            read2 += read(zArr, read2, setMinification.IconCompatParcelizer[Character.digit(str.charAt(i2), 10)], true);
        }
        read(zArr, read2, setMinification.MediaDescriptionCompat, true);
        return zArr;
    }
}
