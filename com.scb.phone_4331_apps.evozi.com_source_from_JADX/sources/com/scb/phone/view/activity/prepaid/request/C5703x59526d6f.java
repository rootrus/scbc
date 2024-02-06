package com.scb.phone.view.activity.prepaid.request;

import android.content.DialogInterface;
import p040o.IDeserializer;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.activity.prepaid.request.PrepaidRequestTermConditionsActivity$MediaBrowserCompat$ItemReceiver */
final class C5703x59526d6f implements DialogInterface.OnClickListener {
    private /* synthetic */ PrepaidRequestTermConditionsActivity MediaBrowserCompat$ItemReceiver;

    C5703x59526d6f(PrepaidRequestTermConditionsActivity prepaidRequestTermConditionsActivity) {
        this.MediaBrowserCompat$ItemReceiver = prepaidRequestTermConditionsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IDeserializer iDeserializer = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (iDeserializer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IDeserializer.IconCompatParcelizer.IconCompatParcelizer;
        if (iDeserializer.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(iDeserializer.RatingCompat);
        }
    }
}
