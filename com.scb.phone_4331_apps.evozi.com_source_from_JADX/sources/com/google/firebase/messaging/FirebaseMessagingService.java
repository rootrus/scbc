package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.zzaw;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends zzf {
    private static final Queue<String> zza = new ArrayDeque(10);

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }

    /* access modifiers changed from: protected */
    public final Intent zza(Intent intent) {
        return zzaw.zza().zzb();
    }

    public final boolean zzb(Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if (!zzr.zzd(intent)) {
            return true;
        }
        zzr.zza(intent);
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        if (r1.equals("gcm") != false) goto L_0x00ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(android.content.Intent r12) {
        /*
            r11 = this;
            java.lang.String r0 = r12.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "FirebaseMessaging"
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0028
            boolean r0 = com.google.firebase.messaging.zzr.zzd(r12)
            if (r0 == 0) goto L_0x0058
            com.google.firebase.messaging.zzr.zzb(r12)
            return
        L_0x0028:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "token"
            java.lang.String r12 = r12.getStringExtra(r0)
            r11.onNewToken(r12)
            return
        L_0x003b:
            java.lang.String r12 = r12.getAction()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r0 = r12.length()
            java.lang.String r1 = "Unknown intent action: "
            if (r0 == 0) goto L_0x0050
            java.lang.String r12 = r1.concat(r12)
            goto L_0x0055
        L_0x0050:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r1)
        L_0x0055:
            android.util.Log.d(r2, r12)
        L_0x0058:
            return
        L_0x0059:
            java.lang.String r0 = "google.message_id"
            java.lang.String r1 = r12.getStringExtra(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 0
            r5 = 2
            if (r3 == 0) goto L_0x006c
            com.google.android.gms.tasks.Task r3 = com.google.android.gms.tasks.Tasks.forResult(r4)
            goto L_0x007c
        L_0x006c:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putString(r0, r1)
            com.google.firebase.iid.zzab r6 = com.google.firebase.iid.zzab.zza((android.content.Context) r11)
            com.google.android.gms.tasks.Task r3 = r6.zza(r5, r3)
        L_0x007c:
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            r7 = 0
            r8 = 1
            r9 = 3
            if (r6 == 0) goto L_0x0086
            goto L_0x00c3
        L_0x0086:
            java.util.Queue<java.lang.String> r6 = zza
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x00af
            boolean r6 = android.util.Log.isLoggable(r2, r9)
            if (r6 == 0) goto L_0x00ad
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r6 = r1.length()
            java.lang.String r10 = "Received duplicate message: "
            if (r6 == 0) goto L_0x00a5
            java.lang.String r1 = r10.concat(r1)
            goto L_0x00aa
        L_0x00a5:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r10)
        L_0x00aa:
            android.util.Log.d(r2, r1)
        L_0x00ad:
            r1 = r8
            goto L_0x00c4
        L_0x00af:
            java.util.Queue<java.lang.String> r6 = zza
            int r6 = r6.size()
            r10 = 10
            if (r6 < r10) goto L_0x00be
            java.util.Queue<java.lang.String> r6 = zza
            r6.remove()
        L_0x00be:
            java.util.Queue<java.lang.String> r6 = zza
            r6.add(r1)
        L_0x00c3:
            r1 = r7
        L_0x00c4:
            if (r1 != 0) goto L_0x01c8
            java.lang.String r1 = "message_type"
            java.lang.String r1 = r12.getStringExtra(r1)
            java.lang.String r6 = "gcm"
            if (r1 != 0) goto L_0x00d1
            r1 = r6
        L_0x00d1:
            int r10 = r1.hashCode()
            switch(r10) {
                case -2062414158: goto L_0x00f4;
                case 102161: goto L_0x00ed;
                case 814694033: goto L_0x00e3;
                case 814800675: goto L_0x00d9;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            goto L_0x00fe
        L_0x00d9:
            java.lang.String r6 = "send_event"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x00fe
            r7 = r5
            goto L_0x00ff
        L_0x00e3:
            java.lang.String r6 = "send_error"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x00fe
            r7 = r9
            goto L_0x00ff
        L_0x00ed:
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00f4:
            java.lang.String r6 = "deleted_messages"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x00fe
            r7 = r8
            goto L_0x00ff
        L_0x00fe:
            r7 = -1
        L_0x00ff:
            if (r7 == 0) goto L_0x014c
            if (r7 == r8) goto L_0x0147
            if (r7 == r5) goto L_0x013e
            if (r7 == r9) goto L_0x0122
            java.lang.String r12 = java.lang.String.valueOf(r1)
            int r0 = r12.length()
            java.lang.String r1 = "Received message with unknown type: "
            if (r0 == 0) goto L_0x0118
            java.lang.String r12 = r1.concat(r12)
            goto L_0x011d
        L_0x0118:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r1)
        L_0x011d:
            android.util.Log.w(r2, r12)
            goto L_0x01c8
        L_0x0122:
            java.lang.String r0 = r12.getStringExtra(r0)
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r12.getStringExtra(r0)
        L_0x012e:
            com.google.firebase.messaging.SendException r1 = new com.google.firebase.messaging.SendException
            java.lang.String r4 = "error"
            java.lang.String r12 = r12.getStringExtra(r4)
            r1.<init>(r12)
            r11.onSendError(r0, r1)
            goto L_0x01c8
        L_0x013e:
            java.lang.String r12 = r12.getStringExtra(r0)
            r11.onMessageSent(r12)
            goto L_0x01c8
        L_0x0147:
            r11.onDeletedMessages()
            goto L_0x01c8
        L_0x014c:
            boolean r0 = com.google.firebase.messaging.zzr.zzd(r12)
            if (r0 == 0) goto L_0x0155
            com.google.firebase.messaging.zzr.zza((android.content.Intent) r12, (p040o.getArray<java.lang.String>) r4)
        L_0x0155:
            boolean r0 = com.google.firebase.messaging.zzr.zze(r12)
            if (r0 == 0) goto L_0x0179
            o.Matrix2f r0 = com.google.firebase.messaging.FirebaseMessaging.zza
            if (r0 == 0) goto L_0x0174
            o.Float4 r1 = new o.Float4
            java.lang.String r4 = "json"
            r1.<init>(r4)
            o.Int3 r4 = com.google.firebase.messaging.zzp.zza
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.String r6 = "FCM_CLIENT_EVENT_LOGGING"
            o.getArray r0 = r0.getTransport(r6, r5, r1, r4)
            com.google.firebase.messaging.zzr.zza((android.content.Intent) r12, (p040o.getArray<java.lang.String>) r0)
            goto L_0x0179
        L_0x0174:
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r2, r0)
        L_0x0179:
            android.os.Bundle r0 = r12.getExtras()
            if (r0 != 0) goto L_0x0184
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x0184:
            java.lang.String r1 = "androidx.contentpager.content.wakelockid"
            r0.remove(r1)
            boolean r1 = com.google.firebase.messaging.zzt.zza((android.os.Bundle) r0)
            if (r1 == 0) goto L_0x01c0
            com.google.firebase.messaging.zzt r1 = new com.google.firebase.messaging.zzt
            r1.<init>(r0)
            com.google.android.gms.common.util.concurrent.NamedThreadFactory r4 = new com.google.android.gms.common.util.concurrent.NamedThreadFactory
            java.lang.String r5 = "Firebase-Messaging-Network-Io"
            r4.<init>(r5)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor(r4)
            com.google.firebase.messaging.zzc r5 = new com.google.firebase.messaging.zzc
            r5.<init>(r11, r1, r4)
            boolean r1 = r5.zza()     // Catch:{ all -> 0x01bb }
            if (r1 == 0) goto L_0x01ae
            r4.shutdown()
            goto L_0x01c8
        L_0x01ae:
            r4.shutdown()
            boolean r1 = com.google.firebase.messaging.zzr.zzd(r12)
            if (r1 == 0) goto L_0x01c0
            com.google.firebase.messaging.zzr.zzc(r12)
            goto L_0x01c0
        L_0x01bb:
            r12 = move-exception
            r4.shutdown()
            throw r12
        L_0x01c0:
            com.google.firebase.messaging.RemoteMessage r12 = new com.google.firebase.messaging.RemoteMessage
            r12.<init>(r0)
            r11.onMessageReceived(r12)
        L_0x01c8:
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x01da, InterruptedException -> 0x01d8, TimeoutException -> 0x01d6 }
            r0 = 1
            long r0 = r12.toMillis(r0)     // Catch:{ ExecutionException -> 0x01da, InterruptedException -> 0x01d8, TimeoutException -> 0x01d6 }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x01da, InterruptedException -> 0x01d8, TimeoutException -> 0x01d6 }
            com.google.android.gms.tasks.Tasks.await(r3, r0, r12)     // Catch:{ ExecutionException -> 0x01da, InterruptedException -> 0x01d8, TimeoutException -> 0x01d6 }
            return
        L_0x01d6:
            r12 = move-exception
            goto L_0x01db
        L_0x01d8:
            r12 = move-exception
            goto L_0x01db
        L_0x01da:
            r12 = move-exception
        L_0x01db:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r12)
            int r1 = r1.length()
            int r1 = r1 + 20
            r0.<init>(r1)
            java.lang.String r1 = "Message ack failed: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            android.util.Log.w(r2, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.zzc(android.content.Intent):void");
    }
}
