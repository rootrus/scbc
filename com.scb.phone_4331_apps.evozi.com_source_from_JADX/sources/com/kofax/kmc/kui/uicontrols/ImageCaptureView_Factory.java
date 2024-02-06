package com.kofax.kmc.kui.uicontrols;

import android.content.Context;
import android.view.SurfaceView;
import com.kofax.mobile.sdk._internal.IBus;
import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import com.kofax.mobile.sdk._internal.impl.event.C0675a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class ImageCaptureView_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<ImageCaptureView> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f582X;

    /* renamed from: ka */
    private final HmlReviewDocumentActivity<IBus> f583ka;

    /* renamed from: kb */
    private final HmlReviewDocumentActivity<C0675a> f584kb;

    /* renamed from: kc */
    private final HmlReviewDocumentActivity<C0608h> f585kc;

    /* renamed from: kd */
    private final HmlReviewDocumentActivity<C0509q> f586kd;

    /* renamed from: ke */
    private final HmlReviewDocumentActivity<SurfaceView> f587ke;

    public ImageCaptureView_Factory(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0675a> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0608h> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0509q> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<SurfaceView> hmlReviewDocumentActivity6) {
        this.f582X = hmlReviewDocumentActivity;
        this.f583ka = hmlReviewDocumentActivity2;
        this.f584kb = hmlReviewDocumentActivity3;
        this.f585kc = hmlReviewDocumentActivity4;
        this.f586kd = hmlReviewDocumentActivity5;
        this.f587ke = hmlReviewDocumentActivity6;
    }

    public final ImageCaptureView get() {
        ImageCaptureView imageCaptureView = new ImageCaptureView(this.f582X.get());
        ImageCaptureView_MembersInjector.inject_bus(imageCaptureView, this.f583ka.get());
        ImageCaptureView_MembersInjector.inject_apiEventManager(imageCaptureView, this.f584kb.get());
        ImageCaptureView_MembersInjector.inject_camera(imageCaptureView, this.f585kc.get());
        ImageCaptureView_MembersInjector.inject_previewFrameHandler(imageCaptureView, this.f586kd.get());
        ImageCaptureView_MembersInjector.inject_surface(imageCaptureView, this.f587ke.get());
        return imageCaptureView;
    }

    public static ImageCaptureView_Factory create(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0675a> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0608h> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C0509q> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<SurfaceView> hmlReviewDocumentActivity6) {
        return new ImageCaptureView_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public static ImageCaptureView newImageCaptureView(Context context) {
        return new ImageCaptureView(context);
    }
}
