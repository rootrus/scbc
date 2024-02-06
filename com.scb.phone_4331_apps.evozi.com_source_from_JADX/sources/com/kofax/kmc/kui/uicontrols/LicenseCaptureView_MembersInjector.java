package com.kofax.kmc.kui.uicontrols;

import android.view.SurfaceView;
import com.kofax.kmc.kui.uicontrols.captureanimations.ILicenseOverlayView;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import com.kofax.mobile.sdk._internal.impl.event.C0675a;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class LicenseCaptureView_MembersInjector implements MileageQuantitySelectionActivity<LicenseCaptureView> {

    /* renamed from: ka */
    private final HmlReviewDocumentActivity<IBus> f3522ka;

    /* renamed from: kb */
    private final HmlReviewDocumentActivity<C0675a> f3523kb;

    /* renamed from: kc */
    private final HmlReviewDocumentActivity<C0608h> f3524kc;

    /* renamed from: kd */
    private final HmlReviewDocumentActivity<C0509q> f3525kd;

    /* renamed from: ke */
    private final HmlReviewDocumentActivity<SurfaceView> f3526ke;

    /* renamed from: ma */
    private final HmlReviewDocumentActivity<ILicenseOverlayView> f3527ma;

    public LicenseCaptureView_MembersInjector(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0675a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0608h> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0509q> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<SurfaceView> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<ILicenseOverlayView> hmlReviewDocumentActivity6) {
        this.f3522ka = hmlReviewDocumentActivity;
        this.f3523kb = hmlReviewDocumentActivity2;
        this.f3524kc = hmlReviewDocumentActivity3;
        this.f3525kd = hmlReviewDocumentActivity4;
        this.f3526ke = hmlReviewDocumentActivity5;
        this.f3527ma = hmlReviewDocumentActivity6;
    }

    public static MileageQuantitySelectionActivity<LicenseCaptureView> create(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0675a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0608h> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0509q> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<SurfaceView> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<ILicenseOverlayView> hmlReviewDocumentActivity6) {
        return new LicenseCaptureView_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final void injectMembers(LicenseCaptureView licenseCaptureView) {
        ImageCaptureView_MembersInjector.inject_bus(licenseCaptureView, this.f3522ka.get());
        ImageCaptureView_MembersInjector.inject_apiEventManager(licenseCaptureView, this.f3523kb.get());
        ImageCaptureView_MembersInjector.inject_camera(licenseCaptureView, this.f3524kc.get());
        ImageCaptureView_MembersInjector.inject_previewFrameHandler(licenseCaptureView, this.f3525kd.get());
        ImageCaptureView_MembersInjector.inject_surface(licenseCaptureView, this.f3526ke.get());
        inject_licenseOverlay(licenseCaptureView, this.f3527ma.get());
    }

    public static void inject_licenseOverlay(LicenseCaptureView licenseCaptureView, ILicenseOverlayView iLicenseOverlayView) {
        licenseCaptureView.f3520lY = iLicenseOverlayView;
    }
}
