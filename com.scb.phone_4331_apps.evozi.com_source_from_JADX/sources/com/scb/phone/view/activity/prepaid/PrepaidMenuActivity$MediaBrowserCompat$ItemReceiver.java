package com.scb.phone.view.activity.prepaid;

import android.view.View;
import p040o.C4749hf;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

final class PrepaidMenuActivity$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ PrepaidMenuActivity MediaBrowserCompat$ItemReceiver;

    PrepaidMenuActivity$MediaBrowserCompat$ItemReceiver(PrepaidMenuActivity prepaidMenuActivity) {
        this.MediaBrowserCompat$ItemReceiver = prepaidMenuActivity;
    }

    public final void onClick(View view) {
        C4749hf hfVar = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (hfVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4749hf.IconCompatParcelizer.IconCompatParcelizer;
        if (hfVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(hfVar.RatingCompat);
        }
    }
}
