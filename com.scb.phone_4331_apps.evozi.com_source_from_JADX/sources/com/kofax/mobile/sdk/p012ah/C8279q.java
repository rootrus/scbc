package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.C7888b;
import com.kofax.mobile.sdk._internal.impl.C7926b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.q */
public final class C8279q implements OPRStatusRewardsLandingActivity_ViewBinding<C7888b> {

    /* renamed from: Yi */
    private final C0844o f4454Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7926b> f4455ad;

    public C8279q(C0844o oVar, HmlReviewDocumentActivity<C7926b> hmlReviewDocumentActivity) {
        this.f4454Yi = oVar;
        this.f4455ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sB */
    public final C7888b get() {
        C7888b a = this.f4454Yi.mo12069a(this.f4455ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C8279q m4646b(C0844o oVar, HmlReviewDocumentActivity<C7926b> hmlReviewDocumentActivity) {
        return new C8279q(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C7888b m4645a(C0844o oVar, C7926b bVar) {
        C7888b a = oVar.mo12069a(bVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
