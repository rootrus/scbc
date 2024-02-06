package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzxc {
    private static final Logger logger = Logger.getLogger(zzxc.class.getName());
    private static final Class<?> zzbke = zzsr.zzpw();
    private static final boolean zzbkz = zztm();
    private static final Unsafe zzbqw = zztl();
    private static final boolean zzbst = zzp(Long.TYPE);
    private static final boolean zzbsu = zzp(Integer.TYPE);
    private static final zzd zzbsv;
    private static final boolean zzbsw = zztn();
    private static final long zzbsx = ((long) zzn(byte[].class));
    private static final long zzbsy;
    private static final long zzbsz;
    private static final long zzbta;
    private static final long zzbtb;
    private static final long zzbtc;
    private static final long zzbtd;
    private static final long zzbte;
    private static final long zzbtf;
    private static final long zzbtg;
    private static final long zzbth;
    private static final long zzbti = ((long) zzn(Object[].class));
    private static final long zzbtj = ((long) zzo(Object[].class));
    private static final long zzbtk;
    /* access modifiers changed from: private */
    public static final boolean zzbtl = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    private zzxc() {
    }

    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            if (zzxc.zzbtl) {
                return zzxc.zzq(obj, j);
            }
            return zzxc.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzxc.zzbtl) {
                zzxc.zza(obj, j, b);
            } else {
                zzxc.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzxc.zzbtl) {
                return zzxc.zzs(obj, j);
            }
            return zzxc.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzxc.zzbtl) {
                zzxc.zzb(obj, j, z);
            } else {
                zzxc.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            if (zzxc.zzbtl) {
                return zzxc.zzq(obj, j);
            }
            return zzxc.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzxc.zzbtl) {
                zzxc.zza(obj, j, b);
            } else {
                zzxc.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzxc.zzbtl) {
                return zzxc.zzs(obj, j);
            }
            return zzxc.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzxc.zzbtl) {
                zzxc.zzb(obj, j, z);
            } else {
                zzxc.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            return this.zzbtm.getByte(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzbtm.putByte(obj, j, b);
        }

        public final boolean zzm(Object obj, long j) {
            return this.zzbtm.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzbtm.putBoolean(obj, j, z);
        }

        public final float zzn(Object obj, long j) {
            return this.zzbtm.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzbtm.putFloat(obj, j, f);
        }

        public final double zzo(Object obj, long j) {
            return this.zzbtm.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzbtm.putDouble(obj, j, d);
        }
    }

    static boolean zztj() {
        return zzbkz;
    }

    static abstract class zzd {
        Unsafe zzbtm;

        zzd(Unsafe unsafe) {
            this.zzbtm = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zzbtm.getInt(obj, j);
        }

        public final void zza(Object obj, long j, int i) {
            this.zzbtm.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzbtm.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzbtm.putLong(obj, j, j2);
        }
    }

    static boolean zztk() {
        return zzbsw;
    }

    static <T> T zzm(Class<T> cls) {
        try {
            return zzbqw.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzn(Class<?> cls) {
        if (zzbkz) {
            return zzbsv.zzbtm.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzo(Class<?> cls) {
        if (zzbkz) {
            return zzbsv.zzbtm.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzk(Object obj, long j) {
        return zzbsv.zzk(obj, j);
    }

    static void zza(Object obj, long j, int i) {
        zzbsv.zza(obj, j, i);
    }

    static long zzl(Object obj, long j) {
        return zzbsv.zzl(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzbsv.zza(obj, j, j2);
    }

    static boolean zzm(Object obj, long j) {
        return zzbsv.zzm(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzbsv.zza(obj, j, z);
    }

    static float zzn(Object obj, long j) {
        return zzbsv.zzn(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzbsv.zza(obj, j, f);
    }

    static double zzo(Object obj, long j) {
        return zzbsv.zzo(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzbsv.zza(obj, j, d);
    }

    static Object zzp(Object obj, long j) {
        return zzbsv.zzbtm.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzbsv.zzbtm.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzbsv.zzy(bArr, zzbsx + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzbsv.zze(bArr, zzbsx + j, b);
    }

    static Unsafe zztl() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzxd());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zztm() {
        Unsafe unsafe = zzbqw;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (zzsr.zzpv()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zztn() {
        Unsafe unsafe = zzbqw;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (zzto() == null) {
                return false;
            }
            if (zzsr.zzpv()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzp(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zzsr.zzpv()) {
            return false;
        }
        try {
            Class<?> cls3 = zzbke;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field zzto() {
        Field zzb2;
        if (zzsr.zzpv() && (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
            return zzb2;
        }
        Field zzb3 = zzb(Buffer.class, "address");
        if (zzb3 == null || zzb3.getType() != Long.TYPE) {
            return null;
        }
        return zzb3;
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int zzk = zzk(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zza(obj, j2, ((~(255 << i)) & zzk) | ((b & 255) << i));
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        zza(obj, j2, ((~(255 << i)) & zzk(obj, j2)) | i2);
    }

    /* access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d3, code lost:
        r1 = zzbsv;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ed  */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzxc> r5 = com.google.android.gms.internal.firebase_ml.zzxc.class
            java.lang.String r5 = r5.getName()
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r5)
            logger = r5
            sun.misc.Unsafe r5 = zztl()
            zzbqw = r5
            java.lang.Class r5 = com.google.android.gms.internal.firebase_ml.zzsr.zzpw()
            zzbke = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = zzp(r5)
            zzbst = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r5 = zzp(r5)
            zzbsu = r5
            sun.misc.Unsafe r5 = zzbqw
            if (r5 != 0) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            boolean r5 = com.google.android.gms.internal.firebase_ml.zzsr.zzpv()
            if (r5 == 0) goto L_0x0057
            boolean r5 = zzbst
            if (r5 == 0) goto L_0x0049
            com.google.android.gms.internal.firebase_ml.zzxc$zzb r5 = new com.google.android.gms.internal.firebase_ml.zzxc$zzb
            sun.misc.Unsafe r6 = zzbqw
            r5.<init>(r6)
            goto L_0x005e
        L_0x0049:
            boolean r5 = zzbsu
            if (r5 == 0) goto L_0x0055
            com.google.android.gms.internal.firebase_ml.zzxc$zza r5 = new com.google.android.gms.internal.firebase_ml.zzxc$zza
            sun.misc.Unsafe r6 = zzbqw
            r5.<init>(r6)
            goto L_0x005e
        L_0x0055:
            r5 = 0
            goto L_0x005e
        L_0x0057:
            com.google.android.gms.internal.firebase_ml.zzxc$zzc r5 = new com.google.android.gms.internal.firebase_ml.zzxc$zzc
            sun.misc.Unsafe r6 = zzbqw
            r5.<init>(r6)
        L_0x005e:
            zzbsv = r5
            boolean r5 = zztn()
            zzbsw = r5
            boolean r5 = zztm()
            zzbkz = r5
            java.lang.Class<byte[]> r5 = byte[].class
            int r5 = zzn(r5)
            long r5 = (long) r5
            zzbsx = r5
            int r5 = zzn(r4)
            long r5 = (long) r5
            zzbsy = r5
            int r4 = zzo(r4)
            long r4 = (long) r4
            zzbsz = r4
            int r4 = zzn(r3)
            long r4 = (long) r4
            zzbta = r4
            int r3 = zzo(r3)
            long r3 = (long) r3
            zzbtb = r3
            int r3 = zzn(r2)
            long r3 = (long) r3
            zzbtc = r3
            int r2 = zzo(r2)
            long r2 = (long) r2
            zzbtd = r2
            int r2 = zzn(r1)
            long r2 = (long) r2
            zzbte = r2
            int r1 = zzo(r1)
            long r1 = (long) r1
            zzbtf = r1
            int r1 = zzn(r0)
            long r1 = (long) r1
            zzbtg = r1
            int r0 = zzo(r0)
            long r0 = (long) r0
            zzbth = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzn(r0)
            long r0 = (long) r0
            zzbti = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzo(r0)
            long r0 = (long) r0
            zzbtj = r0
            java.lang.reflect.Field r0 = zzto()
            if (r0 == 0) goto L_0x00df
            com.google.android.gms.internal.firebase_ml.zzxc$zzd r1 = zzbsv
            if (r1 != 0) goto L_0x00d8
            goto L_0x00df
        L_0x00d8:
            sun.misc.Unsafe r1 = r1.zzbtm
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00e1
        L_0x00df:
            r0 = -1
        L_0x00e1:
            zzbtk = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00ed
            r0 = 1
            goto L_0x00ee
        L_0x00ed:
            r0 = 0
        L_0x00ee:
            zzbtl = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzxc.<clinit>():void");
    }
}
