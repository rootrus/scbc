package com.scb.phone.view.fragment.remittance;

import com.scb.phone.R;
import p040o.CardView;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.remittance.RemittanceInputFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6153x8c5b88a9 extends CheckEligibilityActivity implements FundFactSheetActivity<CardView, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ RemittanceInputFragment IconCompatParcelizer;
    private /* synthetic */ RemittanceAmountFormFragment write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6153x8c5b88a9(RemittanceInputFragment remittanceInputFragment, RemittanceAmountFormFragment remittanceAmountFormFragment) {
        super(1);
        this.IconCompatParcelizer = remittanceInputFragment;
        this.write = remittanceAmountFormFragment;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        CardView cardView = (CardView) obj;
        onGetStartedClick.write((Object) cardView, "$receiver");
        cardView.IconCompatParcelizer(R.id.fragment_detail, this.write, "amount_form");
        this.IconCompatParcelizer.MediaDescriptionCompat = false;
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
