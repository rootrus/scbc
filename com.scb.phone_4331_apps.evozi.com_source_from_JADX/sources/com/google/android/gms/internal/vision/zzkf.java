package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;

public final class zzkf extends zzfy<zzkf, zza> implements zzhh {
    /* access modifiers changed from: private */
    public static final zzkf zzahj;
    private static volatile zzhq<zzkf> zzbf;
    private zzge<zzjx> zzahi = zzey();
    private byte zzkc = 2;

    private zzkf() {
    }

    public static final class zza extends zzfy.zza<zzkf, zza> implements zzhh {
        private zza() {
            super(zzkf.zzahj);
        }

        /* synthetic */ zza(zzkg zzkg) {
            this();
        }
    }

    public final int zzip() {
        return this.zzahi.size();
    }

    public final zzjx zzcc(int i) {
        return (zzjx) this.zzahi.get(i);
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i, Object obj, Object obj2) {
        int i2 = 1;
        switch (zzkg.zzbc[i - 1]) {
            case 1:
                return new zzkf();
            case 2:
                return new zza((zzkg) null);
            case 3:
                return zza((zzhf) zzahj, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzahi", zzjx.class});
            case 4:
                return zzahj;
            case 5:
                zzhq<zzkf> zzhq = zzbf;
                if (zzhq == null) {
                    synchronized (zzkf.class) {
                        zzhq = zzbf;
                        if (zzhq == null) {
                            zzhq = new zzfy.zzb<>(zzahj);
                            zzbf = zzhq;
                        }
                    }
                }
                return zzhq;
            case 6:
                return Byte.valueOf(this.zzkc);
            case 7:
                if (obj == null) {
                    i2 = 0;
                }
                this.zzkc = (byte) i2;
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static zzkf zziq() {
        return zzahj;
    }

    static {
        zzkf zzkf = new zzkf();
        zzahj = zzkf;
        zzfy.zza(zzkf.class, zzkf);
    }
}
