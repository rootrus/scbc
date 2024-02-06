package com.scb.phone.view.activity.hml.submission;

import android.content.Context;
import android.content.Intent;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.hml.submission.HmlDocumentSubmissionTutorialsActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5634xbe8cfba3 {
    private C5634xbe8cfba3() {
    }

    public /* synthetic */ C5634xbe8cfba3(byte b) {
        this();
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(context, HmlDocumentSubmissionTutorialsActivity.class);
        intent.putExtra("APPLICATION_ID_TAG", str);
        intent.putExtra("DOCUMENT_TYPE_TAG", str2);
        intent.putExtra("PRODUCT_TYPE_TAG", str3);
        intent.putExtra("FLOW_TAG", str4);
        return intent;
    }

    public static Intent write(Context context, String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "documentType");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        Intent MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(context, str, str2, str3, str4);
        MediaBrowserCompat$ItemReceiver.putExtra("STEP_TAG", "KOFAX_TUTORIAL_STEP");
        return MediaBrowserCompat$ItemReceiver;
    }
}
