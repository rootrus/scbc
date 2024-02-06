package com.kofax.mobile.sdk.capture;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk.capture.extraction.ExtractorResponse;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class ExtractActivity_MembersInjector<T extends ExtractorResponse> implements MileageQuantitySelectionActivity<ExtractActivity<T>> {

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4504YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4505YG;

    /* renamed from: YN */
    private final HmlReviewDocumentActivity<IImageStorage> f4506YN;

    public ExtractActivity_MembersInjector(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3) {
        this.f4506YN = hmlReviewDocumentActivity;
        this.f4505YG = hmlReviewDocumentActivity2;
        this.f4504YF = hmlReviewDocumentActivity3;
    }

    public static <T extends ExtractorResponse> MileageQuantitySelectionActivity<ExtractActivity<T>> create(HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3) {
        return new ExtractActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final void injectMembers(ExtractActivity<T> extractActivity) {
        inject_imageStore(extractActivity, this.f4506YN.get());
        inject_buttonsBarView(extractActivity, this.f4505YG.get());
        inject_imageParamsStore(extractActivity, this.f4504YF.get());
    }

    public static <T extends ExtractorResponse> void inject_imageStore(ExtractActivity<T> extractActivity, IImageStorage iImageStorage) {
        extractActivity.f4499YK = iImageStorage;
    }

    public static <T extends ExtractorResponse> void inject_buttonsBarView(ExtractActivity<T> extractActivity, C8234b bVar) {
        extractActivity.f4502Yy = bVar;
    }

    public static <T extends ExtractorResponse> void inject_imageParamsStore(ExtractActivity<T> extractActivity, C7898e eVar) {
        extractActivity.f4501Yx = eVar;
    }
}
