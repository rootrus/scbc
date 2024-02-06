package com.scb.phone.view.activity.prepaid.request;

import android.view.View;
import p040o.C3448x3f5b8de7;
import p040o.IExceptionResponseDeserializer;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.activity.prepaid.request.PrepaidRequestMarketConductActivity$MediaBrowserCompat$ItemReceiver */
final class C5701xa03496d3 implements View.OnClickListener {
    private /* synthetic */ PrepaidRequestMarketConductActivity MediaBrowserCompat$ItemReceiver;

    C5701xa03496d3(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity) {
        this.MediaBrowserCompat$ItemReceiver = prepaidRequestMarketConductActivity;
    }

    public final void onClick(View view) {
        IExceptionResponseDeserializer iExceptionResponseDeserializer = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (iExceptionResponseDeserializer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C3448x3f5b8de7.write;
        if (iExceptionResponseDeserializer.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(iExceptionResponseDeserializer.RatingCompat);
        }
    }
}
