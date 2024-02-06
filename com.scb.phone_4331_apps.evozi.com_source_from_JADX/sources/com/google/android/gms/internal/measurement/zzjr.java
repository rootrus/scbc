package com.google.android.gms.internal.measurement;

public final class zzjr implements zzjo {
    private static final zzcv<Long> zza;
    private static final zzcv<Long> zzaa;
    private static final zzcv<Long> zzab;
    private static final zzcv<Long> zzac;
    private static final zzcv<Long> zzad;
    private static final zzcv<Long> zzae;
    private static final zzcv<Long> zzaf;
    private static final zzcv<Long> zzag;
    private static final zzcv<Long> zzah;
    private static final zzcv<String> zzai;
    private static final zzcv<Long> zzaj;
    private static final zzcv<Long> zzb;
    private static final zzcv<String> zzc;
    private static final zzcv<String> zzd;
    private static final zzcv<String> zze;
    private static final zzcv<Long> zzf;
    private static final zzcv<Long> zzg;
    private static final zzcv<Long> zzh;
    private static final zzcv<Long> zzi;
    private static final zzcv<Long> zzj;
    private static final zzcv<Long> zzk;
    private static final zzcv<Long> zzl;
    private static final zzcv<Long> zzm;
    private static final zzcv<Long> zzn;
    private static final zzcv<Long> zzo;
    private static final zzcv<Long> zzp;
    private static final zzcv<Long> zzq;
    private static final zzcv<String> zzr;
    private static final zzcv<Long> zzs;
    private static final zzcv<Long> zzt;
    private static final zzcv<Long> zzu;
    private static final zzcv<Long> zzv;
    private static final zzcv<Long> zzw;
    private static final zzcv<Long> zzx;
    private static final zzcv<Long> zzy;
    private static final zzcv<Long> zzz;

    public final long zza() {
        return zza.zzc().longValue();
    }

    public final long zzb() {
        return zzb.zzc().longValue();
    }

    public final String zzc() {
        return zzd.zzc();
    }

    public final String zzd() {
        return zze.zzc();
    }

    public final long zze() {
        return zzf.zzc().longValue();
    }

    public final long zzf() {
        return zzg.zzc().longValue();
    }

    public final long zzg() {
        return zzh.zzc().longValue();
    }

    public final long zzh() {
        return zzi.zzc().longValue();
    }

    public final long zzi() {
        return zzj.zzc().longValue();
    }

    public final long zzj() {
        return zzk.zzc().longValue();
    }

    public final long zzk() {
        return zzl.zzc().longValue();
    }

    public final long zzl() {
        return zzm.zzc().longValue();
    }

    public final long zzm() {
        return zzn.zzc().longValue();
    }

    public final long zzn() {
        return zzo.zzc().longValue();
    }

    public final long zzo() {
        return zzq.zzc().longValue();
    }

    public final long zzp() {
        return zzs.zzc().longValue();
    }

    public final long zzq() {
        return zzt.zzc().longValue();
    }

    public final long zzr() {
        return zzu.zzc().longValue();
    }

    public final long zzs() {
        return zzv.zzc().longValue();
    }

    public final long zzt() {
        return zzw.zzc().longValue();
    }

    public final long zzu() {
        return zzx.zzc().longValue();
    }

    public final long zzv() {
        return zzy.zzc().longValue();
    }

    public final long zzw() {
        return zzz.zzc().longValue();
    }

    public final long zzx() {
        return zzaa.zzc().longValue();
    }

    public final long zzy() {
        return zzab.zzc().longValue();
    }

    public final long zzz() {
        return zzac.zzc().longValue();
    }

    public final long zzaa() {
        return zzad.zzc().longValue();
    }

    public final long zzab() {
        return zzae.zzc().longValue();
    }

    public final long zzac() {
        return zzaf.zzc().longValue();
    }

    public final long zzad() {
        return zzag.zzc().longValue();
    }

    public final long zzae() {
        return zzah.zzc().longValue();
    }

    public final String zzaf() {
        return zzai.zzc();
    }

    public final long zzag() {
        return zzaj.zzc().longValue();
    }

    static {
        zzdb zzdb = new zzdb(zzcw.zza("com.google.android.gms.measurement"));
        zza = zzdb.zza("measurement.ad_id_cache_time", 10000);
        zzb = zzdb.zza("measurement.config.cache_time", 86400000);
        zzc = zzdb.zza("measurement.log_tag", "FA");
        zzd = zzdb.zza("measurement.config.url_authority", "app-measurement.com");
        zze = zzdb.zza("measurement.config.url_scheme", "https");
        zzf = zzdb.zza("measurement.upload.debug_upload_interval", 1000);
        zzg = zzdb.zza("measurement.lifetimevalue.max_currency_tracked", 4);
        zzh = zzdb.zza("measurement.store.max_stored_events_per_app", 100000);
        zzi = zzdb.zza("measurement.experiment.max_ids", 50);
        zzj = zzdb.zza("measurement.audience.filter_result_max_count", 200);
        zzk = zzdb.zza("measurement.alarm_manager.minimum_interval", 60000);
        zzl = zzdb.zza("measurement.upload.minimum_delay", 500);
        zzm = zzdb.zza("measurement.monitoring.sample_period_millis", 86400000);
        zzn = zzdb.zza("measurement.upload.realtime_upload_interval", 10000);
        zzo = zzdb.zza("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        zzp = zzdb.zza("measurement.config.cache_time.service", 3600000);
        zzq = zzdb.zza("measurement.service_client.idle_disconnect_millis", 5000);
        zzr = zzdb.zza("measurement.log_tag.service", "FA-SVC");
        zzs = zzdb.zza("measurement.upload.stale_data_deletion_interval", 86400000);
        zzt = zzdb.zza("measurement.upload.backoff_period", 43200000);
        zzu = zzdb.zza("measurement.upload.initial_upload_delay_time", 15000);
        zzv = zzdb.zza("measurement.upload.interval", 3600000);
        zzw = zzdb.zza("measurement.upload.max_bundle_size", 65536);
        zzx = zzdb.zza("measurement.upload.max_bundles", 100);
        zzy = zzdb.zza("measurement.upload.max_conversions_per_day", 500);
        zzz = zzdb.zza("measurement.upload.max_error_events_per_day", 1000);
        zzaa = zzdb.zza("measurement.upload.max_events_per_bundle", 1000);
        zzab = zzdb.zza("measurement.upload.max_events_per_day", 100000);
        zzac = zzdb.zza("measurement.upload.max_public_events_per_day", 50000);
        zzad = zzdb.zza("measurement.upload.max_queue_time", 2419200000L);
        zzae = zzdb.zza("measurement.upload.max_realtime_events_per_day", 10);
        zzaf = zzdb.zza("measurement.upload.max_batch_size", 65536);
        zzag = zzdb.zza("measurement.upload.retry_count", 6);
        zzah = zzdb.zza("measurement.upload.retry_time", 1800000);
        zzai = zzdb.zza("measurement.upload.url", "https://app-measurement.com/a");
        zzaj = zzdb.zza("measurement.upload.window_interval", 3600000);
    }
}
