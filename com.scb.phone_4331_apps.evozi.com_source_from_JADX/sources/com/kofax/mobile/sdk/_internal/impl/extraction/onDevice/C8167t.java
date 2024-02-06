package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.kmc.ken.engines.data.BarCodeType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.barcodeparser.BarcodeParser;
import com.kofax.mobile.barcodeparser.BarcodeParserException;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7911f;
import com.kofax.mobile.sdk.capture.model.FieldLocation;
import com.kofax.mobile.sdk.extract.p018id.DataField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.t */
class C8167t implements C7911f {

    /* renamed from: Lv */
    private static final Map<BarcodeParser.Symbology, BarCodeType> f4198Lv;

    /* renamed from: Lw */
    private final BarcodeParser f4199Lw = new BarcodeParser();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(BarcodeParser.Symbology.PDF417, BarCodeType.PDF417);
        hashMap.put(BarcodeParser.Symbology.QR, BarCodeType.QR);
        hashMap.put(BarcodeParser.Symbology.CODE39, BarCodeType.CODE39);
        f4198Lv = Collections.unmodifiableMap(hashMap);
    }

    @HmlPinActivity
    C8167t() {
    }

    /* renamed from: n */
    public Set<BarCodeType> mo54317n(String str, String str2) {
        BarcodeParser barcodeParser = this.f4199Lw;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append("/");
        return m4408c(barcodeParser.getSymbologies(sb.toString()));
    }

    /* renamed from: a */
    public List<DataField> mo54316a(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append("/");
        sb.append(str3);
        try {
            return m4409d(this.f4199Lw.parse(str4, sb.toString()));
        } catch (BarcodeParserException e) {
            if (e.getCode() == 3) {
                throw new KmcRuntimeException(ErrorInfo.KMC_CL_ENCRYPTED_BARCODE_STRING, e);
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_CL_INVALID_BARCODE_STRING, e);
        }
    }

    /* renamed from: d */
    private static List<DataField> m4409d(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(m4406A((String) next.getKey(), (String) next.getValue()));
        }
        return arrayList;
    }

    /* renamed from: A */
    private static DataField m4406A(String str, String str2) {
        return new DataField(str, str2, 1.0d, FieldLocation.UNDEFINED);
    }

    /* renamed from: c */
    private static Set<BarCodeType> m4408c(Set<BarcodeParser.Symbology> set) {
        HashSet hashSet = new HashSet();
        for (BarcodeParser.Symbology a : set) {
            hashSet.add(m4407a(a));
        }
        return hashSet;
    }

    /* renamed from: a */
    private static BarCodeType m4407a(BarcodeParser.Symbology symbology) {
        BarCodeType barCodeType = f4198Lv.get(symbology);
        if (barCodeType != null) {
            return barCodeType;
        }
        throw new IllegalArgumentException();
    }
}
