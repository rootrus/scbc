package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0504j;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0592i;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.i */
public final class C0839i implements OPRStatusRewardsLandingActivity_ViewBinding<C0504j> {

    /* renamed from: Yf */
    private final C0837g f2036Yf;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0592i> f2037ad;

    public C0839i(C0837g gVar, HmlReviewDocumentActivity<C0592i> hmlReviewDocumentActivity) {
        this.f2036Yf = gVar;
        this.f2037ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sx */
    public final C0504j get() {
        C0504j c = this.f2036Yf.mo12056c(this.f2037ad.get());
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0839i m2102a(C0837g gVar, HmlReviewDocumentActivity<C0592i> hmlReviewDocumentActivity) {
        return new C0839i(gVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0504j m2101a(C0837g gVar, C0592i iVar) {
        C0504j c = gVar.mo12056c(iVar);
        if (c != null) {
            return c;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
