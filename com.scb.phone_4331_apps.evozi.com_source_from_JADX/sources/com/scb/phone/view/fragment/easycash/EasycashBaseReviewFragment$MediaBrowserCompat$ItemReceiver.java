package com.scb.phone.view.fragment.easycash;

import com.scb.phone.domain.interactor.partner.nsip.NsipPartnerPaymentConfirmCase;
import p040o.HmlPinActivity;
import p040o.getBundleVersion;
import p040o.onGetStartedClick;
import p040o.zzrp;

public final class EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver implements getBundleVersion {
    private final NsipPartnerPaymentConfirmCase.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    private EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver(NsipPartnerPaymentConfirmCase.IconCompatParcelizer iconCompatParcelizer) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "delayLoadingStorage");
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final zzrp MediaBrowserCompat$ItemReceiver() {
        NsipPartnerPaymentConfirmCase.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        return (zzrp) iconCompatParcelizer.write.fromJson(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.getString("com.scb.phone.PREF_KEY_IMPROVE_LOAD", (String) null), zzrp.class);
    }

    public final void IconCompatParcelizer(zzrp zzrp) {
        onGetStartedClick.write((Object) zzrp, "delayLoading");
        zzrp.write = Long.valueOf(System.currentTimeMillis());
        NsipPartnerPaymentConfirmCase.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) zzrp, "delayLoading");
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.edit().putString("com.scb.phone.PREF_KEY_IMPROVE_LOAD", iconCompatParcelizer.write.toJson((Object) zzrp)).apply();
    }
}
