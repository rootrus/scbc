package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7907b;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8622m;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ap */
public final class C8044ap implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3903LV;

    /* renamed from: LW */
    private final HmlReviewDocumentActivity<C7907b> f3904LW;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8622m> f3905LX;

    public C8044ap(C0705ah ahVar, HmlReviewDocumentActivity<C7907b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8622m> hmlReviewDocumentActivity2) {
        this.f3903LV = ahVar;
        this.f3904LW = hmlReviewDocumentActivity;
        this.f3905LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3903LV.mo11684a(this.f3904LW.get(), this.f3905LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public static C8044ap m4059c(C0705ah ahVar, HmlReviewDocumentActivity<C7907b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8622m> hmlReviewDocumentActivity2) {
        return new C8044ap(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4058a(C0705ah ahVar, C7907b bVar, C8622m mVar) {
        C8342c a = ahVar.mo11684a(bVar, mVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
