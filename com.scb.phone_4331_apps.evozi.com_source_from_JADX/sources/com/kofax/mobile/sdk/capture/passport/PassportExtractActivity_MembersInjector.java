package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk.capture.ExtractActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.IImageStorage;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class PassportExtractActivity_MembersInjector implements MileageQuantitySelectionActivity<PassportExtractActivity> {

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4833YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4834YG;

    /* renamed from: YN */
    private final HmlReviewDocumentActivity<IImageStorage> f4835YN;

    /* renamed from: Zx */
    private final HmlReviewDocumentActivity<PassportExtractor> f4836Zx;

    public PassportExtractActivity_MembersInjector(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<PassportExtractor> hmlReviewDocumentActivity4) {
        this.f4835YN = hmlReviewDocumentActivity;
        this.f4834YG = hmlReviewDocumentActivity2;
        this.f4833YF = hmlReviewDocumentActivity3;
        this.f4836Zx = hmlReviewDocumentActivity4;
    }

    public static MileageQuantitySelectionActivity<PassportExtractActivity> create(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<PassportExtractor> hmlReviewDocumentActivity4) {
        return new PassportExtractActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final void injectMembers(PassportExtractActivity passportExtractActivity) {
        ExtractActivity_MembersInjector.inject_imageStore(passportExtractActivity, this.f4835YN.get());
        ExtractActivity_MembersInjector.inject_buttonsBarView(passportExtractActivity, this.f4834YG.get());
        ExtractActivity_MembersInjector.inject_imageParamsStore(passportExtractActivity, this.f4833YF.get());
        inject_extractor(passportExtractActivity, this.f4836Zx.get());
    }

    public static void inject_extractor(PassportExtractActivity passportExtractActivity, PassportExtractor passportExtractor) {
        passportExtractActivity.adz = passportExtractor;
    }
}
