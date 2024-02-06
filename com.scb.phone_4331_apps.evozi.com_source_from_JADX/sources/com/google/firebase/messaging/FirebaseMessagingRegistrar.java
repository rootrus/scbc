package com.google.firebase.messaging;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;
import p040o.Float4;
import p040o.Int2;
import p040o.Int3;
import p040o.Long3;
import p040o.Matrix2f;
import p040o.getArray;

public class FirebaseMessagingRegistrar implements ComponentRegistrar {

    static final class zza<T> implements getArray<T> {
        private zza() {
        }

        public final void send(Int2<T> int2) {
        }

        public final void schedule(Int2<T> int2, Long3 long3) {
            long3.onSchedule((Exception) null);
        }
    }

    public static final class zzb implements Matrix2f {
        public final <T> getArray<T> getTransport(String str, Class<T> cls, Float4 float4, Int3<T, byte[]> int3) {
            return new zza();
        }
    }

    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.builder(FirebaseMessaging.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(FirebaseInstanceId.class)).add(Dependency.required(UserAgentPublisher.class)).add(Dependency.required(HeartBeatInfo.class)).add(Dependency.optional(Matrix2f.class)).add(Dependency.required(FirebaseInstallationsApi.class)).factory(zzn.zza).alwaysEager().build(), LibraryVersionComponent.create("fire-fcm", "20.2.0")});
    }
}
