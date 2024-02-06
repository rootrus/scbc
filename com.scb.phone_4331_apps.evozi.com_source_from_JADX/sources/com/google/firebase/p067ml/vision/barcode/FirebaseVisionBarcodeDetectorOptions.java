package com.google.firebase.p067ml.vision.barcode;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzqs;
import com.google.android.gms.internal.firebase_ml.zzsk;
import com.google.android.gms.internal.firebase_ml.zzue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions */
public class FirebaseVisionBarcodeDetectorOptions {
    private static final Map<Integer, zzsk> zzavq;
    private final int zzavy;

    private FirebaseVisionBarcodeDetectorOptions(int i) {
        this.zzavy = i;
    }

    public final int zznf() {
        return this.zzavy;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FirebaseVisionBarcodeDetectorOptions) && this.zzavy == ((FirebaseVisionBarcodeDetectorOptions) obj).zzavy;
    }

    /* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions$Builder */
    public static class Builder {
        private int zzavz = 0;

        public FirebaseVisionBarcodeDetectorOptions build() {
            return new FirebaseVisionBarcodeDetectorOptions(this.zzavz);
        }
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzavy));
    }

    public final zzqs.zza zzng() {
        ArrayList arrayList = new ArrayList();
        if (this.zzavy == 0) {
            arrayList.addAll(zzavq.values());
        } else {
            for (Map.Entry next : zzavq.entrySet()) {
                if ((this.zzavy & ((Integer) next.getKey()).intValue()) != 0) {
                    arrayList.add((zzsk) next.getValue());
                }
            }
        }
        return (zzqs.zza) ((zzue) zzqs.zza.zzof().zzp(arrayList).zzrj());
    }

    static {
        HashMap hashMap = new HashMap();
        zzavq = hashMap;
        hashMap.put(1, zzsk.CODE_128);
        zzavq.put(2, zzsk.CODE_39);
        zzavq.put(4, zzsk.CODE_93);
        zzavq.put(8, zzsk.CODABAR);
        zzavq.put(16, zzsk.DATA_MATRIX);
        zzavq.put(32, zzsk.EAN_13);
        zzavq.put(64, zzsk.EAN_8);
        zzavq.put(128, zzsk.ITF);
        zzavq.put(256, zzsk.QR_CODE);
        zzavq.put(512, zzsk.UPC_A);
        zzavq.put(1024, zzsk.UPC_E);
        zzavq.put(2048, zzsk.PDF417);
        zzavq.put(4096, zzsk.AZTEC);
    }
}
