package com.scb.phone.view.activity.registration;

import java.io.Serializable;
import kotlin.TypeCastException;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.mB$MediaBrowserCompat$ItemReceiver;

final class RegistrationTermsAndConsActivity$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundActionsSuccessActivity<mB$MediaBrowserCompat$ItemReceiver> {
    private /* synthetic */ RegistrationTermsAndConsActivity read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RegistrationTermsAndConsActivity$MediaBrowserCompat$ItemReceiver(RegistrationTermsAndConsActivity registrationTermsAndConsActivity) {
        super(0);
        this.read = registrationTermsAndConsActivity;
    }

    public final /* synthetic */ Object invoke() {
        Serializable serializableExtra = this.read.getIntent().getSerializableExtra("FLOW_TYPE");
        if (serializableExtra != null) {
            return (mB$MediaBrowserCompat$ItemReceiver) serializableExtra;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.presenter.registration.RegistrationTermsAndConsPresenter.FlowType");
    }
}
