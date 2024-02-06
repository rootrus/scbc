package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzw;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class zzir extends zzg {
    /* access modifiers changed from: private */
    public final zzji zza;
    /* access modifiers changed from: private */
    public zzem zzb;
    private volatile Boolean zzc;
    private final zzag zzd;
    private final zzkc zze;
    private final List<Runnable> zzf = new ArrayList();
    private final zzag zzg;

    protected zzir(zzfy zzfy) {
        super(zzfy);
        this.zze = new zzkc(zzfy.zzm());
        this.zza = new zzji(this);
        this.zzd = new zziq(this, zzfy);
        this.zzg = new zzja(this, zzfy);
    }

    /* access modifiers changed from: protected */
    public final boolean zzz() {
        return false;
    }

    public final boolean zzab() {
        zzd();
        zzw();
        return this.zzb != null;
    }

    /* access modifiers changed from: protected */
    public final void zzac() {
        zzd();
        zzw();
        zza((Runnable) new zzjd(this, zza(true)));
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzem zzem, AbstractSafeParcelable abstractSafeParcelable, zzn zzn) {
        int i;
        List<AbstractSafeParcelable> zza2;
        zzd();
        zzb();
        zzw();
        boolean zzaj = zzaj();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            if (!zzaj || (zza2 = zzj().zza(100)) == null) {
                i = 0;
            } else {
                arrayList.addAll(zza2);
                i = zza2.size();
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzao) {
                    try {
                        zzem.zza((zzao) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e) {
                        zzr().zzf().zza("Failed to send event to the service", e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkq) {
                    try {
                        zzem.zza((zzkq) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e2) {
                        zzr().zzf().zza("Failed to send user property to the service", e2);
                    }
                } else if (abstractSafeParcelable2 instanceof zzw) {
                    try {
                        zzem.zza((zzw) abstractSafeParcelable2, zzn);
                    } catch (RemoteException e3) {
                        zzr().zzf().zza("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    zzr().zzf().zza("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(zzao zzao, String str) {
        Preconditions.checkNotNull(zzao);
        zzd();
        zzw();
        boolean zzaj = zzaj();
        zza((Runnable) new zzjc(this, zzaj, zzaj && zzj().zza(zzao), zzao, zza(true), str));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzw zzw) {
        Preconditions.checkNotNull(zzw);
        zzd();
        zzw();
        zzu();
        zza((Runnable) new zzjf(this, true, zzj().zza(zzw), new zzw(zzw), zza(true), zzw));
    }

    /* access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzw>> atomicReference, String str, String str2, String str3) {
        zzd();
        zzw();
        zza((Runnable) new zzje(this, atomicReference, str, str2, str3, zza(false)));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzw zzw, String str, String str2) {
        zzd();
        zzw();
        zza((Runnable) new zzjh(this, str, str2, zza(false), zzw));
    }

    /* access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzkq>> atomicReference, String str, String str2, String str3, boolean z) {
        zzd();
        zzw();
        zza((Runnable) new zzjg(this, atomicReference, str, str2, str3, z, zza(false)));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzw zzw, String str, String str2, boolean z) {
        zzd();
        zzw();
        zza((Runnable) new zzjj(this, str, str2, z, zza(false), zzw));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzkq zzkq) {
        zzd();
        zzw();
        zza((Runnable) new zzit(this, zzaj() && zzj().zza(zzkq), zzkq, zza(true)));
    }

    /* access modifiers changed from: protected */
    public final void zza(AtomicReference<List<zzkq>> atomicReference, boolean z) {
        zzd();
        zzw();
        zza((Runnable) new zzis(this, atomicReference, zza(false), z));
    }

    /* access modifiers changed from: protected */
    public final void zzad() {
        zzd();
        zzb();
        zzw();
        zzn zza2 = zza(false);
        if (zzaj()) {
            zzj().zzab();
        }
        zza((Runnable) new zziv(this, zza2));
    }

    private final boolean zzaj() {
        zzu();
        return true;
    }

    public final void zza(AtomicReference<String> atomicReference) {
        zzd();
        zzw();
        zza((Runnable) new zziu(this, atomicReference, zza(false)));
    }

    public final void zza(zzw zzw) {
        zzd();
        zzw();
        zza((Runnable) new zzix(this, zza(false), zzw));
    }

    /* access modifiers changed from: protected */
    public final void zzae() {
        zzd();
        zzw();
        zzn zza2 = zza(true);
        zzj().zzac();
        zza((Runnable) new zziw(this, zza2));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzij zzij) {
        zzd();
        zzw();
        zza((Runnable) new zziz(this, zzij));
    }

    public final void zza(Bundle bundle) {
        zzd();
        zzw();
        zza((Runnable) new zziy(this, bundle, zza(false)));
    }

    /* access modifiers changed from: private */
    public final void zzak() {
        zzd();
        this.zze.zza();
        this.zzd.zza(zzaq.zzai.zza(null).longValue());
    }

    /* access modifiers changed from: package-private */
    public final void zzaf() {
        zzd();
        zzw();
        if (!zzab()) {
            if (zzal()) {
                this.zza.zzb();
            } else if (!zzt().zzy()) {
                zzu();
                List<ResolveInfo> queryIntentServices = zzn().getPackageManager().queryIntentServices(new Intent().setClassName(zzn(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    Context zzn = zzn();
                    zzu();
                    intent.setComponent(new ComponentName(zzn, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.zza.zza(intent);
                    return;
                }
                zzr().zzf().zza("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean zzag() {
        return this.zzc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzal() {
        /*
            r5 = this;
            r5.zzd()
            r5.zzw()
            java.lang.Boolean r0 = r5.zzc
            if (r0 != 0) goto L_0x0103
            r5.zzd()
            r5.zzw()
            com.google.android.gms.measurement.internal.zzfg r0 = r5.zzs()
            java.lang.Boolean r0 = r0.zzj()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00fd
        L_0x0023:
            r5.zzu()
            com.google.android.gms.measurement.internal.zzer r2 = r5.zzg()
            int r2 = r2.zzag()
            r3 = 0
            if (r2 != r1) goto L_0x0033
            goto L_0x00d8
        L_0x0033:
            com.google.android.gms.measurement.internal.zzeu r2 = r5.zzr()
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzx()
            java.lang.String r4 = "Checking service availability"
            r2.zza(r4)
            com.google.android.gms.measurement.internal.zzkr r2 = r5.zzp()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.zza((int) r4)
            if (r2 == 0) goto L_0x00cb
            if (r2 == r1) goto L_0x00bb
            r4 = 2
            if (r2 == r4) goto L_0x009b
            r0 = 3
            if (r2 == r0) goto L_0x008b
            r0 = 9
            if (r2 == r0) goto L_0x007d
            r0 = 18
            if (r2 == r0) goto L_0x006f
            com.google.android.gms.measurement.internal.zzeu r0 = r5.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzi()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.zza(r2, r1)
            goto L_0x0098
        L_0x006f:
            com.google.android.gms.measurement.internal.zzeu r0 = r5.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzi()
            java.lang.String r2 = "Service updating"
            r0.zza(r2)
            goto L_0x00d8
        L_0x007d:
            com.google.android.gms.measurement.internal.zzeu r0 = r5.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzi()
            java.lang.String r1 = "Service invalid"
            r0.zza(r1)
            goto L_0x0098
        L_0x008b:
            com.google.android.gms.measurement.internal.zzeu r0 = r5.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzi()
            java.lang.String r1 = "Service disabled"
            r0.zza(r1)
        L_0x0098:
            r0 = r3
            r1 = r0
            goto L_0x00d9
        L_0x009b:
            com.google.android.gms.measurement.internal.zzeu r2 = r5.zzr()
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzw()
            java.lang.String r4 = "Service container out of date"
            r2.zza(r4)
            com.google.android.gms.measurement.internal.zzkr r2 = r5.zzp()
            int r2 = r2.zzj()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00b5
            goto L_0x00c8
        L_0x00b5:
            if (r0 != 0) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r1 = r3
        L_0x00b9:
            r0 = r3
            goto L_0x00d9
        L_0x00bb:
            com.google.android.gms.measurement.internal.zzeu r0 = r5.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzx()
            java.lang.String r2 = "Service missing"
            r0.zza(r2)
        L_0x00c8:
            r0 = r1
            r1 = r3
            goto L_0x00d9
        L_0x00cb:
            com.google.android.gms.measurement.internal.zzeu r0 = r5.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzx()
            java.lang.String r2 = "Service available"
            r0.zza(r2)
        L_0x00d8:
            r0 = r1
        L_0x00d9:
            if (r1 != 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.zzy r2 = r5.zzt()
            boolean r2 = r2.zzy()
            if (r2 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.zzeu r0 = r5.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.zza(r2)
            goto L_0x00f4
        L_0x00f3:
            r3 = r0
        L_0x00f4:
            if (r3 == 0) goto L_0x00fd
            com.google.android.gms.measurement.internal.zzfg r0 = r5.zzs()
            r0.zza((boolean) r1)
        L_0x00fd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.zzc = r0
        L_0x0103:
            java.lang.Boolean r0 = r5.zzc
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzir.zzal():boolean");
    }

    /* access modifiers changed from: protected */
    public final void zza(zzem zzem) {
        zzd();
        Preconditions.checkNotNull(zzem);
        this.zzb = zzem;
        zzak();
        zzan();
    }

    public final void zzah() {
        zzd();
        zzw();
        this.zza.zza();
        try {
            ConnectionTracker.getInstance().unbindService(zzn(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    /* access modifiers changed from: private */
    public final void zza(ComponentName componentName) {
        zzd();
        if (this.zzb != null) {
            this.zzb = null;
            zzr().zzx().zza("Disconnected from device MeasurementService", componentName);
            zzd();
            zzaf();
        }
    }

    /* access modifiers changed from: private */
    public final void zzam() {
        zzd();
        if (zzab()) {
            zzr().zzx().zza("Inactivity, disconnecting from the service");
            zzah();
        }
    }

    private final void zza(Runnable runnable) throws IllegalStateException {
        zzd();
        if (zzab()) {
            runnable.run();
        } else if (((long) this.zzf.size()) >= 1000) {
            zzr().zzf().zza("Discarding data. Max runnable queue size reached");
        } else {
            this.zzf.add(runnable);
            this.zzg.zza(60000);
            zzaf();
        }
    }

    /* access modifiers changed from: private */
    public final void zzan() {
        zzd();
        zzr().zzx().zza("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        for (Runnable run : this.zzf) {
            try {
                run.run();
            } catch (Exception e) {
                zzr().zzf().zza("Task exception while flushing queue", e);
            }
        }
        this.zzf.clear();
        this.zzg.zzc();
    }

    private final zzn zza(boolean z) {
        zzu();
        return zzg().zza(z ? zzr().zzy() : null);
    }

    public final void zza(zzw zzw, zzao zzao, String str) {
        zzd();
        zzw();
        if (zzp().zza((int) GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) != 0) {
            zzr().zzi().zza("Not bundling data. Service unavailable or out of date");
            zzp().zza(zzw, new byte[0]);
            return;
        }
        zza((Runnable) new zzjb(this, zzao, str, zzw));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzai() {
        zzd();
        zzw();
        if (zzal() && zzp().zzj() < 200900) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    public final /* bridge */ /* synthetic */ zza zze() {
        return super.zze();
    }

    public final /* bridge */ /* synthetic */ zzhc zzf() {
        return super.zzf();
    }

    public final /* bridge */ /* synthetic */ zzer zzg() {
        return super.zzg();
    }

    public final /* bridge */ /* synthetic */ zzir zzh() {
        return super.zzh();
    }

    public final /* bridge */ /* synthetic */ zzii zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzeq zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ zzjv zzk() {
        return super.zzk();
    }

    public final /* bridge */ /* synthetic */ zzai zzl() {
        return super.zzl();
    }

    public final /* bridge */ /* synthetic */ Clock zzm() {
        return super.zzm();
    }

    public final /* bridge */ /* synthetic */ Context zzn() {
        return super.zzn();
    }

    public final /* bridge */ /* synthetic */ zzes zzo() {
        return super.zzo();
    }

    public final /* bridge */ /* synthetic */ zzkr zzp() {
        return super.zzp();
    }

    public final /* bridge */ /* synthetic */ zzfv zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ zzeu zzr() {
        return super.zzr();
    }

    public final /* bridge */ /* synthetic */ zzfg zzs() {
        return super.zzs();
    }

    public final /* bridge */ /* synthetic */ zzy zzt() {
        return super.zzt();
    }

    public final /* bridge */ /* synthetic */ zzx zzu() {
        return super.zzu();
    }
}
