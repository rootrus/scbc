package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class KtaJsonBill_MembersInjector implements MileageQuantitySelectionActivity<KtaJsonBill> {
    private final HmlReviewDocumentActivity<IJsonExactionHelper> aah;

    public KtaJsonBill_MembersInjector(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        this.aah = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<KtaJsonBill> create(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        return new KtaJsonBill_MembersInjector(hmlReviewDocumentActivity);
    }

    public final void injectMembers(KtaJsonBill ktaJsonBill) {
        inject_jsonExactionHelper(ktaJsonBill, this.aah.get());
    }

    public static void inject_jsonExactionHelper(KtaJsonBill ktaJsonBill, IJsonExactionHelper iJsonExactionHelper) {
        ktaJsonBill.f4632ZW = iJsonExactionHelper;
    }
}
