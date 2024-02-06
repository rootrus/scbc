package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.getMinification */
public abstract class getMinification implements getIIdDeserializerKta {
    public abstract getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, Map<rsnIncContextCreate, ?> map) throws NotFoundException, ChecksumException, FormatException;

    public void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public getLayers$MediaBrowserCompat$CustomActionResultReceiver read(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver) throws NotFoundException, FormatException {
        return IconCompatParcelizer(setfontassetdelegate_mediabrowsercompat_itemreceiver, (Map<rsnIncContextCreate, ?>) null);
    }

    public getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver, Map<rsnIncContextCreate, ?> map) throws NotFoundException, FormatException {
        try {
            return MediaBrowserCompat$ItemReceiver(setfontassetdelegate_mediabrowsercompat_itemreceiver, map);
        } catch (NotFoundException e) {
            if (!(map != null && map.containsKey(rsnIncContextCreate.TRY_HARDER)) || !setfontassetdelegate_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver()) {
                throw e;
            }
            setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver2 = new setFontAssetDelegate$MediaBrowserCompat$ItemReceiver(setfontassetdelegate_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(setfontassetdelegate_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.read.read()));
            getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(setfontassetdelegate_mediabrowsercompat_itemreceiver2, map);
            Map<rsnInvokeClosureCreate, Object> map2 = MediaBrowserCompat$ItemReceiver.read;
            int i = 270;
            if (map2 != null && map2.containsKey(rsnInvokeClosureCreate.ORIENTATION)) {
                i = (((Integer) map2.get(rsnInvokeClosureCreate.ORIENTATION)).intValue() + 270) % 360;
            }
            MediaBrowserCompat$ItemReceiver.read(rsnInvokeClosureCreate.ORIENTATION, Integer.valueOf(i));
            rsnScriptForEach[] rsnscriptforeachArr = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            if (rsnscriptforeachArr != null) {
                int i2 = setfontassetdelegate_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$ItemReceiver;
                for (int i3 = 0; i3 < rsnscriptforeachArr.length; i3++) {
                    rsnscriptforeachArr[i3] = new rsnScriptForEach((((float) i2) - rsnscriptforeachArr[i3].read) - 1.0f, rsnscriptforeachArr[i3].MediaBrowserCompat$CustomActionResultReceiver);
                }
            }
            return MediaBrowserCompat$ItemReceiver;
        }
    }

    protected static void MediaBrowserCompat$ItemReceiver(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        Arrays.fill(iArr, 0, length, 0);
        int i2 = rsnscriptintrinsiccreate.read;
        if (i < i2) {
            boolean z = !(((1 << (i & 31)) & rsnscriptintrinsiccreate.write[i / 32]) != 0);
            int i3 = 0;
            while (i < i2) {
                if ((((1 << (i & 31)) & rsnscriptintrinsiccreate.write[i / 32]) != 0) == z) {
                    i3++;
                    if (i3 == length) {
                        break;
                    }
                    iArr[i3] = 1;
                    z = !z;
                } else {
                    iArr[i3] = iArr[i3] + 1;
                }
                i++;
            }
            if (i3 == length) {
                return;
            }
            if (i3 != length - 1 || i != i2) {
                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
            }
            return;
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    protected static void write(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean z = ((1 << (i & 31)) & rsnscriptintrinsiccreate.write[i / 32]) != 0;
        while (i > 0 && length >= 0) {
            i--;
            if ((((1 << (i & 31)) & rsnscriptintrinsiccreate.write[i / 32]) != 0) != z) {
                length--;
                z = !z;
            }
        }
        if (length < 0) {
            MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate, i + 1, iArr);
            return;
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public static float IconCompatParcelizer(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = BitmapDescriptorFactory.HUE_RED;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f5 = ((float) iArr2[i4]) * f3;
            float f6 = (float) i5;
            float f7 = f6 > f5 ? f6 - f5 : f5 - f6;
            if (f7 > f * f3) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f7;
        }
        return f4 / f2;
    }

    private getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver, Map<rsnIncContextCreate, ?> map) throws NotFoundException {
        int i;
        Map<rsnIncContextCreate, ?> map2;
        int i2;
        setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver2 = setfontassetdelegate_mediabrowsercompat_itemreceiver;
        EnumMap enumMap = map;
        int i3 = setfontassetdelegate_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$ItemReceiver.read.IconCompatParcelizer;
        int i4 = setfontassetdelegate_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$ItemReceiver;
        rsnScriptIntrinsicCreate rsnscriptintrinsiccreate = new rsnScriptIntrinsicCreate(i3);
        int i5 = 1;
        boolean z = enumMap != null && enumMap.containsKey(rsnIncContextCreate.TRY_HARDER);
        int max = Math.max(1, i4 >> (z ? 8 : 5));
        int i6 = z ? i4 : 15;
        int i7 = i4 / 2;
        int i8 = 0;
        while (i8 < i6) {
            int i9 = i8 + 1;
            int i10 = i9 / 2;
            if (((i8 & 1) == 0 ? i5 : 0) == 0) {
                i10 = -i10;
            }
            int i11 = (i10 * max) + i7;
            if (i11 < 0 || i11 >= i4) {
                break;
            }
            try {
                rsnscriptintrinsiccreate = setfontassetdelegate_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(i11, rsnscriptintrinsiccreate);
                int i12 = 0;
                while (i12 < 2) {
                    if (i12 == i5) {
                        rsnscriptintrinsiccreate.IconCompatParcelizer();
                        if (enumMap != null && enumMap.containsKey(rsnIncContextCreate.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap2 = new EnumMap(rsnIncContextCreate.class);
                            enumMap2.putAll(enumMap);
                            enumMap2.remove(rsnIncContextCreate.NEED_RESULT_POINT_CALLBACK);
                            enumMap = enumMap2;
                        }
                    }
                    try {
                        getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer = IconCompatParcelizer(i11, rsnscriptintrinsiccreate, enumMap);
                        if (i12 == i5) {
                            try {
                                IconCompatParcelizer.read(rsnInvokeClosureCreate.ORIENTATION, Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256));
                                rsnScriptForEach[] rsnscriptforeachArr = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                                if (rsnscriptforeachArr != null) {
                                    float f = (float) i3;
                                    map2 = enumMap;
                                    try {
                                        i = i3;
                                    } catch (ReaderException unused) {
                                        i = i3;
                                        i2 = 1;
                                        i12++;
                                        setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver3 = setfontassetdelegate_mediabrowsercompat_itemreceiver;
                                        i5 = i2;
                                        enumMap = map2;
                                        i3 = i;
                                    }
                                    try {
                                        rsnscriptforeachArr[0] = new rsnScriptForEach((f - rsnscriptforeachArr[0].MediaBrowserCompat$CustomActionResultReceiver) - 1.0f, rsnscriptforeachArr[0].read);
                                        i2 = 1;
                                        try {
                                            rsnscriptforeachArr[1] = new rsnScriptForEach((f - rsnscriptforeachArr[1].MediaBrowserCompat$CustomActionResultReceiver) - 1.0f, rsnscriptforeachArr[1].read);
                                        } catch (ReaderException unused2) {
                                            continue;
                                        }
                                    } catch (ReaderException unused3) {
                                        i2 = 1;
                                        i12++;
                                        setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver32 = setfontassetdelegate_mediabrowsercompat_itemreceiver;
                                        i5 = i2;
                                        enumMap = map2;
                                        i3 = i;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                map2 = enumMap;
                                i = i3;
                                i2 = 1;
                                i12++;
                                setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver322 = setfontassetdelegate_mediabrowsercompat_itemreceiver;
                                i5 = i2;
                                enumMap = map2;
                                i3 = i;
                            }
                        }
                        return IconCompatParcelizer;
                    } catch (ReaderException unused5) {
                        map2 = enumMap;
                        i = i3;
                        i2 = i5;
                        i12++;
                        setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver3222 = setfontassetdelegate_mediabrowsercompat_itemreceiver;
                        i5 = i2;
                        enumMap = map2;
                        i3 = i;
                    }
                }
                continue;
            } catch (NotFoundException unused6) {
            }
            setfontassetdelegate_mediabrowsercompat_itemreceiver2 = setfontassetdelegate_mediabrowsercompat_itemreceiver;
            i5 = i5;
            i8 = i9;
            i3 = i3;
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
