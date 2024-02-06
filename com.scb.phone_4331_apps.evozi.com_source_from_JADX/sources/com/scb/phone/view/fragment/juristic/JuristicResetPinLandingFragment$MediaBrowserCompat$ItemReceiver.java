package com.scb.phone.view.fragment.juristic;

import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomEditText;
import p040o.onGetStartedClick;

final class JuristicResetPinLandingFragment$MediaBrowserCompat$ItemReceiver implements CustomEditText.write {
    private /* synthetic */ JuristicResetPinLandingFragment MediaBrowserCompat$CustomActionResultReceiver;

    JuristicResetPinLandingFragment$MediaBrowserCompat$ItemReceiver(JuristicResetPinLandingFragment juristicResetPinLandingFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = juristicResetPinLandingFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CommonInputViewGroup commonInputViewGroup = this.MediaBrowserCompat$CustomActionResultReceiver.ivgJuristicAccount;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
        }
        commonInputViewGroup.clearFocus();
    }
}
