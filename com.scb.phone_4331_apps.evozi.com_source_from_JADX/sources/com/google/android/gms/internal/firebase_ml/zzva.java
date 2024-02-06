package com.google.android.gms.internal.firebase_ml;

import java.util.Collections;
import java.util.List;

final class zzva extends zzuy {
    private static final Class<?> zzbqg = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzva() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        Object obj2;
        List list = (List) zzxc.zzp(obj, j);
        if (list instanceof zzux) {
            obj2 = ((zzux) list).zzrw();
        } else if (!zzbqg.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzwa) || !(list instanceof zzun)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzun zzun = (zzun) list;
                if (zzun.zzps()) {
                    zzun.zzpt();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzxc.zza(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.firebase_ml.zzuw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.firebase_ml.zzuw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.firebase_ml.zzuw} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void zza(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.util.List r6 = zzc(r6, r7)
            int r0 = r6.size()
            java.util.List r1 = zzc(r5, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0035
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzux
            if (r2 == 0) goto L_0x001c
            com.google.android.gms.internal.firebase_ml.zzuw r1 = new com.google.android.gms.internal.firebase_ml.zzuw
            r1.<init>((int) r0)
            goto L_0x0031
        L_0x001c:
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzwa
            if (r2 == 0) goto L_0x002c
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzun
            if (r2 == 0) goto L_0x002c
            com.google.android.gms.internal.firebase_ml.zzun r1 = (com.google.android.gms.internal.firebase_ml.zzun) r1
            com.google.android.gms.internal.firebase_ml.zzun r0 = r1.zzck(r0)
            r1 = r0
            goto L_0x0031
        L_0x002c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0031:
            com.google.android.gms.internal.firebase_ml.zzxc.zza((java.lang.Object) r5, (long) r7, (java.lang.Object) r1)
            goto L_0x0087
        L_0x0035:
            java.lang.Class<?> r2 = zzbqg
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0053
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.firebase_ml.zzxc.zza((java.lang.Object) r5, (long) r7, (java.lang.Object) r2)
        L_0x0051:
            r1 = r2
            goto L_0x0087
        L_0x0053:
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzwz
            if (r2 == 0) goto L_0x006a
            com.google.android.gms.internal.firebase_ml.zzuw r2 = new com.google.android.gms.internal.firebase_ml.zzuw
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.firebase_ml.zzwz r1 = (com.google.android.gms.internal.firebase_ml.zzwz) r1
            r2.addAll(r1)
            com.google.android.gms.internal.firebase_ml.zzxc.zza((java.lang.Object) r5, (long) r7, (java.lang.Object) r2)
            goto L_0x0051
        L_0x006a:
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzwa
            if (r2 == 0) goto L_0x0087
            boolean r2 = r1 instanceof com.google.android.gms.internal.firebase_ml.zzun
            if (r2 == 0) goto L_0x0087
            r2 = r1
            com.google.android.gms.internal.firebase_ml.zzun r2 = (com.google.android.gms.internal.firebase_ml.zzun) r2
            boolean r3 = r2.zzps()
            if (r3 != 0) goto L_0x0087
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.firebase_ml.zzun r1 = r2.zzck(r1)
            com.google.android.gms.internal.firebase_ml.zzxc.zza((java.lang.Object) r5, (long) r7, (java.lang.Object) r1)
        L_0x0087:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0096
            if (r2 <= 0) goto L_0x0096
            r1.addAll(r6)
        L_0x0096:
            if (r0 <= 0) goto L_0x0099
            r6 = r1
        L_0x0099:
            com.google.android.gms.internal.firebase_ml.zzxc.zza((java.lang.Object) r5, (long) r7, (java.lang.Object) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzva.zza(java.lang.Object, java.lang.Object, long):void");
    }

    private static <E> List<E> zzc(Object obj, long j) {
        return (List) zzxc.zzp(obj, j);
    }
}
