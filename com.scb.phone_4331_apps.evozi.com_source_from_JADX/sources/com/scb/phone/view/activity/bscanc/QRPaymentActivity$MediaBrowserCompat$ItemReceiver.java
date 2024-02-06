package com.scb.phone.view.activity.bscanc;

import android.content.DialogInterface;
import p040o.C5404x102e436b;
import p040o.onGetStartedClick;
import p040o.shouldSendGlobalHeartBeat;
import p040o.writeUInt64NoTag;

final class QRPaymentActivity$MediaBrowserCompat$ItemReceiver implements DialogInterface.OnClickListener {
    private /* synthetic */ QRPaymentActivity IconCompatParcelizer;

    QRPaymentActivity$MediaBrowserCompat$ItemReceiver(QRPaymentActivity qRPaymentActivity) {
        this.IconCompatParcelizer = qRPaymentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        shouldSendGlobalHeartBeat shouldsendglobalheartbeat = this.IconCompatParcelizer.presenter;
        if (shouldsendglobalheartbeat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5404x102e436b.MediaBrowserCompat$CustomActionResultReceiver;
        if (shouldsendglobalheartbeat.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(shouldsendglobalheartbeat.RatingCompat);
        }
    }
}
