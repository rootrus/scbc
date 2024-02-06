package com.scb.phone.view.fragment.ccsof;

import android.widget.Button;
import android.widget.CompoundButton;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.ccsof.CcSofReviewFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C5888xc033ee5f implements CompoundButton.OnCheckedChangeListener {
    private /* synthetic */ CcSofReviewFragment read;

    C5888xc033ee5f(CcSofReviewFragment ccSofReviewFragment) {
        this.read = ccSofReviewFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Button button = this.read.confirmButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("confirmButton");
        }
        button.setEnabled(z);
    }
}
