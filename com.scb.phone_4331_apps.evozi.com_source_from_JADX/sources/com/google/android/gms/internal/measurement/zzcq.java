package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import p040o.AlertController$RecycleListView;

final class zzcq implements zzcl {
    private static zzcq zza;
    private final Context zzb;
    private final ContentObserver zzc;

    static zzcq zza(Context context) {
        zzcq zzcq;
        synchronized (zzcq.class) {
            if (zza == null) {
                zza = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzcq(context) : new zzcq();
            }
            zzcq = zza;
        }
        return zzcq;
    }

    private zzcq(Context context) {
        this.zzb = context;
        this.zzc = new zzcs(this, (Handler) null);
        context.getContentResolver().registerContentObserver(zzcg.zza, true, this.zzc);
    }

    private zzcq() {
        this.zzb = null;
        this.zzc = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final String zza(String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (String) zzco.zza(new zzcp(this, str));
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    static void zza() {
        synchronized (zzcq.class) {
            if (!(zza == null || zza.zzb == null || zza.zzc == null)) {
                zza.zzb.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzb(String str) {
        return zzcg.zza(this.zzb.getContentResolver(), str, (String) null);
    }
}
