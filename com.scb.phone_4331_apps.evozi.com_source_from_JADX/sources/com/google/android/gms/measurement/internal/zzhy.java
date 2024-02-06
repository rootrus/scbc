package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

final class zzhy implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzhc zza;

    private zzhy(zzhc zzhc) {
        this.zza = zzhc;
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.zza.zzr().zzx().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.zza.zzp();
                        this.zza.zzq().zza((Runnable) new zzib(this, bundle == null, data, zzkr.zza(intent) ? "gs" : "auto", data.getQueryParameter("referrer")));
                        this.zza.zzi().zza(activity, bundle);
                        return;
                    }
                }
                this.zza.zzi().zza(activity, bundle);
            }
        } catch (Exception e) {
            this.zza.zzr().zzf().zza("Throwable caught in onActivityCreated", e);
        } finally {
            this.zza.zzi().zza(activity, bundle);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r1.zza.zzt().zza(com.google.android.gms.measurement.internal.zzaq.zzbi) == false) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2 A[SYNTHETIC, Splitter:B:34:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff A[Catch:{ Exception -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0110 A[SYNTHETIC, Splitter:B:52:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013f A[Catch:{ Exception -> 0x01dc }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0140 A[Catch:{ Exception -> 0x01dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            r2 = r21
            com.google.android.gms.measurement.internal.zzhc r3 = r1.zza
            r3.zzd()
            com.google.android.gms.measurement.internal.zzhc r3 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzy r3 = r3.zzt()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzaq.zzbh     // Catch:{ Exception -> 0x01dc }
            boolean r3 = r3.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r4)     // Catch:{ Exception -> 0x01dc }
            java.lang.String r4 = "Activity created with data 'referrer' without required params"
            java.lang.String r5 = "utm_medium"
            java.lang.String r6 = "_cis"
            java.lang.String r7 = "utm_source"
            java.lang.String r8 = "utm_campaign"
            r9 = 0
            java.lang.String r10 = "gclid"
            if (r3 != 0) goto L_0x0045
            com.google.android.gms.measurement.internal.zzhc r3 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzy r3 = r3.zzt()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzaq.zzbj     // Catch:{ Exception -> 0x01dc }
            boolean r3 = r3.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r11)     // Catch:{ Exception -> 0x01dc }
            if (r3 != 0) goto L_0x0045
            com.google.android.gms.measurement.internal.zzhc r3 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzy r3 = r3.zzt()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzaq.zzbi     // Catch:{ Exception -> 0x01dc }
            boolean r3 = r3.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r11)     // Catch:{ Exception -> 0x01dc }
            if (r3 == 0) goto L_0x0075
        L_0x0045:
            com.google.android.gms.measurement.internal.zzhc r3 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzkr r3 = r3.zzp()     // Catch:{ Exception -> 0x01dc }
            boolean r11 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01dc }
            if (r11 == 0) goto L_0x0052
            goto L_0x0075
        L_0x0052:
            boolean r11 = r2.contains(r10)     // Catch:{ Exception -> 0x01dc }
            if (r11 != 0) goto L_0x0077
            boolean r11 = r2.contains(r8)     // Catch:{ Exception -> 0x01dc }
            if (r11 != 0) goto L_0x0077
            boolean r11 = r2.contains(r7)     // Catch:{ Exception -> 0x01dc }
            if (r11 != 0) goto L_0x0077
            boolean r11 = r2.contains(r5)     // Catch:{ Exception -> 0x01dc }
            if (r11 != 0) goto L_0x0077
            com.google.android.gms.measurement.internal.zzeu r3 = r3.zzr()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzw()     // Catch:{ Exception -> 0x01dc }
            r3.zza(r4)     // Catch:{ Exception -> 0x01dc }
        L_0x0075:
            r3 = r9
            goto L_0x009c
        L_0x0077:
            java.lang.String r11 = java.lang.String.valueOf(r21)     // Catch:{ Exception -> 0x01dc }
            int r12 = r11.length()     // Catch:{ Exception -> 0x01dc }
            java.lang.String r13 = "https://google.com/search?"
            if (r12 == 0) goto L_0x0088
            java.lang.String r11 = r13.concat(r11)     // Catch:{ Exception -> 0x01dc }
            goto L_0x008d
        L_0x0088:
            java.lang.String r11 = new java.lang.String     // Catch:{ Exception -> 0x01dc }
            r11.<init>(r13)     // Catch:{ Exception -> 0x01dc }
        L_0x008d:
            android.net.Uri r11 = android.net.Uri.parse(r11)     // Catch:{ Exception -> 0x01dc }
            android.os.Bundle r3 = r3.zza((android.net.Uri) r11)     // Catch:{ Exception -> 0x01dc }
            if (r3 == 0) goto L_0x009c
            java.lang.String r11 = "referrer"
            r3.putString(r6, r11)     // Catch:{ Exception -> 0x01dc }
        L_0x009c:
            java.lang.String r11 = "_cmp"
            r12 = 0
            r13 = 1
            if (r18 == 0) goto L_0x00ff
            com.google.android.gms.measurement.internal.zzhc r14 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzkr r14 = r14.zzp()     // Catch:{ Exception -> 0x01dc }
            r15 = r19
            android.os.Bundle r14 = r14.zza((android.net.Uri) r15)     // Catch:{ Exception -> 0x01dc }
            if (r14 == 0) goto L_0x0100
            java.lang.String r15 = "intent"
            r14.putString(r6, r15)     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzhc r6 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzy r6 = r6.zzt()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.zzaq.zzbh     // Catch:{ Exception -> 0x01dc }
            boolean r6 = r6.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r15)     // Catch:{ Exception -> 0x01dc }
            if (r6 == 0) goto L_0x00e4
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01dc }
            if (r6 != 0) goto L_0x00e4
            if (r3 == 0) goto L_0x00e4
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01dc }
            if (r6 == 0) goto L_0x00e4
            java.lang.Object[] r6 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01dc }
            java.lang.String r15 = r3.getString(r10)     // Catch:{ Exception -> 0x01dc }
            r6[r12] = r15     // Catch:{ Exception -> 0x01dc }
            java.lang.String r15 = "gclid=%s"
            java.lang.String r6 = java.lang.String.format(r15, r6)     // Catch:{ Exception -> 0x01dc }
            java.lang.String r15 = "_cer"
            r14.putString(r15, r6)     // Catch:{ Exception -> 0x01dc }
        L_0x00e4:
            com.google.android.gms.measurement.internal.zzhc r6 = r1.zza     // Catch:{ Exception -> 0x01dc }
            r6.zza((java.lang.String) r0, (java.lang.String) r11, (android.os.Bundle) r14)     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzhc r6 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzy r6 = r6.zzt()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.zzaq.zzcq     // Catch:{ Exception -> 0x01dc }
            boolean r6 = r6.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r15)     // Catch:{ Exception -> 0x01dc }
            if (r6 == 0) goto L_0x0100
            com.google.android.gms.measurement.internal.zzhc r6 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzp r6 = r6.zzb     // Catch:{ Exception -> 0x01dc }
            r6.zza(r0, r14)     // Catch:{ Exception -> 0x01dc }
            goto L_0x0100
        L_0x00ff:
            r14 = r9
        L_0x0100:
            com.google.android.gms.measurement.internal.zzhc r6 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzy r6 = r6.zzt()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r15 = com.google.android.gms.measurement.internal.zzaq.zzbj     // Catch:{ Exception -> 0x01dc }
            boolean r6 = r6.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r15)     // Catch:{ Exception -> 0x01dc }
            java.lang.String r15 = "auto"
            if (r6 == 0) goto L_0x0139
            com.google.android.gms.measurement.internal.zzhc r6 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzy r6 = r6.zzt()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzaq.zzbi     // Catch:{ Exception -> 0x01dc }
            boolean r6 = r6.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r12)     // Catch:{ Exception -> 0x01dc }
            if (r6 != 0) goto L_0x0139
            if (r3 == 0) goto L_0x0139
            boolean r6 = r3.containsKey(r10)     // Catch:{ Exception -> 0x01dc }
            if (r6 == 0) goto L_0x0139
            if (r14 == 0) goto L_0x012e
            boolean r6 = r14.containsKey(r10)     // Catch:{ Exception -> 0x01dc }
            if (r6 != 0) goto L_0x0139
        L_0x012e:
            com.google.android.gms.measurement.internal.zzhc r6 = r1.zza     // Catch:{ Exception -> 0x01dc }
            java.lang.String r12 = r3.getString(r10)     // Catch:{ Exception -> 0x01dc }
            java.lang.String r14 = "_lgclid"
            r6.zza((java.lang.String) r15, (java.lang.String) r14, (java.lang.Object) r12, (boolean) r13)     // Catch:{ Exception -> 0x01dc }
        L_0x0139:
            boolean r6 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01dc }
            if (r6 == 0) goto L_0x0140
            return
        L_0x0140:
            com.google.android.gms.measurement.internal.zzhc r6 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzeu r6 = r6.zzr()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzew r6 = r6.zzw()     // Catch:{ Exception -> 0x01dc }
            java.lang.String r12 = "Activity created with referrer"
            r6.zza(r12, r2)     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzhc r6 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzy r6 = r6.zzt()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r12 = com.google.android.gms.measurement.internal.zzaq.zzbi     // Catch:{ Exception -> 0x01dc }
            boolean r6 = r6.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r12)     // Catch:{ Exception -> 0x01dc }
            java.lang.String r12 = "_ldl"
            if (r6 == 0) goto L_0x0191
            if (r3 == 0) goto L_0x017c
            com.google.android.gms.measurement.internal.zzhc r2 = r1.zza     // Catch:{ Exception -> 0x01dc }
            r2.zza((java.lang.String) r0, (java.lang.String) r11, (android.os.Bundle) r3)     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzhc r2 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzy r2 = r2.zzt()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzen<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzaq.zzcq     // Catch:{ Exception -> 0x01dc }
            boolean r2 = r2.zza((com.google.android.gms.measurement.internal.zzen<java.lang.Boolean>) r4)     // Catch:{ Exception -> 0x01dc }
            if (r2 == 0) goto L_0x018b
            com.google.android.gms.measurement.internal.zzhc r2 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzp r2 = r2.zzb     // Catch:{ Exception -> 0x01dc }
            r2.zza(r0, r3)     // Catch:{ Exception -> 0x01dc }
            goto L_0x018b
        L_0x017c:
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzr()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzw()     // Catch:{ Exception -> 0x01dc }
            java.lang.String r3 = "Referrer does not contain valid parameters"
            r0.zza(r3, r2)     // Catch:{ Exception -> 0x01dc }
        L_0x018b:
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zza     // Catch:{ Exception -> 0x01dc }
            r0.zza((java.lang.String) r15, (java.lang.String) r12, (java.lang.Object) r9, (boolean) r13)     // Catch:{ Exception -> 0x01dc }
            return
        L_0x0191:
            boolean r0 = r2.contains(r10)     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01be
            boolean r0 = r2.contains(r8)     // Catch:{ Exception -> 0x01dc }
            if (r0 != 0) goto L_0x01bb
            boolean r0 = r2.contains(r7)     // Catch:{ Exception -> 0x01dc }
            if (r0 != 0) goto L_0x01bb
            boolean r0 = r2.contains(r5)     // Catch:{ Exception -> 0x01dc }
            if (r0 != 0) goto L_0x01bb
            java.lang.String r0 = "utm_term"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01dc }
            if (r0 != 0) goto L_0x01bb
            java.lang.String r0 = "utm_content"
            boolean r0 = r2.contains(r0)     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x01be
        L_0x01bb:
            r16 = r13
            goto L_0x01c0
        L_0x01be:
            r16 = 0
        L_0x01c0:
            if (r16 != 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zza     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzeu r0 = r0.zzr()     // Catch:{ Exception -> 0x01dc }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzw()     // Catch:{ Exception -> 0x01dc }
            r0.zza(r4)     // Catch:{ Exception -> 0x01dc }
            return
        L_0x01d0:
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x01dc }
            if (r0 != 0) goto L_0x01db
            com.google.android.gms.measurement.internal.zzhc r0 = r1.zza     // Catch:{ Exception -> 0x01dc }
            r0.zza((java.lang.String) r15, (java.lang.String) r12, (java.lang.Object) r2, (boolean) r13)     // Catch:{ Exception -> 0x01dc }
        L_0x01db:
            return
        L_0x01dc:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzhc r2 = r1.zza
            com.google.android.gms.measurement.internal.zzeu r2 = r2.zzr()
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzf()
            java.lang.String r3 = "Throwable caught in handleReferrerForOnActivityCreated"
            r2.zza(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhy.zza(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzi().zzc(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.zza.zzi().zzb(activity);
        zzjv zzk = this.zza.zzk();
        zzk.zzq().zza((Runnable) new zzjx(zzk, zzk.zzm().elapsedRealtime()));
    }

    public final void onActivityResumed(Activity activity) {
        zzjv zzk = this.zza.zzk();
        zzk.zzq().zza((Runnable) new zzju(zzk, zzk.zzm().elapsedRealtime()));
        this.zza.zzi().zza(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzi().zzb(activity, bundle);
    }

    /* synthetic */ zzhy(zzhc zzhc, zzhh zzhh) {
        this(zzhc);
    }
}
