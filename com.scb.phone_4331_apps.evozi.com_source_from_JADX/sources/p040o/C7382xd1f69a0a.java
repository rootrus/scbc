package p040o;

import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: o.proxyGetIPassportDeserializerRtti$MediaBrowserCompat$CustomActionResultReceiver */
public final class C7382xd1f69a0a {
    private final StringBuilder MediaBrowserCompat$CustomActionResultReceiver = new StringBuilder();
    private final int[] write = new int[4];

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int[] iArr) throws NotFoundException {
        EnumMap enumMap;
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate2 = rsnscriptintrinsiccreate;
        StringBuilder sb = this.MediaBrowserCompat$CustomActionResultReceiver;
        sb.setLength(0);
        int[] iArr2 = this.write;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i2 = rsnscriptintrinsiccreate2.read;
        int i3 = iArr[1];
        int i4 = 0;
        for (int i5 = 0; i5 < 2 && i3 < i2; i5++) {
            int IconCompatParcelizer = setMinification.IconCompatParcelizer(rsnscriptintrinsiccreate2, iArr2, i3, setMinification.read);
            sb.append((char) ((IconCompatParcelizer % 10) + 48));
            for (int i6 : iArr2) {
                i3 += i6;
            }
            if (IconCompatParcelizer >= 10) {
                i4 |= 1 << (1 - i5);
            }
            if (i5 != 1) {
                i3 = rsnscriptintrinsiccreate2.write(rsnscriptintrinsiccreate2.read(i3));
            }
        }
        if (sb.length() != 2) {
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        } else if (Integer.parseInt(sb.toString()) % 4 == i4) {
            String obj = sb.toString();
            if (obj.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(rsnInvokeClosureCreate.class);
                enumMap.put(rsnInvokeClosureCreate.ISSUE_NUMBER, Integer.valueOf(obj));
            }
            float f = (float) i;
            getLayers$MediaBrowserCompat$CustomActionResultReceiver getlayers_mediabrowsercompat_customactionresultreceiver = new getLayers$MediaBrowserCompat$CustomActionResultReceiver(obj, (byte[]) null, new rsnScriptForEach[]{new rsnScriptForEach(((float) (iArr[0] + iArr[1])) / 2.0f, f), new rsnScriptForEach((float) i3, f)}, rsnIncAllocationCreateTyped.UPC_EAN_EXTENSION);
            if (!(enumMap == null || enumMap == null)) {
                Map<rsnInvokeClosureCreate, Object> map = getlayers_mediabrowsercompat_customactionresultreceiver.read;
                if (map == null) {
                    getlayers_mediabrowsercompat_customactionresultreceiver.read = enumMap;
                } else {
                    map.putAll(enumMap);
                }
            }
            return getlayers_mediabrowsercompat_customactionresultreceiver;
        } else {
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
