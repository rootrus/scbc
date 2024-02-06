package com.scb.phone.view.activity.p038tc;

import android.content.DialogInterface;

/* renamed from: com.scb.phone.view.activity.tc.MutualFundTermsAndConditionsActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5714xc0a2f95d implements DialogInterface.OnClickListener {
    private /* synthetic */ MutualFundTermsAndConditionsActivity MediaBrowserCompat$ItemReceiver;

    C5714xc0a2f95d(MutualFundTermsAndConditionsActivity mutualFundTermsAndConditionsActivity) {
        this.MediaBrowserCompat$ItemReceiver = mutualFundTermsAndConditionsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.MediaBrowserCompat$ItemReceiver.finish();
    }
}
