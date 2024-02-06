package p040o;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.PassportCaptureModule;
import p040o.RenderScript;
import p040o.getMaskAnimations;

/* renamed from: o.setPriority */
public final class setPriority implements getIIdDeserializerKta {
    private static final rsnScriptForEach[] read = new rsnScriptForEach[0];
    private final PassportCaptureModule.PassportOnDeviceExtractionServer.IconCompatParcelizer IconCompatParcelizer = new PassportCaptureModule.PassportOnDeviceExtractionServer.IconCompatParcelizer();

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver read(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver) throws NotFoundException, ChecksumException, FormatException {
        return IconCompatParcelizer(setfontassetdelegate_mediabrowsercompat_itemreceiver, (Map<rsnIncContextCreate, ?>) null);
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver, Map<rsnIncContextCreate, ?> map) throws NotFoundException, ChecksumException, FormatException {
        byte[] bArr;
        setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver2 = setfontassetdelegate_mediabrowsercompat_itemreceiver;
        Map<rsnIncContextCreate, ?> map2 = map;
        if (map2 == null || !map2.containsKey(rsnIncContextCreate.PURE_BARCODE)) {
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (setfontassetdelegate_mediabrowsercompat_itemreceiver2.read == null) {
            setfontassetdelegate_mediabrowsercompat_itemreceiver2.read = setfontassetdelegate_mediabrowsercompat_itemreceiver2.MediaBrowserCompat$ItemReceiver.read();
        }
        rsnScriptSetVarI rsnscriptsetvari = setfontassetdelegate_mediabrowsercompat_itemreceiver2.read;
        int i = rsnscriptsetvari.IconCompatParcelizer;
        int i2 = rsnscriptsetvari.write;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < rsnscriptsetvari.write; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = rsnscriptsetvari.read;
                if (i6 >= i7) {
                    break;
                }
                int i8 = rsnscriptsetvari.MediaBrowserCompat$CustomActionResultReceiver[(i7 * i5) + i6];
                if (i8 != 0) {
                    if (i5 < i2) {
                        i2 = i5;
                    }
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    int i9 = i6 << 5;
                    int i10 = 31;
                    if (i9 < i) {
                        int i11 = 0;
                        while ((i8 << (31 - i11)) == 0) {
                            i11++;
                        }
                        int i12 = i11 + i9;
                        if (i12 < i) {
                            i = i12;
                        }
                    }
                    if (i9 + 31 > i3) {
                        while ((i8 >>> i10) == 0) {
                            i10--;
                        }
                        int i13 = i9 + i10;
                        if (i13 > i3) {
                            i3 = i13;
                        }
                    }
                }
                i6++;
            }
        }
        int[] iArr = (i3 < i || i4 < i2) ? null : new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
        if (iArr != null) {
            int i14 = iArr[0];
            int i15 = iArr[1];
            int i16 = iArr[2];
            int i17 = iArr[3];
            int i18 = 33;
            int i19 = 30;
            rsnScriptSetVarI rsnscriptsetvari2 = new rsnScriptSetVarI(30, 33);
            int i20 = 0;
            while (i20 < i18) {
                int i21 = ((i20 * i17) + (i17 / 2)) / i18;
                int i22 = 0;
                while (i22 < i19) {
                    if (rsnscriptsetvari.MediaBrowserCompat$ItemReceiver(((((i22 * i16) + (i16 / 2)) + (((i20 & 1) * i16) / 2)) / 30) + i14, i21 + i15)) {
                        int i23 = (rsnscriptsetvari2.read * i20) + (i22 / 32);
                        int[] iArr2 = rsnscriptsetvari2.MediaBrowserCompat$CustomActionResultReceiver;
                        iArr2[i23] = (1 << (i22 & 31)) | iArr2[i23];
                    }
                    i22++;
                    i19 = 30;
                }
                i20++;
                i18 = 33;
                i19 = 30;
            }
            PassportCaptureModule.PassportOnDeviceExtractionServer.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
            validateObject validateobject = new validateObject(rsnscriptsetvari2);
            byte[] bArr2 = new byte[CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA];
            int i24 = validateobject.IconCompatParcelizer.write;
            int i25 = validateobject.IconCompatParcelizer.IconCompatParcelizer;
            for (int i26 = 0; i26 < i24; i26++) {
                int[] iArr3 = validateObject.MediaBrowserCompat$CustomActionResultReceiver[i26];
                for (int i27 = 0; i27 < i25; i27++) {
                    int i28 = iArr3[i27];
                    if (i28 >= 0 && validateobject.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i27, i26)) {
                        int i29 = i28 / 6;
                        bArr2[i29] = (byte) (((byte) (1 << (5 - (i28 % 6)))) | bArr2[i29]);
                    }
                }
            }
            iconCompatParcelizer.IconCompatParcelizer(bArr2, 0, 10, 10, 0);
            byte b = bArr2[0] & 15;
            if (b == 2 || b == 3 || b == 4) {
                PassportCaptureModule.PassportOnDeviceExtractionServer.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
                byte[] bArr3 = bArr2;
                iconCompatParcelizer2.IconCompatParcelizer(bArr3, 20, 84, 40, 1);
                iconCompatParcelizer2.IconCompatParcelizer(bArr3, 20, 84, 40, 2);
                bArr = new byte[94];
            } else if (b == 5) {
                PassportCaptureModule.PassportOnDeviceExtractionServer.IconCompatParcelizer iconCompatParcelizer3 = iconCompatParcelizer;
                byte[] bArr4 = bArr2;
                iconCompatParcelizer3.IconCompatParcelizer(bArr4, 20, 68, 56, 1);
                iconCompatParcelizer3.IconCompatParcelizer(bArr4, 20, 68, 56, 2);
                bArr = new byte[78];
            } else {
                throw FormatException.read();
            }
            System.arraycopy(bArr2, 0, bArr, 0, 10);
            System.arraycopy(bArr2, 20, bArr, 10, bArr.length - 10);
            getMaskAnimations.read MediaBrowserCompat$CustomActionResultReceiver = RenderScript.MessageThread.MediaBrowserCompat$CustomActionResultReceiver(bArr, b);
            getLayers$MediaBrowserCompat$CustomActionResultReceiver getlayers_mediabrowsercompat_customactionresultreceiver = new getLayers$MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver.RatingCompat, MediaBrowserCompat$CustomActionResultReceiver.read, read, rsnIncAllocationCreateTyped.MAXICODE);
            String str = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            if (str != null) {
                getlayers_mediabrowsercompat_customactionresultreceiver.read(rsnInvokeClosureCreate.ERROR_CORRECTION_LEVEL, str);
            }
            return getlayers_mediabrowsercompat_customactionresultreceiver;
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
