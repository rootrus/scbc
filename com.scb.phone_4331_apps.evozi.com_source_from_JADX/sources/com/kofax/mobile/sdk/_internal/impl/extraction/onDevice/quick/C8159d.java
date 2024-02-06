package com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick;

import android.graphics.Rect;
import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.mobile.barcodeparser.BarcodeParser;
import com.kofax.mobile.barcodeparser.BarcodeParserException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.capture.model.FieldLocation;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import com.manateeworks.kfx.BarcodeScanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.quick.d */
public class C8159d {

    /* renamed from: RM */
    private static final Rect f4184RM = new Rect(0, 0, 100, 100);
    private static final String TAG = C8159d.class.getSimpleName();

    /* renamed from: RN */
    private final BarcodeParser f4185RN = new BarcodeParser();

    /* renamed from: RO */
    private final Set<BarCodeType> f4186RO;

    public void destroy() {
    }

    public C8159d(Set<BarCodeType> set) {
        this.f4186RO = new HashSet(set);
    }

    /* renamed from: a */
    public C8161f mo54562a(C8160e eVar) {
        synchronized (BarcodeScanner.class) {
            int i = 64;
            if (this.f4186RO.contains(BarCodeType.PDF417)) {
                BarcodeScanner.registerCode(64, "Kofax.Android.PDF.UDL", "5A52C54FD2EEB8A9DC6599740ABB69E6B397378ADBE1CE342517D4700C9F56AD");
                BarcodeScanner.setScanningRect(64, f4184RM);
            } else {
                i = 0;
            }
            if (this.f4186RO.contains(BarCodeType.QR)) {
                BarcodeScanner.registerCode(1, "Kofax.Android.QR.UDL", "5C44241E3E38A6E3BFBA3FB5949112DA91544173A67BFA58B622123B0C5341BC");
                BarcodeScanner.setScanningRect(1, f4184RM);
                i |= 1;
            }
            if (this.f4186RO.contains(BarCodeType.CODE39)) {
                BarcodeScanner.registerCode(8, "Kofax.Android.C39.UDL", "2DBAB7E1F20796746AFA20069DE9F5B7C2D5CAA2F63A86BB6B89634D6C4336DD");
                BarcodeScanner.setScanningRect(8, f4184RM);
                i |= 8;
            }
            if (i == 0) {
                return null;
            }
            BarcodeScanner.setActiveCodes(i);
            BarcodeScanner.setDirection(3);
            BarcodeScanner.setLevel(3);
            byte[] scanGrayscaleImage = BarcodeScanner.scanGrayscaleImage(eVar.mo54561qg(), eVar.getWidth(), eVar.getHeight());
            if (scanGrayscaleImage == null) {
                return null;
            }
            try {
                C8161f a = m4377a(eVar, m4379a(scanGrayscaleImage, BarcodeScanner.getLastType()));
                return a;
            } catch (BarcodeParserException e) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Exception (");
                sb.append(e.getCode());
                sb.append(")");
                C0767k.m1802b(str, sb.toString(), (Throwable) e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private Map<String, String> m4379a(byte[] bArr, int i) throws BarcodeParserException {
        BarcodeParser barcodeParser = this.f4185RN;
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown/Unknown/");
        sb.append(m4381o(i));
        return barcodeParser.parse(bArr, sb.toString());
    }

    /* renamed from: a */
    private C8161f m4377a(C8160e eVar, Map<String, String> map) {
        return m4376a(eVar, m4380e(map));
    }

    /* renamed from: a */
    private C8161f m4376a(C8160e eVar, List<DataField> list) {
        return new C8161f(list, eVar.mo54560qf());
    }

    /* renamed from: e */
    private static List<DataField> m4380e(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> a : map.entrySet()) {
            arrayList.add(m4378a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static DataField m4378a(Map.Entry<String, String> entry) {
        return new DataField(entry.getKey(), entry.getValue(), 1.0d, FieldLocation.UNDEFINED);
    }

    /* renamed from: o */
    private static BarcodeParser.Symbology m4381o(int i) {
        if (i == 2) {
            return BarcodeParser.Symbology.CODE39;
        }
        if (i == 12) {
            return BarcodeParser.Symbology.PDF417;
        }
        if (i == 13) {
            return BarcodeParser.Symbology.QR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("type = ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
