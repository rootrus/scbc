package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfl {
    private final String zza;
    private final Bundle zzb = new Bundle();
    private boolean zzc;
    private Bundle zzd;
    private final /* synthetic */ zzfg zze;

    public zzfl(zzfg zzfg, String str, Bundle bundle) {
        this.zze = zzfg;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r12.zze.zzr().zzf().zza("Error reading value from SharedPreferences. Value dropped");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle zza() {
        /*
            r12 = this;
            boolean r0 = r12.zzc
            if (r0 != 0) goto L_0x00ce
            r0 = 1
            r12.zzc = r0
            com.google.android.gms.measurement.internal.zzfg r1 = r12.zze
            android.content.SharedPreferences r1 = r1.zzg()
            java.lang.String r2 = r12.zza
            r3 = 0
            java.lang.String r1 = r1.getString(r2, r3)
            if (r1 == 0) goto L_0x00c6
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ JSONException -> 0x00b7 }
            r2.<init>()     // Catch:{ JSONException -> 0x00b7 }
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00b7 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x00b7 }
            r1 = 0
            r4 = r1
        L_0x0022:
            int r5 = r3.length()     // Catch:{ JSONException -> 0x00b7 }
            if (r4 >= r5) goto L_0x00b4
            org.json.JSONObject r5 = r3.getJSONObject(r4)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r6 = "n"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r7 = "t"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r8 = -1
            int r9 = r7.hashCode()     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r10 = 100
            r11 = 2
            if (r9 == r10) goto L_0x005f
            r10 = 108(0x6c, float:1.51E-43)
            if (r9 == r10) goto L_0x0055
            r10 = 115(0x73, float:1.61E-43)
            if (r9 == r10) goto L_0x004b
            goto L_0x0068
        L_0x004b:
            java.lang.String r9 = "s"
            boolean r9 = r7.equals(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            if (r9 == 0) goto L_0x0068
            r8 = r1
            goto L_0x0068
        L_0x0055:
            java.lang.String r9 = "l"
            boolean r9 = r7.equals(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            if (r9 == 0) goto L_0x0068
            r8 = r11
            goto L_0x0068
        L_0x005f:
            java.lang.String r9 = "d"
            boolean r9 = r7.equals(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            if (r9 == 0) goto L_0x0068
            r8 = r0
        L_0x0068:
            java.lang.String r9 = "v"
            if (r8 == 0) goto L_0x0099
            if (r8 == r0) goto L_0x008d
            if (r8 == r11) goto L_0x0081
            com.google.android.gms.measurement.internal.zzfg r5 = r12.zze     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            com.google.android.gms.measurement.internal.zzeu r5 = r5.zzr()     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzf()     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            java.lang.String r6 = "Unrecognized persisted bundle type. Type"
            r5.zza(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x0081:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            long r7 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r2.putLong(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x008d:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            double r7 = java.lang.Double.parseDouble(r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r2.putDouble(r6, r7)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x0099:
            java.lang.String r5 = r5.getString(r9)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            r2.putString(r6, r5)     // Catch:{ NumberFormatException | JSONException -> 0x00a1 }
            goto L_0x00b0
        L_0x00a1:
            com.google.android.gms.measurement.internal.zzfg r5 = r12.zze     // Catch:{ JSONException -> 0x00b7 }
            com.google.android.gms.measurement.internal.zzeu r5 = r5.zzr()     // Catch:{ JSONException -> 0x00b7 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzf()     // Catch:{ JSONException -> 0x00b7 }
            java.lang.String r6 = "Error reading value from SharedPreferences. Value dropped"
            r5.zza(r6)     // Catch:{ JSONException -> 0x00b7 }
        L_0x00b0:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x00b4:
            r12.zzd = r2     // Catch:{ JSONException -> 0x00b7 }
            goto L_0x00c6
        L_0x00b7:
            com.google.android.gms.measurement.internal.zzfg r0 = r12.zze
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()
            java.lang.String r1 = "Error loading bundle from SharedPreferences. Values will be lost"
            r0.zza(r1)
        L_0x00c6:
            android.os.Bundle r0 = r12.zzd
            if (r0 != 0) goto L_0x00ce
            android.os.Bundle r0 = r12.zzb
            r12.zzd = r0
        L_0x00ce:
            android.os.Bundle r0 = r12.zzd
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfl.zza():android.os.Bundle");
    }

    public final void zza(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.zze.zzg().edit();
        if (bundle.size() == 0) {
            edit.remove(this.zza);
        } else {
            edit.putString(this.zza, zzb(bundle));
        }
        edit.apply();
        this.zzd = bundle;
    }

    private final String zzb(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str);
                    jSONObject.put("v", String.valueOf(obj));
                    if (obj instanceof String) {
                        jSONObject.put("t", "s");
                    } else if (obj instanceof Long) {
                        jSONObject.put("t", "l");
                    } else if (obj instanceof Double) {
                        jSONObject.put("t", KtaJsonExactionHelper.OBJECT);
                    } else {
                        this.zze.zzr().zzf().zza("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    this.zze.zzr().zzf().zza("Cannot serialize bundle value to SharedPreferences", e);
                }
            }
        }
        return jSONArray.toString();
    }
}
