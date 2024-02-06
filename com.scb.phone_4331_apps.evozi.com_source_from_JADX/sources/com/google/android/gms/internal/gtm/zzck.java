package com.google.android.gms.internal.gtm;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;

final class zzck extends zzan {
    /* access modifiers changed from: private */
    public static final byte[] zzabr = "\n".getBytes();
    private final String zzabp = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", zzao.VERSION, Build.VERSION.RELEASE, zzcz.zza(Locale.getDefault()), Build.MODEL, Build.ID});
    private final zzcv zzabq;

    zzck(zzap zzap) {
        super(zzap);
        this.zzabq = new zzcv(zzap.zzcn());
    }

    /* access modifiers changed from: protected */
    public final void zzaw() {
        zza("Network initialized. User agent", this.zzabp);
    }

    public final boolean zzfr() {
        NetworkInfo networkInfo;
        zzk.zzav();
        zzdb();
        try {
            networkInfo = ((ConnectivityManager) getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        zzq("No network connectivity");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0155, code lost:
        if (zza(r5) == 200) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0195, code lost:
        if (zza(r6, r5) == 200) goto L_0x0197;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b1 A[EDGE_INSN: B:71:0x01b1->B:67:0x01b1 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Long> zzb(java.util.List<com.google.android.gms.internal.gtm.zzcd> r9) {
        /*
            r8 = this;
            com.google.android.gms.analytics.zzk.zzav()
            r8.zzdb()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            com.google.android.gms.internal.gtm.zzbq r0 = r8.zzcp()
            java.util.Set r0 = r0.zzew()
            boolean r0 = r0.isEmpty()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0057
            com.google.android.gms.internal.gtm.zzcv r0 = r8.zzabq
            com.google.android.gms.internal.gtm.zzbz<java.lang.Integer> r3 = com.google.android.gms.internal.gtm.zzby.zzaab
            java.lang.Object r3 = r3.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r3 = (long) r3
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            boolean r0 = r0.zzj(r3)
            if (r0 != 0) goto L_0x0032
            goto L_0x0057
        L_0x0032:
            com.google.android.gms.internal.gtm.zzbz<java.lang.String> r0 = com.google.android.gms.internal.gtm.zzby.zzzu
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.internal.gtm.zzbg r0 = com.google.android.gms.internal.gtm.zzbg.zzz(r0)
            com.google.android.gms.internal.gtm.zzbg r3 = com.google.android.gms.internal.gtm.zzbg.NONE
            if (r0 == r3) goto L_0x0044
            r0 = r1
            goto L_0x0045
        L_0x0044:
            r0 = r2
        L_0x0045:
            com.google.android.gms.internal.gtm.zzbz<java.lang.String> r3 = com.google.android.gms.internal.gtm.zzby.zzzv
            java.lang.Object r3 = r3.get()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.internal.gtm.zzbm r3 = com.google.android.gms.internal.gtm.zzbm.zzaa(r3)
            com.google.android.gms.internal.gtm.zzbm r4 = com.google.android.gms.internal.gtm.zzbm.GZIP
            if (r3 != r4) goto L_0x0058
            r3 = r1
            goto L_0x0059
        L_0x0057:
            r0 = r2
        L_0x0058:
            r3 = r2
        L_0x0059:
            r4 = 200(0xc8, float:2.8E-43)
            if (r0 == 0) goto L_0x0102
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ r1
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            int r1 = r9.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Uploading batched hits. compression, count"
            r8.zza(r2, r0, r1)
            com.google.android.gms.internal.gtm.zzcl r0 = new com.google.android.gms.internal.gtm.zzcl
            r0.<init>(r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0084:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r9.next()
            com.google.android.gms.internal.gtm.zzcd r2 = (com.google.android.gms.internal.gtm.zzcd) r2
            boolean r5 = r0.zze(r2)
            if (r5 == 0) goto L_0x00a2
            long r5 = r2.zzfg()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r1.add(r2)
            goto L_0x0084
        L_0x00a2:
            int r9 = r0.zzfu()
            if (r9 != 0) goto L_0x00a9
            return r1
        L_0x00a9:
            java.net.URL r9 = r8.zzfs()
            if (r9 != 0) goto L_0x00b5
            java.lang.String r9 = "Failed to build batching endpoint url"
            r8.zzu(r9)
            goto L_0x00fd
        L_0x00b5:
            if (r3 == 0) goto L_0x00c0
            byte[] r2 = r0.getPayload()
            int r9 = r8.zzb((java.net.URL) r9, (byte[]) r2)
            goto L_0x00c8
        L_0x00c0:
            byte[] r2 = r0.getPayload()
            int r9 = r8.zza((java.net.URL) r9, (byte[]) r2)
        L_0x00c8:
            if (r4 != r9) goto L_0x00d8
            int r9 = r0.zzfu()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "Batched upload completed. Hits batched"
            r8.zza(r0, r9)
            return r1
        L_0x00d8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.String r1 = "Network error uploading hits. status code"
            r8.zza(r1, r0)
            com.google.android.gms.internal.gtm.zzbq r0 = r8.zzcp()
            java.util.Set r0 = r0.zzew()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r0.contains(r9)
            if (r9 == 0) goto L_0x00fd
            java.lang.String r9 = "Server instructed the client to stop batching"
            r8.zzt(r9)
            com.google.android.gms.internal.gtm.zzcv r9 = r8.zzabq
            r9.start()
        L_0x00fd:
            java.util.List r9 = java.util.Collections.emptyList()
            return r9
        L_0x0102:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r9.size()
            r0.<init>(r3)
            java.util.Iterator r9 = r9.iterator()
        L_0x010f:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x01b1
            java.lang.Object r3 = r9.next()
            com.google.android.gms.internal.gtm.zzcd r3 = (com.google.android.gms.internal.gtm.zzcd) r3
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            boolean r5 = r3.zzfj()
            r5 = r5 ^ r1
            java.lang.String r5 = r8.zza((com.google.android.gms.internal.gtm.zzcd) r3, (boolean) r5)
            if (r5 != 0) goto L_0x0133
            com.google.android.gms.internal.gtm.zzci r5 = r8.zzco()
            java.lang.String r6 = "Error formatting hit for upload"
            r5.zza((com.google.android.gms.internal.gtm.zzcd) r3, (java.lang.String) r6)
            goto L_0x0197
        L_0x0133:
            int r6 = r5.length()
            com.google.android.gms.internal.gtm.zzbz<java.lang.Integer> r7 = com.google.android.gms.internal.gtm.zzby.zzzt
            java.lang.Object r7 = r7.get()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r6 > r7) goto L_0x0158
            java.net.URL r5 = r8.zzb((com.google.android.gms.internal.gtm.zzcd) r3, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0151
            java.lang.String r5 = "Failed to build collect GET endpoint url"
            r8.zzu(r5)
            goto L_0x0199
        L_0x0151:
            int r5 = r8.zza((java.net.URL) r5)
            if (r5 != r4) goto L_0x0199
            goto L_0x0197
        L_0x0158:
            java.lang.String r5 = r8.zza((com.google.android.gms.internal.gtm.zzcd) r3, (boolean) r2)
            if (r5 != 0) goto L_0x0168
            com.google.android.gms.internal.gtm.zzci r5 = r8.zzco()
            java.lang.String r6 = "Error formatting hit for POST upload"
            r5.zza((com.google.android.gms.internal.gtm.zzcd) r3, (java.lang.String) r6)
            goto L_0x0197
        L_0x0168:
            byte[] r5 = r5.getBytes()
            int r6 = r5.length
            com.google.android.gms.internal.gtm.zzbz<java.lang.Integer> r7 = com.google.android.gms.internal.gtm.zzby.zzzy
            java.lang.Object r7 = r7.get()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r6 <= r7) goto L_0x0185
            com.google.android.gms.internal.gtm.zzci r5 = r8.zzco()
            java.lang.String r6 = "Hit payload exceeds size limit"
            r5.zza((com.google.android.gms.internal.gtm.zzcd) r3, (java.lang.String) r6)
            goto L_0x0197
        L_0x0185:
            java.net.URL r6 = r8.zzd(r3)
            if (r6 != 0) goto L_0x0191
            java.lang.String r5 = "Failed to build collect POST endpoint url"
            r8.zzu(r5)
            goto L_0x0199
        L_0x0191:
            int r5 = r8.zza((java.net.URL) r6, (byte[]) r5)
            if (r5 != r4) goto L_0x0199
        L_0x0197:
            r5 = r1
            goto L_0x019a
        L_0x0199:
            r5 = r2
        L_0x019a:
            if (r5 == 0) goto L_0x01b1
            long r5 = r3.zzfg()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0.add(r3)
            int r3 = r0.size()
            int r5 = com.google.android.gms.internal.gtm.zzbq.zzer()
            if (r3 < r5) goto L_0x010f
        L_0x01b1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzb(java.util.List):java.util.List");
    }

    private final int zza(URL url) {
        Preconditions.checkNotNull(url);
        zzb("GET request", url);
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection zzb = zzb(url);
            zzb.connect();
            zza(zzb);
            int responseCode = zzb.getResponseCode();
            if (responseCode == 200) {
                zzcs().zzcl();
            }
            zzb("GET status", Integer.valueOf(responseCode));
            if (zzb != null) {
                zzb.disconnect();
            }
            return responseCode;
        } catch (IOException e) {
            zzd("Network GET connection error", e);
            if (httpURLConnection == null) {
                return 0;
            }
            httpURLConnection.disconnect();
            return 0;
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a A[SYNTHETIC, Splitter:B:29:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f A[SYNTHETIC, Splitter:B:38:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zza(java.net.URL r6, byte[] r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Error closing http post connection output stream"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            int r1 = r7.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "POST bytes, url"
            r5.zzb(r2, r1, r6)
            boolean r1 = zzda()
            if (r1 == 0) goto L_0x0022
            java.lang.String r1 = new java.lang.String
            r1.<init>(r7)
            java.lang.String r2 = "Post payload\n"
            r5.zza(r2, r1)
        L_0x0022:
            r1 = 0
            android.content.Context r2 = r5.getContext()     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            r2.getPackageName()     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            java.net.HttpURLConnection r6 = r5.zzb((java.net.URL) r6)     // Catch:{ IOException -> 0x0070, all -> 0x006d }
            r2 = 1
            r6.setDoOutput(r2)     // Catch:{ IOException -> 0x006b }
            int r2 = r7.length     // Catch:{ IOException -> 0x006b }
            r6.setFixedLengthStreamingMode(r2)     // Catch:{ IOException -> 0x006b }
            r6.connect()     // Catch:{ IOException -> 0x006b }
            java.io.OutputStream r1 = r6.getOutputStream()     // Catch:{ IOException -> 0x006b }
            r1.write(r7)     // Catch:{ IOException -> 0x006b }
            r5.zza((java.net.HttpURLConnection) r6)     // Catch:{ IOException -> 0x006b }
            int r7 = r6.getResponseCode()     // Catch:{ IOException -> 0x006b }
            r2 = 200(0xc8, float:2.8E-43)
            if (r7 != r2) goto L_0x0052
            com.google.android.gms.internal.gtm.zzae r2 = r5.zzcs()     // Catch:{ IOException -> 0x006b }
            r2.zzcl()     // Catch:{ IOException -> 0x006b }
        L_0x0052:
            java.lang.String r2 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x006b }
            r5.zzb(r2, r3)     // Catch:{ IOException -> 0x006b }
            if (r1 == 0) goto L_0x0065
            r1.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0065
        L_0x0061:
            r1 = move-exception
            r5.zze(r0, r1)
        L_0x0065:
            if (r6 == 0) goto L_0x006a
            r6.disconnect()
        L_0x006a:
            return r7
        L_0x006b:
            r7 = move-exception
            goto L_0x0073
        L_0x006d:
            r6 = move-exception
            r7 = r1
            goto L_0x008d
        L_0x0070:
            r6 = move-exception
            r7 = r6
            r6 = r1
        L_0x0073:
            java.lang.String r2 = "Network POST connection error"
            r5.zzd(r2, r7)     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0082
            r1.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0082
        L_0x007e:
            r7 = move-exception
            r5.zze(r0, r7)
        L_0x0082:
            if (r6 == 0) goto L_0x0087
            r6.disconnect()
        L_0x0087:
            r6 = 0
            return r6
        L_0x0089:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x008d:
            if (r1 == 0) goto L_0x0097
            r1.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r1 = move-exception
            r5.zze(r0, r1)
        L_0x0097:
            if (r7 == 0) goto L_0x009c
            r7.disconnect()
        L_0x009c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zza(java.net.URL, byte[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd A[SYNTHETIC, Splitter:B:41:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e3 A[SYNTHETIC, Splitter:B:50:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzb(java.net.URL r10, byte[] r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Error closing http compressed post connection output stream"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            r1 = 0
            android.content.Context r2 = r9.getContext()     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r2.getPackageName()     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r2.<init>()     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            java.util.zip.GZIPOutputStream r3 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r3.write(r11)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r3.close()     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r2.close()     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            byte[] r2 = r2.toByteArray()     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            int r3 = r2.length     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            int r4 = r2.length     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            long r4 = (long) r4     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r6 = 100
            long r4 = r4 * r6
            int r6 = r11.length     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            long r6 = (long) r6     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            long r4 = r4 / r6
            java.lang.String r6 = "POST compressed size, ratio %, url"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r9.zza(r6, r3, r4, r10)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            int r3 = r2.length     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            int r4 = r11.length     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            if (r3 <= r4) goto L_0x0050
            int r3 = r2.length     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            int r4 = r11.length     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            java.lang.String r5 = "Compressed payload is larger then uncompressed. compressed, uncompressed"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r9.zzc(r5, r3, r4)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
        L_0x0050:
            boolean r3 = zzda()     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            if (r3 == 0) goto L_0x0072
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r3.<init>(r11)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            int r11 = r3.length()     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            java.lang.String r4 = "\n"
            if (r11 == 0) goto L_0x0068
            java.lang.String r11 = r4.concat(r3)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            goto L_0x006d
        L_0x0068:
            java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r11.<init>(r4)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
        L_0x006d:
            java.lang.String r3 = "Post payload"
            r9.zza(r3, r11)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
        L_0x0072:
            java.net.HttpURLConnection r10 = r9.zzb((java.net.URL) r10)     // Catch:{ IOException -> 0x00c2, all -> 0x00bf }
            r11 = 1
            r10.setDoOutput(r11)     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            java.lang.String r11 = "Content-Encoding"
            java.lang.String r3 = "gzip"
            r10.addRequestProperty(r11, r3)     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            int r11 = r2.length     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            r10.setFixedLengthStreamingMode(r11)     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            r10.connect()     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            java.io.OutputStream r11 = r10.getOutputStream()     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            r11.write(r2)     // Catch:{ IOException -> 0x00b3 }
            r11.close()     // Catch:{ IOException -> 0x00b3 }
            r9.zza((java.net.HttpURLConnection) r10)     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            int r11 = r10.getResponseCode()     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r11 != r2) goto L_0x00a4
            com.google.android.gms.internal.gtm.zzae r2 = r9.zzcs()     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            r2.zzcl()     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
        L_0x00a4:
            java.lang.String r2 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            r9.zzb(r2, r3)     // Catch:{ IOException -> 0x00ba, all -> 0x00b5 }
            if (r10 == 0) goto L_0x00b2
            r10.disconnect()
        L_0x00b2:
            return r11
        L_0x00b3:
            r1 = move-exception
            goto L_0x00c6
        L_0x00b5:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x00e1
        L_0x00ba:
            r11 = move-exception
            r8 = r1
            r1 = r11
            r11 = r8
            goto L_0x00c6
        L_0x00bf:
            r10 = move-exception
            r11 = r1
            goto L_0x00e1
        L_0x00c2:
            r10 = move-exception
            r11 = r1
            r1 = r10
            r10 = r11
        L_0x00c6:
            java.lang.String r2 = "Network compressed POST connection error"
            r9.zzd(r2, r1)     // Catch:{ all -> 0x00dc }
            if (r11 == 0) goto L_0x00d5
            r11.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00d5
        L_0x00d1:
            r11 = move-exception
            r9.zze(r0, r11)
        L_0x00d5:
            if (r10 == 0) goto L_0x00da
            r10.disconnect()
        L_0x00da:
            r10 = 0
            return r10
        L_0x00dc:
            r1 = move-exception
            r8 = r11
            r11 = r10
            r10 = r1
            r1 = r8
        L_0x00e1:
            if (r1 == 0) goto L_0x00eb
            r1.close()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00eb
        L_0x00e7:
            r1 = move-exception
            r9.zze(r0, r1)
        L_0x00eb:
            if (r11 == 0) goto L_0x00f0
            r11.disconnect()
        L_0x00f0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zzb(java.net.URL, byte[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0021 A[SYNTHETIC, Splitter:B:18:0x0021] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(java.net.HttpURLConnection r4) throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "Error closing http connection input stream"
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ all -> 0x001d }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x001b }
        L_0x000a:
            int r2 = r4.read(r1)     // Catch:{ all -> 0x001b }
            if (r2 > 0) goto L_0x000a
            if (r4 == 0) goto L_0x001a
            r4.close()     // Catch:{ IOException -> 0x0016 }
            return
        L_0x0016:
            r4 = move-exception
            r3.zze(r0, r4)
        L_0x001a:
            return
        L_0x001b:
            r1 = move-exception
            goto L_0x001f
        L_0x001d:
            r1 = move-exception
            r4 = 0
        L_0x001f:
            if (r4 == 0) goto L_0x0029
            r4.close()     // Catch:{ IOException -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r4 = move-exception
            r3.zze(r0, r4)
        L_0x0029:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzck.zza(java.net.HttpURLConnection):void");
    }

    private final HttpURLConnection zzb(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(zzby.zzaad.get().intValue());
            httpURLConnection.setReadTimeout(zzby.zzaae.get().intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.zzabp);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    private final URL zzd(zzcd zzcd) {
        String str;
        String str2;
        if (zzcd.zzfj()) {
            String valueOf = String.valueOf(zzbq.zzet());
            String valueOf2 = String.valueOf(zzbq.zzev());
            if (valueOf2.length() != 0) {
                str = valueOf.concat(valueOf2);
                return new URL(str);
            }
            str2 = new String(valueOf);
        } else {
            String valueOf3 = String.valueOf(zzbq.zzeu());
            String valueOf4 = String.valueOf(zzbq.zzev());
            if (valueOf4.length() != 0) {
                str = valueOf3.concat(valueOf4);
                return new URL(str);
            }
            str2 = new String(valueOf3);
        }
        str = str2;
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzb(zzcd zzcd, String str) {
        String str2;
        if (zzcd.zzfj()) {
            String zzet = zzbq.zzet();
            String zzev = zzbq.zzev();
            StringBuilder sb = new StringBuilder(String.valueOf(zzet).length() + 1 + String.valueOf(zzev).length() + String.valueOf(str).length());
            sb.append(zzet);
            sb.append(zzev);
            sb.append("?");
            sb.append(str);
            str2 = sb.toString();
        } else {
            String zzeu = zzbq.zzeu();
            String zzev2 = zzbq.zzev();
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzeu).length() + 1 + String.valueOf(zzev2).length() + String.valueOf(str).length());
            sb2.append(zzeu);
            sb2.append(zzev2);
            sb2.append("?");
            sb2.append(str);
            str2 = sb2.toString();
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    private final URL zzfs() {
        String valueOf = String.valueOf(zzbq.zzet());
        String valueOf2 = String.valueOf(zzby.zzzs.get());
        try {
            return new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } catch (MalformedURLException e) {
            zze("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final String zza(zzcd zzcd, boolean z) {
        String str;
        Preconditions.checkNotNull(zzcd);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry next : zzcd.zzdm().entrySet()) {
                String str2 = (String) next.getKey();
                if (!"ht".equals(str2) && !"qt".equals(str2) && !"AppUID".equals(str2) && !"z".equals(str2) && !"_gmsv".equals(str2)) {
                    zza(sb, str2, (String) next.getValue());
                }
            }
            zza(sb, "ht", String.valueOf(zzcd.zzfh()));
            zza(sb, "qt", String.valueOf(zzcn().currentTimeMillis() - zzcd.zzfh()));
            if (z) {
                long zzfk = zzcd.zzfk();
                if (zzfk != 0) {
                    str = String.valueOf(zzfk);
                } else {
                    str = String.valueOf(zzcd.zzfg());
                }
                zza(sb, "z", str);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            zze("Failed to encode name or value", e);
            return null;
        }
    }

    private static void zza(StringBuilder sb, String str, String str2) throws UnsupportedEncodingException {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }
}
