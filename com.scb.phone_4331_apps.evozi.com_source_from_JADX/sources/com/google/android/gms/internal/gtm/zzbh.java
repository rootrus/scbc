package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class zzbh extends zzan {
    private volatile String zzut;
    private Future<String> zzyh;

    protected zzbh(zzap zzap) {
        super(zzap);
    }

    /* access modifiers changed from: protected */
    public final void zzaw() {
    }

    public final String zzeh() {
        String str;
        zzdb();
        synchronized (this) {
            if (this.zzut == null) {
                this.zzyh = zzcq().zza(new zzbi(this));
            }
            if (this.zzyh != null) {
                try {
                    this.zzut = this.zzyh.get();
                } catch (InterruptedException e) {
                    zzd("ClientId loading or generation was interrupted", e);
                    this.zzut = "0";
                } catch (ExecutionException e2) {
                    zze("Failed to load or generate client id", e2);
                    this.zzut = "0";
                }
                if (this.zzut == null) {
                    this.zzut = "0";
                }
                zza("Loaded clientId", this.zzut);
                this.zzyh = null;
            }
            str = this.zzut;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public final String zzei() {
        synchronized (this) {
            this.zzut = null;
            this.zzyh = zzcq().zza(new zzbj(this));
        }
        return zzeh();
    }

    /* access modifiers changed from: package-private */
    public final String zzej() {
        String zzd = zzd(zzcq().getContext());
        return zzd == null ? zzek() : zzd;
    }

    /* access modifiers changed from: private */
    public final String zzek() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            if (!zzb(zzcq().getContext(), lowerCase)) {
                return "0";
            }
            return lowerCase;
        } catch (Exception e) {
            zze("Error saving clientId file", e);
            return "0";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0078 A[SYNTHETIC, Splitter:B:43:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0083 A[SYNTHETIC, Splitter:B:49:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x008f A[SYNTHETIC, Splitter:B:58:0x008f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String zzd(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "gaClientId"
            java.lang.String r1 = "Failed to close client id reading stream"
            java.lang.String r2 = "ClientId should be loaded from worker thread"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r2)
            r2 = 0
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch:{ FileNotFoundException -> 0x008c, IOException -> 0x006c, all -> 0x006a }
            r4 = 36
            byte[] r5 = new byte[r4]     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            r6 = 0
            int r4 = r3.read(r5, r6, r4)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            int r7 = r3.available()     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            if (r7 <= 0) goto L_0x0033
            java.lang.String r4 = "clientId file seems corrupted, deleting it."
            r8.zzt(r4)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            r9.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            if (r3 == 0) goto L_0x0032
            r3.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x0032
        L_0x002e:
            r9 = move-exception
            r8.zze(r1, r9)
        L_0x0032:
            return r2
        L_0x0033:
            r7 = 14
            if (r4 >= r7) goto L_0x004d
            java.lang.String r4 = "clientId file is empty, deleting it."
            r8.zzt(r4)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            r9.deleteFile(r0)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            if (r3 == 0) goto L_0x004c
            r3.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x004c
        L_0x0048:
            r9 = move-exception
            r8.zze(r1, r9)
        L_0x004c:
            return r2
        L_0x004d:
            r3.close()     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            java.lang.String r7 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            r7.<init>(r5, r6, r4)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            java.lang.String r4 = "Read client id from disk"
            r8.zza(r4, r7)     // Catch:{ FileNotFoundException -> 0x008d, IOException -> 0x0068 }
            if (r3 == 0) goto L_0x0064
            r3.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r9 = move-exception
            r8.zze(r1, r9)
        L_0x0064:
            return r7
        L_0x0065:
            r9 = move-exception
            r2 = r3
            goto L_0x0081
        L_0x0068:
            r4 = move-exception
            goto L_0x006e
        L_0x006a:
            r9 = move-exception
            goto L_0x0081
        L_0x006c:
            r4 = move-exception
            r3 = r2
        L_0x006e:
            java.lang.String r5 = "Error reading client id file, deleting it"
            r8.zze(r5, r4)     // Catch:{ all -> 0x0065 }
            r9.deleteFile(r0)     // Catch:{ all -> 0x0065 }
            if (r3 == 0) goto L_0x0080
            r3.close()     // Catch:{ IOException -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r9 = move-exception
            r8.zze(r1, r9)
        L_0x0080:
            return r2
        L_0x0081:
            if (r2 == 0) goto L_0x008b
            r2.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x008b
        L_0x0087:
            r0 = move-exception
            r8.zze(r1, r0)
        L_0x008b:
            throw r9
        L_0x008c:
            r3 = r2
        L_0x008d:
            if (r3 == 0) goto L_0x0097
            r3.close()     // Catch:{ IOException -> 0x0093 }
            goto L_0x0097
        L_0x0093:
            r9 = move-exception
            r8.zze(r1, r9)
        L_0x0097:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbh.zzd(android.content.Context):java.lang.String");
    }

    private final boolean zzb(Context context, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotMainThread("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStream = null;
        try {
            zza("Storing clientId", str);
            fileOutputStream = context.openFileOutput("gaClientId", 0);
            fileOutputStream.write(str.getBytes());
            if (fileOutputStream == null) {
                return true;
            }
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException e) {
                zze("Failed to close clientId writing stream", e);
                return true;
            }
        } catch (FileNotFoundException e2) {
            zze("Error creating clientId file", e2);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e3) {
                    zze("Failed to close clientId writing stream", e3);
                }
            }
            return false;
        } catch (IOException e4) {
            zze("Error writing to clientId file", e4);
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e5) {
                    zze("Failed to close clientId writing stream", e5);
                }
            }
            return false;
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e6) {
                    zze("Failed to close clientId writing stream", e6);
                }
            }
            throw th;
        }
    }
}
