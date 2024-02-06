package com.kofax.kmc.kui.uicontrols;

import android.view.SurfaceView;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import com.kofax.mobile.sdk._internal.impl.event.C0675a;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class ImageCaptureView_MembersInjector implements MileageQuantitySelectionActivity<ImageCaptureView> {

    /* renamed from: ka */
    private final HmlReviewDocumentActivity<IBus> f588ka;

    /* renamed from: kb */
    private final HmlReviewDocumentActivity<C0675a> f589kb;

    /* renamed from: kc */
    private final HmlReviewDocumentActivity<C0608h> f590kc;

    /* renamed from: kd */
    private final HmlReviewDocumentActivity<C0509q> f591kd;

    /* renamed from: ke */
    private final HmlReviewDocumentActivity<SurfaceView> f592ke;

    public ImageCaptureView_MembersInjector(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0675a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0608h> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0509q> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<SurfaceView> hmlReviewDocumentActivity5) {
        this.f588ka = hmlReviewDocumentActivity;
        this.f589kb = hmlReviewDocumentActivity2;
        this.f590kc = hmlReviewDocumentActivity3;
        this.f591kd = hmlReviewDocumentActivity4;
        this.f592ke = hmlReviewDocumentActivity5;
    }

    public static MileageQuantitySelectionActivity<ImageCaptureView> create(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0675a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0608h> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0509q> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<SurfaceView> hmlReviewDocumentActivity5) {
        return new ImageCaptureView_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final void injectMembers(ImageCaptureView imageCaptureView) {
        inject_bus(imageCaptureView, this.f588ka.get());
        inject_apiEventManager(imageCaptureView, this.f589kb.get());
        inject_camera(imageCaptureView, this.f590kc.get());
        inject_previewFrameHandler(imageCaptureView, this.f591kd.get());
        inject_surface(imageCaptureView, this.f592ke.get());
    }

    public static void inject_bus(ImageCaptureView imageCaptureView, IBus iBus) {
        imageCaptureView._bus = iBus;
    }

    public static void inject_apiEventManager(ImageCaptureView imageCaptureView, C0675a aVar) {
        imageCaptureView.f567kn = aVar;
    }

    public static void inject_camera(ImageCaptureView imageCaptureView, C0608h hVar) {
        imageCaptureView.f568ko = hVar;
    }

    public static void inject_previewFrameHandler(ImageCaptureView imageCaptureView, C0509q qVar) {
        imageCaptureView.f569kp = qVar;
    }

    public static void inject_surface(ImageCaptureView imageCaptureView, SurfaceView surfaceView) {
        imageCaptureView.f570kq = surfaceView;
    }
}
