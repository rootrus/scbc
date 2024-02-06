package p040o;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: o.createFieldID */
public final class createFieldID extends setAnisotropy {
    public final rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException {
        if (rsnincallocationcreatetyped == rsnIncAllocationCreateTyped.UPC_E) {
            return super.write(str, rsnincallocationcreatetyped, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode UPC_E, but got ");
        sb.append(rsnincallocationcreatetyped);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean[] MediaBrowserCompat$ItemReceiver(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                int MediaBrowserCompat$CustomActionResultReceiver = setMinification.MediaBrowserCompat$CustomActionResultReceiver(setWrapS.IconCompatParcelizer(str));
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
        int digit = Character.digit(str.charAt(0), 10);
        if (digit == 0 || digit == 1) {
            int i = setWrapS.MediaBrowserCompat$ItemReceiver[digit][Character.digit(str.charAt(7), 10)];
            boolean[] zArr = new boolean[51];
            int read = read(zArr, 0, setMinification.MediaDescriptionCompat, true);
            for (int i2 = 1; i2 <= 6; i2++) {
                int digit2 = Character.digit(str.charAt(i2), 10);
                if (((i >> (6 - i2)) & 1) == 1) {
                    digit2 += 10;
                }
                read += read(zArr, read, setMinification.read[digit2], false);
            }
            read(zArr, read, setMinification.write, false);
            return zArr;
        }
        throw new IllegalArgumentException("Number system must be 0 or 1");
    }
}
