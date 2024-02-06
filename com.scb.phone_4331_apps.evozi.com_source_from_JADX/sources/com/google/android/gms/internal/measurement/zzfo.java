package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfo.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzfo<MessageType extends zzfo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdw<MessageType, BuilderType> {
    private static Map<Object, zzfo<?, ?>> zzd = new ConcurrentHashMap();
    protected zzig zzb = zzig.zza();
    private int zzc = -1;

    public static final class zzc<T extends zzfo<T, ?>> extends zzdx<T> {
        private final T zza;

        public zzc(T t) {
            this.zza = t;
        }
    }

    public static final class zzd<ContainingType extends zzgw, Type> extends zzez<ContainingType, Type> {
    }

    static final class zze implements zzfg<zze> {
        public final int zza() {
            throw new NoSuchMethodError();
        }

        public final zziu zzb() {
            throw new NoSuchMethodError();
        }

        public final zzjb zzc() {
            throw new NoSuchMethodError();
        }

        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        public final zzgz zza(zzgz zzgz, zzgw zzgw) {
            throw new NoSuchMethodError();
        }

        public final zzhf zza(zzhf zzhf, zzhf zzhf2) {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* 'enum' modifier removed */
    public static final class zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 1;
        public static final int zzi = 2;
        public static final int zzj = 1;
        public static final int zzk = 2;
        private static final /* synthetic */ int[] zzl = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzm = {1, 2};
        private static final /* synthetic */ int[] zzn = {1, 2};

        public static int[] zza() {
            return (int[]) zzl.clone();
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzfo<MessageType, BuilderType> implements zzgy {
        protected zzfe<zze> zzc = zzfe.zza();

        /* access modifiers changed from: package-private */
        public final zzfe<zze> zza() {
            if (this.zzc.zzc()) {
                this.zzc = (zzfe) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public String toString() {
        return zzhb.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zza != 0) {
            return this.zza;
        }
        this.zza = zzhl.zza().zza(this).zza(this);
        return this.zza;
    }

    public static class zza<MessageType extends zzfo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdv<MessageType, BuilderType> {
        protected MessageType zza;
        protected boolean zzb = false;
        private final MessageType zzc;

        protected zza(MessageType messagetype) {
            this.zzc = messagetype;
            this.zza = (zzfo) messagetype.zza(zzf.zzd, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        public void zzq() {
            MessageType messagetype = (zzfo) this.zza.zza(zzf.zzd, (Object) null, (Object) null);
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        /* renamed from: g_ */
        public final boolean mo5787g_() {
            return zzfo.zza(this.zza, false);
        }

        /* renamed from: zzs */
        public MessageType zzu() {
            if (this.zzb) {
                return this.zza;
            }
            MessageType messagetype = this.zza;
            zzhl.zza().zza(messagetype).zzc(messagetype);
            this.zzb = true;
            return this.zza;
        }

        /* renamed from: zzt */
        public final MessageType zzv() {
            MessageType messagetype = (zzfo) zzu();
            if (messagetype.mo5787g_()) {
                return messagetype;
            }
            throw new zzie(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb) {
                zzq();
                this.zzb = false;
            }
            zza(this.zza, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzhl.zza().zza(messagetype).zzb(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzfb zzfb) throws zzfw {
            if (this.zzb) {
                zzq();
                this.zzb = false;
            }
            try {
                byte[] bArr2 = bArr;
                zzhl.zza().zza(this.zza).zza(this.zza, bArr2, 0, i2 + 0, new zzeb(zzfb));
                return this;
            } catch (zzfw e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw zzfw.zza();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: zzb */
        public final BuilderType zza(zzes zzes, zzfb zzfb) throws IOException {
            if (this.zzb) {
                zzq();
                this.zzb = false;
            }
            try {
                zzhl.zza().zza(this.zza).zza(this.zza, zzet.zza(zzes), zzfb);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        public final /* synthetic */ zzdv zza(byte[] bArr, int i, int i2, zzfb zzfb) throws zzfw {
            return zzb(bArr, 0, i2, zzfb);
        }

        public final /* synthetic */ zzdv zza(byte[] bArr, int i, int i2) throws zzfw {
            return zzb(bArr, 0, i2, zzfb.zza());
        }

        public final /* synthetic */ zzdv zzp() {
            return (zza) clone();
        }

        /* renamed from: h_ */
        public final /* synthetic */ zzgw mo5788h_() {
            return this.zzc;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza2 = (zza) ((zzfo) this.zzc).zza(zzf.zze, (Object) null, (Object) null);
            zza2.zza((zzfo) zzu());
            return zza2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzhl.zza().zza(this).zza(this, (zzfo) obj);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzfo<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzbk() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    /* renamed from: g_ */
    public final boolean mo5787g_() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType zzbl() {
        BuilderType buildertype = (zza) zza(zzf.zze, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    /* access modifiers changed from: package-private */
    public final int zzbj() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final void zzc(int i) {
        this.zzc = i;
    }

    public final void zza(zzev zzev) throws IOException {
        zzhl.zza().zza(this).zza(this, (zzja) zzey.zza(zzev));
    }

    public final int zzbm() {
        if (this.zzc == -1) {
            this.zzc = zzhl.zza().zza(this).zzb(this);
        }
        return this.zzc;
    }

    static <T extends zzfo<?, ?>> T zza(Class<T> cls) {
        T t = (zzfo) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzfo) zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzfo) ((zzfo) zzin.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzfo<?, ?>> void zza(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    protected static Object zza(zzgw zzgw, String str, Object[] objArr) {
        return new zzhn(zzgw, str, objArr);
    }

    static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final <T extends zzfo<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzf.zza, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzhl.zza().zza(t).zzd(t);
        if (z) {
            t.zza(zzf.zzb, (Object) zzd2 ? t : null, (Object) null);
        }
        return zzd2;
    }

    protected static zzfv zzbn() {
        return zzfp.zzd();
    }

    protected static zzfu zzbo() {
        return zzgk.zzd();
    }

    protected static zzfu zza(zzfu zzfu) {
        int size = zzfu.size();
        return zzfu.zzc(size == 0 ? 10 : size << 1);
    }

    protected static <E> zzfx<E> zzbp() {
        return zzhk.zzd();
    }

    protected static <E> zzfx<E> zza(zzfx<E> zzfx) {
        int size = zzfx.size();
        return zzfx.zza(size == 0 ? 10 : size << 1);
    }

    public final /* synthetic */ zzgz zzbq() {
        zza zza2 = (zza) zza(zzf.zze, (Object) null, (Object) null);
        zza2.zza(this);
        return zza2;
    }

    public final /* synthetic */ zzgz zzbr() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    /* renamed from: h_ */
    public final /* synthetic */ zzgw mo5788h_() {
        return (zzfo) zza(zzf.zzf, (Object) null, (Object) null);
    }
}
