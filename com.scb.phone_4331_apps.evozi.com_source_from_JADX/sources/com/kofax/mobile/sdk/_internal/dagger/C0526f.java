package com.kofax.mobile.sdk._internal.dagger;

import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.impl.C0727j;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.dagger.f */
public final class C0526f implements OPRStatusRewardsLandingActivity_ViewBinding<IBus> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0727j> f1175ad;

    /* renamed from: vJ */
    private final C0525e f1176vJ;

    public C0526f(C0525e eVar, HmlReviewDocumentActivity<C0727j> hmlReviewDocumentActivity) {
        this.f1176vJ = eVar;
        this.f1175ad = hmlReviewDocumentActivity;
    }

    /* renamed from: hm */
    public final IBus get() {
        IBus a = this.f1176vJ.mo11404a(this.f1175ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0526f m1037a(C0525e eVar, HmlReviewDocumentActivity<C0727j> hmlReviewDocumentActivity) {
        return new C0526f(eVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IBus m1036a(C0525e eVar, C0727j jVar) {
        IBus a = eVar.mo11404a(jVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
