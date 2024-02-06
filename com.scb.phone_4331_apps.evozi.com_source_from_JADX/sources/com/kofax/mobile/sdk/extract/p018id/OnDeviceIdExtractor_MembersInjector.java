package com.kofax.mobile.sdk.extract.p018id;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7914k;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.extract.id.OnDeviceIdExtractor_MembersInjector */
public final class OnDeviceIdExtractor_MembersInjector implements MileageQuantitySelectionActivity<OnDeviceIdExtractor> {

    /* renamed from: Zx */
    private final HmlReviewDocumentActivity<C7914k> f4888Zx;

    public OnDeviceIdExtractor_MembersInjector(HmlReviewDocumentActivity<C7914k> hmlReviewDocumentActivity) {
        this.f4888Zx = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<OnDeviceIdExtractor> create(HmlReviewDocumentActivity<C7914k> hmlReviewDocumentActivity) {
        return new OnDeviceIdExtractor_MembersInjector(hmlReviewDocumentActivity);
    }

    public final void injectMembers(OnDeviceIdExtractor onDeviceIdExtractor) {
        inject_extractorProvider(onDeviceIdExtractor, this.f4888Zx.get());
    }

    public static void inject_extractorProvider(OnDeviceIdExtractor onDeviceIdExtractor, C7914k kVar) {
        onDeviceIdExtractor.aen = kVar;
    }
}
