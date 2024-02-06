package com.scb.phone.view.activity.hml;

import android.content.DialogInterface;

final class HmlBaseConsentActivity$MediaBrowserCompat$ItemReceiver implements DialogInterface.OnClickListener {
    public static final HmlBaseConsentActivity$MediaBrowserCompat$ItemReceiver read = new HmlBaseConsentActivity$MediaBrowserCompat$ItemReceiver();

    HmlBaseConsentActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
