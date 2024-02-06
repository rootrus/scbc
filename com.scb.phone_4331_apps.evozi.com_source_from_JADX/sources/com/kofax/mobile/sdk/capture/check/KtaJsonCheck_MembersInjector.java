package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class KtaJsonCheck_MembersInjector implements MileageQuantitySelectionActivity<KtaJsonCheck> {
    private final HmlReviewDocumentActivity<IJsonExactionHelper> aah;

    public KtaJsonCheck_MembersInjector(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        this.aah = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<KtaJsonCheck> create(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        return new KtaJsonCheck_MembersInjector(hmlReviewDocumentActivity);
    }

    public final void injectMembers(KtaJsonCheck ktaJsonCheck) {
        inject_jsonExactionHelper(ktaJsonCheck, this.aah.get());
    }

    public static void inject_jsonExactionHelper(KtaJsonCheck ktaJsonCheck, IJsonExactionHelper iJsonExactionHelper) {
        ktaJsonCheck.f4702ZW = iJsonExactionHelper;
    }
}
