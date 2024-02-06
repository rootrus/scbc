package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p073c.C8299c;
import com.kofax.mobile.sdk.p075e.C8340a;

/* renamed from: com.kofax.mobile.sdk.w.k */
public class C8547k extends C8500ae {

    /* renamed from: PS */
    private final C8299c f5230PS;

    /* renamed from: PT */
    private final C8548a f5231PT;

    /* renamed from: com.kofax.mobile.sdk.w.k$a */
    public interface C8548a {
        /* renamed from: a */
        void mo55453a(C8340a aVar, C8297a aVar2, Exception exc);

        /* renamed from: e */
        String mo55454e(C8340a aVar);

        /* renamed from: i */
        Image mo55455i(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    public C8547k(C8299c cVar, C8548a aVar) {
        this.f5230PS = cVar;
        this.f5231PT = aVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        C8297a aVar2 = null;
        try {
            aVar2 = m5316f(this.f5231PT.mo55455i(aVar), this.f5231PT.mo55454e(aVar));
            e = null;
        } catch (Exception e) {
            e = e;
        }
        this.f5231PT.mo55453a(aVar, aVar2, e);
    }

    /* renamed from: f */
    private C8297a m5316f(Image image, String str) {
        if (image != null) {
            return m5317g(image, str);
        }
        return null;
    }

    /* renamed from: g */
    private C8297a m5317g(Image image, String str) {
        C8297a a = this.f5230PS.mo54764a(str, image);
        if (a != null) {
            return a;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_CL_CLASSIFICATION_CONFIDENCE_LOW);
    }
}
