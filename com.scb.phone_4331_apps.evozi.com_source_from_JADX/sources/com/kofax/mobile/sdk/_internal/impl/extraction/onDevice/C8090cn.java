package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7908c;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8584am;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cn */
public final class C8090cn implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4014LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8584am> f4015LX;

    /* renamed from: Mg */
    private final HmlReviewDocumentActivity<C7908c> f4016Mg;

    public C8090cn(C0705ah ahVar, HmlReviewDocumentActivity<C7908c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8584am> hmlReviewDocumentActivity2) {
        this.f4014LV = ahVar;
        this.f4016Mg = hmlReviewDocumentActivity;
        this.f4015LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4014LV.mo11686a(this.f4016Mg.get(), this.f4015LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: r */
    public static C8090cn m4197r(C0705ah ahVar, HmlReviewDocumentActivity<C7908c> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8584am> hmlReviewDocumentActivity2) {
        return new C8090cn(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4196a(C0705ah ahVar, C7908c cVar, C8584am amVar) {
        C8342c a = ahVar.mo11686a(cVar, amVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
