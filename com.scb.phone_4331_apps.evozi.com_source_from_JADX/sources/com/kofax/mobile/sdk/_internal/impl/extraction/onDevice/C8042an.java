package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7906a;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8613e;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.an */
public final class C8042an implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3897LV;

    /* renamed from: LW */
    private final HmlReviewDocumentActivity<C7906a> f3898LW;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8613e> f3899LX;

    public C8042an(C0705ah ahVar, HmlReviewDocumentActivity<C7906a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8613e> hmlReviewDocumentActivity2) {
        this.f3897LV = ahVar;
        this.f3898LW = hmlReviewDocumentActivity;
        this.f3899LX = hmlReviewDocumentActivity2;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3897LV.mo11680a(this.f3898LW.get(), this.f3899LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C8042an m4052a(C0705ah ahVar, HmlReviewDocumentActivity<C7906a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8613e> hmlReviewDocumentActivity2) {
        return new C8042an(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8342c m4053a(C0705ah ahVar, C7906a aVar, C8613e eVar) {
        C8342c a = ahVar.mo11680a(aVar, eVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
