package com.google.android.gms.internal.firebase_ml;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzkl {
    private final String className;
    private final zzkm zzabd;
    private zzkm zzabe;
    private boolean zzabf;

    private zzkl(String str) {
        zzkm zzkm = new zzkm();
        this.zzabd = zzkm;
        this.zzabe = zzkm;
        this.zzabf = false;
        this.className = (String) zzks.checkNotNull(str);
    }

    public final zzkl zzh(String str, @NullableDecl Object obj) {
        return zzi(str, obj);
    }

    public final zzkl zza(String str, boolean z) {
        return zzi(str, String.valueOf(z));
    }

    public final zzkl zza(String str, float f) {
        return zzi(str, String.valueOf(f));
    }

    public final zzkl zzb(String str, int i) {
        return zzi(str, String.valueOf(i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.className);
        sb.append('{');
        zzkm zzkm = this.zzabd.zzabg;
        String str = "";
        while (zzkm != null) {
            Object obj = zzkm.value;
            sb.append(str);
            if (zzkm.name != null) {
                sb.append(zzkm.name);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            zzkm = zzkm.zzabg;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    private final zzkl zzi(String str, @NullableDecl Object obj) {
        zzkm zzkm = new zzkm();
        this.zzabe.zzabg = zzkm;
        this.zzabe = zzkm;
        zzkm.value = obj;
        zzkm.name = (String) zzks.checkNotNull(str);
        return this;
    }
}
