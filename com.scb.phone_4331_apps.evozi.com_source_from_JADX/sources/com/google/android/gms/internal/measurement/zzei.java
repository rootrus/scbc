package com.google.android.gms.internal.measurement;

import java.util.Comparator;

final class zzei implements Comparator<zzeg> {
    zzei() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzeg zzeg = (zzeg) obj;
        zzeg zzeg2 = (zzeg) obj2;
        zzel zzel = (zzel) zzeg.iterator();
        zzel zzel2 = (zzel) zzeg2.iterator();
        while (zzel.hasNext() && zzel2.hasNext()) {
            int compare = Integer.compare(zzeg.zzb(zzel.zza()), zzeg.zzb(zzel2.zza()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzeg.zza(), zzeg2.zza());
    }
}
