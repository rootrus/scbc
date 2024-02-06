package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import p040o.onGetStartedClick;

public final class HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver {
    private HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ HmlCaptureDocumentActivity$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static Intent IconCompatParcelizer(Context context, String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "applicationId");
        onGetStartedClick.write((Object) str2, "documentType");
        onGetStartedClick.write((Object) str3, "productType");
        onGetStartedClick.write((Object) str4, "flow");
        Intent intent = new Intent(context, HmlCaptureDocumentActivity.class);
        intent.putExtra("APPLICATION_ID_TAG", str);
        intent.putExtra("DOCUMENT_TYPE_TAG", str2);
        intent.putExtra("PRODUCT_TYPE_TAG", str3);
        intent.putExtra("FLOW_TAG", str4);
        return intent;
    }
}
