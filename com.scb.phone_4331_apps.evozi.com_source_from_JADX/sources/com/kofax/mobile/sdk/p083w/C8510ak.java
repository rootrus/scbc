package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p081u.C8478b;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.ak */
public class C8510ak extends C8500ae {

    /* renamed from: Qt */
    private final C8511a f5168Qt;

    /* renamed from: Qu */
    private final C7916m f5169Qu;

    /* renamed from: wM */
    private final C7919g f5170wM;

    /* renamed from: com.kofax.mobile.sdk.w.ak$a */
    public interface C8511a {
        /* renamed from: B */
        C8478b mo55420B(C8340a aVar);

        /* renamed from: D */
        boolean mo55421D(C8340a aVar);

        /* renamed from: E */
        ImagePerfectionProfile mo55422E(C8340a aVar);

        /* renamed from: e */
        void mo55423e(C8340a aVar, Exception exc);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8510ak(C8511a aVar, C7916m mVar, C7919g gVar) {
        this.f5168Qt = aVar;
        this.f5169Qu = mVar;
        this.f5170wM = gVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        try {
            m5230C(aVar);
            e = null;
        } catch (Exception e) {
            e = e;
        }
        this.f5168Qt.mo55423e(aVar, e);
    }

    /* renamed from: C */
    private void m5230C(C8340a aVar) {
        C8478b B = this.f5168Qt.mo55420B(aVar);
        boolean D = this.f5168Qt.mo55421D(aVar);
        boolean z = true;
        if ((B == null || B.originalImage == null) ? false : true) {
            if (B.f5065NV == null) {
                z = false;
            }
            if (!z) {
                B.f5065NV = m5233w(B.originalImage);
            }
            if (D) {
                m5232c(B);
            } else {
                m5231a(aVar, B);
            }
        }
    }

    /* renamed from: c */
    private void m5232c(C8478b bVar) {
        bVar.f5066NW = bVar.originalImage;
        bVar.f5067NX = bVar.f5065NV;
    }

    /* renamed from: a */
    private void m5231a(C8340a aVar, C8478b bVar) {
        ImagePerfectionProfile E = this.f5168Qt.mo55422E(aVar);
        if (E != null) {
            bVar.f5066NW = this.f5169Qu.mo54321a(E, bVar.originalImage);
            bVar.f5067NX = m5233w(bVar.f5066NW);
        }
    }

    /* renamed from: w */
    private C7919g.C7920a m5233w(Image image) {
        try {
            return this.f5170wM.mo54325w(image);
        } catch (KmcRuntimeException unused) {
            return null;
        }
    }
}
