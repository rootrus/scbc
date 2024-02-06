package com.kofax.kmc.kui.uicontrols.captureanimations;

import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IDocumentBaseOverlayView> {

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<DocumentBaseOverlayView> f647ad;

    /* renamed from: mk */
    private final CaptureAnimationsModule f648mk;

    public CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory(CaptureAnimationsModule captureAnimationsModule, HmlReviewDocumentActivity<DocumentBaseOverlayView> hmlReviewDocumentActivity) {
        this.f648mk = captureAnimationsModule;
        this.f647ad = hmlReviewDocumentActivity;
    }

    public final IDocumentBaseOverlayView get() {
        IDocumentBaseOverlayView provideIDocumentBaseOverlayView = this.f648mk.provideIDocumentBaseOverlayView(this.f647ad.get());
        if (provideIDocumentBaseOverlayView != null) {
            return provideIDocumentBaseOverlayView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory create(CaptureAnimationsModule captureAnimationsModule, HmlReviewDocumentActivity<DocumentBaseOverlayView> hmlReviewDocumentActivity) {
        return new CaptureAnimationsModule_ProvideIDocumentBaseOverlayViewFactory(captureAnimationsModule, hmlReviewDocumentActivity);
    }

    public static IDocumentBaseOverlayView proxyProvideIDocumentBaseOverlayView(CaptureAnimationsModule captureAnimationsModule, Object obj) {
        IDocumentBaseOverlayView provideIDocumentBaseOverlayView = captureAnimationsModule.provideIDocumentBaseOverlayView((DocumentBaseOverlayView) obj);
        if (provideIDocumentBaseOverlayView != null) {
            return provideIDocumentBaseOverlayView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
