package com.google.firebase.p067ml.vision.barcode;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.vision.barcode.Barcode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode */
public class FirebaseVisionBarcode {
    private static final Map<Integer, zzmd.zzv.zza> zzavq = new HashMap();
    private static final Map<Integer, zzmd.zzv.zzb> zzavr = new HashMap();
    private final Barcode zzavs;

    public FirebaseVisionBarcode(Barcode barcode) {
        this.zzavs = (Barcode) Preconditions.checkNotNull(barcode);
    }

    public int getFormat() {
        int i = this.zzavs.format;
        if (i > 4096 || i == 0) {
            return -1;
        }
        return i;
    }

    public int getValueType() {
        return this.zzavs.valueFormat;
    }

    public final zzmd.zzv.zza zznd() {
        zzmd.zzv.zza zza = zzavq.get(Integer.valueOf(getFormat()));
        return zza == null ? zzmd.zzv.zza.FORMAT_UNKNOWN : zza;
    }

    public final zzmd.zzv.zzb zzne() {
        zzmd.zzv.zzb zzb = zzavr.get(Integer.valueOf(getValueType()));
        return zzb == null ? zzmd.zzv.zzb.TYPE_UNKNOWN : zzb;
    }

    static {
        zzavq.put(-1, zzmd.zzv.zza.FORMAT_UNKNOWN);
        zzavq.put(1, zzmd.zzv.zza.FORMAT_CODE_128);
        zzavq.put(2, zzmd.zzv.zza.FORMAT_CODE_39);
        zzavq.put(4, zzmd.zzv.zza.FORMAT_CODE_93);
        zzavq.put(8, zzmd.zzv.zza.FORMAT_CODABAR);
        zzavq.put(16, zzmd.zzv.zza.FORMAT_DATA_MATRIX);
        zzavq.put(32, zzmd.zzv.zza.FORMAT_EAN_13);
        zzavq.put(64, zzmd.zzv.zza.FORMAT_EAN_8);
        zzavq.put(128, zzmd.zzv.zza.FORMAT_ITF);
        zzavq.put(256, zzmd.zzv.zza.FORMAT_QR_CODE);
        zzavq.put(512, zzmd.zzv.zza.FORMAT_UPC_A);
        zzavq.put(1024, zzmd.zzv.zza.FORMAT_UPC_E);
        zzavq.put(2048, zzmd.zzv.zza.FORMAT_PDF417);
        zzavq.put(4096, zzmd.zzv.zza.FORMAT_AZTEC);
        zzavr.put(0, zzmd.zzv.zzb.TYPE_UNKNOWN);
        zzavr.put(1, zzmd.zzv.zzb.TYPE_CONTACT_INFO);
        zzavr.put(2, zzmd.zzv.zzb.TYPE_EMAIL);
        zzavr.put(3, zzmd.zzv.zzb.TYPE_ISBN);
        zzavr.put(4, zzmd.zzv.zzb.TYPE_PHONE);
        zzavr.put(5, zzmd.zzv.zzb.TYPE_PRODUCT);
        zzavr.put(6, zzmd.zzv.zzb.TYPE_SMS);
        zzavr.put(7, zzmd.zzv.zzb.TYPE_TEXT);
        zzavr.put(8, zzmd.zzv.zzb.TYPE_URL);
        zzavr.put(9, zzmd.zzv.zzb.TYPE_WIFI);
        zzavr.put(10, zzmd.zzv.zzb.TYPE_GEO);
        zzavr.put(11, zzmd.zzv.zzb.TYPE_CALENDAR_EVENT);
        zzavr.put(12, zzmd.zzv.zzb.TYPE_DRIVER_LICENSE);
    }
}
