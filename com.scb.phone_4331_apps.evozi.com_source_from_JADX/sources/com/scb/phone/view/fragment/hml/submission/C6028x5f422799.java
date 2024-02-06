package com.scb.phone.view.fragment.hml.submission;

import android.os.Bundle;
import p040o.onGetStartedClick;
import p040o.setPersonalShortCuts;

/* renamed from: com.scb.phone.view.fragment.hml.submission.HmlNTBDocumentSubmissionFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6028x5f422799 {
    private C6028x5f422799() {
    }

    public /* synthetic */ C6028x5f422799(byte b) {
        this();
    }

    public static HmlNTBDocumentSubmissionFragment MediaBrowserCompat$ItemReceiver(setPersonalShortCuts setpersonalshortcuts) {
        onGetStartedClick.write((Object) setpersonalshortcuts, "flowType");
        HmlNTBDocumentSubmissionFragment hmlNTBDocumentSubmissionFragment = new HmlNTBDocumentSubmissionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_SUBMISSTION_TYPE", setpersonalshortcuts);
        hmlNTBDocumentSubmissionFragment.setArguments(bundle);
        return hmlNTBDocumentSubmissionFragment;
    }
}
