package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import com.kofax.mobile.sdk.p029y.C8650p;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bw */
public final class C8074bw implements OPRStatusRewardsLandingActivity_ViewBinding<IIdExtractor> {

    /* renamed from: LV */
    private final C0705ah f3975LV;

    /* renamed from: Me */
    private final HmlReviewDocumentActivity<C8650p> f3976Me;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<IIdExtractor> f3977ad;

    public C8074bw(C0705ah ahVar, HmlReviewDocumentActivity<C8650p> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IIdExtractor> hmlReviewDocumentActivity2) {
        this.f3975LV = ahVar;
        this.f3976Me = hmlReviewDocumentActivity;
        this.f3977ad = hmlReviewDocumentActivity2;
    }

    /* renamed from: hp */
    public final IIdExtractor get() {
        IIdExtractor a = this.f3975LV.mo11719a(this.f3976Me.get(), this.f3977ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: n */
    public static C8074bw m4148n(C0705ah ahVar, HmlReviewDocumentActivity<C8650p> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IIdExtractor> hmlReviewDocumentActivity2) {
        return new C8074bw(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static IIdExtractor m4147a(C0705ah ahVar, C8650p pVar, IIdExtractor iIdExtractor) {
        IIdExtractor a = ahVar.mo11719a(pVar, iIdExtractor);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
