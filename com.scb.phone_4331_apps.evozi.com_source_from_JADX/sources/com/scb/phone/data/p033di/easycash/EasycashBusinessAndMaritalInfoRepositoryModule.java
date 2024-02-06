package com.scb.phone.data.p033di.easycash;

import com.scb.phone.data.network.service.easycash.EasycashBusinessAndMaritalInfoService;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.getFamilyName;
import p040o.headMap;
import p040o.onGetStartedClick;
import p040o.zzgt;

/* renamed from: com.scb.phone.data.di.easycash.EasycashBusinessAndMaritalInfoRepositoryModule */
public final class EasycashBusinessAndMaritalInfoRepositoryModule {
    @HmlSetNTBPinActivity
    public final headMap read(EasycashBusinessAndMaritalInfoService easycashBusinessAndMaritalInfoService, getFamilyName getfamilyname, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        onGetStartedClick.write((Object) easycashBusinessAndMaritalInfoService, "easycashBusinessAndMaritalInfoService");
        onGetStartedClick.write((Object) getfamilyname, "easycashBusinessAndMaritalInfoMapper");
        onGetStartedClick.write((Object) str, "tilesVersion");
        return new zzgt.zza(easycashBusinessAndMaritalInfoService, getfamilyname, str);
    }
}
