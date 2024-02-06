package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7906a;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8615g;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ao */
public final class C8043ao implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3900LV;

    /* renamed from: LW */
    private final HmlReviewDocumentActivity<C7906a> f3901LW;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8615g> f3902LX;

    public C8043ao(C0705ah ahVar, HmlReviewDocumentActivity<C7906a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8615g> hmlReviewDocumentActivity2) {
        this.f3900LV = ahVar;
        this.f3901LW = hmlReviewDocumentActivity;
        this.f3902LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3900LV.mo11681a(this.f3901LW.get(), this.f3902LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C8043ao m4056b(C0705ah ahVar, HmlReviewDocumentActivity<C7906a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8615g> hmlReviewDocumentActivity2) {
        return new C8043ao(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4055a(C0705ah ahVar, C7906a aVar, C8615g gVar) {
        C8342c a = ahVar.mo11681a(aVar, gVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
