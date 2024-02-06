package com.kofax.mobile.sdk.p084x;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;

/* renamed from: com.kofax.mobile.sdk.x.ac */
public class C8572ac extends C8629t {

    /* renamed from: Re */
    public static final String f5257Re = "Generic";

    /* renamed from: Rf */
    private static final C8297a f5258Rf = new C8297a() {
        public final String getClassId() {
            return C8572ac.f5257Re;
        }

        public final float getConfidence() {
            return 1.0f;
        }
    };

    /* renamed from: i */
    public Image mo55455i(C8340a aVar) {
        return aVar.mo55126hr().f5066NW;
    }

    /* renamed from: a */
    public void mo55453a(C8340a aVar, C8297a aVar2, Exception exc) {
        if (m5394f(aVar, exc)) {
            mo55510d(f5258Rf);
        } else {
            mo55510d(aVar2);
        }
        setException(exc);
    }

    /* renamed from: f */
    private boolean m5394f(C8340a aVar, Exception exc) {
        if (exc == null || !KmcRuntimeException.class.isAssignableFrom(exc.getClass()) || !((KmcRuntimeException) exc).getErrorInfo().equals(ErrorInfo.KMC_CL_CLASSIFICATION_CONFIDENCE_LOW) || !aVar.mo55128ht().equals(C8340a.f4877vM)) {
            return false;
        }
        return true;
    }
}
