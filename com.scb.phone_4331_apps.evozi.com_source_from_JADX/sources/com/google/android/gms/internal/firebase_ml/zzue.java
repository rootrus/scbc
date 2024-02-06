package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;
import com.google.android.gms.internal.firebase_ml.zzue.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzue<MessageType extends zzue<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzsn<MessageType, BuilderType> {
    private static Map<Object, zzue<?, ?>> zzboj = new ConcurrentHashMap();
    protected zzwx zzboh = zzwx.zztg();
    private int zzboi = -1;

    public static final class zzb<T extends zzue<T, ?>> extends zzsp<T> {
        private final T zzbok;

        public zzb(T t) {
            this.zzbok = t;
        }
    }

    public static final class zze<ContainingType extends zzvo, Type> extends zztp<ContainingType, Type> {
    }

    /* 'enum' modifier removed */
    public static final class zzf {
        public static final int zzboo = 1;
        public static final int zzbop = 2;
        public static final int zzboq = 3;
        public static final int zzbor = 4;
        public static final int zzbos = 5;
        public static final int zzbot = 6;
        public static final int zzbou = 7;
        private static final /* synthetic */ int[] zzbov = {1, 2, 3, 4, 5, 6, 7};
        public static final int zzbow = 1;
        public static final int zzbox = 2;
        private static final /* synthetic */ int[] zzboy = {1, 2};
        public static final int zzboz = 1;
        public static final int zzbpa = 2;
        private static final /* synthetic */ int[] zzbpb = {1, 2};

        /* renamed from: values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0 */
        public static int[] m3595x126d66cb() {
            return (int[]) zzbov.clone();
        }
    }

    /* access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    public static class zzc<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zza<MessageType, BuilderType> implements zzvq {
        protected zzc(MessageType messagetype) {
            super(messagetype);
        }

        /* access modifiers changed from: protected */
        public final void zzrf() {
            if (this.zzbom) {
                super.zzrf();
                ((zzd) this.zzbol).zzbon = (zztw) ((zzd) this.zzbol).zzbon.clone();
            }
        }

        public /* synthetic */ zzue zzrg() {
            return (zzd) zzri();
        }

        public /* synthetic */ zzvo zzri() {
            if (this.zzbom) {
                return (zzd) this.zzbol;
            }
            ((zzd) this.zzbol).zzbon.zzpt();
            return (zzd) super.zzri();
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zzue<MessageType, BuilderType> implements zzvq {
        protected zztw<Object> zzbon = zztw.zzqp();

        /* access modifiers changed from: package-private */
        public final zztw<Object> zzrk() {
            if (this.zzbon.isImmutable()) {
                this.zzbon = (zztw) this.zzbon.clone();
            }
            return this.zzbon;
        }
    }

    public String toString() {
        return zzvr.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzbka != 0) {
            return this.zzbka;
        }
        this.zzbka = zzwb.zzso().zzad(this).hashCode(this);
        return this.zzbka;
    }

    public static class zza<MessageType extends zzue<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzso<MessageType, BuilderType> {
        private final MessageType zzbok;
        protected MessageType zzbol;
        protected boolean zzbom = false;

        protected zza(MessageType messagetype) {
            this.zzbok = messagetype;
            this.zzbol = (zzue) messagetype.zza(zzf.zzbor, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        public void zzrf() {
            if (this.zzbom) {
                MessageType messagetype = (zzue) this.zzbol.zza(zzf.zzbor, (Object) null, (Object) null);
                zza(messagetype, this.zzbol);
                this.zzbol = messagetype;
                this.zzbom = false;
            }
        }

        public final boolean isInitialized() {
            return zzue.zza(this.zzbol, false);
        }

        /* renamed from: zzrg */
        public MessageType zzri() {
            if (this.zzbom) {
                return this.zzbol;
            }
            this.zzbol.zzpt();
            this.zzbom = true;
            return this.zzbol;
        }

        /* renamed from: zzrh */
        public final MessageType zzrj() {
            MessageType messagetype = (zzue) zzri();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzwv(messagetype);
        }

        public final BuilderType zza(MessageType messagetype) {
            zzrf();
            zza(this.zzbol, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzwb.zzso().zzad(messagetype).zzg(messagetype, messagetype2);
        }

        public final /* synthetic */ zzso zzpr() {
            return (zza) clone();
        }

        public final /* synthetic */ zzvo zzre() {
            return this.zzbok;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zza = (zza) ((zzue) this.zzbok).zza(zzf.zzbos, (Object) null, (Object) null);
            zza.zza((zzue) zzri());
            return zza;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((zzue) zza(zzf.zzbot, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return zzwb.zzso().zzad(this).equals(this, (zzue) obj);
    }

    /* access modifiers changed from: protected */
    public final void zzpt() {
        zzwb.zzso().zzad(this).zzq(this);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends zzue<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzqx() {
        return (zza) zza(zzf.zzbos, (Object) null, (Object) null);
    }

    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    /* access modifiers changed from: package-private */
    public final int zzpq() {
        return this.zzboi;
    }

    /* access modifiers changed from: package-private */
    public final void zzch(int i) {
        this.zzboi = i;
    }

    public final void zzb(zztl zztl) throws IOException {
        zzwb.zzso().zzk(getClass()).zza(this, zztn.zza(zztl));
    }

    public final int zzqy() {
        if (this.zzboi == -1) {
            this.zzboi = zzwb.zzso().zzad(this).zzaa(this);
        }
        return this.zzboi;
    }

    static <T extends zzue<?, ?>> T zzi(Class<T> cls) {
        T t = (zzue) zzboj.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (zzue) zzboj.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (zzue) ((zzue) zzxc.zzm(cls)).zza(zzf.zzbot, (Object) null, (Object) null);
            if (t != null) {
                zzboj.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    protected static <T extends zzue<?, ?>> void zza(Class<T> cls, T t) {
        zzboj.put(cls, t);
    }

    protected static Object zza(zzvo zzvo, String str, Object[] objArr) {
        return new zzwd(zzvo, str, objArr);
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

    protected static final <T extends zzue<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzf.zzboo, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzac = zzwb.zzso().zzad(t).zzac(t);
        if (z) {
            t.zza(zzf.zzbop, (Object) zzac ? t : null, (Object) null);
        }
        return zzac;
    }

    protected static zzul zzqz() {
        return zzuf.zzrl();
    }

    protected static zzul zza(zzul zzul) {
        int size = zzul.size();
        return zzul.zzdg(size == 0 ? 10 : size << 1);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.firebase_ml.zzuc, com.google.android.gms.internal.firebase_ml.zzuk] */
    protected static zzuk zzra() {
        return zzuc.zzqv();
    }

    protected static <E> zzun<E> zzrb() {
        return zzwc.zzsp();
    }

    protected static <E> zzun<E> zza(zzun<E> zzun) {
        int size = zzun.size();
        return zzun.zzck(size == 0 ? 10 : size << 1);
    }

    private static <T extends zzue<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zztr zztr) throws zzuo {
        T t2 = (zzue) t.zza(zzf.zzbor, (Object) null, (Object) null);
        try {
            zzwb.zzso().zzad(t2).zza(t2, bArr, 0, i2, new zzst(zztr));
            t2.zzpt();
            if (t2.zzbka == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzuo) {
                throw ((zzuo) e.getCause());
            }
            throw new zzuo(e.getMessage()).zzg(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzuo.zzrm().zzg(t2);
        }
    }

    protected static <T extends zzue<T, ?>> T zza(T t, byte[] bArr, zztr zztr) throws zzuo {
        T zza2 = zza(t, bArr, 0, bArr.length, zztr);
        if (zza2 == null || zza2.isInitialized()) {
            return zza2;
        }
        throw new zzuo(new zzwv(zza2).getMessage()).zzg(zza2);
    }

    public final /* synthetic */ zzvp zzrc() {
        zza zza2 = (zza) zza(zzf.zzbos, (Object) null, (Object) null);
        zza2.zza(this);
        return zza2;
    }

    public final /* synthetic */ zzvp zzrd() {
        return (zza) zza(zzf.zzbos, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzvo zzre() {
        return (zzue) zza(zzf.zzbot, (Object) null, (Object) null);
    }
}
