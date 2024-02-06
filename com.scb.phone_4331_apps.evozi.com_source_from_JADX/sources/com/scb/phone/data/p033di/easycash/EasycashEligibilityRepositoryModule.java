package com.scb.phone.data.p033di.easycash;

import com.scb.phone.data.network.service.easycash.EasycashEligibilityService;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.onGetStartedClick;
import p040o.subMap;
import p040o.zzgv;

/* renamed from: com.scb.phone.data.di.easycash.EasycashEligibilityRepositoryModule */
public final class EasycashEligibilityRepositoryModule {
    @HmlSetNTBPinActivity
    public final subMap MediaBrowserCompat$CustomActionResultReceiver(EasycashEligibilityService easycashEligibilityService, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        onGetStartedClick.write((Object) easycashEligibilityService, "easycashEligibilityService");
        onGetStartedClick.write((Object) str, "tileVersion");
        return new zzgv(easycashEligibilityService, str);
    }
}
