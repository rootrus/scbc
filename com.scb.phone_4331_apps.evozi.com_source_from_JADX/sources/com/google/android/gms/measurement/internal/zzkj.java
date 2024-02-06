package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzkz;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.measurement.zzlr;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p040o.setTextAppearance;

public class zzkj implements zzgu {
    private static volatile zzkj zza;
    private zzfs zzb;
    private zzfb zzc;
    private zzad zzd;
    private zzfe zze;
    private zzkf zzf;
    private zzo zzg;
    private final zzkn zzh;
    private zzih zzi;
    private final zzfy zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private List<Runnable> zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private FileLock zzt;
    private FileChannel zzu;
    private List<Long> zzv;
    private List<Long> zzw;
    private long zzx;

    final class zza implements zzaf {
        zzcb.zzg zza;
        List<Long> zzb;
        List<zzcb.zzc> zzc;
        private long zzd;

        private zza() {
        }

        public final void zza(zzcb.zzg zzg) {
            Preconditions.checkNotNull(zzg);
            this.zza = zzg;
        }

        public final boolean zza(long j, zzcb.zzc zzc2) {
            Preconditions.checkNotNull(zzc2);
            if (this.zzc == null) {
                this.zzc = new ArrayList();
            }
            if (this.zzb == null) {
                this.zzb = new ArrayList();
            }
            if (this.zzc.size() > 0 && zza(this.zzc.get(0)) != zza(zzc2)) {
                return false;
            }
            long zzbm = this.zzd + ((long) zzc2.zzbm());
            if (zzbm >= ((long) Math.max(0, zzaq.zzh.zza(null).intValue()))) {
                return false;
            }
            this.zzd = zzbm;
            this.zzc.add(zzc2);
            this.zzb.add(Long.valueOf(j));
            if (this.zzc.size() >= Math.max(1, zzaq.zzi.zza(null).intValue())) {
                return false;
            }
            return true;
        }

        private static long zza(zzcb.zzc zzc2) {
            return ((zzc2.zze() / 1000) / 60) / 60;
        }

        /* synthetic */ zza(zzkj zzkj, zzki zzki) {
            this();
        }
    }

