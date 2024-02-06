package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class zzij extends zzih<zzig, zzig> {
    zzij() {
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzhm zzhm) {
        return false;
    }

    private static void zza(Object obj, zzig zzig) {
        ((zzfo) obj).zzb = zzig;
    }

    /* access modifiers changed from: package-private */
    public final void zzd(Object obj) {
        ((zzfo) obj).zzb.zzc();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zzf(Object obj) {
        return ((zzig) obj).zze();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int zze(Object obj) {
        return ((zzig) obj).zzd();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(Object obj, Object obj2) {
        zzig zzig = (zzig) obj;
        zzig zzig2 = (zzig) obj2;
        if (zzig2.equals(zzig.zza())) {
            return zzig;
        }
        return zzig.zza(zzig, zzig2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, zzja zzja) throws IOException {
        ((zzig) obj).zza(zzja);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzja zzja) throws IOException {
        ((zzig) obj).zzb(zzja);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, Object obj2) {
        zza(obj, (zzig) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(Object obj) {
        zzig zzig = ((zzfo) obj).zzb;
        if (zzig != zzig.zza()) {
            return zzig;
        }
        zzig zzb = zzig.zzb();
        zza(obj, zzb);
        return zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzb(Object obj) {
        return ((zzfo) obj).zzb;
    }

    /* access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Object obj2) {
        zza(obj, (zzig) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj) {
        zzig zzig = (zzig) obj;
        zzig.zzc();
        return zzig;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza() {
        return zzig.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, Object obj2) {
        ((zzig) obj).zza((i << 3) | 3, (Object) (zzig) obj2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, zzeg zzeg) {
        ((zzig) obj).zza((i << 3) | 2, (Object) zzeg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Object obj, int i, long j) {
        ((zzig) obj).zza((i << 3) | 1, (Object) Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, int i2) {
        ((zzig) obj).zza((i << 3) | 5, (Object) Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzig) obj).zza(i << 3, (Object) Long.valueOf(j));
    }
}
