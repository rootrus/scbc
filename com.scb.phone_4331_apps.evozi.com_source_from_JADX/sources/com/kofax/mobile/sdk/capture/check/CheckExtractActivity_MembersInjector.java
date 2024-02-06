package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk.capture.ExtractActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.IImageStorage;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class CheckExtractActivity_MembersInjector implements MileageQuantitySelectionActivity<CheckExtractActivity> {

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4667YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4668YG;

    /* renamed from: YN */
    private final HmlReviewDocumentActivity<IImageStorage> f4669YN;

    /* renamed from: Zx */
    private final HmlReviewDocumentActivity<CheckExtractor> f4670Zx;

    public CheckExtractActivity_MembersInjector(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<CheckExtractor> hmlReviewDocumentActivity4) {
        this.f4669YN = hmlReviewDocumentActivity;
        this.f4668YG = hmlReviewDocumentActivity2;
        this.f4667YF = hmlReviewDocumentActivity3;
        this.f4670Zx = hmlReviewDocumentActivity4;
    }

    public static MileageQuantitySelectionActivity<CheckExtractActivity> create(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<CheckExtractor> hmlReviewDocumentActivity4) {
        return new CheckExtractActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final void injectMembers(CheckExtractActivity checkExtractActivity) {
        ExtractActivity_MembersInjector.inject_imageStore(checkExtractActivity, this.f4669YN.get());
        ExtractActivity_MembersInjector.inject_buttonsBarView(checkExtractActivity, this.f4668YG.get());
        ExtractActivity_MembersInjector.inject_imageParamsStore(checkExtractActivity, this.f4667YF.get());
        inject_extractor(checkExtractActivity, this.f4670Zx.get());
    }

    public static void inject_extractor(CheckExtractActivity checkExtractActivity, CheckExtractor checkExtractor) {
        checkExtractActivity.aao = checkExtractor;
    }
}
