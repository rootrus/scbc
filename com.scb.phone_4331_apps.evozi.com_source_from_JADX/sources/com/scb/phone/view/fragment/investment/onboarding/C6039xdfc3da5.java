package com.scb.phone.view.fragment.investment.onboarding;

import android.content.DialogInterface;
import p040o.FragmentBuilder_BindCalendarDialogFragment;

/* renamed from: com.scb.phone.view.fragment.investment.onboarding.FundOnboardingTermsAndConditionsFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6039xdfc3da5 implements DialogInterface.OnClickListener {
    private /* synthetic */ FundOnboardingTermsAndConditionsFragment write;

    C6039xdfc3da5(FundOnboardingTermsAndConditionsFragment fundOnboardingTermsAndConditionsFragment) {
        this.write = fundOnboardingTermsAndConditionsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        FragmentBuilder_BindCalendarDialogFragment read = this.write.IconCompatParcelizer;
        if (read != null) {
            read.setOverlayMode();
        }
    }
}
