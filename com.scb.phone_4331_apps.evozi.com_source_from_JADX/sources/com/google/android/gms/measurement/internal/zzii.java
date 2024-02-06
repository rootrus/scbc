package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzlf;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class zzii extends zzg {
    protected zzij zza;
    private volatile zzij zzb;
    private zzij zzc;
    private final Map<Activity, zzij> zzd = new ConcurrentHashMap();
    private Activity zze;
    private volatile boolean zzf;
    private volatile zzij zzg;
    /* access modifiers changed from: private */
    public zzij zzh;
    private boolean zzi;
    private final Object zzj = new Object();
    private zzij zzk;
    private String zzl;

    public zzii(zzfy zzfy) {
        super(zzfy);
    }

    /* access modifiers changed from: protected */
    public final boolean zzz() {
        return false;
    }

    public final zzij zza(boolean z) {
        zzw();
        zzd();
        if (!zzt().zza(zzaq.zzcc) || !z) {
            return this.zza;
        }
        zzij zzij = this.zza;
        return zzij != null ? zzij : this.zzh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d7, code lost:
        r0 = zzr().zzx();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00df, code lost:
        if (r3 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e1, code lost:
        r1 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e5, code lost:
        if (r4 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e7, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00eb, code lost:
        r0.zza("Logging screen view with name, class", r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f2, code lost:
        if (r13.zzb != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f4, code lost:
        r0 = r13.zzc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f7, code lost:
        r0 = r13.zzb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f9, code lost:
        r9 = r0;
        r2 = new com.google.android.gms.measurement.internal.zzij(r3, r4, zzp().zzg(), true);
        r13.zzb = r2;
        r13.zzc = r9;
        r13.zzg = r2;
        zzq().zza((java.lang.Runnable) new com.google.android.gms.measurement.internal.zzil(r13, r14, r2, r9, zzm().elapsedRealtime()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0126, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(android.os.Bundle r14) {
        /*
            r13 = this;
            com.google.android.gms.measurement.internal.zzy r0 = r13.zzt()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.zzcc
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r1)
            if (r0 != 0) goto L_0x001a
            com.google.android.gms.measurement.internal.zzeu r14 = r13.zzr()
            com.google.android.gms.measurement.internal.zzew r14 = r14.zzk()
            java.lang.String r0 = "Manual screen reporting is disabled."
            r14.zza(r0)
            return
        L_0x001a:
            java.lang.Object r0 = r13.zzj
            monitor-enter(r0)
            boolean r1 = r13.zzi     // Catch:{ all -> 0x0127 }
            if (r1 != 0) goto L_0x0030
            com.google.android.gms.measurement.internal.zzeu r14 = r13.zzr()     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzew r14 = r14.zzk()     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = "Cannot log screen view event when the app is in the background."
            r14.zza(r1)     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x0030:
            r1 = 0
            if (r14 == 0) goto L_0x008f
            java.lang.String r1 = "screen_name"
            java.lang.String r1 = r14.getString(r1)     // Catch:{ all -> 0x0127 }
            r2 = 100
            if (r1 == 0) goto L_0x0060
            int r3 = r1.length()     // Catch:{ all -> 0x0127 }
            if (r3 <= 0) goto L_0x0049
            int r3 = r1.length()     // Catch:{ all -> 0x0127 }
            if (r3 <= r2) goto L_0x0060
        L_0x0049:
            com.google.android.gms.measurement.internal.zzeu r14 = r13.zzr()     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzew r14 = r14.zzk()     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = "Invalid screen name length for screen view. Length"
            int r1 = r1.length()     // Catch:{ all -> 0x0127 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0127 }
            r14.zza(r2, r1)     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x0060:
            java.lang.String r3 = "screen_class"
            java.lang.String r3 = r14.getString(r3)     // Catch:{ all -> 0x0127 }
            if (r3 == 0) goto L_0x008b
            int r4 = r3.length()     // Catch:{ all -> 0x0127 }
            if (r4 <= 0) goto L_0x0074
            int r4 = r3.length()     // Catch:{ all -> 0x0127 }
            if (r4 <= r2) goto L_0x008b
        L_0x0074:
            com.google.android.gms.measurement.internal.zzeu r14 = r13.zzr()     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzew r14 = r14.zzk()     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = "Invalid screen class length for screen view. Length"
            int r2 = r3.length()     // Catch:{ all -> 0x0127 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0127 }
            r14.zza(r1, r2)     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x008b:
            r12 = r3
            r3 = r1
            r1 = r12
            goto L_0x0090
        L_0x008f:
            r3 = r1
        L_0x0090:
            if (r1 != 0) goto L_0x00a7
            android.app.Activity r1 = r13.zze     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x00a5
            android.app.Activity r1 = r13.zze     // Catch:{ all -> 0x0127 }
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = r1.getCanonicalName()     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = zza((java.lang.String) r1)     // Catch:{ all -> 0x0127 }
            goto L_0x00a7
        L_0x00a5:
            java.lang.String r1 = "Activity"
        L_0x00a7:
            r4 = r1
            boolean r1 = r13.zzf     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.zzij r1 = r13.zzb     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x00d6
            r1 = 0
            r13.zzf = r1     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzij r1 = r13.zzb     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = r1.zzb     // Catch:{ all -> 0x0127 }
            boolean r1 = com.google.android.gms.measurement.internal.zzkr.zzc((java.lang.String) r1, (java.lang.String) r4)     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzij r2 = r13.zzb     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = r2.zza     // Catch:{ all -> 0x0127 }
            boolean r2 = com.google.android.gms.measurement.internal.zzkr.zzc((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0127 }
            if (r1 == 0) goto L_0x00d6
            if (r2 == 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.zzeu r14 = r13.zzr()     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzew r14 = r14.zzk()     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = "Ignoring call to log screen view event with duplicate parameters."
            r14.zza(r1)     // Catch:{ all -> 0x0127 }
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            return
        L_0x00d6:
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            com.google.android.gms.measurement.internal.zzeu r0 = r13.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzx()
            if (r3 != 0) goto L_0x00e4
            java.lang.String r1 = "null"
            goto L_0x00e5
        L_0x00e4:
            r1 = r3
        L_0x00e5:
            if (r4 != 0) goto L_0x00ea
            java.lang.String r2 = "null"
            goto L_0x00eb
        L_0x00ea:
            r2 = r4
        L_0x00eb:
            java.lang.String r5 = "Logging screen view with name, class"
            r0.zza(r5, r1, r2)
            com.google.android.gms.measurement.internal.zzij r0 = r13.zzb
            if (r0 != 0) goto L_0x00f7
            com.google.android.gms.measurement.internal.zzij r0 = r13.zzc
            goto L_0x00f9
        L_0x00f7:
            com.google.android.gms.measurement.internal.zzij r0 = r13.zzb
        L_0x00f9:
            r9 = r0
            com.google.android.gms.measurement.internal.zzij r8 = new com.google.android.gms.measurement.internal.zzij
            com.google.android.gms.measurement.internal.zzkr r0 = r13.zzp()
            long r5 = r0.zzg()
            r7 = 1
            r2 = r8
            r2.<init>(r3, r4, r5, r7)
            r13.zzb = r8
            r13.zzc = r9
            r13.zzg = r8
            com.google.android.gms.common.util.Clock r0 = r13.zzm()
            long r10 = r0.elapsedRealtime()
            com.google.android.gms.measurement.internal.zzfv r0 = r13.zzq()
            com.google.android.gms.measurement.internal.zzil r1 = new com.google.android.gms.measurement.internal.zzil
            r5 = r1
            r6 = r13
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r0.zza((java.lang.Runnable) r1)
            return
        L_0x0127:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0127 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzii.zza(android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    public final void zza(Bundle bundle, zzij zzij, zzij zzij2, long j) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        zza(zzij, zzij2, j, true, zzp().zza((String) null, "screen_view", bundle, (List<String>) null, true, true));
    }

    public final void zza(Activity activity, String str, String str2) {
        if (!zzt().zzj().booleanValue()) {
            zzr().zzk().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
        } else if (this.zzb == null) {
            zzr().zzk().zza("setCurrentScreen cannot be called while no activity active");
        } else if (this.zzd.get(activity) == null) {
            zzr().zzk().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = zza(activity.getClass().getCanonicalName());
            }
            boolean zzc2 = zzkr.zzc(this.zzb.zzb, str2);
            boolean zzc3 = zzkr.zzc(this.zzb.zza, str);
            if (zzc2 && zzc3) {
                zzr().zzk().zza("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                zzr().zzk().zza("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                zzr().zzx().zza("Setting current screen to name, class", str == null ? "null" : str, str2);
                zzij zzij = new zzij(str, str2, zzp().zzg());
                this.zzd.put(activity, zzij);
                zza(activity, zzij, true);
            } else {
                zzr().zzk().zza("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    public final zzij zzab() {
        zzb();
        return this.zzb;
    }

    private final void zza(Activity activity, zzij zzij, boolean z) {
        zzij zzij2;
        zzij zzij3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzij.zzb == null) {
            zzij2 = new zzij(zzij.zza, activity != null ? zza(activity.getClass().getCanonicalName()) : null, zzij.zzc, zzij.zze);
        } else {
            zzij2 = zzij;
        }
        this.zzc = this.zzb;
        this.zzb = zzij2;
        zzq().zza((Runnable) new zzik(this, zzij2, zzij3, zzm().elapsedRealtime(), z));
    }

    /* access modifiers changed from: private */
    public final void zza(zzij zzij, zzij zzij2, long j, boolean z, Bundle bundle) {
        boolean z2;
        String str;
        long j2;
        zzij zzij3;
        zzd();
        boolean z3 = false;
        if (zzt().zza(zzaq.zzat)) {
            z2 = z && this.zza != null;
            if (z2) {
                zza(this.zza, true, j);
            }
        } else {
            if (z && (zzij3 = this.zza) != null) {
                zza(zzij3, true, j);
            }
            z2 = false;
        }
        if (zzij2 == null || zzij2.zzc != zzij.zzc || !zzkr.zzc(zzij2.zzb, zzij.zzb) || !zzkr.zzc(zzij2.zza, zzij.zza)) {
            z3 = true;
        }
        if (z3) {
            Bundle bundle2 = new Bundle();
            if (zzt().zza(zzaq.zzcc)) {
                bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            }
            zza(zzij, bundle2, true);
            if (zzij2 != null) {
                if (zzij2.zza != null) {
                    bundle2.putString("_pn", zzij2.zza);
                }
                if (zzij2.zzb != null) {
                    bundle2.putString("_pc", zzij2.zzb);
                }
                bundle2.putLong("_pi", zzij2.zzc);
            }
            if (zzt().zza(zzaq.zzat) && z2) {
                if (!zzlf.zzb() || !zzt().zza(zzaq.zzav) || !zzkt.zzb() || !zzt().zza(zzaq.zzbz)) {
                    j2 = zzk().zzb.zzb();
                } else {
                    j2 = zzk().zza(j);
                }
                if (j2 > 0) {
                    zzp().zza(bundle2, j2);
                }
            }
            if (zzt().zza(zzaq.zzcc)) {
                if (!zzt().zzj().booleanValue()) {
                    bundle2.putLong("_mt", 1);
                }
                if (zzij.zze) {
                    str = "app";
                    zzf().zzb(str, "_vs", bundle2);
                }
            }
            str = "auto";
            zzf().zzb(str, "_vs", bundle2);
        }
        this.zza = zzij;
        if (zzt().zza(zzaq.zzcc) && zzij.zze) {
            this.zzh = zzij;
        }
        zzh().zza(zzij);
    }

    /* access modifiers changed from: private */
    public final void zza(zzij zzij, boolean z, long j) {
        zze().zza(zzm().elapsedRealtime());
        if (zzk().zza(zzij != null && zzij.zzd, z, j) && zzij != null) {
            zzij.zzd = false;
        }
    }

    public static void zza(zzij zzij, Bundle bundle, boolean z) {
        if (bundle != null && zzij != null && (!bundle.containsKey("_sc") || z)) {
            if (zzij.zza != null) {
                bundle.putString("_sn", zzij.zza);
            } else {
                bundle.remove("_sn");
            }
            if (zzij.zzb != null) {
                bundle.putString("_sc", zzij.zzb);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", zzij.zzc);
        } else if (bundle != null && zzij == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void zza(String str, zzij zzij) {
        zzd();
        synchronized (this) {
            if (this.zzl == null || this.zzl.equals(str) || zzij != null) {
                this.zzl = str;
                this.zzk = zzij;
            }
        }
    }

    private static String zza(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final zzij zzd(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzij zzij = this.zzd.get(activity);
        if (zzij == null) {
            zzij zzij2 = new zzij((String) null, zza(activity.getClass().getCanonicalName()), zzp().zzg());
            this.zzd.put(activity, zzij2);
            zzij = zzij2;
        }
        return (zzt().zza(zzaq.zzcc) && this.zzg != null) ? this.zzg : zzij;
    }

    public final void zza(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (zzt().zzj().booleanValue() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.zzd.put(activity, new zzij(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(Name.MARK)));
        }
    }

    public final void zza(Activity activity) {
        if (zzt().zza(zzaq.zzcc)) {
            synchronized (this.zzj) {
                this.zzi = true;
                if (activity != this.zze) {
                    synchronized (this.zzj) {
                        this.zze = activity;
                        this.zzf = false;
                    }
                    if (zzt().zza(zzaq.zzcb) && zzt().zzj().booleanValue()) {
                        this.zzg = null;
                        zzq().zza((Runnable) new zzio(this));
                    }
                }
            }
        }
        if (!zzt().zza(zzaq.zzcb) || zzt().zzj().booleanValue()) {
            zza(activity, zzd(activity), false);
            zza zze2 = zze();
            zze2.zzq().zza((Runnable) new zze(zze2, zze2.zzm().elapsedRealtime()));
            return;
        }
        this.zzb = this.zzg;
        zzq().zza((Runnable) new zzin(this));
    }

    public final void zzb(Activity activity) {
        if (zzt().zza(zzaq.zzcc)) {
            synchronized (this.zzj) {
                this.zzi = false;
                this.zzf = true;
            }
        }
        long elapsedRealtime = zzm().elapsedRealtime();
        if (!zzt().zza(zzaq.zzcb) || zzt().zzj().booleanValue()) {
            zzij zzd2 = zzd(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            zzq().zza((Runnable) new zzip(this, zzd2, elapsedRealtime));
            return;
        }
        this.zzb = null;
        zzq().zza((Runnable) new zzim(this, elapsedRealtime));
    }

    public final void zzb(Activity activity, Bundle bundle) {
        zzij zzij;
        if (zzt().zzj().booleanValue() && bundle != null && (zzij = this.zzd.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong(Name.MARK, zzij.zzc);
            bundle2.putString("name", zzij.zza);
            bundle2.putString("referrer_name", zzij.zzb);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void zzc(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (zzt().zzj().booleanValue()) {
            this.zzd.remove(activity);
        }
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
