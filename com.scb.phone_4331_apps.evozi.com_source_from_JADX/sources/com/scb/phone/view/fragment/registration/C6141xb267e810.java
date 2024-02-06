package com.scb.phone.view.fragment.registration;

import android.content.Context;
import android.content.Intent;
import p040o.binaryImagesJsonFromMapsFile;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.registration.RegistrationFacialRecognitionLandingActivity$MediaBrowserCompat$ItemReceiver */
public final class C6141xb267e810 {
    private C6141xb267e810() {
    }

    public /* synthetic */ C6141xb267e810(byte b) {
        this();
    }

    public static Intent IconCompatParcelizer(Context context, binaryImagesJsonFromMapsFile binaryimagesjsonfrommapsfile, String str) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) binaryimagesjsonfrommapsfile, "flow");
        Intent intent = new Intent(context, RegistrationFacialRecognitionLandingActivity.class);
        intent.putExtra("EXTRA_FLOW_TYPE", binaryimagesjsonfrommapsfile);
        intent.putExtra("EXTRA_FATCA_STATUS", str);
        return intent;
    }
}
