package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zaca extends RegisterListenerMethod<A, L> {
    private final /* synthetic */ RegistrationMethods.Builder zakk;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zaca(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z) {
        super(listenerHolder, featureArr, z);
        this.zakk = builder;
    }

    /* access modifiers changed from: protected */
    public final void registerListener(A a, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.zakk.zake.accept(a, taskCompletionSource);
    }
}
