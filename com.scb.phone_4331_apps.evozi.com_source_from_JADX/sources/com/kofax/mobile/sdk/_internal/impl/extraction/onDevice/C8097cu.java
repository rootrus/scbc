package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C0531n;
import com.kofax.mobile.sdk.p029y.C0995b;
import dagger.Lazy;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRRegistrationLandingActivity_ViewBinding;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cu */
public final class C8097cu implements OPRStatusRewardsLandingActivity_ViewBinding<C0531n> {

    /* renamed from: LV */
    private final C0705ah f4034LV;

    /* renamed from: Mj */
    private final HmlReviewDocumentActivity<C0719e> f4035Mj;

    /* renamed from: Mk */
    private final HmlReviewDocumentActivity<C0995b> f4036Mk;

    public C8097cu(C0705ah ahVar, HmlReviewDocumentActivity<C0719e> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0995b> hmlReviewDocumentActivity2) {
        this.f4034LV = ahVar;
        this.f4035Mj = hmlReviewDocumentActivity;
        this.f4036Mk = hmlReviewDocumentActivity2;
    }

    /* renamed from: nY */
    public final C0531n get() {
        C0531n a = this.f4034LV.mo11661a(OPRRegistrationLandingActivity_ViewBinding.IconCompatParcelizer(this.f4035Mj), OPRRegistrationLandingActivity_ViewBinding.IconCompatParcelizer(this.f4036Mk));
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: x */
    public static C8097cu m4218x(C0705ah ahVar, HmlReviewDocumentActivity<C0719e> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0995b> hmlReviewDocumentActivity2) {
        return new C8097cu(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C0531n m4217a(C0705ah ahVar, Lazy<C0719e> lazy, Lazy<C0995b> lazy2) {
        C0531n a = ahVar.mo11661a(lazy, lazy2);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
