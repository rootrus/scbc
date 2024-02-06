package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7916m;
import com.kofax.mobile.sdk.p029y.C8656t;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cd */
public final class C8083cd implements OPRStatusRewardsLandingActivity_ViewBinding<C7916m> {

    /* renamed from: LV */
    private final C0705ah f3998LV;

    /* renamed from: Me */
    private final HmlReviewDocumentActivity<C8656t> f3999Me;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7916m> f4000ad;

    public C8083cd(C0705ah ahVar, HmlReviewDocumentActivity<C8656t> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2) {
        this.f3998LV = ahVar;
        this.f3999Me = hmlReviewDocumentActivity;
        this.f4000ad = hmlReviewDocumentActivity2;
    }

    /* renamed from: nR */
    public final C7916m get() {
        C7916m a = this.f3998LV.mo11660a(this.f3999Me.get(), this.f4000ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: p */
    public static C8083cd m4176p(C0705ah ahVar, HmlReviewDocumentActivity<C8656t> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7916m> hmlReviewDocumentActivity2) {
        return new C8083cd(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C7916m m4175a(C0705ah ahVar, C8656t tVar, C7916m mVar) {
        C7916m a = ahVar.mo11660a(tVar, mVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
