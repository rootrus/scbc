package com.google.android.gms.internal.gtm;

public class zzfd {
    private static zzfd zzaoq;
    private volatile String zzaec = null;
    private volatile String zzais = null;
    private volatile int zzaor = zza.zzaos;

    /* 'enum' modifier removed */
    static final class zza {
        public static final int zzaos = 1;
        public static final int zzaot = 2;
        private static final /* synthetic */ int[] zzaou = {1, 2};
    }

    zzfd() {
    }

    public static zzfd zzkr() {
        zzfd zzfd;
        synchronized (zzfd.class) {
            if (zzaoq == null) {
                zzaoq = new zzfd();
            }
            zzfd = zzaoq;
        }
        return zzfd;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
        return true;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:60:0x00d9=Splitter:B:60:0x00d9, B:52:0x00bc=Splitter:B:52:0x00bc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(java.lang.String r6, android.net.Uri r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            java.lang.String r1 = r7.toString()     // Catch:{ UnsupportedEncodingException -> 0x00f8 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x00f8 }
            java.lang.String r2 = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\S+"
            boolean r2 = r1.matches(r2)     // Catch:{ all -> 0x00f6 }
            if (r2 != 0) goto L_0x0031
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00f6 }
            int r7 = r6.length()     // Catch:{ all -> 0x00f6 }
            if (r7 == 0) goto L_0x0025
            java.lang.String r7 = "Bad preview url: "
            java.lang.String r6 = r7.concat(r6)     // Catch:{ all -> 0x00f6 }
            goto L_0x002c
        L_0x0025:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = "Bad preview url: "
            r6.<init>(r7)     // Catch:{ all -> 0x00f6 }
        L_0x002c:
            com.google.android.gms.internal.gtm.zzev.zzac(r6)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r5)
            return r0
        L_0x0031:
            java.lang.String r2 = "id"
            java.lang.String r2 = r7.getQueryParameter(r2)     // Catch:{ all -> 0x00f6 }
            java.lang.String r3 = "gtm_auth"
            java.lang.String r3 = r7.getQueryParameter(r3)     // Catch:{ all -> 0x00f6 }
            java.lang.String r4 = "gtm_preview"
            java.lang.String r4 = r7.getQueryParameter(r4)     // Catch:{ all -> 0x00f6 }
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x00f6 }
            if (r6 != 0) goto L_0x0050
            java.lang.String r6 = "Preview fails (container doesn't match the container specified by the asset)"
            com.google.android.gms.internal.gtm.zzev.zzac(r6)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r5)
            return r0
        L_0x0050:
            if (r2 == 0) goto L_0x00d9
            int r6 = r2.length()     // Catch:{ all -> 0x00f6 }
            if (r6 <= 0) goto L_0x00d9
            if (r4 == 0) goto L_0x009d
            int r6 = r4.length()     // Catch:{ all -> 0x00f6 }
            if (r6 != 0) goto L_0x009d
            java.lang.String r6 = r5.zzaec     // Catch:{ all -> 0x00f6 }
            boolean r6 = r2.equals(r6)     // Catch:{ all -> 0x00f6 }
            if (r6 == 0) goto L_0x0096
            int r6 = r5.zzaor     // Catch:{ all -> 0x00f6 }
            int r7 = com.google.android.gms.internal.gtm.zzfd.zza.zzaos     // Catch:{ all -> 0x00f6 }
            if (r6 != r7) goto L_0x006f
            goto L_0x0096
        L_0x006f:
            java.lang.String r6 = r5.zzaec     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00f6 }
            int r7 = r6.length()     // Catch:{ all -> 0x00f6 }
            if (r7 == 0) goto L_0x0082
            java.lang.String r7 = "Exit preview mode for container: "
            java.lang.String r6 = r7.concat(r6)     // Catch:{ all -> 0x00f6 }
            goto L_0x0089
        L_0x0082:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = "Exit preview mode for container: "
            r6.<init>(r7)     // Catch:{ all -> 0x00f6 }
        L_0x0089:
            com.google.android.gms.internal.gtm.zzev.zzab(r6)     // Catch:{ all -> 0x00f6 }
            int r6 = com.google.android.gms.internal.gtm.zzfd.zza.zzaos     // Catch:{ all -> 0x00f6 }
            r5.zzaor = r6     // Catch:{ all -> 0x00f6 }
            r6 = 0
            r5.zzaec = r6     // Catch:{ all -> 0x00f6 }
            r5.zzais = r6     // Catch:{ all -> 0x00f6 }
            goto L_0x00b9
        L_0x0096:
            java.lang.String r6 = "Error in exiting preview mode. The container is not in preview."
            com.google.android.gms.internal.gtm.zzev.zzac(r6)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r5)
            return r0
        L_0x009d:
            if (r4 == 0) goto L_0x00bc
            int r6 = r4.length()     // Catch:{ all -> 0x00f6 }
            if (r6 <= 0) goto L_0x00bc
            if (r3 == 0) goto L_0x00bc
            int r6 = r3.length()     // Catch:{ all -> 0x00f6 }
            if (r6 <= 0) goto L_0x00bc
            int r6 = com.google.android.gms.internal.gtm.zzfd.zza.zzaot     // Catch:{ all -> 0x00f6 }
            r5.zzaor = r6     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = r7.getQuery()     // Catch:{ all -> 0x00f6 }
            r5.zzais = r6     // Catch:{ all -> 0x00f6 }
            r5.zzaec = r2     // Catch:{ all -> 0x00f6 }
        L_0x00b9:
            monitor-exit(r5)
            r6 = 1
            return r6
        L_0x00bc:
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00f6 }
            int r7 = r6.length()     // Catch:{ all -> 0x00f6 }
            if (r7 == 0) goto L_0x00cd
            java.lang.String r7 = "Bad preview url: "
            java.lang.String r6 = r7.concat(r6)     // Catch:{ all -> 0x00f6 }
            goto L_0x00d4
        L_0x00cd:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = "Bad preview url: "
            r6.<init>(r7)     // Catch:{ all -> 0x00f6 }
        L_0x00d4:
            com.google.android.gms.internal.gtm.zzev.zzac(r6)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r5)
            return r0
        L_0x00d9:
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00f6 }
            int r7 = r6.length()     // Catch:{ all -> 0x00f6 }
            if (r7 == 0) goto L_0x00ea
            java.lang.String r7 = "Bad preview url: "
            java.lang.String r6 = r7.concat(r6)     // Catch:{ all -> 0x00f6 }
            goto L_0x00f1
        L_0x00ea:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = "Bad preview url: "
            r6.<init>(r7)     // Catch:{ all -> 0x00f6 }
        L_0x00f1:
            com.google.android.gms.internal.gtm.zzev.zzac(r6)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r5)
            return r0
        L_0x00f6:
            r6 = move-exception
            goto L_0x011d
        L_0x00f8:
            r6 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00f6 }
            int r7 = r7.length()     // Catch:{ all -> 0x00f6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f6 }
            int r7 = r7 + 32
            r1.<init>(r7)     // Catch:{ all -> 0x00f6 }
            java.lang.String r7 = "Error decoding the preview url: "
            r1.append(r7)     // Catch:{ all -> 0x00f6 }
            r1.append(r6)     // Catch:{ all -> 0x00f6 }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x00f6 }
            com.google.android.gms.internal.gtm.zzev.zzac(r6)     // Catch:{ all -> 0x00f6 }
            monitor-exit(r5)
            return r0
        L_0x011d:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfd.zza(java.lang.String, android.net.Uri):boolean");
    }

    public final boolean isPreview() {
        return this.zzaor == zza.zzaot;
    }

    public final boolean zzbw(String str) {
        return isPreview() && this.zzaec.equals(str);
    }

    public final String zzks() {
        return this.zzais;
    }

    public final String getContainerId() {
        return this.zzaec;
    }
}
