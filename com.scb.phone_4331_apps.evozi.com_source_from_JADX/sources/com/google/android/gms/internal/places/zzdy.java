package com.google.android.gms.internal.places;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzdy {
    private static final Logger logger = Logger.getLogger(zzdy.class.getName());
    private static final Class<?> zzdw = zzp.zzz();
    private static final boolean zzer = zzdo();
    private static final Unsafe zzkr = zzdn();
    private static final boolean zzmn = zzk(Long.TYPE);
    private static final boolean zzmo = zzk(Integer.TYPE);
    private static final zzd zzmp;
    private static final boolean zzmq = zzdp();
    private static final long zzmr = ((long) zzi(byte[].class));
    private static final long zzms;
    private static final long zzmt;
    private static final long zzmu;
    private static final long zzmv;
    private static final long zzmw;
    private static final long zzmx;
    private static final long zzmy;
    private static final long zzmz;
    private static final long zzna;
    private static final long zznb;
    private static final long zznc = ((long) zzi(Object[].class));
    private static final long zznd = ((long) zzj(Object[].class));
    private static final long zzne;
    private static final int zznf = ((int) (zzmr & 7));
    static final boolean zzng = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    private zzdy() {
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            if (zzdy.zzng) {
                return zzdy.zzq(obj, j);
            }
            return zzdy.zzr(obj, j);
        }

        public final void zzf(Object obj, long j, byte b) {
            if (zzdy.zzng) {
                zzdy.zzb(obj, j, b);
            } else {
                zzdy.zzc(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzdy.zzng) {
                return zzdy.zzs(obj, j);
            }
            return zzdy.zzt(obj, j);
        }

        public final void zzb(Object obj, long j, boolean z) {
            if (zzdy.zzng) {
                zzdy.zzc(obj, j, z);
            } else {
                zzdy.zzd(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zzb(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zzb(Object obj, long j, double d) {
            zzb(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            if (zzdy.zzng) {
                return zzdy.zzq(obj, j);
            }
            return zzdy.zzr(obj, j);
        }

        public final void zzf(Object obj, long j, byte b) {
            if (zzdy.zzng) {
                zzdy.zzb(obj, j, b);
            } else {
                zzdy.zzc(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzdy.zzng) {
                return zzdy.zzs(obj, j);
            }
            return zzdy.zzt(obj, j);
        }

        public final void zzb(Object obj, long j, boolean z) {
            if (zzdy.zzng) {
                zzdy.zzc(obj, j, z);
            } else {
                zzdy.zzd(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zzb(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zzb(Object obj, long j, double d) {
            zzb(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class zze extends zzd {
        zze(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            return this.zznh.getByte(obj, j);
        }

        public final void zzf(Object obj, long j, byte b) {
            this.zznh.putByte(obj, j, b);
        }

        public final boolean zzm(Object obj, long j) {
            return this.zznh.getBoolean(obj, j);
        }

        public final void zzb(Object obj, long j, boolean z) {
            this.zznh.putBoolean(obj, j, z);
        }

        public final float zzn(Object obj, long j) {
            return this.zznh.getFloat(obj, j);
        }

        public final void zzb(Object obj, long j, float f) {
            this.zznh.putFloat(obj, j, f);
        }

        public final double zzo(Object obj, long j) {
            return this.zznh.getDouble(obj, j);
        }

        public final void zzb(Object obj, long j, double d) {
            this.zznh.putDouble(obj, j, d);
        }
    }

    static boolean zzdl() {
        return zzer;
    }

    static abstract class zzd {
        Unsafe zznh;

        zzd(Unsafe unsafe) {
            this.zznh = unsafe;
        }

        public abstract void zzb(Object obj, long j, double d);

        public abstract void zzb(Object obj, long j, float f);

        public abstract void zzb(Object obj, long j, boolean z);

        public abstract void zzf(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zznh.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zznh.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zznh.getLong(obj, j);
        }

        public final void zzb(Object obj, long j, long j2) {
            this.zznh.putLong(obj, j, j2);
        }
    }

    static boolean zzdm() {
        return zzmq;
    }

    static <T> T zzh(Class<T> cls) {
        try {
            return zzkr.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzi(Class<?> cls) {
        if (zzer) {
            return zzmp.zznh.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(Class<?> cls) {
        if (zzer) {
            return zzmp.zznh.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzk(Object obj, long j) {
        return zzmp.zzk(obj, j);
    }

    static void zzb(Object obj, long j, int i) {
        zzmp.zzb(obj, j, i);
    }

    static long zzl(Object obj, long j) {
        return zzmp.zzl(obj, j);
    }

    static void zzb(Object obj, long j, long j2) {
        zzmp.zzb(obj, j, j2);
    }

    static boolean zzm(Object obj, long j) {
        return zzmp.zzm(obj, j);
    }

    static void zzb(Object obj, long j, boolean z) {
        zzmp.zzb(obj, j, z);
    }

    static float zzn(Object obj, long j) {
        return zzmp.zzn(obj, j);
    }

    static void zzb(Object obj, long j, float f) {
        zzmp.zzb(obj, j, f);
    }

    static double zzo(Object obj, long j) {
        return zzmp.zzo(obj, j);
    }

    static void zzb(Object obj, long j, double d) {
        zzmp.zzb(obj, j, d);
    }

    static Object zzp(Object obj, long j) {
        return zzmp.zznh.getObject(obj, j);
    }

    static void zzb(Object obj, long j, Object obj2) {
        zzmp.zznh.putObject(obj, j, obj2);
    }

    static byte zzb(byte[] bArr, long j) {
        return zzmp.zzy(bArr, zzmr + j);
    }

    static void zzb(byte[] bArr, long j, byte b) {
        zzmp.zzf(bArr, zzmr + j, b);
    }

    static Unsafe zzdn() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzdx());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzdo() {
        Unsafe unsafe = zzkr;
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
            if (zzp.zzy()) {
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

    private static boolean zzdp() {
        Unsafe unsafe = zzkr;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (zzdq() == null) {
                return false;
            }
            if (zzp.zzy()) {
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

    private static boolean zzk(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zzp.zzy()) {
            return false;
        }
        try {
            Class<?> cls3 = zzdw;
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

    private static Field zzdq() {
        Field zzc2;
        if (zzp.zzy() && (zzc2 = zzc(Buffer.class, "effectiveDirectAddress")) != null) {
            return zzc2;
        }
        Field zzc3 = zzc(Buffer.class, "address");
        if (zzc3 == null || zzc3.getType() != Long.TYPE) {
            return null;
        }
        return zzc3;
    }

    private static Field zzc(Class<?> cls, String str) {
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
    public static void zzb(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int zzk = zzk(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzb(obj, j2, ((~(255 << i)) & zzk) | ((b & 255) << i));
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        zzb(obj, j2, ((~(255 << i)) & zzk(obj, j2)) | i2);
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
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j, boolean z) {
        zzc(obj, j, z ? (byte) 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d3, code lost:
        r1 = zzmp;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f5  */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            java.lang.Class<com.google.android.gms.internal.places.zzdy> r5 = com.google.android.gms.internal.places.zzdy.class
            java.lang.String r5 = r5.getName()
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r5)
            logger = r5
            sun.misc.Unsafe r5 = zzdn()
            zzkr = r5
            java.lang.Class r5 = com.google.android.gms.internal.places.zzp.zzz()
            zzdw = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = zzk(r5)
            zzmn = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r5 = zzk(r5)
            zzmo = r5
            sun.misc.Unsafe r5 = zzkr
            if (r5 != 0) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            boolean r5 = com.google.android.gms.internal.places.zzp.zzy()
            if (r5 == 0) goto L_0x0057
            boolean r5 = zzmn
            if (r5 == 0) goto L_0x0049
            com.google.android.gms.internal.places.zzdy$zzb r5 = new com.google.android.gms.internal.places.zzdy$zzb
            sun.misc.Unsafe r6 = zzkr
            r5.<init>(r6)
            goto L_0x005e
        L_0x0049:
            boolean r5 = zzmo
            if (r5 == 0) goto L_0x0055
            com.google.android.gms.internal.places.zzdy$zzc r5 = new com.google.android.gms.internal.places.zzdy$zzc
            sun.misc.Unsafe r6 = zzkr
            r5.<init>(r6)
            goto L_0x005e
        L_0x0055:
            r5 = 0
            goto L_0x005e
        L_0x0057:
            com.google.android.gms.internal.places.zzdy$zze r5 = new com.google.android.gms.internal.places.zzdy$zze
            sun.misc.Unsafe r6 = zzkr
            r5.<init>(r6)
        L_0x005e:
            zzmp = r5
            boolean r5 = zzdp()
            zzmq = r5
            boolean r5 = zzdo()
            zzer = r5
            java.lang.Class<byte[]> r5 = byte[].class
            int r5 = zzi(r5)
            long r5 = (long) r5
            zzmr = r5
            int r5 = zzi(r4)
            long r5 = (long) r5
            zzms = r5
            int r4 = zzj(r4)
            long r4 = (long) r4
            zzmt = r4
            int r4 = zzi(r3)
            long r4 = (long) r4
            zzmu = r4
            int r3 = zzj(r3)
            long r3 = (long) r3
            zzmv = r3
            int r3 = zzi(r2)
            long r3 = (long) r3
            zzmw = r3
            int r2 = zzj(r2)
            long r2 = (long) r2
            zzmx = r2
            int r2 = zzi(r1)
            long r2 = (long) r2
            zzmy = r2
            int r1 = zzj(r1)
            long r1 = (long) r1
            zzmz = r1
            int r1 = zzi(r0)
            long r1 = (long) r1
            zzna = r1
            int r0 = zzj(r0)
            long r0 = (long) r0
            zznb = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzi(r0)
            long r0 = (long) r0
            zznc = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzj(r0)
            long r0 = (long) r0
            zznd = r0
            java.lang.reflect.Field r0 = zzdq()
            if (r0 == 0) goto L_0x00df
            com.google.android.gms.internal.places.zzdy$zzd r1 = zzmp
            if (r1 != 0) goto L_0x00d8
            goto L_0x00df
        L_0x00d8:
            sun.misc.Unsafe r1 = r1.zznh
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00e1
        L_0x00df:
            r0 = -1
        L_0x00e1:
            zzne = r0
            long r0 = zzmr
            r2 = 7
            long r0 = r0 & r2
            int r0 = (int) r0
            zznf = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00f5
            r0 = 1
            goto L_0x00f6
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            zzng = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzdy.<clinit>():void");
    }
}
