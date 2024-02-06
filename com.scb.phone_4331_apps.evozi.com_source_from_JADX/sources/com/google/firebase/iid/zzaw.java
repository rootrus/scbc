package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public final class zzaw {
    private static zzaw zza;
    private String zzb = null;
    private Boolean zzc = null;
    private Boolean zzd = null;
    private final Queue<Intent> zze = new ArrayDeque();

    public static zzaw zza() {
        zzaw zzaw;
        synchronized (zzaw.class) {
            if (zza == null) {
                zza = new zzaw();
            }
            zzaw = zza;
        }
        return zzaw;
    }

    private zzaw() {
    }

    public final Intent zzb() {
        return this.zze.poll();
    }

    public final int zza(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Starting service");
        }
        this.zze.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return zzb(context, intent2);
    }

    private final int zzb(Context context, Intent intent) {
        ComponentName componentName;
        String zzc2 = zzc(context, intent);
        if (zzc2 != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(zzc2);
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Restricting intent to a specific service: ".concat(valueOf) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), zzc2);
        }
        try {
            if (zza(context)) {
                componentName = zzbd.zza(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e);
            return 401;
        } catch (IllegalStateException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf2);
            Log.e("FirebaseInstanceId", sb.toString());
            return 402;
        }
    }

    private final String zzc(Context context, Intent intent) {
        synchronized (this) {
            if (this.zzb != null) {
                String str = this.zzb;
                return str;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null) {
                if (resolveService.serviceInfo != null) {
                    ServiceInfo serviceInfo = resolveService.serviceInfo;
                    if (context.getPackageName().equals(serviceInfo.packageName)) {
                        if (serviceInfo.name != null) {
                            if (serviceInfo.name.startsWith(".")) {
                                String valueOf = String.valueOf(context.getPackageName());
                                String valueOf2 = String.valueOf(serviceInfo.name);
                                this.zzb = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                            } else {
                                this.zzb = serviceInfo.name;
                            }
                            String str2 = this.zzb;
                            return str2;
                        }
                    }
                    String str3 = serviceInfo.packageName;
                    String str4 = serviceInfo.name;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                    sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                    sb.append(str3);
                    sb.append("/");
                    sb.append(str4);
                    Log.e("FirebaseInstanceId", sb.toString());
                    return null;
                }
            }
            Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(Context context) {
        if (this.zzc == null) {
            this.zzc = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.zzc.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.zzc.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb(Context context) {
        if (this.zzd == null) {
            this.zzd = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.zzc.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.zzd.booleanValue();
    }
}
