package com.scb.phone.data.network.p034di.prepaid;

import com.scb.phone.data.network.service.prepaid.PrepaidActivationService;
import com.scb.phone.data.network.service.prepaid.PrepaidRequestService;
import com.scb.phone.data.network.service.prepaid.PrepaidService;
import com.scb.phone.data.network.service.prepaid.PrepaidTravelService;
import com.scb.phone.data.network.service.prepaid.cashout.PrepaidCashOutService;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.onGetStartedClick;
import p040o.zaaa;

/* renamed from: com.scb.phone.data.network.di.prepaid.PrepaidServiceModule */
public final class PrepaidServiceModule {
    @HmlSetNTBPinActivity
    public final PrepaidService read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        onGetStartedClick.write((Object) zaaa, "serviceGenerator");
        Object create = zaaa.read.create(PrepaidService.class);
        onGetStartedClick.IconCompatParcelizer(create, "serviceGenerator.createS…epaidService::class.java)");
        return (PrepaidService) create;
    }

    @HmlSetNTBPinActivity
    public final PrepaidRequestService MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        onGetStartedClick.write((Object) zaaa, "serviceGenerator");
        Object create = zaaa.read.create(PrepaidRequestService.class);
        onGetStartedClick.IconCompatParcelizer(create, "serviceGenerator.createS…questService::class.java)");
        return (PrepaidRequestService) create;
    }

    @HmlSetNTBPinActivity
    public final PrepaidActivationService write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        onGetStartedClick.write((Object) zaaa, "serviceGenerator");
        Object create = zaaa.read.create(PrepaidActivationService.class);
        onGetStartedClick.IconCompatParcelizer(create, "serviceGenerator.createS…ationService::class.java)");
        return (PrepaidActivationService) create;
    }

    @HmlSetNTBPinActivity
    public final PrepaidTravelService MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        onGetStartedClick.write((Object) zaaa, "serviceGenerator");
        Object create = zaaa.read.create(PrepaidTravelService.class);
        onGetStartedClick.IconCompatParcelizer(create, "serviceGenerator.createS…ravelService::class.java)");
        return (PrepaidTravelService) create;
    }

    @HmlSetNTBPinActivity
    public final PrepaidCashOutService IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        onGetStartedClick.write((Object) zaaa, "serviceGenerator");
        Object create = zaaa.read.create(PrepaidCashOutService.class);
        onGetStartedClick.IconCompatParcelizer(create, "serviceGenerator.createS…shOutService::class.java)");
        return (PrepaidCashOutService) create;
    }
}
