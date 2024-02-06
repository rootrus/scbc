package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class RttiJsonBill_MembersInjector implements MileageQuantitySelectionActivity<RttiJsonBill> {
    private final HmlReviewDocumentActivity<IJsonExactionHelper> aah;

    public RttiJsonBill_MembersInjector(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        this.aah = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<RttiJsonBill> create(HmlReviewDocumentActivity<IJsonExactionHelper> hmlReviewDocumentActivity) {
        return new RttiJsonBill_MembersInjector(hmlReviewDocumentActivity);
    }

    public final void injectMembers(RttiJsonBill rttiJsonBill) {
        inject_jsonExactionHelper(rttiJsonBill, this.aah.get());
    }

    public static void inject_jsonExactionHelper(RttiJsonBill rttiJsonBill, IJsonExactionHelper iJsonExactionHelper) {
        rttiJsonBill.f4637ZW = iJsonExactionHelper;
    }
}
