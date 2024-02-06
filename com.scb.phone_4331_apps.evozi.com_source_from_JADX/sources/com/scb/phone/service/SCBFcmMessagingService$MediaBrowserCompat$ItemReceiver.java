package com.scb.phone.service;

import com.scb.phone.data.network.service.NTBPinLoginService;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;

public final class SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver {
    public final NTBPinLoginService MediaBrowserCompat$CustomActionResultReceiver;

    private SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver(NTBPinLoginService nTBPinLoginService) {
        onGetStartedClick.write((Object) nTBPinLoginService, "service");
        this.MediaBrowserCompat$CustomActionResultReceiver = nTBPinLoginService;
    }
}
