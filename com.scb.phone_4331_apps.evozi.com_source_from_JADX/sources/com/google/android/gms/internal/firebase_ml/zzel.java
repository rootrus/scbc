package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class zzel {
    private static final Logger logger = Logger.getLogger(zzel.class.getName());
    private final zzfi zzsl;
    private final zzeq zzsm;
    private final String zzsn;
    private final String zzso;
    private final String zzsp;
    private final String zzsq;
    private final zzhu zzsr;
    private final boolean zzss;
    private final boolean zzst;

    protected zzel(zza zza2) {
        zzfi zzfi;
        this.zzsm = zza2.zzsm;
        this.zzsn = zzi(zza2.zzsn);
        this.zzso = zzj(zza2.zzso);
        this.zzsp = zza2.zzsp;
        if (zzla.zzbb(zza2.zzsq)) {
            logger.logp(Level.WARNING, "o.nTypeCreate", "<init>", "Application name is not set. Call Builder#setApplicationName.");
        }
        this.zzsq = zza2.zzsq;
        if (zza2.zzsv == null) {
            zzfi = zza2.zzsu.zza((zzfj) null);
        } else {
            zzfi = zza2.zzsu.zza(zza2.zzsv);
        }
        this.zzsl = zzfi;
        this.zzsr = zza2.zzsr;
        this.zzss = false;
        this.zzst = false;
    }

    public static class zza {
        zzeq zzsm;
        String zzsn;
        String zzso;
        String zzsp;
        String zzsq;
        final zzhu zzsr;
        final zzfo zzsu;
        zzfj zzsv;

        protected zza(zzfo zzfo, String str, String str2, zzhu zzhu, zzfj zzfj) {
            this.zzsu = (zzfo) zzks.checkNotNull(zzfo);
            this.zzsr = zzhu;
            zzk(str);
            zzl(str2);
            this.zzsv = zzfj;
        }

        public zza zzk(String str) {
            this.zzsn = zzel.zzi(str);
            return this;
        }

        public zza zzl(String str) {
            this.zzso = zzel.zzj(str);
            return this;
        }

        public zza zzm(String str) {
            this.zzsp = str;
            return this;
        }

        public zza zza(zzeq zzeq) {
            this.zzsm = zzeq;
            return this;
        }

        public zza zzn(String str) {
            this.zzsq = str;
            return this;
        }
    }

    public final String zzej() {
        String valueOf = String.valueOf(this.zzsn);
        String valueOf2 = String.valueOf(this.zzso);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final String zzek() {
        return this.zzsq;
    }

    public final zzfi zzel() {
        return this.zzsl;
    }

    public zzhu zzem() {
        return this.zzsr;
    }

    /* access modifiers changed from: protected */
    public void zza(zzem<?> zzem) throws IOException {
        zzeq zzeq = this.zzsm;
        if (zzeq != null) {
            zzeq.zza(zzem);
        }
    }

    static String zzi(String str) {
        zzks.checkNotNull(str, "root URL cannot be null.");
        return !str.endsWith("/") ? String.valueOf(str).concat("/") : str;
    }

    static String zzj(String str) {
        zzks.checkNotNull(str, "service path cannot be null");
        if (str.length() == 1) {
            zzks.checkArgument("/".equals(str), "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() <= 0) {
            return str;
        } else {
            if (!str.endsWith("/")) {
                str = String.valueOf(str).concat("/");
            }
            return str.startsWith("/") ? str.substring(1) : str;
        }
    }
}
