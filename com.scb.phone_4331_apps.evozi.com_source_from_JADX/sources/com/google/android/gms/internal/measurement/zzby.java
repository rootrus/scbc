package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.measurement.zzfo;
import java.util.Collections;
import java.util.List;

public final class zzby {

    public static final class zza extends zzfo<zza, C10568zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zza zzh;
        private static volatile zzhj<zza> zzi;
        private int zzc;
        private String zzd = "";
        private boolean zze;
        private boolean zzf;
        private int zzg;

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.measurement.zzby$zza$zza  reason: collision with other inner class name */
        public static final class C10568zza extends zzfo.zza<zza, C10568zza> implements zzgy {
            private C10568zza() {
                super(zza.zzh);
            }

            public final String zza() {
                return ((zza) this.zza).zza();
            }

            public final C10568zza zza(String str) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((zza) this.zza).zza(str);
                return this;
            }

            public final boolean zzb() {
                return ((zza) this.zza).zzb();
            }

            public final boolean zzc() {
                return ((zza) this.zza).zzc();
            }

            public final boolean zzd() {
                return ((zza) this.zza).zzd();
            }

            public final int zze() {
                return ((zza) this.zza).zze();
            }

            /* synthetic */ C10568zza(zzca zzca) {
                this();
            }
        }

        public final String zza() {
            return this.zzd;
        }

        /* access modifiers changed from: private */
        public final void zza(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        public final boolean zzb() {
            return this.zze;
        }

        public final boolean zzc() {
            return this.zzf;
        }

        public final boolean zzd() {
            return (this.zzc & 8) != 0;
        }

        public final int zze() {
            return this.zzg;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzca.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C10568zza((zzca) null);
                case 3:
                    return zza((zzgw) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzhj<zza> zzhj = zzi;
                    if (zzhj == null) {
                        synchronized (zza.class) {
                            zzhj = zzi;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzh);
                                zzi = zzhj;
                            }
                        }
                    }
                    return zzhj;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zza = new zza();
            zzh = zza;
            zzfo.zza(zza.class, zza);
        }
    }

    public static final class zzb extends zzfo<zzb, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzb zzl;
        private static volatile zzhj<zzb> zzm;
        private int zzc;
        private long zzd;
        private String zze = "";
        private int zzf;
        private zzfx<zzc> zzg = zzbp();
        private zzfx<zza> zzh = zzbp();
        private zzfx<zzbt.zza> zzi = zzbp();
        private String zzj = "";
        private boolean zzk;

        private zzb() {
        }

        public static final class zza extends zzfo.zza<zzb, zza> implements zzgy {
            private zza() {
                super(zzb.zzl);
            }

            public final int zza() {
                return ((zzb) this.zza).zzf();
            }

            public final zza zza(int i) {
                return ((zzb) this.zza).zza(i);
            }

            public final zza zza(int i, zza.C10568zza zza) {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((zzb) this.zza).zza(i, (zza) ((zzfo) zza.zzv()));
                return this;
            }

            public final List<zzbt.zza> zzb() {
                return Collections.unmodifiableList(((zzb) this.zza).zzg());
            }

            public final zza zzc() {
                if (this.zzb) {
                    zzq();
                    this.zzb = false;
                }
                ((zzb) this.zza).zzl();
                return this;
            }

            /* synthetic */ zza(zzca zzca) {
                this();
            }
        }

        public final boolean zza() {
            return (this.zzc & 1) != 0;
        }

        public final long zzb() {
            return this.zzd;
        }

        public final boolean zzc() {
            return (this.zzc & 2) != 0;
        }

        public final String zzd() {
            return this.zze;
        }

        public final List<zzc> zze() {
            return this.zzg;
        }

        public final int zzf() {
            return this.zzh.size();
        }

        public final zza zza(int i) {
            return (zza) this.zzh.get(i);
        }

        /* access modifiers changed from: private */
        public final void zza(int i, zza zza2) {
            zza2.getClass();
            zzfx<zza> zzfx = this.zzh;
            if (!zzfx.zza()) {
                this.zzh = zzfo.zza(zzfx);
            }
            this.zzh.set(i, zza2);
        }

        public final List<zzbt.zza> zzg() {
            return this.zzi;
        }

        /* access modifiers changed from: private */
        public final void zzl() {
            this.zzi = zzbp();
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public static zza zzi() {
            return (zza) zzl.zzbk();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzca.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzca) null);
                case 3:
                    return zza((zzgw) zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzc.class, "zzh", zza.class, "zzi", zzbt.zza.class, "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    zzhj<zzb> zzhj = zzm;
                    if (zzhj == null) {
                        synchronized (zzb.class) {
                            zzhj = zzm;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzl);
                                zzm = zzhj;
                            }
                        }
                    }
                    return zzhj;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzb zzj() {
            return zzl;
        }

        static {
            zzb zzb = new zzb();
            zzl = zzb;
            zzfo.zza(zzb.class, zzb);
        }
    }

    public static final class zzc extends zzfo<zzc, zza> implements zzgy {
        /* access modifiers changed from: private */
        public static final zzc zzf;
        private static volatile zzhj<zzc> zzg;
        private int zzc;
        private String zzd = "";
        private String zze = "";

        private zzc() {
        }

        public static final class zza extends zzfo.zza<zzc, zza> implements zzgy {
            private zza() {
                super(zzc.zzf);
            }

            /* synthetic */ zza(zzca zzca) {
                this();
            }
        }

        public final String zza() {
            return this.zzd;
        }

        public final String zzb() {
            return this.zze;
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzca.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzca) null);
                case 3:
                    return zza((zzgw) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzhj<zzc> zzhj = zzg;
                    if (zzhj == null) {
                        synchronized (zzc.class) {
                            zzhj = zzg;
                            if (zzhj == null) {
                                zzhj = new zzfo.zzc<>(zzf);
                                zzg = zzhj;
                            }
                        }
                    }
                    return zzhj;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzc zzc2 = new zzc();
            zzf = zzc2;
            zzfo.zza(zzc.class, zzc2);
        }
    }
}
