package com.scb.phone.view.activity.hml.submission;

import android.content.Context;
import android.content.Intent;
import p040o.onGetStartedClick;
import p040o.setPersonalShortCuts;

/* renamed from: com.scb.phone.view.activity.hml.submission.HmlNTBDocumentSubmissionActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5636xa7b1c218 {
    private C5636xa7b1c218() {
    }

    public /* synthetic */ C5636xa7b1c218(byte b) {
        this();
    }

    public static Intent MediaBrowserCompat$ItemReceiver(Context context, setPersonalShortCuts setpersonalshortcuts) {
        onGetStartedClick.write((Object) setpersonalshortcuts, "flowType");
        Intent putExtra = new Intent(context, HmlNTBDocumentSubmissionActivity.class).putExtra("HML_SUBMISSTION_TYPE", setpersonalshortcuts);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(ctx, HmlNTBDocume…, flowType as Parcelable)");
        return putExtra;
    }
}
