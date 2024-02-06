package com.scb.phone.view.fragment.easycash.financialinformation;

import android.content.Context;
import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.easycash.financialinformation.EasycashBusinessAndMaritalInfoFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5926xe9c620fd extends CheckEligibilityActivity implements FundActionsSuccessActivity<DurationEmploymentForBusinessDialog> {
    private /* synthetic */ EasycashBusinessAndMaritalInfoFragment MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5926xe9c620fd(EasycashBusinessAndMaritalInfoFragment easycashBusinessAndMaritalInfoFragment) {
        super(0);
        this.MediaBrowserCompat$ItemReceiver = easycashBusinessAndMaritalInfoFragment;
    }

    public final /* synthetic */ Object invoke() {
        Context requireContext = this.MediaBrowserCompat$ItemReceiver.requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        return new DurationEmploymentForBusinessDialog(requireContext);
    }
}
