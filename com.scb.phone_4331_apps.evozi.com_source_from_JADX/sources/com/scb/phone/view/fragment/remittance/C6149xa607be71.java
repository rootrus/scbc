package com.scb.phone.view.fragment.remittance;

import p040o.C3085x7c929f5b;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindBillPaymentHistoryFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.remittance.RemittanceCountrySelectionFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6149xa607be71 extends CheckEligibilityActivity implements FundFactSheetActivity<C3085x7c929f5b.C30861, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ RemittanceCountrySelectionFragment IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6149xa607be71(RemittanceCountrySelectionFragment remittanceCountrySelectionFragment) {
        super(1);
        this.IconCompatParcelizer = remittanceCountrySelectionFragment;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        C3085x7c929f5b.C30861 r2 = (C3085x7c929f5b.C30861) obj;
        onGetStartedClick.write((Object) r2, "it");
        FragmentBuilder_BindBillPaymentHistoryFragment MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaMetadataCompat;
        if (MediaBrowserCompat$ItemReceiver != null) {
            MediaBrowserCompat$ItemReceiver.write(r2);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
