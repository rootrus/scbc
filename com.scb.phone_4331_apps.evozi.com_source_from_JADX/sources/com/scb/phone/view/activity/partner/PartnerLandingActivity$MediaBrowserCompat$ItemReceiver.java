package com.scb.phone.view.activity.partner;

import android.content.DialogInterface;

final class PartnerLandingActivity$MediaBrowserCompat$ItemReceiver implements DialogInterface.OnClickListener {
    private /* synthetic */ PartnerLandingActivity MediaBrowserCompat$ItemReceiver;

    PartnerLandingActivity$MediaBrowserCompat$ItemReceiver(PartnerLandingActivity partnerLandingActivity) {
        this.MediaBrowserCompat$ItemReceiver = partnerLandingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PartnerLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        dialogInterface.dismiss();
    }
}
