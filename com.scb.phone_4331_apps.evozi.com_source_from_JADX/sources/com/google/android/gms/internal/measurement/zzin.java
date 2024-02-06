package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzin {
    static final boolean zza = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);
    private static final Logger zzb = Logger.getLogger(zzin.class.getName());
    private static final Unsafe zzc = zzc();
    private static final Class<?> zzd = zzdz.zzb();
    private static final boolean zze = zzd(Long.TYPE);
    private static final boolean zzf = zzd(Integer.TYPE);
    private static final zzc zzg;
    private static final boolean zzh = zze();
    private static final boolean zzi = zzd();
    private static final long zzj = ((long) zzb(byte[].class));
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu = ((long) zzb(Object[].class));
    private static final long zzv = ((long) zzc(Object[].class));
    private static final long zzw;
    private static final int zzx = ((int) (zzj & 7));

    private zzin() {
    }

    static final class zza extends zzc {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zza(Object obj, long j) {
            if (zzin.zza) {
                return zzin.zzk(obj, j);
            }
            return zzin.zzl(obj, j);
        }

        public final void zza(Object obj, long j, byte b) {
            if (zzin.zza) {
                zzin.zzc(obj, j, b);
            } else {
                zzin.zzd(obj, j, b);
            }
        }

        public final boolean zzb(Object obj, long j) {
            if (zzin.zza) {
                return zzin.zzm(obj, j);
            }
            return zzin.zzn(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzin.zza) {
                zzin.zzd(obj, j, z);
            } else {
                zzin.zze(obj, j, z);
            }
        }

        public final float zzc(Object obj, long j) {
            return Float.intBitsToFloat(zze(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final double zzd(Object obj, long j) {
            return Double.longBitsToDouble(zzf(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class zzb extends zzc {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zza(Object obj, long j) {
            if (zzin.zza) {
                return zzin.zzk(obj, j);
            }
            return zzin.zzl(obj, j);
        }

        public final void zza(Object obj, long j, byte b) {
            if (zzin.zza) {
                zzin.zzc(obj, j, b);
            } else {
                zzin.zzd(obj, j, b);
            }
        }

        public final boolean zzb(Object obj, long j) {
            if (zzin.zza) {
                return zzin.zzm(obj, j);
            }
            return zzin.zzn(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzin.zza) {
                zzin.zzd(obj, j, z);
            } else {
                zzin.zze(obj, j, z);
            }
        }

        public final float zzc(Object obj, long j) {
            return Float.intBitsToFloat(zze(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final double zzd(Object obj, long j) {
            return Double.longBitsToDouble(zzf(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class zzd extends zzc {
        zzd(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zza(Object obj, long j) {
            return this.zza.getByte(obj, j);
        }

        public final void zza(Object obj, long j, byte b) {
            this.zza.putByte(obj, j, b);
        }

        public final boolean zzb(Object obj, long j) {
            return this.zza.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zza.putBoolean(obj, j, z);
        }

        public final float zzc(Object obj, long j) {
            return this.zza.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zza.putFloat(obj, j, f);
        }

        public final double zzd(Object obj, long j) {
            return this.zza.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zza.putDouble(obj, j, d);
        }
    }

    static boolean zza() {
        return zzi;
    }

    static abstract class zzc {
        Unsafe zza;

        zzc(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract byte zza(Object obj, long j);

        public abstract void zza(Object obj, long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract boolean zzb(Object obj, long j);

        public abstract float zzc(Object obj, long j);

        public abstract double zzd(Object obj, long j);

        public final int zze(Object obj, long j) {
            return this.zza.getInt(obj, j);
        }

        public final void zza(Object obj, long j, int i) {
            this.zza.putInt(obj, j, i);
        }

        public final long zzf(Object obj, long j) {
            return this.zza.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zza.putLong(obj, j, j2);
        }
    }

    static boolean zzb() {
        return zzh;
    }

    static <T> T zza(Class<T> cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzb(Class<?> cls) {
        if (zzi) {
            return zzg.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzc(Class<?> cls) {
        if (zzi) {
            return zzg.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zza(Object obj, long j) {
        return zzg.zze(obj, j);
    }

    static void zza(Object obj, long j, int i) {
        zzg.zza(obj, j, i);
    }

    static long zzb(Object obj, long j) {
        return zzg.zzf(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzg.zza(obj, j, j2);
    }

    static boolean zzc(Object obj, long j) {
        return zzg.zzb(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzg.zza(obj, j, z);
    }

    static float zzd(Object obj, long j) {
        return zzg.zzc(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzg.zza(obj, j, f);
    }

    static double zze(Object obj, long j) {
        return zzg.zzd(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzg.zza(obj, j, d);
    }

    static Object zzf(Object obj, long j) {
        return zzg.zza.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzg.zza.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzg.zza(bArr, zzj + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzg.zza((Object) bArr, zzj + j, b);
    }

    static Unsafe zzc() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzim());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzd() {
        Unsafe unsafe = zzc;
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
            if (zzdz.zza()) {
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
            Logger logger = zzb;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zze() {
        Unsafe unsafe = zzc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (zzf() == null) {
                return false;
            }
            if (zzdz.zza()) {
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
            Logger logger = zzb;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzd(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zzdz.zza()) {
            return false;
        }
        try {
            Class<?> cls3 = zzd;
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

    private static Field zzf() {
        Field zza2;
        if (zzdz.zza() && (zza2 = zza((Class<?>) Buffer.class, "effectiveDirectAddress")) != null) {
            return zza2;
        }
        Field zza3 = zza((Class<?>) Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static byte zzk(Object obj, long j) {
        return (byte) (zza(obj, -4 & j) >>> ((int) (((~j) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte zzl(Object obj, long j) {
        return (byte) (zza(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int zza2 = zza(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zza(obj, j2, ((~(255 << i)) & zza2) | ((b & 255) << i));
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        zza(obj, j2, ((~(255 << i)) & zza(obj, j2)) | i2);
    }

    /* access modifiers changed from: private */
    public static boolean zzm(Object obj, long j) {
        return zzk(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzn(Object obj, long j) {
        return zzl(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static void zzd(Object obj, long j, boolean z) {
        zzc(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void zze(Object obj, long j, boolean z) {
        zzd(obj, j, z ? (byte) 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d3, code lost:
        r1 = zzg;
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
            java.lang.Class<com.google.android.gms.internal.measurement.zzin> r5 = com.google.android.gms.internal.measurement.zzin.class
            java.lang.String r5 = r5.getName()
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r5)
            zzb = r5
            sun.misc.Unsafe r5 = zzc()
            zzc = r5
            java.lang.Class r5 = com.google.android.gms.internal.measurement.zzdz.zzb()
            zzd = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = zzd(r5)
            zze = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r5 = zzd(r5)
            zzf = r5
            sun.misc.Unsafe r5 = zzc
            if (r5 != 0) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            boolean r5 = com.google.android.gms.internal.measurement.zzdz.zza()
            if (r5 == 0) goto L_0x0057
            boolean r5 = zze
            if (r5 == 0) goto L_0x0049
            com.google.android.gms.internal.measurement.zzin$zza r5 = new com.google.android.gms.internal.measurement.zzin$zza
            sun.misc.Unsafe r6 = zzc
            r5.<init>(r6)
            goto L_0x005e
        L_0x0049:
            boolean r5 = zzf
            if (r5 == 0) goto L_0x0055
            com.google.android.gms.internal.measurement.zzin$zzb r5 = new com.google.android.gms.internal.measurement.zzin$zzb
            sun.misc.Unsafe r6 = zzc
            r5.<init>(r6)
            goto L_0x005e
        L_0x0055:
            r5 = 0
            goto L_0x005e
        L_0x0057:
            com.google.android.gms.internal.measurement.zzin$zzd r5 = new com.google.android.gms.internal.measurement.zzin$zzd
            sun.misc.Unsafe r6 = zzc
            r5.<init>(r6)
        L_0x005e:
            zzg = r5
            boolean r5 = zze()
            zzh = r5
            boolean r5 = zzd()
            zzi = r5
            java.lang.Class<byte[]> r5 = byte[].class
            int r5 = zzb(r5)
            long r5 = (long) r5
            zzj = r5
            int r5 = zzb(r4)
            long r5 = (long) r5
            zzk = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            zzl = r4
            int r4 = zzb(r3)
            long r4 = (long) r4
            zzm = r4
            int r3 = zzc(r3)
            long r3 = (long) r3
            zzn = r3
            int r3 = zzb(r2)
            long r3 = (long) r3
            zzo = r3
            int r2 = zzc(r2)
            long r2 = (long) r2
            zzp = r2
            int r2 = zzb(r1)
            long r2 = (long) r2
            zzq = r2
            int r1 = zzc(r1)
            long r1 = (long) r1
            zzr = r1
            int r1 = zzb(r0)
            long r1 = (long) r1
            zzs = r1
            int r0 = zzc(r0)
            long r0 = (long) r0
            zzt = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzb(r0)
            long r0 = (long) r0
            zzu = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzc(r0)
            long r0 = (long) r0
            zzv = r0
            java.lang.reflect.Field r0 = zzf()
            if (r0 == 0) goto L_0x00df
            com.google.android.gms.internal.measurement.zzin$zzc r1 = zzg
            if (r1 != 0) goto L_0x00d8
            goto L_0x00df
        L_0x00d8:
            sun.misc.Unsafe r1 = r1.zza
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00e1
        L_0x00df:
            r0 = -1
        L_0x00e1:
            zzw = r0
            long r0 = zzj
            r2 = 7
            long r0 = r0 & r2
            int r0 = (int) r0
            zzx = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00f5
            r0 = 1
            goto L_0x00f6
        L_0x00f5:
            r0 = 0
        L_0x00f6:
            zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzin.<clinit>():void");
    }
}
