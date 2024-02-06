package com.google.android.gms.internal.firebase_ml;

public class zzuv {
    private static final zztr zzbkc = zztr.zzql();
    private zzsw zzbpy;
    private volatile zzvo zzbpz;
    private volatile zzsw zzbqa;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuv)) {
            return false;
        }
        zzuv zzuv = (zzuv) obj;
        zzvo zzvo = this.zzbpz;
        zzvo zzvo2 = zzuv.zzbpz;
        if (zzvo == null && zzvo2 == null) {
            return zzpp().equals(zzuv.zzpp());
        }
        if (zzvo != null && zzvo2 != null) {
            return zzvo.equals(zzvo2);
        }
        if (zzvo != null) {
            return zzvo.equals(zzuv.zzh(zzvo.zzre()));
        }
        return zzh(zzvo2.zzre()).equals(zzvo2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.firebase_ml.zzvo zzh(com.google.android.gms.internal.firebase_ml.zzvo r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.firebase_ml.zzvo r0 = r1.zzbpz
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.firebase_ml.zzvo r0 = r1.zzbpz     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.zzbpz = r2     // Catch:{ zzuo -> 0x0012 }
            com.google.android.gms.internal.firebase_ml.zzsw r0 = com.google.android.gms.internal.firebase_ml.zzsw.zzbkl     // Catch:{ zzuo -> 0x0012 }
            r1.zzbqa = r0     // Catch:{ zzuo -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.zzbpz = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.firebase_ml.zzsw r2 = com.google.android.gms.internal.firebase_ml.zzsw.zzbkl     // Catch:{ all -> 0x001a }
            r1.zzbqa = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.firebase_ml.zzvo r2 = r1.zzbpz
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzuv.zzh(com.google.android.gms.internal.firebase_ml.zzvo):com.google.android.gms.internal.firebase_ml.zzvo");
    }

    public final zzvo zzi(zzvo zzvo) {
        zzvo zzvo2 = this.zzbpz;
        this.zzbpy = null;
        this.zzbqa = null;
        this.zzbpz = zzvo;
        return zzvo2;
    }

    public final int zzqy() {
        if (this.zzbqa != null) {
            return this.zzbqa.size();
        }
        if (this.zzbpz != null) {
            return this.zzbpz.zzqy();
        }
        return 0;
    }

    public final zzsw zzpp() {
        if (this.zzbqa != null) {
            return this.zzbqa;
        }
        synchronized (this) {
            if (this.zzbqa != null) {
                zzsw zzsw = this.zzbqa;
                return zzsw;
            }
            if (this.zzbpz == null) {
                this.zzbqa = zzsw.zzbkl;
            } else {
                this.zzbqa = this.zzbpz.zzpp();
            }
            zzsw zzsw2 = this.zzbqa;
            return zzsw2;
        }
    }
}
