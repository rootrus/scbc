package p040o;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: o.getAnisotropy */
public final class getAnisotropy extends setAnisotropy {
    public final rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException {
        if (rsnincallocationcreatetyped == rsnIncAllocationCreateTyped.EAN_13) {
            return super.write(str, rsnincallocationcreatetyped, i, i2, map);
        }
        StringBuilder sb = new StringBuilder("Can only encode EAN_13, but got ");
        sb.append(rsnincallocationcreatetyped);
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean[] MediaBrowserCompat$ItemReceiver(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                int MediaBrowserCompat$CustomActionResultReceiver = setMinification.MediaBrowserCompat$CustomActionResultReceiver(str);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                str = sb.toString();
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 13) {
            try {
                if (!setMinification.MediaBrowserCompat$ItemReceiver((CharSequence) str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Requested contents should be 12 or 13 digits long, but got ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString());
        }
        int i = C10822Sampler.MediaBrowserCompat$ItemReceiver[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int read = read(zArr, 0, setMinification.MediaDescriptionCompat, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            read += read(zArr, read, setMinification.read[digit], false);
        }
        int read2 = read + read(zArr, read, setMinification.MediaBrowserCompat$CustomActionResultReceiver, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            read2 += read(zArr, read2, setMinification.IconCompatParcelizer[Character.digit(str.charAt(i3), 10)], true);
        }
        read(zArr, read2, setMinification.MediaDescriptionCompat, true);
        return zArr;
    }
}
