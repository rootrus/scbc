package com.kofax.kmc.kui.uicontrols;

import android.view.SurfaceView;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.camera.C7890l;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import com.kofax.mobile.sdk._internal.impl.event.C0675a;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class BarCodeCaptureView_MembersInjector implements MileageQuantitySelectionActivity<BarCodeCaptureView> {

    /* renamed from: ka */
    private final HmlReviewDocumentActivity<IBus> f3490ka;

    /* renamed from: kb */
    private final HmlReviewDocumentActivity<C0675a> f3491kb;

    /* renamed from: kc */
    private final HmlReviewDocumentActivity<C0608h> f3492kc;

    /* renamed from: kd */
    private final HmlReviewDocumentActivity<C0509q> f3493kd;

    /* renamed from: ke */
    private final HmlReviewDocumentActivity<SurfaceView> f3494ke;

    /* renamed from: kf */
    private final HmlReviewDocumentActivity<C7890l> f3495kf;

    public BarCodeCaptureView_MembersInjector(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0675a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0608h> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0509q> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<SurfaceView> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7890l> hmlReviewDocumentActivity6) {
        this.f3490ka = hmlReviewDocumentActivity;
        this.f3491kb = hmlReviewDocumentActivity2;
        this.f3492kc = hmlReviewDocumentActivity3;
        this.f3493kd = hmlReviewDocumentActivity4;
        this.f3494ke = hmlReviewDocumentActivity5;
        this.f3495kf = hmlReviewDocumentActivity6;
    }

    public static MileageQuantitySelectionActivity<BarCodeCaptureView> create(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0675a> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0608h> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0509q> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<SurfaceView> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7890l> hmlReviewDocumentActivity6) {
        return new BarCodeCaptureView_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final void injectMembers(BarCodeCaptureView barCodeCaptureView) {
        ImageCaptureView_MembersInjector.inject_bus(barCodeCaptureView, this.f3490ka.get());
        ImageCaptureView_MembersInjector.inject_apiEventManager(barCodeCaptureView, this.f3491kb.get());
        ImageCaptureView_MembersInjector.inject_camera(barCodeCaptureView, this.f3492kc.get());
        ImageCaptureView_MembersInjector.inject_previewFrameHandler(barCodeCaptureView, this.f3493kd.get());
        ImageCaptureView_MembersInjector.inject_surface(barCodeCaptureView, this.f3494ke.get());
        inject_imageDataToBitmap(barCodeCaptureView, this.f3495kf.get());
    }

    public static void inject_imageDataToBitmap(BarCodeCaptureView barCodeCaptureView, C7890l lVar) {
        barCodeCaptureView.f3465jI = lVar;
    }
}
