package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7914k;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0705ah;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bx */
public final class C8075bx implements OPRStatusRewardsLandingActivity_ViewBinding<C7914k> {

    /* renamed from: LV */
    private final C0705ah f3978LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0705ah.C0706a> f3979ad;

    public C8075bx(C0705ah ahVar, HmlReviewDocumentActivity<C0705ah.C0706a> hmlReviewDocumentActivity) {
        this.f3978LV = ahVar;
        this.f3979ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nL */
    public final C7914k get() {
        C7914k a = this.f3978LV.mo11657a(this.f3979ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: z */
    public static C8075bx m4151z(C0705ah ahVar, HmlReviewDocumentActivity<C0705ah.C0706a> hmlReviewDocumentActivity) {
        return new C8075bx(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: b */
    public static C7914k m4150b(C0705ah ahVar, Object obj) {
        C7914k a = ahVar.mo11657a((C0705ah.C0706a) obj);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
