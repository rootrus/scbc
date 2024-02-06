package com.kofax.mobile.sdk._internal.dagger;

import com.kofax.mobile.sdk.p011ag.C0808a;
import com.kofax.mobile.sdk.p015ak.C0858b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.dagger.h */
public final class C0527h implements OPRStatusRewardsLandingActivity_ViewBinding<C0858b> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0808a> f1177ad;

    /* renamed from: vJ */
    private final C0525e f1178vJ;

    public C0527h(C0525e eVar, HmlReviewDocumentActivity<C0808a> hmlReviewDocumentActivity) {
        this.f1178vJ = eVar;
        this.f1177ad = hmlReviewDocumentActivity;
    }

    /* renamed from: ho */
    public final C0858b get() {
        C0858b a = this.f1178vJ.mo11405a(this.f1177ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C0527h m1040b(C0525e eVar, HmlReviewDocumentActivity<C0808a> hmlReviewDocumentActivity) {
        return new C0527h(eVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0858b m1039a(C0525e eVar, C0808a aVar) {
        C0858b a = eVar.mo11405a(aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
