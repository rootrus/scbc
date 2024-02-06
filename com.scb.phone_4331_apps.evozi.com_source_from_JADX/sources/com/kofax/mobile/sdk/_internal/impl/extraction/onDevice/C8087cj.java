package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7917o;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p083w.C8566z;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cj */
public final class C8087cj implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4007LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8566z.C8567a> f4008LX;

    /* renamed from: Mf */
    private final HmlReviewDocumentActivity<C7917o> f4009Mf;

    public C8087cj(C0705ah ahVar, HmlReviewDocumentActivity<C7917o> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8566z.C8567a> hmlReviewDocumentActivity2) {
        this.f4007LV = ahVar;
        this.f4009Mf = hmlReviewDocumentActivity;
        this.f4008LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4007LV.mo11692a(this.f4009Mf.get(), this.f4008LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: q */
    public static C8087cj m4188q(C0705ah ahVar, HmlReviewDocumentActivity<C7917o> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8566z.C8567a> hmlReviewDocumentActivity2) {
        return new C8087cj(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4187a(C0705ah ahVar, C7917o oVar, C8566z.C8567a aVar) {
        C8342c a = ahVar.mo11692a(oVar, aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
