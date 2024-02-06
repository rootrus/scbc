package com.google.android.gms.internal.firebase_ml;

public final class zzfh {
    private zzhu zzsr;
    private final zzfo zzsu;
    private String zzsx;
    private zzfb zztu;
    private zzfd zzug;
    private zzfe zzuh = new zzfe();
    private zzfe zzui = new zzfe();
    private int zzuj = 10;
    private int zzuk = 16384;
    private boolean zzul = true;
    private boolean zzum = true;
    private zzfa zzun;
    private zzez zzuo;
    private int zzup = 20000;
    private int zzuq = 20000;
    private zzfn zzur;
    private boolean zzus = true;
    private boolean zzut = true;
    @Deprecated
    private boolean zzuu = false;
    private zzhw zzuv = zzhw.zzaad;

    zzfh(zzfo zzfo, String str) {
        this.zzsu = zzfo;
        zzag((String) null);
    }

    public final zzfo zzez() {
        return this.zzsu;
    }

    public final String getRequestMethod() {
        return this.zzsx;
    }

    public final zzfh zzag(String str) {
        zzks.checkArgument(str == null || zzfg.zzaf(str));
        this.zzsx = str;
        return this;
    }

    public final zzez zzfa() {
        return this.zzuo;
    }

    public final zzfh zza(zzez zzez) {
        this.zzuo = (zzez) zzks.checkNotNull(zzez);
        return this;
    }

    public final zzfa zzfb() {
        return this.zzun;
    }

    public final zzfh zza(zzfa zzfa) {
        this.zzun = zzfa;
        return this;
    }

    public final zzfh zza(zzfb zzfb) {
        this.zztu = zzfb;
        return this;
    }

    public final int zzfc() {
        return this.zzuk;
    }

    public final boolean zzfd() {
        return this.zzul;
    }

    public final zzfh zzz(int i) {
        zzks.checkArgument(true);
        this.zzup = 5000;
        return this;
    }

    public final zzfh zzaa(int i) {
        zzks.checkArgument(true);
        this.zzuq = 10000;
        return this;
    }

    public final zzfe zzfe() {
        return this.zzuh;
    }

    public final zzfe zzff() {
        return this.zzui;
    }

    public final zzfh zza(zzfd zzfd) {
        this.zzug = zzfd;
        return this;
    }

    public final zzfn zzfg() {
        return this.zzur;
    }

    public final zzfh zza(zzfn zzfn) {
        this.zzur = zzfn;
        return this;
    }

    public final zzfh zza(zzhu zzhu) {
        this.zzsr = zzhu;
        return this;
    }

    public final zzhu zzfh() {
        return this.zzsr;
    }

    public final boolean zzfi() {
        return this.zzut;
    }

