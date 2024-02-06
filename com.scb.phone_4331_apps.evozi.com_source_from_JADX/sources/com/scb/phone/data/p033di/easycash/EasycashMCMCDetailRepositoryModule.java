package com.scb.phone.data.p033di.easycash;

import com.scb.phone.data.network.service.easycash.EasycashMCMCService;
import com.scb.phone.view.activity.hml.promptpay.HmlPromptPayVerificationActivity;
import p040o.CredentialRequestResult;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.onGetStartedClick;
import p040o.sortedMap;
import p040o.zzgy;

/* renamed from: com.scb.phone.data.di.easycash.EasycashMCMCDetailRepositoryModule */
public final class EasycashMCMCDetailRepositoryModule {
    @HmlSetNTBPinActivity
    public final sortedMap MediaBrowserCompat$CustomActionResultReceiver(EasycashMCMCService easycashMCMCService, HmlPromptPayVerificationActivity.read read, CredentialRequestResult credentialRequestResult, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        onGetStartedClick.write((Object) easycashMCMCService, "easycashMCMCService");
        onGetStartedClick.write((Object) read, "easycashMCMCDetailApi");
        onGetStartedClick.write((Object) credentialRequestResult, "easycashMCMCLoanEntityMapper");
        onGetStartedClick.write((Object) str, "tilesVersion");
        return new zzgy(easycashMCMCService, read, credentialRequestResult, str);
    }
}
