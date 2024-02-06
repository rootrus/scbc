package com.scb.phone.data.p033di.easycash;

import com.scb.phone.view.activity.hml.HmlNTBCompanyNameActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.comparator;
import p040o.getAccountTypesSet;
import p040o.onGetStartedClick;
import p040o.zzgu;

/* renamed from: com.scb.phone.data.di.easycash.EasycashCardInfoRepositoryModule */
public final class EasycashCardInfoRepositoryModule {
    @HmlSetNTBPinActivity
    public final comparator MediaBrowserCompat$CustomActionResultReceiver(HmlNTBCompanyNameActivity.IconCompatParcelizer iconCompatParcelizer, getAccountTypesSet getaccounttypesset, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "easycashCardInfoApi");
        onGetStartedClick.write((Object) getaccounttypesset, "easycashProductCardOfferEntityMapper");
        onGetStartedClick.write((Object) str, "tilesVersion");
        return new zzgu(iconCompatParcelizer, getaccounttypesset, str);
    }
}
