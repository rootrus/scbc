package com.kofax.mobile.sdk.p084x;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.mobile.sdk.extract.p018id.IdRegion;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;

/* renamed from: com.kofax.mobile.sdk.x.i */
public class C8617i extends C8629t {

    /* renamed from: QM */
    private static final String f5301QM = "US";

    /* renamed from: QN */
    private static final C8297a f5302QN = new C8297a() {
        public final String getClassId() {
            return C8617i.f5301QM;
        }

        public final float getConfidence() {
            return 1.0f;
        }
    };

    /* renamed from: i */
    public Image mo55455i(C8340a aVar) {
        if (m5521H(aVar)) {
            return null;
        }
        return aVar.mo55127hs().f5066NW;
    }

    /* renamed from: H */
    private boolean m5521H(C8340a aVar) {
        return aVar.mo55127hs().originalImage != null && aVar.mo55128ht().equals(IdRegion.US.getRegionName());
    }

    /* renamed from: a */
    public void mo55453a(C8340a aVar, C8297a aVar2, Exception exc) {
        if (m5521H(aVar)) {
            mo55510d(f5302QN);
        } else {
            mo55510d(aVar2);
        }
        setException(exc);
    }
}
