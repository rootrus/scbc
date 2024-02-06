package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

final class zzff implements Runnable {
    private final URL zza;
    private final byte[] zzb;
    private final zzfd zzc;
    private final String zzd;
    private final Map<String, String> zze;
    private final /* synthetic */ zzfb zzf;

    public zzff(zzfb zzfb, String str, URL url, byte[] bArr, Map<String, String> map, zzfd zzfd) {
        this.zzf = zzfb;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfd);
        this.zza = url;
        this.zzb = bArr;
        this.zzc = zzfd;
        this.zzd = str;
        this.zze = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1 A[SYNTHETIC, Splitter:B:44:0x00d1] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0111 A[SYNTHETIC, Splitter:B:57:0x0111] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.zzfb r0 = r1.zzf
            r0.zzc()
            r3 = 0
            r4 = 0
            com.google.android.gms.measurement.internal.zzfb r0 = r1.zzf     // Catch:{ IOException -> 0x0106, all -> 0x00ca }
            java.net.URL r5 = r1.zza     // Catch:{ IOException -> 0x0106, all -> 0x00ca }
            java.net.HttpURLConnection r5 = r0.zza((java.net.URL) r5)     // Catch:{ IOException -> 0x0106, all -> 0x00ca }
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.zze     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            if (r0 == 0) goto L_0x003d
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.zze     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
        L_0x0021:
            boolean r6 = r0.hasNext()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            if (r6 == 0) goto L_0x003d
            java.lang.Object r6 = r0.next()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            r5.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            goto L_0x0021
        L_0x003d:
            byte[] r0 = r1.zzb     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.measurement.internal.zzfb r0 = r1.zzf     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            com.google.android.gms.measurement.internal.zzkn r0 = r0.zzg()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            byte[] r6 = r1.zzb     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            byte[] r0 = r0.zzc(r6)     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            com.google.android.gms.measurement.internal.zzfb r6 = r1.zzf     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            com.google.android.gms.measurement.internal.zzeu r6 = r6.zzr()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzx()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.lang.String r7 = "Uploading data. size"
            int r8 = r0.length     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            r6.zza(r7, r8)     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            r6 = 1
            r5.setDoOutput(r6)     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r5.addRequestProperty(r6, r7)     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            int r6 = r0.length     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            r5.setFixedLengthStreamingMode(r6)     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            r5.connect()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.io.OutputStream r6 = r5.getOutputStream()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            r6.write(r0)     // Catch:{ IOException -> 0x0083, all -> 0x007e }
            r6.close()     // Catch:{ IOException -> 0x0083, all -> 0x007e }
            goto L_0x008d
        L_0x007e:
            r0 = move-exception
            r7 = r3
            r10 = r4
            r4 = r6
            goto L_0x00ce
        L_0x0083:
            r0 = move-exception
            r18 = r0
            r17 = r3
            r20 = r4
            r4 = r6
            goto L_0x010f
        L_0x008d:
            int r10 = r5.getResponseCode()     // Catch:{ IOException -> 0x00c8, all -> 0x00c6 }
            java.util.Map r13 = r5.getHeaderFields()     // Catch:{ IOException -> 0x00c2, all -> 0x00bd }
            com.google.android.gms.measurement.internal.zzfb r0 = r1.zzf     // Catch:{ IOException -> 0x00bb, all -> 0x00b6 }
            byte[] r12 = com.google.android.gms.measurement.internal.zzfb.zza((java.net.HttpURLConnection) r5)     // Catch:{ IOException -> 0x00bb, all -> 0x00b6 }
            if (r5 == 0) goto L_0x00a0
            r5.disconnect()
        L_0x00a0:
            com.google.android.gms.measurement.internal.zzfb r0 = r1.zzf
            com.google.android.gms.measurement.internal.zzfv r0 = r0.zzq()
            com.google.android.gms.measurement.internal.zzfc r2 = new com.google.android.gms.measurement.internal.zzfc
            java.lang.String r8 = r1.zzd
            com.google.android.gms.measurement.internal.zzfd r9 = r1.zzc
            r11 = 0
            r14 = 0
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.zza((java.lang.Runnable) r2)
            return
        L_0x00b6:
            r0 = move-exception
            r3 = r0
            r7 = r10
            r10 = r13
            goto L_0x00cf
        L_0x00bb:
            r0 = move-exception
            goto L_0x00c4
        L_0x00bd:
            r0 = move-exception
            r3 = r0
            r7 = r10
            r10 = r4
            goto L_0x00cf
        L_0x00c2:
            r0 = move-exception
            r13 = r4
        L_0x00c4:
            r3 = r10
            goto L_0x0109
        L_0x00c6:
            r0 = move-exception
            goto L_0x00cc
        L_0x00c8:
            r0 = move-exception
            goto L_0x0108
        L_0x00ca:
            r0 = move-exception
            r5 = r4
        L_0x00cc:
            r7 = r3
            r10 = r4
        L_0x00ce:
            r3 = r0
        L_0x00cf:
            if (r4 == 0) goto L_0x00ea
            r4.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00ea
        L_0x00d5:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.zzfb r0 = r1.zzf
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()
            java.lang.String r6 = r1.zzd
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r6)
            r0.zza(r2, r6, r4)
        L_0x00ea:
            if (r5 == 0) goto L_0x00ef
            r5.disconnect()
        L_0x00ef:
            com.google.android.gms.measurement.internal.zzfb r0 = r1.zzf
            com.google.android.gms.measurement.internal.zzfv r0 = r0.zzq()
            com.google.android.gms.measurement.internal.zzfc r2 = new com.google.android.gms.measurement.internal.zzfc
            java.lang.String r5 = r1.zzd
            com.google.android.gms.measurement.internal.zzfd r6 = r1.zzc
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.zza((java.lang.Runnable) r2)
            throw r3
        L_0x0106:
            r0 = move-exception
            r5 = r4
        L_0x0108:
            r13 = r4
        L_0x0109:
            r18 = r0
            r17 = r3
            r20 = r13
        L_0x010f:
            if (r4 == 0) goto L_0x012a
            r4.close()     // Catch:{ IOException -> 0x0115 }
            goto L_0x012a
        L_0x0115:
            r0 = move-exception
            r3 = r0
            com.google.android.gms.measurement.internal.zzfb r0 = r1.zzf
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()
            java.lang.String r4 = r1.zzd
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r4)
            r0.zza(r2, r4, r3)
        L_0x012a:
            if (r5 == 0) goto L_0x012f
            r5.disconnect()
        L_0x012f:
            com.google.android.gms.measurement.internal.zzfb r0 = r1.zzf
            com.google.android.gms.measurement.internal.zzfv r0 = r0.zzq()
            com.google.android.gms.measurement.internal.zzfc r2 = new com.google.android.gms.measurement.internal.zzfc
            java.lang.String r15 = r1.zzd
            com.google.android.gms.measurement.internal.zzfd r3 = r1.zzc
            r19 = 0
            r21 = 0
            r14 = r2
            r16 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r0.zza((java.lang.Runnable) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzff.run():void");
    }
}
