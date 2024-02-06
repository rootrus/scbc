package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.List;
import java.util.Map;

final class zzif implements Runnable {
    private final URL zza;
    private final byte[] zzb = null;
    private final zzic zzc;
    private final String zzd;
    private final Map<String, String> zze;
    private final /* synthetic */ zzid zzf;

    public zzif(zzid zzid, String str, URL url, byte[] bArr, Map<String, String> map, zzic zzic) {
        this.zzf = zzid;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzic);
        this.zza = url;
        this.zzc = zzic;
        this.zzd = str;
        this.zze = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.zzid r0 = r6.zzf
            r0.zzc()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.zzid r2 = r6.zzf     // Catch:{ IOException -> 0x0069, all -> 0x005c }
            java.net.URL r3 = r6.zza     // Catch:{ IOException -> 0x0069, all -> 0x005c }
            java.net.HttpURLConnection r2 = r2.zza((java.net.URL) r3)     // Catch:{ IOException -> 0x0069, all -> 0x005c }
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.zze     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.zze     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            r2.addRequestProperty(r5, r4)     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            goto L_0x001d
        L_0x0039:
            int r0 = r2.getResponseCode()     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x0058, all -> 0x0054 }
            com.google.android.gms.measurement.internal.zzid r4 = r6.zzf     // Catch:{ IOException -> 0x0052, all -> 0x0050 }
            byte[] r4 = com.google.android.gms.measurement.internal.zzid.zza((java.net.HttpURLConnection) r2)     // Catch:{ IOException -> 0x0052, all -> 0x0050 }
            if (r2 == 0) goto L_0x004c
            r2.disconnect()
        L_0x004c:
            r6.zzb(r0, r1, r4, r3)
            return
        L_0x0050:
            r4 = move-exception
            goto L_0x0060
        L_0x0052:
            r4 = move-exception
            goto L_0x006d
        L_0x0054:
            r3 = move-exception
            r4 = r3
            r3 = r1
            goto L_0x0060
        L_0x0058:
            r3 = move-exception
            r4 = r3
            r3 = r1
            goto L_0x006d
        L_0x005c:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r3 = r2
        L_0x0060:
            if (r2 == 0) goto L_0x0065
            r2.disconnect()
        L_0x0065:
            r6.zzb(r0, r1, r1, r3)
            throw r4
        L_0x0069:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r3 = r2
        L_0x006d:
            if (r2 == 0) goto L_0x0072
            r2.disconnect()
        L_0x0072:
            r6.zzb(r0, r4, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzif.run():void");
    }

    private final void zzb(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.zzf.zzq().zza((Runnable) new zzie(this, i, exc, bArr, map));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        this.zzc.zza(this.zzd, i, exc, bArr, map);
    }
}
