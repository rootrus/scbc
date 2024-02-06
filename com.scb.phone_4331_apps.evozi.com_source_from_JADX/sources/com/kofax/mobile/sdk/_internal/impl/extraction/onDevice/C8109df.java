package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.C7919g;
import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8608bj;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.df */
public final class C8109df implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f4066LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8608bj> f4067LX;

    /* renamed from: Ml */
    private final HmlReviewDocumentActivity<C7916m> f4068Ml;

    /* renamed from: wN */
    private final HmlReviewDocumentActivity<C7919g> f4069wN;

    public C8109df(C0705ah ahVar, HmlReviewDocumentActivity<C8608bj> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity3) {
        this.f4066LV = ahVar;
        this.f4067LX = hmlReviewDocumentActivity;
        this.f4068Ml = hmlReviewDocumentActivity2;
        this.f4069wN = hmlReviewDocumentActivity3;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f4066LV.mo11715a(this.f4067LX.get(), this.f4068Ml.get(), this.f4069wN.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: d */
    public static C8109df m4253d(C0705ah ahVar, HmlReviewDocumentActivity<C8608bj> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7919g> hmlReviewDocumentActivity3) {
        return new C8109df(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: a */
    public static C8342c m4252a(C0705ah ahVar, C8608bj bjVar, C7916m mVar, C7919g gVar) {
        C8342c a = ahVar.mo11715a(bjVar, mVar, gVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
