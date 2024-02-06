package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7917o;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ch */
public final class C8086ch implements OPRStatusRewardsLandingActivity_ViewBinding<C7917o> {

    /* renamed from: LV */
    private final C0705ah f4005LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8030ac> f4006ad;

    public C8086ch(C0705ah ahVar, HmlReviewDocumentActivity<C8030ac> hmlReviewDocumentActivity) {
        this.f4005LV = ahVar;
        this.f4006ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nV */
    public final C7917o get() {
        C7917o a = this.f4005LV.mo11662a(this.f4006ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: H */
    public static C8086ch m4184H(C0705ah ahVar, HmlReviewDocumentActivity<C8030ac> hmlReviewDocumentActivity) {
        return new C8086ch(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7917o m4185a(C0705ah ahVar, C8030ac acVar) {
        C7917o a = ahVar.mo11662a(acVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
