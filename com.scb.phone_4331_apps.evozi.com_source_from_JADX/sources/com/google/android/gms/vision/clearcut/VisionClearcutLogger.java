package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.internal.vision.zzct;
import com.google.android.gms.internal.vision.zzdu;
import com.google.android.gms.internal.vision.zzjt;
import com.google.android.gms.vision.C7601L;

public class VisionClearcutLogger {
    private final ClearcutLogger zzbw;
    private boolean zzbx = true;

    public VisionClearcutLogger(Context context) {
        this.zzbw = new ClearcutLogger(context, "VISION", (String) null);
    }

    public final void zzb(int i, zzdu zzdu) {
        int zzeq = zzdu.zzeq();
        byte[] bArr = new byte[zzeq];
        zzjt.zza(zzdu, bArr, 0, zzeq);
        if (i < 0 || i > 3) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Illegal event code: ");
            sb.append(i);
            String obj = sb.toString();
            Object[] objArr = new Object[0];
            if (C7601L.isLoggable(4)) {
                Log.i("Vision", String.format(obj, objArr));
                return;
            }
            return;
        }
        try {
            if (this.zzbx) {
                this.zzbw.newEvent(bArr).setEventCode(i).log();
                return;
            }
            zzdu zzdu2 = new zzdu();
            try {
                zzjt.zza(zzdu2, bArr);
                C7601L.zzc("Would have logged:\n%s", zzdu2.toString());
            } catch (Exception e) {
                C7601L.zza(e, "Parsing error", new Object[0]);
            }
        } catch (Exception e2) {
            zzct.zza(e2);
            C7601L.zza(e2, "Failed to log", new Object[0]);
        }
    }
}
