package com.scb.phone.view.activity.hml;

import android.content.DialogInterface;
import p040o.ZSYR2K;

/* renamed from: com.scb.phone.view.activity.hml.HmlBaseConsentActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5600xda92199e implements DialogInterface.OnClickListener {
    private /* synthetic */ HmlBaseConsentActivity IconCompatParcelizer;

    C5600xda92199e(HmlBaseConsentActivity hmlBaseConsentActivity) {
        this.IconCompatParcelizer = hmlBaseConsentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.IconCompatParcelizer.MediaSessionCompat$QueueItem().MediaBrowserCompat$ItemReceiver();
        HmlBaseConsentActivity hmlBaseConsentActivity = this.IconCompatParcelizer;
        hmlBaseConsentActivity.scbAnalytics.write("p10x1_consent", new ZSYR2K("user_type", hmlBaseConsentActivity.MediaSessionCompat$Token()), new ZSYR2K("button", "accept"));
    }
}
