package com.kofax.mobile.sdk.capture;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk.capture.processing.IImageProcessor;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class ProcessActivity_MembersInjector implements MileageQuantitySelectionActivity<ProcessActivity> {

    /* renamed from: YE */
    private final HmlReviewDocumentActivity<IImageStorage> f4525YE;

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4526YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4527YG;

    /* renamed from: YH */
    private final HmlReviewDocumentActivity<C7921h> f4528YH;

    /* renamed from: YW */
    private final HmlReviewDocumentActivity<IImageProcessor> f4529YW;

    public ProcessActivity_MembersInjector(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageProcessor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity5) {
        this.f4525YE = hmlReviewDocumentActivity;
        this.f4529YW = hmlReviewDocumentActivity2;
        this.f4527YG = hmlReviewDocumentActivity3;
        this.f4528YH = hmlReviewDocumentActivity4;
        this.f4526YF = hmlReviewDocumentActivity5;
    }

    public static MileageQuantitySelectionActivity<ProcessActivity> create(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageProcessor> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity5) {
        return new ProcessActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final void injectMembers(ProcessActivity processActivity) {
        inject_imageStorage(processActivity, this.f4525YE.get());
        inject_processor(processActivity, this.f4529YW.get());
        inject_buttonsBarView(processActivity, this.f4527YG.get());
        inject_stringIdGenerator(processActivity, this.f4528YH.get());
        inject_imageParamsStore(processActivity, this.f4526YF.get());
    }

    public static void inject_imageStorage(ProcessActivity processActivity, IImageStorage iImageStorage) {
        processActivity.f4520Yw = iImageStorage;
    }

    public static void inject_processor(ProcessActivity processActivity, IImageProcessor iImageProcessor) {
        processActivity.f4518YT = iImageProcessor;
    }

    public static void inject_buttonsBarView(ProcessActivity processActivity, C8234b bVar) {
        processActivity.f4522Yy = bVar;
    }

    public static void inject_stringIdGenerator(ProcessActivity processActivity, C7921h hVar) {
        processActivity.f4523Yz = hVar;
    }

    public static void inject_imageParamsStore(ProcessActivity processActivity, C7898e eVar) {
        processActivity.f4521Yx = eVar;
    }
}
