package com.scb.phone.view.fragment.juristic;

import android.text.Editable;
import android.text.TextWatcher;
import com.scb.phone.view.custom.common.ClearableOutLineEditText;
import p040o.DocumentBaseOverlayView;
import p040o.onGetStartedClick;

public final class JuristicOnboardingLandingFragment$MediaBrowserCompat$MediaItem implements TextWatcher {
    private /* synthetic */ JuristicOnboardingLandingFragment MediaBrowserCompat$CustomActionResultReceiver;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    JuristicOnboardingLandingFragment$MediaBrowserCompat$MediaItem(JuristicOnboardingLandingFragment juristicOnboardingLandingFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = juristicOnboardingLandingFragment;
    }

    public final void afterTextChanged(Editable editable) {
        DocumentBaseOverlayView documentBaseOverlayView = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        if (documentBaseOverlayView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String valueOf = String.valueOf(editable);
        ClearableOutLineEditText clearableOutLineEditText = this.MediaBrowserCompat$CustomActionResultReceiver.editTextPin;
        if (clearableOutLineEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
        }
        documentBaseOverlayView.IconCompatParcelizer(valueOf, clearableOutLineEditText.IconCompatParcelizer);
    }
}
