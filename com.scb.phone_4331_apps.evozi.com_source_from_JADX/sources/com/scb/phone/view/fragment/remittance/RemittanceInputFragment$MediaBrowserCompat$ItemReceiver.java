package com.scb.phone.view.fragment.remittance;

import com.scb.phone.R;
import p040o.CardView;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

final class RemittanceInputFragment$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<CardView, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ RemittanceCountrySelectionFragment MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemittanceInputFragment$MediaBrowserCompat$ItemReceiver(RemittanceCountrySelectionFragment remittanceCountrySelectionFragment) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = remittanceCountrySelectionFragment;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        CardView cardView = (CardView) obj;
        onGetStartedClick.write((Object) cardView, "$receiver");
        cardView.MediaBrowserCompat$SearchResultReceiver();
        cardView.IconCompatParcelizer(R.id.fragment_detail, this.MediaBrowserCompat$ItemReceiver, "country_selection");
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
