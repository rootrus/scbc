package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzjw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.internal.cache.DiskLruCache;
import p040o.setTextAppearance;

public final class zzfs extends zzkg implements zzaa {
    private static int zzb = 65535;
    private static int zzc = 2;
    private final Map<String, Map<String, String>> zzd = new setTextAppearance();
    private final Map<String, Map<String, Boolean>> zze = new setTextAppearance();
    private final Map<String, Map<String, Boolean>> zzf = new setTextAppearance();
    private final Map<String, zzby.zzb> zzg = new setTextAppearance();
    private final Map<String, Map<String, Integer>> zzh = new setTextAppearance();
    private final Map<String, String> zzi = new setTextAppearance();

    zzfs(zzkj zzkj) {
        super(zzkj);
    }

    /* access modifiers changed from: protected */
    public final boolean zze() {
        return false;
    }

    private final void zzi(String str) {
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        if (this.zzg.get(str) == null) {
            byte[] zzd2 = zzi().zzd(str);
            if (zzd2 == null) {
                this.zzd.put(str, (Object) null);
                this.zze.put(str, (Object) null);
                this.zzf.put(str, (Object) null);
                this.zzg.put(str, (Object) null);
                this.zzi.put(str, (Object) null);
                this.zzh.put(str, (Object) null);
                return;
            }
            zzby.zzb.zza zza = (zzby.zzb.zza) zza(str, zzd2).zzbl();
            zza(str, zza);
            this.zzd.put(str, zza((zzby.zzb) ((zzfo) zza.zzv())));
            this.zzg.put(str, (zzby.zzb) ((zzfo) zza.zzv()));
            this.zzi.put(str, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public final zzby.zzb zza(String str) {
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        zzi(str);
        return this.zzg.get(str);
    }

    /* access modifiers changed from: protected */
    public final String zzb(String str) {
        zzd();
        return this.zzi.get(str);
    }

    /* access modifiers changed from: protected */
    public final void zzc(String str) {
        zzd();
        this.zzi.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void zzd(String str) {
        zzd();
        this.zzg.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean zze(String str) {
        zzd();
        zzby.zzb zza = zza(str);
        if (zza == null) {
            return false;
        }
        return zza.zzh();
    }

    public final String zza(String str, String str2) {
        zzd();
        zzi(str);
        Map map = this.zzd.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    private static Map<String, String> zza(zzby.zzb zzb2) {
        setTextAppearance settextappearance = new setTextAppearance();
        if (zzb2 != null) {
            for (zzby.zzc next : zzb2.zze()) {
                settextappearance.put(next.zza(), next.zzb());
            }
        }
        return settextappearance;
    }

    private final void zza(String str, zzby.zzb.zza zza) {
        setTextAppearance settextappearance = new setTextAppearance();
        setTextAppearance settextappearance2 = new setTextAppearance();
        setTextAppearance settextappearance3 = new setTextAppearance();
        if (zza != null) {
            for (int i = 0; i < zza.zza(); i++) {
                zzby.zza.C10568zza zza2 = (zzby.zza.C10568zza) zza.zza(i).zzbl();
                if (TextUtils.isEmpty(zza2.zza())) {
                    zzr().zzi().zza("EventConfig contained null event name");
                } else {
                    String zzb2 = zzgw.zzb(zza2.zza());
                    if (!TextUtils.isEmpty(zzb2)) {
                        zza2 = zza2.zza(zzb2);
                        zza.zza(i, zza2);
                    }
                    settextappearance.put(zza2.zza(), Boolean.valueOf(zza2.zzb()));
                    settextappearance2.put(zza2.zza(), Boolean.valueOf(zza2.zzc()));
                    if (zza2.zzd()) {
                        if (zza2.zze() < zzc || zza2.zze() > zzb) {
                            zzr().zzi().zza("Invalid sampling rate. Event name, sample rate", zza2.zza(), Integer.valueOf(zza2.zze()));
                        } else {
                            settextappearance3.put(zza2.zza(), Integer.valueOf(zza2.zze()));
                        }
                    }
                }
            }
        }
        this.zze.put(str, settextappearance);
        this.zzf.put(str, settextappearance2);
        this.zzh.put(str, settextappearance3);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(String str, byte[] bArr, String str2) {
        zzak();
        zzd();
        Preconditions.checkNotEmpty(str);
        zzby.zzb.zza zza = (zzby.zzb.zza) zza(str, bArr).zzbl();
        if (zza == null) {
            return false;
        }
        zza(str, zza);
        this.zzg.put(str, (zzby.zzb) ((zzfo) zza.zzv()));
        this.zzi.put(str, str2);
        this.zzd.put(str, zza((zzby.zzb) ((zzfo) zza.zzv())));
        zzi().zza(str, (List<zzbt.zza>) new ArrayList(zza.zzb()));
        try {
            zza.zzc();
            bArr = ((zzby.zzb) ((zzfo) zza.zzv())).zzbi();
        } catch (RuntimeException e) {
            zzr().zzi().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzeu.zza(str), e);
        }
        zzad zzi2 = zzi();
        Preconditions.checkNotEmpty(str);
        zzi2.zzd();
        zzi2.zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) zzi2.mo7215c_().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                zzi2.zzr().zzf().zza("Failed to update remote config (got 0). appId", zzeu.zza(str));
            }
        } catch (SQLiteException e2) {
            zzi2.zzr().zzf().zza("Error storing remote config. appId", zzeu.zza(str), e2);
        }
        this.zzg.put(str, (zzby.zzb) ((zzfo) zza.zzv()));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb(String str, String str2) {
        Boolean bool;
        zzd();
        zzi(str);
        if (zzg(str) && zzkr.zze(str2)) {
            return true;
        }
        if (zzh(str) && zzkr.zza(str2)) {
            return true;
        }
        Map map = this.zze.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc(String str, String str2) {
        Boolean bool;
        zzd();
        zzi(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (zzjw.zzb() && zzt().zza(zzaq.zzci) && (ProductAction.ACTION_PURCHASE.equals(str2) || ProductAction.ACTION_REFUND.equals(str2))) {
            return true;
        }
        Map map = this.zzf.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final int zzd(String str, String str2) {
        Integer num;
        zzd();
        zzi(str);
        Map map = this.zzh.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final long zzf(String str) {
        String zza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(zza)) {
            return 0;
        }
        try {
            return Long.parseLong(zza);
        } catch (NumberFormatException e) {
            zzr().zzi().zza("Unable to parse timezone offset. appId", zzeu.zza(str), e);
            return 0;
        }
    }

    private final zzby.zzb zza(String str, byte[] bArr) {
        if (bArr == null) {
            return zzby.zzb.zzj();
        }
        try {
            zzby.zzb zzb2 = (zzby.zzb) ((zzfo) ((zzby.zzb.zza) zzkn.zza(zzby.zzb.zzi(), bArr)).zzv());
            zzew zzx = zzr().zzx();
            String str2 = null;
            Long valueOf = zzb2.zza() ? Long.valueOf(zzb2.zzb()) : null;
            if (zzb2.zzc()) {
                str2 = zzb2.zzd();
            }
            zzx.zza("Parsed config. version, gmp_app_id", valueOf, str2);
            return zzb2;
        } catch (zzfw e) {
            zzr().zzi().zza("Unable to merge remote config. appId", zzeu.zza(str), e);
            return zzby.zzb.zzj();
        } catch (RuntimeException e2) {
            zzr().zzi().zza("Unable to merge remote config. appId", zzeu.zza(str), e2);
            return zzby.zzb.zzj();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg(String str) {
        return DiskLruCache.VERSION_1.equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzh(String str) {
        return DiskLruCache.VERSION_1.equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final /* bridge */ /* synthetic */ zzkn zzg() {
        return super.zzg();
    }

    /* renamed from: e_ */
    public final /* bridge */ /* synthetic */ zzo mo7440e_() {
        return super.mo7440e_();
    }

    public final /* bridge */ /* synthetic */ zzad zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzfs zzj() {
        return super.zzj();
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
