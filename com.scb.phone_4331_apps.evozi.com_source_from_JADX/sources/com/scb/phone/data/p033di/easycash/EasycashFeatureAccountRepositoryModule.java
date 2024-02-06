package com.scb.phone.data.p033di.easycash;

import com.scb.phone.view.activity.hml.businessowner.HmlNTBOperatingBankActivity;
import p040o.AbstractMultimap;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.onGetStartedClick;
import p040o.setPassword;
import p040o.zzgw;

/* renamed from: com.scb.phone.data.di.easycash.EasycashFeatureAccountRepositoryModule */
public final class EasycashFeatureAccountRepositoryModule {
    @HmlSetNTBPinActivity
    public final AbstractMultimap.SortedKeySet read(HmlNTBOperatingBankActivity.write write, setPassword setpassword, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        onGetStartedClick.write((Object) write, "easycashFeatureAccountApi");
        onGetStartedClick.write((Object) setpassword, "easycashFeatureMapper");
        onGetStartedClick.write((Object) str, "tileVersion");
        return new zzgw.zza.C10768zza(write, str, setpassword);
    }
}
