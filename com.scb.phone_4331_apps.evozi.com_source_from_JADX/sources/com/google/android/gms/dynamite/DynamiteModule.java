package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zze();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzd();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzg();
    public static final VersionPolicy PREFER_LOCAL = new zzb();
    public static final VersionPolicy PREFER_REMOTE = new zzc();
    private static Boolean zziu = null;
    private static zzj zziv = null;
    private static zzl zziw = null;
    private static String zzix = null;
    private static int zziy = -1;
    private static final ThreadLocal<zza> zziz = new ThreadLocal<>();
    private static final VersionPolicy.zzb zzja = new zza();
    private static final VersionPolicy zzjb = new zzf();
    private final Context zzjc;

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public interface VersionPolicy {

        public static final class zza {
            public int zzjg = 0;
            public int zzjh = 0;
            public int zzji = 0;
        }

        public interface zzb {
            int getLocalVersion(Context context, String str);

            int zza(Context context, String str, boolean z) throws LoadingException;
        }

        zza zza(Context context, String str, zzb zzb2) throws LoadingException;
    }

    static final class zza {
        public Cursor zzjd;

        private zza() {
        }

        /* synthetic */ zza(zza zza) {
            this();
        }
    }

    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws LoadingException {
        VersionPolicy.zza zza2;
        zza zza3 = zziz.get();
        zza zza4 = new zza((zza) null);
        zziz.set(zza4);
        try {
            zza2 = versionPolicy.zza(context, str, zzja);
            int i = zza2.zzjg;
            int i2 = zza2.zzjh;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            Log.i("DynamiteModule", sb.toString());
            if (zza2.zzji == 0 || ((zza2.zzji == -1 && zza2.zzjg == 0) || (zza2.zzji == 1 && zza2.zzjh == 0))) {
                int i3 = zza2.zzjg;
                int i4 = zza2.zzjh;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i3);
                sb2.append(" and remote version is ");
                sb2.append(i4);
                sb2.append(".");
                throw new LoadingException(sb2.toString(), (zza) null);
            } else if (zza2.zzji == -1) {
                DynamiteModule zze = zze(context, str);
                if (zza4.zzjd != null) {
                    zza4.zzjd.close();
                }
                zziz.set(zza3);
                return zze;
            } else if (zza2.zzji == 1) {
                DynamiteModule zza5 = zza(context, str, zza2.zzjh);
                if (zza4.zzjd != null) {
                    zza4.zzjd.close();
                }
                zziz.set(zza3);
                return zza5;
            } else {
                int i5 = zza2.zzji;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i5);
                throw new LoadingException(sb3.toString(), (zza) null);
            }
        } catch (LoadingException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
            if (zza2.zzjg == 0 || versionPolicy.zza(context, str, new zzb(zza2.zzjg, 0)).zzji != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e, (zza) null);
            }
            DynamiteModule zze2 = zze(context, str);
            if (zza4.zzjd != null) {
                zza4.zzjd.close();
            }
            zziz.set(zza3);
            return zze2;
        } catch (Throwable th) {
            if (zza4.zzjd != null) {
                zza4.zzjd.close();
            }
            zziz.set(zza3);
            throw th;
        }
    }

    public static class LoadingException extends Exception {
        private LoadingException(String str) {
            super(str);
        }

        private LoadingException(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ LoadingException(String str, zza zza) {
            this(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zza zza) {
            this(str, th);
        }
    }

    static final class zzb implements VersionPolicy.zzb {
        private final int zzje;
        private final int zzjf = 0;

        public zzb(int i, int i2) {
            this.zzje = i;
        }

        public final int zza(Context context, String str, boolean z) {
            return 0;
        }

        public final int getLocalVersion(Context context, String str) {
            return this.zzje;
        }
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035} */
    public static int zza(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x0104 }
            java.lang.Boolean r1 = zziu     // Catch:{ all -> 0x0101 }
            if (r1 != 0) goto L_0x00cc
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x009c }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x0099
        L_0x0032:
            zza(r4)     // Catch:{ LoadingException -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009c }
            goto L_0x0099
        L_0x0038:
            android.content.Context r4 = r8.getApplicationContext()     // Catch:{ all -> 0x009c }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x009c }
            java.lang.String r5 = "com.google.android.gms"
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r2.set(r3, r4)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x0099
        L_0x0052:
            int r4 = zzc(r8, r9, r10)     // Catch:{ LoadingException -> 0x0090 }
            java.lang.String r5 = zzix     // Catch:{ LoadingException -> 0x0090 }
            if (r5 == 0) goto L_0x008d
            java.lang.String r5 = zzix     // Catch:{ LoadingException -> 0x0090 }
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x0090 }
            if (r5 == 0) goto L_0x0063
            goto L_0x008d
        L_0x0063:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x0090 }
            r6 = 29
            if (r5 < r6) goto L_0x0075
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x0090 }
            java.lang.String r6 = zzix     // Catch:{ LoadingException -> 0x0090 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0090 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x0090 }
            goto L_0x0080
        L_0x0075:
            com.google.android.gms.dynamite.zzh r5 = new com.google.android.gms.dynamite.zzh     // Catch:{ LoadingException -> 0x0090 }
            java.lang.String r6 = zzix     // Catch:{ LoadingException -> 0x0090 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0090 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x0090 }
        L_0x0080:
            zza(r5)     // Catch:{ LoadingException -> 0x0090 }
            r2.set(r3, r5)     // Catch:{ LoadingException -> 0x0090 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x0090 }
            zziu = r5     // Catch:{ LoadingException -> 0x0090 }
            monitor-exit(r1)
            monitor-exit(r0)
            return r4
        L_0x008d:
            monitor-exit(r1)
            monitor-exit(r0)
            return r4
        L_0x0090:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r2.set(r3, r4)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
        L_0x0099:
            monitor-exit(r1)
            r1 = r2
            goto L_0x00ca
        L_0x009c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
        L_0x009f:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a1:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a3:
            r1 = move-exception
        L_0x00a4:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0101 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0101 }
            int r2 = r2.length()     // Catch:{ all -> 0x0101 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
            int r2 = r2 + 30
            r3.<init>(r2)     // Catch:{ all -> 0x0101 }
            java.lang.String r2 = "Failed to load module via V2: "
            r3.append(r2)     // Catch:{ all -> 0x0101 }
            r3.append(r1)     // Catch:{ all -> 0x0101 }
            java.lang.String r1 = "DynamiteModule"
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0101 }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x0101 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0101 }
        L_0x00ca:
            zziu = r1     // Catch:{ all -> 0x0101 }
        L_0x00cc:
            monitor-exit(r0)
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00fc
            int r8 = zzc(r8, r9, r10)     // Catch:{ LoadingException -> 0x00d8 }
            return r8
        L_0x00d8:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x0104 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0104 }
            int r10 = r9.length()     // Catch:{ all -> 0x0104 }
            if (r10 == 0) goto L_0x00ee
            java.lang.String r10 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r10.concat(r9)     // Catch:{ all -> 0x0104 }
            goto L_0x00f5
        L_0x00ee:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0104 }
            java.lang.String r10 = "Failed to retrieve remote module version: "
            r9.<init>(r10)     // Catch:{ all -> 0x0104 }
        L_0x00f5:
            java.lang.String r10 = "DynamiteModule"
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x0104 }
            r8 = 0
            return r8
        L_0x00fc:
            int r8 = zzb((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ all -> 0x0104 }
            return r8
        L_0x0101:
            r9 = move-exception
            monitor-exit(r0)
            throw r9     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r9 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r8, r9)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    private static int zzb(Context context, String str, boolean z) {
        zzj zzk = zzk(context);
        if (zzk == null) {
            return 0;
        }
        try {
            if (zzk.zzak() >= 2) {
                return zzk.zzb(ObjectWrapper.wrap(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return zzk.zza(ObjectWrapper.wrap(context), str, z);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzc(android.content.Context r7, java.lang.String r8, boolean r9) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            if (r9 == 0) goto L_0x000a
            java.lang.String r7 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r7 = "api"
        L_0x000c:
            int r9 = r7.length()     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            int r2 = r2.length()     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            int r9 = r9 + 42
            int r9 = r9 + r2
            r3.<init>(r9)     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            java.lang.String r9 = "content://com.google.android.gms.chimera/"
            r3.append(r9)     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            r3.append(r7)     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            java.lang.String r7 = "/"
            r3.append(r7)     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            r3.append(r8)     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            java.lang.String r7 = r3.toString()     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            android.net.Uri r2 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0097, all -> 0x0094 }
            if (r7 == 0) goto L_0x0083
            boolean r8 = r7.moveToFirst()     // Catch:{ Exception -> 0x0092 }
            if (r8 == 0) goto L_0x0083
            r8 = 0
            int r8 = r7.getInt(r8)     // Catch:{ Exception -> 0x0092 }
            if (r8 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r9 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r9)     // Catch:{ Exception -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r7.getString(r1)     // Catch:{ all -> 0x0079 }
            zzix = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r7.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r7.getInt(r1)     // Catch:{ all -> 0x0079 }
            zziy = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r9)
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$zza> r9 = zziz     // Catch:{ Exception -> 0x0092 }
            java.lang.Object r9 = r9.get()     // Catch:{ Exception -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$zza r9 = (com.google.android.gms.dynamite.DynamiteModule.zza) r9     // Catch:{ Exception -> 0x0092 }
            if (r9 == 0) goto L_0x007c
            android.database.Cursor r1 = r9.zzjd     // Catch:{ Exception -> 0x0092 }
            if (r1 != 0) goto L_0x007c
            r9.zzjd = r7     // Catch:{ Exception -> 0x0092 }
            goto L_0x007d
        L_0x0079:
            r8 = move-exception
            monitor-exit(r9)
            throw r8     // Catch:{ Exception -> 0x0092 }
        L_0x007c:
            r0 = r7
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r8
        L_0x0083:
            java.lang.String r8 = "DynamiteModule"
            java.lang.String r9 = "Failed to retrieve remote module version."
            android.util.Log.w(r8, r9)     // Catch:{ Exception -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r8 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x0092 }
            java.lang.String r9 = "Failed to connect to dynamite module ContentResolver."
            r8.<init>((java.lang.String) r9, (com.google.android.gms.dynamite.zza) r0)     // Catch:{ Exception -> 0x0092 }
            throw r8     // Catch:{ Exception -> 0x0092 }
        L_0x0092:
            r8 = move-exception
            goto L_0x009a
        L_0x0094:
            r7 = move-exception
            r8 = r7
            goto L_0x00a9
        L_0x0097:
            r7 = move-exception
            r8 = r7
            r7 = r0
        L_0x009a:
            boolean r9 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException
            if (r9 == 0) goto L_0x009f
            throw r8     // Catch:{ all -> 0x00a7 }
        L_0x009f:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00a7 }
            java.lang.String r1 = "V2 version check failed"
            r9.<init>(r1, r8, r0)     // Catch:{ all -> 0x00a7 }
            throw r9     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r8 = move-exception
            r0 = r7
        L_0x00a9:
            if (r0 == 0) goto L_0x00ae
            r0.close()
        L_0x00ae:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzc(android.content.Context, java.lang.String, boolean):int");
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    private static DynamiteModule zze(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static DynamiteModule zza(Context context, String str, int i) throws LoadingException {
        Boolean bool;
        IObjectWrapper iObjectWrapper;
        try {
            synchronized (DynamiteModule.class) {
                bool = zziu;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", (zza) null);
            } else if (bool.booleanValue()) {
                return zzb(context, str, i);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i);
                Log.i("DynamiteModule", sb.toString());
                zzj zzk = zzk(context);
                if (zzk != null) {
                    if (zzk.zzak() >= 2) {
                        iObjectWrapper = zzk.zzb(ObjectWrapper.wrap(context), str, i);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        iObjectWrapper = zzk.zza(ObjectWrapper.wrap(context), str, i);
                    }
                    if (ObjectWrapper.unwrap(iObjectWrapper) != null) {
                        return new DynamiteModule((Context) ObjectWrapper.unwrap(iObjectWrapper));
                    }
                    throw new LoadingException("Failed to load remote module.", (zza) null);
                }
                throw new LoadingException("Failed to create IDynamiteLoader.", (zza) null);
            }
        } catch (RemoteException e) {
            throw new LoadingException("Failed to load remote module.", e, (zza) null);
        } catch (LoadingException e2) {
            throw e2;
        } catch (Throwable th) {
            CrashUtils.addDynamiteErrorToDropBox(context, th);
            throw new LoadingException("Failed to load remote module.", th, (zza) null);
        }
    }

    private static zzj zzk(Context context) {
        zzj zzj;
        synchronized (DynamiteModule.class) {
            if (zziv != null) {
                zzj zzj2 = zziv;
                return zzj2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzj = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof zzj) {
                        zzj = (zzj) queryLocalInterface;
                    } else {
                        zzj = new zzi(iBinder);
                    }
                }
                if (zzj != null) {
                    zziv = zzj;
                    return zzj;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    public final Context getModuleContext() {
        return this.zzjc;
    }

    private static DynamiteModule zzb(Context context, String str, int i) throws LoadingException, RemoteException {
        zzl zzl;
        IObjectWrapper iObjectWrapper;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            zzl = zziw;
        }
        if (zzl != null) {
            zza zza2 = zziz.get();
            if (zza2 == null || zza2.zzjd == null) {
                throw new LoadingException("No result cursor", (zza) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = zza2.zzjd;
            ObjectWrapper.wrap(null);
            if (zzaj().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                iObjectWrapper = zzl.zzb(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                iObjectWrapper = zzl.zza(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor));
            }
            Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new LoadingException("Failed to get module context", (zza) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (zza) null);
    }

    private static Boolean zzaj() {
        boolean z;
        synchronized (DynamiteModule.class) {
            z = zziy >= 2;
        }
        return Boolean.valueOf(z);
    }

    private static void zza(ClassLoader classLoader) throws LoadingException {
        zzl zzl;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzl = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzl) {
                    zzl = (zzl) queryLocalInterface;
                } else {
                    zzl = new zzk(iBinder);
                }
            }
            zziw = zzl;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (zza) null);
        }
    }

    public final IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzjc.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e, (zza) null);
        }
    }

    private DynamiteModule(Context context) {
        this.zzjc = (Context) Preconditions.checkNotNull(context);
    }
}
