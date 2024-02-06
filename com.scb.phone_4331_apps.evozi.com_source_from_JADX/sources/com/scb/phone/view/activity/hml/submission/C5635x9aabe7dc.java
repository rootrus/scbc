package com.scb.phone.view.activity.hml.submission;

import android.content.Context;
import android.content.Intent;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.hml.submission.HmlNTBCropDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5635x9aabe7dc {
    private C5635x9aabe7dc() {
    }

    public /* synthetic */ C5635x9aabe7dc(byte b) {
        this();
    }

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, String str2, String str3, String str4, String str5, boolean z) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "path");
        onGetStartedClick.write((Object) str3, "documentType");
        onGetStartedClick.write((Object) str4, "productType");
        onGetStartedClick.write((Object) str5, "flow");
        Intent intent = new Intent(context, HmlNTBCropDocumentActivity.class);
        intent.putExtra("IMAGE_PATH_TAG", str2);
        intent.putExtra("APPLICATION_ID_TAG", str);
        intent.putExtra("DOCUMENT_TYPE_TAG", str3);
        intent.putExtra("PRODUCT_TYPE_TAG", str4);
        intent.putExtra("FLOW_TAG", str5);
        intent.putExtra("FROM_GALLERY_TAG", z);
        return intent;
    }
}
