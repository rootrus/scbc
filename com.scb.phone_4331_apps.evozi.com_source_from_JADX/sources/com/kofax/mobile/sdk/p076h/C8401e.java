package com.kofax.mobile.sdk.p076h;

import bolts.Task;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.ken.engines.data.BoundingTetragon;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk._internal.C7918f;
import com.kofax.mobile.sdk.p070a.C8239a;
import com.manateeworks.kfx.BarcodeScanner;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.concurrent.Callable;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.h.e */
public class C8401e implements C8239a {
    private static final Charset US_ASCII = Charset.forName("US-ASCII");

    /* renamed from: yN */
    private static final Object f4930yN = new Object();

    /* renamed from: yO */
    private C7918f f4931yO;

    @HmlPinActivity
    C8401e(C7918f fVar) {
        if (fVar != null) {
            this.f4931yO = fVar;
            return;
        }
        throw new IllegalArgumentException("scaler cannot be null");
    }

    /* renamed from: a */
    public Task<BarCodeResult> mo54699a(final Image image, final Set<BarCodeType> set) {
        return Task.callInBackground(new Callable<BarCodeResult>() {
            /* renamed from: iN */
            public BarCodeResult call() throws Exception {
                return C8401e.this.m4895b(image, set);
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.kofax.kmc.ken.engines.data.BarCodeResult m4895b(com.kofax.kmc.ken.engines.data.Image r4, java.util.Set<com.kofax.kmc.ken.engines.data.BarCodeType> r5) {
        /*
            r3 = this;
            java.lang.Object r0 = f4930yN
            monitor-enter(r0)
            r3.m4896b(r5)     // Catch:{ KmcException -> 0x0061 }
            com.kofax.mobile.sdk._internal.f r5 = r3.f4931yO     // Catch:{ KmcException -> 0x0061 }
            r1 = 1000(0x3e8, float:1.401E-42)
            android.graphics.Bitmap r4 = r5.mo54324a(r4, r1, r1)     // Catch:{ KmcException -> 0x0061 }
            byte[] r5 = com.kofax.kmc.kui.uicontrols.Utility.imageToGray((android.graphics.Bitmap) r4)     // Catch:{ KmcException -> 0x0061 }
            int r1 = r4.getWidth()     // Catch:{ KmcException -> 0x0061 }
            int r4 = r4.getHeight()     // Catch:{ KmcException -> 0x0061 }
            byte[] r4 = com.manateeworks.kfx.BarcodeScanner.scanGrayscaleImage(r5, r1, r4)     // Catch:{ KmcException -> 0x0061 }
            if (r4 == 0) goto L_0x005c
            int r5 = r4.length     // Catch:{ KmcException -> 0x0061 }
            r1 = 4
            if (r5 >= r1) goto L_0x0025
            goto L_0x005c
        L_0x0025:
            boolean r5 = m4897e(r4)     // Catch:{ KmcException -> 0x0061 }
            if (r5 == 0) goto L_0x0035
            java.lang.String r5 = new java.lang.String     // Catch:{ KmcException -> 0x0061 }
            java.nio.charset.Charset r1 = US_ASCII     // Catch:{ KmcException -> 0x0061 }
            r5.<init>(r4, r1)     // Catch:{ KmcException -> 0x0061 }
            com.kofax.kmc.ken.engines.data.BarCodeDataFormat r4 = com.kofax.kmc.ken.engines.data.BarCodeDataFormat.ASCII     // Catch:{ KmcException -> 0x0061 }
            goto L_0x003c
        L_0x0035:
            r5 = 0
            java.lang.String r5 = android.util.Base64.encodeToString(r4, r5)     // Catch:{ KmcException -> 0x0061 }
            com.kofax.kmc.ken.engines.data.BarCodeDataFormat r4 = com.kofax.kmc.ken.engines.data.BarCodeDataFormat.BASE_64     // Catch:{ KmcException -> 0x0061 }
        L_0x003c:
            com.kofax.kmc.ken.engines.data.BarCodeResult r1 = new com.kofax.kmc.ken.engines.data.BarCodeResult     // Catch:{ KmcException -> 0x0061 }
            r1.<init>()     // Catch:{ KmcException -> 0x0061 }
            com.kofax.kmc.ken.engines.data.BoundingTetragon r2 = r3.m4899iR()     // Catch:{ KmcException -> 0x0061 }
            r1.setBoundingBox(r2)     // Catch:{ KmcException -> 0x0061 }
            com.kofax.kmc.ken.engines.data.BarCodeDirection r2 = com.kofax.kmc.ken.engines.data.BarCodeDirection.UNKNOWN     // Catch:{ KmcException -> 0x0061 }
            r1.setDirection(r2)     // Catch:{ KmcException -> 0x0061 }
            com.kofax.kmc.ken.engines.data.BarCodeType r2 = m4898iQ()     // Catch:{ KmcException -> 0x0061 }
            r1.setType(r2)     // Catch:{ KmcException -> 0x0061 }
            r1.setValue(r5)     // Catch:{ KmcException -> 0x0061 }
            r1.setDataFormat(r4)     // Catch:{ KmcException -> 0x0061 }
            monitor-exit(r0)
            return r1
        L_0x005c:
            monitor-exit(r0)
            r4 = 0
            return r4
        L_0x005f:
            r4 = move-exception
            goto L_0x006c
        L_0x0061:
            r4 = move-exception
            com.kofax.kmc.kut.utilities.error.KmcRuntimeException r5 = new com.kofax.kmc.kut.utilities.error.KmcRuntimeException     // Catch:{ all -> 0x005f }
            com.kofax.kmc.kut.utilities.error.ErrorInfo r4 = r4.getErrorInfo()     // Catch:{ all -> 0x005f }
            r5.<init>(r4)     // Catch:{ all -> 0x005f }
            throw r5     // Catch:{ all -> 0x005f }
        L_0x006c:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p076h.C8401e.m4895b(com.kofax.kmc.ken.engines.data.Image, java.util.Set):com.kofax.kmc.ken.engines.data.BarCodeResult");
    }

    /* renamed from: b */
    private void m4896b(Set<BarCodeType> set) {
        int i = 64;
        if (set.contains(BarCodeType.PDF417)) {
            BarcodeScanner.registerCode(64, "Kofax.Android.PDF.UDL", "5A52C54FD2EEB8A9DC6599740ABB69E6B397378ADBE1CE342517D4700C9F56AD");
        } else {
            i = 0;
        }
        if (set.contains(BarCodeType.QR)) {
            BarcodeScanner.registerCode(1, "Kofax.Android.QR.UDL", "5C44241E3E38A6E3BFBA3FB5949112DA91544173A67BFA58B622123B0C5341BC");
            i |= 1;
        }
        if (set.contains(BarCodeType.CODE39)) {
            BarcodeScanner.registerCode(8, "Kofax.Android.C39.UDL", "2DBAB7E1F20796746AFA20069DE9F5B7C2D5CAA2F63A86BB6B89634D6C4336DD");
            i |= 8;
        }
        BarcodeScanner.setActiveCodes(i);
        BarcodeScanner.setLevel(5);
    }

    /* renamed from: e */
    private static boolean m4897e(byte[] bArr) {
        for (byte b : bArr) {
            if (b < 32 || b >= Byte.MAX_VALUE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: iQ */
    private static BarCodeType m4898iQ() {
        int lastType = BarcodeScanner.getLastType();
        if (lastType == 1) {
            return BarCodeType.DATAMATRIX;
        }
        if (lastType == 2) {
            return BarCodeType.CODE39;
        }
        switch (lastType) {
            case 7:
            case 8:
                return BarCodeType.EAN;
            case 9:
            case 10:
                return BarCodeType.UPC;
            case 11:
                return BarCodeType.CODE128;
            case 12:
                return BarCodeType.PDF417;
            case 13:
                return BarCodeType.QR;
            case 14:
                return BarCodeType.AZTEC;
            case 15:
            case 16:
                return BarCodeType.CODE25;
            case 17:
                return BarCodeType.CODE93;
            case 18:
                return BarCodeType.CODABAR;
            default:
                return BarCodeType.UNKNOWN;
        }
    }

    /* renamed from: iR */
    private BoundingTetragon m4899iR() {
        float[] barcodeLocation = BarcodeScanner.getBarcodeLocation();
        return new BoundingTetragon((int) barcodeLocation[0], (int) barcodeLocation[1], (int) barcodeLocation[2], (int) barcodeLocation[3], (int) barcodeLocation[6], (int) barcodeLocation[7], (int) barcodeLocation[4], (int) barcodeLocation[5]);
    }
}
