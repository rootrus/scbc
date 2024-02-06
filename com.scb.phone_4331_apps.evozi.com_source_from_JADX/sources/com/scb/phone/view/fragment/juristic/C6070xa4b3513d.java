package com.scb.phone.view.fragment.juristic;

import com.scb.phone.view.custom.common.ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.custom.common.ClearableOutLineEditText;
import p040o.DocumentBaseOverlayView;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.juristic.JuristicOnboardingLandingFragment$MediaBrowserCompat$SearchResultReceiver */
final class C6070xa4b3513d implements ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver {
    private /* synthetic */ JuristicOnboardingLandingFragment read;

    C6070xa4b3513d(JuristicOnboardingLandingFragment juristicOnboardingLandingFragment) {
        this.read = juristicOnboardingLandingFragment;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(String str) {
        DocumentBaseOverlayView documentBaseOverlayView = this.read.presenter;
        if (documentBaseOverlayView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ClearableOutLineEditText clearableOutLineEditText = this.read.editTextRegistrationNo;
        if (clearableOutLineEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextRegistrationNo");
        }
        String obj = clearableOutLineEditText.inputEditText.getText().toString().toString();
        ClearableOutLineEditText clearableOutLineEditText2 = this.read.editTextRegistrationNo;
        if (clearableOutLineEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextRegistrationNo");
        }
        return documentBaseOverlayView.MediaBrowserCompat$ItemReceiver(obj, clearableOutLineEditText2.IconCompatParcelizer);
    }
}
