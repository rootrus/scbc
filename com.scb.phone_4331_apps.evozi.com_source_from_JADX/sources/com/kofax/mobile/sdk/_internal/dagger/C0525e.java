package com.kofax.mobile.sdk._internal.dagger;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.impl.C0727j;
import com.kofax.mobile.sdk.capture.ApplicationContextImageStore;
import com.kofax.mobile.sdk.capture.ContextImageStorage;
import com.kofax.mobile.sdk.capture.IImageStorage;
import com.kofax.mobile.sdk.p011ag.C0808a;
import com.kofax.mobile.sdk.p015ak.C0858b;

/* renamed from: com.kofax.mobile.sdk._internal.dagger.e */
public class C0525e {
    /* renamed from: a */
    public IBus mo11404a(C0727j jVar) {
        return jVar;
    }

    /* renamed from: a */
    public C0858b mo11405a(C0808a aVar) {
        return aVar;
    }

    public IImageStorage getIImageStorage() {
        IImageStorage imageStorage = ApplicationContextImageStore.getImageStorage();
        if (imageStorage == null) {
            imageStorage = new ContextImageStorage();
        }
        ApplicationContextImageStore.setImageStorage(imageStorage);
        return imageStorage;
    }
}
