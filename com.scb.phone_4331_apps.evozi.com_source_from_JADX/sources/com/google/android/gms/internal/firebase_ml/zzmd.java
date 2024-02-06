package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzqs;
import com.google.android.gms.internal.firebase_ml.zzue;

public final class zzmd {

    public static final class zza extends zzue<zza, C10799zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zza zzadz;
        private static volatile zzvz<zza> zzbm;
        private zzs zzadw;
        private zzb zzadx;
        private zzr zzady;
        private int zzbg;

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzmd$zza$zza  reason: collision with other inner class name */
        public static final class C10799zza extends zzue.zza<zza, C10799zza> implements zzvq {
            private C10799zza() {
                super(zza.zzadz);
            }

            /* synthetic */ C10799zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C10799zza((zzme) null);
                case 3:
                    return zza((zzvo) zzadz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzadz;
                case 5:
                    zzvz<zza> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zza.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzadz);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
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
            zzadz = zza;
            zzue.zza(zza.class, zza);
        }
    }

    public static final class zzaa extends zzue<zzaa, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzaa zzaoh;
        private static volatile zzvz<zzaa> zzbm;
        private zzs zzadw;
        private zzun<zzc> zzaod = zzrb();
        private int zzaoe;
        private int zzaof;
        private int zzaog;
        private int zzbg;

        public enum zzb implements zzuh {
            NO_ERROR(0),
            STATUS_SENSITIVE_TOPIC(1),
            STATUS_QUALITY_THRESHOLDED(2),
            STATUS_INTERNAL_ERROR(3),
            STATUS_NOT_SUPPORTED_LANGUAGE(101);
            
            private static final zzui<zzb> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static zzb zzbi(int i) {
                if (i == 0) {
                    return NO_ERROR;
                }
                if (i == 1) {
                    return STATUS_SENSITIVE_TOPIC;
                }
                if (i == 2) {
                    return STATUS_QUALITY_THRESHOLDED;
                }
                if (i == 3) {
                    return STATUS_INTERNAL_ERROR;
                }
                if (i != 101) {
                    return null;
                }
                return STATUS_NOT_SUPPORTED_LANGUAGE;
            }

            public static zzuj zzq() {
                return zznj.zzbs;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzni();
            }
        }

        public static final class zzc extends zzue<zzc, zza> implements zzvq {
            /* access modifiers changed from: private */
            public static final zzc zzaoo;
            private static volatile zzvz<zzc> zzbm;
            private float zzanw;
            private int zzbg;

            private zzc() {
            }

            public static final class zza extends zzue.zza<zzc, zza> implements zzvq {
                private zza() {
                    super(zzc.zzaoo);
                }

                /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza((zzme) null);
                    case 3:
                        return zza((zzvo) zzaoo, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new Object[]{"zzbg", "zzanw"});
                    case 4:
                        return zzaoo;
                    case 5:
                        zzvz<zzc> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzc.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzaoo);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzc zzc = new zzc();
                zzaoo = zzc;
                zzue.zza(zzc.class, zzc);
            }
        }

        private zzaa() {
        }

        public static final class zza extends zzue.zza<zzaa, zza> implements zzvq {
            private zza() {
                super(zzaa.zzaoh);
            }

            public final zza zzg(zzs.zza zza) {
                zzrf();
                ((zzaa) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzb(zzb zzb) {
                zzrf();
                ((zzaa) this.zzbol).zza(zzb);
                return this;
            }

            public final zza zzbg(int i) {
                zzrf();
                ((zzaa) this.zzbol).zzbe(i);
                return this;
            }

            public final zza zzbh(int i) {
                zzrf();
                ((zzaa) this.zzbol).zzbf(i);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzb zzb2) {
            if (zzb2 != null) {
                this.zzbg |= 2;
                this.zzaoe = zzb2.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbe(int i) {
            this.zzbg |= 4;
            this.zzaof = i;
        }

        /* access modifiers changed from: private */
        public final void zzbf(int i) {
            this.zzbg |= 8;
            this.zzaog = i;
        }

        public static zza zzla() {
            return (zza) zzaoh.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzaa();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaoh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001\u0004\u0004\u0002\u0005\u0004\u0003", new Object[]{"zzbg", "zzadw", "zzaod", zzc.class, "zzaoe", zzb.zzq(), "zzaof", "zzaog"});
                case 4:
                    return zzaoh;
                case 5:
                    zzvz<zzaa> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzaa.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaoh);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzaa zzlb() {
            return zzaoh;
        }

        static {
            zzaa zzaa = new zzaa();
            zzaoh = zzaa;
            zzue.zza(zzaa.class, zzaa);
        }
    }

    public static final class zzab extends zzue<zzab, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzab zzaop;
        private static volatile zzvz<zzab> zzbm;
        private zzs zzadw;
        private zzr zzady;
        private int zzbg;

        private zzab() {
        }

        public static final class zza extends zzue.zza<zzab, zza> implements zzvq {
            private zza() {
                super(zzab.zzaop);
            }

            public final zza zzh(zzs.zza zza) {
                zzrf();
                ((zzab) this.zzbol).zza(zza);
                return this;
            }

            public final zza zze(zzr zzr) {
                zzrf();
                ((zzab) this.zzbol).zza(zzr);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzr zzr) {
            if (zzr != null) {
                this.zzady = zzr;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        public static zza zzle() {
            return (zza) zzaop.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzab();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaop, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"zzbg", "zzadw", "zzady"});
                case 4:
                    return zzaop;
                case 5:
                    zzvz<zzab> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzab.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaop);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzab zzlf() {
            return zzaop;
        }

        static {
            zzab zzab = new zzab();
            zzaop = zzab;
            zzue.zza(zzab.class, zzab);
        }
    }

    public static final class zzac extends zzue<zzac, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzac zzaoy;
        private static volatile zzvz<zzac> zzbm;
        private String zzaoq = "";
        private String zzaor = "";
        private String zzaos = "";
        private String zzaot = "";
        private String zzaou = "";
        private String zzaov = "";
        private String zzaow = "";
        private zzun<String> zzaox = zzue.zzrb();
        private int zzbg;

        private zzac() {
        }

        public static final class zza extends zzue.zza<zzac, zza> implements zzvq {
            private zza() {
                super(zzac.zzaoy);
            }

            public final zza zzbq(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbj(str);
                return this;
            }

            public final zza zzbr(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbk(str);
                return this;
            }

            public final zza zzbs(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbl(str);
                return this;
            }

            public final zza zzbt(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbm(str);
                return this;
            }

            public final zza zzbu(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbn(str);
                return this;
            }

            public final zza zzbv(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbo(str);
                return this;
            }

            public final zza zzbw(String str) {
                zzrf();
                ((zzac) this.zzbol).zzbp(str);
                return this;
            }

            public final zza zzn(Iterable<String> iterable) {
                zzrf();
                ((zzac) this.zzbol).zzm(iterable);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzbj(String str) {
            if (str != null) {
                this.zzbg |= 1;
                this.zzaoq = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbk(String str) {
            if (str != null) {
                this.zzbg |= 2;
                this.zzaor = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbl(String str) {
            if (str != null) {
                this.zzbg |= 4;
                this.zzaos = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbm(String str) {
            if (str != null) {
                this.zzbg |= 8;
                this.zzaot = str;
                return;
            }
            throw null;
        }

        public final String zzlh() {
            return this.zzaou;
        }

        /* access modifiers changed from: private */
        public final void zzbn(String str) {
            if (str != null) {
                this.zzbg |= 16;
                this.zzaou = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbo(String str) {
            if (str != null) {
                this.zzbg |= 32;
                this.zzaov = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbp(String str) {
            if (str != null) {
                this.zzbg |= 64;
                this.zzaow = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzm(Iterable<String> iterable) {
            if (!this.zzaox.zzps()) {
                this.zzaox = zzue.zza(this.zzaox);
            }
            zzsn.zza(iterable, this.zzaox);
        }

        public static zza zzli() {
            return (zza) zzaoy.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzac();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaoy, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\u001a", new Object[]{"zzbg", "zzaoq", "zzaor", "zzaos", "zzaot", "zzaou", "zzaov", "zzaow", "zzaox"});
                case 4:
                    return zzaoy;
                case 5:
                    zzvz<zzac> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzac.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaoy);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzac zzlj() {
            return zzaoy;
        }

        static {
            zzac zzac = new zzac();
            zzaoy = zzac;
            zzue.zza(zzac.class, zzac);
        }
    }

    public static final class zzb extends zzue<zzb, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzb zzaeb;
        private static volatile zzvz<zzb> zzbm;
        private int zzaea;
        private int zzbg;
        private int zzqo;

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzmd$zzb$zzb  reason: collision with other inner class name */
        public enum C10800zzb implements zzuh {
            UNKNOWN_MODEL_TYPE(0),
            STABLE_MODEL(1),
            LATEST_MODEL(2);
            
            private static final zzui<C10800zzb> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static C10800zzb zzam(int i) {
                if (i == 0) {
                    return UNKNOWN_MODEL_TYPE;
                }
                if (i == 1) {
                    return STABLE_MODEL;
                }
                if (i != 2) {
                    return null;
                }
                return LATEST_MODEL;
            }

            public static zzuj zzq() {
                return zzmg.zzbs;
            }

            private C10800zzb(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzmf();
            }
        }

        private zzb() {
        }

        public static final class zza extends zzue.zza<zzb, zza> implements zzvq {
            private zza() {
                super(zzb.zzaeb);
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaeb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001", new Object[]{"zzbg", "zzqo", "zzaea", C10800zzb.zzq()});
                case 4:
                    return zzaeb;
                case 5:
                    zzvz<zzb> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzb.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaeb);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzb zzb = new zzb();
            zzaeb = zzb;
            zzue.zza(zzb.class, zzb);
        }
    }

    public static final class zzc extends zzue<zzc, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzc zzaeg;
        private static volatile zzvz<zzc> zzbm;
        private zzs zzadw;
        private zzb zzadx;
        private zzr zzady;
        private int zzbg;

        private zzc() {
        }

        public static final class zza extends zzue.zza<zzc, zza> implements zzvq {
            private zza() {
                super(zzc.zzaeg);
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaeg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaeg;
                case 5:
                    zzvz<zzc> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzc.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaeg);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzc zzc = new zzc();
            zzaeg = zzc;
            zzue.zza(zzc.class, zzc);
        }
    }

    public static final class zzd extends zzue<zzd, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzd zzaeh;
        private static volatile zzvz<zzd> zzbm;
        private zzs zzadw;
        private zzb zzadx;
        private zzr zzady;
        private int zzbg;

        private zzd() {
        }

        public static final class zza extends zzue.zza<zzd, zza> implements zzvq {
            private zza() {
                super(zzd.zzaeh);
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaeh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaeh;
                case 5:
                    zzvz<zzd> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzd.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaeh);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzd zzd = new zzd();
            zzaeh = zzd;
            zzue.zza(zzd.class, zzd);
        }
    }

    public static final class zze extends zzue<zze, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zze zzaei;
        private static volatile zzvz<zze> zzbm;
        private zzs zzadw;
        private zzb zzadx;
        private zzr zzady;
        private int zzbg;

        private zze() {
        }

        public static final class zza extends zzue.zza<zze, zza> implements zzvq {
            private zza() {
                super(zze.zzaei);
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaei, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaei;
                case 5:
                    zzvz<zze> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zze.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaei);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zze zze = new zze();
            zzaei = zze;
            zzue.zza(zze.class, zze);
        }
    }

    public static final class zzf extends zzue<zzf, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzf zzaej;
        private static volatile zzvz<zzf> zzbm;
        private zzs zzadw;
        private zzb zzadx;
        private zzr zzady;
        private int zzbg;

        private zzf() {
        }

        public static final class zza extends zzue.zza<zzf, zza> implements zzvq {
            private zza() {
                super(zzf.zzaej);
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaej, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaej;
                case 5:
                    zzvz<zzf> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzf.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaej);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzf zzf = new zzf();
            zzaej = zzf;
            zzue.zza(zzf.class, zzf);
        }
    }

    public static final class zzg extends zzue<zzg, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzg zzaek;
        private static volatile zzvz<zzg> zzbm;
        private zzs zzadw;
        private zzb zzadx;
        private zzr zzady;
        private int zzbg;

        private zzg() {
        }

        public static final class zza extends zzue.zza<zzg, zza> implements zzvq {
            private zza() {
                super(zzg.zzaek);
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaek, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaek;
                case 5:
                    zzvz<zzg> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzg.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaek);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzg zzg = new zzg();
            zzaek = zzg;
            zzue.zza(zzg.class, zzg);
        }
    }

    public static final class zzh extends zzue<zzh, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzh zzael;
        private static volatile zzvz<zzh> zzbm;
        private zzs zzadw;
        private zzb zzadx;
        private zzr zzady;
        private int zzbg;

        private zzh() {
        }

        public static final class zza extends zzue.zza<zzh, zza> implements zzvq {
            private zza() {
                super(zzh.zzael);
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzael, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzael;
                case 5:
                    zzvz<zzh> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzh.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzael);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzh zzh = new zzh();
            zzael = zzh;
            zzue.zza(zzh.class, zzh);
        }
    }

    public static final class zzi extends zzue<zzi, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzi zzaem;
        private static volatile zzvz<zzi> zzbm;
        private zzs zzadw;
        private zzb zzadx;
        private zzr zzady;
        private int zzbg;

        private zzi() {
        }

        public static final class zza extends zzue.zza<zzi, zza> implements zzvq {
            private zza() {
                super(zzi.zzaem);
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaem, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaem;
                case 5:
                    zzvz<zzi> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzi.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaem);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzi zzi = new zzi();
            zzaem = zzi;
            zzue.zza(zzi.class, zzi);
        }
    }

    public static final class zzj extends zzue<zzj, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzj zzaen;
        private static volatile zzvz<zzj> zzbm;
        private zzs zzadw;
        private zzb zzadx;
        private zzr zzady;
        private int zzbg;

        private zzj() {
        }

        public static final class zza extends zzue.zza<zzj, zza> implements zzvq {
            private zza() {
                super(zzj.zzaen);
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaen, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaen;
                case 5:
                    zzvz<zzj> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzj.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaen);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzj zzj = new zzj();
            zzaen = zzj;
            zzue.zza(zzj.class, zzj);
        }
    }

    public static final class zzk extends zzue<zzk, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzk zzaeo;
        private static volatile zzvz<zzk> zzbm;
        private zzs zzadw;
        private zzb zzadx;
        private zzr zzady;
        private int zzbg;

        private zzk() {
        }

        public static final class zza extends zzue.zza<zzk, zza> implements zzvq {
            private zza() {
                super(zzk.zzaeo);
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaeo, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzadx", "zzady"});
                case 4:
                    return zzaeo;
                case 5:
                    zzvz<zzk> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzk.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaeo);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzk zzk = new zzk();
            zzaeo = zzk;
            zzue.zza(zzk.class, zzk);
        }
    }

    public static final class zzl extends zzue<zzl, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzl zzaes;
        private static volatile zzvz<zzl> zzbm;
        private zzo zzaep;
        private long zzaeq;
        private int zzaer;
        private int zzbg;

        private zzl() {
        }

        public static final class zza extends zzue.zza<zzl, zza> implements zzvq {
            private zza() {
                super(zzl.zzaes);
            }

            public final zza zzb(zzo zzo) {
                zzrf();
                ((zzl) this.zzbol).zza(zzo);
                return this;
            }

            public final zza zzi(long j) {
                zzrf();
                ((zzl) this.zzbol).zzh(j);
                return this;
            }

            public final zza zzb(zzmk zzmk) {
                zzrf();
                ((zzl) this.zzbol).zza(zzmk);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzo zzo) {
            if (zzo != null) {
                this.zzaep = zzo;
                this.zzbg |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzh(long j) {
            this.zzbg |= 2;
            this.zzaeq = j;
        }

        /* access modifiers changed from: private */
        public final void zza(zzmk zzmk) {
            if (zzmk != null) {
                this.zzbg |= 4;
                this.zzaer = zzmk.zzo();
                return;
            }
            throw null;
        }

        public static zza zzji() {
            return (zza) zzaes.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaes, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\u0003\u0001\u0003\f\u0002", new Object[]{"zzbg", "zzaep", "zzaeq", "zzaer", zzmk.zzq()});
                case 4:
                    return zzaes;
                case 5:
                    zzvz<zzl> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzl.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaes);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzl zzl = new zzl();
            zzaes = zzl;
            zzue.zza(zzl.class, zzl);
        }
    }

    public static final class zzm extends zzue<zzm, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzm zzaew;
        private static volatile zzvz<zzm> zzbm;
        private zzs zzadw;
        private zzo zzaep;
        private zzun<zzb> zzaet = zzrb();
        private zzun<zzb> zzaeu = zzrb();
        private long zzaev;
        private int zzbg;

        public static final class zzb extends zzue<zzb, zza> implements zzvq {
            /* access modifiers changed from: private */
            public static final zzb zzaez;
            private static volatile zzvz<zzb> zzbm;
            private int zzaex;
            private zzul zzaey = zzqz();
            private int zzbg;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzmd$zzm$zzb$zzb  reason: collision with other inner class name */
            public enum C10801zzb implements zzuh {
                UNKNOWN_DATA_TYPE(0),
                TYPE_FLOAT32(1),
                TYPE_INT32(2),
                TYPE_BYTE(3),
                TYPE_LONG(4);
                
                private static final zzui<C10801zzb> zzbe = null;
                private final int value;

                public final int zzo() {
                    return this.value;
                }

                public static C10801zzb zzan(int i) {
                    if (i == 0) {
                        return UNKNOWN_DATA_TYPE;
                    }
                    if (i == 1) {
                        return TYPE_FLOAT32;
                    }
                    if (i == 2) {
                        return TYPE_INT32;
                    }
                    if (i == 3) {
                        return TYPE_BYTE;
                    }
                    if (i != 4) {
                        return null;
                    }
                    return TYPE_LONG;
                }

                public static zzuj zzq() {
                    return zzmi.zzbs;
                }

                private C10801zzb(int i) {
                    this.value = i;
                }

                static {
                    zzbe = new zzmh();
                }
            }

            private zzb() {
            }

            public static final class zza extends zzue.zza<zzb, zza> implements zzvq {
                private zza() {
                    super(zzb.zzaez);
                }

                public final zza zzb(C10801zzb zzb) {
                    zzrf();
                    ((zzb) this.zzbol).zza(zzb);
                    return this;
                }

                public final zza zzf(Iterable<? extends Integer> iterable) {
                    zzrf();
                    ((zzb) this.zzbol).zze(iterable);
                    return this;
                }

                /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(C10801zzb zzb) {
                if (zzb != null) {
                    this.zzbg |= 1;
                    this.zzaex = zzb.zzo();
                    return;
                }
                throw null;
            }

            /* access modifiers changed from: private */
            public final void zze(Iterable<? extends Integer> iterable) {
                if (!this.zzaey.zzps()) {
                    this.zzaey = zzue.zza(this.zzaey);
                }
                zzsn.zza(iterable, this.zzaey);
            }

            public static zza zzjm() {
                return (zza) zzaez.zzqx();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new zza((zzme) null);
                    case 3:
                        return zza((zzvo) zzaez, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u0016", new Object[]{"zzbg", "zzaex", C10801zzb.zzq(), "zzaey"});
                    case 4:
                        return zzaez;
                    case 5:
                        zzvz<zzb> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzb.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzaez);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzb zzb = new zzb();
                zzaez = zzb;
                zzue.zza(zzb.class, zzb);
            }
        }

        private zzm() {
        }

        public static final class zza extends zzue.zza<zzm, zza> implements zzvq {
            private zza() {
                super(zzm.zzaew);
            }

            public final zza zzb(zzs.zza zza) {
                zzrf();
                ((zzm) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzc(zzo zzo) {
                zzrf();
                ((zzm) this.zzbol).zza(zzo);
                return this;
            }

            public final zza zzc(Iterable<? extends zzb> iterable) {
                zzrf();
                ((zzm) this.zzbol).zza(iterable);
                return this;
            }

            public final zza zzd(Iterable<? extends zzb> iterable) {
                zzrf();
                ((zzm) this.zzbol).zzb(iterable);
                return this;
            }

            public final zza zzk(long j) {
                zzrf();
                ((zzm) this.zzbol).zzj(j);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzo zzo) {
            if (zzo != null) {
                this.zzaep = zzo;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(Iterable<? extends zzb> iterable) {
            if (!this.zzaet.zzps()) {
                this.zzaet = zzue.zza(this.zzaet);
            }
            zzsn.zza(iterable, this.zzaet);
        }

        /* access modifiers changed from: private */
        public final void zzb(Iterable<? extends zzb> iterable) {
            if (!this.zzaeu.zzps()) {
                this.zzaeu = zzue.zza(this.zzaeu);
            }
            zzsn.zza(iterable, this.zzaeu);
        }

        /* access modifiers changed from: private */
        public final void zzj(long j) {
            this.zzbg |= 4;
            this.zzaev = j;
        }

        public static zza zzjk() {
            return (zza) zzaew.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaew, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001b\u0004\u001b\u0005\u0003\u0002", new Object[]{"zzbg", "zzadw", "zzaep", "zzaet", zzb.class, "zzaeu", zzb.class, "zzaev"});
                case 4:
                    return zzaew;
                case 5:
                    zzvz<zzm> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzm.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaew);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzm zzm = new zzm();
            zzaew = zzm;
            zzue.zza(zzm.class, zzm);
        }
    }

    public static final class zzn extends zzue<zzn, zza> implements zzvq {
        private static final zzum<Integer, zzmk> zzafj = new zzmj();
        /* access modifiers changed from: private */
        public static final zzn zzafl;
        private static volatile zzvz<zzn> zzbm;
        private long zzaev;
        private zzo zzafg;
        private zzo zzafh;
        private zzul zzafi = zzqz();
        private boolean zzafk;
        private int zzbg;

        private zzn() {
        }

        public static final class zza extends zzue.zza<zzn, zza> implements zzvq {
            private zza() {
                super(zzn.zzafl);
            }

            public final zza zzf(zzo zzo) {
                zzrf();
                ((zzn) this.zzbol).zzd(zzo);
                return this;
            }

            public final zza zzg(zzo zzo) {
                zzrf();
                ((zzn) this.zzbol).zze(zzo);
                return this;
            }

            public final zza zzh(Iterable<? extends zzmk> iterable) {
                zzrf();
                ((zzn) this.zzbol).zzg(iterable);
                return this;
            }

            public final zza zzl(long j) {
                zzrf();
                ((zzn) this.zzbol).zzj(j);
                return this;
            }

            public final zza zzl(boolean z) {
                zzrf();
                ((zzn) this.zzbol).zzk(z);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzd(zzo zzo) {
            if (zzo != null) {
                this.zzafg = zzo;
                this.zzbg |= 1;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zze(zzo zzo) {
            if (zzo != null) {
                this.zzafh = zzo;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzg(Iterable<? extends zzmk> iterable) {
            if (!this.zzafi.zzps()) {
                this.zzafi = zzue.zza(this.zzafi);
            }
            for (zzmk zzo : iterable) {
                this.zzafi.zzdh(zzo.zzo());
            }
        }

        /* access modifiers changed from: private */
        public final void zzj(long j) {
            this.zzbg |= 4;
            this.zzaev = j;
        }

        /* access modifiers changed from: private */
        public final void zzk(boolean z) {
            this.zzbg |= 8;
            this.zzafk = z;
        }

        public static zza zzjo() {
            return (zza) zzafl.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzafl, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001e\u0004\u0003\u0002\u0005\u0007\u0003", new Object[]{"zzbg", "zzafg", "zzafh", "zzafi", zzmk.zzq(), "zzaev", "zzafk"});
                case 4:
                    return zzafl;
                case 5:
                    zzvz<zzn> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzn.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzafl);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzn zzn = new zzn();
            zzafl = zzn;
            zzue.zza(zzn.class, zzn);
        }
    }

    public static final class zzo extends zzue<zzo, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzo zzafq;
        private static volatile zzvz<zzo> zzbm;
        private zzu zzafm;
        private zzb zzafn;
        private zzb zzafo;
        private boolean zzafp;
        private int zzbg;

        public static final class zzb extends zzue<zzb, zza> implements zzvq {
            /* access modifiers changed from: private */
            public static final zzb zzafv;
            private static volatile zzvz<zzb> zzbm;
            private boolean zzafr;
            private boolean zzafs;
            private boolean zzaft;
            private boolean zzafu;
            private int zzbg;

            private zzb() {
            }

            public static final class zza extends zzue.zza<zzb, zza> implements zzvq {
                private zza() {
                    super(zzb.zzafv);
                }

                public final zza zzr(boolean z) {
                    zzrf();
                    ((zzb) this.zzbol).zzo(z);
                    return this;
                }

                public final zza zzs(boolean z) {
                    zzrf();
                    ((zzb) this.zzbol).zzp(z);
                    return this;
                }

                public final zza zzt(boolean z) {
                    zzrf();
                    ((zzb) this.zzbol).zzq(z);
                    return this;
                }

                /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzo(boolean z) {
                this.zzbg |= 1;
                this.zzafr = z;
            }

            /* access modifiers changed from: private */
            public final void zzp(boolean z) {
                this.zzbg |= 2;
                this.zzafs = z;
            }

            /* access modifiers changed from: private */
            public final void zzq(boolean z) {
                this.zzbg |= 4;
                this.zzaft = z;
            }

            public static zza zzjs() {
                return (zza) zzafv.zzqx();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new zza((zzme) null);
                    case 3:
                        return zza((zzvo) zzafv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003", new Object[]{"zzbg", "zzafr", "zzafs", "zzaft", "zzafu"});
                    case 4:
                        return zzafv;
                    case 5:
                        zzvz<zzb> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzb.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzafv);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzb zzb = new zzb();
                zzafv = zzb;
                zzue.zza(zzb.class, zzb);
            }
        }

        private zzo() {
        }

        public static final class zza extends zzue.zza<zzo, zza> implements zzvq {
            private zza() {
                super(zzo.zzafq);
            }

            public final zza zzb(zzu.zza zza) {
                zzrf();
                ((zzo) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzc(zzb zzb) {
                zzrf();
                ((zzo) this.zzbol).zza(zzb);
                return this;
            }

            public final zza zzd(zzb zzb) {
                zzrf();
                ((zzo) this.zzbol).zzb(zzb);
                return this;
            }

            public final zza zzn(boolean z) {
                zzrf();
                ((zzo) this.zzbol).zzm(z);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzu.zza zza2) {
            this.zzafm = (zzu) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzb zzb2) {
            if (zzb2 != null) {
                this.zzafn = zzb2;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzb(zzb zzb2) {
            if (zzb2 != null) {
                this.zzafo = zzb2;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzm(boolean z) {
            this.zzbg |= 8;
            this.zzafp = z;
        }

        public static zza zzjq() {
            return (zza) zzafq.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzafq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzbg", "zzafm", "zzafn", "zzafo", "zzafp"});
                case 4:
                    return zzafq;
                case 5:
                    zzvz<zzo> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzo.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzafq);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzo zzo = new zzo();
            zzafq = zzo;
            zzue.zza(zzo.class, zzo);
        }
    }

    public static final class zzp extends zzue<zzp, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzp zzajh;
        private static volatile zzvz<zzp> zzbm;
        private int zzajb;
        private int zzajc;
        private int zzajd;
        private int zzaje;
        private boolean zzajf;
        private float zzajg;
        private int zzbg;

        public enum zzb implements zzuh {
            UNKNOWN_CLASSIFICATIONS(0),
            NO_CLASSIFICATIONS(1),
            ALL_CLASSIFICATIONS(2);
            
            private static final zzui<zzb> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static zzb zzaq(int i) {
                if (i == 0) {
                    return UNKNOWN_CLASSIFICATIONS;
                }
                if (i == 1) {
                    return NO_CLASSIFICATIONS;
                }
                if (i != 2) {
                    return null;
                }
                return ALL_CLASSIFICATIONS;
            }

            public static zzuj zzq() {
                return zzmr.zzbs;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzmq();
            }
        }

        public enum zzc implements zzuh {
            UNKNOWN_CONTOURS(0),
            NO_CONTOURS(1),
            ALL_CONTOURS(2);
            
            private static final zzui<zzc> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static zzc zzar(int i) {
                if (i == 0) {
                    return UNKNOWN_CONTOURS;
                }
                if (i == 1) {
                    return NO_CONTOURS;
                }
                if (i != 2) {
                    return null;
                }
                return ALL_CONTOURS;
            }

            public static zzuj zzq() {
                return zzmt.zzbs;
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzms();
            }
        }

        public enum zzd implements zzuh {
            UNKNOWN_LANDMARKS(0),
            NO_LANDMARKS(1),
            ALL_LANDMARKS(2);
            
            private static final zzui<zzd> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static zzd zzas(int i) {
                if (i == 0) {
                    return UNKNOWN_LANDMARKS;
                }
                if (i == 1) {
                    return NO_LANDMARKS;
                }
                if (i != 2) {
                    return null;
                }
                return ALL_LANDMARKS;
            }

            public static zzuj zzq() {
                return zzmv.zzbs;
            }

            private zzd(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzmu();
            }
        }

        public enum zze implements zzuh {
            UNKNOWN_PERFORMANCE(0),
            FAST(1),
            ACCURATE(2);
            
            private static final zzui<zze> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static zze zzat(int i) {
                if (i == 0) {
                    return UNKNOWN_PERFORMANCE;
                }
                if (i == 1) {
                    return FAST;
                }
                if (i != 2) {
                    return null;
                }
                return ACCURATE;
            }

            public static zzuj zzq() {
                return zzmx.zzbs;
            }

            private zze(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzmw();
            }
        }

        private zzp() {
        }

        public static final class zza extends zzue.zza<zzp, zza> implements zzvq {
            private zza() {
                super(zzp.zzajh);
            }

            public final zza zzb(zzd zzd) {
                zzrf();
                ((zzp) this.zzbol).zza(zzd);
                return this;
            }

            public final zza zzb(zzb zzb) {
                zzrf();
                ((zzp) this.zzbol).zza(zzb);
                return this;
            }

            public final zza zzb(zze zze) {
                zzrf();
                ((zzp) this.zzbol).zza(zze);
                return this;
            }

            public final zza zzb(zzc zzc) {
                zzrf();
                ((zzp) this.zzbol).zza(zzc);
                return this;
            }

            public final zza zzv(boolean z) {
                zzrf();
                ((zzp) this.zzbol).zzu(z);
                return this;
            }

            public final zza zzn(float f) {
                zzrf();
                ((zzp) this.zzbol).zzm(f);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzd zzd2) {
            if (zzd2 != null) {
                this.zzbg |= 1;
                this.zzajb = zzd2.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzb zzb2) {
            if (zzb2 != null) {
                this.zzbg |= 2;
                this.zzajc = zzb2.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zze zze2) {
            if (zze2 != null) {
                this.zzbg |= 4;
                this.zzajd = zze2.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzc zzc2) {
            if (zzc2 != null) {
                this.zzbg |= 8;
                this.zzaje = zzc2.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzu(boolean z) {
            this.zzbg |= 16;
            this.zzajf = z;
        }

        /* access modifiers changed from: private */
        public final void zzm(float f) {
            this.zzbg |= 32;
            this.zzajg = f;
        }

        public static zza zzju() {
            return (zza) zzajh.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzajh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\u0007\u0004\u0006\u0001\u0005", new Object[]{"zzbg", "zzajb", zzd.zzq(), "zzajc", zzb.zzq(), "zzajd", zze.zzq(), "zzaje", zzc.zzq(), "zzajf", "zzajg"});
                case 4:
                    return zzajh;
                case 5:
                    zzvz<zzp> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzp.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzajh);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzp zzp = new zzp();
            zzajh = zzp;
            zzue.zza(zzp.class, zzp);
        }
    }

    public static final class zzq extends zzue<zzq, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzq zzakt;
        private static volatile zzvz<zzq> zzbm;
        private zzac zzajy;
        private int zzajz;
        private zzl zzaka;
        private zzm zzakb;
        private zzn zzakc;
        private zzw zzakd;
        private zzab zzake;
        private zzv zzakf;
        private zzx zzakg;
        private zzaa zzakh;
        private zzz zzaki;
        private zzd zzakj;
        private zza zzakk;
        private zzc zzakl;
        private zzf zzakm;
        private zze zzakn;
        private zzg zzako;
        private zzh zzakp;
        private zzi zzakq;
        private zzj zzakr;
        private zzk zzaks;
        private int zzbg;

        private zzq() {
        }

        public static final class zza extends zzue.zza<zzq, zza> implements zzvq {
            private zza() {
                super(zzq.zzakt);
            }

            public final zzac zzjw() {
                return ((zzq) this.zzbol).zzjw();
            }

            public final zza zzb(zzac.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzb(zzmn zzmn) {
                zzrf();
                ((zzq) this.zzbol).zza(zzmn);
                return this;
            }

            public final zza zzb(zzl.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzb(zzm zzm) {
                zzrf();
                ((zzq) this.zzbol).zza(zzm);
                return this;
            }

            public final zza zzb(zzm.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzb(zzn.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzb(zzw.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzb(zzab zzab) {
                zzrf();
                ((zzq) this.zzbol).zza(zzab);
                return this;
            }

            public final zza zzb(zzab.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzb(zzv.zzc zzc) {
                zzrf();
                ((zzq) this.zzbol).zza(zzc);
                return this;
            }

            public final zza zzb(zzx.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzb(zzaa zzaa) {
                zzrf();
                ((zzq) this.zzbol).zza(zzaa);
                return this;
            }

            public final zza zzb(zzaa.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzb(zzz.zza zza) {
                zzrf();
                ((zzq) this.zzbol).zza(zza);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        public final zzac zzjw() {
            zzac zzac = this.zzajy;
            return zzac == null ? zzac.zzlj() : zzac;
        }

        /* access modifiers changed from: private */
        public final void zza(zzac.zza zza2) {
            this.zzajy = (zzac) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzmn zzmn) {
            if (zzmn != null) {
                this.zzbg |= 2;
                this.zzajz = zzmn.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzl.zza zza2) {
            this.zzaka = (zzl) ((zzue) zza2.zzrj());
            this.zzbg |= 4;
        }

        /* access modifiers changed from: private */
        public final void zza(zzm zzm) {
            if (zzm != null) {
                this.zzakb = zzm;
                this.zzbg |= 8;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzm.zza zza2) {
            this.zzakb = (zzm) ((zzue) zza2.zzrj());
            this.zzbg |= 8;
        }

        /* access modifiers changed from: private */
        public final void zza(zzn.zza zza2) {
            this.zzakc = (zzn) ((zzue) zza2.zzrj());
            this.zzbg |= 16;
        }

        /* access modifiers changed from: private */
        public final void zza(zzw.zza zza2) {
            this.zzakd = (zzw) ((zzue) zza2.zzrj());
            this.zzbg |= 32;
        }

        /* access modifiers changed from: private */
        public final void zza(zzab zzab) {
            if (zzab != null) {
                this.zzake = zzab;
                this.zzbg |= 64;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzab.zza zza2) {
            this.zzake = (zzab) ((zzue) zza2.zzrj());
            this.zzbg |= 64;
        }

        /* access modifiers changed from: private */
        public final void zza(zzv.zzc zzc) {
            this.zzakf = (zzv) ((zzue) zzc.zzrj());
            this.zzbg |= 128;
        }

        /* access modifiers changed from: private */
        public final void zza(zzx.zza zza2) {
            this.zzakg = (zzx) ((zzue) zza2.zzrj());
            this.zzbg |= 256;
        }

        /* access modifiers changed from: private */
        public final void zza(zzaa zzaa) {
            if (zzaa != null) {
                this.zzakh = zzaa;
                this.zzbg |= 512;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzaa.zza zza2) {
            this.zzakh = (zzaa) ((zzue) zza2.zzrj());
            this.zzbg |= 512;
        }

        /* access modifiers changed from: private */
        public final void zza(zzz.zza zza2) {
            this.zzaki = (zzz) ((zzue) zza2.zzrj());
            this.zzbg |= 1024;
        }

        public static zza zzjx() {
            return (zza) zzakt.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzq();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzakt, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0005\u0006\t\u0006\u0007\t\u0007\b\t\u000b\t\t\f\n\t\r\u000b\t\u000e\f\t\u000f\r\t\u0010\u000e\t\u0011\u000f\t\u0012\u0010\t\u0013\u0011\t\u0014\u0012\t\b\u0013\t\t\u0014\t\u0004\u0015\t\n", new Object[]{"zzbg", "zzajy", "zzajz", zzmn.zzq(), "zzaka", "zzakb", "zzakd", "zzake", "zzakf", "zzakj", "zzakk", "zzakl", "zzakm", "zzakn", "zzako", "zzakp", "zzakq", "zzakr", "zzaks", "zzakg", "zzakh", "zzakc", "zzaki"});
                case 4:
                    return zzakt;
                case 5:
                    zzvz<zzq> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzq.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzakt);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzq zzq = new zzq();
            zzakt = zzq;
            zzue.zza(zzq.class, zzq);
        }
    }

    public static final class zzr extends zzue<zzr, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzr zzakx;
        private static volatile zzvz<zzr> zzbm;
        private int zzaku;
        private int zzakv;
        private int zzakw;
        private int zzbg;

        public enum zzb implements zzuh {
            UNKNOWN_FORMAT(0),
            NV16(1),
            NV21(2),
            YV12(3),
            BITMAP(4),
            CM_SAMPLE_BUFFER_REF(5),
            UI_IMAGE(6);
            
            private static final zzui<zzb> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static zzb zzaw(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_FORMAT;
                    case 1:
                        return NV16;
                    case 2:
                        return NV21;
                    case 3:
                        return YV12;
                    case 4:
                        return BITMAP;
                    case 5:
                        return CM_SAMPLE_BUFFER_REF;
                    case 6:
                        return UI_IMAGE;
                    default:
                        return null;
                }
            }

            public static zzuj zzq() {
                return zzmz.zzbs;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzmy();
            }
        }

        private zzr() {
        }

        public static final class zza extends zzue.zza<zzr, zza> implements zzvq {
            private zza() {
                super(zzr.zzakx);
            }

            public final zza zzb(zzb zzb) {
                zzrf();
                ((zzr) this.zzbol).zza(zzb);
                return this;
            }

            public final zza zzav(int i) {
                zzrf();
                ((zzr) this.zzbol).zzau(i);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzb zzb2) {
            if (zzb2 != null) {
                this.zzbg |= 1;
                this.zzaku = zzb2.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzau(int i) {
            this.zzbg |= 2;
            this.zzakv = i;
        }

        public static zza zzjz() {
            return (zza) zzakx.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzr();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzakx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u000b\u0001\u0003\u000b\u0002", new Object[]{"zzbg", "zzaku", zzb.zzq(), "zzakv", "zzakw"});
                case 4:
                    return zzakx;
                case 5:
                    zzvz<zzr> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzr.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzakx);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzr zzr = new zzr();
            zzakx = zzr;
            zzue.zza(zzr.class, zzr);
        }
    }

    public static final class zzs extends zzue<zzs, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzs zzalk;
        private static volatile zzvz<zzs> zzbm;
        private int zzaer;
        private boolean zzafk;
        private long zzalg;
        private boolean zzalh;
        private boolean zzali;
        private boolean zzalj;
        private int zzbg;

        private zzs() {
        }

        public static final class zza extends zzue.zza<zzs, zza> implements zzvq {
            private zza() {
                super(zzs.zzalk);
            }

            public final zza zzn(long j) {
                zzrf();
                ((zzs) this.zzbol).zzm(j);
                return this;
            }

            public final zza zzc(zzmk zzmk) {
                zzrf();
                ((zzs) this.zzbol).zza(zzmk);
                return this;
            }

            public final zza zzz(boolean z) {
                zzrf();
                ((zzs) this.zzbol).zzw(z);
                return this;
            }

            public final zza zzaa(boolean z) {
                zzrf();
                ((zzs) this.zzbol).zzx(true);
                return this;
            }

            public final zza zzab(boolean z) {
                zzrf();
                ((zzs) this.zzbol).zzy(true);
                return this;
            }

            public final zza zzac(boolean z) {
                zzrf();
                ((zzs) this.zzbol).zzk(z);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzm(long j) {
            this.zzbg |= 1;
            this.zzalg = j;
        }

        /* access modifiers changed from: private */
        public final void zza(zzmk zzmk) {
            if (zzmk != null) {
                this.zzbg |= 2;
                this.zzaer = zzmk.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzw(boolean z) {
            this.zzbg |= 4;
            this.zzalh = z;
        }

        /* access modifiers changed from: private */
        public final void zzx(boolean z) {
            this.zzbg |= 8;
            this.zzali = z;
        }

        /* access modifiers changed from: private */
        public final void zzy(boolean z) {
            this.zzbg |= 16;
            this.zzalj = z;
        }

        /* access modifiers changed from: private */
        public final void zzk(boolean z) {
            this.zzbg |= 32;
            this.zzafk = z;
        }

        public static zza zzkb() {
            return (zza) zzalk.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzs();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzalk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0003\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzbg", "zzalg", "zzaer", zzmk.zzq(), "zzalh", "zzali", "zzalj", "zzafk"});
                case 4:
                    return zzalk;
                case 5:
                    zzvz<zzs> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzs.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzalk);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzs zzs = new zzs();
            zzalk = zzs;
            zzue.zza(zzs.class, zzs);
        }
    }

    public static final class zzt extends zzue<zzt, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzt zzaln;
        private static volatile zzvz<zzt> zzbm;
        private float zzall;
        private float zzalm;
        private int zzbg;
        private float zzfw;

        private zzt() {
        }

        public static final class zza extends zzue.zza<zzt, zza> implements zzvq {
            private zza() {
                super(zzt.zzaln);
            }

            public final zza zzp(float f) {
                zzrf();
                ((zzt) this.zzbol).zzo(f);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzo(float f) {
            this.zzbg |= 4;
            this.zzfw = f;
        }

        public static zza zzkd() {
            return (zza) zzaln.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzt();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzaln, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002", new Object[]{"zzbg", "zzall", "zzalm", "zzfw"});
                case 4:
                    return zzaln;
                case 5:
                    zzvz<zzt> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzt.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzaln);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static zzt zzke() {
            return zzaln;
        }

        static {
            zzt zzt = new zzt();
            zzaln = zzt;
            zzue.zza(zzt.class, zzt);
        }
    }

    public static final class zzu extends zzue<zzu, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzu zzalt;
        private static volatile zzvz<zzu> zzbm;
        private String zzalo = "";
        private String zzalp = "";
        private int zzalq;
        private String zzalr = "";
        private String zzals = "";
        private int zzbg;

        public enum zzb implements zzuh {
            SOURCE_UNKNOWN(0),
            APP_ASSET(1),
            LOCAL(2),
            CLOUD(3),
            SDK_BUILT_IN(4);
            
            private static final zzui<zzb> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static zzb zzax(int i) {
                if (i == 0) {
                    return SOURCE_UNKNOWN;
                }
                if (i == 1) {
                    return APP_ASSET;
                }
                if (i == 2) {
                    return LOCAL;
                }
                if (i == 3) {
                    return CLOUD;
                }
                if (i != 4) {
                    return null;
                }
                return SDK_BUILT_IN;
            }

            public static zzuj zzq() {
                return zznb.zzbs;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzna();
            }
        }

        private zzu() {
        }

        public static final class zza extends zzue.zza<zzu, zza> implements zzvq {
            private zza() {
                super(zzu.zzalt);
            }

            public final zza zzbe(String str) {
                zzrf();
                ((zzu) this.zzbol).setName(str);
                return this;
            }

            public final zza zzb(zzb zzb) {
                zzrf();
                ((zzu) this.zzbol).zza(zzb);
                return this;
            }

            public final zza zzbf(String str) {
                zzrf();
                ((zzu) this.zzbol).zzbc(str);
                return this;
            }

            public final zza zzbg(String str) {
                zzrf();
                ((zzu) this.zzbol).zzbd(str);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void setName(String str) {
            if (str != null) {
                this.zzbg |= 1;
                this.zzalo = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzb zzb2) {
            if (zzb2 != null) {
                this.zzbg |= 4;
                this.zzalq = zzb2.zzo();
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbc(String str) {
            if (str != null) {
                this.zzbg |= 8;
                this.zzalr = str;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzbd(String str) {
            if (str != null) {
                this.zzbg |= 16;
                this.zzals = str;
                return;
            }
            throw null;
        }

        public static zza zzkg() {
            return (zza) zzalt.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzu();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzalt, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzbg", "zzalo", "zzalp", "zzalq", zzb.zzq(), "zzalr", "zzals"});
                case 4:
                    return zzalt;
                case 5:
                    zzvz<zzu> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzu.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzalt);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzu zzu = new zzu();
            zzalt = zzu;
            zzue.zza(zzu.class, zzu);
        }
    }

    public static final class zzv extends zzue<zzv, zzc> implements zzvq {
        private static final zzum<Integer, zza> zzamc = new zznc();
        private static final zzum<Integer, zzb> zzame = new zznd();
        /* access modifiers changed from: private */
        public static final zzv zzamf;
        private static volatile zzvz<zzv> zzbm;
        private zzs zzadw;
        private zzr zzady;
        private zzqs.zza zzama;
        private zzul zzamb = zzqz();
        private zzul zzamd = zzqz();
        private int zzbg;

        public enum zza implements zzuh {
            FORMAT_UNKNOWN(0),
            FORMAT_CODE_128(1),
            FORMAT_CODE_39(2),
            FORMAT_CODE_93(4),
            FORMAT_CODABAR(8),
            FORMAT_DATA_MATRIX(16),
            FORMAT_EAN_13(32),
            FORMAT_EAN_8(64),
            FORMAT_ITF(128),
            FORMAT_QR_CODE(256),
            FORMAT_UPC_A(512),
            FORMAT_UPC_E(1024),
            FORMAT_PDF417(2048),
            FORMAT_AZTEC(4096);
            
            private static final zzui<zza> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static zza zzay(int i) {
                if (i == 0) {
                    return FORMAT_UNKNOWN;
                }
                if (i == 1) {
                    return FORMAT_CODE_128;
                }
                if (i == 2) {
                    return FORMAT_CODE_39;
                }
                switch (i) {
                    case 4:
                        return FORMAT_CODE_93;
                    case 8:
                        return FORMAT_CODABAR;
                    case 16:
                        return FORMAT_DATA_MATRIX;
                    case 32:
                        return FORMAT_EAN_13;
                    case 64:
                        return FORMAT_EAN_8;
                    case 128:
                        return FORMAT_ITF;
                    case 256:
                        return FORMAT_QR_CODE;
                    case 512:
                        return FORMAT_UPC_A;
                    case 1024:
                        return FORMAT_UPC_E;
                    case 2048:
                        return FORMAT_PDF417;
                    case 4096:
                        return FORMAT_AZTEC;
                    default:
                        return null;
                }
            }

            public static zzuj zzq() {
                return zznf.zzbs;
            }

            private zza(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzne();
            }
        }

        public enum zzb implements zzuh {
            TYPE_UNKNOWN(0),
            TYPE_CONTACT_INFO(1),
            TYPE_EMAIL(2),
            TYPE_ISBN(3),
            TYPE_PHONE(4),
            TYPE_PRODUCT(5),
            TYPE_SMS(6),
            TYPE_TEXT(7),
            TYPE_URL(8),
            TYPE_WIFI(9),
            TYPE_GEO(10),
            TYPE_CALENDAR_EVENT(11),
            TYPE_DRIVER_LICENSE(12);
            
            private static final zzui<zzb> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static zzb zzaz(int i) {
                switch (i) {
                    case 0:
                        return TYPE_UNKNOWN;
                    case 1:
                        return TYPE_CONTACT_INFO;
                    case 2:
                        return TYPE_EMAIL;
                    case 3:
                        return TYPE_ISBN;
                    case 4:
                        return TYPE_PHONE;
                    case 5:
                        return TYPE_PRODUCT;
                    case 6:
                        return TYPE_SMS;
                    case 7:
                        return TYPE_TEXT;
                    case 8:
                        return TYPE_URL;
                    case 9:
                        return TYPE_WIFI;
                    case 10:
                        return TYPE_GEO;
                    case 11:
                        return TYPE_CALENDAR_EVENT;
                    case 12:
                        return TYPE_DRIVER_LICENSE;
                    default:
                        return null;
                }
            }

            public static zzuj zzq() {
                return zznh.zzbs;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzng();
            }
        }

        private zzv() {
        }

        public static final class zzc extends zzue.zza<zzv, zzc> implements zzvq {
            private zzc() {
                super(zzv.zzamf);
            }

            public final zzc zzc(zzs.zza zza) {
                zzrf();
                ((zzv) this.zzbol).zza(zza);
                return this;
            }

            public final zzc zzb(zzqs.zza zza) {
                zzrf();
                ((zzv) this.zzbol).zza(zza);
                return this;
            }

            public final zzc zzk(Iterable<? extends zza> iterable) {
                zzrf();
                ((zzv) this.zzbol).zzi(iterable);
                return this;
            }

            public final zzc zzl(Iterable<? extends zzb> iterable) {
                zzrf();
                ((zzv) this.zzbol).zzj(iterable);
                return this;
            }

            public final zzc zzb(zzr zzr) {
                zzrf();
                ((zzv) this.zzbol).zza(zzr);
                return this;
            }

            /* synthetic */ zzc(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzqs.zza zza2) {
            if (zza2 != null) {
                this.zzama = zza2;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzi(Iterable<? extends zza> iterable) {
            if (!this.zzamb.zzps()) {
                this.zzamb = zzue.zza(this.zzamb);
            }
            for (zza zzo : iterable) {
                this.zzamb.zzdh(zzo.zzo());
            }
        }

        /* access modifiers changed from: private */
        public final void zzj(Iterable<? extends zzb> iterable) {
            if (!this.zzamd.zzps()) {
                this.zzamd = zzue.zza(this.zzamd);
            }
            for (zzb zzo : iterable) {
                this.zzamd.zzdh(zzo.zzo());
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzr zzr) {
            if (zzr != null) {
                this.zzady = zzr;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        public static zzc zzki() {
            return (zzc) zzamf.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzv();
                case 2:
                    return new zzc((zzme) null);
                case 3:
                    return zza((zzvo) zzamf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001e\u0004\u001e\u0005\t\u0002", new Object[]{"zzbg", "zzadw", "zzama", "zzamb", zza.zzq(), "zzamd", zzb.zzq(), "zzady"});
                case 4:
                    return zzamf;
                case 5:
                    zzvz<zzv> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzv.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzamf);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzv zzv = new zzv();
            zzamf = zzv;
            zzue.zza(zzv.class, zzv);
        }
    }

    public static final class zzw extends zzue<zzw, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzw zzann;
        private static volatile zzvz<zzw> zzbm;
        private zzs zzadw;
        private zzr zzady;
        private zzqs.zzb zzanj;
        private zzp zzank;
        private int zzanl;
        private int zzanm;
        private int zzbg;

        private zzw() {
        }

        public static final class zza extends zzue.zza<zzw, zza> implements zzvq {
            private zza() {
                super(zzw.zzann);
            }

            public final zza zzd(zzs.zza zza) {
                zzrf();
                ((zzw) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzc(zzr zzr) {
                zzrf();
                ((zzw) this.zzbol).zza(zzr);
                return this;
            }

            public final zza zzb(zzp zzp) {
                zzrf();
                ((zzw) this.zzbol).zza(zzp);
                return this;
            }

            public final zza zzbc(int i) {
                zzrf();
                ((zzw) this.zzbol).zzba(i);
                return this;
            }

            public final zza zzbd(int i) {
                zzrf();
                ((zzw) this.zzbol).zzbb(i);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzr zzr) {
            if (zzr != null) {
                this.zzady = zzr;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzp zzp) {
            if (zzp != null) {
                this.zzank = zzp;
                this.zzbg |= 8;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zzba(int i) {
            this.zzbg |= 16;
            this.zzanl = i;
        }

        /* access modifiers changed from: private */
        public final void zzbb(int i) {
            this.zzbg |= 32;
            this.zzanm = i;
        }

        public static zza zzkk() {
            return (zza) zzann.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzw();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzann, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\u000b\u0004\u0006\u000b\u0005", new Object[]{"zzbg", "zzadw", "zzanj", "zzady", "zzank", "zzanl", "zzanm"});
                case 4:
                    return zzann;
                case 5:
                    zzvz<zzw> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzw.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzann);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzw zzw = new zzw();
            zzann = zzw;
            zzue.zza(zzw.class, zzw);
        }
    }

    public static final class zzx extends zzue<zzx, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzx zzanp;
        private static volatile zzvz<zzx> zzbm;
        private zzs zzadw;
        private zzr zzady;
        private zzy zzano;
        private int zzbg;

        private zzx() {
        }

        public static final class zza extends zzue.zza<zzx, zza> implements zzvq {
            private zza() {
                super(zzx.zzanp);
            }

            public final zza zze(zzs.zza zza) {
                zzrf();
                ((zzx) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzb(zzy zzy) {
                zzrf();
                ((zzx) this.zzbol).zza(zzy);
                return this;
            }

            public final zza zzd(zzr zzr) {
                zzrf();
                ((zzx) this.zzbol).zza(zzr);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzy zzy) {
            if (zzy != null) {
                this.zzano = zzy;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzr zzr) {
            if (zzr != null) {
                this.zzady = zzr;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        public static zza zzkm() {
            return (zza) zzanp.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzx();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzanp, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"zzbg", "zzadw", "zzano", "zzady"});
                case 4:
                    return zzanp;
                case 5:
                    zzvz<zzx> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzx.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzanp);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzx zzx = new zzx();
            zzanp = zzx;
            zzue.zza(zzx.class, zzx);
        }
    }

    public static final class zzy extends zzue<zzy, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzy zzanr;
        private static volatile zzvz<zzy> zzbm;
        private int zzanq;
        private int zzbg;
        private float zzfw;

        private zzy() {
        }

        public static final class zza extends zzue.zza<zzy, zza> implements zzvq {
            private zza() {
                super(zzy.zzanr);
            }

            public final zza zzq(float f) {
                zzrf();
                ((zzy) this.zzbol).zzo(f);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzo(float f) {
            this.zzbg |= 2;
            this.zzfw = f;
        }

        public static zza zzko() {
            return (zza) zzanr.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzy();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzanr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0000\u0002\u0001\u0001", new Object[]{"zzbg", "zzanq", "zzfw"});
                case 4:
                    return zzanr;
                case 5:
                    zzvz<zzy> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzy.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzanr);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzy zzy = new zzy();
            zzanr = zzy;
            zzue.zza(zzy.class, zzy);
        }
    }

    public static final class zzz extends zzue<zzz, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzz zzanv;
        private static volatile zzvz<zzz> zzbm;
        private zzs zzadw;
        private zzt zzans;
        private zzc zzant;
        private zzd zzanu;
        private int zzbg;

        public static final class zzb extends zzue<zzb, zza> implements zzvq {
            /* access modifiers changed from: private */
            public static final zzb zzany;
            private static volatile zzvz<zzb> zzbm;
            private float zzanw;
            private String zzanx = "";
            private int zzbg;

            private zzb() {
            }

            public static final class zza extends zzue.zza<zzb, zza> implements zzvq {
                private zza() {
                    super(zzb.zzany);
                }

                public final zza zzs(float f) {
                    zzrf();
                    ((zzb) this.zzbol).zzr(f);
                    return this;
                }

                public final zza zzbi(String str) {
                    zzrf();
                    ((zzb) this.zzbol).zzbh(str);
                    return this;
                }

                /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzr(float f) {
                this.zzbg |= 1;
                this.zzanw = f;
            }

            /* access modifiers changed from: private */
            public final void zzbh(String str) {
                if (str != null) {
                    this.zzbg |= 2;
                    this.zzanx = str;
                    return;
                }
                throw null;
            }

            public static zza zzks() {
                return (zza) zzany.zzqx();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new zza((zzme) null);
                    case 3:
                        return zza((zzvo) zzany, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0000\u0002\b\u0001", new Object[]{"zzbg", "zzanw", "zzanx"});
                    case 4:
                        return zzany;
                    case 5:
                        zzvz<zzb> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzb.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzany);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzb zzb = new zzb();
                zzany = zzb;
                zzue.zza(zzb.class, zzb);
            }
        }

        public static final class zzc extends zzue<zzc, zza> implements zzvq {
            /* access modifiers changed from: private */
            public static final zzc zzaoa;
            private static volatile zzvz<zzc> zzbm;
            private zzb zzanz;
            private int zzbg;

            private zzc() {
            }

            public static final class zza extends zzue.zza<zzc, zza> implements zzvq {
                private zza() {
                    super(zzc.zzaoa);
                }

                public final zza zzb(zzb.zza zza) {
                    zzrf();
                    ((zzc) this.zzbol).zza(zza);
                    return this;
                }

                /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zza(zzb.zza zza2) {
                this.zzanz = (zzb) ((zzue) zza2.zzrj());
                this.zzbg |= 1;
            }

            public static zza zzku() {
                return (zza) zzaoa.zzqx();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza((zzme) null);
                    case 3:
                        return zza((zzvo) zzaoa, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"zzbg", "zzanz"});
                    case 4:
                        return zzaoa;
                    case 5:
                        zzvz<zzc> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzc.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzaoa);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public static zzc zzkv() {
                return zzaoa;
            }

            static {
                zzc zzc = new zzc();
                zzaoa = zzc;
                zzue.zza(zzc.class, zzc);
            }
        }

        public static final class zzd extends zzue<zzd, zza> implements zzvq {
            /* access modifiers changed from: private */
            public static final zzd zzaoc;
            private static volatile zzvz<zzd> zzbm;
            private zzun<zzb> zzaob = zzrb();

            private zzd() {
            }

            public static final class zza extends zzue.zza<zzd, zza> implements zzvq {
                private zza() {
                    super(zzd.zzaoc);
                }

                public final zza zzd(zzb.zza zza) {
                    zzrf();
                    ((zzd) this.zzbol).zzc(zza);
                    return this;
                }

                /* synthetic */ zza(zzme zzme) {
                    this();
                }
            }

            /* access modifiers changed from: private */
            public final void zzc(zzb.zza zza2) {
                if (!this.zzaob.zzps()) {
                    this.zzaob = zzue.zza(this.zzaob);
                }
                this.zzaob.add((zzb) ((zzue) zza2.zzrj()));
            }

            public static zza zzkx() {
                return (zza) zzaoc.zzqx();
            }

            /* access modifiers changed from: protected */
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzme.zzbn[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza((zzme) null);
                    case 3:
                        return zza((zzvo) zzaoc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzaob", zzb.class});
                    case 4:
                        return zzaoc;
                    case 5:
                        zzvz<zzd> zzvz = zzbm;
                        if (zzvz == null) {
                            synchronized (zzd.class) {
                                zzvz = zzbm;
                                if (zzvz == null) {
                                    zzvz = new zzue.zzb<>(zzaoc);
                                    zzbm = zzvz;
                                }
                            }
                        }
                        return zzvz;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public static zzd zzky() {
                return zzaoc;
            }

            static {
                zzd zzd = new zzd();
                zzaoc = zzd;
                zzue.zza(zzd.class, zzd);
            }
        }

        private zzz() {
        }

        public static final class zza extends zzue.zza<zzz, zza> implements zzvq {
            private zza() {
                super(zzz.zzanv);
            }

            public final zza zzf(zzs.zza zza) {
                zzrf();
                ((zzz) this.zzbol).zza(zza);
                return this;
            }

            public final zza zzb(zzt zzt) {
                zzrf();
                ((zzz) this.zzbol).zza(zzt);
                return this;
            }

            public final zza zzb(zzc zzc) {
                zzrf();
                ((zzz) this.zzbol).zza(zzc);
                return this;
            }

            public final zza zzb(zzd zzd) {
                zzrf();
                ((zzz) this.zzbol).zza(zzd);
                return this;
            }

            /* synthetic */ zza(zzme zzme) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zza(zzs.zza zza2) {
            this.zzadw = (zzs) ((zzue) zza2.zzrj());
            this.zzbg |= 1;
        }

        /* access modifiers changed from: private */
        public final void zza(zzt zzt) {
            if (zzt != null) {
                this.zzans = zzt;
                this.zzbg |= 2;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzc zzc2) {
            if (zzc2 != null) {
                this.zzant = zzc2;
                this.zzbg |= 4;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: private */
        public final void zza(zzd zzd2) {
            if (zzd2 != null) {
                this.zzanu = zzd2;
                this.zzbg |= 8;
                return;
            }
            throw null;
        }

        public static zza zzkq() {
            return (zza) zzanv.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzme.zzbn[i - 1]) {
                case 1:
                    return new zzz();
                case 2:
                    return new zza((zzme) null);
                case 3:
                    return zza((zzvo) zzanv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"zzbg", "zzadw", "zzans", "zzant", "zzanu"});
                case 4:
                    return zzanv;
                case 5:
                    zzvz<zzz> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzz.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzanv);
                                zzbm = zzvz;
                            }
                        }
                    }
                    return zzvz;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzz zzz = new zzz();
            zzanv = zzz;
            zzue.zza(zzz.class, zzz);
        }
    }
}
