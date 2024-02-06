package p040o;

import com.google.zxing.WriterException;
import java.util.Map;

/* renamed from: o.getWrapS */
public abstract class getWrapS implements getIIdDeserializerOnDevice {
    public int IconCompatParcelizer() {
        return 10;
    }

    public abstract boolean[] MediaBrowserCompat$ItemReceiver(String str);

    public rsnScriptSetVarI write(String str, rsnIncAllocationCreateTyped rsnincallocationcreatetyped, int i, int i2, Map<rsnIncObjDestroy, ?> map) throws WriterException {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Negative size is not allowed. Input: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            int IconCompatParcelizer = IconCompatParcelizer();
            if (map != null && map.containsKey(rsnIncObjDestroy.MARGIN)) {
                IconCompatParcelizer = Integer.parseInt(map.get(rsnIncObjDestroy.MARGIN).toString());
            }
            boolean[] MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(str);
            int length = MediaBrowserCompat$ItemReceiver.length;
            int i3 = IconCompatParcelizer + length;
            int max = Math.max(i, i3);
            int max2 = Math.max(1, i2);
            int i4 = max / i3;
            int i5 = (max - (length * i4)) / 2;
            rsnScriptSetVarI rsnscriptsetvari = new rsnScriptSetVarI(max, max2);
            int i6 = 0;
            while (i6 < length) {
                if (MediaBrowserCompat$ItemReceiver[i6]) {
                    rsnscriptsetvari.IconCompatParcelizer(i5, 0, i4, max2);
                }
                i6++;
                i5 += i4;
            }
            return rsnscriptsetvari;
        }
    }

    protected static int read(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }
}
