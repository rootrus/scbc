package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk.p007ac.C0788a;
import com.kofax.mobile.sdk.p008ad.C0790a;
import com.kofax.mobile.sdk.p013ai.C0853a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.aw */
public final class C0820aw implements OPRStatusRewardsLandingActivity_ViewBinding<C0853a> {

    /* renamed from: Yi */
    private final C0844o f2002Yi;

    /* renamed from: Yl */
    private final HmlReviewDocumentActivity<C0790a> f2003Yl;

    /* renamed from: Ym */
    private final HmlReviewDocumentActivity<C0788a> f2004Ym;

    public C0820aw(C0844o oVar, HmlReviewDocumentActivity<C0790a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0788a> hmlReviewDocumentActivity2) {
        this.f2002Yi = oVar;
        this.f2003Yl = hmlReviewDocumentActivity;
        this.f2004Ym = hmlReviewDocumentActivity2;
    }

    /* renamed from: te */
    public final C0853a get() {
        C0853a a = this.f2002Yi.mo12091a(this.f2003Yl.get(), this.f2004Ym.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0820aw m2039a(C0844o oVar, HmlReviewDocumentActivity<C0790a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0788a> hmlReviewDocumentActivity2) {
        return new C0820aw(oVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C0853a m2040a(C0844o oVar, C0790a aVar, C0788a aVar2) {
        C0853a a = oVar.mo12091a(aVar, aVar2);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
