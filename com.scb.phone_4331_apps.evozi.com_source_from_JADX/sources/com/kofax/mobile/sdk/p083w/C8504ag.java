package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk.p075e.C8340a;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.ag */
public class C8504ag extends C8500ae {

    /* renamed from: Qr */
    private final C8505a f5164Qr;

    /* renamed from: com.kofax.mobile.sdk.w.ag$a */
    public interface C8505a {
        /* renamed from: A */
        boolean mo55412A(C8340a aVar);

        /* renamed from: d */
        void mo55413d(C8340a aVar, Exception exc);

        /* renamed from: k */
        boolean mo55414k(C8340a aVar);

        /* renamed from: z */
        boolean mo55415z(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8504ag(C8505a aVar) {
        this.f5164Qr = aVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        if (!this.f5164Qr.mo55414k(aVar)) {
            this.f5164Qr.mo55413d(aVar, (Exception) null);
        } else if (!this.f5164Qr.mo55415z(aVar)) {
            this.f5164Qr.mo55413d(aVar, new KmcRuntimeException(ErrorInfo.KMC_CL_CLASSIFICATION_CONFIDENCE_LOW));
        } else if (!this.f5164Qr.mo55412A(aVar)) {
            this.f5164Qr.mo55413d(aVar, new KmcRuntimeException(ErrorInfo.KMC_EX_PASSPORT_MRZ_DATA_NOT_FOUND));
        }
    }
}
