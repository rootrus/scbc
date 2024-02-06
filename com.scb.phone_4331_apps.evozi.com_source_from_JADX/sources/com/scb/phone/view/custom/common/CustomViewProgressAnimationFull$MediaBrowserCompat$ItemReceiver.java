package com.scb.phone.view.custom.common;

import com.scb.phone.data.network.service.AddressService;
import p040o.DebitCardResetOtpActivity;
import p040o.DiscoverFundPerformanceActivity;
import p040o.HmlPinActivity;
import p040o.PassportCaptureModule_PassportOnDeviceExtractionServer_Factory;
import p040o.setAppOptOut;
import p040o.zzdv;
import p040o.zzfb;

public final class CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver implements PassportCaptureModule_PassportOnDeviceExtractionServer_Factory {
    private final setAppOptOut IconCompatParcelizer;
    private final AddressService read;

    private CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver(AddressService addressService, setAppOptOut setappoptout) {
        this.read = addressService;
        this.IconCompatParcelizer = setappoptout;
    }

    public final DebitCardResetOtpActivity<DiscoverFundPerformanceActivity.read> write(String str, String str2, String str3) {
        return this.read.findByAnyAddress(str, str2, str3).map(zzdv.MediaBrowserCompat$CustomActionResultReceiver).map(new zzfb(this.IconCompatParcelizer));
    }

    public final DebitCardResetOtpActivity<DiscoverFundPerformanceActivity.read> read() {
        return this.read.getAddressProvince().map(zzdv.MediaBrowserCompat$CustomActionResultReceiver).map(new zzfb(this.IconCompatParcelizer));
    }
}
