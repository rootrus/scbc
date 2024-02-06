package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;

public final class zzqs {

    public static final class zza extends zzue<zza, C10802zza> implements zzvq {
        private static final zzum<Integer, zzsk> zzbbb = new zzqu();
        /* access modifiers changed from: private */
        public static final zza zzbbc;
        private static volatile zzvz<zza> zzbm;
        private zzul zzbba = zzqz();

        private zza() {
        }

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzqs$zza$zza  reason: collision with other inner class name */
        public static final class C10802zza extends zzue.zza<zza, C10802zza> implements zzvq {
            private C10802zza() {
                super(zza.zzbbc);
            }

            public final C10802zza zzp(Iterable<? extends zzsk> iterable) {
                zzrf();
                ((zza) this.zzbol).zzo(iterable);
                return this;
            }

            /* synthetic */ C10802zza(zzqt zzqt) {
                this();
            }
        }

        /* access modifiers changed from: private */
        public final void zzo(Iterable<? extends zzsk> iterable) {
            if (!this.zzbba.zzps()) {
                this.zzbba = zzue.zza(this.zzbba);
            }
            for (zzsk zzo : iterable) {
                this.zzbba.zzdh(zzo.zzo());
            }
        }

        public static C10802zza zzof() {
            return (C10802zza) zzbbc.zzqx();
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzqt.zzbn[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C10802zza((zzqt) null);
                case 3:
                    return zza((zzvo) zzbbc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzbba", zzsk.zzq()});
                case 4:
                    return zzbbc;
                case 5:
                    zzvz<zza> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zza.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzbbc);
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
            zzbbc = zza;
            zzue.zza(zza.class, zza);
        }
    }

    public static final class zzb extends zzue<zzb, zza> implements zzvq {
        /* access modifiers changed from: private */
        public static final zzb zzbbh;
        private static volatile zzvz<zzb> zzbm;
        private float zzajg;
        private int zzbbd;
        private int zzbbe;
        private boolean zzbbf;
        private boolean zzbbg;
        private int zzbg;
        private int zzgd;

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzqs$zzb$zzb  reason: collision with other inner class name */
        public enum C10803zzb implements zzuh {
            CLASSIFICATION_UNKNOWN(0),
            CLASSIFICATION_NONE(1),
            CLASSIFICATION_ALL(2);
            
            private static final zzui<C10803zzb> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static C10803zzb zzbv(int i) {
                if (i == 0) {
                    return CLASSIFICATION_UNKNOWN;
                }
                if (i == 1) {
                    return CLASSIFICATION_NONE;
                }
                if (i != 2) {
                    return null;
                }
                return CLASSIFICATION_ALL;
            }

            public static zzuj zzq() {
                return zzqw.zzbs;
            }

            private C10803zzb(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzqv();
            }
        }

        public enum zzc implements zzuh {
            LANDMARK_UNKNOWN(0),
            LANDMARK_NONE(1),
            LANDMARK_ALL(2),
            LANDMARK_CONTOUR(3);
            
            private static final zzui<zzc> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static zzc zzbw(int i) {
                if (i == 0) {
                    return LANDMARK_UNKNOWN;
                }
                if (i == 1) {
                    return LANDMARK_NONE;
                }
                if (i == 2) {
                    return LANDMARK_ALL;
                }
                if (i != 3) {
                    return null;
                }
                return LANDMARK_CONTOUR;
            }

            public static zzuj zzq() {
                return zzqy.zzbs;
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzqx();
            }
        }

        public enum zzd implements zzuh {
            MODE_UNKNOWN(0),
            MODE_ACCURATE(1),
            MODE_FAST(2),
            MODE_SELFIE(3);
            
            private static final zzui<zzd> zzbe = null;
            private final int value;

            public final int zzo() {
                return this.value;
            }

            public static zzd zzbx(int i) {
                if (i == 0) {
                    return MODE_UNKNOWN;
                }
                if (i == 1) {
                    return MODE_ACCURATE;
                }
                if (i == 2) {
                    return MODE_FAST;
                }
                if (i != 3) {
                    return null;
                }
                return MODE_SELFIE;
            }

            public static zzuj zzq() {
                return zzra.zzbs;
            }

            private zzd(int i) {
                this.value = i;
            }

            static {
                zzbe = new zzqz();
            }
        }

        private zzb() {
        }

        public static final class zza extends zzue.zza<zzb, zza> implements zzvq {
            private zza() {
                super(zzb.zzbbh);
            }

            /* synthetic */ zza(zzqt zzqt) {
                this();
            }
        }

        /* access modifiers changed from: protected */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzqt.zzbn[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza((zzqt) null);
                case 3:
                    return zza((zzvo) zzbbh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0001\u0005", new Object[]{"zzbg", "zzgd", zzd.zzq(), "zzbbd", zzc.zzq(), "zzbbe", C10803zzb.zzq(), "zzbbf", "zzbbg", "zzajg"});
                case 4:
                    return zzbbh;
                case 5:
                    zzvz<zzb> zzvz = zzbm;
                    if (zzvz == null) {
                        synchronized (zzb.class) {
                            zzvz = zzbm;
                            if (zzvz == null) {
                                zzvz = new zzue.zzb<>(zzbbh);
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
            zzbbh = zzb;
            zzue.zza(zzb.class, zzb);
        }
    }
}
