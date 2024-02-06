package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import com.kofax.mobile.sdk._internal.impl.camera.C0556ag;
import com.kofax.mobile.sdk._internal.impl.camera.C0619j;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.u */
public final class C0849u implements OPRStatusRewardsLandingActivity_ViewBinding<C0499e> {

    /* renamed from: Yi */
    private final C0844o f2053Yi;

    /* renamed from: Yj */
    private final HmlReviewDocumentActivity<C0619j> f2054Yj;

    /* renamed from: Yk */
    private final HmlReviewDocumentActivity<C0556ag> f2055Yk;

    /* renamed from: ur */
    private final HmlReviewDocumentActivity<IVideoResourceProvider> f2056ur;

    public C0849u(C0844o oVar, HmlReviewDocumentActivity<C0619j> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0556ag> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IVideoResourceProvider> hmlReviewDocumentActivity3) {
        this.f2053Yi = oVar;
        this.f2054Yj = hmlReviewDocumentActivity;
        this.f2055Yk = hmlReviewDocumentActivity2;
        this.f2056ur = hmlReviewDocumentActivity3;
    }

    /* renamed from: jM */
    public final C0499e get() {
        C0499e a = this.f2053Yi.mo12070a(this.f2054Yj.get(), this.f2055Yk.get(), this.f2056ur.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0849u m2173a(C0844o oVar, HmlReviewDocumentActivity<C0619j> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0556ag> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IVideoResourceProvider> hmlReviewDocumentActivity3) {
        return new C0849u(oVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: a */
    public static C0499e m2172a(C0844o oVar, C0619j jVar, C0556ag agVar, IVideoResourceProvider iVideoResourceProvider) {
        C0499e a = oVar.mo12070a(jVar, agVar, iVideoResourceProvider);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