    public static zzkj zza(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zza == null) {
            synchronized (zzkj.class) {
                if (zza == null) {
                    zza = new zzkj(new zzko(context));
                }
            }
        }
        return zza;
    }

    private zzkj(zzko zzko) {
        this(zzko, (zzfy) null);
    }

    private zzkj(zzko zzko, zzfy zzfy) {
        this.zzk = false;
        Preconditions.checkNotNull(zzko);
        this.zzj = zzfy.zza(zzko.zza, (zzae) null, (Long) null);
        this.zzx = -1;
        zzkn zzkn = new zzkn(this);
        zzkn.zzal();
        this.zzh = zzkn;
        zzfb zzfb = new zzfb(this);
        zzfb.zzal();
        this.zzc = zzfb;
        zzfs zzfs = new zzfs(this);
        zzfs.zzal();
        this.zzb = zzfs;
        this.zzj.zzq().zza((Runnable) new zzki(this, zzko));
    }

    /* access modifiers changed from: private */
    public final void zza(zzko zzko) {
        this.zzj.zzq().zzd();
        zzad zzad = new zzad(this);
        zzad.zzal();
        this.zzd = zzad;
        this.zzj.zzb().zza((zzaa) this.zzb);
        zzo zzo2 = new zzo(this);
        zzo2.zzal();
        this.zzg = zzo2;
        zzih zzih = new zzih(this);
        zzih.zzal();
        this.zzi = zzih;
        zzkf zzkf = new zzkf(this);
        zzkf.zzal();
        this.zzf = zzkf;
        this.zze = new zzfe(this);
        if (this.zzo != this.zzp) {
            this.zzj.zzr().zzf().zza("Not all upload components initialized", Integer.valueOf(this.zzo), Integer.valueOf(this.zzp));
        }
        this.zzk = true;
    }

    /* access modifiers changed from: protected */
    public final void zza() {
        this.zzj.zzq().zzd();
        zze().zzv();
        if (this.zzj.zzc().zzc.zza() == 0) {
            this.zzj.zzc().zzc.zza(this.zzj.zzm().currentTimeMillis());
        }
        zzz();
    }

    public final zzx zzu() {
        return this.zzj.zzu();
    }

    public final zzy zzb() {
        return this.zzj.zzb();
    }

    public final zzeu zzr() {
        return this.zzj.zzr();
    }

    public final zzfv zzq() {
        return this.zzj.zzq();
    }

    public final zzfs zzc() {
        zzb((zzkg) this.zzb);
        return this.zzb;
    }

    public final zzfb zzd() {
        zzb((zzkg) this.zzc);
        return this.zzc;
    }

    public final zzad zze() {
        zzb((zzkg) this.zzd);
        return this.zzd;
    }

    private final zzfe zzt() {
        zzfe zzfe = this.zze;
        if (zzfe != null) {
            return zzfe;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzkf zzv() {
        zzb((zzkg) this.zzf);
        return this.zzf;
    }

    public final zzo zzf() {
        zzb((zzkg) this.zzg);
        return this.zzg;
    }

    public final zzih zzg() {
        zzb((zzkg) this.zzi);
        return this.zzi;
    }

    public final zzkn zzh() {
        zzb((zzkg) this.zzh);
        return this.zzh;
    }

    public final zzes zzi() {
        return this.zzj.zzj();
    }

    public final Context zzn() {
        return this.zzj.zzn();
    }

    public final Clock zzm() {
        return this.zzj.zzm();
    }

    public final zzkr zzj() {
        return this.zzj.zzi();
    }

    private final void zzw() {
        this.zzj.zzq().zzd();
    }

    /* access modifiers changed from: package-private */
    public final void zzk() {
        if (!this.zzk) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    private static void zzb(zzkg zzkg) {
        if (zzkg == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!zzkg.zzaj()) {
            String valueOf = String.valueOf(zzkg.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private final long zzx() {
        long currentTimeMillis = this.zzj.zzm().currentTimeMillis();
        zzfg zzc2 = this.zzj.zzc();
        zzc2.zzaa();
        zzc2.zzd();
        long zza2 = zzc2.zzg.zza();
        if (zza2 == 0) {
            zza2 = 1 + ((long) zzc2.zzp().zzh().nextInt(86400000));
            zzc2.zzg.zza(zza2);
        }
        return ((((currentTimeMillis + zza2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzao zzao, String str) {
        zzao zzao2 = zzao;
        zzf zzb2 = zze().zzb(str);
        if (zzb2 == null || TextUtils.isEmpty(zzb2.zzl())) {
            this.zzj.zzr().zzw().zza("No app data available; dropping event", str);
            return;
        }
        Boolean zzb3 = zzb(zzb2);
        if (zzb3 == null) {
            if (!"_ui".equals(zzao2.zza)) {
                this.zzj.zzr().zzi().zza("Could not find package. appId", zzeu.zza(str));
            }
        } else if (!zzb3.booleanValue()) {
            this.zzj.zzr().zzf().zza("App version does not match; dropping event. appId", zzeu.zza(str));
            return;
        }
        zzn zzn2 = r2;
        zzn zzn3 = new zzn(str, zzb2.zze(), zzb2.zzl(), zzb2.zzm(), zzb2.zzn(), zzb2.zzo(), zzb2.zzp(), (String) null, zzb2.zzr(), false, zzb2.zzi(), zzb2.zzae(), 0, 0, zzb2.zzaf(), zzb2.zzag(), false, zzb2.zzf(), zzb2.zzah(), zzb2.zzq(), zzb2.zzai(), (!zzlm.zzb() || !this.zzj.zzb().zze(zzb2.zzc(), zzaq.zzbn)) ? null : zzb2.zzg());
        zzb(zzao2, zzn2);
    }

    private final void zzb(zzao zzao, zzn zzn2) {
        if (zzlr.zzb() && this.zzj.zzb().zza(zzaq.zzcn)) {
            zzey zza2 = zzey.zza(zzao);
            this.zzj.zzi().zza(zza2.zzb, zze().zzi(zzn2.zza));
            this.zzj.zzi().zza(zza2, this.zzj.zzb().zza(zzn2.zza));
            zzao = zza2.zza();
        }
        zza(zzao, zzn2);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzao zzao, zzn zzn2) {
        List<zzw> list;
        List<zzw> list2;
        List<zzw> list3;
        zzao zzao2 = zzao;
        zzn zzn3 = zzn2;
        Preconditions.checkNotNull(zzn2);
        Preconditions.checkNotEmpty(zzn3.zza);
        zzw();
        zzk();
        String str = zzn3.zza;
        long j = zzao2.zzd;
        zzh();
        if (zzkn.zza(zzao, zzn2)) {
            if (!zzn3.zzh) {
                zzc(zzn3);
                return;
            }
            if (this.zzj.zzb().zze(str, zzaq.zzbb) && zzn3.zzu != null) {
                if (zzn3.zzu.contains(zzao2.zza)) {
                    Bundle zzb2 = zzao2.zzb.zzb();
                    zzb2.putLong("ga_safelisted", 1);
                    zzao2 = new zzao(zzao2.zza, new zzan(zzb2), zzao2.zzc, zzao2.zzd);
                } else {
                    this.zzj.zzr().zzw().zza("Dropping non-safelisted event. appId, event name, origin", str, zzao2.zza, zzao2.zzc);
                    return;
                }
            }
            zze().zzf();
            try {
                zzad zze2 = zze();
                Preconditions.checkNotEmpty(str);
                zze2.zzd();
                zze2.zzak();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i < 0) {
                    zze2.zzr().zzi().zza("Invalid time querying timed out conditional properties", zzeu.zza(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = zze2.zza("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzw next : list) {
                    if (next != null) {
                        this.zzj.zzr().zzx().zza("User property timed out", next.zza, this.zzj.zzj().zzc(next.zzc.zza), next.zzc.zza());
                        if (next.zzg != null) {
                            zzc(new zzao(next.zzg, j), zzn3);
                        }
                        zze().zze(str, next.zzc.zza);
                    }
                }
                zzad zze3 = zze();
                Preconditions.checkNotEmpty(str);
                zze3.zzd();
                zze3.zzak();
                if (i < 0) {
                    zze3.zzr().zzi().zza("Invalid time querying expired conditional properties", zzeu.zza(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = zze3.zza("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzw next2 : list2) {
                    if (next2 != null) {
                        this.zzj.zzr().zzx().zza("User property expired", next2.zza, this.zzj.zzj().zzc(next2.zzc.zza), next2.zzc.zza());
                        zze().zzb(str, next2.zzc.zza);
                        if (next2.zzk != null) {
                            arrayList.add(next2.zzk);
                        }
                        zze().zze(str, next2.zzc.zza);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    zzc(new zzao((zzao) obj, j), zzn3);
                }
                zzad zze4 = zze();
                String str2 = zzao2.zza;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                zze4.zzd();
                zze4.zzak();
                if (i < 0) {
                    zze4.zzr().zzi().zza("Invalid time querying triggered conditional properties", zzeu.zza(str), zze4.zzo().zza(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = zze4.zza("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(list3.size());
                for (zzw next3 : list3) {
                    if (next3 != null) {
                        zzkq zzkq = next3.zzc;
                        zzks zzks = r4;
                        zzks zzks2 = new zzks(next3.zza, next3.zzb, zzkq.zza, j, zzkq.zza());
                        if (zze().zza(zzks)) {
                            this.zzj.zzr().zzx().zza("User property triggered", next3.zza, this.zzj.zzj().zzc(zzks.zzc), zzks.zze);
                        } else {
                            this.zzj.zzr().zzf().zza("Too many active user properties, ignoring", zzeu.zza(next3.zza), this.zzj.zzj().zzc(zzks.zzc), zzks.zze);
                        }
                        if (next3.zzi != null) {
                            arrayList3.add(next3.zzi);
                        }
                        next3.zzc = new zzkq(zzks);
                        next3.zze = true;
                        zze().zza(next3);
                    }
                }
                zzc(zzao2, zzn3);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList4.get(i3);
                    i3++;
                    zzc(new zzao((zzao) obj2, j), zzn3);
                }
                zze().mo7214b_();
            } finally {
                zze().zzh();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:283:0x08ee, code lost:
        if (r5.zze < ((long) r1.zzj.zzb().zzc(r4.zza))) goto L_0x08f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x08f0, code lost:
        r11 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02e2 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0948 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x031a A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0948 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0351 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0948 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0360 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0948 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0395 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0948 }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017d A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0948 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0185 A[Catch:{ SQLiteException -> 0x02aa, all -> 0x0948 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzc(com.google.android.gms.measurement.internal.zzao r27, com.google.android.gms.measurement.internal.zzn r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "_sno"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r28)
            java.lang.String r5 = r3.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            long r5 = java.lang.System.nanoTime()
            r26.zzw()
            r26.zzk()
            java.lang.String r15 = r3.zza
            r26.zzh()
            boolean r7 = com.google.android.gms.measurement.internal.zzkn.zza((com.google.android.gms.measurement.internal.zzao) r27, (com.google.android.gms.measurement.internal.zzn) r28)
            if (r7 != 0) goto L_0x0026
            return
        L_0x0026:
            boolean r7 = r3.zzh
            if (r7 != 0) goto L_0x002e
            r1.zzc(r3)
            return
        L_0x002e:
            com.google.android.gms.measurement.internal.zzfs r7 = r26.zzc()
            java.lang.String r8 = r2.zza
            boolean r7 = r7.zzb(r15, r8)
            java.lang.String r14 = "_err"
            r13 = 0
            if (r7 == 0) goto L_0x00d9
            com.google.android.gms.measurement.internal.zzfy r3 = r1.zzj
            com.google.android.gms.measurement.internal.zzeu r3 = r3.zzr()
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzi()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r15)
            com.google.android.gms.measurement.internal.zzfy r5 = r1.zzj
            com.google.android.gms.measurement.internal.zzes r5 = r5.zzj()
            java.lang.String r6 = r2.zza
            java.lang.String r5 = r5.zza((java.lang.String) r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.zza(r6, r4, r5)
            com.google.android.gms.measurement.internal.zzfs r3 = r26.zzc()
            boolean r3 = r3.zzg(r15)
            if (r3 != 0) goto L_0x0073
            com.google.android.gms.measurement.internal.zzfs r3 = r26.zzc()
            boolean r3 = r3.zzh(r15)
            if (r3 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r3 = 0
            goto L_0x0074
        L_0x0073:
            r3 = 1
        L_0x0074:
            if (r3 != 0) goto L_0x008f
            java.lang.String r4 = r2.zza
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.zzfy r4 = r1.zzj
            com.google.android.gms.measurement.internal.zzkr r7 = r4.zzi()
            java.lang.String r11 = r2.zza
            r9 = 11
            r12 = 0
            java.lang.String r10 = "_ev"
            r8 = r15
            r7.zza((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)
        L_0x008f:
            if (r3 == 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()
            com.google.android.gms.measurement.internal.zzf r2 = r2.zzb(r15)
            if (r2 == 0) goto L_0x00d8
            long r3 = r2.zzu()
            long r5 = r2.zzt()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzfy r5 = r1.zzj
            com.google.android.gms.common.util.Clock r5 = r5.zzm()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzaq.zzy
            java.lang.Object r5 = r5.zza(r13)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d8
            com.google.android.gms.measurement.internal.zzfy r3 = r1.zzj
            com.google.android.gms.measurement.internal.zzeu r3 = r3.zzr()
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzw()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.zza(r4)
            r1.zza((com.google.android.gms.measurement.internal.zzf) r2)
        L_0x00d8:
            return
        L_0x00d9:
            boolean r7 = com.google.android.gms.internal.measurement.zzjq.zzb()
            if (r7 == 0) goto L_0x0108
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj
            com.google.android.gms.measurement.internal.zzy r7 = r7.zzb()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzaq.zzcj
            boolean r7 = r7.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r8)
            if (r7 == 0) goto L_0x0108
            com.google.android.gms.measurement.internal.zzey r2 = com.google.android.gms.measurement.internal.zzey.zza(r27)
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj
            com.google.android.gms.measurement.internal.zzkr r7 = r7.zzi()
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj
            com.google.android.gms.measurement.internal.zzy r8 = r8.zzb()
            int r8 = r8.zza((java.lang.String) r15)
            r7.zza((com.google.android.gms.measurement.internal.zzey) r2, (int) r8)
            com.google.android.gms.measurement.internal.zzao r2 = r2.zza()
        L_0x0108:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj
            com.google.android.gms.measurement.internal.zzeu r7 = r7.zzr()
            r8 = 2
            boolean r7 = r7.zza((int) r8)
            if (r7 == 0) goto L_0x012e
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj
            com.google.android.gms.measurement.internal.zzeu r7 = r7.zzr()
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzx()
            com.google.android.gms.measurement.internal.zzfy r9 = r1.zzj
            com.google.android.gms.measurement.internal.zzes r9 = r9.zzj()
            java.lang.String r9 = r9.zza((com.google.android.gms.measurement.internal.zzao) r2)
            java.lang.String r10 = "Logging event"
            r7.zza(r10, r9)
        L_0x012e:
            com.google.android.gms.measurement.internal.zzad r7 = r26.zze()
            r7.zzf()
            r1.zzc(r3)     // Catch:{ all -> 0x0948 }
            boolean r7 = com.google.android.gms.internal.measurement.zzjw.zzb()     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x014e
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r7 = r7.zzb()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzaq.zzci     // Catch:{ all -> 0x0948 }
            boolean r7 = r7.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r9)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x014e
            r7 = 1
            goto L_0x014f
        L_0x014e:
            r7 = 0
        L_0x014f:
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0948 }
            java.lang.String r10 = "ecommerce_purchase"
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x0948 }
            java.lang.String r10 = "refund"
            if (r9 != 0) goto L_0x0172
            if (r7 == 0) goto L_0x0170
            java.lang.String r7 = r2.zza     // Catch:{ all -> 0x0948 }
            java.lang.String r9 = "purchase"
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x0172
            java.lang.String r7 = r2.zza     // Catch:{ all -> 0x0948 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            r7 = 0
            goto L_0x0173
        L_0x0172:
            r7 = 1
        L_0x0173:
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = "_iap"
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0948 }
            if (r9 != 0) goto L_0x0182
            if (r7 == 0) goto L_0x0180
            goto L_0x0182
        L_0x0180:
            r9 = 0
            goto L_0x0183
        L_0x0182:
            r9 = 1
        L_0x0183:
            if (r9 == 0) goto L_0x0329
            com.google.android.gms.measurement.internal.zzan r9 = r2.zzb     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = "currency"
            java.lang.String r9 = r9.zzd(r11)     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = "value"
            if (r7 == 0) goto L_0x0202
            com.google.android.gms.measurement.internal.zzan r7 = r2.zzb     // Catch:{ all -> 0x0948 }
            java.lang.Double r7 = r7.zzc(r11)     // Catch:{ all -> 0x0948 }
            double r17 = r7.doubleValue()     // Catch:{ all -> 0x0948 }
            r19 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r17 = r17 * r19
            r21 = 0
            int r7 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r7 != 0) goto L_0x01b6
            com.google.android.gms.measurement.internal.zzan r7 = r2.zzb     // Catch:{ all -> 0x0948 }
            java.lang.Long r7 = r7.zzb(r11)     // Catch:{ all -> 0x0948 }
            long r12 = r7.longValue()     // Catch:{ all -> 0x0948 }
            double r11 = (double) r12     // Catch:{ all -> 0x0948 }
            double r17 = r11 * r19
        L_0x01b6:
            r11 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01e4
            r11 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r7 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01e4
            long r11 = java.lang.Math.round(r17)     // Catch:{ all -> 0x0948 }
            boolean r7 = com.google.android.gms.internal.measurement.zzjw.zzb()     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x020c
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r7 = r7.zzb()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.zzaq.zzci     // Catch:{ all -> 0x0948 }
            boolean r7 = r7.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r13)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x020c
            java.lang.String r7 = r2.zza     // Catch:{ all -> 0x0948 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x020c
            long r11 = -r11
            goto L_0x020c
        L_0x01e4:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzeu r7 = r7.zzr()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzi()     // Catch:{ all -> 0x0948 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r15)     // Catch:{ all -> 0x0948 }
            java.lang.String r9 = "Data lost. Currency value is too big. appId"
            java.lang.Double r10 = java.lang.Double.valueOf(r17)     // Catch:{ all -> 0x0948 }
            r7.zza(r9, r8, r10)     // Catch:{ all -> 0x0948 }
            r23 = r5
            r5 = 0
            r6 = 1
            r11 = 0
            goto L_0x0318
        L_0x0202:
            com.google.android.gms.measurement.internal.zzan r7 = r2.zzb     // Catch:{ all -> 0x0948 }
            java.lang.Long r7 = r7.zzb(r11)     // Catch:{ all -> 0x0948 }
            long r11 = r7.longValue()     // Catch:{ all -> 0x0948 }
        L_0x020c:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x0313
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ all -> 0x0948 }
            java.lang.String r7 = r9.toUpperCase(r7)     // Catch:{ all -> 0x0948 }
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r7.matches(r9)     // Catch:{ all -> 0x0948 }
            if (r9 == 0) goto L_0x0313
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0948 }
            int r9 = r7.length()     // Catch:{ all -> 0x0948 }
            java.lang.String r10 = "_ltv_"
            if (r9 == 0) goto L_0x0232
            java.lang.String r7 = r10.concat(r7)     // Catch:{ all -> 0x0948 }
        L_0x0230:
            r10 = r7
            goto L_0x0238
        L_0x0232:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0948 }
            r7.<init>(r10)     // Catch:{ all -> 0x0948 }
            goto L_0x0230
        L_0x0238:
            com.google.android.gms.measurement.internal.zzad r7 = r26.zze()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzks r7 = r7.zzc(r15, r10)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x0273
            java.lang.Object r9 = r7.zze     // Catch:{ all -> 0x0948 }
            boolean r9 = r9 instanceof java.lang.Long     // Catch:{ all -> 0x0948 }
            if (r9 != 0) goto L_0x0249
            goto L_0x0273
        L_0x0249:
            java.lang.Object r7 = r7.zze     // Catch:{ all -> 0x0948 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0948 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0948 }
            java.lang.String r9 = r2.zzc     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r13 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.common.util.Clock r13 = r13.zzm()     // Catch:{ all -> 0x0948 }
            long r17 = r13.currentTimeMillis()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzks r19 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x0948 }
            long r7 = r7 + r11
            java.lang.Long r13 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0948 }
            r7 = r19
            r8 = r15
            r23 = r5
            r5 = 0
            r6 = 1
            r11 = r17
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x0948 }
        L_0x0270:
            r7 = r19
            goto L_0x02d8
        L_0x0273:
            r23 = r5
            r5 = 0
            r6 = 1
            com.google.android.gms.measurement.internal.zzad r7 = r26.zze()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r9 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r9 = r9.zzb()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.zzaq.zzad     // Catch:{ all -> 0x0948 }
            int r9 = r9.zzb(r15, r13)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)     // Catch:{ all -> 0x0948 }
            r7.zzd()     // Catch:{ all -> 0x0948 }
            r7.zzak()     // Catch:{ all -> 0x0948 }
            android.database.sqlite.SQLiteDatabase r13 = r7.mo7215c_()     // Catch:{ SQLiteException -> 0x02aa }
            r8 = 3
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ SQLiteException -> 0x02aa }
            r8[r5] = r15     // Catch:{ SQLiteException -> 0x02aa }
            r8[r6] = r15     // Catch:{ SQLiteException -> 0x02aa }
            int r9 = r9 - r6
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ SQLiteException -> 0x02aa }
            r16 = 2
            r8[r16] = r9     // Catch:{ SQLiteException -> 0x02aa }
            java.lang.String r9 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r13.execSQL(r9, r8)     // Catch:{ SQLiteException -> 0x02aa }
            goto L_0x02bd
        L_0x02aa:
            r0 = move-exception
            r8 = r0
            com.google.android.gms.measurement.internal.zzeu r7 = r7.zzr()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzf()     // Catch:{ all -> 0x0948 }
            java.lang.String r9 = "Error pruning currencies. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r15)     // Catch:{ all -> 0x0948 }
            r7.zza(r9, r13, r8)     // Catch:{ all -> 0x0948 }
        L_0x02bd:
            com.google.android.gms.measurement.internal.zzks r19 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x0948 }
            java.lang.String r9 = r2.zzc     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.common.util.Clock r7 = r7.zzm()     // Catch:{ all -> 0x0948 }
            long r16 = r7.currentTimeMillis()     // Catch:{ all -> 0x0948 }
            java.lang.Long r13 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0948 }
            r7 = r19
            r8 = r15
            r11 = r16
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x0948 }
            goto L_0x0270
        L_0x02d8:
            com.google.android.gms.measurement.internal.zzad r8 = r26.zze()     // Catch:{ all -> 0x0948 }
            boolean r8 = r8.zza((com.google.android.gms.measurement.internal.zzks) r7)     // Catch:{ all -> 0x0948 }
            if (r8 != 0) goto L_0x0317
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzeu r8 = r8.zzr()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzf()     // Catch:{ all -> 0x0948 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r15)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r10 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzes r10 = r10.zzj()     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = r7.zzc     // Catch:{ all -> 0x0948 }
            java.lang.String r10 = r10.zzc(r11)     // Catch:{ all -> 0x0948 }
            java.lang.Object r7 = r7.zze     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = "Too many unique user properties are set. Ignoring user property. appId"
            r8.zza(r11, r9, r10, r7)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzkr r7 = r7.zzi()     // Catch:{ all -> 0x0948 }
            r9 = 9
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r15
            r7.zza((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0948 }
            goto L_0x0317
        L_0x0313:
            r23 = r5
            r5 = 0
            r6 = 1
        L_0x0317:
            r11 = r6
        L_0x0318:
            if (r11 != 0) goto L_0x032d
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()     // Catch:{ all -> 0x0948 }
            r2.mo7214b_()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()
            r2.zzh()
            return
        L_0x0329:
            r23 = r5
            r5 = 0
            r6 = 1
        L_0x032d:
            java.lang.String r7 = r2.zza     // Catch:{ all -> 0x0948 }
            boolean r18 = com.google.android.gms.measurement.internal.zzkr.zza((java.lang.String) r7)     // Catch:{ all -> 0x0948 }
            java.lang.String r7 = r2.zza     // Catch:{ all -> 0x0948 }
            boolean r19 = r14.equals(r7)     // Catch:{ all -> 0x0948 }
            boolean r7 = com.google.android.gms.internal.measurement.zzjw.zzb()     // Catch:{ all -> 0x0948 }
            r20 = 1
            if (r7 == 0) goto L_0x0360
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r7 = r7.zzb()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzaq.zzce     // Catch:{ all -> 0x0948 }
            boolean r7 = r7.zze(r8, r9)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x0360
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            r7.zzi()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzan r7 = r2.zzb     // Catch:{ all -> 0x0948 }
            long r7 = com.google.android.gms.measurement.internal.zzkr.zza((com.google.android.gms.measurement.internal.zzan) r7)     // Catch:{ all -> 0x0948 }
            long r7 = r7 + r20
            r11 = r7
            goto L_0x0362
        L_0x0360:
            r11 = r20
        L_0x0362:
            com.google.android.gms.measurement.internal.zzad r7 = r26.zze()     // Catch:{ all -> 0x0948 }
            long r8 = r26.zzx()     // Catch:{ all -> 0x0948 }
            r13 = 1
            r16 = 0
            r17 = 0
            r10 = r15
            r14 = r18
            r27 = r15
            r15 = r16
            r16 = r19
            com.google.android.gms.measurement.internal.zzac r7 = r7.zza(r8, r10, r11, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0948 }
            long r8 = r7.zzb     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.zzaq.zzj     // Catch:{ all -> 0x0948 }
            r14 = 0
            java.lang.Object r10 = r10.zza(r14)     // Catch:{ all -> 0x0948 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0948 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0948 }
            long r10 = (long) r10     // Catch:{ all -> 0x0948 }
            long r8 = r8 - r10
            r12 = 0
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            r15 = 1000(0x3e8, double:4.94E-321)
            if (r10 <= 0) goto L_0x03c2
            long r8 = r8 % r15
            int r2 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x03b3
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzf()     // Catch:{ all -> 0x0948 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r27)     // Catch:{ all -> 0x0948 }
            long r4 = r7.zzb     // Catch:{ all -> 0x0948 }
            java.lang.String r6 = "Data loss. Too many events logged. appId, count"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0948 }
            r2.zza(r6, r3, r4)     // Catch:{ all -> 0x0948 }
        L_0x03b3:
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()     // Catch:{ all -> 0x0948 }
            r2.mo7214b_()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()
            r2.zzh()
            return
        L_0x03c2:
            if (r18 == 0) goto L_0x0417
            long r8 = r7.zza     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.zzaq.zzl     // Catch:{ all -> 0x0948 }
            java.lang.Object r10 = r10.zza(r14)     // Catch:{ all -> 0x0948 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0948 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0948 }
            long r10 = (long) r10     // Catch:{ all -> 0x0948 }
            long r8 = r8 - r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0417
            long r8 = r8 % r15
            int r3 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r3 != 0) goto L_0x03f6
            com.google.android.gms.measurement.internal.zzfy r3 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzeu r3 = r3.zzr()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzf()     // Catch:{ all -> 0x0948 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r27)     // Catch:{ all -> 0x0948 }
            long r5 = r7.zza     // Catch:{ all -> 0x0948 }
            java.lang.String r7 = "Data loss. Too many public events logged. appId, count"
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0948 }
            r3.zza(r7, r4, r5)     // Catch:{ all -> 0x0948 }
        L_0x03f6:
            com.google.android.gms.measurement.internal.zzfy r3 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzkr r7 = r3.zzi()     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0948 }
            r9 = 16
            java.lang.String r10 = "_ev"
            r12 = 0
            r8 = r27
            r7.zza((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()     // Catch:{ all -> 0x0948 }
            r2.mo7214b_()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()
            r2.zzh()
            return
        L_0x0417:
            if (r19 == 0) goto L_0x0466
            long r8 = r7.zzd     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r10 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r10 = r10.zzb()     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.zzaq.zzk     // Catch:{ all -> 0x0948 }
            int r10 = r10.zzb(r11, r15)     // Catch:{ all -> 0x0948 }
            r11 = 1000000(0xf4240, float:1.401298E-39)
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ all -> 0x0948 }
            int r10 = java.lang.Math.max(r5, r10)     // Catch:{ all -> 0x0948 }
            long r10 = (long) r10     // Catch:{ all -> 0x0948 }
            long r8 = r8 - r10
            int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0466
            int r2 = (r8 > r20 ? 1 : (r8 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x0457
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzf()     // Catch:{ all -> 0x0948 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r27)     // Catch:{ all -> 0x0948 }
            long r4 = r7.zzd     // Catch:{ all -> 0x0948 }
            java.lang.String r6 = "Too many error events logged. appId, count"
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0948 }
            r2.zza(r6, r3, r4)     // Catch:{ all -> 0x0948 }
        L_0x0457:
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()     // Catch:{ all -> 0x0948 }
            r2.mo7214b_()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()
            r2.zzh()
            return
        L_0x0466:
            com.google.android.gms.measurement.internal.zzan r7 = r2.zzb     // Catch:{ all -> 0x0948 }
            android.os.Bundle r15 = r7.zzb()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzkr r7 = r7.zzi()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = "_o"
            java.lang.String r9 = r2.zzc     // Catch:{ all -> 0x0948 }
            r7.zza((android.os.Bundle) r15, (java.lang.String) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzkr r7 = r7.zzi()     // Catch:{ all -> 0x0948 }
            r11 = r27
            boolean r7 = r7.zzf(r11)     // Catch:{ all -> 0x0948 }
            java.lang.String r10 = "_r"
            if (r7 == 0) goto L_0x04a5
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzkr r7 = r7.zzi()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = "_dbg"
            java.lang.Long r9 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0948 }
            r7.zza((android.os.Bundle) r15, (java.lang.String) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzkr r7 = r7.zzi()     // Catch:{ all -> 0x0948 }
            java.lang.Long r8 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0948 }
            r7.zza((android.os.Bundle) r15, (java.lang.String) r10, (java.lang.Object) r8)     // Catch:{ all -> 0x0948 }
        L_0x04a5:
            java.lang.String r7 = "_s"
            java.lang.String r8 = r2.zza     // Catch:{ all -> 0x0948 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x04cc
            com.google.android.gms.measurement.internal.zzad r7 = r26.zze()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzks r7 = r7.zzc(r8, r4)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x04cc
            java.lang.Object r8 = r7.zze     // Catch:{ all -> 0x0948 }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x0948 }
            if (r8 == 0) goto L_0x04cc
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzkr r8 = r8.zzi()     // Catch:{ all -> 0x0948 }
            java.lang.Object r7 = r7.zze     // Catch:{ all -> 0x0948 }
            r8.zza((android.os.Bundle) r15, (java.lang.String) r4, (java.lang.Object) r7)     // Catch:{ all -> 0x0948 }
        L_0x04cc:
            com.google.android.gms.measurement.internal.zzad r4 = r26.zze()     // Catch:{ all -> 0x0948 }
            long r7 = r4.zzc(r11)     // Catch:{ all -> 0x0948 }
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ef
            com.google.android.gms.measurement.internal.zzfy r4 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzeu r4 = r4.zzr()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzi()     // Catch:{ all -> 0x0948 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r11)     // Catch:{ all -> 0x0948 }
            java.lang.String r5 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0948 }
            r4.zza(r5, r9, r7)     // Catch:{ all -> 0x0948 }
        L_0x04ef:
            com.google.android.gms.measurement.internal.zzal r4 = new com.google.android.gms.measurement.internal.zzal     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            java.lang.String r9 = r2.zzc     // Catch:{ all -> 0x0948 }
            java.lang.String r5 = r2.zza     // Catch:{ all -> 0x0948 }
            long r12 = r2.zzd     // Catch:{ all -> 0x0948 }
            r19 = 0
            r7 = r4
            r2 = r10
            r10 = r11
            r6 = r11
            r11 = r5
            r25 = r14
            r5 = r15
            r14 = r19
            r16 = r5
            r7.<init>((com.google.android.gms.measurement.internal.zzfy) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzad r5 = r26.zze()     // Catch:{ all -> 0x0948 }
            java.lang.String r7 = r4.zzb     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzak r5 = r5.zza((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x0948 }
            if (r5 != 0) goto L_0x058d
            com.google.android.gms.measurement.internal.zzad r5 = r26.zze()     // Catch:{ all -> 0x0948 }
            long r7 = r5.zzh(r6)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r5 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r5 = r5.zzb()     // Catch:{ all -> 0x0948 }
            int r5 = r5.zzb(r6)     // Catch:{ all -> 0x0948 }
            long r9 = (long) r5     // Catch:{ all -> 0x0948 }
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0573
            if (r18 == 0) goto L_0x0573
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzf()     // Catch:{ all -> 0x0948 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r6)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r5 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzes r5 = r5.zzj()     // Catch:{ all -> 0x0948 }
            java.lang.String r4 = r4.zzb     // Catch:{ all -> 0x0948 }
            java.lang.String r4 = r5.zza((java.lang.String) r4)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r5 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r5 = r5.zzb()     // Catch:{ all -> 0x0948 }
            int r5 = r5.zzb(r6)     // Catch:{ all -> 0x0948 }
            java.lang.String r7 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0948 }
            r2.zza(r7, r3, r4, r5)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzkr r7 = r2.zzi()     // Catch:{ all -> 0x0948 }
            r9 = 8
            r10 = 0
            r11 = 0
            r12 = 0
            r8 = r6
            r7.zza((java.lang.String) r8, (int) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()
            r2.zzh()
            return
        L_0x0573:
            com.google.android.gms.measurement.internal.zzak r5 = new com.google.android.gms.measurement.internal.zzak     // Catch:{ all -> 0x0948 }
            java.lang.String r9 = r4.zzb     // Catch:{ all -> 0x0948 }
            r10 = 0
            r12 = 0
            long r14 = r4.zzc     // Catch:{ all -> 0x0948 }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r5
            r8 = r6
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x0948 }
            goto L_0x059b
        L_0x058d:
            com.google.android.gms.measurement.internal.zzfy r6 = r1.zzj     // Catch:{ all -> 0x0948 }
            long r7 = r5.zzf     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzal r4 = r4.zza(r6, r7)     // Catch:{ all -> 0x0948 }
            long r6 = r4.zzc     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzak r5 = r5.zza(r6)     // Catch:{ all -> 0x0948 }
        L_0x059b:
            com.google.android.gms.measurement.internal.zzad r6 = r26.zze()     // Catch:{ all -> 0x0948 }
            r6.zza((com.google.android.gms.measurement.internal.zzak) r5)     // Catch:{ all -> 0x0948 }
            r26.zzw()     // Catch:{ all -> 0x0948 }
            r26.zzk()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r28)     // Catch:{ all -> 0x0948 }
            java.lang.String r5 = r4.zza     // Catch:{ all -> 0x0948 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)     // Catch:{ all -> 0x0948 }
            java.lang.String r5 = r4.zza     // Catch:{ all -> 0x0948 }
            java.lang.String r6 = r3.zza     // Catch:{ all -> 0x0948 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r5)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r5 = com.google.android.gms.internal.measurement.zzcb.zzg.zzbf()     // Catch:{ all -> 0x0948 }
            r6 = 1
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r5 = r5.zza((int) r6)     // Catch:{ all -> 0x0948 }
            java.lang.String r7 = "android"
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r5 = r5.zza((java.lang.String) r7)     // Catch:{ all -> 0x0948 }
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x05da
            java.lang.String r7 = r3.zza     // Catch:{ all -> 0x0948 }
            r5.zzf((java.lang.String) r7)     // Catch:{ all -> 0x0948 }
        L_0x05da:
            java.lang.String r7 = r3.zzd     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x05e7
            java.lang.String r7 = r3.zzd     // Catch:{ all -> 0x0948 }
            r5.zze((java.lang.String) r7)     // Catch:{ all -> 0x0948 }
        L_0x05e7:
            java.lang.String r7 = r3.zzc     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x05f4
            java.lang.String r7 = r3.zzc     // Catch:{ all -> 0x0948 }
            r5.zzg((java.lang.String) r7)     // Catch:{ all -> 0x0948 }
        L_0x05f4:
            long r7 = r3.zzj     // Catch:{ all -> 0x0948 }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0603
            long r7 = r3.zzj     // Catch:{ all -> 0x0948 }
            int r7 = (int) r7     // Catch:{ all -> 0x0948 }
            r5.zzh((int) r7)     // Catch:{ all -> 0x0948 }
        L_0x0603:
            long r7 = r3.zze     // Catch:{ all -> 0x0948 }
            r5.zzf((long) r7)     // Catch:{ all -> 0x0948 }
            java.lang.String r7 = r3.zzb     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x0615
            java.lang.String r7 = r3.zzb     // Catch:{ all -> 0x0948 }
            r5.zzk((java.lang.String) r7)     // Catch:{ all -> 0x0948 }
        L_0x0615:
            boolean r7 = com.google.android.gms.internal.measurement.zzlm.zzb()     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x0664
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r7 = r7.zzb()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzaq.zzbn     // Catch:{ all -> 0x0948 }
            boolean r7 = r7.zze(r8, r9)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x0664
            java.lang.String r7 = r5.zzl()     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x0642
            java.lang.String r7 = r3.zzv     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x0642
            java.lang.String r7 = r3.zzv     // Catch:{ all -> 0x0948 }
            r5.zzp(r7)     // Catch:{ all -> 0x0948 }
        L_0x0642:
            java.lang.String r7 = r5.zzl()     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x067b
            java.lang.String r7 = r5.zzo()     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x067b
            java.lang.String r7 = r3.zzr     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x067b
            java.lang.String r7 = r3.zzr     // Catch:{ all -> 0x0948 }
            r5.zzo(r7)     // Catch:{ all -> 0x0948 }
            goto L_0x067b
        L_0x0664:
            java.lang.String r7 = r5.zzl()     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x067b
            java.lang.String r7 = r3.zzr     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x067b
            java.lang.String r7 = r3.zzr     // Catch:{ all -> 0x0948 }
            r5.zzo(r7)     // Catch:{ all -> 0x0948 }
        L_0x067b:
            long r7 = r3.zzf     // Catch:{ all -> 0x0948 }
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0688
            long r7 = r3.zzf     // Catch:{ all -> 0x0948 }
            r5.zzh((long) r7)     // Catch:{ all -> 0x0948 }
        L_0x0688:
            long r7 = r3.zzt     // Catch:{ all -> 0x0948 }
            r5.zzk((long) r7)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r7 = r7.zzb()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzaq.zzaw     // Catch:{ all -> 0x0948 }
            boolean r7 = r7.zze(r8, r11)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x06aa
            com.google.android.gms.measurement.internal.zzkn r7 = r26.zzh()     // Catch:{ all -> 0x0948 }
            java.util.List r7 = r7.zzf()     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x06aa
            r5.zzd((java.lang.Iterable<? extends java.lang.Integer>) r7)     // Catch:{ all -> 0x0948 }
        L_0x06aa:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfg r7 = r7.zzc()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0948 }
            android.util.Pair r7 = r7.zza((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x06dd
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x0948 }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ all -> 0x0948 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0948 }
            if (r8 != 0) goto L_0x06dd
            boolean r8 = r3.zzo     // Catch:{ all -> 0x0948 }
            if (r8 == 0) goto L_0x073f
            java.lang.Object r8 = r7.first     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0948 }
            r5.zzh((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
            java.lang.Object r8 = r7.second     // Catch:{ all -> 0x0948 }
            if (r8 == 0) goto L_0x073f
            java.lang.Object r7 = r7.second     // Catch:{ all -> 0x0948 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0948 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0948 }
            r5.zza((boolean) r7)     // Catch:{ all -> 0x0948 }
            goto L_0x073f
        L_0x06dd:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzai r7 = r7.zzx()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            android.content.Context r8 = r8.zzn()     // Catch:{ all -> 0x0948 }
            boolean r7 = r7.zza(r8)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x073f
            boolean r7 = r3.zzp     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x073f
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            android.content.Context r7 = r7.zzn()     // Catch:{ all -> 0x0948 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = "android_id"
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r8)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x071f
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzeu r7 = r7.zzr()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzi()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = "null secure ID. appId"
            java.lang.String r11 = r5.zzj()     // Catch:{ all -> 0x0948 }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r11)     // Catch:{ all -> 0x0948 }
            r7.zza(r8, r11)     // Catch:{ all -> 0x0948 }
            java.lang.String r7 = "null"
            goto L_0x073c
        L_0x071f:
            boolean r8 = r7.isEmpty()     // Catch:{ all -> 0x0948 }
            if (r8 == 0) goto L_0x073c
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzeu r8 = r8.zzr()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzi()     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = "empty secure ID. appId"
            java.lang.String r12 = r5.zzj()     // Catch:{ all -> 0x0948 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r12)     // Catch:{ all -> 0x0948 }
            r8.zza(r11, r12)     // Catch:{ all -> 0x0948 }
        L_0x073c:
            r5.zzm(r7)     // Catch:{ all -> 0x0948 }
        L_0x073f:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzai r7 = r7.zzx()     // Catch:{ all -> 0x0948 }
            r7.zzaa()     // Catch:{ all -> 0x0948 }
            java.lang.String r7 = android.os.Build.MODEL     // Catch:{ all -> 0x0948 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r7 = r5.zzc((java.lang.String) r7)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzai r8 = r8.zzx()     // Catch:{ all -> 0x0948 }
            r8.zzaa()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0948 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r7 = r7.zzb((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzai r8 = r8.zzx()     // Catch:{ all -> 0x0948 }
            long r11 = r8.zzf()     // Catch:{ all -> 0x0948 }
            int r8 = (int) r11     // Catch:{ all -> 0x0948 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r7 = r7.zzf((int) r8)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzai r8 = r8.zzx()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r8.zzg()     // Catch:{ all -> 0x0948 }
            r7.zzd((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r7 = r7.zzb()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzaq.zzcl     // Catch:{ all -> 0x0948 }
            boolean r7 = r7.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r8)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x078c
            long r7 = r3.zzl     // Catch:{ all -> 0x0948 }
            r5.zzj((long) r7)     // Catch:{ all -> 0x0948 }
        L_0x078c:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0948 }
            boolean r7 = r7.zzab()     // Catch:{ all -> 0x0948 }
            if (r7 == 0) goto L_0x07a2
            r5.zzj()     // Catch:{ all -> 0x0948 }
            boolean r7 = android.text.TextUtils.isEmpty(r25)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x07a2
            r7 = r25
            r5.zzn(r7)     // Catch:{ all -> 0x0948 }
        L_0x07a2:
            com.google.android.gms.measurement.internal.zzad r7 = r26.zze()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzf r7 = r7.zzb(r8)     // Catch:{ all -> 0x0948 }
            if (r7 != 0) goto L_0x0823
            com.google.android.gms.measurement.internal.zzf r7 = new com.google.android.gms.measurement.internal.zzf     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0948 }
            r7.<init>(r8, r11)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzkr r8 = r8.zzi()     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r8.zzk()     // Catch:{ all -> 0x0948 }
            r7.zza((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r3.zzk     // Catch:{ all -> 0x0948 }
            r7.zzf((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r3.zzb     // Catch:{ all -> 0x0948 }
            r7.zzb((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfg r8 = r8.zzc()     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r8.zzb((java.lang.String) r11)     // Catch:{ all -> 0x0948 }
            r7.zze((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
            r7.zzg((long) r9)     // Catch:{ all -> 0x0948 }
            r7.zza((long) r9)     // Catch:{ all -> 0x0948 }
            r7.zzb((long) r9)     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r3.zzc     // Catch:{ all -> 0x0948 }
            r7.zzg((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
            long r11 = r3.zzj     // Catch:{ all -> 0x0948 }
            r7.zzc((long) r11)     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r3.zzd     // Catch:{ all -> 0x0948 }
            r7.zzh((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
            long r11 = r3.zze     // Catch:{ all -> 0x0948 }
            r7.zzd((long) r11)     // Catch:{ all -> 0x0948 }
            long r11 = r3.zzf     // Catch:{ all -> 0x0948 }
            r7.zze((long) r11)     // Catch:{ all -> 0x0948 }
            boolean r8 = r3.zzh     // Catch:{ all -> 0x0948 }
            r7.zza((boolean) r8)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r8 = r8.zzb()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzaq.zzcl     // Catch:{ all -> 0x0948 }
            boolean r8 = r8.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r11)     // Catch:{ all -> 0x0948 }
            if (r8 != 0) goto L_0x0817
            long r11 = r3.zzl     // Catch:{ all -> 0x0948 }
            r7.zzp(r11)     // Catch:{ all -> 0x0948 }
        L_0x0817:
            long r11 = r3.zzt     // Catch:{ all -> 0x0948 }
            r7.zzf((long) r11)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzad r8 = r26.zze()     // Catch:{ all -> 0x0948 }
            r8.zza((com.google.android.gms.measurement.internal.zzf) r7)     // Catch:{ all -> 0x0948 }
        L_0x0823:
            java.lang.String r8 = r7.zzd()     // Catch:{ all -> 0x0948 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0948 }
            if (r8 != 0) goto L_0x0834
            java.lang.String r8 = r7.zzd()     // Catch:{ all -> 0x0948 }
            r5.zzi((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
        L_0x0834:
            java.lang.String r8 = r7.zzi()     // Catch:{ all -> 0x0948 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0948 }
            if (r8 != 0) goto L_0x0845
            java.lang.String r7 = r7.zzi()     // Catch:{ all -> 0x0948 }
            r5.zzl((java.lang.String) r7)     // Catch:{ all -> 0x0948 }
        L_0x0845:
            com.google.android.gms.measurement.internal.zzad r7 = r26.zze()     // Catch:{ all -> 0x0948 }
            java.lang.String r3 = r3.zza     // Catch:{ all -> 0x0948 }
            java.util.List r3 = r7.zza((java.lang.String) r3)     // Catch:{ all -> 0x0948 }
            r11 = 0
        L_0x0850:
            int r7 = r3.size()     // Catch:{ all -> 0x0948 }
            if (r11 >= r7) goto L_0x0887
            com.google.android.gms.internal.measurement.zzcb$zzk$zza r7 = com.google.android.gms.internal.measurement.zzcb.zzk.zzj()     // Catch:{ all -> 0x0948 }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzks r8 = (com.google.android.gms.measurement.internal.zzks) r8     // Catch:{ all -> 0x0948 }
            java.lang.String r8 = r8.zzc     // Catch:{ all -> 0x0948 }
            com.google.android.gms.internal.measurement.zzcb$zzk$zza r7 = r7.zza((java.lang.String) r8)     // Catch:{ all -> 0x0948 }
            java.lang.Object r8 = r3.get(r11)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzks r8 = (com.google.android.gms.measurement.internal.zzks) r8     // Catch:{ all -> 0x0948 }
            long r12 = r8.zzd     // Catch:{ all -> 0x0948 }
            com.google.android.gms.internal.measurement.zzcb$zzk$zza r7 = r7.zza((long) r12)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzkn r8 = r26.zzh()     // Catch:{ all -> 0x0948 }
            java.lang.Object r12 = r3.get(r11)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzks r12 = (com.google.android.gms.measurement.internal.zzks) r12     // Catch:{ all -> 0x0948 }
            java.lang.Object r12 = r12.zze     // Catch:{ all -> 0x0948 }
            r8.zza((com.google.android.gms.internal.measurement.zzcb.zzk.zza) r7, (java.lang.Object) r12)     // Catch:{ all -> 0x0948 }
            r5.zza((com.google.android.gms.internal.measurement.zzcb.zzk.zza) r7)     // Catch:{ all -> 0x0948 }
            int r11 = r11 + 1
            goto L_0x0850
        L_0x0887:
            com.google.android.gms.measurement.internal.zzad r3 = r26.zze()     // Catch:{ IOException -> 0x08fc }
            com.google.android.gms.internal.measurement.zzgw r7 = r5.zzv()     // Catch:{ IOException -> 0x08fc }
            com.google.android.gms.internal.measurement.zzfo r7 = (com.google.android.gms.internal.measurement.zzfo) r7     // Catch:{ IOException -> 0x08fc }
            com.google.android.gms.internal.measurement.zzcb$zzg r7 = (com.google.android.gms.internal.measurement.zzcb.zzg) r7     // Catch:{ IOException -> 0x08fc }
            long r7 = r3.zza((com.google.android.gms.internal.measurement.zzcb.zzg) r7)     // Catch:{ IOException -> 0x08fc }
            com.google.android.gms.measurement.internal.zzad r3 = r26.zze()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzan r5 = r4.zze     // Catch:{ all -> 0x0948 }
            if (r5 == 0) goto L_0x08f2
            com.google.android.gms.measurement.internal.zzan r5 = r4.zze     // Catch:{ all -> 0x0948 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0948 }
        L_0x08a5:
            boolean r11 = r5.hasNext()     // Catch:{ all -> 0x0948 }
            if (r11 == 0) goto L_0x08b8
            java.lang.Object r11 = r5.next()     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0948 }
            boolean r11 = r2.equals(r11)     // Catch:{ all -> 0x0948 }
            if (r11 == 0) goto L_0x08a5
            goto L_0x08f0
        L_0x08b8:
            com.google.android.gms.measurement.internal.zzfs r2 = r26.zzc()     // Catch:{ all -> 0x0948 }
            java.lang.String r5 = r4.zza     // Catch:{ all -> 0x0948 }
            java.lang.String r11 = r4.zzb     // Catch:{ all -> 0x0948 }
            boolean r2 = r2.zzc(r5, r11)     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzad r11 = r26.zze()     // Catch:{ all -> 0x0948 }
            long r12 = r26.zzx()     // Catch:{ all -> 0x0948 }
            java.lang.String r14 = r4.zza     // Catch:{ all -> 0x0948 }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            com.google.android.gms.measurement.internal.zzac r5 = r11.zza(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0948 }
            if (r2 == 0) goto L_0x08f2
            long r11 = r5.zze     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.zzb()     // Catch:{ all -> 0x0948 }
            java.lang.String r5 = r4.zza     // Catch:{ all -> 0x0948 }
            int r2 = r2.zzc(r5)     // Catch:{ all -> 0x0948 }
            long r13 = (long) r2     // Catch:{ all -> 0x0948 }
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x08f2
        L_0x08f0:
            r11 = r6
            goto L_0x08f3
        L_0x08f2:
            r11 = 0
        L_0x08f3:
            boolean r2 = r3.zza((com.google.android.gms.measurement.internal.zzal) r4, (long) r7, (boolean) r11)     // Catch:{ all -> 0x0948 }
            if (r2 == 0) goto L_0x0915
            r1.zzm = r9     // Catch:{ all -> 0x0948 }
            goto L_0x0915
        L_0x08fc:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzfy r3 = r1.zzj     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzeu r3 = r3.zzr()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzf()     // Catch:{ all -> 0x0948 }
            java.lang.String r4 = r5.zzj()     // Catch:{ all -> 0x0948 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r4)     // Catch:{ all -> 0x0948 }
            java.lang.String r5 = "Data loss. Failed to insert raw event metadata. appId"
            r3.zza(r5, r4, r2)     // Catch:{ all -> 0x0948 }
        L_0x0915:
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()     // Catch:{ all -> 0x0948 }
            r2.mo7214b_()     // Catch:{ all -> 0x0948 }
            com.google.android.gms.measurement.internal.zzad r2 = r26.zze()
            r2.zzh()
            r26.zzz()
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzx()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r23
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.zza(r4, r3)
            return
        L_0x0948:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzad r3 = r26.zze()
            r3.zzh()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.zzc(com.google.android.gms.measurement.internal.zzao, com.google.android.gms.measurement.internal.zzn):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(18:50|(2:51|(2:53|(2:107|55))(2:106|56))|(2:58|(2:59|(2:61|(1:66)(2:108|65))(1:109)))(0)|67|(5:69|(1:71)|72|(2:74|113)(1:114)|75)|112|76|(1:78)(1:79)|80|81|82|(1:84)(1:85)|86|(1:88)(1:89)|90|91|92|93) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x02cd */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzl() {
        /*
            r17 = this;
            r1 = r17
            r17.zzw()
            r17.zzk()
            r0 = 1
            r1.zzs = r0
            r2 = 0
            com.google.android.gms.measurement.internal.zzfy r3 = r1.zzj     // Catch:{ all -> 0x0309 }
            r3.zzu()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzfy r3 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzir r3 = r3.zzw()     // Catch:{ all -> 0x0309 }
            java.lang.Boolean r3 = r3.zzag()     // Catch:{ all -> 0x0309 }
            if (r3 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzr()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzi()     // Catch:{ all -> 0x0309 }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
            r0.zza(r3)     // Catch:{ all -> 0x0309 }
            r1.zzs = r2
            r17.zzaa()
            return
        L_0x0032:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0309 }
            if (r3 == 0) goto L_0x004d
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzr()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()     // Catch:{ all -> 0x0309 }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            r0.zza(r3)     // Catch:{ all -> 0x0309 }
            r1.zzs = r2
            r17.zzaa()
            return
        L_0x004d:
            long r3 = r1.zzm     // Catch:{ all -> 0x0309 }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x005e
            r17.zzz()     // Catch:{ all -> 0x0309 }
            r1.zzs = r2
            r17.zzaa()
            return
        L_0x005e:
            r17.zzw()     // Catch:{ all -> 0x0309 }
            java.util.List<java.lang.Long> r3 = r1.zzv     // Catch:{ all -> 0x0309 }
            if (r3 == 0) goto L_0x0067
            r3 = r0
            goto L_0x0068
        L_0x0067:
            r3 = r2
        L_0x0068:
            if (r3 == 0) goto L_0x007f
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzr()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzx()     // Catch:{ all -> 0x0309 }
            java.lang.String r3 = "Uploading requested multiple times"
            r0.zza(r3)     // Catch:{ all -> 0x0309 }
            r1.zzs = r2
            r17.zzaa()
            return
        L_0x007f:
            com.google.android.gms.measurement.internal.zzfb r3 = r17.zzd()     // Catch:{ all -> 0x0309 }
            boolean r3 = r3.zzf()     // Catch:{ all -> 0x0309 }
            if (r3 != 0) goto L_0x00a1
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzr()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzx()     // Catch:{ all -> 0x0309 }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.zza(r3)     // Catch:{ all -> 0x0309 }
            r17.zzz()     // Catch:{ all -> 0x0309 }
            r1.zzs = r2
            r17.zzaa()
            return
        L_0x00a1:
            com.google.android.gms.measurement.internal.zzfy r3 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.common.util.Clock r3 = r3.zzm()     // Catch:{ all -> 0x0309 }
            long r3 = r3.currentTimeMillis()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzy r7 = r7.zzb()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.zzaq.zzap     // Catch:{ all -> 0x0309 }
            r9 = 0
            int r7 = r7.zzb(r9, r8)     // Catch:{ all -> 0x0309 }
            long r10 = com.google.android.gms.measurement.internal.zzy.zzv()     // Catch:{ all -> 0x0309 }
            r8 = r2
        L_0x00bd:
            if (r8 >= r7) goto L_0x00ca
            long r12 = r3 - r10
            boolean r12 = r1.zza((java.lang.String) r9, (long) r12)     // Catch:{ all -> 0x0309 }
            if (r12 == 0) goto L_0x00ca
            int r8 = r8 + 1
            goto L_0x00bd
        L_0x00ca:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzfg r7 = r7.zzc()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzfk r7 = r7.zzc     // Catch:{ all -> 0x0309 }
            long r7 = r7.zza()     // Catch:{ all -> 0x0309 }
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00f3
            com.google.android.gms.measurement.internal.zzfy r5 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzeu r5 = r5.zzr()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzw()     // Catch:{ all -> 0x0309 }
            long r6 = r3 - r7
            long r6 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0309 }
            java.lang.String r8 = "Uploading events. Elapsed time since last upload attempt (ms)"
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0309 }
            r5.zza(r8, r6)     // Catch:{ all -> 0x0309 }
        L_0x00f3:
            com.google.android.gms.measurement.internal.zzad r5 = r17.zze()     // Catch:{ all -> 0x0309 }
            java.lang.String r5 = r5.mo7216d_()     // Catch:{ all -> 0x0309 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0309 }
            r7 = -1
            if (r6 != 0) goto L_0x02e1
            long r10 = r1.zzx     // Catch:{ all -> 0x0309 }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0113
            com.google.android.gms.measurement.internal.zzad r6 = r17.zze()     // Catch:{ all -> 0x0309 }
            long r6 = r6.zzaa()     // Catch:{ all -> 0x0309 }
            r1.zzx = r6     // Catch:{ all -> 0x0309 }
        L_0x0113:
            com.google.android.gms.measurement.internal.zzfy r6 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzy r6 = r6.zzb()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.zzaq.zzf     // Catch:{ all -> 0x0309 }
            int r6 = r6.zzb(r5, r7)     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzy r7 = r7.zzb()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.zzaq.zzg     // Catch:{ all -> 0x0309 }
            int r7 = r7.zzb(r5, r8)     // Catch:{ all -> 0x0309 }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzad r8 = r17.zze()     // Catch:{ all -> 0x0309 }
            java.util.List r6 = r8.zza((java.lang.String) r5, (int) r6, (int) r7)     // Catch:{ all -> 0x0309 }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x0309 }
            if (r7 != 0) goto L_0x0303
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x0309 }
        L_0x0141:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0309 }
            if (r8 == 0) goto L_0x0160
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0309 }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x0309 }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzcb$zzg r8 = (com.google.android.gms.internal.measurement.zzcb.zzg) r8     // Catch:{ all -> 0x0309 }
            java.lang.String r10 = r8.zzad()     // Catch:{ all -> 0x0309 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0309 }
            if (r10 != 0) goto L_0x0141
            java.lang.String r7 = r8.zzad()     // Catch:{ all -> 0x0309 }
            goto L_0x0161
        L_0x0160:
            r7 = r9
        L_0x0161:
            if (r7 == 0) goto L_0x0190
            r8 = r2
        L_0x0164:
            int r10 = r6.size()     // Catch:{ all -> 0x0309 }
            if (r8 >= r10) goto L_0x0190
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x0309 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0309 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzcb$zzg r10 = (com.google.android.gms.internal.measurement.zzcb.zzg) r10     // Catch:{ all -> 0x0309 }
            java.lang.String r11 = r10.zzad()     // Catch:{ all -> 0x0309 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0309 }
            if (r11 != 0) goto L_0x018d
            java.lang.String r10 = r10.zzad()     // Catch:{ all -> 0x0309 }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x0309 }
            if (r10 != 0) goto L_0x018d
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x0309 }
            goto L_0x0190
        L_0x018d:
            int r8 = r8 + 1
            goto L_0x0164
        L_0x0190:
            com.google.android.gms.internal.measurement.zzcb$zzf$zza r7 = com.google.android.gms.internal.measurement.zzcb.zzf.zzb()     // Catch:{ all -> 0x0309 }
            int r8 = r6.size()     // Catch:{ all -> 0x0309 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0309 }
            int r11 = r6.size()     // Catch:{ all -> 0x0309 }
            r10.<init>(r11)     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzfy r11 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzy r11 = r11.zzb()     // Catch:{ all -> 0x0309 }
            boolean r11 = r11.zzg(r5)     // Catch:{ all -> 0x0309 }
            r12 = r2
        L_0x01ac:
            if (r12 >= r8) goto L_0x0217
            java.lang.Object r13 = r6.get(r12)     // Catch:{ all -> 0x0309 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x0309 }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzcb$zzg r13 = (com.google.android.gms.internal.measurement.zzcb.zzg) r13     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzfo$zza r13 = r13.zzbl()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzfo$zza r13 = (com.google.android.gms.internal.measurement.zzfo.zza) r13     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r13 = (com.google.android.gms.internal.measurement.zzcb.zzg.zza) r13     // Catch:{ all -> 0x0309 }
            java.lang.Object r14 = r6.get(r12)     // Catch:{ all -> 0x0309 }
            android.util.Pair r14 = (android.util.Pair) r14     // Catch:{ all -> 0x0309 }
            java.lang.Object r14 = r14.second     // Catch:{ all -> 0x0309 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x0309 }
            r10.add(r14)     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzfy r14 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzy r14 = r14.zzb()     // Catch:{ all -> 0x0309 }
            long r14 = r14.zzf()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r14 = r13.zzg((long) r14)     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r14 = r14.zza((long) r3)     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzfy r15 = r1.zzj     // Catch:{ all -> 0x0309 }
            r15.zzu()     // Catch:{ all -> 0x0309 }
            r14.zzb((boolean) r2)     // Catch:{ all -> 0x0309 }
            if (r11 != 0) goto L_0x01ec
            r13.zzn()     // Catch:{ all -> 0x0309 }
        L_0x01ec:
            com.google.android.gms.measurement.internal.zzfy r14 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzy r14 = r14.zzb()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.zzaq.zzay     // Catch:{ all -> 0x0309 }
            boolean r14 = r14.zze(r5, r15)     // Catch:{ all -> 0x0309 }
            if (r14 == 0) goto L_0x0211
            com.google.android.gms.internal.measurement.zzgw r14 = r13.zzv()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzfo r14 = (com.google.android.gms.internal.measurement.zzfo) r14     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzcb$zzg r14 = (com.google.android.gms.internal.measurement.zzcb.zzg) r14     // Catch:{ all -> 0x0309 }
            byte[] r14 = r14.zzbi()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzkn r15 = r17.zzh()     // Catch:{ all -> 0x0309 }
            long r14 = r15.zza((byte[]) r14)     // Catch:{ all -> 0x0309 }
            r13.zzl((long) r14)     // Catch:{ all -> 0x0309 }
        L_0x0211:
            r7.zza((com.google.android.gms.internal.measurement.zzcb.zzg.zza) r13)     // Catch:{ all -> 0x0309 }
            int r12 = r12 + 1
            goto L_0x01ac
        L_0x0217:
            com.google.android.gms.measurement.internal.zzfy r6 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzeu r6 = r6.zzr()     // Catch:{ all -> 0x0309 }
            r11 = 2
            boolean r6 = r6.zza((int) r11)     // Catch:{ all -> 0x0309 }
            if (r6 == 0) goto L_0x0235
            com.google.android.gms.measurement.internal.zzkn r6 = r17.zzh()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzgw r11 = r7.zzv()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzfo r11 = (com.google.android.gms.internal.measurement.zzfo) r11     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzcb$zzf r11 = (com.google.android.gms.internal.measurement.zzcb.zzf) r11     // Catch:{ all -> 0x0309 }
            java.lang.String r6 = r6.zza((com.google.android.gms.internal.measurement.zzcb.zzf) r11)     // Catch:{ all -> 0x0309 }
            goto L_0x0236
        L_0x0235:
            r6 = r9
        L_0x0236:
            r17.zzh()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzgw r11 = r7.zzv()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzfo r11 = (com.google.android.gms.internal.measurement.zzfo) r11     // Catch:{ all -> 0x0309 }
            com.google.android.gms.internal.measurement.zzcb$zzf r11 = (com.google.android.gms.internal.measurement.zzcb.zzf) r11     // Catch:{ all -> 0x0309 }
            byte[] r14 = r11.zzbi()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzen<java.lang.String> r11 = com.google.android.gms.measurement.internal.zzaq.zzp     // Catch:{ all -> 0x0309 }
            java.lang.Object r9 = r11.zza(r9)     // Catch:{ all -> 0x0309 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0309 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x02cd }
            r13.<init>(r9)     // Catch:{ MalformedURLException -> 0x02cd }
            boolean r11 = r10.isEmpty()     // Catch:{ MalformedURLException -> 0x02cd }
            r11 = r11 ^ r0
            com.google.android.gms.common.internal.Preconditions.checkArgument(r11)     // Catch:{ MalformedURLException -> 0x02cd }
            java.util.List<java.lang.Long> r11 = r1.zzv     // Catch:{ MalformedURLException -> 0x02cd }
            if (r11 == 0) goto L_0x026e
            com.google.android.gms.measurement.internal.zzfy r10 = r1.zzj     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.measurement.internal.zzeu r10 = r10.zzr()     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.measurement.internal.zzew r10 = r10.zzf()     // Catch:{ MalformedURLException -> 0x02cd }
            java.lang.String r11 = "Set uploading progress before finishing the previous upload"
            r10.zza(r11)     // Catch:{ MalformedURLException -> 0x02cd }
            goto L_0x0275
        L_0x026e:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x02cd }
            r11.<init>(r10)     // Catch:{ MalformedURLException -> 0x02cd }
            r1.zzv = r11     // Catch:{ MalformedURLException -> 0x02cd }
        L_0x0275:
            com.google.android.gms.measurement.internal.zzfy r10 = r1.zzj     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.measurement.internal.zzfg r10 = r10.zzc()     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.measurement.internal.zzfk r10 = r10.zzd     // Catch:{ MalformedURLException -> 0x02cd }
            r10.zza(r3)     // Catch:{ MalformedURLException -> 0x02cd }
            if (r8 <= 0) goto L_0x028b
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r7.zza((int) r2)     // Catch:{ MalformedURLException -> 0x02cd }
            java.lang.String r3 = r3.zzx()     // Catch:{ MalformedURLException -> 0x02cd }
            goto L_0x028d
        L_0x028b:
            java.lang.String r3 = "?"
        L_0x028d:
            com.google.android.gms.measurement.internal.zzfy r4 = r1.zzj     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.measurement.internal.zzeu r4 = r4.zzr()     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzx()     // Catch:{ MalformedURLException -> 0x02cd }
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x02cd }
            java.lang.String r8 = "Uploading data. app, uncompressed size, data"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x02cd }
            r4.zza(r8, r3, r7, r6)     // Catch:{ MalformedURLException -> 0x02cd }
            r1.zzr = r0     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.measurement.internal.zzfb r11 = r17.zzd()     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.measurement.internal.zzkl r0 = new com.google.android.gms.measurement.internal.zzkl     // Catch:{ MalformedURLException -> 0x02cd }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x02cd }
            r11.zzd()     // Catch:{ MalformedURLException -> 0x02cd }
            r11.zzak()     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.measurement.internal.zzfv r3 = r11.zzq()     // Catch:{ MalformedURLException -> 0x02cd }
            com.google.android.gms.measurement.internal.zzff r4 = new com.google.android.gms.measurement.internal.zzff     // Catch:{ MalformedURLException -> 0x02cd }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x02cd }
            r3.zzb((java.lang.Runnable) r4)     // Catch:{ MalformedURLException -> 0x02cd }
            goto L_0x0303
        L_0x02cd:
            com.google.android.gms.measurement.internal.zzfy r0 = r1.zzj     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzr()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()     // Catch:{ all -> 0x0309 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r5)     // Catch:{ all -> 0x0309 }
            java.lang.String r4 = "Failed to parse upload URL. Not uploading. appId"
            r0.zza(r4, r3, r9)     // Catch:{ all -> 0x0309 }
            goto L_0x0303
        L_0x02e1:
            r1.zzx = r7     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzad r0 = r17.zze()     // Catch:{ all -> 0x0309 }
            long r5 = com.google.android.gms.measurement.internal.zzy.zzv()     // Catch:{ all -> 0x0309 }
            long r3 = r3 - r5
            java.lang.String r0 = r0.zza((long) r3)     // Catch:{ all -> 0x0309 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0309 }
            if (r3 != 0) goto L_0x0303
            com.google.android.gms.measurement.internal.zzad r3 = r17.zze()     // Catch:{ all -> 0x0309 }
            com.google.android.gms.measurement.internal.zzf r0 = r3.zzb(r0)     // Catch:{ all -> 0x0309 }
            if (r0 == 0) goto L_0x0303
            r1.zza((com.google.android.gms.measurement.internal.zzf) r0)     // Catch:{ all -> 0x0309 }
        L_0x0303:
            r1.zzs = r2
            r17.zzaa()
            return
        L_0x0309:
            r0 = move-exception
            r1.zzs = r2
            r17.zzaa()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.zzl():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x024c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x024f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0250, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0253, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0254, code lost:
        r25 = "";
        r42 = r6;
        r6 = r0;
        r3 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        r2 = r0;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r6 = r0;
        r25 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0046 A[ExcHandler: all (r0v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:4:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x024f A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r6 
      PHI: (r6v137 android.database.Cursor) = (r6v138 android.database.Cursor), (r6v139 android.database.Cursor), (r6v139 android.database.Cursor), (r6v139 android.database.Cursor), (r6v139 android.database.Cursor), (r6v139 android.database.Cursor), (r6v139 android.database.Cursor), (r6v139 android.database.Cursor), (r6v139 android.database.Cursor), (r6v158 android.database.Cursor), (r6v158 android.database.Cursor), (r6v158 android.database.Cursor), (r6v165 android.database.Cursor), (r6v165 android.database.Cursor), (r6v165 android.database.Cursor), (r6v165 android.database.Cursor) binds: [B:59:0x00f9, B:66:0x0136, B:120:0x0235, B:121:?, B:70:0x014c, B:87:0x01a3, B:83:0x018c, B:84:?, B:75:0x0162, B:48:0x00e0, B:55:0x00ef, B:56:?, B:23:0x0085, B:29:0x0091, B:31:0x0095, B:32:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:23:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0278 A[SYNTHETIC, Splitter:B:136:0x0278] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x027f A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x028d A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03dc A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03de A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03e1 A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03e2 A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x05ce A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x06a6 A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x083c A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0858 A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0872 A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0bbb A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0bce A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0bd1 A[Catch:{ IOException -> 0x0231, all -> 0x0f88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x0bf8 A[SYNTHETIC, Splitter:B:469:0x0bf8] */
    /* JADX WARNING: Removed duplicated region for block: B:583:0x0f6f A[SYNTHETIC, Splitter:B:583:0x0f6f] */
    /* JADX WARNING: Removed duplicated region for block: B:590:0x0f84 A[SYNTHETIC, Splitter:B:590:0x0f84] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011f A[Catch:{ SQLiteException -> 0x009d, all -> 0x024f }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0136 A[SYNTHETIC, Splitter:B:66:0x0136] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:46:0x00c0=Splitter:B:46:0x00c0, B:21:0x0063=Splitter:B:21:0x0063} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zza(java.lang.String r44, long r45) {
        /*
            r43 = this;
            r1 = r43
            java.lang.String r2 = "_sn"
            java.lang.String r3 = ""
            java.lang.String r4 = "_npa"
            com.google.android.gms.measurement.internal.zzad r5 = r43.zze()
            r5.zzf()
            com.google.android.gms.measurement.internal.zzkj$zza r5 = new com.google.android.gms.measurement.internal.zzkj$zza     // Catch:{ all -> 0x0f88 }
            r6 = 0
            r5.<init>(r1, r6)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzad r7 = r43.zze()     // Catch:{ all -> 0x0f88 }
            long r8 = r1.zzx     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)     // Catch:{ all -> 0x0f88 }
            r7.zzd()     // Catch:{ all -> 0x0f88 }
            r7.zzak()     // Catch:{ all -> 0x0f88 }
            r11 = -1
            r13 = 2
            r14 = 0
            r15 = 1
            android.database.sqlite.SQLiteDatabase r10 = r7.mo7215c_()     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            boolean r16 = android.text.TextUtils.isEmpty(r6)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            if (r16 == 0) goto L_0x00a4
            int r16 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r16 == 0) goto L_0x0052
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x004b, all -> 0x0046 }
            java.lang.String r17 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x004b, all -> 0x0046 }
            r6[r14] = r17     // Catch:{ SQLiteException -> 0x004b, all -> 0x0046 }
            java.lang.String r17 = java.lang.String.valueOf(r45)     // Catch:{ SQLiteException -> 0x004b, all -> 0x0046 }
            r6[r15] = r17     // Catch:{ SQLiteException -> 0x004b, all -> 0x0046 }
            goto L_0x005a
        L_0x0046:
            r0 = move-exception
            r2 = r0
            r6 = 0
            goto L_0x0f82
        L_0x004b:
            r0 = move-exception
            r6 = r0
            r25 = r3
        L_0x004f:
            r3 = 0
            goto L_0x0264
        L_0x0052:
            java.lang.String[] r6 = new java.lang.String[r15]     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            java.lang.String r17 = java.lang.String.valueOf(r45)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            r6[r14] = r17     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
        L_0x005a:
            if (r16 == 0) goto L_0x0061
            java.lang.String r16 = "rowid <= ? and "
            r45 = r16
            goto L_0x0063
        L_0x0061:
            r45 = r3
        L_0x0063:
            int r13 = r45.length()     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            int r13 = r13 + 148
            r11.<init>(r13)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            java.lang.String r12 = "select app_id, metadata_fingerprint from raw_events where "
            r11.append(r12)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            r12 = r45
            r11.append(r12)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            java.lang.String r12 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r11.append(r12)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            java.lang.String r11 = r11.toString()     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            android.database.Cursor r6 = r10.rawQuery(r11, r6)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            boolean r11 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0253, all -> 0x024f }
            if (r11 != 0) goto L_0x0091
            if (r6 == 0) goto L_0x00eb
            r6.close()     // Catch:{ all -> 0x0f88 }
            goto L_0x00eb
        L_0x0091:
            java.lang.String r11 = r6.getString(r14)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024f }
            java.lang.String r12 = r6.getString(r15)     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            r6.close()     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            goto L_0x00f7
        L_0x009d:
            r0 = move-exception
            r25 = r3
        L_0x00a0:
            r3 = r6
        L_0x00a1:
            r6 = r0
            goto L_0x0265
        L_0x00a4:
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x00b5
            r11 = 2
            java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            r11 = 0
            r12[r14] = r11     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            r12[r15] = r11     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            goto L_0x00ba
        L_0x00b5:
            r11 = 0
            java.lang.String[] r12 = new java.lang.String[]{r11}     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
        L_0x00ba:
            if (r6 == 0) goto L_0x00bf
            java.lang.String r6 = " and rowid <= ?"
            goto L_0x00c0
        L_0x00bf:
            r6 = r3
        L_0x00c0:
            int r11 = r6.length()     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            int r11 = r11 + 84
            r13.<init>(r11)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            java.lang.String r11 = "select metadata_fingerprint from raw_events where app_id = ?"
            r13.append(r11)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            r13.append(r6)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            java.lang.String r6 = " order by rowid limit 1;"
            r13.append(r6)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            java.lang.String r6 = r13.toString()     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            android.database.Cursor r6 = r10.rawQuery(r6, r12)     // Catch:{ SQLiteException -> 0x025d, all -> 0x0046 }
            boolean r11 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0253, all -> 0x024f }
            if (r11 != 0) goto L_0x00ef
            if (r6 == 0) goto L_0x00eb
            r6.close()     // Catch:{ all -> 0x0f88 }
        L_0x00eb:
            r25 = r3
            goto L_0x027b
        L_0x00ef:
            java.lang.String r12 = r6.getString(r14)     // Catch:{ SQLiteException -> 0x0253, all -> 0x024f }
            r6.close()     // Catch:{ SQLiteException -> 0x0253, all -> 0x024f }
            r11 = 0
        L_0x00f7:
            java.lang.String r13 = "metadata"
            java.lang.String[] r18 = new java.lang.String[]{r13}     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            r13 = 2
            java.lang.String[] r15 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            r15[r14] = r11     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            r13 = 1
            r15[r13] = r12     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            java.lang.String r17 = "raw_events_metadata"
            java.lang.String r19 = "app_id = ? and metadata_fingerprint = ?"
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid"
            java.lang.String r24 = "2"
            r16 = r10
            r20 = r15
            android.database.Cursor r6 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            boolean r13 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            if (r13 != 0) goto L_0x0136
            com.google.android.gms.measurement.internal.zzeu r8 = r7.zzr()     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzf()     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            java.lang.String r9 = "Raw event metadata record is missing. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            r8.zza(r9, r10)     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            if (r6 == 0) goto L_0x00eb
            r6.close()     // Catch:{ all -> 0x0f88 }
            goto L_0x00eb
        L_0x0136:
            byte[] r13 = r6.getBlob(r14)     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r15 = com.google.android.gms.internal.measurement.zzcb.zzg.zzbf()     // Catch:{ IOException -> 0x0231 }
            com.google.android.gms.internal.measurement.zzgz r13 = com.google.android.gms.measurement.internal.zzkn.zza(r15, (byte[]) r13)     // Catch:{ IOException -> 0x0231 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r13 = (com.google.android.gms.internal.measurement.zzcb.zzg.zza) r13     // Catch:{ IOException -> 0x0231 }
            com.google.android.gms.internal.measurement.zzgw r13 = r13.zzv()     // Catch:{ IOException -> 0x0231 }
            com.google.android.gms.internal.measurement.zzfo r13 = (com.google.android.gms.internal.measurement.zzfo) r13     // Catch:{ IOException -> 0x0231 }
            com.google.android.gms.internal.measurement.zzcb$zzg r13 = (com.google.android.gms.internal.measurement.zzcb.zzg) r13     // Catch:{ IOException -> 0x0231 }
            boolean r15 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            if (r15 == 0) goto L_0x0166
            com.google.android.gms.measurement.internal.zzeu r15 = r7.zzr()     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            com.google.android.gms.measurement.internal.zzew r15 = r15.zzi()     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x009d, all -> 0x024f }
            r25 = r3
            java.lang.String r3 = "Get multiple raw event metadata records, expected one. appId"
            r15.zza(r3, r14)     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            goto L_0x0168
        L_0x0166:
            r25 = r3
        L_0x0168:
            r6.close()     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            r5.zza(r13)     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            r13 = -1
            int r3 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x018b
            r3 = 3
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            r3 = 0
            r13[r3] = r11     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            r3 = 1
            r13[r3] = r12     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            r8 = 2
            r13[r8] = r3     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            java.lang.String r3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r19 = r3
            r20 = r13
            goto L_0x019a
        L_0x018b:
            r3 = 2
            java.lang.String[] r8 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            r3 = 0
            r8[r3] = r11     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            r3 = 1
            r8[r3] = r12     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            java.lang.String r3 = "app_id = ? and metadata_fingerprint = ?"
            r19 = r3
            r20 = r8
        L_0x019a:
            java.lang.String r3 = "rowid"
            java.lang.String r8 = "name"
            java.lang.String r9 = "timestamp"
            java.lang.String r12 = "data"
            java.lang.String[] r18 = new java.lang.String[]{r3, r8, r9, r12}     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            java.lang.String r17 = "raw_events"
            r21 = 0
            r22 = 0
            java.lang.String r23 = "rowid"
            r24 = 0
            r16 = r10
            android.database.Cursor r3 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            boolean r6 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x022e }
            if (r6 != 0) goto L_0x01d5
            com.google.android.gms.measurement.internal.zzeu r6 = r7.zzr()     // Catch:{ SQLiteException -> 0x022e }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzi()     // Catch:{ SQLiteException -> 0x022e }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x022e }
            java.lang.String r9 = "Raw event data disappeared while in transaction. appId"
            r6.zza(r9, r8)     // Catch:{ SQLiteException -> 0x022e }
            if (r3 == 0) goto L_0x027b
            r3.close()     // Catch:{ all -> 0x0f88 }
            goto L_0x027b
        L_0x01d5:
            r6 = 0
            long r8 = r3.getLong(r6)     // Catch:{ SQLiteException -> 0x022e }
            r6 = 3
            byte[] r10 = r3.getBlob(r6)     // Catch:{ SQLiteException -> 0x022e }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r6 = com.google.android.gms.internal.measurement.zzcb.zzc.zzj()     // Catch:{ IOException -> 0x020f }
            com.google.android.gms.internal.measurement.zzgz r6 = com.google.android.gms.measurement.internal.zzkn.zza(r6, (byte[]) r10)     // Catch:{ IOException -> 0x020f }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r6 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r6     // Catch:{ IOException -> 0x020f }
            r10 = 1
            java.lang.String r12 = r3.getString(r10)     // Catch:{ SQLiteException -> 0x022e }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r10 = r6.zza((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x022e }
            r12 = 2
            long r13 = r3.getLong(r12)     // Catch:{ SQLiteException -> 0x022e }
            r10.zza((long) r13)     // Catch:{ SQLiteException -> 0x022e }
            com.google.android.gms.internal.measurement.zzgw r6 = r6.zzv()     // Catch:{ SQLiteException -> 0x022e }
            com.google.android.gms.internal.measurement.zzfo r6 = (com.google.android.gms.internal.measurement.zzfo) r6     // Catch:{ SQLiteException -> 0x022e }
            com.google.android.gms.internal.measurement.zzcb$zzc r6 = (com.google.android.gms.internal.measurement.zzcb.zzc) r6     // Catch:{ SQLiteException -> 0x022e }
            boolean r6 = r5.zza(r8, r6)     // Catch:{ SQLiteException -> 0x022e }
            if (r6 != 0) goto L_0x0222
            if (r3 == 0) goto L_0x027b
            r3.close()     // Catch:{ all -> 0x0f88 }
            goto L_0x027b
        L_0x020f:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.zzeu r8 = r7.zzr()     // Catch:{ SQLiteException -> 0x022e }
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzf()     // Catch:{ SQLiteException -> 0x022e }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x022e }
            r8.zza(r9, r10, r6)     // Catch:{ SQLiteException -> 0x022e }
        L_0x0222:
            boolean r6 = r3.moveToNext()     // Catch:{ SQLiteException -> 0x022e }
            if (r6 != 0) goto L_0x01d5
            if (r3 == 0) goto L_0x027b
            r3.close()     // Catch:{ all -> 0x0f88 }
            goto L_0x027b
        L_0x022e:
            r0 = move-exception
            goto L_0x00a1
        L_0x0231:
            r0 = move-exception
            r25 = r3
            r3 = r0
            com.google.android.gms.measurement.internal.zzeu r8 = r7.zzr()     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzf()     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r11)     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            java.lang.String r10 = "Data loss. Failed to merge raw event metadata. appId"
            r8.zza(r10, r9, r3)     // Catch:{ SQLiteException -> 0x024c, all -> 0x024f }
            if (r6 == 0) goto L_0x027b
            r6.close()     // Catch:{ all -> 0x0f88 }
            goto L_0x027b
        L_0x024c:
            r0 = move-exception
            goto L_0x00a0
        L_0x024f:
            r0 = move-exception
            r2 = r0
            goto L_0x0f82
        L_0x0253:
            r0 = move-exception
            r25 = r3
            r3 = r0
            r42 = r6
            r6 = r3
            r3 = r42
            goto L_0x0264
        L_0x025d:
            r0 = move-exception
            r25 = r3
            r3 = r0
            r6 = r3
            goto L_0x004f
        L_0x0264:
            r11 = 0
        L_0x0265:
            com.google.android.gms.measurement.internal.zzeu r7 = r7.zzr()     // Catch:{ all -> 0x0f7f }
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzf()     // Catch:{ all -> 0x0f7f }
            java.lang.String r8 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r11)     // Catch:{ all -> 0x0f7f }
            r7.zza(r8, r9, r6)     // Catch:{ all -> 0x0f7f }
            if (r3 == 0) goto L_0x027b
            r3.close()     // Catch:{ all -> 0x0f88 }
        L_0x027b:
            java.util.List<com.google.android.gms.internal.measurement.zzcb$zzc> r3 = r5.zzc     // Catch:{ all -> 0x0f88 }
            if (r3 == 0) goto L_0x028a
            java.util.List<com.google.android.gms.internal.measurement.zzcb$zzc> r3 = r5.zzc     // Catch:{ all -> 0x0f88 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0f88 }
            if (r3 == 0) goto L_0x0288
            goto L_0x028a
        L_0x0288:
            r3 = 0
            goto L_0x028b
        L_0x028a:
            r3 = 1
        L_0x028b:
            if (r3 != 0) goto L_0x0f6f
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r5.zza     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r3 = r3.zzbl()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r3 = (com.google.android.gms.internal.measurement.zzfo.zza) r3     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r3 = (com.google.android.gms.internal.measurement.zzcb.zzg.zza) r3     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r3 = r3.zzc()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfy r6 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzy r6 = r6.zzb()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r7 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.zzaq.zzau     // Catch:{ all -> 0x0f88 }
            boolean r6 = r6.zze(r7, r8)     // Catch:{ all -> 0x0f88 }
            r7 = -1
            r8 = -1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x02b6:
            java.util.List<com.google.android.gms.internal.measurement.zzcb$zzc> r9 = r5.zzc     // Catch:{ all -> 0x0f88 }
            int r9 = r9.size()     // Catch:{ all -> 0x0f88 }
            r18 = r14
            java.lang.String r14 = "_fr"
            r19 = r4
            java.lang.String r4 = "_e"
            r20 = r13
            java.lang.String r13 = "_et"
            r21 = r2
            r22 = r3
            if (r12 >= r9) goto L_0x08d2
            java.util.List<com.google.android.gms.internal.measurement.zzcb$zzc> r9 = r5.zzc     // Catch:{ all -> 0x0f88 }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r9 = (com.google.android.gms.internal.measurement.zzcb.zzc) r9     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r9 = r9.zzbl()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r9 = (com.google.android.gms.internal.measurement.zzfo.zza) r9     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r9 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfs r2 = r43.zzc()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r3 = r3.zzx()     // Catch:{ all -> 0x0f88 }
            r26 = r12
            java.lang.String r12 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            boolean r2 = r2.zzb(r3, r12)     // Catch:{ all -> 0x0f88 }
            java.lang.String r3 = "_err"
            if (r2 == 0) goto L_0x037b
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzi()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r4 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r4 = r4.zzx()     // Catch:{ all -> 0x0f88 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r4)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfy r12 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzes r12 = r12.zzj()     // Catch:{ all -> 0x0f88 }
            java.lang.String r13 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            java.lang.String r12 = r12.zza((java.lang.String) r13)     // Catch:{ all -> 0x0f88 }
            java.lang.String r13 = "Dropping blacklisted raw event. appId"
            r2.zza(r13, r4, r12)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfs r2 = r43.zzc()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r4 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r4 = r4.zzx()     // Catch:{ all -> 0x0f88 }
            boolean r2 = r2.zzg(r4)     // Catch:{ all -> 0x0f88 }
            if (r2 != 0) goto L_0x0340
            com.google.android.gms.measurement.internal.zzfs r2 = r43.zzc()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r4 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r4 = r4.zzx()     // Catch:{ all -> 0x0f88 }
            boolean r2 = r2.zzh(r4)     // Catch:{ all -> 0x0f88 }
            if (r2 == 0) goto L_0x033e
            goto L_0x0340
        L_0x033e:
            r2 = 0
            goto L_0x0341
        L_0x0340:
            r2 = 1
        L_0x0341:
            if (r2 != 0) goto L_0x0366
            java.lang.String r2 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x0f88 }
            if (r2 != 0) goto L_0x0366
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzkr r27 = r2.zzi()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r2 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r28 = r2.zzx()     // Catch:{ all -> 0x0f88 }
            java.lang.String r31 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            r29 = 11
            java.lang.String r30 = "_ev"
            r32 = 0
            r27.zza((java.lang.String) r28, (int) r29, (java.lang.String) r30, (java.lang.String) r31, (int) r32)     // Catch:{ all -> 0x0f88 }
        L_0x0366:
            r32 = r10
            r30 = r11
            r27 = r15
            r14 = r18
            r2 = r20
            r13 = r21
            r11 = r22
            r4 = r26
            r10 = 3
            r16 = r6
            goto L_0x08be
        L_0x037b:
            com.google.android.gms.measurement.internal.zzfs r2 = r43.zzc()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r12 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r12 = r12.zzx()     // Catch:{ all -> 0x0f88 }
            r27 = r15
            java.lang.String r15 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            boolean r2 = r2.zzc(r12, r15)     // Catch:{ all -> 0x0f88 }
            java.lang.String r12 = "_c"
            if (r2 != 0) goto L_0x03eb
            r43.zzh()     // Catch:{ all -> 0x0f88 }
            java.lang.String r15 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r15)     // Catch:{ all -> 0x0f88 }
            r16 = r6
            int r6 = r15.hashCode()     // Catch:{ all -> 0x0f88 }
            r29 = r8
            r8 = 94660(0x171c4, float:1.32647E-40)
            if (r6 == r8) goto L_0x03c9
            r8 = 95025(0x17331, float:1.33158E-40)
            if (r6 == r8) goto L_0x03bf
            r8 = 95027(0x17333, float:1.33161E-40)
            if (r6 == r8) goto L_0x03b5
            goto L_0x03d3
        L_0x03b5:
            java.lang.String r6 = "_ui"
            boolean r6 = r15.equals(r6)     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x03d3
            r6 = 1
            goto L_0x03d4
        L_0x03bf:
            java.lang.String r6 = "_ug"
            boolean r6 = r15.equals(r6)     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x03d3
            r6 = 2
            goto L_0x03d4
        L_0x03c9:
            java.lang.String r6 = "_in"
            boolean r6 = r15.equals(r6)     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x03d3
            r6 = 0
            goto L_0x03d4
        L_0x03d3:
            r6 = -1
        L_0x03d4:
            if (r6 == 0) goto L_0x03de
            r8 = 1
            if (r6 == r8) goto L_0x03de
            r8 = 2
            if (r6 == r8) goto L_0x03de
            r6 = 0
            goto L_0x03df
        L_0x03de:
            r6 = 1
        L_0x03df:
            if (r6 == 0) goto L_0x03e2
            goto L_0x03ef
        L_0x03e2:
            r8 = r7
            r32 = r10
            r30 = r11
            r31 = r13
            goto L_0x05cc
        L_0x03eb:
            r16 = r6
            r29 = r8
        L_0x03ef:
            r30 = r11
            r6 = 0
            r8 = 0
            r15 = 0
        L_0x03f4:
            int r11 = r9.zzb()     // Catch:{ all -> 0x0f88 }
            r31 = r13
            java.lang.String r13 = "_r"
            if (r15 >= r11) goto L_0x0462
            com.google.android.gms.internal.measurement.zzcb$zze r11 = r9.zza((int) r15)     // Catch:{ all -> 0x0f88 }
            java.lang.String r11 = r11.zzb()     // Catch:{ all -> 0x0f88 }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0f88 }
            if (r11 == 0) goto L_0x042d
            com.google.android.gms.internal.measurement.zzcb$zze r6 = r9.zza((int) r15)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r6 = r6.zzbl()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r6 = (com.google.android.gms.internal.measurement.zzfo.zza) r6     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r6 = (com.google.android.gms.internal.measurement.zzcb.zze.zza) r6     // Catch:{ all -> 0x0f88 }
            r32 = r10
            r10 = 1
            com.google.android.gms.internal.measurement.zzcb$zze$zza r6 = r6.zza((long) r10)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r6 = r6.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r6 = (com.google.android.gms.internal.measurement.zzfo) r6     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r6 = (com.google.android.gms.internal.measurement.zzcb.zze) r6     // Catch:{ all -> 0x0f88 }
            r9.zza((int) r15, (com.google.android.gms.internal.measurement.zzcb.zze) r6)     // Catch:{ all -> 0x0f88 }
            r6 = 1
            goto L_0x045b
        L_0x042d:
            r32 = r10
            com.google.android.gms.internal.measurement.zzcb$zze r10 = r9.zza((int) r15)     // Catch:{ all -> 0x0f88 }
            java.lang.String r10 = r10.zzb()     // Catch:{ all -> 0x0f88 }
            boolean r10 = r13.equals(r10)     // Catch:{ all -> 0x0f88 }
            if (r10 == 0) goto L_0x045b
            com.google.android.gms.internal.measurement.zzcb$zze r8 = r9.zza((int) r15)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r8 = r8.zzbl()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r8 = (com.google.android.gms.internal.measurement.zzfo.zza) r8     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r8 = (com.google.android.gms.internal.measurement.zzcb.zze.zza) r8     // Catch:{ all -> 0x0f88 }
            r10 = 1
            com.google.android.gms.internal.measurement.zzcb$zze$zza r8 = r8.zza((long) r10)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r8 = r8.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r8 = (com.google.android.gms.internal.measurement.zzfo) r8     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r8 = (com.google.android.gms.internal.measurement.zzcb.zze) r8     // Catch:{ all -> 0x0f88 }
            r9.zza((int) r15, (com.google.android.gms.internal.measurement.zzcb.zze) r8)     // Catch:{ all -> 0x0f88 }
            r8 = 1
        L_0x045b:
            int r15 = r15 + 1
            r13 = r31
            r10 = r32
            goto L_0x03f4
        L_0x0462:
            r32 = r10
            if (r6 != 0) goto L_0x0496
            if (r2 == 0) goto L_0x0496
            com.google.android.gms.measurement.internal.zzfy r6 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r6 = r6.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzx()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfy r10 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzes r10 = r10.zzj()     // Catch:{ all -> 0x0f88 }
            java.lang.String r11 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            java.lang.String r10 = r10.zza((java.lang.String) r11)     // Catch:{ all -> 0x0f88 }
            java.lang.String r11 = "Marking event as conversion"
            r6.zza(r11, r10)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r6 = com.google.android.gms.internal.measurement.zzcb.zze.zzm()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r6 = r6.zza((java.lang.String) r12)     // Catch:{ all -> 0x0f88 }
            r10 = 1
            com.google.android.gms.internal.measurement.zzcb$zze$zza r6 = r6.zza((long) r10)     // Catch:{ all -> 0x0f88 }
            r9.zza((com.google.android.gms.internal.measurement.zzcb.zze.zza) r6)     // Catch:{ all -> 0x0f88 }
        L_0x0496:
            if (r8 != 0) goto L_0x04c6
            com.google.android.gms.measurement.internal.zzfy r6 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r6 = r6.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzx()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzes r8 = r8.zzj()     // Catch:{ all -> 0x0f88 }
            java.lang.String r10 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            java.lang.String r8 = r8.zza((java.lang.String) r10)     // Catch:{ all -> 0x0f88 }
            java.lang.String r10 = "Marking event as real-time"
            r6.zza(r10, r8)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r6 = com.google.android.gms.internal.measurement.zzcb.zze.zzm()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r6 = r6.zza((java.lang.String) r13)     // Catch:{ all -> 0x0f88 }
            r10 = 1
            com.google.android.gms.internal.measurement.zzcb$zze$zza r6 = r6.zza((long) r10)     // Catch:{ all -> 0x0f88 }
            r9.zza((com.google.android.gms.internal.measurement.zzcb.zze.zza) r6)     // Catch:{ all -> 0x0f88 }
        L_0x04c6:
            com.google.android.gms.measurement.internal.zzad r33 = r43.zze()     // Catch:{ all -> 0x0f88 }
            long r34 = r43.zzx()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r6 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r36 = r6.zzx()     // Catch:{ all -> 0x0f88 }
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 1
            com.google.android.gms.measurement.internal.zzac r6 = r33.zza(r34, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0f88 }
            long r10 = r6.zze     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfy r6 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzy r6 = r6.zzb()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r8 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r8 = r8.zzx()     // Catch:{ all -> 0x0f88 }
            int r6 = r6.zzc(r8)     // Catch:{ all -> 0x0f88 }
            r8 = r7
            long r6 = (long) r6     // Catch:{ all -> 0x0f88 }
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x04fe
            zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9, (java.lang.String) r13)     // Catch:{ all -> 0x0f88 }
            goto L_0x0500
        L_0x04fe:
            r18 = 1
        L_0x0500:
            java.lang.String r6 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            boolean r6 = com.google.android.gms.measurement.internal.zzkr.zza((java.lang.String) r6)     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x05cc
            if (r2 == 0) goto L_0x05cc
            com.google.android.gms.measurement.internal.zzad r33 = r43.zze()     // Catch:{ all -> 0x0f88 }
            long r34 = r43.zzx()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r6 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r36 = r6.zzx()     // Catch:{ all -> 0x0f88 }
            r37 = 0
            r38 = 0
            r39 = 1
            r40 = 0
            r41 = 0
            com.google.android.gms.measurement.internal.zzac r6 = r33.zza(r34, r36, r37, r38, r39, r40, r41)     // Catch:{ all -> 0x0f88 }
            long r6 = r6.zzc     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfy r10 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzy r10 = r10.zzb()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r11 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r11 = r11.zzx()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.zzaq.zzm     // Catch:{ all -> 0x0f88 }
            int r10 = r10.zzb(r11, r13)     // Catch:{ all -> 0x0f88 }
            long r10 = (long) r10     // Catch:{ all -> 0x0f88 }
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x05cc
            com.google.android.gms.measurement.internal.zzfy r6 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r6 = r6.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzi()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r7 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0f88 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r7)     // Catch:{ all -> 0x0f88 }
            java.lang.String r10 = "Too many conversions. Not logging as conversion. appId"
            r6.zza(r10, r7)     // Catch:{ all -> 0x0f88 }
            r6 = -1
            r7 = 0
            r10 = 0
            r11 = 0
        L_0x055e:
            int r13 = r9.zzb()     // Catch:{ all -> 0x0f88 }
            if (r11 >= r13) goto L_0x058b
            com.google.android.gms.internal.measurement.zzcb$zze r13 = r9.zza((int) r11)     // Catch:{ all -> 0x0f88 }
            java.lang.String r15 = r13.zzb()     // Catch:{ all -> 0x0f88 }
            boolean r15 = r12.equals(r15)     // Catch:{ all -> 0x0f88 }
            if (r15 == 0) goto L_0x057d
            com.google.android.gms.internal.measurement.zzfo$zza r6 = r13.zzbl()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r6 = (com.google.android.gms.internal.measurement.zzfo.zza) r6     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r6 = (com.google.android.gms.internal.measurement.zzcb.zze.zza) r6     // Catch:{ all -> 0x0f88 }
            r7 = r6
            r6 = r11
            goto L_0x0588
        L_0x057d:
            java.lang.String r13 = r13.zzb()     // Catch:{ all -> 0x0f88 }
            boolean r13 = r3.equals(r13)     // Catch:{ all -> 0x0f88 }
            if (r13 == 0) goto L_0x0588
            r10 = 1
        L_0x0588:
            int r11 = r11 + 1
            goto L_0x055e
        L_0x058b:
            if (r10 == 0) goto L_0x0593
            if (r7 == 0) goto L_0x0593
            r9.zzb((int) r6)     // Catch:{ all -> 0x0f88 }
            goto L_0x05cc
        L_0x0593:
            if (r7 == 0) goto L_0x05b3
            java.lang.Object r7 = r7.clone()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r7 = (com.google.android.gms.internal.measurement.zzfo.zza) r7     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r7 = (com.google.android.gms.internal.measurement.zzcb.zze.zza) r7     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze$zza r3 = r7.zza((java.lang.String) r3)     // Catch:{ all -> 0x0f88 }
            r10 = 10
            com.google.android.gms.internal.measurement.zzcb$zze$zza r3 = r3.zza((long) r10)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r3 = r3.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r3 = (com.google.android.gms.internal.measurement.zzfo) r3     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r3 = (com.google.android.gms.internal.measurement.zzcb.zze) r3     // Catch:{ all -> 0x0f88 }
            r9.zza((int) r6, (com.google.android.gms.internal.measurement.zzcb.zze) r3)     // Catch:{ all -> 0x0f88 }
            goto L_0x05cc
        L_0x05b3:
            com.google.android.gms.measurement.internal.zzfy r3 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r3 = r3.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzf()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r6 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0f88 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r6)     // Catch:{ all -> 0x0f88 }
            java.lang.String r7 = "Did not find conversion parameter. appId"
            r3.zza(r7, r6)     // Catch:{ all -> 0x0f88 }
        L_0x05cc:
            if (r2 == 0) goto L_0x0690
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0f88 }
            java.util.List r3 = r9.zza()     // Catch:{ all -> 0x0f88 }
            r2.<init>(r3)     // Catch:{ all -> 0x0f88 }
            r3 = 0
            r6 = -1
            r7 = -1
        L_0x05da:
            int r10 = r2.size()     // Catch:{ all -> 0x0f88 }
            java.lang.String r11 = "currency"
            java.lang.String r13 = "value"
            if (r3 >= r10) goto L_0x060b
            java.lang.Object r10 = r2.get(r3)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r10 = (com.google.android.gms.internal.measurement.zzcb.zze) r10     // Catch:{ all -> 0x0f88 }
            java.lang.String r10 = r10.zzb()     // Catch:{ all -> 0x0f88 }
            boolean r10 = r13.equals(r10)     // Catch:{ all -> 0x0f88 }
            if (r10 == 0) goto L_0x05f7
            r6 = r3
            goto L_0x0608
        L_0x05f7:
            java.lang.Object r10 = r2.get(r3)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r10 = (com.google.android.gms.internal.measurement.zzcb.zze) r10     // Catch:{ all -> 0x0f88 }
            java.lang.String r10 = r10.zzb()     // Catch:{ all -> 0x0f88 }
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x0f88 }
            if (r10 == 0) goto L_0x0608
            r7 = r3
        L_0x0608:
            int r3 = r3 + 1
            goto L_0x05da
        L_0x060b:
            r3 = -1
            if (r6 == r3) goto L_0x0691
            java.lang.Object r3 = r2.get(r6)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r3 = (com.google.android.gms.internal.measurement.zzcb.zze) r3     // Catch:{ all -> 0x0f88 }
            boolean r3 = r3.zze()     // Catch:{ all -> 0x0f88 }
            if (r3 != 0) goto L_0x0641
            java.lang.Object r3 = r2.get(r6)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r3 = (com.google.android.gms.internal.measurement.zzcb.zze) r3     // Catch:{ all -> 0x0f88 }
            boolean r3 = r3.zzi()     // Catch:{ all -> 0x0f88 }
            if (r3 != 0) goto L_0x0641
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzk()     // Catch:{ all -> 0x0f88 }
            java.lang.String r3 = "Value must be specified with a numeric type."
            r2.zza(r3)     // Catch:{ all -> 0x0f88 }
            r9.zzb((int) r6)     // Catch:{ all -> 0x0f88 }
            zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9, (java.lang.String) r12)     // Catch:{ all -> 0x0f88 }
            r2 = 18
            zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9, (int) r2, (java.lang.String) r13)     // Catch:{ all -> 0x0f88 }
            goto L_0x0690
        L_0x0641:
            r3 = -1
            if (r7 != r3) goto L_0x0647
            r2 = 1
            r10 = 3
            goto L_0x0673
        L_0x0647:
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r2 = (com.google.android.gms.internal.measurement.zzcb.zze) r2     // Catch:{ all -> 0x0f88 }
            java.lang.String r2 = r2.zzd()     // Catch:{ all -> 0x0f88 }
            int r7 = r2.length()     // Catch:{ all -> 0x0f88 }
            r10 = 3
            if (r7 == r10) goto L_0x0659
            goto L_0x066a
        L_0x0659:
            r7 = 0
        L_0x065a:
            int r13 = r2.length()     // Catch:{ all -> 0x0f88 }
            if (r7 >= r13) goto L_0x0672
            int r13 = r2.codePointAt(r7)     // Catch:{ all -> 0x0f88 }
            boolean r15 = java.lang.Character.isLetter(r13)     // Catch:{ all -> 0x0f88 }
            if (r15 != 0) goto L_0x066c
        L_0x066a:
            r2 = 1
            goto L_0x0673
        L_0x066c:
            int r13 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x0f88 }
            int r7 = r7 + r13
            goto L_0x065a
        L_0x0672:
            r2 = 0
        L_0x0673:
            if (r2 == 0) goto L_0x0692
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzk()     // Catch:{ all -> 0x0f88 }
            java.lang.String r7 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.zza(r7)     // Catch:{ all -> 0x0f88 }
            r9.zzb((int) r6)     // Catch:{ all -> 0x0f88 }
            zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9, (java.lang.String) r12)     // Catch:{ all -> 0x0f88 }
            r2 = 19
            zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9, (int) r2, (java.lang.String) r11)     // Catch:{ all -> 0x0f88 }
            goto L_0x0692
        L_0x0690:
            r3 = -1
        L_0x0691:
            r10 = 3
        L_0x0692:
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.zzb()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r6 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r6 = r6.zzx()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzaq.zzat     // Catch:{ all -> 0x0f88 }
            boolean r2 = r2.zze(r6, r7)     // Catch:{ all -> 0x0f88 }
            if (r2 == 0) goto L_0x083c
            java.lang.String r2 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0f88 }
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x0701
            r43.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r2 = r9.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r2 = (com.google.android.gms.internal.measurement.zzcb.zzc) r2     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r2 = com.google.android.gms.measurement.internal.zzkn.zza((com.google.android.gms.internal.measurement.zzcb.zzc) r2, (java.lang.String) r14)     // Catch:{ all -> 0x0f88 }
            if (r2 != 0) goto L_0x06fb
            if (r32 == 0) goto L_0x06ee
            long r11 = r32.zzf()     // Catch:{ all -> 0x0f88 }
            long r13 = r9.zzf()     // Catch:{ all -> 0x0f88 }
            long r11 = r11 - r13
            long r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0f88 }
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x06ee
            java.lang.Object r2 = r32.clone()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r2 = (com.google.android.gms.internal.measurement.zzfo.zza) r2     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2     // Catch:{ all -> 0x0f88 }
            boolean r6 = r1.zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9, (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2)     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x06ee
            r11 = r22
            r11.zza((int) r8, (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2)     // Catch:{ all -> 0x0f88 }
            r6 = r29
            r12 = r31
            goto L_0x0749
        L_0x06ee:
            r11 = r22
            r7 = r8
            r30 = r9
            r8 = r20
            r13 = r21
            r12 = r31
            goto L_0x0846
        L_0x06fb:
            r11 = r22
            r13 = r21
            goto L_0x0840
        L_0x0701:
            r11 = r22
            java.lang.String r2 = "_vs"
            java.lang.String r12 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0f88 }
            if (r2 == 0) goto L_0x0760
            r43.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r2 = r9.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r2 = (com.google.android.gms.internal.measurement.zzcb.zzc) r2     // Catch:{ all -> 0x0f88 }
            r12 = r31
            com.google.android.gms.internal.measurement.zzcb$zze r2 = com.google.android.gms.measurement.internal.zzkn.zza((com.google.android.gms.internal.measurement.zzcb.zzc) r2, (java.lang.String) r12)     // Catch:{ all -> 0x0f88 }
            if (r2 != 0) goto L_0x075a
            if (r30 == 0) goto L_0x074f
            long r13 = r30.zzf()     // Catch:{ all -> 0x0f88 }
            long r22 = r9.zzf()     // Catch:{ all -> 0x0f88 }
            long r13 = r13 - r22
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0f88 }
            int r2 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x074f
            java.lang.Object r2 = r30.clone()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r2 = (com.google.android.gms.internal.measurement.zzfo.zza) r2     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2     // Catch:{ all -> 0x0f88 }
            boolean r6 = r1.zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2, (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9)     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x074f
            r6 = r29
            r11.zza((int) r6, (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2)     // Catch:{ all -> 0x0f88 }
        L_0x0749:
            r13 = r21
            r32 = 0
            goto L_0x0838
        L_0x074f:
            r6 = r29
            r8 = r6
            r32 = r9
            r7 = r20
            r13 = r21
            goto L_0x0846
        L_0x075a:
            r6 = r29
        L_0x075c:
            r13 = r21
            goto L_0x0844
        L_0x0760:
            r6 = r29
            r12 = r31
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.zzb()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r7 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r7 = r7.zzx()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.zzaq.zzbr     // Catch:{ all -> 0x0f88 }
            boolean r2 = r2.zze(r7, r13)     // Catch:{ all -> 0x0f88 }
            if (r2 == 0) goto L_0x075c
            java.lang.String r2 = "_ab"
            java.lang.String r7 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            boolean r2 = r2.equals(r7)     // Catch:{ all -> 0x0f88 }
            if (r2 == 0) goto L_0x075c
            r43.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r2 = r9.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r2 = (com.google.android.gms.internal.measurement.zzcb.zzc) r2     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r2 = com.google.android.gms.measurement.internal.zzkn.zza((com.google.android.gms.internal.measurement.zzcb.zzc) r2, (java.lang.String) r12)     // Catch:{ all -> 0x0f88 }
            if (r2 != 0) goto L_0x075c
            if (r30 == 0) goto L_0x075c
            long r13 = r30.zzf()     // Catch:{ all -> 0x0f88 }
            long r22 = r9.zzf()     // Catch:{ all -> 0x0f88 }
            long r13 = r13 - r22
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0f88 }
            r22 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r2 > 0) goto L_0x075c
            java.lang.Object r2 = r30.clone()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo$zza r2 = (com.google.android.gms.internal.measurement.zzfo.zza) r2     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r2 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2     // Catch:{ all -> 0x0f88 }
            r1.zzb((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2, (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9)     // Catch:{ all -> 0x0f88 }
            java.lang.String r7 = r2.zzd()     // Catch:{ all -> 0x0f88 }
            boolean r7 = r4.equals(r7)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r7)     // Catch:{ all -> 0x0f88 }
            r43.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r7 = r2.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r7 = (com.google.android.gms.internal.measurement.zzfo) r7     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r7 = (com.google.android.gms.internal.measurement.zzcb.zzc) r7     // Catch:{ all -> 0x0f88 }
            r13 = r21
            com.google.android.gms.internal.measurement.zzcb$zze r7 = com.google.android.gms.measurement.internal.zzkn.zza((com.google.android.gms.internal.measurement.zzcb.zzc) r7, (java.lang.String) r13)     // Catch:{ all -> 0x0f88 }
            r43.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r14 = r2.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r14 = (com.google.android.gms.internal.measurement.zzfo) r14     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r14 = (com.google.android.gms.internal.measurement.zzcb.zzc) r14     // Catch:{ all -> 0x0f88 }
            java.lang.String r15 = "_sc"
            com.google.android.gms.internal.measurement.zzcb$zze r14 = com.google.android.gms.measurement.internal.zzkn.zza((com.google.android.gms.internal.measurement.zzcb.zzc) r14, (java.lang.String) r15)     // Catch:{ all -> 0x0f88 }
            r43.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r15 = r2.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r15 = (com.google.android.gms.internal.measurement.zzfo) r15     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r15 = (com.google.android.gms.internal.measurement.zzcb.zzc) r15     // Catch:{ all -> 0x0f88 }
            java.lang.String r3 = "_si"
            com.google.android.gms.internal.measurement.zzcb$zze r3 = com.google.android.gms.measurement.internal.zzkn.zza((com.google.android.gms.internal.measurement.zzcb.zzc) r15, (java.lang.String) r3)     // Catch:{ all -> 0x0f88 }
            if (r7 == 0) goto L_0x07fb
            java.lang.String r7 = r7.zzd()     // Catch:{ all -> 0x0f88 }
            goto L_0x07fd
        L_0x07fb:
            r7 = r25
        L_0x07fd:
            boolean r15 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0f88 }
            if (r15 != 0) goto L_0x080a
            com.google.android.gms.measurement.internal.zzkn r15 = r43.zzh()     // Catch:{ all -> 0x0f88 }
            r15.zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9, (java.lang.String) r13, (java.lang.Object) r7)     // Catch:{ all -> 0x0f88 }
        L_0x080a:
            if (r14 == 0) goto L_0x0811
            java.lang.String r7 = r14.zzd()     // Catch:{ all -> 0x0f88 }
            goto L_0x0813
        L_0x0811:
            r7 = r25
        L_0x0813:
            boolean r14 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0f88 }
            if (r14 != 0) goto L_0x0822
            com.google.android.gms.measurement.internal.zzkn r14 = r43.zzh()     // Catch:{ all -> 0x0f88 }
            java.lang.String r15 = "_sc"
            r14.zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9, (java.lang.String) r15, (java.lang.Object) r7)     // Catch:{ all -> 0x0f88 }
        L_0x0822:
            if (r3 == 0) goto L_0x0835
            com.google.android.gms.measurement.internal.zzkn r7 = r43.zzh()     // Catch:{ all -> 0x0f88 }
            java.lang.String r14 = "_si"
            long r21 = r3.zzf()     // Catch:{ all -> 0x0f88 }
            java.lang.Long r3 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0f88 }
            r7.zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9, (java.lang.String) r14, (java.lang.Object) r3)     // Catch:{ all -> 0x0f88 }
        L_0x0835:
            r11.zza((int) r6, (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r2)     // Catch:{ all -> 0x0f88 }
        L_0x0838:
            r7 = r8
            r30 = 0
            goto L_0x0845
        L_0x083c:
            r13 = r21
            r11 = r22
        L_0x0840:
            r6 = r29
            r12 = r31
        L_0x0844:
            r7 = r8
        L_0x0845:
            r8 = r6
        L_0x0846:
            if (r16 != 0) goto L_0x08a8
            java.lang.String r2 = r9.zzd()     // Catch:{ all -> 0x0f88 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0f88 }
            if (r2 == 0) goto L_0x08a8
            int r2 = r9.zzb()     // Catch:{ all -> 0x0f88 }
            if (r2 != 0) goto L_0x0872
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzi()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r3 = r3.zzx()     // Catch:{ all -> 0x0f88 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r3)     // Catch:{ all -> 0x0f88 }
            java.lang.String r4 = "Engagement event does not contain any parameters. appId"
            r2.zza(r4, r3)     // Catch:{ all -> 0x0f88 }
            goto L_0x08a8
        L_0x0872:
            com.google.android.gms.measurement.internal.zzkn r2 = r43.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r3 = r9.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r3 = (com.google.android.gms.internal.measurement.zzfo) r3     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r3 = (com.google.android.gms.internal.measurement.zzcb.zzc) r3     // Catch:{ all -> 0x0f88 }
            java.lang.Object r2 = r2.zzb(r3, r12)     // Catch:{ all -> 0x0f88 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0f88 }
            if (r2 != 0) goto L_0x08a0
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzi()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r3 = r3.zzx()     // Catch:{ all -> 0x0f88 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r3)     // Catch:{ all -> 0x0f88 }
            java.lang.String r4 = "Engagement event does not include duration. appId"
            r2.zza(r4, r3)     // Catch:{ all -> 0x0f88 }
            goto L_0x08a8
        L_0x08a0:
            long r2 = r2.longValue()     // Catch:{ all -> 0x0f88 }
            long r2 = r27 + r2
            r27 = r2
        L_0x08a8:
            java.util.List<com.google.android.gms.internal.measurement.zzcb$zzc> r2 = r5.zzc     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r3 = r9.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r3 = (com.google.android.gms.internal.measurement.zzfo) r3     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r3 = (com.google.android.gms.internal.measurement.zzcb.zzc) r3     // Catch:{ all -> 0x0f88 }
            r4 = r26
            r2.set(r4, r3)     // Catch:{ all -> 0x0f88 }
            int r2 = r20 + 1
            r11.zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r9)     // Catch:{ all -> 0x0f88 }
            r14 = r18
        L_0x08be:
            int r12 = r4 + 1
            r3 = r11
            r6 = r16
            r4 = r19
            r15 = r27
            r11 = r30
            r10 = r32
            r42 = r13
            r13 = r2
            r2 = r42
            goto L_0x02b6
        L_0x08d2:
            r12 = r13
            r27 = r15
            r11 = r22
            r16 = r6
            if (r16 == 0) goto L_0x0930
            r13 = r20
            r15 = r27
            r2 = 0
        L_0x08e0:
            if (r2 >= r13) goto L_0x092e
            com.google.android.gms.internal.measurement.zzcb$zzc r3 = r11.zzb((int) r2)     // Catch:{ all -> 0x0f88 }
            java.lang.String r6 = r3.zzc()     // Catch:{ all -> 0x0f88 }
            boolean r6 = r4.equals(r6)     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x0901
            r43.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r6 = com.google.android.gms.measurement.internal.zzkn.zza((com.google.android.gms.internal.measurement.zzcb.zzc) r3, (java.lang.String) r14)     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x0901
            r11.zzc((int) r2)     // Catch:{ all -> 0x0f88 }
            int r13 = r13 + -1
            int r2 = r2 + -1
            goto L_0x092b
        L_0x0901:
            r43.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r3 = com.google.android.gms.measurement.internal.zzkn.zza((com.google.android.gms.internal.measurement.zzcb.zzc) r3, (java.lang.String) r12)     // Catch:{ all -> 0x0f88 }
            if (r3 == 0) goto L_0x092b
            boolean r6 = r3.zze()     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x0919
            long r6 = r3.zzf()     // Catch:{ all -> 0x0f88 }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0f88 }
            goto L_0x091a
        L_0x0919:
            r3 = 0
        L_0x091a:
            if (r3 == 0) goto L_0x092b
            long r6 = r3.longValue()     // Catch:{ all -> 0x0f88 }
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x092b
            long r6 = r3.longValue()     // Catch:{ all -> 0x0f88 }
            long r15 = r15 + r6
        L_0x092b:
            r3 = 1
            int r2 = r2 + r3
            goto L_0x08e0
        L_0x092e:
            r2 = r15
            goto L_0x0932
        L_0x0930:
            r2 = r27
        L_0x0932:
            r4 = 0
            r1.zza((com.google.android.gms.internal.measurement.zzcb.zzg.zza) r11, (long) r2, (boolean) r4)     // Catch:{ all -> 0x0f88 }
            java.util.List r4 = r11.zza()     // Catch:{ all -> 0x0f88 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0f88 }
        L_0x093e:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x0958
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r6 = (com.google.android.gms.internal.measurement.zzcb.zzc) r6     // Catch:{ all -> 0x0f88 }
            java.lang.String r7 = "_s"
            java.lang.String r6 = r6.zzc()     // Catch:{ all -> 0x0f88 }
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x093e
            r4 = 1
            goto L_0x0959
        L_0x0958:
            r4 = 0
        L_0x0959:
            java.lang.String r6 = "_se"
            if (r4 == 0) goto L_0x0968
            com.google.android.gms.measurement.internal.zzad r4 = r43.zze()     // Catch:{ all -> 0x0f88 }
            java.lang.String r7 = r11.zzj()     // Catch:{ all -> 0x0f88 }
            r4.zzb((java.lang.String) r7, (java.lang.String) r6)     // Catch:{ all -> 0x0f88 }
        L_0x0968:
            java.lang.String r4 = "_sid"
            int r4 = com.google.android.gms.measurement.internal.zzkn.zza((com.google.android.gms.internal.measurement.zzcb.zzg.zza) r11, (java.lang.String) r4)     // Catch:{ all -> 0x0f88 }
            if (r4 < 0) goto L_0x0972
            r4 = 1
            goto L_0x0973
        L_0x0972:
            r4 = 0
        L_0x0973:
            if (r4 == 0) goto L_0x097a
            r4 = 1
            r1.zza((com.google.android.gms.internal.measurement.zzcb.zzg.zza) r11, (long) r2, (boolean) r4)     // Catch:{ all -> 0x0f88 }
            goto L_0x099c
        L_0x097a:
            int r2 = com.google.android.gms.measurement.internal.zzkn.zza((com.google.android.gms.internal.measurement.zzcb.zzg.zza) r11, (java.lang.String) r6)     // Catch:{ all -> 0x0f88 }
            if (r2 < 0) goto L_0x099c
            r11.zze((int) r2)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzf()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r3 = r3.zzx()     // Catch:{ all -> 0x0f88 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r3)     // Catch:{ all -> 0x0f88 }
            java.lang.String r4 = "Session engagement user property is in the bundle without session ID. appId"
            r2.zza(r4, r3)     // Catch:{ all -> 0x0f88 }
        L_0x099c:
            com.google.android.gms.measurement.internal.zzkn r2 = r43.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r3 = r2.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzx()     // Catch:{ all -> 0x0f88 }
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.zza(r4)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfs r3 = r2.zzj()     // Catch:{ all -> 0x0f88 }
            java.lang.String r4 = r11.zzj()     // Catch:{ all -> 0x0f88 }
            boolean r3 = r3.zze(r4)     // Catch:{ all -> 0x0f88 }
            if (r3 == 0) goto L_0x0a2d
            com.google.android.gms.measurement.internal.zzad r3 = r2.zzi()     // Catch:{ all -> 0x0f88 }
            java.lang.String r4 = r11.zzj()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzf r3 = r3.zzb(r4)     // Catch:{ all -> 0x0f88 }
            if (r3 == 0) goto L_0x0a2d
            boolean r3 = r3.zzaf()     // Catch:{ all -> 0x0f88 }
            if (r3 == 0) goto L_0x0a2d
            com.google.android.gms.measurement.internal.zzai r3 = r2.zzl()     // Catch:{ all -> 0x0f88 }
            boolean r3 = r3.zzj()     // Catch:{ all -> 0x0f88 }
            if (r3 == 0) goto L_0x0a2d
            com.google.android.gms.measurement.internal.zzeu r3 = r2.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzw()     // Catch:{ all -> 0x0f88 }
            java.lang.String r4 = "Turning off ad personalization due to account type"
            r3.zza(r4)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzk$zza r3 = com.google.android.gms.internal.measurement.zzcb.zzk.zzj()     // Catch:{ all -> 0x0f88 }
            r4 = r19
            com.google.android.gms.internal.measurement.zzcb$zzk$zza r3 = r3.zza((java.lang.String) r4)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzai r2 = r2.zzl()     // Catch:{ all -> 0x0f88 }
            long r6 = r2.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzk$zza r2 = r3.zza((long) r6)     // Catch:{ all -> 0x0f88 }
            r6 = 1
            com.google.android.gms.internal.measurement.zzcb$zzk$zza r2 = r2.zzb((long) r6)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r2 = r2.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzk r2 = (com.google.android.gms.internal.measurement.zzcb.zzk) r2     // Catch:{ all -> 0x0f88 }
            r3 = 0
        L_0x0a0b:
            int r6 = r11.zze()     // Catch:{ all -> 0x0f88 }
            if (r3 >= r6) goto L_0x0a27
            com.google.android.gms.internal.measurement.zzcb$zzk r6 = r11.zzd((int) r3)     // Catch:{ all -> 0x0f88 }
            java.lang.String r6 = r6.zzc()     // Catch:{ all -> 0x0f88 }
            boolean r6 = r4.equals(r6)     // Catch:{ all -> 0x0f88 }
            if (r6 == 0) goto L_0x0a24
            r11.zza((int) r3, (com.google.android.gms.internal.measurement.zzcb.zzk) r2)     // Catch:{ all -> 0x0f88 }
            r3 = 1
            goto L_0x0a28
        L_0x0a24:
            int r3 = r3 + 1
            goto L_0x0a0b
        L_0x0a27:
            r3 = 0
        L_0x0a28:
            if (r3 != 0) goto L_0x0a2d
            r11.zza((com.google.android.gms.internal.measurement.zzcb.zzk) r2)     // Catch:{ all -> 0x0f88 }
        L_0x0a2d:
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.zzb()     // Catch:{ all -> 0x0f88 }
            java.lang.String r3 = r11.zzj()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzaq.zzbm     // Catch:{ all -> 0x0f88 }
            boolean r2 = r2.zze(r3, r4)     // Catch:{ all -> 0x0f88 }
            if (r2 == 0) goto L_0x0a42
            zza((com.google.android.gms.internal.measurement.zzcb.zzg.zza) r11)     // Catch:{ all -> 0x0f88 }
        L_0x0a42:
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r2 = r11.zzm()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzo r12 = r43.zzf()     // Catch:{ all -> 0x0f88 }
            java.lang.String r13 = r11.zzj()     // Catch:{ all -> 0x0f88 }
            java.util.List r14 = r11.zza()     // Catch:{ all -> 0x0f88 }
            java.util.List r15 = r11.zzd()     // Catch:{ all -> 0x0f88 }
            long r3 = r11.zzf()     // Catch:{ all -> 0x0f88 }
            long r6 = r11.zzg()     // Catch:{ all -> 0x0f88 }
            java.lang.Long r16 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0f88 }
            java.lang.Long r17 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0f88 }
            java.util.List r3 = r12.zza(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0f88 }
            r2.zzc((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzcb.zza>) r3)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.zzb()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r3 = r3.zzx()     // Catch:{ all -> 0x0f88 }
            boolean r2 = r2.zzh(r3)     // Catch:{ all -> 0x0f88 }
            if (r2 == 0) goto L_0x0dc8
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0dc1 }
            r2.<init>()     // Catch:{ all -> 0x0dc1 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0dc1 }
            r3.<init>()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzfy r4 = r1.zzj     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzkr r4 = r4.zzi()     // Catch:{ all -> 0x0dc1 }
            java.security.SecureRandom r4 = r4.zzh()     // Catch:{ all -> 0x0dc1 }
            r6 = 0
        L_0x0a94:
            int r7 = r11.zzb()     // Catch:{ all -> 0x0dc1 }
            if (r6 >= r7) goto L_0x0d8b
            com.google.android.gms.internal.measurement.zzcb$zzc r7 = r11.zzb((int) r6)     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzfo$zza r7 = r7.zzbl()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzfo$zza r7 = (com.google.android.gms.internal.measurement.zzfo.zza) r7     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzcb$zzc$zza r7 = (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r7     // Catch:{ all -> 0x0dc1 }
            java.lang.String r8 = r7.zzd()     // Catch:{ all -> 0x0dc1 }
            java.lang.String r9 = "_ep"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0dc1 }
            java.lang.String r9 = "_sr"
            if (r8 == 0) goto L_0x0b25
            com.google.android.gms.measurement.internal.zzkn r8 = r43.zzh()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r10 = r7.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r10 = (com.google.android.gms.internal.measurement.zzfo) r10     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r10 = (com.google.android.gms.internal.measurement.zzcb.zzc) r10     // Catch:{ all -> 0x0f88 }
            java.lang.String r12 = "_en"
            java.lang.Object r8 = r8.zzb(r10, r12)     // Catch:{ all -> 0x0f88 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0f88 }
            java.lang.Object r10 = r2.get(r8)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzak r10 = (com.google.android.gms.measurement.internal.zzak) r10     // Catch:{ all -> 0x0f88 }
            if (r10 != 0) goto L_0x0ae1
            com.google.android.gms.measurement.internal.zzad r10 = r43.zze()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r12 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r12 = r12.zzx()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzak r10 = r10.zza((java.lang.String) r12, (java.lang.String) r8)     // Catch:{ all -> 0x0f88 }
            r2.put(r8, r10)     // Catch:{ all -> 0x0f88 }
        L_0x0ae1:
            java.lang.Long r8 = r10.zzi     // Catch:{ all -> 0x0f88 }
            if (r8 != 0) goto L_0x0b20
            java.lang.Long r8 = r10.zzj     // Catch:{ all -> 0x0f88 }
            long r12 = r8.longValue()     // Catch:{ all -> 0x0f88 }
            r14 = 1
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x0afa
            com.google.android.gms.measurement.internal.zzkn r8 = r43.zzh()     // Catch:{ all -> 0x0f88 }
            java.lang.Long r12 = r10.zzj     // Catch:{ all -> 0x0f88 }
            r8.zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r7, (java.lang.String) r9, (java.lang.Object) r12)     // Catch:{ all -> 0x0f88 }
        L_0x0afa:
            java.lang.Boolean r8 = r10.zzk     // Catch:{ all -> 0x0f88 }
            if (r8 == 0) goto L_0x0b15
            java.lang.Boolean r8 = r10.zzk     // Catch:{ all -> 0x0f88 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0f88 }
            if (r8 == 0) goto L_0x0b15
            com.google.android.gms.measurement.internal.zzkn r8 = r43.zzh()     // Catch:{ all -> 0x0f88 }
            java.lang.String r9 = "_efs"
            r12 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0f88 }
            r8.zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r7, (java.lang.String) r9, (java.lang.Object) r10)     // Catch:{ all -> 0x0f88 }
        L_0x0b15:
            com.google.android.gms.internal.measurement.zzgw r8 = r7.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r8 = (com.google.android.gms.internal.measurement.zzfo) r8     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r8 = (com.google.android.gms.internal.measurement.zzcb.zzc) r8     // Catch:{ all -> 0x0f88 }
            r3.add(r8)     // Catch:{ all -> 0x0f88 }
        L_0x0b20:
            r11.zza((int) r6, (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r7)     // Catch:{ all -> 0x0f88 }
            goto L_0x0ca2
        L_0x0b25:
            com.google.android.gms.measurement.internal.zzfs r8 = r43.zzc()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzcb$zzg r10 = r5.zza     // Catch:{ all -> 0x0dc1 }
            java.lang.String r10 = r10.zzx()     // Catch:{ all -> 0x0dc1 }
            long r12 = r8.zzf(r10)     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzfy r8 = r1.zzj     // Catch:{ all -> 0x0dc1 }
            r8.zzi()     // Catch:{ all -> 0x0dc1 }
            long r14 = r7.zzf()     // Catch:{ all -> 0x0dc1 }
            long r14 = com.google.android.gms.measurement.internal.zzkr.zza((long) r14, (long) r12)     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzgw r8 = r7.zzv()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzfo r8 = (com.google.android.gms.internal.measurement.zzfo) r8     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzcb$zzc r8 = (com.google.android.gms.internal.measurement.zzcb.zzc) r8     // Catch:{ all -> 0x0dc1 }
            r16 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0dc1 }
            java.lang.String r16 = "_dbg"
            boolean r16 = android.text.TextUtils.isEmpty(r16)     // Catch:{ all -> 0x0dc1 }
            if (r16 != 0) goto L_0x0bb6
            if (r10 != 0) goto L_0x0b59
            goto L_0x0bb6
        L_0x0b59:
            java.util.List r8 = r8.zza()     // Catch:{ all -> 0x0f88 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0f88 }
        L_0x0b61:
            boolean r16 = r8.hasNext()     // Catch:{ all -> 0x0f88 }
            if (r16 == 0) goto L_0x0bb6
            java.lang.Object r16 = r8.next()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zze r16 = (com.google.android.gms.internal.measurement.zzcb.zze) r16     // Catch:{ all -> 0x0f88 }
            r44 = r8
            java.lang.String r8 = "_dbg"
            r19 = r12
            java.lang.String r12 = r16.zzb()     // Catch:{ all -> 0x0f88 }
            boolean r8 = r8.equals(r12)     // Catch:{ all -> 0x0f88 }
            if (r8 == 0) goto L_0x0bb1
            boolean r8 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x0f88 }
            if (r8 == 0) goto L_0x0b8f
            long r12 = r16.zzf()     // Catch:{ all -> 0x0f88 }
            java.lang.Long r8 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0f88 }
            boolean r8 = r10.equals(r8)     // Catch:{ all -> 0x0f88 }
            if (r8 != 0) goto L_0x0baf
        L_0x0b8f:
            boolean r8 = r10 instanceof java.lang.String     // Catch:{ all -> 0x0f88 }
            if (r8 == 0) goto L_0x0b9d
            java.lang.String r8 = r16.zzd()     // Catch:{ all -> 0x0f88 }
            boolean r8 = r10.equals(r8)     // Catch:{ all -> 0x0f88 }
            if (r8 != 0) goto L_0x0baf
        L_0x0b9d:
            boolean r8 = r10 instanceof java.lang.Double     // Catch:{ all -> 0x0f88 }
            if (r8 == 0) goto L_0x0bb8
            double r12 = r16.zzj()     // Catch:{ all -> 0x0f88 }
            java.lang.Double r8 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x0f88 }
            boolean r8 = r10.equals(r8)     // Catch:{ all -> 0x0f88 }
            if (r8 == 0) goto L_0x0bb8
        L_0x0baf:
            r8 = 1
            goto L_0x0bb9
        L_0x0bb1:
            r8 = r44
            r12 = r19
            goto L_0x0b61
        L_0x0bb6:
            r19 = r12
        L_0x0bb8:
            r8 = 0
        L_0x0bb9:
            if (r8 != 0) goto L_0x0bce
            com.google.android.gms.measurement.internal.zzfs r8 = r43.zzc()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r10 = r5.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r10 = r10.zzx()     // Catch:{ all -> 0x0f88 }
            java.lang.String r12 = r7.zzd()     // Catch:{ all -> 0x0f88 }
            int r8 = r8.zzd(r10, r12)     // Catch:{ all -> 0x0f88 }
            goto L_0x0bcf
        L_0x0bce:
            r8 = 1
        L_0x0bcf:
            if (r8 > 0) goto L_0x0bf8
            com.google.android.gms.measurement.internal.zzfy r9 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r9 = r9.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r9 = r9.zzi()     // Catch:{ all -> 0x0f88 }
            java.lang.String r10 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r7.zzd()     // Catch:{ all -> 0x0f88 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0f88 }
            r9.zza(r10, r12, r8)     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r8 = r7.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r8 = (com.google.android.gms.internal.measurement.zzfo) r8     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzc r8 = (com.google.android.gms.internal.measurement.zzcb.zzc) r8     // Catch:{ all -> 0x0f88 }
            r3.add(r8)     // Catch:{ all -> 0x0f88 }
            r11.zza((int) r6, (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r7)     // Catch:{ all -> 0x0f88 }
            goto L_0x0ca2
        L_0x0bf8:
            java.lang.String r10 = r7.zzd()     // Catch:{ all -> 0x0dc1 }
            java.lang.Object r10 = r2.get(r10)     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzak r10 = (com.google.android.gms.measurement.internal.zzak) r10     // Catch:{ all -> 0x0dc1 }
            if (r10 != 0) goto L_0x0c56
            com.google.android.gms.measurement.internal.zzad r10 = r43.zze()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzcb$zzg r12 = r5.zza     // Catch:{ all -> 0x0dc1 }
            java.lang.String r12 = r12.zzx()     // Catch:{ all -> 0x0dc1 }
            java.lang.String r13 = r7.zzd()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzak r10 = r10.zza((java.lang.String) r12, (java.lang.String) r13)     // Catch:{ all -> 0x0dc1 }
            if (r10 != 0) goto L_0x0c56
            com.google.android.gms.measurement.internal.zzfy r10 = r1.zzj     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzeu r10 = r10.zzr()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzew r10 = r10.zzi()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzcb$zzg r12 = r5.zza     // Catch:{ all -> 0x0dc1 }
            java.lang.String r12 = r12.zzx()     // Catch:{ all -> 0x0dc1 }
            java.lang.String r13 = r7.zzd()     // Catch:{ all -> 0x0dc1 }
            java.lang.String r1 = "Event being bundled has no eventAggregate. appId, eventName"
            r10.zza(r1, r12, r13)     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzak r10 = new com.google.android.gms.measurement.internal.zzak     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzcb$zzg r1 = r5.zza     // Catch:{ all -> 0x0dc1 }
            java.lang.String r26 = r1.zzx()     // Catch:{ all -> 0x0dc1 }
            java.lang.String r27 = r7.zzd()     // Catch:{ all -> 0x0dc1 }
            r28 = 1
            r30 = 1
            r32 = 1
            long r34 = r7.zzf()     // Catch:{ all -> 0x0dc1 }
            r36 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r25 = r10
            r25.<init>(r26, r27, r28, r30, r32, r34, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x0dc1 }
        L_0x0c56:
            com.google.android.gms.measurement.internal.zzkn r1 = r43.zzh()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzgw r12 = r7.zzv()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzfo r12 = (com.google.android.gms.internal.measurement.zzfo) r12     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzcb$zzc r12 = (com.google.android.gms.internal.measurement.zzcb.zzc) r12     // Catch:{ all -> 0x0dc1 }
            java.lang.String r13 = "_eid"
            java.lang.Object r1 = r1.zzb(r12, r13)     // Catch:{ all -> 0x0dc1 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0dc1 }
            if (r1 == 0) goto L_0x0c6e
            r12 = 1
            goto L_0x0c6f
        L_0x0c6e:
            r12 = 0
        L_0x0c6f:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0dc1 }
            r13 = 1
            if (r8 != r13) goto L_0x0ca9
            com.google.android.gms.internal.measurement.zzgw r1 = r7.zzv()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzfo r1 = (com.google.android.gms.internal.measurement.zzfo) r1     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzcb$zzc r1 = (com.google.android.gms.internal.measurement.zzcb.zzc) r1     // Catch:{ all -> 0x0dc1 }
            r3.add(r1)     // Catch:{ all -> 0x0dc1 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0dc1 }
            if (r1 == 0) goto L_0x0c9f
            java.lang.Long r1 = r10.zzi     // Catch:{ all -> 0x0dc1 }
            if (r1 != 0) goto L_0x0c93
            java.lang.Long r1 = r10.zzj     // Catch:{ all -> 0x0dc1 }
            if (r1 != 0) goto L_0x0c93
            java.lang.Boolean r1 = r10.zzk     // Catch:{ all -> 0x0dc1 }
            if (r1 == 0) goto L_0x0c9f
        L_0x0c93:
            r1 = 0
            com.google.android.gms.measurement.internal.zzak r8 = r10.zza(r1, r1, r1)     // Catch:{ all -> 0x0dc1 }
            java.lang.String r1 = r7.zzd()     // Catch:{ all -> 0x0dc1 }
            r2.put(r1, r8)     // Catch:{ all -> 0x0dc1 }
        L_0x0c9f:
            r11.zza((int) r6, (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r7)     // Catch:{ all -> 0x0dc1 }
        L_0x0ca2:
            r19 = r4
            r44 = r5
            r4 = r2
            goto L_0x0d80
        L_0x0ca9:
            int r13 = r4.nextInt(r8)     // Catch:{ all -> 0x0dc1 }
            if (r13 != 0) goto L_0x0cec
            com.google.android.gms.measurement.internal.zzkn r1 = r43.zzh()     // Catch:{ all -> 0x0dc1 }
            r13 = r4
            r44 = r5
            long r4 = (long) r8     // Catch:{ all -> 0x0dc1 }
            java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0dc1 }
            r1.zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r7, (java.lang.String) r9, (java.lang.Object) r8)     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzgw r1 = r7.zzv()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzfo r1 = (com.google.android.gms.internal.measurement.zzfo) r1     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzcb$zzc r1 = (com.google.android.gms.internal.measurement.zzcb.zzc) r1     // Catch:{ all -> 0x0dc1 }
            r3.add(r1)     // Catch:{ all -> 0x0dc1 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0dc1 }
            if (r1 == 0) goto L_0x0cd8
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0dc1 }
            r4 = 0
            com.google.android.gms.measurement.internal.zzak r10 = r10.zza(r4, r1, r4)     // Catch:{ all -> 0x0dc1 }
        L_0x0cd8:
            java.lang.String r1 = r7.zzd()     // Catch:{ all -> 0x0dc1 }
            long r4 = r7.zzf()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzak r4 = r10.zza(r4, r14)     // Catch:{ all -> 0x0dc1 }
            r2.put(r1, r4)     // Catch:{ all -> 0x0dc1 }
            r4 = r2
            r19 = r13
            goto L_0x0d7d
        L_0x0cec:
            r13 = r4
            r44 = r5
            java.lang.Long r4 = r10.zzh     // Catch:{ all -> 0x0dc1 }
            if (r4 == 0) goto L_0x0cfe
            java.lang.Long r4 = r10.zzh     // Catch:{ all -> 0x0dc1 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0dc1 }
            r17 = r1
            r16 = r2
            goto L_0x0d13
        L_0x0cfe:
            r4 = r43
            com.google.android.gms.measurement.internal.zzfy r5 = r4.zzj     // Catch:{ all -> 0x0dc1 }
            r5.zzi()     // Catch:{ all -> 0x0dc1 }
            long r4 = r7.zzg()     // Catch:{ all -> 0x0dc1 }
            r17 = r1
            r16 = r2
            r1 = r19
            long r4 = com.google.android.gms.measurement.internal.zzkr.zza((long) r4, (long) r1)     // Catch:{ all -> 0x0dc1 }
        L_0x0d13:
            int r1 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0d65
            com.google.android.gms.measurement.internal.zzkn r1 = r43.zzh()     // Catch:{ all -> 0x0dc1 }
            java.lang.String r2 = "_efs"
            r19 = r13
            r4 = 1
            java.lang.Long r13 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0dc1 }
            r1.zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r7, (java.lang.String) r2, (java.lang.Object) r13)     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzkn r1 = r43.zzh()     // Catch:{ all -> 0x0dc1 }
            long r4 = (long) r8     // Catch:{ all -> 0x0dc1 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0dc1 }
            r1.zza((com.google.android.gms.internal.measurement.zzcb.zzc.zza) r7, (java.lang.String) r9, (java.lang.Object) r2)     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzgw r1 = r7.zzv()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzfo r1 = (com.google.android.gms.internal.measurement.zzfo) r1     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.internal.measurement.zzcb$zzc r1 = (com.google.android.gms.internal.measurement.zzcb.zzc) r1     // Catch:{ all -> 0x0dc1 }
            r3.add(r1)     // Catch:{ all -> 0x0dc1 }
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0dc1 }
            if (r1 == 0) goto L_0x0d53
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0dc1 }
            r2 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0dc1 }
            r2 = 0
            com.google.android.gms.measurement.internal.zzak r10 = r10.zza(r2, r1, r4)     // Catch:{ all -> 0x0dc1 }
        L_0x0d53:
            java.lang.String r1 = r7.zzd()     // Catch:{ all -> 0x0dc1 }
            long r4 = r7.zzf()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzak r2 = r10.zza(r4, r14)     // Catch:{ all -> 0x0dc1 }
            r4 = r16
            r4.put(r1, r2)     // Catch:{ all -> 0x0dc1 }
            goto L_0x0d7d
        L_0x0d65:
            r19 = r13
            r4 = r16
            boolean r1 = r12.booleanValue()     // Catch:{ all -> 0x0dc1 }
            if (r1 == 0) goto L_0x0d7d
            java.lang.String r1 = r7.zzd()     // Catch:{ all -> 0x0dc1 }
            r2 = r17
            r5 = 0
            com.google.android.gms.measurement.internal.zzak r2 = r10.zza(r2, r5, r5)     // Catch:{ all -> 0x0dc1 }
            r4.put(r1, r2)     // Catch:{ all -> 0x0dc1 }
        L_0x0d7d:
            r11.zza((int) r6, (com.google.android.gms.internal.measurement.zzcb.zzc.zza) r7)     // Catch:{ all -> 0x0dc1 }
        L_0x0d80:
            int r6 = r6 + 1
            r1 = r43
            r5 = r44
            r2 = r4
            r4 = r19
            goto L_0x0a94
        L_0x0d8b:
            r4 = r2
            r44 = r5
            int r1 = r3.size()     // Catch:{ all -> 0x0dc1 }
            int r2 = r11.zzb()     // Catch:{ all -> 0x0dc1 }
            if (r1 >= r2) goto L_0x0d9f
            com.google.android.gms.internal.measurement.zzcb$zzg$zza r1 = r11.zzc()     // Catch:{ all -> 0x0dc1 }
            r1.zza((java.lang.Iterable<? extends com.google.android.gms.internal.measurement.zzcb.zzc>) r3)     // Catch:{ all -> 0x0dc1 }
        L_0x0d9f:
            java.util.Set r1 = r4.entrySet()     // Catch:{ all -> 0x0dc1 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0dc1 }
        L_0x0da7:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0dc1 }
            if (r2 == 0) goto L_0x0dca
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0dc1 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzad r3 = r43.zze()     // Catch:{ all -> 0x0dc1 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0dc1 }
            com.google.android.gms.measurement.internal.zzak r2 = (com.google.android.gms.measurement.internal.zzak) r2     // Catch:{ all -> 0x0dc1 }
            r3.zza((com.google.android.gms.measurement.internal.zzak) r2)     // Catch:{ all -> 0x0dc1 }
            goto L_0x0da7
        L_0x0dc1:
            r0 = move-exception
            r1 = r0
            r2 = r1
            r1 = r43
            goto L_0x0f8a
        L_0x0dc8:
            r44 = r5
        L_0x0dca:
            r1 = r43
            com.google.android.gms.measurement.internal.zzfy r2 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzy r2 = r2.zzb()     // Catch:{ all -> 0x0f88 }
            java.lang.String r3 = r11.zzj()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzaq.zzbm     // Catch:{ all -> 0x0f88 }
            boolean r2 = r2.zze(r3, r4)     // Catch:{ all -> 0x0f88 }
            if (r2 != 0) goto L_0x0de1
            zza((com.google.android.gms.internal.measurement.zzcb.zzg.zza) r11)     // Catch:{ all -> 0x0f88 }
        L_0x0de1:
            r2 = r44
            com.google.android.gms.internal.measurement.zzcb$zzg r3 = r2.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r3 = r3.zzx()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzad r4 = r43.zze()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzf r4 = r4.zzb(r3)     // Catch:{ all -> 0x0f88 }
            if (r4 != 0) goto L_0x0e0d
            com.google.android.gms.measurement.internal.zzfy r4 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r4 = r4.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzf()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = r2.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0f88 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r5)     // Catch:{ all -> 0x0f88 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            r4.zza(r6, r5)     // Catch:{ all -> 0x0f88 }
            goto L_0x0e68
        L_0x0e0d:
            int r5 = r11.zzb()     // Catch:{ all -> 0x0f88 }
            if (r5 <= 0) goto L_0x0e68
            long r5 = r4.zzk()     // Catch:{ all -> 0x0f88 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0e21
            r11.zze((long) r5)     // Catch:{ all -> 0x0f88 }
            goto L_0x0e24
        L_0x0e21:
            r11.zzi()     // Catch:{ all -> 0x0f88 }
        L_0x0e24:
            long r7 = r4.zzj()     // Catch:{ all -> 0x0f88 }
            r9 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 != 0) goto L_0x0e2f
            goto L_0x0e30
        L_0x0e2f:
            r5 = r7
        L_0x0e30:
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0e38
            r11.zzd((long) r5)     // Catch:{ all -> 0x0f88 }
            goto L_0x0e3b
        L_0x0e38:
            r11.zzh()     // Catch:{ all -> 0x0f88 }
        L_0x0e3b:
            r4.zzv()     // Catch:{ all -> 0x0f88 }
            long r5 = r4.zzs()     // Catch:{ all -> 0x0f88 }
            int r5 = (int) r5     // Catch:{ all -> 0x0f88 }
            r11.zzg((int) r5)     // Catch:{ all -> 0x0f88 }
            long r5 = r11.zzf()     // Catch:{ all -> 0x0f88 }
            r4.zza((long) r5)     // Catch:{ all -> 0x0f88 }
            long r5 = r11.zzg()     // Catch:{ all -> 0x0f88 }
            r4.zzb((long) r5)     // Catch:{ all -> 0x0f88 }
            java.lang.String r5 = r4.zzad()     // Catch:{ all -> 0x0f88 }
            if (r5 == 0) goto L_0x0e5e
            r11.zzj((java.lang.String) r5)     // Catch:{ all -> 0x0f88 }
            goto L_0x0e61
        L_0x0e5e:
            r11.zzk()     // Catch:{ all -> 0x0f88 }
        L_0x0e61:
            com.google.android.gms.measurement.internal.zzad r5 = r43.zze()     // Catch:{ all -> 0x0f88 }
            r5.zza((com.google.android.gms.measurement.internal.zzf) r4)     // Catch:{ all -> 0x0f88 }
        L_0x0e68:
            int r4 = r11.zzb()     // Catch:{ all -> 0x0f88 }
            if (r4 <= 0) goto L_0x0ece
            com.google.android.gms.measurement.internal.zzfy r4 = r1.zzj     // Catch:{ all -> 0x0f88 }
            r4.zzu()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzfs r4 = r43.zzc()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = r2.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzby$zzb r4 = r4.zza((java.lang.String) r5)     // Catch:{ all -> 0x0f88 }
            if (r4 == 0) goto L_0x0e92
            boolean r5 = r4.zza()     // Catch:{ all -> 0x0f88 }
            if (r5 != 0) goto L_0x0e8a
            goto L_0x0e92
        L_0x0e8a:
            long r4 = r4.zzb()     // Catch:{ all -> 0x0f88 }
            r11.zzi((long) r4)     // Catch:{ all -> 0x0f88 }
            goto L_0x0ebd
        L_0x0e92:
            com.google.android.gms.internal.measurement.zzcb$zzg r4 = r2.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r4 = r4.zzam()     // Catch:{ all -> 0x0f88 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0f88 }
            if (r4 == 0) goto L_0x0ea4
            r4 = -1
            r11.zzi((long) r4)     // Catch:{ all -> 0x0f88 }
            goto L_0x0ebd
        L_0x0ea4:
            com.google.android.gms.measurement.internal.zzfy r4 = r1.zzj     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzeu r4 = r4.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzi()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = r2.zza     // Catch:{ all -> 0x0f88 }
            java.lang.String r5 = r5.zzx()     // Catch:{ all -> 0x0f88 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r5)     // Catch:{ all -> 0x0f88 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            r4.zza(r6, r5)     // Catch:{ all -> 0x0f88 }
        L_0x0ebd:
            com.google.android.gms.measurement.internal.zzad r4 = r43.zze()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzgw r5 = r11.zzv()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzfo r5 = (com.google.android.gms.internal.measurement.zzfo) r5     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.internal.measurement.zzcb$zzg r5 = (com.google.android.gms.internal.measurement.zzcb.zzg) r5     // Catch:{ all -> 0x0f88 }
            r14 = r18
            r4.zza((com.google.android.gms.internal.measurement.zzcb.zzg) r5, (boolean) r14)     // Catch:{ all -> 0x0f88 }
        L_0x0ece:
            com.google.android.gms.measurement.internal.zzad r4 = r43.zze()     // Catch:{ all -> 0x0f88 }
            java.util.List<java.lang.Long> r2 = r2.zzb     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0f88 }
            r4.zzd()     // Catch:{ all -> 0x0f88 }
            r4.zzak()     // Catch:{ all -> 0x0f88 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0f88 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0f88 }
            r6 = 0
        L_0x0ee5:
            int r7 = r2.size()     // Catch:{ all -> 0x0f88 }
            if (r6 >= r7) goto L_0x0f02
            if (r6 == 0) goto L_0x0ef2
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0f88 }
        L_0x0ef2:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0f88 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0f88 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0f88 }
            r5.append(r7)     // Catch:{ all -> 0x0f88 }
            int r6 = r6 + 1
            goto L_0x0ee5
        L_0x0f02:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0f88 }
            android.database.sqlite.SQLiteDatabase r6 = r4.mo7215c_()     // Catch:{ all -> 0x0f88 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0f88 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0f88 }
            int r6 = r2.size()     // Catch:{ all -> 0x0f88 }
            if (r5 == r6) goto L_0x0f35
            com.google.android.gms.measurement.internal.zzeu r4 = r4.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzf()     // Catch:{ all -> 0x0f88 }
            int r2 = r2.size()     // Catch:{ all -> 0x0f88 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0f88 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0f88 }
            r4.zza(r6, r5, r2)     // Catch:{ all -> 0x0f88 }
        L_0x0f35:
            com.google.android.gms.measurement.internal.zzad r2 = r43.zze()     // Catch:{ all -> 0x0f88 }
            android.database.sqlite.SQLiteDatabase r4 = r2.mo7215c_()     // Catch:{ all -> 0x0f88 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0f4c }
            r6 = 0
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0f4c }
            r6 = 1
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0f4c }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r4.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0f4c }
            goto L_0x0f5f
        L_0x0f4c:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzf()     // Catch:{ all -> 0x0f88 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r3)     // Catch:{ all -> 0x0f88 }
            r2.zza(r5, r3, r4)     // Catch:{ all -> 0x0f88 }
        L_0x0f5f:
            com.google.android.gms.measurement.internal.zzad r2 = r43.zze()     // Catch:{ all -> 0x0f88 }
            r2.mo7214b_()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzad r2 = r43.zze()
            r2.zzh()
            r2 = 1
            return r2
        L_0x0f6f:
            com.google.android.gms.measurement.internal.zzad r2 = r43.zze()     // Catch:{ all -> 0x0f88 }
            r2.mo7214b_()     // Catch:{ all -> 0x0f88 }
            com.google.android.gms.measurement.internal.zzad r2 = r43.zze()
            r2.zzh()
            r2 = 0
            return r2
        L_0x0f7f:
            r0 = move-exception
            r2 = r0
            r6 = r3
        L_0x0f82:
            if (r6 == 0) goto L_0x0f87
            r6.close()     // Catch:{ all -> 0x0f88 }
        L_0x0f87:
            throw r2     // Catch:{ all -> 0x0f88 }
        L_0x0f88:
            r0 = move-exception
            r2 = r0
        L_0x0f8a:
            com.google.android.gms.measurement.internal.zzad r3 = r43.zze()
            r3.zzh()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.zza(java.lang.String, long):boolean");
    }

    private static void zza(zzcb.zzg.zza zza2) {
        zza2.zzb(Long.MAX_VALUE).zzc(Long.MIN_VALUE);
        for (int i = 0; i < zza2.zzb(); i++) {
            zzcb.zzc zzb2 = zza2.zzb(i);
            if (zzb2.zze() < zza2.zzf()) {
                zza2.zzb(zzb2.zze());
            }
            if (zzb2.zze() > zza2.zzg()) {
                zza2.zzc(zzb2.zze());
            }
        }
    }

    private final void zza(zzcb.zzg.zza zza2, long j, boolean z) {
        zzks zzks;
        String str = z ? "_se" : "_lte";
        zzks zzc2 = zze().zzc(zza2.zzj(), str);
        if (zzc2 == null || zzc2.zze == null) {
            zzks = new zzks(zza2.zzj(), "auto", str, this.zzj.zzm().currentTimeMillis(), Long.valueOf(j));
        } else {
            zzks = new zzks(zza2.zzj(), "auto", str, this.zzj.zzm().currentTimeMillis(), Long.valueOf(((Long) zzc2.zze).longValue() + j));
        }
        zzcb.zzk zzk2 = (zzcb.zzk) ((zzfo) zzcb.zzk.zzj().zza(str).zza(this.zzj.zzm().currentTimeMillis()).zzb(((Long) zzks.zze).longValue()).zzv());
        boolean z2 = false;
        int zza3 = zzkn.zza(zza2, str);
        if (zza3 >= 0) {
            zza2.zza(zza3, zzk2);
            z2 = true;
        }
        if (!z2) {
            zza2.zza(zzk2);
        }
        if (j > 0) {
            zze().zza(zzks);
            this.zzj.zzr().zzx().zza("Updated engagement user property. scope, value", z ? "session-scoped" : "lifetime", zzks.zze);
        }
    }

    private final boolean zza(zzcb.zzc.zza zza2, zzcb.zzc.zza zza3) {
        String str;
        Preconditions.checkArgument("_e".equals(zza2.zzd()));
        zzh();
        zzcb.zze zza4 = zzkn.zza((zzcb.zzc) ((zzfo) zza2.zzv()), "_sc");
        String str2 = null;
        if (zza4 == null) {
            str = null;
        } else {
            str = zza4.zzd();
        }
        zzh();
        zzcb.zze zza5 = zzkn.zza((zzcb.zzc) ((zzfo) zza3.zzv()), "_pc");
        if (zza5 != null) {
            str2 = zza5.zzd();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        zzb(zza2, zza3);
        return true;
    }

    private final void zzb(zzcb.zzc.zza zza2, zzcb.zzc.zza zza3) {
        Preconditions.checkArgument("_e".equals(zza2.zzd()));
        zzh();
        zzcb.zze zza4 = zzkn.zza((zzcb.zzc) ((zzfo) zza2.zzv()), "_et");
        if (zza4.zze() && zza4.zzf() > 0) {
            long zzf2 = zza4.zzf();
            zzh();
            zzcb.zze zza5 = zzkn.zza((zzcb.zzc) ((zzfo) zza3.zzv()), "_et");
            if (zza5 != null && zza5.zzf() > 0) {
                zzf2 += zza5.zzf();
            }
            zzh().zza(zza3, "_et", (Object) Long.valueOf(zzf2));
            zzh().zza(zza2, "_fr", (Object) 1L);
        }
    }

    private static void zza(zzcb.zzc.zza zza2, String str) {
        List<zzcb.zze> zza3 = zza2.zza();
        for (int i = 0; i < zza3.size(); i++) {
            if (str.equals(zza3.get(i).zzb())) {
                zza2.zzb(i);
                return;
            }
        }
    }

    private static void zza(zzcb.zzc.zza zza2, int i, String str) {
        List<zzcb.zze> zza3 = zza2.zza();
        int i2 = 0;
        while (i2 < zza3.size()) {
            if (!"_err".equals(zza3.get(i2).zzb())) {
                i2++;
            } else {
                return;
            }
        }
        zza2.zza((zzcb.zze) ((zzfo) zzcb.zze.zzm().zza("_err").zza(Long.valueOf((long) i).longValue()).zzv())).zza((zzcb.zze) ((zzfo) zzcb.zze.zzm().zza("_ev").zzb(str).zzv()));
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void zza(int i, Throwable th, byte[] bArr, String str) {
        zzad zze2;
        zzw();
        zzk();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzr = false;
                zzaa();
                throw th2;
            }
        }
        List<Long> list = this.zzv;
        this.zzv = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.zzj.zzc().zzc.zza(this.zzj.zzm().currentTimeMillis());
                this.zzj.zzc().zzd.zza(0);
                zzz();
                this.zzj.zzr().zzx().zza("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zze().zzf();
                try {
                    for (Long next : list) {
                        try {
                            zze2 = zze();
                            long longValue = next.longValue();
                            zze2.zzd();
                            zze2.zzak();
                            if (zze2.mo7215c_().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            zze2.zzr().zzf().zza("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.zzw == null || !this.zzw.contains(next)) {
                                throw e2;
                            }
                        }
                    }
                    zze().mo7214b_();
                    zze().zzh();
                    this.zzw = null;
                    if (!zzd().zzf() || !zzy()) {
                        this.zzx = -1;
                        zzz();
                    } else {
                        zzl();
                    }
                    this.zzm = 0;
                } catch (Throwable th3) {
                    zze().zzh();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.zzj.zzr().zzf().zza("Database error while trying to delete uploaded bundles", e3);
                this.zzm = this.zzj.zzm().elapsedRealtime();
                this.zzj.zzr().zzx().zza("Disable upload, time", Long.valueOf(this.zzm));
            }
        } else {
            this.zzj.zzr().zzx().zza("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzj.zzc().zzd.zza(this.zzj.zzm().currentTimeMillis());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.zzj.zzc().zze.zza(this.zzj.zzm().currentTimeMillis());
            }
            zze().zza(list);
            zzz();
        }
        this.zzr = false;
        zzaa();
    }

    private final boolean zzy() {
        zzw();
        zzk();
        return zze().zzy() || !TextUtils.isEmpty(zze().mo7216d_());
    }

    private final void zza(zzf zzf2) {
        setTextAppearance settextappearance;
        zzw();
        if (!zzlm.zzb() || !this.zzj.zzb().zze(zzf2.zzc(), zzaq.zzbn)) {
            if (TextUtils.isEmpty(zzf2.zze()) && TextUtils.isEmpty(zzf2.zzf())) {
                zza(zzf2.zzc(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(zzf2.zze()) && TextUtils.isEmpty(zzf2.zzg()) && TextUtils.isEmpty(zzf2.zzf())) {
            zza(zzf2.zzc(), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        String zza2 = this.zzj.zzb().zza(zzf2);
        try {
            URL url = new URL(zza2);
            this.zzj.zzr().zzx().zza("Fetching remote configuration", zzf2.zzc());
            zzby.zzb zza3 = zzc().zza(zzf2.zzc());
            String zzb2 = zzc().zzb(zzf2.zzc());
            if (zza3 == null || TextUtils.isEmpty(zzb2)) {
                settextappearance = null;
            } else {
                settextappearance = new setTextAppearance();
                settextappearance.put("If-Modified-Since", zzb2);
            }
            this.zzq = true;
            zzfb zzd2 = zzd();
            String zzc2 = zzf2.zzc();
            zzkk zzkk = new zzkk(this);
            zzd2.zzd();
            zzd2.zzak();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkk);
            zzd2.zzq().zzb((Runnable) new zzff(zzd2, zzc2, url, (byte[]) null, settextappearance, zzkk));
        } catch (MalformedURLException unused) {
            this.zzj.zzr().zzf().zza("Failed to parse config URL. Not fetching. appId", zzeu.zza(zzf2.zzc()), zza2);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014a A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0172 A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0176 A[Catch:{ all -> 0x018d, all -> 0x0196 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.zzw()
            r6.zzk()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0196 }
        L_0x000e:
            com.google.android.gms.measurement.internal.zzfy r1 = r6.zzj     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzeu r1 = r1.zzr()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzx()     // Catch:{ all -> 0x0196 }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x0196 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0196 }
            r1.zza(r2, r3)     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzad r1 = r6.zze()     // Catch:{ all -> 0x0196 }
            r1.zzf()     // Catch:{ all -> 0x0196 }
            com.google.android.gms.measurement.internal.zzad r1 = r6.zze()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzf r1 = r1.zzb(r7)     // Catch:{ all -> 0x018d }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003e
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003e
            if (r8 != r3) goto L_0x0042
        L_0x003e:
            if (r9 != 0) goto L_0x0042
            r2 = r4
            goto L_0x0043
        L_0x0042:
            r2 = r0
        L_0x0043:
            if (r1 != 0) goto L_0x005a
            com.google.android.gms.measurement.internal.zzfy r8 = r6.zzj     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeu r8 = r8.zzr()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzi()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r7)     // Catch:{ all -> 0x018d }
            r8.zza(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x005a:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ca
            if (r8 != r5) goto L_0x0061
            goto L_0x00ca
        L_0x0061:
            com.google.android.gms.measurement.internal.zzfy r10 = r6.zzj     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r10 = r10.zzm()     // Catch:{ all -> 0x018d }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x018d }
            r1.zzi((long) r10)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzad r10 = r6.zze()     // Catch:{ all -> 0x018d }
            r10.zza((com.google.android.gms.measurement.internal.zzf) r1)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfy r10 = r6.zzj     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeu r10 = r10.zzr()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzew r10 = r10.zzx()     // Catch:{ all -> 0x018d }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            r10.zza(r11, r1, r9)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfs r9 = r6.zzc()     // Catch:{ all -> 0x018d }
            r9.zzc(r7)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfy r7 = r6.zzj     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfg r7 = r7.zzc()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfk r7 = r7.zzd     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfy r9 = r6.zzj     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r9 = r9.zzm()     // Catch:{ all -> 0x018d }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x018d }
            r7.zza(r9)     // Catch:{ all -> 0x018d }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00ae
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r4 = r0
        L_0x00ae:
            if (r4 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.zzfy r7 = r6.zzj     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfg r7 = r7.zzc()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfk r7 = r7.zze     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzfy r8 = r6.zzj     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r8 = r8.zzm()     // Catch:{ all -> 0x018d }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x018d }
            r7.zza(r8)     // Catch:{ all -> 0x018d }
        L_0x00c5:
            r6.zzz()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x00ca:
            r9 = 0
            if (r11 == 0) goto L_0x00d6
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x018d }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x018d }
            goto L_0x00d7
        L_0x00d6:
            r11 = r9
        L_0x00d7:
            if (r11 == 0) goto L_0x00e6
            int r2 = r11.size()     // Catch:{ all -> 0x018d }
            if (r2 <= 0) goto L_0x00e6
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x018d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x018d }
            goto L_0x00e7
        L_0x00e6:
            r11 = r9
        L_0x00e7:
            if (r8 == r5) goto L_0x0103
            if (r8 != r3) goto L_0x00ec
            goto L_0x0103
        L_0x00ec:
            com.google.android.gms.measurement.internal.zzfs r9 = r6.zzc()     // Catch:{ all -> 0x018d }
            boolean r9 = r9.zza(r7, r10, r11)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.zzad r7 = r6.zze()     // Catch:{ all -> 0x0196 }
            r7.zzh()     // Catch:{ all -> 0x0196 }
            r6.zzq = r0
            r6.zzaa()
            return
        L_0x0103:
            com.google.android.gms.measurement.internal.zzfs r11 = r6.zzc()     // Catch:{ all -> 0x018d }
            com.google.android.gms.internal.measurement.zzby$zzb r11 = r11.zza((java.lang.String) r7)     // Catch:{ all -> 0x018d }
            if (r11 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.zzfs r11 = r6.zzc()     // Catch:{ all -> 0x018d }
            boolean r9 = r11.zza(r7, r9, r9)     // Catch:{ all -> 0x018d }
            if (r9 != 0) goto L_0x0124
            com.google.android.gms.measurement.internal.zzad r7 = r6.zze()     // Catch:{ all -> 0x0196 }
            r7.zzh()     // Catch:{ all -> 0x0196 }
            r6.zzq = r0
            r6.zzaa()
            return
        L_0x0124:
            com.google.android.gms.measurement.internal.zzfy r9 = r6.zzj     // Catch:{ all -> 0x018d }
            com.google.android.gms.common.util.Clock r9 = r9.zzm()     // Catch:{ all -> 0x018d }
            long r2 = r9.currentTimeMillis()     // Catch:{ all -> 0x018d }
            r1.zzh((long) r2)     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzad r9 = r6.zze()     // Catch:{ all -> 0x018d }
            r9.zza((com.google.android.gms.measurement.internal.zzf) r1)     // Catch:{ all -> 0x018d }
            if (r8 != r5) goto L_0x014a
            com.google.android.gms.measurement.internal.zzfy r8 = r6.zzj     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeu r8 = r8.zzr()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzk()     // Catch:{ all -> 0x018d }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.zza(r9, r7)     // Catch:{ all -> 0x018d }
            goto L_0x0162
        L_0x014a:
            com.google.android.gms.measurement.internal.zzfy r7 = r6.zzj     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzeu r7 = r7.zzr()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzew r7 = r7.zzx()     // Catch:{ all -> 0x018d }
            int r9 = r10.length     // Catch:{ all -> 0x018d }
            java.lang.String r10 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x018d }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x018d }
            r7.zza(r10, r8, r9)     // Catch:{ all -> 0x018d }
        L_0x0162:
            com.google.android.gms.measurement.internal.zzfb r7 = r6.zzd()     // Catch:{ all -> 0x018d }
            boolean r7 = r7.zzf()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            boolean r7 = r6.zzy()     // Catch:{ all -> 0x018d }
            if (r7 == 0) goto L_0x0176
            r6.zzl()     // Catch:{ all -> 0x018d }
            goto L_0x0179
        L_0x0176:
            r6.zzz()     // Catch:{ all -> 0x018d }
        L_0x0179:
            com.google.android.gms.measurement.internal.zzad r7 = r6.zze()     // Catch:{ all -> 0x018d }
            r7.mo7214b_()     // Catch:{ all -> 0x018d }
            com.google.android.gms.measurement.internal.zzad r7 = r6.zze()     // Catch:{ all -> 0x0196 }
            r7.zzh()     // Catch:{ all -> 0x0196 }
            r6.zzq = r0
            r6.zzaa()
            return
        L_0x018d:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzad r8 = r6.zze()     // Catch:{ all -> 0x0196 }
            r8.zzh()     // Catch:{ all -> 0x0196 }
            throw r7     // Catch:{ all -> 0x0196 }
        L_0x0196:
            r7 = move-exception
            r6.zzq = r0
            r6.zzaa()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.zza(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzz() {
        /*
            r21 = this;
            r0 = r21
            r21.zzw()
            r21.zzk()
            long r1 = r0.zzm
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004d
            com.google.android.gms.measurement.internal.zzfy r1 = r0.zzj
            com.google.android.gms.common.util.Clock r1 = r1.zzm()
            long r1 = r1.elapsedRealtime()
            long r5 = r0.zzm
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            long r1 = r1 - r5
            long r1 = java.lang.Math.abs(r1)
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x004b
            com.google.android.gms.measurement.internal.zzfy r1 = r0.zzj
            com.google.android.gms.measurement.internal.zzeu r1 = r1.zzr()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzx()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.zza(r3, r2)
            com.google.android.gms.measurement.internal.zzfe r1 = r21.zzt()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzkf r1 = r21.zzv()
            r1.zzf()
            return
        L_0x004b:
            r0.zzm = r3
        L_0x004d:
            com.google.android.gms.measurement.internal.zzfy r1 = r0.zzj
            boolean r1 = r1.zzag()
            if (r1 == 0) goto L_0x0254
            boolean r1 = r21.zzy()
            if (r1 != 0) goto L_0x005d
            goto L_0x0254
        L_0x005d:
            com.google.android.gms.measurement.internal.zzfy r1 = r0.zzj
            com.google.android.gms.common.util.Clock r1 = r1.zzm()
            long r1 = r1.currentTimeMillis()
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzaq.zzz
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.zzad r5 = r21.zze()
            boolean r5 = r5.zzz()
            if (r5 != 0) goto L_0x008f
            com.google.android.gms.measurement.internal.zzad r5 = r21.zze()
            boolean r5 = r5.zzk()
            if (r5 == 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r5 = 0
            goto L_0x0090
        L_0x008f:
            r5 = 1
        L_0x0090:
            if (r5 == 0) goto L_0x00cc
            com.google.android.gms.measurement.internal.zzfy r10 = r0.zzj
            com.google.android.gms.measurement.internal.zzy r10 = r10.zzb()
            java.lang.String r10 = r10.zzw()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x00bb
            java.lang.String r11 = ".none."
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00bb
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzaq.zzu
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00dc
        L_0x00bb:
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzaq.zzt
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
            goto L_0x00dc
        L_0x00cc:
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r10 = com.google.android.gms.measurement.internal.zzaq.zzs
            java.lang.Object r10 = r10.zza(r6)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            long r10 = java.lang.Math.max(r3, r10)
        L_0x00dc:
            com.google.android.gms.measurement.internal.zzfy r12 = r0.zzj
            com.google.android.gms.measurement.internal.zzfg r12 = r12.zzc()
            com.google.android.gms.measurement.internal.zzfk r12 = r12.zzc
            long r12 = r12.zza()
            com.google.android.gms.measurement.internal.zzfy r14 = r0.zzj
            com.google.android.gms.measurement.internal.zzfg r14 = r14.zzc()
            com.google.android.gms.measurement.internal.zzfk r14 = r14.zzd
            long r14 = r14.zza()
            com.google.android.gms.measurement.internal.zzad r16 = r21.zze()
            r17 = r10
            long r9 = r16.zzw()
            com.google.android.gms.measurement.internal.zzad r11 = r21.zze()
            r19 = r7
            long r6 = r11.zzx()
            long r6 = java.lang.Math.max(r9, r6)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0112
            goto L_0x0186
        L_0x0112:
            long r6 = r6 - r1
            long r6 = java.lang.Math.abs(r6)
            long r6 = r1 - r6
            long r12 = r12 - r1
            long r8 = java.lang.Math.abs(r12)
            long r14 = r14 - r1
            long r10 = java.lang.Math.abs(r14)
            long r10 = r1 - r10
            long r1 = r1 - r8
            long r1 = java.lang.Math.max(r1, r10)
            long r8 = r6 + r19
            if (r5 == 0) goto L_0x0138
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0138
            long r8 = java.lang.Math.min(r6, r1)
            long r8 = r8 + r17
        L_0x0138:
            com.google.android.gms.measurement.internal.zzkn r5 = r21.zzh()
            r12 = r17
            boolean r5 = r5.zza((long) r1, (long) r12)
            if (r5 != 0) goto L_0x0146
            long r8 = r1 + r12
        L_0x0146:
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0187
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0187
            r1 = 0
        L_0x014f:
            com.google.android.gms.measurement.internal.zzen<java.lang.Integer> r2 = com.google.android.gms.measurement.internal.zzaq.zzab
            r5 = 0
            java.lang.Object r2 = r2.zza(r5)
            r6 = 20
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r7 = 0
            int r2 = java.lang.Math.max(r7, r2)
            int r2 = java.lang.Math.min(r6, r2)
            if (r1 >= r2) goto L_0x0186
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r2 = com.google.android.gms.measurement.internal.zzaq.zzaa
            java.lang.Object r2 = r2.zza(r5)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r8 = r8 + r5
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0183
            goto L_0x0187
        L_0x0183:
            int r1 = r1 + 1
            goto L_0x014f
        L_0x0186:
            r8 = r3
        L_0x0187:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01a9
            com.google.android.gms.measurement.internal.zzfy r1 = r0.zzj
            com.google.android.gms.measurement.internal.zzeu r1 = r1.zzr()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzx()
            java.lang.String r2 = "Next upload time is 0"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfe r1 = r21.zzt()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzkf r1 = r21.zzv()
            r1.zzf()
            return
        L_0x01a9:
            com.google.android.gms.measurement.internal.zzfb r1 = r21.zzd()
            boolean r1 = r1.zzf()
            if (r1 != 0) goto L_0x01d1
            com.google.android.gms.measurement.internal.zzfy r1 = r0.zzj
            com.google.android.gms.measurement.internal.zzeu r1 = r1.zzr()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzx()
            java.lang.String r2 = "No network"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfe r1 = r21.zzt()
            r1.zza()
            com.google.android.gms.measurement.internal.zzkf r1 = r21.zzv()
            r1.zzf()
            return
        L_0x01d1:
            com.google.android.gms.measurement.internal.zzfy r1 = r0.zzj
            com.google.android.gms.measurement.internal.zzfg r1 = r1.zzc()
            com.google.android.gms.measurement.internal.zzfk r1 = r1.zze
            long r1 = r1.zza()
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzaq.zzq
            r6 = 0
            java.lang.Object r5 = r5.zza(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzkn r7 = r21.zzh()
            boolean r7 = r7.zza((long) r1, (long) r5)
            if (r7 != 0) goto L_0x01fd
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x01fd:
            com.google.android.gms.measurement.internal.zzfe r1 = r21.zzt()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzfy r1 = r0.zzj
            com.google.android.gms.common.util.Clock r1 = r1.zzm()
            long r1 = r1.currentTimeMillis()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0239
            com.google.android.gms.measurement.internal.zzen<java.lang.Long> r1 = com.google.android.gms.measurement.internal.zzaq.zzv
            r2 = 0
            java.lang.Object r1 = r1.zza(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.zzfy r1 = r0.zzj
            com.google.android.gms.measurement.internal.zzfg r1 = r1.zzc()
            com.google.android.gms.measurement.internal.zzfk r1 = r1.zzc
            com.google.android.gms.measurement.internal.zzfy r2 = r0.zzj
            com.google.android.gms.common.util.Clock r2 = r2.zzm()
            long r2 = r2.currentTimeMillis()
            r1.zza(r2)
        L_0x0239:
            com.google.android.gms.measurement.internal.zzfy r1 = r0.zzj
            com.google.android.gms.measurement.internal.zzeu r1 = r1.zzr()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzx()
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.zza(r3, r2)
            com.google.android.gms.measurement.internal.zzkf r1 = r21.zzv()
            r1.zza(r8)
            return
        L_0x0254:
            com.google.android.gms.measurement.internal.zzfy r1 = r0.zzj
            com.google.android.gms.measurement.internal.zzeu r1 = r1.zzr()
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzx()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzfe r1 = r21.zzt()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzkf r1 = r21.zzv()
            r1.zzf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.zzz():void");
    }

    /* access modifiers changed from: package-private */
    public final void zza(Runnable runnable) {
        zzw();
        if (this.zzn == null) {
            this.zzn = new ArrayList();
        }
        this.zzn.add(runnable);
    }

    private final void zzaa() {
        zzw();
        if (this.zzq || this.zzr || this.zzs) {
            this.zzj.zzr().zzx().zza("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzq), Boolean.valueOf(this.zzr), Boolean.valueOf(this.zzs));
            return;
        }
        this.zzj.zzr().zzx().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzn;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.zzn.clear();
        }
    }

    private final Boolean zzb(zzf zzf2) {
        try {
            if (zzf2.zzm() != -2147483648L) {
                if (zzf2.zzm() == ((long) Wrappers.packageManager(this.zzj.zzn()).getPackageInfo(zzf2.zzc(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzj.zzn()).getPackageInfo(zzf2.zzc(), 0).versionName;
                if (zzf2.zzl() != null && zzf2.zzl().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzo() {
        zzw();
        zzk();
        if (!this.zzl) {
            this.zzl = true;
            if (zzab()) {
                int zza2 = zza(this.zzu);
                int zzaf = this.zzj.zzy().zzaf();
                zzw();
                if (zza2 > zzaf) {
                    this.zzj.zzr().zzf().zza("Panic: can't downgrade version. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzaf));
                } else if (zza2 >= zzaf) {
                } else {
                    if (zza(zzaf, this.zzu)) {
                        this.zzj.zzr().zzx().zza("Storage version upgraded. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzaf));
                    } else {
                        this.zzj.zzr().zzf().zza("Storage version upgrade failed. Previous, current version", Integer.valueOf(zza2), Integer.valueOf(zzaf));
                    }
                }
            }
        }
    }

    private final boolean zzab() {
        FileLock fileLock;
        zzw();
        if (!this.zzj.zzb().zza(zzaq.zzbl) || (fileLock = this.zzt) == null || !fileLock.isValid()) {
            try {
                FileChannel channel = new RandomAccessFile(new File(this.zzj.zzn().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.zzu = channel;
                FileLock tryLock = channel.tryLock();
                this.zzt = tryLock;
                if (tryLock != null) {
                    this.zzj.zzr().zzx().zza("Storage concurrent access okay");
                    return true;
                }
                this.zzj.zzr().zzf().zza("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                this.zzj.zzr().zzf().zza("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                this.zzj.zzr().zzf().zza("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                this.zzj.zzr().zzi().zza("Storage lock already acquired", e3);
                return false;
            }
        } else {
            this.zzj.zzr().zzx().zza("Storage concurrent access okay");
            return true;
        }
    }

    private final int zza(FileChannel fileChannel) {
        zzw();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzj.zzr().zzf().zza("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.zzj.zzr().zzi().zza("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            return allocate.getInt();
        } catch (IOException e) {
            this.zzj.zzr().zzf().zza("Failed to read from channel", e);
            return 0;
        }
    }

    private final boolean zza(int i, FileChannel fileChannel) {
        zzw();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzj.zzr().zzf().zza("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            if (this.zzj.zzb().zza(zzaq.zzby) && Build.VERSION.SDK_INT <= 19) {
                fileChannel.position(0);
            }
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.zzj.zzr().zzf().zza("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.zzj.zzr().zzf().zza("Failed to write to channel", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzn zzn2) {
        zzn zzn3 = zzn2;
        if (this.zzv != null) {
            ArrayList arrayList = new ArrayList();
            this.zzw = arrayList;
            arrayList.addAll(this.zzv);
        }
        zzad zze2 = zze();
        String str = zzn3.zza;
        Preconditions.checkNotEmpty(str);
        zze2.zzd();
        zze2.zzak();
        try {
            SQLiteDatabase c_ = zze2.mo7215c_();
            String[] strArr = {str};
            int delete = c_.delete("apps", "app_id=?", strArr);
            int delete2 = c_.delete("events", "app_id=?", strArr);
            int delete3 = c_.delete("user_attributes", "app_id=?", strArr);
            int delete4 = c_.delete("conditional_properties", "app_id=?", strArr);
            int delete5 = c_.delete("raw_events", "app_id=?", strArr);
            int delete6 = c_.delete("raw_events_metadata", "app_id=?", strArr);
            int delete7 = c_.delete("queue", "app_id=?", strArr);
            int delete8 = delete + 0 + delete2 + delete3 + delete4 + delete5 + delete6 + delete7 + c_.delete("audience_filter_values", "app_id=?", strArr) + c_.delete("main_event_params", "app_id=?", strArr) + c_.delete("default_event_params", "app_id=?", strArr);
            if (delete8 > 0) {
                zze2.zzr().zzx().zza("Reset analytics data. app, records", str, Integer.valueOf(delete8));
            }
        } catch (SQLiteException e) {
            zze2.zzr().zzf().zza("Error resetting analytics data. appId, error", zzeu.zza(str), e);
        }
        if (zzn3.zzh) {
            zzb(zzn2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzkq zzkq, zzn zzn2) {
        zzw();
        zzk();
        if (zze(zzn2)) {
            if (!zzn2.zzh) {
                zzc(zzn2);
                return;
            }
            int zzc2 = this.zzj.zzi().zzc(zzkq.zza);
            int i = 0;
            if (zzc2 != 0) {
                this.zzj.zzi();
                this.zzj.zzi().zza(zzn2.zza, zzc2, "_ev", zzkr.zza(zzkq.zza, 24, true), zzkq.zza != null ? zzkq.zza.length() : 0);
                return;
            }
            int zzb2 = this.zzj.zzi().zzb(zzkq.zza, zzkq.zza());
            if (zzb2 != 0) {
                this.zzj.zzi();
                String zza2 = zzkr.zza(zzkq.zza, 24, true);
                Object zza3 = zzkq.zza();
                if (zza3 != null && ((zza3 instanceof String) || (zza3 instanceof CharSequence))) {
                    i = String.valueOf(zza3).length();
                }
                this.zzj.zzi().zza(zzn2.zza, zzb2, "_ev", zza2, i);
                return;
            }
            Object zzc3 = this.zzj.zzi().zzc(zzkq.zza, zzkq.zza());
            if (zzc3 != null) {
                if ("_sid".equals(zzkq.zza)) {
                    long j = zzkq.zzb;
                    String str = zzkq.zze;
                    long j2 = 0;
                    zzks zzc4 = zze().zzc(zzn2.zza, "_sno");
                    if (zzc4 == null || !(zzc4.zze instanceof Long)) {
                        if (zzc4 != null) {
                            this.zzj.zzr().zzi().zza("Retrieved last session number from database does not contain a valid (long) value", zzc4.zze);
                        }
                        zzak zza4 = zze().zza(zzn2.zza, "_s");
                        if (zza4 != null) {
                            j2 = zza4.zzc;
                            this.zzj.zzr().zzx().zza("Backfill the session number. Last used session number", Long.valueOf(j2));
                        }
                    } else {
                        j2 = ((Long) zzc4.zze).longValue();
                    }
                    zza(new zzkq("_sno", j, Long.valueOf(j2 + 1), str), zzn2);
                }
                zzks zzks = new zzks(zzn2.zza, zzkq.zze, zzkq.zza, zzkq.zzb, zzc3);
                this.zzj.zzr().zzx().zza("Setting user property", this.zzj.zzj().zzc(zzks.zzc), zzc3);
                zze().zzf();
                try {
                    zzc(zzn2);
                    boolean zza5 = zze().zza(zzks);
                    zze().mo7214b_();
                    if (!zza5) {
                        this.zzj.zzr().zzf().zza("Too many unique user properties are set. Ignoring user property", this.zzj.zzj().zzc(zzks.zzc), zzks.zze);
                        this.zzj.zzi().zza(zzn2.zza, 9, (String) null, (String) null, 0);
                    }
                } finally {
                    zze().zzh();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzkq zzkq, zzn zzn2) {
        zzw();
        zzk();
        if (zze(zzn2)) {
            if (!zzn2.zzh) {
                zzc(zzn2);
            } else if (!"_npa".equals(zzkq.zza) || zzn2.zzs == null) {
                this.zzj.zzr().zzw().zza("Removing user property", this.zzj.zzj().zzc(zzkq.zza));
                zze().zzf();
                try {
                    zzc(zzn2);
                    zze().zzb(zzn2.zza, zzkq.zza);
                    zze().mo7214b_();
                    this.zzj.zzr().zzw().zza("User property removed", this.zzj.zzj().zzc(zzkq.zza));
                } finally {
                    zze().zzh();
                }
            } else {
                this.zzj.zzr().zzw().zza("Falling back to manifest metadata value for ad personalization");
                zza(new zzkq("_npa", this.zzj.zzm().currentTimeMillis(), Long.valueOf(zzn2.zzs.booleanValue() ? 1 : 0), "auto"), zzn2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzkg zzkg) {
        this.zzo++;
    }

    /* access modifiers changed from: package-private */
    public final void zzp() {
        this.zzp++;
    }

    /* access modifiers changed from: package-private */
    public final zzfy zzs() {
        return this.zzj;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0259 A[Catch:{ NameNotFoundException -> 0x0352, all -> 0x04e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0268 A[Catch:{ NameNotFoundException -> 0x0352, all -> 0x04e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x027d A[Catch:{ NameNotFoundException -> 0x0352, all -> 0x04e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04ba A[Catch:{ NameNotFoundException -> 0x0352, all -> 0x04e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011b A[SYNTHETIC, Splitter:B:45:0x011b] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f5 A[Catch:{ all -> 0x01e6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(com.google.android.gms.measurement.internal.zzn r26) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r25.zzw()
            r25.zzk()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r26)
            java.lang.String r7 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            boolean r7 = r25.zze(r26)
            if (r7 != 0) goto L_0x0023
            return
        L_0x0023:
            com.google.android.gms.measurement.internal.zzad r7 = r25.zze()
            java.lang.String r8 = r2.zza
            com.google.android.gms.measurement.internal.zzf r7 = r7.zzb(r8)
            r8 = 0
            if (r7 == 0) goto L_0x0056
            java.lang.String r10 = r7.zze()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0056
            java.lang.String r10 = r2.zzb
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0056
            r7.zzh((long) r8)
            com.google.android.gms.measurement.internal.zzad r10 = r25.zze()
            r10.zza((com.google.android.gms.measurement.internal.zzf) r7)
            com.google.android.gms.measurement.internal.zzfs r7 = r25.zzc()
            java.lang.String r10 = r2.zza
            r7.zzd(r10)
        L_0x0056:
            boolean r7 = r2.zzh
            if (r7 != 0) goto L_0x005e
            r25.zzc(r26)
            return
        L_0x005e:
            long r10 = r2.zzm
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x006e
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj
            com.google.android.gms.common.util.Clock r7 = r7.zzm()
            long r10 = r7.currentTimeMillis()
        L_0x006e:
            com.google.android.gms.measurement.internal.zzfy r7 = r1.zzj
            com.google.android.gms.measurement.internal.zzai r7 = r7.zzx()
            r7.zzi()
            int r7 = r2.zzn
            r15 = 1
            if (r7 == 0) goto L_0x0098
            if (r7 == r15) goto L_0x0098
            com.google.android.gms.measurement.internal.zzfy r12 = r1.zzj
            com.google.android.gms.measurement.internal.zzeu r12 = r12.zzr()
            com.google.android.gms.measurement.internal.zzew r12 = r12.zzi()
            java.lang.String r13 = r2.zza
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r14 = "Incorrect app type, assuming installed app. appId, appType"
            r12.zza(r14, r13, r7)
            r7 = 0
        L_0x0098:
            com.google.android.gms.measurement.internal.zzad r12 = r25.zze()
            r12.zzf()
            com.google.android.gms.measurement.internal.zzad r12 = r25.zze()     // Catch:{ all -> 0x04e8 }
            java.lang.String r13 = r2.zza     // Catch:{ all -> 0x04e8 }
            java.lang.String r14 = "_npa"
            com.google.android.gms.measurement.internal.zzks r14 = r12.zzc(r13, r14)     // Catch:{ all -> 0x04e8 }
            if (r14 == 0) goto L_0x00bc
            java.lang.String r12 = r14.zzb     // Catch:{ all -> 0x04e8 }
            java.lang.String r13 = "auto"
            boolean r12 = r13.equals(r12)     // Catch:{ all -> 0x04e8 }
            if (r12 == 0) goto L_0x00b8
            goto L_0x00bc
        L_0x00b8:
            r20 = r3
            r3 = r15
            goto L_0x010f
        L_0x00bc:
            java.lang.Boolean r12 = r2.zzs     // Catch:{ all -> 0x04e8 }
            if (r12 == 0) goto L_0x00f9
            com.google.android.gms.measurement.internal.zzkq r13 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x04e8 }
            java.lang.Boolean r12 = r2.zzs     // Catch:{ all -> 0x04e8 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x04e8 }
            if (r12 == 0) goto L_0x00cd
            r18 = 1
            goto L_0x00cf
        L_0x00cd:
            r18 = r8
        L_0x00cf:
            java.lang.String r20 = "_npa"
            java.lang.Long r18 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x04e8 }
            java.lang.String r19 = "auto"
            r8 = 1
            r12 = r13
            r8 = r13
            r13 = r20
            r20 = r3
            r9 = r14
            r3 = r15
            r14 = r10
            r16 = r18
            r17 = r19
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04e8 }
            if (r9 == 0) goto L_0x00f5
            java.lang.Object r9 = r9.zze     // Catch:{ all -> 0x04e8 }
            java.lang.Long r12 = r8.zzc     // Catch:{ all -> 0x04e8 }
            boolean r9 = r9.equals(r12)     // Catch:{ all -> 0x04e8 }
            if (r9 != 0) goto L_0x010f
        L_0x00f5:
            r1.zza((com.google.android.gms.measurement.internal.zzkq) r8, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04e8 }
            goto L_0x010f
        L_0x00f9:
            r20 = r3
            r9 = r14
            r3 = r15
            if (r9 == 0) goto L_0x010f
            com.google.android.gms.measurement.internal.zzkq r8 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x04e8 }
            java.lang.String r13 = "_npa"
            r16 = 0
            java.lang.String r17 = "auto"
            r12 = r8
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04e8 }
            r1.zzb((com.google.android.gms.measurement.internal.zzkq) r8, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04e8 }
        L_0x010f:
            com.google.android.gms.measurement.internal.zzad r8 = r25.zze()     // Catch:{ all -> 0x04e8 }
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x04e8 }
            com.google.android.gms.measurement.internal.zzf r8 = r8.zzb(r9)     // Catch:{ all -> 0x04e8 }
            if (r8 == 0) goto L_0x01eb
            com.google.android.gms.measurement.internal.zzfy r12 = r1.zzj     // Catch:{ all -> 0x01e6 }
            r12.zzi()     // Catch:{ all -> 0x01e6 }
            java.lang.String r12 = r2.zzb     // Catch:{ all -> 0x01e6 }
            java.lang.String r13 = r8.zze()     // Catch:{ all -> 0x01e6 }
            java.lang.String r14 = r2.zzr     // Catch:{ all -> 0x01e6 }
            java.lang.String r15 = r8.zzf()     // Catch:{ all -> 0x01e6 }
            boolean r12 = com.google.android.gms.measurement.internal.zzkr.zza((java.lang.String) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x01e6 }
            if (r12 == 0) goto L_0x01eb
            com.google.android.gms.measurement.internal.zzfy r12 = r1.zzj     // Catch:{ all -> 0x01e6 }
            com.google.android.gms.measurement.internal.zzeu r12 = r12.zzr()     // Catch:{ all -> 0x01e6 }
            com.google.android.gms.measurement.internal.zzew r12 = r12.zzi()     // Catch:{ all -> 0x01e6 }
            java.lang.String r13 = r8.zzc()     // Catch:{ all -> 0x01e6 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r13)     // Catch:{ all -> 0x01e6 }
            java.lang.String r14 = "New GMP App Id passed in. Removing cached database data. appId"
            r12.zza(r14, r13)     // Catch:{ all -> 0x01e6 }
            com.google.android.gms.measurement.internal.zzad r12 = r25.zze()     // Catch:{ all -> 0x01e6 }
            java.lang.String r8 = r8.zzc()     // Catch:{ all -> 0x01e6 }
            r12.zzak()     // Catch:{ all -> 0x01e6 }
            r12.zzd()     // Catch:{ all -> 0x01e6 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)     // Catch:{ all -> 0x01e6 }
            android.database.sqlite.SQLiteDatabase r13 = r12.mo7215c_()     // Catch:{ SQLiteException -> 0x01ca }
            java.lang.String[] r14 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x01ca }
            r15 = 0
            r14[r15] = r8     // Catch:{ SQLiteException -> 0x01ca }
            java.lang.String r15 = "events"
            int r15 = r13.delete(r15, r0, r14)     // Catch:{ SQLiteException -> 0x01ca }
            java.lang.String r9 = "user_attributes"
            int r9 = r13.delete(r9, r0, r14)     // Catch:{ SQLiteException -> 0x01ca }
            java.lang.String r3 = "conditional_properties"
            int r3 = r13.delete(r3, r0, r14)     // Catch:{ SQLiteException -> 0x01ca }
            r21 = r4
            java.lang.String r4 = "apps"
            int r4 = r13.delete(r4, r0, r14)     // Catch:{ SQLiteException -> 0x01c8 }
            r22 = r5
            java.lang.String r5 = "raw_events"
            int r5 = r13.delete(r5, r0, r14)     // Catch:{ SQLiteException -> 0x01c6 }
            r23 = r6
            java.lang.String r6 = "raw_events_metadata"
            int r6 = r13.delete(r6, r0, r14)     // Catch:{ SQLiteException -> 0x01c4 }
            r24 = r7
            java.lang.String r7 = "event_filters"
            int r7 = r13.delete(r7, r0, r14)     // Catch:{ SQLiteException -> 0x01c2 }
            java.lang.String r1 = "property_filters"
            int r1 = r13.delete(r1, r0, r14)     // Catch:{ SQLiteException -> 0x01c2 }
            r16 = 0
            int r15 = r15 + 0
            int r15 = r15 + r9
            int r15 = r15 + r3
            int r15 = r15 + r4
            int r15 = r15 + r5
            int r15 = r15 + r6
            int r15 = r15 + r7
            int r15 = r15 + r1
            java.lang.String r1 = "audience_filter_values"
            int r0 = r13.delete(r1, r0, r14)     // Catch:{ SQLiteException -> 0x01c2 }
            int r15 = r15 + r0
            if (r15 <= 0) goto L_0x01e4
            com.google.android.gms.measurement.internal.zzeu r0 = r12.zzr()     // Catch:{ SQLiteException -> 0x01c2 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzx()     // Catch:{ SQLiteException -> 0x01c2 }
            java.lang.String r1 = "Deleted application data. app, records"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)     // Catch:{ SQLiteException -> 0x01c2 }
            r0.zza(r1, r8, r3)     // Catch:{ SQLiteException -> 0x01c2 }
            goto L_0x01e4
        L_0x01c2:
            r0 = move-exception
            goto L_0x01d3
        L_0x01c4:
            r0 = move-exception
            goto L_0x01d1
        L_0x01c6:
            r0 = move-exception
            goto L_0x01cf
        L_0x01c8:
            r0 = move-exception
            goto L_0x01cd
        L_0x01ca:
            r0 = move-exception
            r21 = r4
        L_0x01cd:
            r22 = r5
        L_0x01cf:
            r23 = r6
        L_0x01d1:
            r24 = r7
        L_0x01d3:
            com.google.android.gms.measurement.internal.zzeu r1 = r12.zzr()     // Catch:{ all -> 0x01e6 }
            com.google.android.gms.measurement.internal.zzew r1 = r1.zzf()     // Catch:{ all -> 0x01e6 }
            java.lang.String r3 = "Error deleting application data. appId, error"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r8)     // Catch:{ all -> 0x01e6 }
            r1.zza(r3, r4, r0)     // Catch:{ all -> 0x01e6 }
        L_0x01e4:
            r8 = 0
            goto L_0x01f3
        L_0x01e6:
            r0 = move-exception
            r3 = r25
            goto L_0x04ea
        L_0x01eb:
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
        L_0x01f3:
            if (r8 == 0) goto L_0x0252
            long r0 = r8.zzm()     // Catch:{ all -> 0x01e6 }
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x020c
            long r0 = r8.zzm()     // Catch:{ all -> 0x01e6 }
            long r5 = r2.zzj     // Catch:{ all -> 0x01e6 }
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x020c
            r14 = 1
            goto L_0x020d
        L_0x020c:
            r14 = 0
        L_0x020d:
            long r0 = r8.zzm()     // Catch:{ all -> 0x01e6 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0229
            java.lang.String r0 = r8.zzl()     // Catch:{ all -> 0x01e6 }
            if (r0 == 0) goto L_0x0229
            java.lang.String r0 = r8.zzl()     // Catch:{ all -> 0x01e6 }
            java.lang.String r1 = r2.zzc     // Catch:{ all -> 0x01e6 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x01e6 }
            if (r0 != 0) goto L_0x0229
            r0 = 1
            goto L_0x022a
        L_0x0229:
            r0 = 0
        L_0x022a:
            r0 = r0 | r14
            if (r0 == 0) goto L_0x0252
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x01e6 }
            r0.<init>()     // Catch:{ all -> 0x01e6 }
            java.lang.String r1 = "_pv"
            java.lang.String r3 = r8.zzl()     // Catch:{ all -> 0x01e6 }
            r0.putString(r1, r3)     // Catch:{ all -> 0x01e6 }
            com.google.android.gms.measurement.internal.zzao r1 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x01e6 }
            com.google.android.gms.measurement.internal.zzan r14 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x01e6 }
            r14.<init>(r0)     // Catch:{ all -> 0x01e6 }
            java.lang.String r13 = "_au"
            java.lang.String r15 = "auto"
            r12 = r1
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x01e6 }
            r3 = r25
            r3.zza((com.google.android.gms.measurement.internal.zzao) r1, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04e6 }
            goto L_0x0254
        L_0x0252:
            r3 = r25
        L_0x0254:
            r25.zzc(r26)     // Catch:{ all -> 0x04e6 }
            if (r24 != 0) goto L_0x0268
            com.google.android.gms.measurement.internal.zzad r0 = r25.zze()     // Catch:{ all -> 0x04e6 }
            java.lang.String r1 = r2.zza     // Catch:{ all -> 0x04e6 }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.zzak r0 = r0.zza((java.lang.String) r1, (java.lang.String) r4)     // Catch:{ all -> 0x04e6 }
            r7 = r24
            goto L_0x027b
        L_0x0268:
            r7 = r24
            r1 = 1
            if (r7 != r1) goto L_0x027a
            com.google.android.gms.measurement.internal.zzad r0 = r25.zze()     // Catch:{ all -> 0x04e6 }
            java.lang.String r1 = r2.zza     // Catch:{ all -> 0x04e6 }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.zzak r0 = r0.zza((java.lang.String) r1, (java.lang.String) r4)     // Catch:{ all -> 0x04e6 }
            goto L_0x027b
        L_0x027a:
            r0 = 0
        L_0x027b:
            if (r0 != 0) goto L_0x04ba
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r10 / r0
            r8 = 1
            long r4 = r4 + r8
            long r4 = r4 * r0
            java.lang.String r0 = "_dac"
            java.lang.String r1 = "_r"
            java.lang.String r6 = "_c"
            java.lang.String r8 = "_et"
            if (r7 != 0) goto L_0x041c
            com.google.android.gms.measurement.internal.zzkq r7 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x04e6 }
            java.lang.String r13 = "_fot"
            java.lang.Long r16 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x04e6 }
            java.lang.String r17 = "auto"
            r12 = r7
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04e6 }
            r3.zza((com.google.android.gms.measurement.internal.zzkq) r7, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzfy r4 = r3.zzj     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzy r4 = r4.zzb()     // Catch:{ all -> 0x04e6 }
            java.lang.String r5 = r2.zzb     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.zzaq.zzar     // Catch:{ all -> 0x04e6 }
            boolean r4 = r4.zze(r5, r7)     // Catch:{ all -> 0x04e6 }
            if (r4 == 0) goto L_0x02c0
            r25.zzw()     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzfy r4 = r3.zzj     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzfp r4 = r4.zzf()     // Catch:{ all -> 0x04e6 }
            java.lang.String r5 = r2.zza     // Catch:{ all -> 0x04e6 }
            r4.zza(r5)     // Catch:{ all -> 0x04e6 }
        L_0x02c0:
            r25.zzw()     // Catch:{ all -> 0x04e6 }
            r25.zzk()     // Catch:{ all -> 0x04e6 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x04e6 }
            r4.<init>()     // Catch:{ all -> 0x04e6 }
            r12 = 1
            r4.putLong(r6, r12)     // Catch:{ all -> 0x04e6 }
            r4.putLong(r1, r12)     // Catch:{ all -> 0x04e6 }
            r1 = r23
            r5 = 0
            r4.putLong(r1, r5)     // Catch:{ all -> 0x04e6 }
            r7 = r22
            r4.putLong(r7, r5)     // Catch:{ all -> 0x04e6 }
            r9 = r21
            r4.putLong(r9, r5)     // Catch:{ all -> 0x04e6 }
            r14 = r20
            r4.putLong(r14, r5)     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzfy r5 = r3.zzj     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzy r5 = r5.zzb()     // Catch:{ all -> 0x04e6 }
            java.lang.String r6 = r2.zza     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzaq.zzat     // Catch:{ all -> 0x04e6 }
            boolean r5 = r5.zze(r6, r12)     // Catch:{ all -> 0x04e6 }
            if (r5 == 0) goto L_0x02ff
            r5 = 1
            r4.putLong(r8, r5)     // Catch:{ all -> 0x04e6 }
            goto L_0x0301
        L_0x02ff:
            r5 = 1
        L_0x0301:
            boolean r12 = r2.zzq     // Catch:{ all -> 0x04e6 }
            if (r12 == 0) goto L_0x0308
            r4.putLong(r0, r5)     // Catch:{ all -> 0x04e6 }
        L_0x0308:
            com.google.android.gms.measurement.internal.zzad r0 = r25.zze()     // Catch:{ all -> 0x04e6 }
            java.lang.String r5 = r2.zza     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)     // Catch:{ all -> 0x04e6 }
            r0.zzd()     // Catch:{ all -> 0x04e6 }
            r0.zzak()     // Catch:{ all -> 0x04e6 }
            java.lang.String r6 = "first_open_count"
            long r5 = r0.zzh(r5, r6)     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzj     // Catch:{ all -> 0x04e6 }
            android.content.Context r0 = r0.zzn()     // Catch:{ all -> 0x04e6 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x04e6 }
            if (r0 != 0) goto L_0x0340
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzj     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzr()     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()     // Catch:{ all -> 0x04e6 }
            java.lang.String r1 = r2.zza     // Catch:{ all -> 0x04e6 }
            java.lang.Object r1 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r1)     // Catch:{ all -> 0x04e6 }
            java.lang.String r9 = "PackageManager is null, first open report might be inaccurate. appId"
            r0.zza(r9, r1)     // Catch:{ all -> 0x04e6 }
            goto L_0x03fe
        L_0x0340:
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzj     // Catch:{ NameNotFoundException -> 0x0352 }
            android.content.Context r0 = r0.zzn()     // Catch:{ NameNotFoundException -> 0x0352 }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x0352 }
            java.lang.String r12 = r2.zza     // Catch:{ NameNotFoundException -> 0x0352 }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r12, r13)     // Catch:{ NameNotFoundException -> 0x0352 }
            goto L_0x0369
        L_0x0352:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfy r12 = r3.zzj     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzeu r12 = r12.zzr()     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzew r12 = r12.zzf()     // Catch:{ all -> 0x04e6 }
            java.lang.String r13 = r2.zza     // Catch:{ all -> 0x04e6 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r13)     // Catch:{ all -> 0x04e6 }
            java.lang.String r15 = "Package info is null, first open report might be inaccurate. appId"
            r12.zza(r15, r13, r0)     // Catch:{ all -> 0x04e6 }
            r0 = 0
        L_0x0369:
            if (r0 == 0) goto L_0x03bc
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04e6 }
            r15 = 0
            int r12 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r12 == 0) goto L_0x03bc
            long r12 = r0.firstInstallTime     // Catch:{ all -> 0x04e6 }
            r20 = r14
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x04e6 }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x039e
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzj     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzy r0 = r0.zzb()     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzaq.zzbs     // Catch:{ all -> 0x04e6 }
            boolean r0 = r0.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r12)     // Catch:{ all -> 0x04e6 }
            if (r0 == 0) goto L_0x0397
            r12 = 0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x039c
            r12 = 1
            r4.putLong(r1, r12)     // Catch:{ all -> 0x04e6 }
            goto L_0x039c
        L_0x0397:
            r12 = 1
            r4.putLong(r1, r12)     // Catch:{ all -> 0x04e6 }
        L_0x039c:
            r14 = 0
            goto L_0x039f
        L_0x039e:
            r14 = 1
        L_0x039f:
            com.google.android.gms.measurement.internal.zzkq r0 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x04e6 }
            if (r14 == 0) goto L_0x03a6
            r12 = 1
            goto L_0x03a8
        L_0x03a6:
            r12 = 0
        L_0x03a8:
            java.lang.String r1 = "_fi"
            java.lang.Long r16 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x04e6 }
            java.lang.String r17 = "auto"
            r12 = r0
            r13 = r1
            r1 = r20
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04e6 }
            r3.zza((com.google.android.gms.measurement.internal.zzkq) r0, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04e6 }
            goto L_0x03bd
        L_0x03bc:
            r1 = r14
        L_0x03bd:
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzj     // Catch:{ NameNotFoundException -> 0x03cf }
            android.content.Context r0 = r0.zzn()     // Catch:{ NameNotFoundException -> 0x03cf }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x03cf }
            java.lang.String r12 = r2.zza     // Catch:{ NameNotFoundException -> 0x03cf }
            r13 = 0
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r12, r13)     // Catch:{ NameNotFoundException -> 0x03cf }
            goto L_0x03e6
        L_0x03cf:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfy r12 = r3.zzj     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzeu r12 = r12.zzr()     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzew r12 = r12.zzf()     // Catch:{ all -> 0x04e6 }
            java.lang.String r13 = r2.zza     // Catch:{ all -> 0x04e6 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzeu.zza((java.lang.String) r13)     // Catch:{ all -> 0x04e6 }
            java.lang.String r14 = "Application info is null, first open report might be inaccurate. appId"
            r12.zza(r14, r13, r0)     // Catch:{ all -> 0x04e6 }
            r0 = 0
        L_0x03e6:
            if (r0 == 0) goto L_0x03fe
            int r12 = r0.flags     // Catch:{ all -> 0x04e6 }
            r13 = 1
            r12 = r12 & r13
            if (r12 == 0) goto L_0x03f3
            r12 = 1
            r4.putLong(r9, r12)     // Catch:{ all -> 0x04e6 }
        L_0x03f3:
            int r0 = r0.flags     // Catch:{ all -> 0x04e6 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x03fe
            r12 = 1
            r4.putLong(r1, r12)     // Catch:{ all -> 0x04e6 }
        L_0x03fe:
            r12 = 0
            int r0 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0407
            r4.putLong(r7, r5)     // Catch:{ all -> 0x04e6 }
        L_0x0407:
            com.google.android.gms.measurement.internal.zzao r0 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzan r14 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x04e6 }
            r14.<init>(r4)     // Catch:{ all -> 0x04e6 }
            java.lang.String r13 = "_f"
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04e6 }
            r3.zzb((com.google.android.gms.measurement.internal.zzao) r0, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04e6 }
            goto L_0x0474
        L_0x041c:
            r9 = 1
            if (r7 != r9) goto L_0x0474
            com.google.android.gms.measurement.internal.zzkq r7 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x04e6 }
            java.lang.String r13 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x04e6 }
            java.lang.String r17 = "auto"
            r12 = r7
            r14 = r10
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x04e6 }
            r3.zza((com.google.android.gms.measurement.internal.zzkq) r7, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04e6 }
            r25.zzw()     // Catch:{ all -> 0x04e6 }
            r25.zzk()     // Catch:{ all -> 0x04e6 }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ all -> 0x04e6 }
            r4.<init>()     // Catch:{ all -> 0x04e6 }
            r12 = 1
            r4.putLong(r6, r12)     // Catch:{ all -> 0x04e6 }
            r4.putLong(r1, r12)     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzfy r1 = r3.zzj     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzy r1 = r1.zzb()     // Catch:{ all -> 0x04e6 }
            java.lang.String r5 = r2.zza     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r6 = com.google.android.gms.measurement.internal.zzaq.zzat     // Catch:{ all -> 0x04e6 }
            boolean r1 = r1.zze(r5, r6)     // Catch:{ all -> 0x04e6 }
            r5 = 1
            if (r1 == 0) goto L_0x0459
            r4.putLong(r8, r5)     // Catch:{ all -> 0x04e6 }
        L_0x0459:
            boolean r1 = r2.zzq     // Catch:{ all -> 0x04e6 }
            if (r1 == 0) goto L_0x0460
            r4.putLong(r0, r5)     // Catch:{ all -> 0x04e6 }
        L_0x0460:
            com.google.android.gms.measurement.internal.zzao r0 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzan r14 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x04e6 }
            r14.<init>(r4)     // Catch:{ all -> 0x04e6 }
            java.lang.String r13 = "_v"
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04e6 }
            r3.zzb((com.google.android.gms.measurement.internal.zzao) r0, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04e6 }
        L_0x0474:
            com.google.android.gms.measurement.internal.zzfy r0 = r3.zzj     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzy r0 = r0.zzb()     // Catch:{ all -> 0x04e6 }
            java.lang.String r1 = r2.zza     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzaq.zzau     // Catch:{ all -> 0x04e6 }
            boolean r0 = r0.zze(r1, r4)     // Catch:{ all -> 0x04e6 }
            if (r0 != 0) goto L_0x04d7
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04e6 }
            r0.<init>()     // Catch:{ all -> 0x04e6 }
            r4 = 1
            r0.putLong(r8, r4)     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzfy r1 = r3.zzj     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzy r1 = r1.zzb()     // Catch:{ all -> 0x04e6 }
            java.lang.String r4 = r2.zza     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzaq.zzat     // Catch:{ all -> 0x04e6 }
            boolean r1 = r1.zze(r4, r5)     // Catch:{ all -> 0x04e6 }
            if (r1 == 0) goto L_0x04a5
            java.lang.String r1 = "_fr"
            r4 = 1
            r0.putLong(r1, r4)     // Catch:{ all -> 0x04e6 }
        L_0x04a5:
            com.google.android.gms.measurement.internal.zzao r1 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzan r14 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x04e6 }
            r14.<init>(r0)     // Catch:{ all -> 0x04e6 }
            java.lang.String r13 = "_e"
            java.lang.String r15 = "auto"
            r12 = r1
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04e6 }
            r3.zzb((com.google.android.gms.measurement.internal.zzao) r1, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04e6 }
            goto L_0x04d7
        L_0x04ba:
            boolean r0 = r2.zzi     // Catch:{ all -> 0x04e6 }
            if (r0 == 0) goto L_0x04d7
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x04e6 }
            r0.<init>()     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzao r1 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzan r14 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x04e6 }
            r14.<init>(r0)     // Catch:{ all -> 0x04e6 }
            java.lang.String r13 = "_cd"
            java.lang.String r15 = "auto"
            r12 = r1
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x04e6 }
            r3.zzb((com.google.android.gms.measurement.internal.zzao) r1, (com.google.android.gms.measurement.internal.zzn) r2)     // Catch:{ all -> 0x04e6 }
        L_0x04d7:
            com.google.android.gms.measurement.internal.zzad r0 = r25.zze()     // Catch:{ all -> 0x04e6 }
            r0.mo7214b_()     // Catch:{ all -> 0x04e6 }
            com.google.android.gms.measurement.internal.zzad r0 = r25.zze()
            r0.zzh()
            return
        L_0x04e6:
            r0 = move-exception
            goto L_0x04ea
        L_0x04e8:
            r0 = move-exception
            r3 = r1
        L_0x04ea:
            com.google.android.gms.measurement.internal.zzad r1 = r25.zze()
            r1.zzh()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.zzb(com.google.android.gms.measurement.internal.zzn):void");
    }

    private final zzn zza(String str) {
        String str2 = str;
        zzf zzb2 = zze().zzb(str2);
        if (zzb2 == null || TextUtils.isEmpty(zzb2.zzl())) {
            this.zzj.zzr().zzw().zza("No app data available; dropping", str2);
            return null;
        }
        Boolean zzb3 = zzb(zzb2);
        if (zzb3 == null || zzb3.booleanValue()) {
            return new zzn(str, zzb2.zze(), zzb2.zzl(), zzb2.zzm(), zzb2.zzn(), zzb2.zzo(), zzb2.zzp(), (String) null, zzb2.zzr(), false, zzb2.zzi(), zzb2.zzae(), 0, 0, zzb2.zzaf(), zzb2.zzag(), false, zzb2.zzf(), zzb2.zzah(), zzb2.zzq(), zzb2.zzai(), (!zzlm.zzb() || !this.zzj.zzb().zze(str2, zzaq.zzbn)) ? null : zzb2.zzg());
        }
        this.zzj.zzr().zzf().zza("App version does not match; dropping. appId", zzeu.zza(str));
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzw zzw2) {
        zzn zza2 = zza(zzw2.zza);
        if (zza2 != null) {
            zza(zzw2, zza2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzw zzw2, zzn zzn2) {
        Preconditions.checkNotNull(zzw2);
        Preconditions.checkNotEmpty(zzw2.zza);
        Preconditions.checkNotNull(zzw2.zzb);
        Preconditions.checkNotNull(zzw2.zzc);
        Preconditions.checkNotEmpty(zzw2.zzc.zza);
        zzw();
        zzk();
        if (zze(zzn2)) {
            if (!zzn2.zzh) {
                zzc(zzn2);
                return;
            }
            zzw zzw3 = new zzw(zzw2);
            boolean z = false;
            zzw3.zze = false;
            zze().zzf();
            try {
                zzw zzd2 = zze().zzd(zzw3.zza, zzw3.zzc.zza);
                if (zzd2 != null && !zzd2.zzb.equals(zzw3.zzb)) {
                    this.zzj.zzr().zzi().zza("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzj.zzj().zzc(zzw3.zzc.zza), zzw3.zzb, zzd2.zzb);
                }
                if (zzd2 != null && zzd2.zze) {
                    zzw3.zzb = zzd2.zzb;
                    zzw3.zzd = zzd2.zzd;
                    zzw3.zzh = zzd2.zzh;
                    zzw3.zzf = zzd2.zzf;
                    zzw3.zzi = zzd2.zzi;
                    zzw3.zze = zzd2.zze;
                    zzw3.zzc = new zzkq(zzw3.zzc.zza, zzd2.zzc.zzb, zzw3.zzc.zza(), zzd2.zzc.zze);
                } else if (TextUtils.isEmpty(zzw3.zzf)) {
                    zzw3.zzc = new zzkq(zzw3.zzc.zza, zzw3.zzd, zzw3.zzc.zza(), zzw3.zzc.zze);
                    zzw3.zze = true;
                    z = true;
                }
                if (zzw3.zze) {
                    zzkq zzkq = zzw3.zzc;
                    zzks zzks = new zzks(zzw3.zza, zzw3.zzb, zzkq.zza, zzkq.zzb, zzkq.zza());
                    if (zze().zza(zzks)) {
                        this.zzj.zzr().zzw().zza("User property updated immediately", zzw3.zza, this.zzj.zzj().zzc(zzks.zzc), zzks.zze);
                    } else {
                        this.zzj.zzr().zzf().zza("(2)Too many active user properties, ignoring", zzeu.zza(zzw3.zza), this.zzj.zzj().zzc(zzks.zzc), zzks.zze);
                    }
                    if (z && zzw3.zzi != null) {
                        zzc(new zzao(zzw3.zzi, zzw3.zzd), zzn2);
                    }
                }
                if (zze().zza(zzw3)) {
                    this.zzj.zzr().zzw().zza("Conditional property added", zzw3.zza, this.zzj.zzj().zzc(zzw3.zzc.zza), zzw3.zzc.zza());
                } else {
                    this.zzj.zzr().zzf().zza("Too many conditional properties, ignoring", zzeu.zza(zzw3.zza), this.zzj.zzj().zzc(zzw3.zzc.zza), zzw3.zzc.zza());
                }
                zze().mo7214b_();
            } finally {
                zze().zzh();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzw zzw2) {
        zzn zza2 = zza(zzw2.zza);
        if (zza2 != null) {
            zzb(zzw2, zza2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzw zzw2, zzn zzn2) {
        Preconditions.checkNotNull(zzw2);
        Preconditions.checkNotEmpty(zzw2.zza);
        Preconditions.checkNotNull(zzw2.zzc);
        Preconditions.checkNotEmpty(zzw2.zzc.zza);
        zzw();
        zzk();
        if (zze(zzn2)) {
            if (!zzn2.zzh) {
                zzc(zzn2);
                return;
            }
            zze().zzf();
            try {
                zzc(zzn2);
                zzw zzd2 = zze().zzd(zzw2.zza, zzw2.zzc.zza);
                if (zzd2 != null) {
                    this.zzj.zzr().zzw().zza("Removing conditional user property", zzw2.zza, this.zzj.zzj().zzc(zzw2.zzc.zza));
                    zze().zze(zzw2.zza, zzw2.zzc.zza);
                    if (zzd2.zze) {
                        zze().zzb(zzw2.zza, zzw2.zzc.zza);
                    }
                    if (zzw2.zzk != null) {
                        Bundle bundle = null;
                        if (zzw2.zzk.zzb != null) {
                            bundle = zzw2.zzk.zzb.zzb();
                        }
                        Bundle bundle2 = bundle;
                        zzc(this.zzj.zzi().zza(zzw2.zza, zzw2.zzk.zza, bundle2, zzd2.zzb, zzw2.zzk.zzd, true, false), zzn2);
                    }
                } else {
                    this.zzj.zzr().zzi().zza("Conditional user property doesn't exist", zzeu.zza(zzw2.zza), this.zzj.zzj().zzc(zzw2.zzc.zza));
                }
                zze().mo7214b_();
            } finally {
                zze().zzh();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0193  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.measurement.internal.zzf zza(com.google.android.gms.measurement.internal.zzn r8, com.google.android.gms.measurement.internal.zzf r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 1
            if (r9 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.zzf r9 = new com.google.android.gms.measurement.internal.zzf
            com.google.android.gms.measurement.internal.zzfy r1 = r7.zzj
            java.lang.String r2 = r8.zza
            r9.<init>(r1, r2)
            com.google.android.gms.measurement.internal.zzfy r1 = r7.zzj
            com.google.android.gms.measurement.internal.zzkr r1 = r1.zzi()
            java.lang.String r1 = r1.zzk()
            r9.zza((java.lang.String) r1)
            r9.zze((java.lang.String) r10)
            goto L_0x0037
        L_0x001d:
            java.lang.String r1 = r9.zzh()
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x0039
            r9.zze((java.lang.String) r10)
            com.google.android.gms.measurement.internal.zzfy r10 = r7.zzj
            com.google.android.gms.measurement.internal.zzkr r10 = r10.zzi()
            java.lang.String r10 = r10.zzk()
            r9.zza((java.lang.String) r10)
        L_0x0037:
            r10 = r0
            goto L_0x003a
        L_0x0039:
            r10 = 0
        L_0x003a:
            java.lang.String r1 = r8.zzb
            java.lang.String r2 = r9.zze()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x004c
            java.lang.String r10 = r8.zzb
            r9.zzb((java.lang.String) r10)
            r10 = r0
        L_0x004c:
            java.lang.String r1 = r8.zzr
            java.lang.String r2 = r9.zzf()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x005e
            java.lang.String r10 = r8.zzr
            r9.zzc((java.lang.String) r10)
            r10 = r0
        L_0x005e:
            boolean r1 = com.google.android.gms.internal.measurement.zzlm.zzb()
            if (r1 == 0) goto L_0x0088
            com.google.android.gms.measurement.internal.zzfy r1 = r7.zzj
            com.google.android.gms.measurement.internal.zzy r1 = r1.zzb()
            java.lang.String r2 = r9.zzc()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzaq.zzbn
            boolean r1 = r1.zze(r2, r3)
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = r8.zzv
            java.lang.String r2 = r9.zzg()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0088
            java.lang.String r10 = r8.zzv
            r9.zzd((java.lang.String) r10)
            r10 = r0
        L_0x0088:
            java.lang.String r1 = r8.zzk
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = r8.zzk
            java.lang.String r2 = r9.zzi()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a2
            java.lang.String r10 = r8.zzk
            r9.zzf((java.lang.String) r10)
            r10 = r0
        L_0x00a2:
            long r1 = r8.zze
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00ba
            long r1 = r8.zze
            long r5 = r9.zzo()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00ba
            long r1 = r8.zze
            r9.zzd((long) r1)
            r10 = r0
        L_0x00ba:
            java.lang.String r1 = r8.zzc
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d4
            java.lang.String r1 = r8.zzc
            java.lang.String r2 = r9.zzl()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00d4
            java.lang.String r10 = r8.zzc
            r9.zzg((java.lang.String) r10)
            r10 = r0
        L_0x00d4:
            long r1 = r8.zzj
            long r5 = r9.zzm()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            long r1 = r8.zzj
            r9.zzc((long) r1)
            r10 = r0
        L_0x00e4:
            java.lang.String r1 = r8.zzd
            if (r1 == 0) goto L_0x00fa
            java.lang.String r1 = r8.zzd
            java.lang.String r2 = r9.zzn()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00fa
            java.lang.String r10 = r8.zzd
            r9.zzh((java.lang.String) r10)
            r10 = r0
        L_0x00fa:
            long r1 = r8.zzf
            long r5 = r9.zzp()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x010a
            long r1 = r8.zzf
            r9.zze((long) r1)
            r10 = r0
        L_0x010a:
            boolean r1 = r8.zzh
            boolean r2 = r9.zzr()
            if (r1 == r2) goto L_0x0118
            boolean r10 = r8.zzh
            r9.zza((boolean) r10)
            r10 = r0
        L_0x0118:
            java.lang.String r1 = r8.zzg
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0132
            java.lang.String r1 = r8.zzg
            java.lang.String r2 = r9.zzac()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0132
            java.lang.String r10 = r8.zzg
            r9.zzi((java.lang.String) r10)
            r10 = r0
        L_0x0132:
            com.google.android.gms.measurement.internal.zzfy r1 = r7.zzj
            com.google.android.gms.measurement.internal.zzy r1 = r1.zzb()
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzaq.zzcl
            boolean r1 = r1.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r2)
            if (r1 != 0) goto L_0x0150
            long r1 = r8.zzl
            long r5 = r9.zzae()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0150
            long r1 = r8.zzl
            r9.zzp(r1)
            r10 = r0
        L_0x0150:
            boolean r1 = r8.zzo
            boolean r2 = r9.zzaf()
            if (r1 == r2) goto L_0x015e
            boolean r10 = r8.zzo
            r9.zzb((boolean) r10)
            r10 = r0
        L_0x015e:
            boolean r1 = r8.zzp
            boolean r2 = r9.zzag()
            if (r1 == r2) goto L_0x016c
            boolean r10 = r8.zzp
            r9.zzc((boolean) r10)
            r10 = r0
        L_0x016c:
            java.lang.Boolean r1 = r8.zzs
            java.lang.Boolean r2 = r9.zzah()
            if (r1 == r2) goto L_0x017a
            java.lang.Boolean r10 = r8.zzs
            r9.zza((java.lang.Boolean) r10)
            r10 = r0
        L_0x017a:
            long r1 = r8.zzt
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0190
            long r1 = r8.zzt
            long r3 = r9.zzq()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0190
            long r1 = r8.zzt
            r9.zzf((long) r1)
            goto L_0x0191
        L_0x0190:
            r0 = r10
        L_0x0191:
            if (r0 == 0) goto L_0x019a
            com.google.android.gms.measurement.internal.zzad r8 = r7.zze()
            r8.zza((com.google.android.gms.measurement.internal.zzf) r9)
        L_0x019a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkj.zza(com.google.android.gms.measurement.internal.zzn, com.google.android.gms.measurement.internal.zzf, java.lang.String):com.google.android.gms.measurement.internal.zzf");
    }

    /* access modifiers changed from: package-private */
    public final zzf zzc(zzn zzn2) {
        zzw();
        zzk();
        Preconditions.checkNotNull(zzn2);
        Preconditions.checkNotEmpty(zzn2.zza);
        zzf zzb2 = zze().zzb(zzn2.zza);
        String zzb3 = this.zzj.zzc().zzb(zzn2.zza);
        if (!zzkz.zzb() || !this.zzj.zzb().zza(zzaq.zzbt)) {
            return zza(zzn2, zzb2, zzb3);
        }
        if (zzb2 == null) {
            zzb2 = new zzf(this.zzj, zzn2.zza);
            zzb2.zza(this.zzj.zzi().zzk());
            zzb2.zze(zzb3);
        } else if (!zzb3.equals(zzb2.zzh())) {
            zzb2.zze(zzb3);
            zzb2.zza(this.zzj.zzi().zzk());
        }
        zzb2.zzb(zzn2.zzb);
        zzb2.zzc(zzn2.zzr);
        if (zzlm.zzb() && this.zzj.zzb().zze(zzb2.zzc(), zzaq.zzbn)) {
            zzb2.zzd(zzn2.zzv);
        }
        if (!TextUtils.isEmpty(zzn2.zzk)) {
            zzb2.zzf(zzn2.zzk);
        }
        if (zzn2.zze != 0) {
            zzb2.zzd(zzn2.zze);
        }
        if (!TextUtils.isEmpty(zzn2.zzc)) {
            zzb2.zzg(zzn2.zzc);
        }
        zzb2.zzc(zzn2.zzj);
        if (zzn2.zzd != null) {
            zzb2.zzh(zzn2.zzd);
        }
        zzb2.zze(zzn2.zzf);
        zzb2.zza(zzn2.zzh);
        if (!TextUtils.isEmpty(zzn2.zzg)) {
            zzb2.zzi(zzn2.zzg);
        }
        if (!this.zzj.zzb().zza(zzaq.zzcl)) {
            zzb2.zzp(zzn2.zzl);
        }
        zzb2.zzb(zzn2.zzo);
        zzb2.zzc(zzn2.zzp);
        zzb2.zza(zzn2.zzs);
        zzb2.zzf(zzn2.zzt);
        if (zzb2.zza()) {
            zze().zza(zzb2);
        }
        return zzb2;
    }

    /* access modifiers changed from: package-private */
    public final String zzd(zzn zzn2) {
        try {
            return (String) this.zzj.zzq().zza(new zzkm(this, zzn2)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zzj.zzr().zzf().zza("Failed to get app instance id. appId", zzeu.zza(zzn2.zza), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(boolean z) {
        zzz();
    }

    private final boolean zze(zzn zzn2) {
        return (!zzlm.zzb() || !this.zzj.zzb().zze(zzn2.zza, zzaq.zzbn)) ? !TextUtils.isEmpty(zzn2.zzb) || !TextUtils.isEmpty(zzn2.zzr) : !TextUtils.isEmpty(zzn2.zzb) || !TextUtils.isEmpty(zzn2.zzv) || !TextUtils.isEmpty(zzn2.zzr);
    }
}
