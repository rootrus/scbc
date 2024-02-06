package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.IIdFieldNameConvention;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bz */
public final class C8077bz implements OPRStatusRewardsLandingActivity_ViewBinding<IIdFieldNameConvention> {

    /* renamed from: LV */
    private final C0705ah f3982LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8135eh> f3983ad;

    public C8077bz(C0705ah ahVar, HmlReviewDocumentActivity<C8135eh> hmlReviewDocumentActivity) {
        this.f3982LV = ahVar;
        this.f3983ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nN */
    public final IIdFieldNameConvention get() {
        IIdFieldNameConvention a = this.f3982LV.mo11643a(this.f3983ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: B */
    public static C8077bz m4156B(C0705ah ahVar, HmlReviewDocumentActivity<C8135eh> hmlReviewDocumentActivity) {
        return new C8077bz(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IIdFieldNameConvention m4157a(C0705ah ahVar, C8135eh ehVar) {
        IIdFieldNameConvention a = ahVar.mo11643a(ehVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
