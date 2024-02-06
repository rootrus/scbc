package com.google.firebase.messaging;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.setLastBaselineToBottomHeight;

public final class zzb {
    private static final AtomicInteger zza = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.messaging.zza zza(android.content.Context r10, com.google.firebase.messaging.zzt r11) {
        /*
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r1 = r10.getPackageName()
            android.os.Bundle r0 = zza((android.content.pm.PackageManager) r0, (java.lang.String) r1)
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "gcm.n.android_channel_id"
            java.lang.String r2 = r11.zza((java.lang.String) r2)
            java.lang.String r2 = zzb(r10, r2, r0)
            android.content.res.Resources r3 = r10.getResources()
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            o.setDropDownHorizontalOffset$IconCompatParcelizer r5 = new o.setDropDownHorizontalOffset$IconCompatParcelizer
            r5.<init>(r10, r2)
            java.lang.String r2 = "gcm.n.title"
            java.lang.String r2 = r11.zza(r3, r1, r2)
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x0036
            r5.IconCompatParcelizer((java.lang.CharSequence) r2)
        L_0x0036:
            java.lang.String r2 = "gcm.n.body"
            java.lang.String r2 = r11.zza(r3, r1, r2)
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x0051
            r5.MediaBrowserCompat$ItemReceiver((java.lang.CharSequence) r2)
            o.setDropDownHorizontalOffset$read r6 = new o.setDropDownHorizontalOffset$read
            r6.<init>()
            o.setDropDownHorizontalOffset$read r2 = r6.write(r2)
            r5.write((p040o.C1479x17e19db7) r2)
        L_0x0051:
            java.lang.String r2 = "gcm.n.icon"
            java.lang.String r2 = r11.zza((java.lang.String) r2)
            int r2 = zza(r4, r3, r1, r2, r0)
            r5.MediaBrowserCompat$CustomActionResultReceiver((int) r2)
            java.lang.String r2 = r11.zzb()
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            r7 = 2
            r8 = 0
            if (r6 == 0) goto L_0x006c
            r2 = r8
            goto L_0x00b1
        L_0x006c:
            java.lang.String r6 = "default"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L_0x00ad
            java.lang.String r6 = "raw"
            int r3 = r3.getIdentifier(r2, r6, r1)
            if (r3 == 0) goto L_0x00ad
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = java.lang.String.valueOf(r1)
            int r6 = r6.length()
            int r6 = r6 + 24
            java.lang.String r9 = java.lang.String.valueOf(r2)
            int r9 = r9.length()
            int r6 = r6 + r9
            r3.<init>(r6)
            java.lang.String r6 = "android.resource://"
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = "/raw/"
            r3.append(r6)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            goto L_0x00b1
        L_0x00ad:
            android.net.Uri r2 = android.media.RingtoneManager.getDefaultUri(r7)
        L_0x00b1:
            if (r2 == 0) goto L_0x00b6
            r5.read((android.net.Uri) r2)
        L_0x00b6:
            java.lang.String r2 = "gcm.n.click_action"
            java.lang.String r2 = r11.zza((java.lang.String) r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r6 = "FirebaseMessaging"
            if (r3 != 0) goto L_0x00d2
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r2)
            r3.setPackage(r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r1)
            goto L_0x00f1
        L_0x00d2:
            android.net.Uri r2 = r11.zza()
            if (r2 == 0) goto L_0x00e6
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.<init>(r4)
            r3.setPackage(r1)
            r3.setData(r2)
            goto L_0x00f1
        L_0x00e6:
            android.content.Intent r3 = r4.getLaunchIntentForPackage(r1)
            if (r3 != 0) goto L_0x00f1
            java.lang.String r1 = "No activity found to launch app"
            android.util.Log.w(r6, r1)
        L_0x00f1:
            java.lang.String r1 = "google.c.a.e"
            if (r3 != 0) goto L_0x00f7
            r2 = r8
            goto L_0x012e
        L_0x00f7:
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r2)
            android.os.Bundle r2 = r11.zze()
            r3.putExtras(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = zza
            int r2 = r2.incrementAndGet()
            r4 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r10, r2, r3, r4)
            boolean r3 = r11.zzb(r1)
            if (r3 == 0) goto L_0x012e
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            r3.<init>(r4)
            android.os.Bundle r4 = r11.zzf()
            android.content.Intent r3 = r3.putExtras(r4)
            java.lang.String r4 = "pending_intent"
            android.content.Intent r2 = r3.putExtra(r4, r2)
            android.app.PendingIntent r2 = zza((android.content.Context) r10, (android.content.Intent) r2)
        L_0x012e:
            r5.IconCompatParcelizer((android.app.PendingIntent) r2)
            boolean r1 = r11.zzb(r1)
            if (r1 != 0) goto L_0x0139
            r1 = r8
            goto L_0x014c
        L_0x0139:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r1.<init>(r2)
            android.os.Bundle r2 = r11.zzf()
            android.content.Intent r1 = r1.putExtras(r2)
            android.app.PendingIntent r1 = zza((android.content.Context) r10, (android.content.Intent) r1)
        L_0x014c:
            if (r1 == 0) goto L_0x0151
            r5.read((android.app.PendingIntent) r1)
        L_0x0151:
            java.lang.String r1 = "gcm.n.color"
            java.lang.String r1 = r11.zza((java.lang.String) r1)
            java.lang.Integer r10 = zza(r10, r1, r0)
            if (r10 == 0) goto L_0x0164
            int r10 = r10.intValue()
            r5.read((int) r10)
        L_0x0164:
            java.lang.String r10 = "gcm.n.sticky"
            boolean r10 = r11.zzb(r10)
            r0 = 1
            r10 = r10 ^ r0
            r5.MediaBrowserCompat$CustomActionResultReceiver((boolean) r10)
            java.lang.String r10 = "gcm.n.local_only"
            boolean r10 = r11.zzb(r10)
            r5.IconCompatParcelizer((boolean) r10)
            java.lang.String r10 = "gcm.n.ticker"
            java.lang.String r10 = r11.zza((java.lang.String) r10)
            if (r10 == 0) goto L_0x0183
            r5.read((java.lang.CharSequence) r10)
        L_0x0183:
            java.lang.String r10 = "gcm.n.notification_priority"
            java.lang.Integer r10 = r11.zzc(r10)
            if (r10 != 0) goto L_0x018c
            goto L_0x01c0
        L_0x018c:
            int r1 = r10.intValue()
            r2 = -2
            if (r1 < r2) goto L_0x0199
            int r1 = r10.intValue()
            if (r1 <= r7) goto L_0x01c1
        L_0x0199:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r10)
            int r2 = r2.length()
            int r2 = r2 + 72
            r1.<init>(r2)
            java.lang.String r2 = "notificationPriority is invalid "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = ". Skipping setting notificationPriority."
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r6, r10)
        L_0x01c0:
            r10 = r8
        L_0x01c1:
            if (r10 == 0) goto L_0x01ca
            int r10 = r10.intValue()
            r5.MediaBrowserCompat$ItemReceiver((int) r10)
        L_0x01ca:
            java.lang.String r10 = "gcm.n.visibility"
            java.lang.Integer r10 = r11.zzc(r10)
            if (r10 != 0) goto L_0x01d3
            goto L_0x020a
        L_0x01d3:
            int r1 = r10.intValue()
            r2 = -1
            if (r1 < r2) goto L_0x01e0
            int r1 = r10.intValue()
            if (r1 <= r0) goto L_0x020b
        L_0x01e0:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r10)
            int r2 = r2.length()
            int r2 = r2 + 53
            r1.<init>(r2)
            java.lang.String r2 = "visibility is invalid: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = ". Skipping setting visibility."
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            java.lang.String r1 = "NotificationParams"
            android.util.Log.w(r1, r10)
        L_0x020a:
            r10 = r8
        L_0x020b:
            if (r10 == 0) goto L_0x0214
            int r10 = r10.intValue()
            r5.MediaMetadataCompat(r10)
        L_0x0214:
            java.lang.String r10 = "gcm.n.notification_count"
            java.lang.Integer r10 = r11.zzc(r10)
            if (r10 != 0) goto L_0x021d
            goto L_0x024c
        L_0x021d:
            int r1 = r10.intValue()
            if (r1 >= 0) goto L_0x024b
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = java.lang.String.valueOf(r10)
            int r2 = r2.length()
            int r2 = r2 + 67
            r1.<init>(r2)
            java.lang.String r2 = "notificationCount is invalid: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = ". Skipping setting notificationCount."
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r6, r10)
            goto L_0x024c
        L_0x024b:
            r8 = r10
        L_0x024c:
            if (r8 == 0) goto L_0x0255
            int r10 = r8.intValue()
            r5.IconCompatParcelizer((int) r10)
        L_0x0255:
            java.lang.String r10 = "gcm.n.event_time"
            java.lang.Long r10 = r11.zzd(r10)
            if (r10 == 0) goto L_0x0267
            r5.write((boolean) r0)
            long r1 = r10.longValue()
            r5.IconCompatParcelizer((long) r1)
        L_0x0267:
            long[] r10 = r11.zzc()
            if (r10 == 0) goto L_0x0270
            r5.MediaBrowserCompat$CustomActionResultReceiver((long[]) r10)
        L_0x0270:
            int[] r10 = r11.zzd()
            r1 = 0
            if (r10 == 0) goto L_0x0280
            r2 = r10[r1]
            r0 = r10[r0]
            r10 = r10[r7]
            r5.MediaBrowserCompat$ItemReceiver((int) r2, (int) r0, (int) r10)
        L_0x0280:
            java.lang.String r10 = "gcm.n.default_sound"
            boolean r10 = r11.zzb(r10)
            java.lang.String r0 = "gcm.n.default_vibrate_timings"
            boolean r0 = r11.zzb(r0)
            if (r0 == 0) goto L_0x0290
            r10 = r10 | 2
        L_0x0290:
            java.lang.String r0 = "gcm.n.default_light_settings"
            boolean r0 = r11.zzb(r0)
            if (r0 == 0) goto L_0x029a
            r10 = r10 | 4
        L_0x029a:
            r5.write((int) r10)
            java.lang.String r10 = "gcm.n.tag"
            java.lang.String r10 = r11.zza((java.lang.String) r10)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto L_0x02c0
            long r10 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 37
            r0.<init>(r2)
            java.lang.String r2 = "FCM-Notification:"
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
        L_0x02c0:
            com.google.firebase.messaging.zza r11 = new com.google.firebase.messaging.zza
            r11.<init>(r5, r10, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.zzb.zza(android.content.Context, com.google.firebase.messaging.zzt):com.google.firebase.messaging.zza");
    }

    private static boolean zza(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    private static int zza(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && zza(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && zza(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !zza(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("Couldn't get own application info: ");
                sb2.append(valueOf);
                Log.w("FirebaseMessaging", sb2.toString());
            }
        }
        if (i == 0 || !zza(resources, i)) {
            return 17301651;
        }
        return i;
    }

    private static Integer zza(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(setLastBaselineToBottomHeight.read(context, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    private static Bundle zza(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    private static String zzb(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 122);
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                Log.w("FirebaseMessaging", sb.toString());
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static PendingIntent zza(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, zza.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }
}
