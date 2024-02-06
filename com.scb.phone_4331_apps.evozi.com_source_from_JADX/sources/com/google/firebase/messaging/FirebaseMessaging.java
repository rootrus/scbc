package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.zzao;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p040o.Matrix2f;

public class FirebaseMessaging {
    static Matrix2f zza;
    private final Context zzb;
    private final FirebaseInstanceId zzc;
    private final Task<zzab> zzd;

    FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, UserAgentPublisher userAgentPublisher, HeartBeatInfo heartBeatInfo, FirebaseInstallationsApi firebaseInstallationsApi, Matrix2f matrix2f) {
        zza = matrix2f;
        this.zzc = firebaseInstanceId;
        Context applicationContext = firebaseApp.getApplicationContext();
        this.zzb = applicationContext;
        Task<zzab> zza2 = zzab.zza(firebaseApp, firebaseInstanceId, new zzao(applicationContext), userAgentPublisher, heartBeatInfo, firebaseInstallationsApi, this.zzb, zzi.zza(), new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io")));
        this.zzd = zza2;
        zza2.addOnSuccessListener(zzi.zzb(), (OnSuccessListener<? super zzab>) new zzk(this));
    }

    public boolean isAutoInitEnabled() {
        return this.zzc.zzh();
    }
}
