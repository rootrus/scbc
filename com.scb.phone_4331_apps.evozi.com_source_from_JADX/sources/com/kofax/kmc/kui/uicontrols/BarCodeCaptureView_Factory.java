package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.view.SurfaceView;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.camera.C7890l;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import com.kofax.mobile.sdk._internal.impl.event.C0675a;
import com.kofax.mobile.sdk._internal.impl.view.C8228v;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class BarCodeCaptureView_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<BarCodeCaptureView> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f3482X;

    /* renamed from: jZ */
    private final HmlReviewDocumentActivity<C8228v> f3483jZ;

    /* renamed from: ka */
    private final HmlReviewDocumentActivity<IBus> f3484ka;

    /* renamed from: kb */
    private final HmlReviewDocumentActivity<C0675a> f3485kb;

    /* renamed from: kc */
    private final HmlReviewDocumentActivity<C0608h> f3486kc;

    /* renamed from: kd */
    private final HmlReviewDocumentActivity<C0509q> f3487kd;

    /* renamed from: ke */
    private final HmlReviewDocumentActivity<SurfaceView> f3488ke;

    /* renamed from: kf */
    private final HmlReviewDocumentActivity<C7890l> f3489kf;

    public BarCodeCaptureView_Factory(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8228v> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0675a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0608h> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0509q> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<SurfaceView> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<C7890l> hmlReviewDocumentActivity8) {
        this.f3482X = hmlReviewDocumentActivity;
        this.f3483jZ = hmlReviewDocumentActivity2;
        this.f3484ka = hmlReviewDocumentActivity3;
        this.f3485kb = hmlReviewDocumentActivity4;
        this.f3486kc = hmlReviewDocumentActivity5;
        this.f3487kd = hmlReviewDocumentActivity6;
        this.f3488ke = hmlReviewDocumentActivity7;
        this.f3489kf = hmlReviewDocumentActivity8;
    }

    public final BarCodeCaptureView get() {
        BarCodeCaptureView barCodeCaptureView = new BarCodeCaptureView(this.f3482X.get(), this.f3483jZ.get());
        ImageCaptureView_MembersInjector.inject_bus(barCodeCaptureView, this.f3484ka.get());
        ImageCaptureView_MembersInjector.inject_apiEventManager(barCodeCaptureView, this.f3485kb.get());
        ImageCaptureView_MembersInjector.inject_camera(barCodeCaptureView, this.f3486kc.get());
        ImageCaptureView_MembersInjector.inject_previewFrameHandler(barCodeCaptureView, this.f3487kd.get());
        ImageCaptureView_MembersInjector.inject_surface(barCodeCaptureView, this.f3488ke.get());
        BarCodeCaptureView_MembersInjector.inject_imageDataToBitmap(barCodeCaptureView, this.f3489kf.get());
        return barCodeCaptureView;
    }

    public static BarCodeCaptureView_Factory create(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8228v> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0675a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0608h> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C0509q> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<SurfaceView> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<C7890l> hmlReviewDocumentActivity8) {
        return new BarCodeCaptureView_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public static BarCodeCaptureView newBarCodeCaptureView(Context context, C8228v vVar) {
        return new BarCodeCaptureView(context, vVar);
    }
}
