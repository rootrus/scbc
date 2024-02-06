package com.scb.phone.view.activity.bscanc;

import android.view.View;

/* renamed from: com.scb.phone.view.activity.bscanc.ManageQrToPayActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5563xcda4f383 implements View.OnFocusChangeListener {
    private /* synthetic */ ManageQrToPayActivity MediaBrowserCompat$CustomActionResultReceiver;

    C5563xcda4f383(ManageQrToPayActivity manageQrToPayActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = manageQrToPayActivity;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem();
        }
    }
}
