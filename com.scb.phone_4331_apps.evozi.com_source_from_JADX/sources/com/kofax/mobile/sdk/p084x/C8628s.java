package com.kofax.mobile.sdk.p084x;

import com.kofax.kmc.ken.engines.data.ImagePerfectionProfile;
import com.kofax.mobile.sdk._internal.extraction.C7900b;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p083w.C8510ak;

/* renamed from: com.kofax.mobile.sdk.x.s */
abstract class C8628s implements C8510ak.C8511a {

    /* renamed from: QX */
    private final C7900b f5312QX;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract String mo55499a(String str, C8297a aVar);

    C8628s(C7900b bVar) {
        this.f5312QX = bVar;
    }

    /* renamed from: D */
    public boolean mo55421D(C8340a aVar) {
        return aVar.isProcessed();
    }

    /* renamed from: E */
    public ImagePerfectionProfile mo55422E(C8340a aVar) {
        String ht = aVar.mo55128ht();
        String a = mo55499a(ht, aVar.mo55130hv());
        if (a == null || a.length() == 0) {
            return null;
        }
        ImagePerfectionProfile O = this.f5312QX.mo54270O(a);
        m5546a(ht, O);
        return O;
    }

    /* renamed from: a */
    private static void m5546a(String str, ImagePerfectionProfile imagePerfectionProfile) {
        imagePerfectionProfile.setUseMRZPassportDetection(str.equals(C8340a.f4877vM) ? ImagePerfectionProfile.UseMRZPassportDetection.ON : ImagePerfectionProfile.UseMRZPassportDetection.OFF);
    }
}
