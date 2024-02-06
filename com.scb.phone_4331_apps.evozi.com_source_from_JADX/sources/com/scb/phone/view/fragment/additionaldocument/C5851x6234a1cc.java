package com.scb.phone.view.fragment.additionaldocument;

import android.os.Bundle;
import p040o.onGetStartedClick;
import p040o.zzwd;
import p040o.zzwf;

/* renamed from: com.scb.phone.view.fragment.additionaldocument.HmlApiBasedDocumentInstructionsFragment$MediaBrowserCompat$ItemReceiver */
public final class C5851x6234a1cc {
    public static final C5851x6234a1cc IconCompatParcelizer = new C5851x6234a1cc();

    private C5851x6234a1cc() {
    }

    public static HmlApiBasedDocumentInstructionsFragment MediaBrowserCompat$CustomActionResultReceiver(boolean z, zzwd zzwd, String str, zzwf zzwf) {
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        onGetStartedClick.write((Object) str, "documentCode");
        onGetStartedClick.write((Object) zzwf, "cameraType");
        Bundle bundle = new Bundle();
        bundle.putBoolean("SHOW_NEXT_BUTTON_KEY", z);
        bundle.putSerializable("UPLOAD_METHOD", zzwd);
        bundle.putSerializable("CAMERA_TYPE", zzwf);
        bundle.putString("DOCUMENT_CODE", str);
        HmlApiBasedDocumentInstructionsFragment hmlApiBasedDocumentInstructionsFragment = new HmlApiBasedDocumentInstructionsFragment();
        hmlApiBasedDocumentInstructionsFragment.setArguments(bundle);
        return hmlApiBasedDocumentInstructionsFragment;
    }
}
