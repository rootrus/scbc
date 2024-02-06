package com.scb.phone.view.fragment.juristic;

import android.view.View;
import p040o.FixedAspectRatioCaptureExperience_MembersInjector;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.juristic.JuristicResetPinLandingFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6074xb4a24891 implements View.OnFocusChangeListener {
    private /* synthetic */ JuristicResetPinLandingFragment IconCompatParcelizer;

    C6074xb4a24891(JuristicResetPinLandingFragment juristicResetPinLandingFragment) {
        this.IconCompatParcelizer = juristicResetPinLandingFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector = this.IconCompatParcelizer.presenter;
            if (fixedAspectRatioCaptureExperience_MembersInjector == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new FixedAspectRatioCaptureExperience_MembersInjector.IconCompatParcelizer(fixedAspectRatioCaptureExperience_MembersInjector);
            if (fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat);
            }
        }
    }
}
