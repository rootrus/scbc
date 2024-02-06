package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzda extends zzcv<Boolean> {
    zzda(zzdb zzdb, String str, Boolean bool, boolean z) {
        super(zzdb, str, bool, z, (zzcx) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzcg.zzb.matcher(str).matches()) {
                return true;
            }
            if (zzcg.zzc.matcher(str).matches()) {
                return false;
            }
        }
        String zzb = super.zzb();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(zzb);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
