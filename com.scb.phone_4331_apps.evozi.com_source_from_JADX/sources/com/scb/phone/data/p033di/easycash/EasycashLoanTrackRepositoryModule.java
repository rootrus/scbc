package com.scb.phone.data.p033di.easycash;

import com.scb.phone.data.network.service.easycash.EasycashLoanTrackService;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.getEventCode;
import p040o.lastKey;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.data.di.easycash.EasycashLoanTrackRepositoryModule */
public final class EasycashLoanTrackRepositoryModule {
    @HmlSetNTBPinActivity
    public final lastKey write(EasycashLoanTrackService easycashLoanTrackService, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        onGetStartedClick.write((Object) easycashLoanTrackService, "easycashLoanTrackService");
        onGetStartedClick.write((Object) str, "tileVersion");
        return new getEventCode(easycashLoanTrackService, str);
    }
}
