package com.kofax.mobile.sdk.p012ah;

import com.kofax.kmc.kui.uicontrols.captureanimations.ILicenseOverlayView;
import com.kofax.kmc.kui.uicontrols.captureanimations.LicenseOverlayView;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ar */
public final class C8265ar implements OPRStatusRewardsLandingActivity_ViewBinding<ILicenseOverlayView> {

    /* renamed from: Yi */
    private final C0844o f4425Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<LicenseOverlayView> f4426ad;

    public C8265ar(C0844o oVar, HmlReviewDocumentActivity<LicenseOverlayView> hmlReviewDocumentActivity) {
        this.f4425Yi = oVar;
        this.f4426ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sZ */
    public final ILicenseOverlayView get() {
        ILicenseOverlayView b = this.f4425Yi.mo12095b(this.f4426ad.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: B */
    public static C8265ar m4603B(C0844o oVar, HmlReviewDocumentActivity<LicenseOverlayView> hmlReviewDocumentActivity) {
        return new C8265ar(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static ILicenseOverlayView m4604a(C0844o oVar, LicenseOverlayView licenseOverlayView) {
        ILicenseOverlayView b = oVar.mo12095b(licenseOverlayView);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
