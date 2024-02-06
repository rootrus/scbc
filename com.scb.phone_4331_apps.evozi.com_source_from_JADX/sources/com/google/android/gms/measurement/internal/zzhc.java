package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzko;
import com.google.android.gms.internal.measurement.zzla;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import p040o.setTextAppearance;

public final class zzhc extends zzg {
    protected zzhy zza;
    final zzp zzb;
    protected boolean zzc = true;
    private zzhb zzd;
    private final Set<zzha> zze = new CopyOnWriteArraySet();
    private boolean zzf;
    private final AtomicReference<String> zzg = new AtomicReference<>();

    protected zzhc(zzfy zzfy) {
        super(zzfy);
        this.zzb = new zzp(zzfy);
    }

    /* access modifiers changed from: protected */
    public final boolean zzz() {
        return false;
    }

    public final void zzab() {
        if (zzn().getApplicationContext() instanceof Application) {
            ((Application) zzn().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
        }
    }

    public final Boolean zzac() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzq().zza(atomicReference, 15000, "boolean test flag value", new zzhh(this, atomicReference));
    }

    public final String zzad() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzq().zza(atomicReference, 15000, "String test flag value", new zzho(this, atomicReference));
    }

    public final Long zzae() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzq().zza(atomicReference, 15000, "long test flag value", new zzht(this, atomicReference));
    }

    public final Integer zzaf() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzq().zza(atomicReference, 15000, "int test flag value", new zzhs(this, atomicReference));
    }

    public final Double zzag() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzq().zza(atomicReference, 15000, "double test flag value", new zzhv(this, atomicReference));
    }

    public final void zza(boolean z) {
        zzw();
        zzb();
        zzq().zza((Runnable) new zzhu(this, z));
    }

    /* access modifiers changed from: private */
    public final void zzc(boolean z) {
        zzd();
        zzb();
        zzw();
        zzr().zzw().zza("Setting app measurement enabled (FE)", Boolean.valueOf(z));
        zzs().zzb(z);
        zzam();
    }

    /* access modifiers changed from: private */
    public final void zzam() {
        zzd();
        String zza2 = zzs().zzn.zza();
        if (zza2 != null) {
            if ("unset".equals(zza2)) {
                zza("app", "_npa", (Object) null, zzm().currentTimeMillis());
            } else {
                zza("app", "_npa", (Object) Long.valueOf("true".equals(zza2) ? 1 : 0), zzm().currentTimeMillis());
            }
        }
        if (!this.zzy.zzab() || !this.zzc) {
            zzr().zzw().zza("Updating Scion state (FE)");
            zzh().zzac();
            return;
        }
        zzr().zzw().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzai();
        if (zzla.zzb() && zzt().zza(zzaq.zzbv)) {
            zzk().zza.zza();
        }
        if (zzko.zzb() && zzt().zza(zzaq.zzca)) {
            if (!(this.zzy.zzf().zza.zzc().zzi.zza() > 0)) {
                zzfp zzf2 = this.zzy.zzf();
                zzf2.zza.zzad();
                zzf2.zza(zzf2.zza.zzn().getPackageName());
            }
        }
        if (zzt().zza(zzaq.zzcq)) {
            zzq().zza((Runnable) new zzhw(this));
        }
    }

    public final void zza(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, zzm().currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public final void zzb(String str, String str2, Bundle bundle) {
        zzb();
        zzd();
        zza(str, str2, zzm().currentTimeMillis(), bundle);
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, String str2, long j, Bundle bundle) {
        zzb();
        zzd();
        zza(str, str2, j, bundle, true, this.zzd == null || zzkr.zze(str2), false, (String) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            r15 = r29
            r13 = r30
            r12 = r32
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r28)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r32)
            r27.zzd()
            r27.zzw()
            com.google.android.gms.measurement.internal.zzfy r0 = r7.zzy
            boolean r0 = r0.zzab()
            if (r0 != 0) goto L_0x002c
            com.google.android.gms.measurement.internal.zzeu r0 = r27.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzw()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.zza(r1)
            return
        L_0x002c:
            com.google.android.gms.measurement.internal.zzy r0 = r27.zzt()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.zzbb
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r1)
            if (r0 == 0) goto L_0x0056
            com.google.android.gms.measurement.internal.zzer r0 = r27.zzg()
            java.util.List r0 = r0.zzah()
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.contains(r15)
            if (r0 != 0) goto L_0x0056
            com.google.android.gms.measurement.internal.zzeu r0 = r27.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzw()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.zza(r1, r15, r8)
            return
        L_0x0056:
            boolean r0 = r7.zzf
            r11 = 0
            r10 = 0
            r9 = 1
            if (r0 != 0) goto L_0x00ae
            r7.zzf = r9
            com.google.android.gms.measurement.internal.zzfy r0 = r7.zzy     // Catch:{ ClassNotFoundException -> 0x00a1 }
            boolean r0 = r0.zzt()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.String r1 = "com.google.android.gms.tagmanager.TagManagerService"
            if (r0 != 0) goto L_0x0076
            android.content.Context r0 = r27.zzn()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.Class r0 = java.lang.Class.forName(r1, r9, r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            goto L_0x007a
        L_0x0076:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00a1 }
        L_0x007a:
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x0092 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r10] = r2     // Catch:{ Exception -> 0x0092 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0092 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0092 }
            android.content.Context r2 = r27.zzn()     // Catch:{ Exception -> 0x0092 }
            r1[r10] = r2     // Catch:{ Exception -> 0x0092 }
            r0.invoke(r11, r1)     // Catch:{ Exception -> 0x0092 }
            goto L_0x00ae
        L_0x0092:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzeu r1 = r27.zzr()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzi()     // Catch:{ ClassNotFoundException -> 0x00a1 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.zza(r2, r0)     // Catch:{ ClassNotFoundException -> 0x00a1 }
            goto L_0x00ae
        L_0x00a1:
            com.google.android.gms.measurement.internal.zzeu r0 = r27.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzv()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.zza(r1)
        L_0x00ae:
            com.google.android.gms.measurement.internal.zzy r0 = r27.zzt()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.zzbh
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r1)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00df
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.common.util.Clock r0 = r27.zzm()
            long r5 = r0.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r27
            r1.zza((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
        L_0x00df:
            boolean r0 = com.google.android.gms.internal.measurement.zzlr.zzb()
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.zzy r0 = r27.zzt()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.zzaq.zzcm
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r1)
            if (r0 == 0) goto L_0x010d
            r27.zzu()
            if (r33 == 0) goto L_0x010d
            boolean r0 = com.google.android.gms.measurement.internal.zzkr.zzg(r29)
            if (r0 == 0) goto L_0x010d
            com.google.android.gms.measurement.internal.zzkr r0 = r27.zzp()
            com.google.android.gms.measurement.internal.zzfg r1 = r27.zzs()
            com.google.android.gms.measurement.internal.zzfl r1 = r1.zzx
            android.os.Bundle r1 = r1.zza()
            r0.zza((android.os.Bundle) r12, (android.os.Bundle) r1)
        L_0x010d:
            r0 = 40
            if (r35 == 0) goto L_0x0171
            r27.zzu()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x0171
            com.google.android.gms.measurement.internal.zzfy r1 = r7.zzy
            com.google.android.gms.measurement.internal.zzkr r1 = r1.zzi()
            java.lang.String r2 = "event"
            boolean r3 = r1.zza((java.lang.String) r2, (java.lang.String) r15)
            r4 = 2
            if (r3 != 0) goto L_0x012c
            goto L_0x013f
        L_0x012c:
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.zzgw.zza
            boolean r3 = r1.zza((java.lang.String) r2, (java.lang.String[]) r3, (java.lang.String) r15)
            if (r3 != 0) goto L_0x0137
            r4 = 13
            goto L_0x013f
        L_0x0137:
            boolean r1 = r1.zza((java.lang.String) r2, (int) r0, (java.lang.String) r15)
            if (r1 != 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r4 = r10
        L_0x013f:
            if (r4 == 0) goto L_0x0171
            com.google.android.gms.measurement.internal.zzeu r1 = r27.zzr()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzh()
            com.google.android.gms.measurement.internal.zzes r2 = r27.zzo()
            java.lang.String r2 = r2.zza((java.lang.String) r15)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.zza(r3, r2)
            com.google.android.gms.measurement.internal.zzfy r1 = r7.zzy
            r1.zzi()
            java.lang.String r0 = com.google.android.gms.measurement.internal.zzkr.zza((java.lang.String) r15, (int) r0, (boolean) r9)
            if (r15 == 0) goto L_0x0165
            int r10 = r29.length()
        L_0x0165:
            com.google.android.gms.measurement.internal.zzfy r1 = r7.zzy
            com.google.android.gms.measurement.internal.zzkr r1 = r1.zzi()
            java.lang.String r2 = "_ev"
            r1.zza((int) r4, (java.lang.String) r2, (java.lang.String) r0, (int) r10)
            return
        L_0x0171:
            r27.zzu()
            com.google.android.gms.measurement.internal.zzii r1 = r27.zzi()
            com.google.android.gms.measurement.internal.zzij r1 = r1.zza((boolean) r10)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x0188
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x0188
            r1.zzd = r9
        L_0x0188:
            if (r33 == 0) goto L_0x018e
            if (r35 == 0) goto L_0x018e
            r3 = r9
            goto L_0x018f
        L_0x018e:
            r3 = r10
        L_0x018f:
            com.google.android.gms.measurement.internal.zzii.zza((com.google.android.gms.measurement.internal.zzij) r1, (android.os.Bundle) r12, (boolean) r3)
            java.lang.String r3 = "am"
            boolean r16 = r3.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.zzkr.zze(r29)
            if (r33 == 0) goto L_0x01d1
            com.google.android.gms.measurement.internal.zzhb r4 = r7.zzd
            if (r4 == 0) goto L_0x01d1
            if (r3 != 0) goto L_0x01d1
            if (r16 != 0) goto L_0x01d1
            com.google.android.gms.measurement.internal.zzeu r0 = r27.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzw()
            com.google.android.gms.measurement.internal.zzes r1 = r27.zzo()
            java.lang.String r1 = r1.zza((java.lang.String) r15)
            com.google.android.gms.measurement.internal.zzes r2 = r27.zzo()
            java.lang.String r2 = r2.zza((android.os.Bundle) r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.zza(r3, r1, r2)
            com.google.android.gms.measurement.internal.zzhb r1 = r7.zzd
            r2 = r28
            r3 = r29
            r4 = r32
            r5 = r30
            r1.interceptEvent(r2, r3, r4, r5)
            return
        L_0x01d1:
            com.google.android.gms.measurement.internal.zzfy r3 = r7.zzy
            boolean r3 = r3.zzag()
            if (r3 != 0) goto L_0x01da
            return
        L_0x01da:
            com.google.android.gms.measurement.internal.zzkr r3 = r27.zzp()
            int r3 = r3.zzb((java.lang.String) r15)
            if (r3 == 0) goto L_0x021e
            com.google.android.gms.measurement.internal.zzeu r1 = r27.zzr()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzh()
            com.google.android.gms.measurement.internal.zzes r2 = r27.zzo()
            java.lang.String r2 = r2.zza((java.lang.String) r15)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r1.zza(r4, r2)
            r27.zzp()
            java.lang.String r0 = com.google.android.gms.measurement.internal.zzkr.zza((java.lang.String) r15, (int) r0, (boolean) r9)
            if (r15 == 0) goto L_0x0206
            int r10 = r29.length()
        L_0x0206:
            com.google.android.gms.measurement.internal.zzfy r1 = r7.zzy
            com.google.android.gms.measurement.internal.zzkr r1 = r1.zzi()
            java.lang.String r2 = "_ev"
            r28 = r1
            r29 = r36
            r30 = r3
            r31 = r2
            r32 = r0
            r33 = r10
            r28.zza((java.lang.String) r29, (int) r30, (java.lang.String) r31, (java.lang.String) r32, (int) r33)
            return
        L_0x021e:
            java.lang.String r0 = "_sn"
            java.lang.String r3 = "_si"
            java.lang.String r5 = "_o"
            java.lang.String[] r4 = new java.lang.String[]{r5, r0, r2, r3}
            java.util.List r17 = com.google.android.gms.common.util.CollectionUtils.listOf((T[]) r4)
            com.google.android.gms.measurement.internal.zzkr r4 = r27.zzp()
            r6 = 1
            r9 = r4
            r4 = r10
            r10 = r36
            r19 = r11
            r11 = r29
            r12 = r32
            r13 = r17
            r14 = r35
            r15 = r6
            android.os.Bundle r15 = r9.zza((java.lang.String) r10, (java.lang.String) r11, (android.os.Bundle) r12, (java.util.List<java.lang.String>) r13, (boolean) r14, (boolean) r15)
            if (r15 == 0) goto L_0x026d
            boolean r6 = r15.containsKey(r2)
            if (r6 == 0) goto L_0x026d
            boolean r6 = r15.containsKey(r3)
            if (r6 != 0) goto L_0x0253
            goto L_0x026d
        L_0x0253:
            java.lang.String r0 = r15.getString(r0)
            java.lang.String r2 = r15.getString(r2)
            long r9 = r15.getLong(r3)
            com.google.android.gms.measurement.internal.zzij r11 = new com.google.android.gms.measurement.internal.zzij
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            long r9 = r3.longValue()
            r11.<init>(r0, r2, r9)
            goto L_0x026f
        L_0x026d:
            r11 = r19
        L_0x026f:
            if (r11 != 0) goto L_0x0273
            r0 = r1
            goto L_0x0274
        L_0x0273:
            r0 = r11
        L_0x0274:
            com.google.android.gms.measurement.internal.zzy r1 = r27.zzt()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.zzat
            boolean r1 = r1.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r2)
            r9 = 0
            java.lang.String r14 = "_ae"
            if (r1 == 0) goto L_0x02af
            r27.zzu()
            com.google.android.gms.measurement.internal.zzii r1 = r27.zzi()
            com.google.android.gms.measurement.internal.zzij r1 = r1.zza((boolean) r4)
            if (r1 == 0) goto L_0x02af
            r13 = r29
            boolean r1 = r14.equals(r13)
            if (r1 == 0) goto L_0x02b1
            com.google.android.gms.measurement.internal.zzjv r1 = r27.zzk()
            com.google.android.gms.measurement.internal.zzkb r1 = r1.zzb
            long r1 = r1.zzb()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02b1
            com.google.android.gms.measurement.internal.zzkr r3 = r27.zzp()
            r3.zza((android.os.Bundle) r15, (long) r1)
            goto L_0x02b1
        L_0x02af:
            r13 = r29
        L_0x02b1:
            boolean r1 = com.google.android.gms.internal.measurement.zzkh.zzb()
            if (r1 == 0) goto L_0x0333
            com.google.android.gms.measurement.internal.zzy r1 = r27.zzt()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.zzbu
            boolean r1 = r1.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r2)
            if (r1 == 0) goto L_0x0333
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x0316
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0316
            com.google.android.gms.measurement.internal.zzkr r1 = r27.zzp()
            java.lang.String r2 = r15.getString(r2)
            boolean r3 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r2)
            if (r3 == 0) goto L_0x02e6
            r11 = r19
            goto L_0x02ea
        L_0x02e6:
            java.lang.String r11 = r2.trim()
        L_0x02ea:
            com.google.android.gms.measurement.internal.zzfg r2 = r1.zzs()
            com.google.android.gms.measurement.internal.zzfm r2 = r2.zzu
            java.lang.String r2 = r2.zza()
            boolean r2 = com.google.android.gms.measurement.internal.zzkr.zzc((java.lang.String) r11, (java.lang.String) r2)
            if (r2 == 0) goto L_0x0309
            com.google.android.gms.measurement.internal.zzeu r1 = r1.zzr()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzw()
            java.lang.String r2 = "Not logging duplicate session_start_with_rollout event"
            r1.zza(r2)
            r1 = r4
            goto L_0x0313
        L_0x0309:
            com.google.android.gms.measurement.internal.zzfg r1 = r1.zzs()
            com.google.android.gms.measurement.internal.zzfm r1 = r1.zzu
            r1.zza(r11)
            r1 = 1
        L_0x0313:
            if (r1 != 0) goto L_0x0333
            return
        L_0x0316:
            boolean r1 = r14.equals(r13)
            if (r1 == 0) goto L_0x0333
            com.google.android.gms.measurement.internal.zzkr r1 = r27.zzp()
            com.google.android.gms.measurement.internal.zzfg r1 = r1.zzs()
            com.google.android.gms.measurement.internal.zzfm r1 = r1.zzu
            java.lang.String r1 = r1.zza()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0333
            r15.putString(r2, r1)
        L_0x0333:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r12.add(r15)
            com.google.android.gms.measurement.internal.zzkr r1 = r27.zzp()
            java.security.SecureRandom r1 = r1.zzh()
            long r2 = r1.nextLong()
            com.google.android.gms.measurement.internal.zzfg r1 = r27.zzs()
            com.google.android.gms.measurement.internal.zzfk r1 = r1.zzp
            long r19 = r1.zza()
            int r1 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x03ba
            com.google.android.gms.measurement.internal.zzfg r1 = r27.zzs()
            r9 = r30
            boolean r1 = r1.zza((long) r9)
            if (r1 == 0) goto L_0x03bc
            com.google.android.gms.measurement.internal.zzfg r1 = r27.zzs()
            com.google.android.gms.measurement.internal.zzfi r1 = r1.zzr
            boolean r1 = r1.zza()
            if (r1 == 0) goto L_0x03bc
            com.google.android.gms.measurement.internal.zzeu r1 = r27.zzr()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzx()
            java.lang.String r6 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.zza(r6)
            com.google.android.gms.common.util.Clock r1 = r27.zzm()
            long r19 = r1.currentTimeMillis()
            r6 = 0
            java.lang.String r11 = "auto"
            java.lang.String r21 = "_sid"
            r1 = r27
            r22 = r2
            r2 = r11
            r3 = r21
            r11 = r4
            r4 = r6
            r8 = r5
            r5 = r19
            r1.zza((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
            com.google.android.gms.common.util.Clock r1 = r27.zzm()
            long r5 = r1.currentTimeMillis()
            r4 = 0
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r27
            r1.zza((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
            com.google.android.gms.common.util.Clock r1 = r27.zzm()
            long r5 = r1.currentTimeMillis()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r27
            r1.zza((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
            goto L_0x03c0
        L_0x03ba:
            r9 = r30
        L_0x03bc:
            r22 = r2
            r11 = r4
            r8 = r5
        L_0x03c0:
            java.lang.String r1 = "extend_session"
            r2 = 0
            long r1 = r15.getLong(r1, r2)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x03e8
            com.google.android.gms.measurement.internal.zzeu r1 = r27.zzr()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzx()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfy r1 = r7.zzy
            com.google.android.gms.measurement.internal.zzjv r1 = r1.zze()
            com.google.android.gms.measurement.internal.zzkd r1 = r1.zza
            r5 = 1
            r1.zza(r9, r5)
            goto L_0x03e9
        L_0x03e8:
            r5 = 1
        L_0x03e9:
            java.util.Set r1 = r15.keySet()
            int r2 = r15.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.Arrays.sort(r1)
            boolean r2 = com.google.android.gms.internal.measurement.zzjw.zzb()
            if (r2 == 0) goto L_0x043b
            com.google.android.gms.measurement.internal.zzy r2 = r27.zzt()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzaq.zzcg
            boolean r2 = r2.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r3)
            if (r2 == 0) goto L_0x043b
            com.google.android.gms.measurement.internal.zzy r2 = r27.zzt()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzaq.zzcf
            boolean r2 = r2.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r3)
            if (r2 == 0) goto L_0x043b
            int r0 = r1.length
            r2 = r11
        L_0x041c:
            if (r2 >= r0) goto L_0x0433
            r3 = r1[r2]
            r27.zzp()
            java.lang.Object r4 = r15.get(r3)
            android.os.Bundle[] r4 = com.google.android.gms.measurement.internal.zzkr.zzb((java.lang.Object) r4)
            if (r4 == 0) goto L_0x0430
            r15.putParcelableArray(r3, r4)
        L_0x0430:
            int r2 = r2 + 1
            goto L_0x041c
        L_0x0433:
            r20 = r5
            r33 = r8
            r2 = r13
            r0 = r14
            goto L_0x04fe
        L_0x043b:
            int r2 = r1.length
            r3 = r11
            r4 = r3
        L_0x043e:
            java.lang.String r6 = "_eid"
            if (r3 >= r2) goto L_0x04eb
            r5 = r1[r3]
            java.lang.Object r19 = r15.get(r5)
            r27.zzp()
            r32 = r1
            android.os.Bundle[] r1 = com.google.android.gms.measurement.internal.zzkr.zzb((java.lang.Object) r19)
            if (r1 == 0) goto L_0x04c8
            int r11 = r1.length
            r15.putInt(r5, r11)
            r19 = r2
            r11 = 0
        L_0x045a:
            int r2 = r1.length
            if (r11 >= r2) goto L_0x04ba
            r2 = r1[r11]
            r20 = r15
            r15 = 1
            com.google.android.gms.measurement.internal.zzii.zza((com.google.android.gms.measurement.internal.zzij) r0, (android.os.Bundle) r2, (boolean) r15)
            com.google.android.gms.measurement.internal.zzkr r18 = r27.zzp()
            r21 = 0
            java.lang.String r24 = "_ep"
            r9 = r18
            r10 = r36
            r25 = r11
            r11 = r24
            r26 = r12
            r12 = r2
            r2 = r13
            r13 = r17
            r18 = r0
            r0 = r14
            r14 = r35
            r33 = r8
            r8 = r20
            r20 = r15
            r15 = r21
            android.os.Bundle r9 = r9.zza((java.lang.String) r10, (java.lang.String) r11, (android.os.Bundle) r12, (java.util.List<java.lang.String>) r13, (boolean) r14, (boolean) r15)
            java.lang.String r10 = "_en"
            r9.putString(r10, r2)
            r10 = r22
            r9.putLong(r6, r10)
            java.lang.String r12 = "_gn"
            r9.putString(r12, r5)
            int r12 = r1.length
            java.lang.String r13 = "_ll"
            r9.putInt(r13, r12)
            java.lang.String r12 = "_i"
            r13 = r25
            r9.putInt(r12, r13)
            r12 = r26
            r12.add(r9)
            int r9 = r13 + 1
            r14 = r0
            r13 = r2
            r15 = r8
            r0 = r18
            r8 = r33
            r11 = r9
            r9 = r30
            goto L_0x045a
        L_0x04ba:
            r18 = r0
            r33 = r8
            r2 = r13
            r0 = r14
            r8 = r15
            r10 = r22
            r20 = 1
            int r1 = r1.length
            int r4 = r4 + r1
            goto L_0x04d5
        L_0x04c8:
            r18 = r0
            r19 = r2
            r33 = r8
            r2 = r13
            r0 = r14
            r8 = r15
            r10 = r22
            r20 = 1
        L_0x04d5:
            int r3 = r3 + 1
            r1 = r32
            r14 = r0
            r13 = r2
            r15 = r8
            r22 = r10
            r0 = r18
            r2 = r19
            r5 = r20
            r11 = 0
            r9 = r30
            r8 = r33
            goto L_0x043e
        L_0x04eb:
            r20 = r5
            r33 = r8
            r2 = r13
            r0 = r14
            r8 = r15
            r10 = r22
            if (r4 == 0) goto L_0x04fe
            r8.putLong(r6, r10)
            java.lang.String r1 = "_epc"
            r8.putInt(r1, r4)
        L_0x04fe:
            r10 = 0
        L_0x04ff:
            int r1 = r12.size()
            if (r10 >= r1) goto L_0x0577
            java.lang.Object r1 = r12.get(r10)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r10 == 0) goto L_0x0510
            r3 = r20
            goto L_0x0511
        L_0x0510:
            r3 = 0
        L_0x0511:
            if (r3 == 0) goto L_0x051a
            java.lang.String r3 = "_ep"
            r8 = r28
            r9 = r33
            goto L_0x051f
        L_0x051a:
            r8 = r28
            r9 = r33
            r3 = r2
        L_0x051f:
            r1.putString(r9, r8)
            if (r34 == 0) goto L_0x052c
            com.google.android.gms.measurement.internal.zzkr r4 = r27.zzp()
            android.os.Bundle r1 = r4.zza((android.os.Bundle) r1)
        L_0x052c:
            r11 = r1
            com.google.android.gms.measurement.internal.zzao r13 = new com.google.android.gms.measurement.internal.zzao
            com.google.android.gms.measurement.internal.zzan r4 = new com.google.android.gms.measurement.internal.zzan
            r4.<init>(r11)
            r1 = r13
            r14 = r2
            r2 = r3
            r3 = r4
            r4 = r28
            r15 = r20
            r5 = r30
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.zzir r1 = r27.zzh()
            r5 = r36
            r1.zza((com.google.android.gms.measurement.internal.zzao) r13, (java.lang.String) r5)
            if (r16 != 0) goto L_0x056f
            java.util.Set<com.google.android.gms.measurement.internal.zzha> r1 = r7.zze
            java.util.Iterator r13 = r1.iterator()
        L_0x0552:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x056f
            java.lang.Object r1 = r13.next()
            com.google.android.gms.measurement.internal.zzha r1 = (com.google.android.gms.measurement.internal.zzha) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r11)
            r2 = r28
            r3 = r29
            r5 = r30
            r1.onEvent(r2, r3, r4, r5)
            r5 = r36
            goto L_0x0552
        L_0x056f:
            int r10 = r10 + 1
            r33 = r9
            r2 = r14
            r20 = r15
            goto L_0x04ff
        L_0x0577:
            r14 = r2
            r15 = r20
            r27.zzu()
            com.google.android.gms.measurement.internal.zzii r1 = r27.zzi()
            r2 = 0
            com.google.android.gms.measurement.internal.zzij r1 = r1.zza((boolean) r2)
            if (r1 == 0) goto L_0x059d
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x059d
            com.google.android.gms.measurement.internal.zzjv r0 = r27.zzk()
            com.google.android.gms.common.util.Clock r1 = r27.zzm()
            long r1 = r1.elapsedRealtime()
            r0.zza(r15, r15, r1)
        L_0x059d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhc.zza(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        zzb();
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (zzt().zza(zzaq.zzcc)) {
            String str4 = str2;
            if (zzkr.zzc(str2, "screen_view")) {
                zzi().zza(bundle2);
                return;
            }
        } else {
            String str5 = str2;
        }
        zzb(str3, str2, j, bundle2, z2, !z2 || this.zzd == null || zzkr.zze(str2), !z, (String) null);
    }

    private final void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        zzq().zza((Runnable) new zzhj(this, str, str2, j, zzkr.zzb(bundle), z, z2, z3, str3));
    }

    public final void zza(String str, String str2, Object obj, boolean z) {
        zza(str, str2, obj, true, zzm().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = zzp().zzc(str2);
        } else {
            zzkr zzp = zzp();
            if (zzp.zza("user property", str2)) {
                if (!zzp.zza("user property", zzgy.zza, str2)) {
                    i = 15;
                } else if (zzp.zza("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            zzp();
            String zza2 = zzkr.zza(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.zzy.zzi().zza(i, "_ev", zza2, i2);
        } else if (obj != null) {
            int zzb2 = zzp().zzb(str2, obj);
            if (zzb2 != 0) {
                zzp();
                String zza3 = zzkr.zza(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.zzy.zzi().zza(zzb2, "_ev", zza3, i2);
                return;
            }
            Object zzc2 = zzp().zzc(str2, obj);
            if (zzc2 != null) {
                zza(str3, str2, j, zzc2);
            }
        } else {
            zza(str3, str2, j, (Object) null);
        }
    }

    private final void zza(String str, String str2, long j, Object obj) {
        zzq().zza((Runnable) new zzhi(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str, String str2, Object obj, long j) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzd();
        zzb();
        zzw();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = "false";
                    Long valueOf = Long.valueOf(str4.equals(str3.toLowerCase(Locale.ENGLISH)) ? 1 : 0);
                    zzfm zzfm = zzs().zzn;
                    if (valueOf.longValue() == 1) {
                        str4 = "true";
                    }
                    zzfm.zza(str4);
                    obj = valueOf;
                    str2 = "_npa";
                }
            }
            if (obj == null) {
                zzs().zzn.zza("unset");
                str2 = "_npa";
            }
        }
        String str5 = str2;
        Object obj2 = obj;
        if (!this.zzy.zzab()) {
            zzr().zzx().zza("User property not set since app measurement is disabled");
        } else if (this.zzy.zzag()) {
            zzh().zza(new zzkq(str5, j, obj2, str));
        }
    }

    public final List<zzkq> zzb(boolean z) {
        zzb();
        zzw();
        zzr().zzx().zza("Getting user properties (FE)");
        if (zzq().zzg()) {
            zzr().zzf().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (zzx.zza()) {
            zzr().zzf().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzy.zzq().zza(atomicReference, 5000, "get user properties", new zzhl(this, atomicReference, z));
            List<zzkq> list = (List) atomicReference.get();
            if (list != null) {
                return list;
            }
            zzr().zzf().zza("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyList();
        }
    }

    public final String zzah() {
        zzb();
        return this.zzg.get();
    }

    /* access modifiers changed from: package-private */
    public final void zza(String str) {
        this.zzg.set(str);
    }

    public final void zzai() {
        zzd();
        zzb();
        zzw();
        if (this.zzy.zzag()) {
            if (zzt().zza(zzaq.zzbg)) {
                zzy zzt = zzt();
                zzt.zzu();
                Boolean zze2 = zzt.zze("google_analytics_deferred_deep_link_enabled");
                if (zze2 != null && zze2.booleanValue()) {
                    zzr().zzw().zza("Deferred Deep Link feature enabled.");
                    zzq().zza((Runnable) new zzhe(this));
                }
            }
            zzh().zzae();
            this.zzc = false;
            String zzw = zzs().zzw();
            if (!TextUtils.isEmpty(zzw)) {
                zzl().zzaa();
                if (!zzw.equals(Build.VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", zzw);
                    zza("auto", "_ou", bundle);
                }
            }
        }
    }

    public final void zza(zzhb zzhb) {
        zzhb zzhb2;
        zzd();
        zzb();
        zzw();
        if (!(zzhb == null || zzhb == (zzhb2 = this.zzd))) {
            Preconditions.checkState(zzhb2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzhb;
    }

    public final void zza(zzha zzha) {
        zzb();
        zzw();
        Preconditions.checkNotNull(zzha);
        if (!this.zze.add(zzha)) {
            zzr().zzi().zza("OnEventListener already registered");
        }
    }

    public final void zzb(zzha zzha) {
        zzb();
        zzw();
        Preconditions.checkNotNull(zzha);
        if (!this.zze.remove(zzha)) {
            zzr().zzi().zza("OnEventListener had not been registered");
        }
    }

    public final void zza(Bundle bundle) {
        zza(bundle, zzm().currentTimeMillis());
    }

    public final void zza(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        zzb();
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzr().zzi().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        zzb(bundle2, j);
    }

    public final void zzb(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle.getString("app_id"));
        zza();
        zzb(new Bundle(bundle), zzm().currentTimeMillis());
    }

    private final void zzb(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        zzgx.zza(bundle, "app_id", String.class, null);
        zzgx.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null);
        zzgx.zza(bundle, "name", String.class, null);
        zzgx.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzgx.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgx.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgx.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgx.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgx.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgx.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgx.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgx.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgx.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle.getString("name"));
        Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle.getString("name");
        Object obj = bundle.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (zzp().zzc(string) != 0) {
            zzr().zzf().zza("Invalid conditional user property name", zzo().zzc(string));
        } else if (zzp().zzb(string, obj) != 0) {
            zzr().zzf().zza("Invalid conditional user property value", zzo().zzc(string), obj);
        } else {
            Object zzc2 = zzp().zzc(string, obj);
            if (zzc2 == null) {
                zzr().zzf().zza("Unable to normalize conditional user property value", zzo().zzc(string), obj);
                return;
            }
            zzgx.zza(bundle, zzc2);
            long j2 = bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (TextUtils.isEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) || (j2 <= 15552000000L && j2 >= 1)) {
                long j3 = bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
                if (j3 > 15552000000L || j3 < 1) {
                    zzr().zzf().zza("Invalid conditional user property time to live", zzo().zzc(string), Long.valueOf(j3));
                } else {
                    zzq().zza((Runnable) new zzhm(this, bundle));
                }
            } else {
                zzr().zzf().zza("Invalid conditional user property timeout", zzo().zzc(string), Long.valueOf(j2));
            }
        }
    }

    public final void zzc(String str, String str2, Bundle bundle) {
        zzb();
        zzb((String) null, str, str2, bundle);
    }

    public final void zza(String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotEmpty(str);
        zza();
        zzb(str, str2, str3, bundle);
    }

    private final void zzb(String str, String str2, String str3, Bundle bundle) {
        long currentTimeMillis = zzm().currentTimeMillis();
        Preconditions.checkNotEmpty(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str3 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str3);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzq().zza((Runnable) new zzhp(this, bundle2));
    }

    /* access modifiers changed from: private */
    public final void zzc(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzd();
        zzw();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        if (!this.zzy.zzab()) {
            zzr().zzx().zza("Conditional property not set since app measurement is disabled");
            return;
        }
        zzkq zzkq = new zzkq(bundle2.getString("name"), bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP), bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        try {
            zzao zza2 = zzp().zza(bundle2.getString("app_id"), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME), bundle2.getBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), 0, true, false);
            zzh().zza(new zzw(bundle2.getString("app_id"), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), zzkq, bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), false, bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), zzp().zza(bundle2.getString("app_id"), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME), bundle2.getBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), 0, true, false), bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), zza2, bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzp().zza(bundle2.getString("app_id"), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle2.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), 0, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void zzd(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzd();
        zzw();
        Preconditions.checkNotNull(bundle);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        if (!this.zzy.zzab()) {
            zzr().zzx().zza("Conditional property not cleared since app measurement is disabled");
            return;
        }
        zzkq zzkq = new zzkq(bundle2.getString("name"), 0, (Object) null, (String) null);
        try {
            zzao zza2 = zzp().zza(bundle2.getString("app_id"), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle2.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, false);
            zzkq zzkq2 = zzkq;
            zzh().zza(new zzw(bundle2.getString("app_id"), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), zzkq2, bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle2.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), (zzao) null, bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), (zzao) null, bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zza2));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final ArrayList<Bundle> zza(String str, String str2) {
        zzb();
        return zzb((String) null, str, str2);
    }

    public final ArrayList<Bundle> zza(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zza();
        return zzb(str, str2, str3);
    }

    private final ArrayList<Bundle> zzb(String str, String str2, String str3) {
        if (zzq().zzg()) {
            zzr().zzf().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (zzx.zza()) {
            zzr().zzf().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzy.zzq().zza(atomicReference, 5000, "get conditional user properties", new zzhr(this, atomicReference, str, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return zzkr.zzb((List<zzw>) list);
            }
            zzr().zzf().zza("Timed out waiting for get conditional user properties", str);
            return new ArrayList<>();
        }
    }

    public final Map<String, Object> zza(String str, String str2, boolean z) {
        zzb();
        return zzb((String) null, str, str2, z);
    }

    public final Map<String, Object> zza(String str, String str2, String str3, boolean z) {
        Preconditions.checkNotEmpty(str);
        zza();
        return zzb(str, str2, str3, z);
    }

    private final Map<String, Object> zzb(String str, String str2, String str3, boolean z) {
        if (zzq().zzg()) {
            zzr().zzf().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (zzx.zza()) {
            zzr().zzf().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.zzy.zzq().zza(atomicReference, 5000, "get user properties", new zzhq(this, atomicReference, str, str2, str3, z));
            List<zzkq> list = (List) atomicReference.get();
            if (list == null) {
                zzr().zzf().zza("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            setTextAppearance settextappearance = new setTextAppearance(list.size());
            for (zzkq zzkq : list) {
                settextappearance.put(zzkq.zza, zzkq.zza());
            }
            return settextappearance;
        }
    }

    public final String zzaj() {
        zzij zzab = this.zzy.zzv().zzab();
        if (zzab != null) {
            return zzab.zza;
        }
        return null;
    }

    public final String zzak() {
        zzij zzab = this.zzy.zzv().zzab();
        if (zzab != null) {
            return zzab.zzb;
        }
        return null;
    }

    public final String zzal() {
        if (this.zzy.zzo() != null) {
            return this.zzy.zzo();
        }
        try {
            return new StringResourceValueReader(zzn()).getString("google_app_id");
        } catch (IllegalStateException e) {
            this.zzy.zzr().zzf().zza("getGoogleAppId failed with exception", e);
            return null;
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
