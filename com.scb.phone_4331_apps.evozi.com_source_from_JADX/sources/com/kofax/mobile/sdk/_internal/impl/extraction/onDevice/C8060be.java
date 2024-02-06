package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7907b;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8577ag;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.be */
public final class C8060be implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3942LV;

    /* renamed from: LW */
    private final HmlReviewDocumentActivity<C7907b> f3943LW;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8577ag> f3944LX;

    public C8060be(C0705ah ahVar, HmlReviewDocumentActivity<C7907b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8577ag> hmlReviewDocumentActivity2) {
        this.f3942LV = ahVar;
        this.f3943LW = hmlReviewDocumentActivity;
        this.f3944LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3942LV.mo11683a(this.f3943LW.get(), this.f3944LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: g */
    public static C8060be m4106g(C0705ah ahVar, HmlReviewDocumentActivity<C7907b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8577ag> hmlReviewDocumentActivity2) {
        return new C8060be(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4105a(C0705ah ahVar, C7907b bVar, C8577ag agVar) {
        C8342c a = ahVar.mo11683a(bVar, agVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
