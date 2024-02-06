package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.impl.view.SelfieOverlayView;
import com.kofax.mobile.sdk._internal.view.C8238n;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory implements OPRStatusRewardsLandingActivity_ViewBinding<C8238n> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<SelfieOverlayView> f3538ad;

    /* renamed from: mk */
    private final CaptureAnimationsModule f3539mk;

    public CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory(CaptureAnimationsModule captureAnimationsModule, HmlReviewDocumentActivity<SelfieOverlayView> hmlReviewDocumentActivity) {
        this.f3539mk = captureAnimationsModule;
        this.f3538ad = hmlReviewDocumentActivity;
    }

    public final C8238n get() {
        C8238n provideIISelfieOverlayView = this.f3539mk.provideIISelfieOverlayView(this.f3538ad.get());
        if (provideIISelfieOverlayView != null) {
            return provideIISelfieOverlayView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory create(CaptureAnimationsModule captureAnimationsModule, HmlReviewDocumentActivity<SelfieOverlayView> hmlReviewDocumentActivity) {
        return new CaptureAnimationsModule_ProvideIISelfieOverlayViewFactory(captureAnimationsModule, hmlReviewDocumentActivity);
    }

    public static C8238n proxyProvideIISelfieOverlayView(CaptureAnimationsModule captureAnimationsModule, SelfieOverlayView selfieOverlayView) {
        C8238n provideIISelfieOverlayView = captureAnimationsModule.provideIISelfieOverlayView(selfieOverlayView);
        if (provideIISelfieOverlayView != null) {
            return provideIISelfieOverlayView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
