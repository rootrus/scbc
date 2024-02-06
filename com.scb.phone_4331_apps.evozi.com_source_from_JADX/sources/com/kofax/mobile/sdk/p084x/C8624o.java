package com.kofax.mobile.sdk.p084x;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk.extract.p018id.IIdImageProcessingListener;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p081u.C8478b;
import com.kofax.mobile.sdk.p083w.C8507ai;

/* renamed from: com.kofax.mobile.sdk.x.o */
public class C8624o implements C8507ai.C8508a {
    /* renamed from: B */
    public C8478b mo55417B(C8340a aVar) {
        return aVar.mo55127hs();
    }

    /* renamed from: a */
    public void mo55418a(IIdImageProcessingListener iIdImageProcessingListener, Image image) {
        iIdImageProcessingListener.onBackImageProcessed(image);
    }
}
