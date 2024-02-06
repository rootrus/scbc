package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.impl.C7926b;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdWorkflowActivity_MembersInjector */
public final class IdWorkflowActivity_MembersInjector implements MileageQuantitySelectionActivity<IdWorkflowActivity> {
    private final HmlReviewDocumentActivity<C7926b> acS;

    public IdWorkflowActivity_MembersInjector(HmlReviewDocumentActivity<C7926b> hmlReviewDocumentActivity) {
        this.acS = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<IdWorkflowActivity> create(HmlReviewDocumentActivity<C7926b> hmlReviewDocumentActivity) {
        return new IdWorkflowActivity_MembersInjector(hmlReviewDocumentActivity);
    }

    public final void injectMembers(IdWorkflowActivity idWorkflowActivity) {
        inject_base64Decoder(idWorkflowActivity, this.acS.get());
    }

    public static void inject_base64Decoder(IdWorkflowActivity idWorkflowActivity, C7926b bVar) {
        idWorkflowActivity.acQ = bVar;
    }
}
