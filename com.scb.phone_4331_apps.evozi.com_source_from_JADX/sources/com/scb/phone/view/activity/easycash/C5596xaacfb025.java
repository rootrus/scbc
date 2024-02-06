package com.scb.phone.view.activity.easycash;

import android.content.DialogInterface;

/* renamed from: com.scb.phone.view.activity.easycash.BaseCommonNCBConsentActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5596xaacfb025 implements DialogInterface.OnClickListener {
    private /* synthetic */ BaseCommonNCBConsentActivity MediaBrowserCompat$CustomActionResultReceiver;

    C5596xaacfb025(BaseCommonNCBConsentActivity baseCommonNCBConsentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseCommonNCBConsentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper().read(true);
        dialogInterface.dismiss();
    }
}
