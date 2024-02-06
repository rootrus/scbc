package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

public final class zznj implements Runnable {
    private final zzmn zzatm;
    private final zzni zzatn;
    private final zzmw zzato;
    private final zznf zzatp;
    private final Context zzrm;

    public zznj(Context context, zzmw zzmw, zzmn zzmn) {
        this(context, zzmw, zzmn, new zzni(), new zznf());
    }

    private zznj(Context context, zzmw zzmw, zzmn zzmn, zzni zzni, zznf zznf) {
        this.zzrm = (Context) Preconditions.checkNotNull(context);
        this.zzatm = (zzmn) Preconditions.checkNotNull(zzmn);
        this.zzato = zzmw;
        this.zzatn = zzni;
        this.zzatp = zznf;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00b8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0127 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            java.lang.String r0 = " "
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r10.zzx(r1)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0012
            java.lang.String r1 = "Missing android.permission.INTERNET. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.INTERNET\" />"
            com.google.android.gms.internal.gtm.zzev.zzav(r1)
            goto L_0x003e
        L_0x0012:
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r10.zzx(r1)
            if (r1 != 0) goto L_0x0020
            java.lang.String r1 = "Missing android.permission.ACCESS_NETWORK_STATE. Please add the following declaration to your AndroidManifest.xml: <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />"
            com.google.android.gms.internal.gtm.zzev.zzav(r1)
            goto L_0x003e
        L_0x0020:
            android.content.Context r1 = r10.zzrm
            java.lang.String r4 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r4)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L_0x0039
            boolean r1 = r1.isConnected()
            if (r1 != 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r1 = r2
            goto L_0x003f
        L_0x0039:
            java.lang.String r1 = "No network connectivity - Offline"
            com.google.android.gms.internal.gtm.zzev.zzac(r1)
        L_0x003e:
            r1 = r3
        L_0x003f:
            if (r1 != 0) goto L_0x0047
            com.google.android.gms.internal.gtm.zzmn r0 = r10.zzatm
            r0.zzb(r3, r3)
            return
        L_0x0047:
            java.lang.String r1 = "Starting to load resource from Network."
            com.google.android.gms.internal.gtm.zzev.zzab(r1)
            com.google.android.gms.internal.gtm.zzng r1 = new com.google.android.gms.internal.gtm.zzng
            r1.<init>()
            r4 = 0
            com.google.android.gms.internal.gtm.zznf r5 = r10.zzatp     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.gtm.zzmw r6 = r10.zzato     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.gtm.zzmk r6 = r6.zzlk()     // Catch:{ all -> 0x0149 }
            java.lang.String r5 = r5.zzb(r6)     // Catch:{ all -> 0x0149 }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0149 }
            int r7 = r6.length()     // Catch:{ all -> 0x0149 }
            java.lang.String r8 = "Loading resource from "
            if (r7 == 0) goto L_0x006f
            java.lang.String r6 = r8.concat(r6)     // Catch:{ all -> 0x0149 }
            goto L_0x0074
        L_0x006f:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0149 }
            r6.<init>(r8)     // Catch:{ all -> 0x0149 }
        L_0x0074:
            com.google.android.gms.internal.gtm.zzev.zzab(r6)     // Catch:{ all -> 0x0149 }
            r6 = 2
            java.io.InputStream r4 = r1.zzcj(r5)     // Catch:{ FileNotFoundException -> 0x0127, zznl -> 0x00b8, IOException -> 0x007d }
            goto L_0x00d7
        L_0x007d:
            r4 = move-exception
            java.lang.String r6 = r4.getMessage()     // Catch:{ all -> 0x0149 }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0149 }
            int r7 = r7.length()     // Catch:{ all -> 0x0149 }
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0149 }
            int r8 = r8.length()     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            int r7 = r7 + 54
            int r7 = r7 + r8
            r9.<init>(r7)     // Catch:{ all -> 0x0149 }
            java.lang.String r7 = "NetworkLoader: Error when loading resource from url: "
            r9.append(r7)     // Catch:{ all -> 0x0149 }
            r9.append(r5)     // Catch:{ all -> 0x0149 }
            r9.append(r0)     // Catch:{ all -> 0x0149 }
            r9.append(r6)     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.gtm.zzev.zza(r0, r4)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.gtm.zzmn r0 = r10.zzatm     // Catch:{ all -> 0x0149 }
            r0.zzb(r2, r3)     // Catch:{ all -> 0x0149 }
            r1.close()
            return
        L_0x00b8:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0149 }
            int r7 = r2.length()     // Catch:{ all -> 0x0149 }
            java.lang.String r8 = "NetworkLoader: Error when loading resource for url: "
            if (r7 == 0) goto L_0x00c9
            java.lang.String r2 = r8.concat(r2)     // Catch:{ all -> 0x0149 }
            goto L_0x00ce
        L_0x00c9:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0149 }
            r2.<init>(r8)     // Catch:{ all -> 0x0149 }
        L_0x00ce:
            com.google.android.gms.internal.gtm.zzev.zzav(r2)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.gtm.zzmn r2 = r10.zzatm     // Catch:{ all -> 0x0149 }
            r7 = 3
            r2.zzb(r7, r3)     // Catch:{ all -> 0x0149 }
        L_0x00d7:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00ec }
            r2.<init>()     // Catch:{ IOException -> 0x00ec }
            com.google.android.gms.common.util.IOUtils.copyStream(r4, r2)     // Catch:{ IOException -> 0x00ec }
            com.google.android.gms.internal.gtm.zzmn r4 = r10.zzatm     // Catch:{ IOException -> 0x00ec }
            byte[] r2 = r2.toByteArray()     // Catch:{ IOException -> 0x00ec }
            r4.zzc(r2)     // Catch:{ IOException -> 0x00ec }
            r1.close()
            return
        L_0x00ec:
            r2 = move-exception
            java.lang.String r4 = r2.getMessage()     // Catch:{ all -> 0x0149 }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0149 }
            int r7 = r7.length()     // Catch:{ all -> 0x0149 }
            java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0149 }
            int r8 = r8.length()     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            int r7 = r7 + 66
            int r7 = r7 + r8
            r9.<init>(r7)     // Catch:{ all -> 0x0149 }
            java.lang.String r7 = "NetworkLoader: Error when parsing downloaded resources from url: "
            r9.append(r7)     // Catch:{ all -> 0x0149 }
            r9.append(r5)     // Catch:{ all -> 0x0149 }
            r9.append(r0)     // Catch:{ all -> 0x0149 }
            r9.append(r4)     // Catch:{ all -> 0x0149 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.gtm.zzev.zza(r0, r2)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.gtm.zzmn r0 = r10.zzatm     // Catch:{ all -> 0x0149 }
            r0.zzb(r6, r3)     // Catch:{ all -> 0x0149 }
            r1.close()
            return
        L_0x0127:
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0149 }
            int r2 = r0.length()     // Catch:{ all -> 0x0149 }
            java.lang.String r4 = "NetworkLoader: No data was retrieved from the given url: "
            if (r2 == 0) goto L_0x0138
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x0149 }
            goto L_0x013d
        L_0x0138:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0149 }
            r0.<init>(r4)     // Catch:{ all -> 0x0149 }
        L_0x013d:
            com.google.android.gms.internal.gtm.zzev.zzav(r0)     // Catch:{ all -> 0x0149 }
            com.google.android.gms.internal.gtm.zzmn r0 = r10.zzatm     // Catch:{ all -> 0x0149 }
            r0.zzb(r6, r3)     // Catch:{ all -> 0x0149 }
            r1.close()
            return
        L_0x0149:
            r0 = move-exception
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zznj.run():void");
    }

    private final boolean zzx(String str) {
        return this.zzrm.getPackageManager().checkPermission(str, this.zzrm.getPackageName()) == 0;
    }
}