    /* JADX WARNING: type inference failed for: r3v15, types: [com.google.android.gms.internal.firebase_ml.zzfc, com.google.android.gms.internal.firebase_ml.zzhy] */
    /* JADX WARNING: type inference failed for: r15v1, types: [com.google.android.gms.internal.firebase_ml.zzhs] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0280 A[Catch:{ all -> 0x02aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02a6 A[LOOP:0: B:5:0x0019->B:121:0x02a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0288 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0221 A[Catch:{ all -> 0x02aa }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.firebase_ml.zzfk zzfj() throws java.io.IOException {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.zzuj
            if (r0 < 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            com.google.android.gms.internal.firebase_ml.zzks.checkArgument(r0)
            int r0 = r1.zzuj
            java.lang.String r4 = r1.zzsx
            com.google.android.gms.internal.firebase_ml.zzks.checkNotNull(r4)
            com.google.android.gms.internal.firebase_ml.zzez r4 = r1.zzuo
            com.google.android.gms.internal.firebase_ml.zzks.checkNotNull(r4)
            r5 = 0
        L_0x0019:
            if (r5 == 0) goto L_0x001e
            r5.ignore()
        L_0x001e:
            com.google.android.gms.internal.firebase_ml.zzfd r5 = r1.zzug
            if (r5 == 0) goto L_0x0025
            r5.zzb(r1)
        L_0x0025:
            com.google.android.gms.internal.firebase_ml.zzez r5 = r1.zzuo
            java.lang.String r5 = r5.zzew()
            com.google.android.gms.internal.firebase_ml.zzfo r6 = r1.zzsu
            java.lang.String r7 = r1.zzsx
            com.google.android.gms.internal.firebase_ml.zzfp r6 = r6.zzc(r7, r5)
            java.util.logging.Logger r7 = com.google.android.gms.internal.firebase_ml.zzfo.zzve
            boolean r8 = r1.zzul
            if (r8 == 0) goto L_0x0043
            java.util.logging.Level r8 = java.util.logging.Level.CONFIG
            boolean r8 = r7.isLoggable(r8)
            if (r8 == 0) goto L_0x0043
            r8 = 1
            goto L_0x0044
        L_0x0043:
            r8 = 0
        L_0x0044:
            java.lang.String r9 = "GET"
            if (r8 == 0) goto L_0x0087
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "-------------- REQUEST  --------------"
            r10.append(r11)
            java.lang.String r11 = com.google.android.gms.internal.firebase_ml.zzhz.zzaae
            r10.append(r11)
            java.lang.String r11 = r1.zzsx
            r10.append(r11)
            r11 = 32
            r10.append(r11)
            r10.append(r5)
            java.lang.String r11 = com.google.android.gms.internal.firebase_ml.zzhz.zzaae
            r10.append(r11)
            boolean r11 = r1.zzum
            if (r11 == 0) goto L_0x0088
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "curl -v --compressed"
            r11.<init>(r12)
            java.lang.String r12 = r1.zzsx
            boolean r12 = r12.equals(r9)
            if (r12 != 0) goto L_0x0089
            java.lang.String r12 = " -X "
            r11.append(r12)
            java.lang.String r12 = r1.zzsx
            r11.append(r12)
            goto L_0x0089
        L_0x0087:
            r10 = 0
        L_0x0088:
            r11 = 0
        L_0x0089:
            com.google.android.gms.internal.firebase_ml.zzfe r12 = r1.zzuh
            java.lang.String r12 = r12.zzex()
            if (r12 != 0) goto L_0x0099
            com.google.android.gms.internal.firebase_ml.zzfe r13 = r1.zzuh
            java.lang.String r14 = "Google-HTTP-Java-Client/1.26.0-SNAPSHOT (gzip)"
            r13.zzae(r14)
            goto L_0x00b9
        L_0x0099:
            com.google.android.gms.internal.firebase_ml.zzfe r13 = r1.zzuh
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = java.lang.String.valueOf(r12)
            int r15 = r15.length()
            int r15 = r15 + 47
            r14.<init>(r15)
            r14.append(r12)
            java.lang.String r15 = " Google-HTTP-Java-Client/1.26.0-SNAPSHOT (gzip)"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.zzae(r14)
        L_0x00b9:
            com.google.android.gms.internal.firebase_ml.zzfe r13 = r1.zzuh
            com.google.android.gms.internal.firebase_ml.zzfe.zza(r13, r10, r11, r7, r6)
            com.google.android.gms.internal.firebase_ml.zzfe r13 = r1.zzuh
            r13.zzae(r12)
            com.google.android.gms.internal.firebase_ml.zzfa r12 = r1.zzun
            if (r12 == 0) goto L_0x00ca
            r12.zzev()
        L_0x00ca:
            java.lang.String r13 = "'"
            if (r12 == 0) goto L_0x01ce
            com.google.android.gms.internal.firebase_ml.zzfa r14 = r1.zzun
            java.lang.String r14 = r14.getType()
            if (r8 == 0) goto L_0x00e2
            com.google.android.gms.internal.firebase_ml.zzhs r15 = new com.google.android.gms.internal.firebase_ml.zzhs
            java.util.logging.Logger r2 = com.google.android.gms.internal.firebase_ml.zzfo.zzve
            java.util.logging.Level r3 = java.util.logging.Level.CONFIG
            int r4 = r1.zzuk
            r15.<init>(r12, r2, r3, r4)
            r12 = r15
        L_0x00e2:
            com.google.android.gms.internal.firebase_ml.zzfb r2 = r1.zztu
            if (r2 != 0) goto L_0x00ee
            com.google.android.gms.internal.firebase_ml.zzfa r2 = r1.zzun
            long r2 = r2.getLength()
            r4 = 0
            goto L_0x0101
        L_0x00ee:
            java.lang.String r2 = r2.getName()
            com.google.android.gms.internal.firebase_ml.zzfc r3 = new com.google.android.gms.internal.firebase_ml.zzfc
            com.google.android.gms.internal.firebase_ml.zzfb r4 = r1.zztu
            r3.<init>(r12, r4)
            long r16 = com.google.android.gms.internal.firebase_ml.zzhn.zzb(r3)
            r4 = r2
            r12 = r3
            r2 = r16
        L_0x0101:
            if (r8 == 0) goto L_0x01b6
            java.lang.String r15 = " -H '"
            if (r14 == 0) goto L_0x014f
            r16 = r9
            java.lang.String r9 = java.lang.String.valueOf(r14)
            int r17 = r9.length()
            java.lang.String r1 = "Content-Type: "
            if (r17 == 0) goto L_0x011a
            java.lang.String r1 = r1.concat(r9)
            goto L_0x0120
        L_0x011a:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1)
            r1 = r9
        L_0x0120:
            r10.append(r1)
            java.lang.String r9 = com.google.android.gms.internal.firebase_ml.zzhz.zzaae
            r10.append(r9)
            if (r11 == 0) goto L_0x014c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r17 = java.lang.String.valueOf(r1)
            int r17 = r17.length()
            r18 = r0
            int r0 = r17 + 6
            r9.<init>(r0)
            r9.append(r15)
            r9.append(r1)
            r9.append(r13)
            java.lang.String r0 = r9.toString()
            r11.append(r0)
            goto L_0x0153
        L_0x014c:
            r18 = r0
            goto L_0x0153
        L_0x014f:
            r18 = r0
            r16 = r9
        L_0x0153:
            if (r4 == 0) goto L_0x0194
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r1 = r0.length()
            java.lang.String r9 = "Content-Encoding: "
            if (r1 == 0) goto L_0x0166
            java.lang.String r0 = r9.concat(r0)
            goto L_0x016b
        L_0x0166:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r9)
        L_0x016b:
            r10.append(r0)
            java.lang.String r1 = com.google.android.gms.internal.firebase_ml.zzhz.zzaae
            r10.append(r1)
            if (r11 == 0) goto L_0x0194
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r9 = java.lang.String.valueOf(r0)
            int r9 = r9.length()
            int r9 = r9 + 6
            r1.<init>(r9)
            r1.append(r15)
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            r11.append(r0)
        L_0x0194:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01ba
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 36
            r0.<init>(r1)
            java.lang.String r1 = "Content-Length: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r10.append(r0)
            java.lang.String r0 = com.google.android.gms.internal.firebase_ml.zzhz.zzaae
            r10.append(r0)
            goto L_0x01ba
        L_0x01b6:
            r18 = r0
            r16 = r9
        L_0x01ba:
            if (r11 == 0) goto L_0x01c1
            java.lang.String r0 = " -d '@-'"
            r11.append(r0)
        L_0x01c1:
            r6.setContentType(r14)
            r6.setContentEncoding(r4)
            r6.setContentLength(r2)
            r6.zza(r12)
            goto L_0x01d2
        L_0x01ce:
            r18 = r0
            r16 = r9
        L_0x01d2:
            if (r8 == 0) goto L_0x0204
            java.util.logging.Level r0 = java.util.logging.Level.CONFIG
            java.lang.String r1 = r10.toString()
            java.lang.String r2 = "execute"
            java.lang.String r3 = "o.rsnAllocationCreateBitmapRef"
            r7.logp(r0, r3, r2, r1)
            if (r11 == 0) goto L_0x0204
            java.lang.String r0 = " -- '"
            r11.append(r0)
            java.lang.String r0 = "'\"'\"'"
            java.lang.String r0 = r5.replaceAll(r13, r0)
            r11.append(r0)
            r11.append(r13)
            if (r12 == 0) goto L_0x01fb
            java.lang.String r0 = " << $$$"
            r11.append(r0)
        L_0x01fb:
            java.util.logging.Level r0 = java.util.logging.Level.CONFIG
            java.lang.String r1 = r11.toString()
            r7.logp(r0, r3, r2, r1)
        L_0x0204:
            if (r18 <= 0) goto L_0x0208
            r0 = 1
            goto L_0x0209
        L_0x0208:
            r0 = 0
        L_0x0209:
            r1 = r19
            int r2 = r1.zzup
            int r3 = r1.zzuq
            r6.zza(r2, r3)
            com.google.android.gms.internal.firebase_ml.zzfq r2 = r6.zzfo()     // Catch:{ IOException -> 0x02ba }
            com.google.android.gms.internal.firebase_ml.zzfk r5 = new com.google.android.gms.internal.firebase_ml.zzfk     // Catch:{ all -> 0x02af }
            r5.<init>(r1, r2)     // Catch:{ all -> 0x02af }
            boolean r2 = r5.zzfk()     // Catch:{ all -> 0x02aa }
            if (r2 != 0) goto L_0x0284
            int r2 = r5.getStatusCode()     // Catch:{ all -> 0x02aa }
            com.google.android.gms.internal.firebase_ml.zzfe r3 = r5.zzfe()     // Catch:{ all -> 0x02aa }
            java.lang.String r3 = r3.getLocation()     // Catch:{ all -> 0x02aa }
            boolean r4 = r1.zzus     // Catch:{ all -> 0x02aa }
            if (r4 == 0) goto L_0x027b
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x023a
            switch(r2) {
                case 301: goto L_0x023a;
                case 302: goto L_0x023a;
                case 303: goto L_0x023a;
                default: goto L_0x0238;
            }     // Catch:{ all -> 0x02aa }
        L_0x0238:
            r4 = 0
            goto L_0x023b
        L_0x023a:
            r4 = 1
        L_0x023b:
            if (r4 == 0) goto L_0x027b
            if (r3 == 0) goto L_0x027b
            com.google.android.gms.internal.firebase_ml.zzez r4 = new com.google.android.gms.internal.firebase_ml.zzez     // Catch:{ all -> 0x02aa }
            com.google.android.gms.internal.firebase_ml.zzez r6 = r1.zzuo     // Catch:{ all -> 0x02aa }
            java.net.URL r3 = r6.zzu(r3)     // Catch:{ all -> 0x02aa }
            r4.<init>((java.net.URL) r3)     // Catch:{ all -> 0x02aa }
            r1.zza((com.google.android.gms.internal.firebase_ml.zzez) r4)     // Catch:{ all -> 0x02aa }
            r3 = 303(0x12f, float:4.25E-43)
            if (r2 != r3) goto L_0x025a
            r2 = r16
            r1.zzag(r2)     // Catch:{ all -> 0x02aa }
            r2 = 0
            r1.zzun = r2     // Catch:{ all -> 0x02aa }
            goto L_0x025b
        L_0x025a:
            r2 = 0
        L_0x025b:
            com.google.android.gms.internal.firebase_ml.zzfe r3 = r1.zzuh     // Catch:{ all -> 0x02aa }
            r3.zzy(r2)     // Catch:{ all -> 0x02aa }
            com.google.android.gms.internal.firebase_ml.zzfe r3 = r1.zzuh     // Catch:{ all -> 0x02aa }
            r3.zzaa(r2)     // Catch:{ all -> 0x02aa }
            com.google.android.gms.internal.firebase_ml.zzfe r3 = r1.zzuh     // Catch:{ all -> 0x02aa }
            r3.zzab(r2)     // Catch:{ all -> 0x02aa }
            com.google.android.gms.internal.firebase_ml.zzfe r3 = r1.zzuh     // Catch:{ all -> 0x02aa }
            r3.zzz(r2)     // Catch:{ all -> 0x02aa }
            com.google.android.gms.internal.firebase_ml.zzfe r3 = r1.zzuh     // Catch:{ all -> 0x02aa }
            r3.zzac(r2)     // Catch:{ all -> 0x02aa }
            com.google.android.gms.internal.firebase_ml.zzfe r3 = r1.zzuh     // Catch:{ all -> 0x02aa }
            r3.zzad(r2)     // Catch:{ all -> 0x02aa }
            r3 = 1
            goto L_0x027d
        L_0x027b:
            r2 = 0
            r3 = 0
        L_0x027d:
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0286
            r5.ignore()     // Catch:{ all -> 0x02aa }
            goto L_0x0286
        L_0x0284:
            r2 = 0
            r0 = 0
        L_0x0286:
            if (r0 != 0) goto L_0x02a6
            com.google.android.gms.internal.firebase_ml.zzfn r0 = r1.zzur
            if (r0 == 0) goto L_0x028f
            r0.zzb(r5)
        L_0x028f:
            boolean r0 = r1.zzut
            if (r0 == 0) goto L_0x02a5
            boolean r0 = r5.zzfk()
            if (r0 == 0) goto L_0x029a
            goto L_0x02a5
        L_0x029a:
            com.google.android.gms.internal.firebase_ml.zzfl r0 = new com.google.android.gms.internal.firebase_ml.zzfl     // Catch:{ all -> 0x02a0 }
            r0.<init>((com.google.android.gms.internal.firebase_ml.zzfk) r5)     // Catch:{ all -> 0x02a0 }
            throw r0     // Catch:{ all -> 0x02a0 }
        L_0x02a0:
            r0 = move-exception
            r5.disconnect()
            throw r0
        L_0x02a5:
            return r5
        L_0x02a6:
            int r0 = r18 + -1
            goto L_0x0019
        L_0x02aa:
            r0 = move-exception
            r5.disconnect()
            throw r0
        L_0x02af:
            r0 = move-exception
            java.io.InputStream r2 = r2.getContent()     // Catch:{ IOException -> 0x02ba }
            if (r2 == 0) goto L_0x02b9
            r2.close()     // Catch:{ IOException -> 0x02ba }
        L_0x02b9:
            throw r0     // Catch:{ IOException -> 0x02ba }
        L_0x02ba:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzfh.zzfj():com.google.android.gms.internal.firebase_ml.zzfk");
    }
}
