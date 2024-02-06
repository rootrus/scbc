package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

final class zzfu implements zzed {
    private final String zzabp;
    private final zzfx zzapo;
    private final zzfw zzapp;
    private final Context zzrm;

    private zzfu(zzfx zzfx, Context context, zzfw zzfw) {
        String str;
        this.zzapo = zzfx;
        this.zzrm = context.getApplicationContext();
        this.zzapp = zzfw;
        String str2 = Build.VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        if (locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (!(locale.getCountry() == null || locale.getCountry().length() == 0)) {
                sb.append("-");
                sb.append(locale.getCountry().toLowerCase());
            }
            str = sb.toString();
        }
        this.zzabp = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleTagManager", "5.06", str2, str, Build.MODEL, Build.ID});
    }

    zzfu(Context context, zzfw zzfw) {
        this(new zzfv(), context, zzfw);
    }

    public final boolean zzhy() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzrm.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        zzev.zzab("...no network connectivity");
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        r4 = r5.readLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f4, code lost:
        if (r4 == null) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f6, code lost:
        r0.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01fa, code lost:
        r0 = java.lang.String.valueOf(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0208, code lost:
        if (r0.length() == 0) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r0 = "Error Message: ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x020f, code lost:
        r0 = new java.lang.String("Error Message: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0214, code lost:
        com.google.android.gms.internal.gtm.zzev.zzac(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0218, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x021b, code lost:
        if (r5 == null) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0220, code lost:
        r1.zzapp.zzc(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0225, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0226, code lost:
        if (r15 == null) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x022b, code lost:
        r14.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x022f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0230, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0231, code lost:
        if (r5 == null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0236, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0237, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x024b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010e, code lost:
        if (r12 == 0) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0111, code lost:
        if (r12 == 1) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0113, code lost:
        if (r12 == 2) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0116, code lost:
        if (r12 == 3) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0119, code lost:
        r14.setRequestMethod(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011c, code lost:
        if (r13 == null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011e, code lost:
        r14.setDoOutput(true);
        r4 = r13.getBytes(java.nio.charset.Charset.forName("UTF-8"));
        r14.setFixedLengthStreamingMode(r4.length);
        r5 = new java.io.BufferedOutputStream(r14.getOutputStream());
        r5.write(r4);
        r5.flush();
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0141, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0147, code lost:
        if (r13 == null) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0149, code lost:
        r4 = new java.lang.Object[2];
        r4[0] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014e, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r4[1] = r13;
        com.google.android.gms.internal.gtm.zzev.zzac(java.lang.String.format("Body of %s hit is ignored: %s.", r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015b, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015d, code lost:
        r14.setRequestMethod(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0160, code lost:
        r4 = r14.getResponseCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0166, code lost:
        if (r4 < 200) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016a, code lost:
        if (r4 < 300) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016d, code lost:
        r15 = r14.getInputStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r4 = java.lang.String.valueOf(r11);
        r5 = new java.lang.StringBuilder((java.lang.String.valueOf(r4).length() + 23) + java.lang.String.valueOf(r0).length());
        r5.append("Hit sent to ");
        r5.append(r4);
        r5.append("(method = ");
        r5.append(r0);
        r5.append(")");
        com.google.android.gms.internal.gtm.zzev.zzab(r5.toString());
        r1.zzapp.zza(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b0, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r0 = java.lang.String.valueOf(r11);
        r12 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 39);
        r12.append("Bad response received for ");
        r12.append(r0);
        r12.append(": ");
        r12.append(r4);
        com.google.android.gms.internal.gtm.zzev.zzac(r12.toString());
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r4 = r14.getErrorStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e4, code lost:
        if (r4 == null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e6, code lost:
        r5 = new java.io.BufferedReader(new java.io.InputStreamReader(r4));
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0233 A[SYNTHETIC, Splitter:B:124:0x0233] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0244 A[SYNTHETIC, Splitter:B:134:0x0244] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0236 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0247 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(java.util.List<com.google.android.gms.internal.gtm.zzeh> r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "GET"
            java.lang.String r3 = ": "
            int r0 = r18.size()
            r4 = 40
            int r4 = java.lang.Math.min(r0, r4)
            r6 = 1
            r8 = r6
            r7 = 0
        L_0x0013:
            if (r7 >= r4) goto L_0x029b
            r9 = r18
            java.lang.Object r0 = r9.get(r7)
            r10 = r0
            com.google.android.gms.internal.gtm.zzeh r10 = (com.google.android.gms.internal.gtm.zzeh) r10
            java.net.URL r11 = zzd((com.google.android.gms.internal.gtm.zzeh) r10)
            java.lang.String r0 = r10.zzkj()
            java.util.Map r12 = r10.zzkk()
            java.lang.String r13 = r10.zzkl()
            if (r11 != 0) goto L_0x003b
            java.lang.String r0 = "No destination: discarding hit."
            com.google.android.gms.internal.gtm.zzev.zzac(r0)
            com.google.android.gms.internal.gtm.zzfw r0 = r1.zzapp
            r0.zzb(r10)
            goto L_0x0096
        L_0x003b:
            com.google.android.gms.internal.gtm.zzfx r14 = r1.zzapo     // Catch:{ IOException -> 0x024d }
            java.net.HttpURLConnection r14 = r14.zzc(r11)     // Catch:{ IOException -> 0x024d }
            if (r8 == 0) goto L_0x0049
            android.content.Context r15 = r1.zzrm     // Catch:{ all -> 0x023e }
            com.google.android.gms.internal.gtm.zzex.zzn(r15)     // Catch:{ all -> 0x023e }
            r8 = 0
        L_0x0049:
            java.lang.String r15 = "User-Agent"
            java.lang.String r5 = r1.zzabp     // Catch:{ all -> 0x023e }
            r14.setRequestProperty(r15, r5)     // Catch:{ all -> 0x023e }
            if (r12 == 0) goto L_0x0076
            java.util.Set r5 = r12.entrySet()     // Catch:{ all -> 0x023e }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x023e }
        L_0x005a:
            boolean r12 = r5.hasNext()     // Catch:{ all -> 0x023e }
            if (r12 == 0) goto L_0x0076
            java.lang.Object r12 = r5.next()     // Catch:{ all -> 0x023e }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x023e }
            java.lang.Object r15 = r12.getKey()     // Catch:{ all -> 0x023e }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x023e }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x023e }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x023e }
            r14.setRequestProperty(r15, r12)     // Catch:{ all -> 0x023e }
            goto L_0x005a
        L_0x0076:
            if (r0 != 0) goto L_0x009a
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x023e }
            long r12 = r10.zzih()     // Catch:{ all -> 0x023e }
            java.lang.Long r5 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x023e }
            r12 = 0
            r0[r12] = r5     // Catch:{ all -> 0x023e }
            java.lang.String r5 = "Hit %d retrieved from the store has null HTTP method."
            java.lang.String r0 = java.lang.String.format(r5, r0)     // Catch:{ all -> 0x023e }
            com.google.android.gms.internal.gtm.zzev.zzac(r0)     // Catch:{ all -> 0x023e }
            com.google.android.gms.internal.gtm.zzfw r0 = r1.zzapp     // Catch:{ all -> 0x023e }
            r0.zzb(r10)     // Catch:{ all -> 0x023e }
            r14.disconnect()     // Catch:{ IOException -> 0x024d }
        L_0x0096:
            r16 = r4
            goto L_0x0295
        L_0x009a:
            boolean r5 = r0.equals(r2)     // Catch:{ all -> 0x023e }
            java.lang.String r12 = "POST"
            java.lang.String r15 = "PUT"
            java.lang.String r6 = "HEAD"
            if (r5 != 0) goto L_0x00e0
            boolean r5 = r0.equals(r6)     // Catch:{ all -> 0x0239 }
            if (r5 != 0) goto L_0x00e0
            boolean r5 = r0.equals(r12)     // Catch:{ all -> 0x0239 }
            if (r5 != 0) goto L_0x00e0
            boolean r5 = r0.equals(r15)     // Catch:{ all -> 0x0239 }
            if (r5 != 0) goto L_0x00e0
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x00da }
            r5 = 0
            r6[r5] = r0     // Catch:{ all -> 0x0239 }
            java.lang.String r0 = "Unrecongnized HTTP method %s. Supported methods are GET, HEAD, PUT and/or POST"
            java.lang.String r0 = java.lang.String.format(r0, r6)     // Catch:{ all -> 0x0239 }
            com.google.android.gms.internal.gtm.zzev.zzac(r0)     // Catch:{ all -> 0x0239 }
            com.google.android.gms.internal.gtm.zzfw r0 = r1.zzapp     // Catch:{ all -> 0x0239 }
            r0.zzb(r10)     // Catch:{ all -> 0x0239 }
            r14.disconnect()     // Catch:{ IOException -> 0x00d4 }
            r16 = r4
            r6 = 1
            goto L_0x0295
        L_0x00d4:
            r0 = move-exception
            r16 = r4
            r6 = 1
            goto L_0x0250
        L_0x00da:
            r0 = move-exception
            r16 = r4
            r6 = r5
            goto L_0x0241
        L_0x00e0:
            int r5 = r0.hashCode()     // Catch:{ all -> 0x0239 }
            r16 = r4
            r4 = 2
            switch(r5) {
                case 70454: goto L_0x0103;
                case 79599: goto L_0x00fb;
                case 2213344: goto L_0x00f3;
                case 2461856: goto L_0x00eb;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            goto L_0x010d
        L_0x00eb:
            boolean r5 = r0.equals(r12)     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x010d
            r12 = r4
            goto L_0x010e
        L_0x00f3:
            boolean r5 = r0.equals(r6)     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x010d
            r12 = 1
            goto L_0x010e
        L_0x00fb:
            boolean r5 = r0.equals(r15)     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x010d
            r12 = 3
            goto L_0x010e
        L_0x0103:
            boolean r5 = r0.equals(r2)     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x010d
            r12 = 0
            goto L_0x010e
        L_0x010b:
            r0 = move-exception
            goto L_0x0144
        L_0x010d:
            r12 = -1
        L_0x010e:
            if (r12 == 0) goto L_0x0147
            r5 = 1
            if (r12 == r5) goto L_0x0147
            if (r12 == r4) goto L_0x0119
            r4 = 3
            if (r12 == r4) goto L_0x0119
            goto L_0x0141
        L_0x0119:
            r14.setRequestMethod(r0)     // Catch:{ all -> 0x010b }
            if (r13 == 0) goto L_0x0141
            r14.setDoOutput(r5)     // Catch:{ all -> 0x010b }
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch:{ all -> 0x010b }
            byte[] r4 = r13.getBytes(r4)     // Catch:{ all -> 0x010b }
            int r5 = r4.length     // Catch:{ all -> 0x010b }
            r14.setFixedLengthStreamingMode(r5)     // Catch:{ all -> 0x010b }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x010b }
            java.io.OutputStream r6 = r14.getOutputStream()     // Catch:{ all -> 0x010b }
            r5.<init>(r6)     // Catch:{ all -> 0x010b }
            r5.write(r4)     // Catch:{ all -> 0x010b }
            r5.flush()     // Catch:{ all -> 0x010b }
            r5.close()     // Catch:{ all -> 0x010b }
        L_0x0141:
            r5 = 0
            r6 = 1
            goto L_0x0160
        L_0x0144:
            r6 = 1
            goto L_0x0241
        L_0x0147:
            if (r13 == 0) goto L_0x015b
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x010b }
            r5 = 0
            r4[r5] = r0     // Catch:{ all -> 0x010b }
            r6 = 1
            r4[r6] = r13     // Catch:{ all -> 0x0237 }
            java.lang.String r12 = "Body of %s hit is ignored: %s."
            java.lang.String r4 = java.lang.String.format(r12, r4)     // Catch:{ all -> 0x0237 }
            com.google.android.gms.internal.gtm.zzev.zzac(r4)     // Catch:{ all -> 0x0237 }
            goto L_0x015d
        L_0x015b:
            r5 = 0
            r6 = 1
        L_0x015d:
            r14.setRequestMethod(r0)     // Catch:{ all -> 0x0237 }
        L_0x0160:
            int r4 = r14.getResponseCode()     // Catch:{ all -> 0x0237 }
            r12 = 200(0xc8, float:2.8E-43)
            if (r4 < r12) goto L_0x01b3
            r12 = 300(0x12c, float:4.2E-43)
            if (r4 < r12) goto L_0x016d
            goto L_0x01b3
        L_0x016d:
            java.io.InputStream r15 = r14.getInputStream()     // Catch:{ all -> 0x0237 }
            java.lang.String r4 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01b0 }
            java.lang.String r12 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x01b0 }
            int r12 = r12.length()     // Catch:{ all -> 0x01b0 }
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01b0 }
            int r13 = r13.length()     // Catch:{ all -> 0x01b0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b0 }
            int r12 = r12 + 23
            int r12 = r12 + r13
            r5.<init>(r12)     // Catch:{ all -> 0x01b0 }
            java.lang.String r12 = "Hit sent to "
            r5.append(r12)     // Catch:{ all -> 0x01b0 }
            r5.append(r4)     // Catch:{ all -> 0x01b0 }
            java.lang.String r4 = "(method = "
            r5.append(r4)     // Catch:{ all -> 0x01b0 }
            r5.append(r0)     // Catch:{ all -> 0x01b0 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x01b0 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x01b0 }
            com.google.android.gms.internal.gtm.zzev.zzab(r0)     // Catch:{ all -> 0x01b0 }
            com.google.android.gms.internal.gtm.zzfw r0 = r1.zzapp     // Catch:{ all -> 0x01b0 }
            r0.zza(r10)     // Catch:{ all -> 0x01b0 }
            goto L_0x0226
        L_0x01b0:
            r0 = move-exception
            goto L_0x0242
        L_0x01b3:
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0237 }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0237 }
            int r5 = r5.length()     // Catch:{ all -> 0x0237 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0237 }
            int r5 = r5 + 39
            r12.<init>(r5)     // Catch:{ all -> 0x0237 }
            java.lang.String r5 = "Bad response received for "
            r12.append(r5)     // Catch:{ all -> 0x0237 }
            r12.append(r0)     // Catch:{ all -> 0x0237 }
            r12.append(r3)     // Catch:{ all -> 0x0237 }
            r12.append(r4)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0237 }
            com.google.android.gms.internal.gtm.zzev.zzac(r0)     // Catch:{ all -> 0x0237 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0237 }
            r0.<init>()     // Catch:{ all -> 0x0237 }
            java.io.InputStream r4 = r14.getErrorStream()     // Catch:{ all -> 0x022f }
            if (r4 == 0) goto L_0x021a
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x022f }
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch:{ all -> 0x022f }
            r12.<init>(r4)     // Catch:{ all -> 0x022f }
            r5.<init>(r12)     // Catch:{ all -> 0x022f }
        L_0x01f0:
            java.lang.String r4 = r5.readLine()     // Catch:{ all -> 0x0218 }
            if (r4 == 0) goto L_0x01fa
            r0.append(r4)     // Catch:{ all -> 0x0218 }
            goto L_0x01f0
        L_0x01fa:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0218 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0218 }
            int r4 = r0.length()     // Catch:{ all -> 0x0218 }
            java.lang.String r12 = "Error Message: "
            if (r4 == 0) goto L_0x020f
            java.lang.String r0 = r12.concat(r0)     // Catch:{ all -> 0x0218 }
            goto L_0x0214
        L_0x020f:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0218 }
            r0.<init>(r12)     // Catch:{ all -> 0x0218 }
        L_0x0214:
            com.google.android.gms.internal.gtm.zzev.zzac(r0)     // Catch:{ all -> 0x0218 }
            goto L_0x021b
        L_0x0218:
            r0 = move-exception
            goto L_0x0231
        L_0x021a:
            r5 = 0
        L_0x021b:
            if (r5 == 0) goto L_0x0220
            r5.close()     // Catch:{ all -> 0x0237 }
        L_0x0220:
            com.google.android.gms.internal.gtm.zzfw r0 = r1.zzapp     // Catch:{ all -> 0x0237 }
            r0.zzc(r10)     // Catch:{ all -> 0x0237 }
            r15 = 0
        L_0x0226:
            if (r15 == 0) goto L_0x022b
            r15.close()     // Catch:{ IOException -> 0x024b }
        L_0x022b:
            r14.disconnect()     // Catch:{ IOException -> 0x024b }
            goto L_0x0295
        L_0x022f:
            r0 = move-exception
            r5 = 0
        L_0x0231:
            if (r5 == 0) goto L_0x0236
            r5.close()     // Catch:{ all -> 0x0237 }
        L_0x0236:
            throw r0     // Catch:{ all -> 0x0237 }
        L_0x0237:
            r0 = move-exception
            goto L_0x0241
        L_0x0239:
            r0 = move-exception
            r16 = r4
            goto L_0x0144
        L_0x023e:
            r0 = move-exception
            r16 = r4
        L_0x0241:
            r15 = 0
        L_0x0242:
            if (r15 == 0) goto L_0x0247
            r15.close()     // Catch:{ IOException -> 0x024b }
        L_0x0247:
            r14.disconnect()     // Catch:{ IOException -> 0x024b }
            throw r0     // Catch:{ IOException -> 0x024b }
        L_0x024b:
            r0 = move-exception
            goto L_0x0250
        L_0x024d:
            r0 = move-exception
            r16 = r4
        L_0x0250:
            java.lang.String r4 = java.lang.String.valueOf(r11)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = java.lang.String.valueOf(r4)
            int r12 = r12.length()
            int r12 = r12 + 27
            java.lang.String r13 = java.lang.String.valueOf(r5)
            int r13 = r13.length()
            int r12 = r12 + r13
            r11.<init>(r12)
            java.lang.String r12 = "Exception sending hit to "
            r11.append(r12)
            r11.append(r4)
            r11.append(r3)
            r11.append(r5)
            java.lang.String r4 = r11.toString()
            com.google.android.gms.internal.gtm.zzev.zzac(r4)
            java.lang.String r0 = r0.getMessage()
            com.google.android.gms.internal.gtm.zzev.zzac(r0)
            com.google.android.gms.internal.gtm.zzfw r0 = r1.zzapp
            r0.zzc(r10)
        L_0x0295:
            int r7 = r7 + 1
            r4 = r16
            goto L_0x0013
        L_0x029b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfu.zzd(java.util.List):void");
    }

    private static URL zzd(zzeh zzeh) {
        try {
            return new URL(zzeh.zzij());
        } catch (MalformedURLException unused) {
            zzev.zzav("Error trying to parse the GTM url.");
            return null;
        }
    }
}
