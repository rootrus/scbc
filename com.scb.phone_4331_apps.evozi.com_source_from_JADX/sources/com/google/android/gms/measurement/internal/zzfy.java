package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.internal.measurement.zzkh;
import com.google.android.gms.internal.measurement.zzlr;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class zzfy implements zzgu {
    private static volatile zzfy zzb;
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;
    private Boolean zzad;
    private Boolean zzae;
    private int zzaf;
    private AtomicInteger zzag = new AtomicInteger(0);
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzx zzh;
    private final zzy zzi;
    private final zzfg zzj;
    private final zzeu zzk;
    private final zzfv zzl;
    private final zzjv zzm;
    private final zzkr zzn;
    private final zzes zzo;
    private final Clock zzp;
    private final zzii zzq;
    private final zzhc zzr;
    private final zza zzs;
    private final zzid zzt;
    private zzeq zzu;
    private zzir zzv;
    private zzai zzw;
    private zzer zzx;
    private zzfp zzy;
    private boolean zzz = false;

    private zzfy(zzhd zzhd) {
        long j;
        boolean z = false;
        Preconditions.checkNotNull(zzhd);
        zzx zzx2 = new zzx(zzhd.zza);
        this.zzh = zzx2;
        zzek.zza = zzx2;
        this.zzc = zzhd.zza;
        this.zzd = zzhd.zzb;
        this.zze = zzhd.zzc;
        this.zzf = zzhd.zzd;
        this.zzg = zzhd.zzh;
        this.zzac = zzhd.zze;
        zzae zzae2 = zzhd.zzg;
        if (!(zzae2 == null || zzae2.zzg == null)) {
            Object obj = zzae2.zzg.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzad = (Boolean) obj;
            }
            Object obj2 = zzae2.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzae = (Boolean) obj2;
            }
        }
        zzcv.zza(this.zzc);
        this.zzp = DefaultClock.getInstance();
        if (zzhd.zzi != null) {
            j = zzhd.zzi.longValue();
        } else {
            j = this.zzp.currentTimeMillis();
        }
        this.zza = j;
        this.zzi = new zzy(this);
        zzfg zzfg = new zzfg(this);
        zzfg.zzab();
        this.zzj = zzfg;
        zzeu zzeu = new zzeu(this);
        zzeu.zzab();
        this.zzk = zzeu;
        zzkr zzkr = new zzkr(this);
        zzkr.zzab();
        this.zzn = zzkr;
        zzes zzes = new zzes(this);
        zzes.zzab();
        this.zzo = zzes;
        this.zzs = new zza(this);
        zzii zzii = new zzii(this);
        zzii.zzx();
        this.zzq = zzii;
        zzhc zzhc = new zzhc(this);
        zzhc.zzx();
        this.zzr = zzhc;
        zzjv zzjv = new zzjv(this);
        zzjv.zzx();
        this.zzm = zzjv;
        zzid zzid = new zzid(this);
        zzid.zzab();
        this.zzt = zzid;
        zzfv zzfv = new zzfv(this);
        zzfv.zzab();
        this.zzl = zzfv;
        if (!(zzhd.zzg == null || zzhd.zzg.zzb == 0)) {
            z = true;
        }
        if (this.zzc.getApplicationContext() instanceof Application) {
            zzhc zzh2 = zzh();
            if (zzh2.zzn().getApplicationContext() instanceof Application) {
                Application application = (Application) zzh2.zzn().getApplicationContext();
                if (zzh2.zza == null) {
                    zzh2.zza = new zzhy(zzh2, (zzhh) null);
                }
                if (!z) {
                    application.unregisterActivityLifecycleCallbacks(zzh2.zza);
                    application.registerActivityLifecycleCallbacks(zzh2.zza);
                    zzh2.zzr().zzx().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzr().zzi().zza("Application context is not an Application");
        }
        this.zzl.zza((Runnable) new zzga(this, zzhd));
    }

    /* access modifiers changed from: package-private */
    public final void zzad() {
    }

    /* access modifiers changed from: private */
    public final void zza(zzhd zzhd) {
        zzew zzew;
        String str;
        zzq().zzd();
        zzai zzai = new zzai(this);
        zzai.zzab();
        this.zzw = zzai;
        zzer zzer = new zzer(this, zzhd.zzf);
        zzer.zzx();
        this.zzx = zzer;
        zzeq zzeq = new zzeq(this);
        zzeq.zzx();
        this.zzu = zzeq;
        zzir zzir = new zzir(this);
        zzir.zzx();
        this.zzv = zzir;
        this.zzn.zzac();
        this.zzj.zzac();
        this.zzy = new zzfp(this);
        this.zzx.zzy();
        zzr().zzv().zza("App measurement initialized, version", Long.valueOf(this.zzi.zzf()));
        zzr().zzv().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzab2 = zzer.zzab();
        if (TextUtils.isEmpty(this.zzd)) {
            if (zzi().zzf(zzab2)) {
                zzew = zzr().zzv();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                zzew zzv2 = zzr().zzv();
                String valueOf = String.valueOf(zzab2);
                zzew zzew2 = zzv2;
                str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                zzew = zzew2;
            }
            zzew.zza(str);
        }
        zzr().zzw().zza("Debug-level message logging enabled");
        if (this.zzaf != this.zzag.get()) {
            zzr().zzf().zza("Not all components initialized", Integer.valueOf(this.zzaf), Integer.valueOf(this.zzag.get()));
        }
        this.zzz = true;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        zzq().zzd();
        if (zzc().zzc.zza() == 0) {
            zzc().zzc.zza(this.zzp.currentTimeMillis());
        }
        if (Long.valueOf(zzc().zzh.zza()).longValue() == 0) {
            zzr().zzx().zza("Persisting first open", Long.valueOf(this.zza));
            zzc().zzh.zza(this.zza);
        }
        if (this.zzi.zza(zzaq.zzcq)) {
            zzh().zzb.zzb();
        }
        if (zzag()) {
            if (!TextUtils.isEmpty(zzy().zzac()) || !TextUtils.isEmpty(zzy().zzad())) {
                zzi();
                if (zzkr.zza(zzy().zzac(), zzc().zzh(), zzy().zzad(), zzc().zzi())) {
                    zzr().zzv().zza("Rechecking which service to use due to a GMP App Id change");
                    zzc().zzk();
                    zzk().zzab();
                    this.zzv.zzah();
                    this.zzv.zzaf();
                    zzc().zzh.zza(this.zza);
                    zzc().zzj.zza((String) null);
                }
                zzc().zzc(zzy().zzac());
                zzc().zzd(zzy().zzad());
            }
            zzh().zza(zzc().zzj.zza());
            if (zzkh.zzb() && this.zzi.zza(zzaq.zzbu) && !zzi().zzv() && !TextUtils.isEmpty(zzc().zzu.zza())) {
                zzr().zzi().zza("Remote config removed with active feature rollouts");
                zzc().zzu.zza((String) null);
            }
            if (!TextUtils.isEmpty(zzy().zzac()) || !TextUtils.isEmpty(zzy().zzad())) {
                boolean zzab2 = zzab();
                if (!zzc().zzx() && !this.zzi.zzh()) {
                    zzc().zzc(!zzab2);
                }
                if (zzab2) {
                    zzh().zzai();
                }
                zze().zza.zza();
                zzw().zza((AtomicReference<String>) new AtomicReference());
                if (zzlr.zzb() && this.zzi.zza(zzaq.zzcm)) {
                    zzw().zza(zzc().zzx.zza());
                }
            }
        } else if (zzab()) {
            if (!zzi().zzd("android.permission.INTERNET")) {
                zzr().zzf().zza("App is missing INTERNET permission");
            }
            if (!zzi().zzd("android.permission.ACCESS_NETWORK_STATE")) {
                zzr().zzf().zza("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.zzc).isCallerInstantApp() && !this.zzi.zzy()) {
                if (!zzfq.zza(this.zzc)) {
                    zzr().zzf().zza("AppMeasurementReceiver not registered/enabled");
                }
                if (!zzkr.zza(this.zzc, false)) {
                    zzr().zzf().zza("AppMeasurementService not registered/enabled");
                }
            }
            zzr().zzf().zza("Uploading is not possible. App measurement disabled");
        }
        zzc().zzo.zza(this.zzi.zza(zzaq.zzaz));
    }

    public final zzx zzu() {
        return this.zzh;
    }

    public final zzy zzb() {
        return this.zzi;
    }

    public final zzfg zzc() {
        zza((zzgs) this.zzj);
        return this.zzj;
    }

    public final zzeu zzr() {
        zzb((zzgv) this.zzk);
        return this.zzk;
    }

    public final zzeu zzd() {
        zzeu zzeu = this.zzk;
        if (zzeu == null || !zzeu.zzz()) {
            return null;
        }
        return this.zzk;
    }

    public final zzfv zzq() {
        zzb((zzgv) this.zzl);
        return this.zzl;
    }

    public final zzjv zze() {
        zzb((zzg) this.zzm);
        return this.zzm;
    }

    public final zzfp zzf() {
        return this.zzy;
    }

    /* access modifiers changed from: package-private */
    public final zzfv zzg() {
        return this.zzl;
    }

    public final zzhc zzh() {
        zzb((zzg) this.zzr);
        return this.zzr;
    }

    public final zzkr zzi() {
        zza((zzgs) this.zzn);
        return this.zzn;
    }

    public final zzes zzj() {
        zza((zzgs) this.zzo);
        return this.zzo;
    }

    public final zzeq zzk() {
        zzb((zzg) this.zzu);
        return this.zzu;
    }

    private final zzid zzai() {
        zzb((zzgv) this.zzt);
        return this.zzt;
    }

    public final Context zzn() {
        return this.zzc;
    }

    public final boolean zzl() {
        return TextUtils.isEmpty(this.zzd);
    }

    public final String zzo() {
        return this.zzd;
    }

    public final String zzp() {
        return this.zze;
    }

    public final String zzs() {
        return this.zzf;
    }

    public final boolean zzt() {
        return this.zzg;
    }

    public final Clock zzm() {
        return this.zzp;
    }

    public final zzii zzv() {
        zzb((zzg) this.zzq);
        return this.zzq;
    }

    public final zzir zzw() {
        zzb((zzg) this.zzv);
        return this.zzv;
    }

    public final zzai zzx() {
        zzb((zzgv) this.zzw);
        return this.zzw;
    }

    public final zzer zzy() {
        zzb((zzg) this.zzx);
        return this.zzx;
    }

    public final zza zzz() {
        zza zza2 = this.zzs;
        if (zza2 != null) {
            return zza2;
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzfy zza(Context context, zzae zzae2, Long l) {
        if (zzae2 != null && (zzae2.zze == null || zzae2.zzf == null)) {
            zzae2 = new zzae(zzae2.zza, zzae2.zzb, zzae2.zzc, zzae2.zzd, (String) null, (String) null, zzae2.zzg);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzfy.class) {
                if (zzb == null) {
                    zzb = new zzfy(new zzhd(context, zzae2, l));
                }
            }
        } else if (!(zzae2 == null || zzae2.zzg == null || !zzae2.zzg.containsKey("dataCollectionDefaultEnabled"))) {
            zzb.zza(zzae2.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        return zzb;
    }

    private static void zzb(zzgv zzgv) {
        if (zzgv == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzgv.zzz()) {
            String valueOf = String.valueOf(zzgv.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static void zzb(zzg zzg2) {
        if (zzg2 == null) {
            throw new IllegalStateException("Component not created");
        } else if (!zzg2.zzv()) {
            String valueOf = String.valueOf(zzg2.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static void zza(zzgs zzgs) {
        if (zzgs == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(boolean z) {
        this.zzac = Boolean.valueOf(z);
    }

    public final boolean zzaa() {
        return this.zzac != null && this.zzac.booleanValue();
    }

    public final boolean zzab() {
        return zzac() == 0;
    }

    public final int zzac() {
        zzq().zzd();
        if (this.zzi.zzh()) {
            return 1;
        }
        Boolean bool = this.zzae;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        Boolean zzv2 = zzc().zzv();
        if (zzv2 == null) {
            zzy zzy2 = this.zzi;
            zzy2.zzu();
            Boolean zze2 = zzy2.zze("firebase_analytics_collection_enabled");
            if (zze2 == null) {
                Boolean bool2 = this.zzad;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (GoogleServices.isMeasurementExplicitlyDisabled()) {
                    return 6;
                } else {
                    if (!this.zzi.zza(zzaq.zzas) || this.zzac == null || this.zzac.booleanValue()) {
                        return 0;
                    }
                    return 7;
                }
            } else if (zze2.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (zzv2.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzae() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzgv zzgv) {
        this.zzaf++;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzg zzg2) {
        this.zzaf++;
    }

    /* access modifiers changed from: package-private */
    public final void zzaf() {
        this.zzag.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    public final boolean zzag() {
        if (this.zzz) {
            zzq().zzd();
            Boolean bool = this.zzaa;
            if (bool == null || this.zzab == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000)) {
                this.zzab = this.zzp.elapsedRealtime();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(zzi().zzd("android.permission.INTERNET") && zzi().zzd("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzy() || (zzfq.zza(this.zzc) && zzkr.zza(this.zzc, false))));
                this.zzaa = valueOf;
                if (valueOf.booleanValue()) {
                    if (!zzi().zza(zzy().zzac(), zzy().zzad(), zzy().zzae()) && TextUtils.isEmpty(zzy().zzad())) {
                        z = false;
                    }
                    this.zzaa = Boolean.valueOf(z);
                }
            }
            return this.zzaa.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final void zzah() {
        zzq().zzd();
        zzb((zzgv) zzai());
        String zzab2 = zzy().zzab();
        Pair<String, Boolean> zza2 = zzc().zza(zzab2);
        if (!this.zzi.zzi().booleanValue() || ((Boolean) zza2.second).booleanValue() || TextUtils.isEmpty((CharSequence) zza2.first)) {
            zzr().zzw().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!zzai().zzg()) {
            zzr().zzi().zza("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            zzkr zzi2 = zzi();
            URL zza3 = zzi2.zza(zzy().zzt().zzf(), zzab2, (String) zza2.first, zzc().zzt.zza() - 1);
            zzid zzai = zzai();
            zzgb zzgb = new zzgb(this);
            zzai.zzd();
            zzai.zzaa();
            Preconditions.checkNotNull(zza3);
            Preconditions.checkNotNull(zzgb);
            zzai.zzq().zzb((Runnable) new zzif(zzai, zzab2, zza3, (byte[]) null, (Map<String, String>) null, zzgb));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z = false;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            zzr().zzi().zza("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        zzc().zzs.zza(true);
        if (bArr.length == 0) {
            zzr().zzw().zza("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                zzr().zzw().zza("Deferred Deep Link is empty.");
                return;
            }
            zzkr zzi2 = zzi();
            zzi2.zzb();
            if (!TextUtils.isEmpty(optString) && (queryIntentActivities = zzi2.zzn().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                z = true;
            }
            if (!z) {
                zzr().zzi().zza("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.zzr.zza("auto", "_cmp", bundle);
            zzkr zzi3 = zzi();
            if (!TextUtils.isEmpty(optString) && zzi3.zza(optString, optDouble)) {
                zzi3.zzn().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e) {
            zzr().zzf().zza("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }
}
