package com.google.android.gms.internal.firebase_ml;

import android.os.Build;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public final class zzoq {
    /* access modifiers changed from: private */
    public static final GmsLogger zzaoz = new GmsLogger("RemoteModelFileManager", "");
    private static String zzarb = "com.google.firebase.ml.%s.models";
    private static final String zzarc = String.format("com.google.firebase.ml.%s.models", new Object[]{"custom"});
    private static final String zzard = String.format(zzarb, new Object[]{"automl"});
    private static final String zzare = String.format(zzarb, new Object[]{"base"});
    private static final String zzarf = String.format(zzarb, new Object[]{"translate"});
    private final FirebaseApp zzapo;
    private final String zzaqg;
    private final zzok zzara;
    private final zzox zzarg;
    private final zzoh zzarh;

    public zzoq(FirebaseApp firebaseApp, String str, zzol zzol, zzok zzok) {
        this.zzapo = firebaseApp;
        this.zzaqg = str;
        this.zzara = zzok;
        this.zzarg = new zzox(zzol);
        int i = zzor.zzari[zzok.ordinal()];
        if (i == 1) {
            this.zzarh = new zzob(firebaseApp, str);
        } else if (i == 2) {
            this.zzarh = new zzot(firebaseApp, str);
        } else if (i == 3 || i == 4) {
            this.zzarh = new zzos(firebaseApp, str);
        } else {
            throw new IllegalArgumentException("Unexpected model type");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0145, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0148, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        zza(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014c, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x014f, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        zza(r8, (java.io.FileInputStream) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0153, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File zza(android.os.ParcelFileDescriptor r8, java.lang.String r9, com.google.android.gms.internal.firebase_ml.zzon r10) throws com.google.firebase.p067ml.common.FirebaseMLException {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.firebase.FirebaseApp r0 = r7.zzapo     // Catch:{ all -> 0x017d }
            com.google.android.gms.internal.firebase_ml.zzok r0 = com.google.android.gms.internal.firebase_ml.zzoa.zzb((com.google.firebase.FirebaseApp) r0, (java.lang.String) r9)     // Catch:{ all -> 0x017d }
            com.google.android.gms.internal.firebase_ml.zzok r1 = r7.zzara     // Catch:{ all -> 0x017d }
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x017d }
            if (r1 != 0) goto L_0x0056
            com.google.firebase.ml.common.FirebaseMLException r8 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x017d }
            if (r0 != 0) goto L_0x0016
            java.lang.String r9 = "invalid"
            goto L_0x001a
        L_0x0016:
            java.lang.String r9 = r0.name()     // Catch:{ all -> 0x017d }
        L_0x001a:
            com.google.android.gms.internal.firebase_ml.zzok r10 = r7.zzara     // Catch:{ all -> 0x017d }
            java.lang.String r10 = r10.name()     // Catch:{ all -> 0x017d }
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x017d }
            int r0 = r0.length()     // Catch:{ all -> 0x017d }
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x017d }
            int r1 = r1.length()     // Catch:{ all -> 0x017d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x017d }
            int r0 = r0 + 93
            int r0 = r0 + r1
            r2.<init>(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r0 = "You are trying to use a "
            r2.append(r0)     // Catch:{ all -> 0x017d }
            r2.append(r9)     // Catch:{ all -> 0x017d }
            java.lang.String r9 = " model as a "
            r2.append(r9)     // Catch:{ all -> 0x017d }
            r2.append(r10)     // Catch:{ all -> 0x017d }
            java.lang.String r9 = " model. Please make sure you specified the correct model."
            r2.append(r9)     // Catch:{ all -> 0x017d }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x017d }
            r10 = 3
            r8.<init>(r9, r10)     // Catch:{ all -> 0x017d }
            throw r8     // Catch:{ all -> 0x017d }
        L_0x0056:
            com.google.firebase.FirebaseApp r0 = r7.zzapo     // Catch:{ all -> 0x017d }
            java.lang.String r1 = r7.zzaqg     // Catch:{ all -> 0x017d }
            com.google.android.gms.internal.firebase_ml.zzok r2 = r7.zzara     // Catch:{ all -> 0x017d }
            r3 = 1
            java.io.File r0 = zza(r0, r1, r2, r3)     // Catch:{ all -> 0x017d }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x017d }
            java.lang.String r2 = "to_be_validated_model.tmp"
            r1.<init>(r0, r2)     // Catch:{ all -> 0x017d }
            r0 = 0
            android.os.ParcelFileDescriptor$AutoCloseInputStream r2 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ IOException -> 0x0154 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x0154 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x014d }
            r8.<init>(r1)     // Catch:{ all -> 0x014d }
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0146 }
        L_0x0077:
            int r4 = r2.read(r3)     // Catch:{ all -> 0x0146 }
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L_0x0083
            r8.write(r3, r6, r4)     // Catch:{ all -> 0x0146 }
            goto L_0x0077
        L_0x0083:
            java.io.FileDescriptor r3 = r8.getFD()     // Catch:{ all -> 0x0146 }
            r3.sync()     // Catch:{ all -> 0x0146 }
            zza((java.lang.Throwable) r0, (java.io.FileOutputStream) r8)     // Catch:{ all -> 0x014d }
            zza((java.lang.Throwable) r0, (java.io.FileInputStream) r2)     // Catch:{ IOException -> 0x0154 }
            boolean r8 = com.google.android.gms.internal.firebase_ml.zzox.zza(r1, r9)     // Catch:{ all -> 0x017d }
            if (r8 == 0) goto L_0x00ed
            com.google.android.gms.internal.firebase_ml.zzox r2 = r7.zzarg     // Catch:{ all -> 0x017d }
            boolean r6 = r2.zzb(r1, r10)     // Catch:{ all -> 0x017d }
            if (r6 != 0) goto L_0x00ed
            com.google.firebase.FirebaseApp r10 = r7.zzapo     // Catch:{ all -> 0x017d }
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ all -> 0x017d }
            java.lang.String r10 = com.google.android.gms.internal.firebase_ml.zznk.zza((android.content.Context) r10)     // Catch:{ all -> 0x017d }
            com.google.firebase.FirebaseApp r2 = r7.zzapo     // Catch:{ all -> 0x017d }
            java.lang.String r3 = r7.zzaqg     // Catch:{ all -> 0x017d }
            com.google.android.gms.internal.firebase_ml.zzoa.zza(r2, r3, r9, r10)     // Catch:{ all -> 0x017d }
            com.google.android.gms.common.internal.GmsLogger r2 = zzaoz     // Catch:{ all -> 0x017d }
            java.lang.String r3 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x017d }
            int r4 = r3.length()     // Catch:{ all -> 0x017d }
            if (r4 == 0) goto L_0x00c2
            java.lang.String r4 = "Model is not compatible. Model hash: "
            java.lang.String r3 = r4.concat(r3)     // Catch:{ all -> 0x017d }
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x017d }
            java.lang.String r4 = "Model is not compatible. Model hash: "
            r3.<init>(r4)     // Catch:{ all -> 0x017d }
        L_0x00c9:
            java.lang.String r4 = "RemoteModelFileManager"
            r2.mo4172d(r4, r3)     // Catch:{ all -> 0x017d }
            com.google.android.gms.common.internal.GmsLogger r2 = zzaoz     // Catch:{ all -> 0x017d }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x017d }
            int r3 = r10.length()     // Catch:{ all -> 0x017d }
            if (r3 == 0) goto L_0x00e1
            java.lang.String r3 = "The current app version is: "
            java.lang.String r10 = r3.concat(r10)     // Catch:{ all -> 0x017d }
            goto L_0x00e8
        L_0x00e1:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x017d }
            java.lang.String r3 = "The current app version is: "
            r10.<init>(r3)     // Catch:{ all -> 0x017d }
        L_0x00e8:
            java.lang.String r3 = "RemoteModelFileManager"
            r2.mo4172d(r3, r10)     // Catch:{ all -> 0x017d }
        L_0x00ed:
            if (r8 == 0) goto L_0x00fa
            if (r6 != 0) goto L_0x00f2
            goto L_0x00fa
        L_0x00f2:
            com.google.android.gms.internal.firebase_ml.zzoh r8 = r7.zzarh     // Catch:{ all -> 0x017d }
            java.io.File r8 = r8.zza(r1)     // Catch:{ all -> 0x017d }
            monitor-exit(r7)
            return r8
        L_0x00fa:
            if (r8 != 0) goto L_0x011b
            com.google.android.gms.common.internal.GmsLogger r8 = zzaoz     // Catch:{ all -> 0x017d }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x017d }
            int r10 = r9.length()     // Catch:{ all -> 0x017d }
            if (r10 == 0) goto L_0x010f
            java.lang.String r10 = "Hash does not match with expected: "
            java.lang.String r9 = r10.concat(r9)     // Catch:{ all -> 0x017d }
            goto L_0x0116
        L_0x010f:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x017d }
            java.lang.String r10 = "Hash does not match with expected: "
            r9.<init>(r10)     // Catch:{ all -> 0x017d }
        L_0x0116:
            java.lang.String r10 = "RemoteModelFileManager"
            r8.mo4172d(r10, r9)     // Catch:{ all -> 0x017d }
        L_0x011b:
            boolean r8 = r1.delete()     // Catch:{ all -> 0x017d }
            if (r8 != 0) goto L_0x0144
            com.google.android.gms.common.internal.GmsLogger r8 = zzaoz     // Catch:{ all -> 0x017d }
            java.lang.String r9 = r1.getAbsolutePath()     // Catch:{ all -> 0x017d }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x017d }
            int r10 = r9.length()     // Catch:{ all -> 0x017d }
            if (r10 == 0) goto L_0x0138
            java.lang.String r10 = "Failed to delete the temp file: "
            java.lang.String r9 = r10.concat(r9)     // Catch:{ all -> 0x017d }
            goto L_0x013f
        L_0x0138:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x017d }
            java.lang.String r10 = "Failed to delete the temp file: "
            r9.<init>(r10)     // Catch:{ all -> 0x017d }
        L_0x013f:
            java.lang.String r10 = "RemoteModelFileManager"
            r8.mo4172d(r10, r9)     // Catch:{ all -> 0x017d }
        L_0x0144:
            monitor-exit(r7)
            return r0
        L_0x0146:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0148 }
        L_0x0148:
            r10 = move-exception
            zza((java.lang.Throwable) r9, (java.io.FileOutputStream) r8)     // Catch:{ all -> 0x014d }
            throw r10     // Catch:{ all -> 0x014d }
        L_0x014d:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x014f }
        L_0x014f:
            r9 = move-exception
            zza((java.lang.Throwable) r8, (java.io.FileInputStream) r2)     // Catch:{ IOException -> 0x0154 }
            throw r9     // Catch:{ IOException -> 0x0154 }
        L_0x0154:
            r8 = move-exception
            com.google.android.gms.common.internal.GmsLogger r9 = zzaoz     // Catch:{ all -> 0x017d }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x017d }
            java.lang.String r10 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x017d }
            int r10 = r10.length()     // Catch:{ all -> 0x017d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x017d }
            int r10 = r10 + 56
            r1.<init>(r10)     // Catch:{ all -> 0x017d }
            java.lang.String r10 = "Failed to copy downloaded model file to private folder: "
            r1.append(r10)     // Catch:{ all -> 0x017d }
            r1.append(r8)     // Catch:{ all -> 0x017d }
            java.lang.String r8 = "RemoteModelFileManager"
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x017d }
            r9.mo4174e(r8, r10)     // Catch:{ all -> 0x017d }
            monitor-exit(r7)
            return r0
        L_0x017d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzoq.zza(android.os.ParcelFileDescriptor, java.lang.String, com.google.android.gms.internal.firebase_ml.zzon):java.io.File");
    }

    public final boolean zzb(File file) throws FirebaseMLException {
        synchronized (this) {
            File zza = zza(this.zzapo, this.zzaqg, this.zzara, false);
            if (!zza.exists()) {
                return false;
            }
            boolean z = true;
            for (File file2 : zza.listFiles()) {
                if (!file2.equals(file) && !zze(file2)) {
                    z = false;
                }
            }
            return z;
        }
    }

    public final File zzc(File file) throws FirebaseMLException {
        synchronized (this) {
            File file2 = new File(String.valueOf(zza(this.zzapo, this.zzaqg, this.zzara, false).getAbsolutePath()).concat("/0"));
            if (file2.exists()) {
                return file;
            }
            if (file.renameTo(file2)) {
                return file2;
            }
            return file;
        }
    }

    public final String zzmf() throws FirebaseMLException {
        synchronized (this) {
            File zza = zza(this.zzapo, this.zzaqg, this.zzara, false);
            int zzd = zzd(zza);
            if (zzd < 0) {
                return null;
            }
            String absolutePath = zza.getAbsolutePath();
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 12);
            sb.append(absolutePath);
            sb.append("/");
            sb.append(zzd);
            String sb2 = sb.toString();
            return sb2;
        }
    }

    public final void zzmg() throws FirebaseMLException {
        synchronized (this) {
            this.zzarh.zzlt();
        }
    }

    static File zza(FirebaseApp firebaseApp, String str, zzok zzok) throws FirebaseMLException {
        return zza(firebaseApp, str, zzok, true);
    }

    static File zzb(FirebaseApp firebaseApp, String str, zzok zzok) throws FirebaseMLException {
        return zza(firebaseApp, str, zzok, false);
    }

    private static File zza(FirebaseApp firebaseApp, String str, zzok zzok, boolean z) throws FirebaseMLException {
        String str2;
        File file;
        int i = zzor.zzari[zzok.ordinal()];
        if (i == 1) {
            str2 = zzare;
        } else if (i == 2) {
            str2 = zzarf;
        } else if (i == 3) {
            str2 = zzard;
        } else if (i == 4) {
            str2 = zzarc;
        } else {
            String name = zzok.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 69);
            sb.append("Unknown model type ");
            sb.append(name);
            sb.append(". Cannot find a dir to store the downloaded model.");
            throw new FirebaseMLException(sb.toString(), 13);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            file = new File(firebaseApp.getApplicationContext().getNoBackupFilesDir(), str2);
        } else {
            file = firebaseApp.getApplicationContext().getDir(str2, 0);
        }
        if (z) {
            file = new File(file, "temp");
        }
        File file2 = new File(new File(file, firebaseApp.getPersistenceKey()), str);
        if (!file2.exists()) {
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(file2.getAbsolutePath());
            gmsLogger.mo4172d("RemoteModelFileManager", valueOf.length() != 0 ? "model folder does not exist, creating one: ".concat(valueOf) : new String("model folder does not exist, creating one: "));
            file2.mkdirs();
        } else if (!file2.isDirectory()) {
            String valueOf2 = String.valueOf(file2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 71);
            sb2.append("Can not create model folder, since an existing file has the same name: ");
            sb2.append(valueOf2);
            throw new FirebaseMLException(sb2.toString(), 6);
        }
        return file2;
    }

    static int zzd(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles.length == 0) {
            return -1;
        }
        int i = 0;
        for (File file2 : listFiles) {
            try {
                i = Math.max(i, Integer.parseInt(file2.getName()));
            } catch (NumberFormatException unused) {
                GmsLogger gmsLogger = zzaoz;
                String valueOf = String.valueOf(file2.getName());
                gmsLogger.mo4172d("RemoteModelFileManager", valueOf.length() != 0 ? "Contains non-integer file name ".concat(valueOf) : new String("Contains non-integer file name "));
            }
        }
        return i;
    }

    static boolean zze(File file) {
        boolean z;
        if (file.isDirectory()) {
            z = true;
            for (File zze : file.listFiles()) {
                z = z && zze(zze);
            }
        } else {
            z = true;
        }
        return z && file.delete();
    }

    private static /* synthetic */ void zza(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                zzlx.zza(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    private static /* synthetic */ void zza(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                zzlx.zza(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
