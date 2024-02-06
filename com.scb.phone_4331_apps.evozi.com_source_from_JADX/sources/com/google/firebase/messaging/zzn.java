package com.google.firebase.messaging;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.platforminfo.UserAgentPublisher;
import p040o.C7236load;
import p040o.Float4;
import p040o.Matrix2f;

final /* synthetic */ class zzn implements ComponentFactory {
    static final ComponentFactory zza = new zzn();

    private zzn() {
    }

    public final Object create(ComponentContainer componentContainer) {
        FirebaseApp firebaseApp = (FirebaseApp) componentContainer.get(FirebaseApp.class);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class);
        UserAgentPublisher userAgentPublisher = (UserAgentPublisher) componentContainer.get(UserAgentPublisher.class);
        HeartBeatInfo heartBeatInfo = (HeartBeatInfo) componentContainer.get(HeartBeatInfo.class);
        FirebaseInstallationsApi firebaseInstallationsApi = (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class);
        Matrix2f matrix2f = (Matrix2f) componentContainer.get(Matrix2f.class);
        if (matrix2f == null || !C7236load.MediaBrowserCompat$ItemReceiver.contains(new Float4("json"))) {
            matrix2f = new FirebaseMessagingRegistrar.zzb();
        }
        return new FirebaseMessaging(firebaseApp, firebaseInstanceId, userAgentPublisher, heartBeatInfo, firebaseInstallationsApi, matrix2f);
    }
}
