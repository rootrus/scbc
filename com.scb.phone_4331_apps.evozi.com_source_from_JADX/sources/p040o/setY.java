package p040o;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.List;
import java.util.Map;
import p040o.getMaskAnimations;

/* renamed from: o.setY */
public final class setY implements getIIdDeserializerKta {
    private static final rsnScriptForEach[] IconCompatParcelizer = new rsnScriptForEach[0];
    private final FragmentBuilder_BindECouponDetailFragment MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindECouponDetailFragment();

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver read(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver) throws NotFoundException, ChecksumException, FormatException {
        return IconCompatParcelizer(setfontassetdelegate_mediabrowsercompat_itemreceiver, (Map<rsnIncContextCreate, ?>) null);
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver, Map<rsnIncContextCreate, ?> map) throws NotFoundException, ChecksumException, FormatException {
        rsnScriptForEach[] rsnscriptforeachArr;
        getMaskAnimations.read read;
        setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver2 = setfontassetdelegate_mediabrowsercompat_itemreceiver;
        Map<rsnIncContextCreate, ?> map2 = map;
        boolean z = false;
        if (map2 == null || !map2.containsKey(rsnIncContextCreate.PURE_BARCODE)) {
            if (setfontassetdelegate_mediabrowsercompat_itemreceiver2.read == null) {
                setfontassetdelegate_mediabrowsercompat_itemreceiver2.read = setfontassetdelegate_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$ItemReceiver.read();
            }
            isScaleIdentity$MediaBrowserCompat$ItemReceiver write = new TaskUtil(setfontassetdelegate_mediabrowsercompat_itemreceiver2.read).write(map2);
            getMaskAnimations.read MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(write.MediaBrowserCompat$CustomActionResultReceiver, map2);
            rsnscriptforeachArr = write.IconCompatParcelizer;
            read = MediaBrowserCompat$CustomActionResultReceiver2;
        } else {
            if (setfontassetdelegate_mediabrowsercompat_itemreceiver2.read == null) {
                setfontassetdelegate_mediabrowsercompat_itemreceiver2.read = setfontassetdelegate_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$ItemReceiver.read();
            }
            rsnScriptSetVarI rsnscriptsetvari = setfontassetdelegate_mediabrowsercompat_itemreceiver2.read;
            int[] IconCompatParcelizer2 = rsnscriptsetvari.IconCompatParcelizer();
            int[] write2 = rsnscriptsetvari.write();
            if (IconCompatParcelizer2 == null || write2 == null) {
                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
            }
            int i = rsnscriptsetvari.write;
            int i2 = rsnscriptsetvari.IconCompatParcelizer;
            int i3 = IconCompatParcelizer2[0];
            int i4 = IconCompatParcelizer2[1];
            int i5 = 0;
            boolean z2 = true;
            while (i3 < i2 && i4 < i) {
                if (z2 != rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(i3, i4)) {
                    i5++;
                    if (i5 == 5) {
                        break;
                    }
                    z2 = !z2;
                }
                i3++;
                i4++;
            }
            if (i3 == i2 || i4 == i) {
                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
            }
            float f = ((float) (i3 - IconCompatParcelizer2[0])) / 7.0f;
            int i6 = IconCompatParcelizer2[1];
            int i7 = write2[1];
            int i8 = IconCompatParcelizer2[0];
            int i9 = write2[0];
            if (i8 >= i9 || i6 >= i7) {
                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
            }
            int i10 = i7 - i6;
            if (i10 == i9 - i8 || (i9 = i8 + i10) < rsnscriptsetvari.IconCompatParcelizer) {
                int round = Math.round(((float) ((i9 - i8) + 1)) / f);
                int round2 = Math.round(((float) (i10 + 1)) / f);
                if (round <= 0 || round2 <= 0) {
                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                } else if (round2 == round) {
                    int i11 = (int) (f / 2.0f);
                    int i12 = i6 + i11;
                    int i13 = i8 + i11;
                    int i14 = (((int) (((float) (round - 1)) * f)) + i13) - i9;
                    if (i14 > 0) {
                        if (i14 <= i11) {
                            i13 -= i14;
                        } else {
                            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                        }
                    }
                    int i15 = (((int) (((float) (round2 - 1)) * f)) + i12) - i7;
                    if (i15 > 0) {
                        if (i15 <= i11) {
                            i12 -= i15;
                        } else {
                            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                        }
                    }
                    rsnScriptSetVarI rsnscriptsetvari2 = new rsnScriptSetVarI(round, round2);
                    for (int i16 = 0; i16 < round2; i16++) {
                        int i17 = (int) (((float) i16) * f);
                        for (int i18 = 0; i18 < round; i18++) {
                            if (rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(((int) (((float) i18) * f)) + i13, i17 + i12)) {
                                int i19 = (rsnscriptsetvari2.read * i16) + (i18 / 32);
                                int[] iArr = rsnscriptsetvari2.MediaBrowserCompat$CustomActionResultReceiver;
                                iArr[i19] = (1 << (i18 & 31)) | iArr[i19];
                            }
                        }
                    }
                    read = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(rsnscriptsetvari2, map2);
                    rsnscriptforeachArr = IconCompatParcelizer;
                } else {
                    throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
                }
            } else {
                throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
        if (read.write instanceof access$102) {
            Object obj = read.write;
            if (rsnscriptforeachArr != null && rsnscriptforeachArr.length >= 3) {
                rsnScriptForEach rsnscriptforeach = rsnscriptforeachArr[0];
                rsnscriptforeachArr[0] = rsnscriptforeachArr[2];
                rsnscriptforeachArr[2] = rsnscriptforeach;
            }
        }
        getLayers$MediaBrowserCompat$CustomActionResultReceiver getlayers_mediabrowsercompat_customactionresultreceiver = new getLayers$MediaBrowserCompat$CustomActionResultReceiver(read.RatingCompat, read.read, rsnscriptforeachArr, rsnIncAllocationCreateTyped.QR_CODE);
        List<byte[]> list = read.IconCompatParcelizer;
        if (list != null) {
            getlayers_mediabrowsercompat_customactionresultreceiver.read(rsnInvokeClosureCreate.BYTE_SEGMENTS, list);
        }
        String str = read.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            getlayers_mediabrowsercompat_customactionresultreceiver.read(rsnInvokeClosureCreate.ERROR_CORRECTION_LEVEL, str);
        }
        if (read.MediaBrowserCompat$MediaItem >= 0 && read.MediaBrowserCompat$SearchResultReceiver >= 0) {
            z = true;
        }
        if (z) {
            getlayers_mediabrowsercompat_customactionresultreceiver.read(rsnInvokeClosureCreate.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(read.MediaBrowserCompat$SearchResultReceiver));
            getlayers_mediabrowsercompat_customactionresultreceiver.read(rsnInvokeClosureCreate.STRUCTURED_APPEND_PARITY, Integer.valueOf(read.MediaBrowserCompat$MediaItem));
        }
        return getlayers_mediabrowsercompat_customactionresultreceiver;
    }
}
