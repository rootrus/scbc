package com.scb.phone.view.fragment.juristic;

import android.view.View;
import com.scb.phone.view.custom.common.ClearableOutLineEditText;
import p040o.DocumentBaseOverlayView;
import p040o.Utils;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.juristic.JuristicOnboardingLandingFragment$MediaBrowserCompat$ItemReceiver */
final class C6069x13fedb6b implements View.OnClickListener {
    private /* synthetic */ JuristicOnboardingLandingFragment MediaBrowserCompat$CustomActionResultReceiver;

    C6069x13fedb6b(JuristicOnboardingLandingFragment juristicOnboardingLandingFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = juristicOnboardingLandingFragment;
    }

    public final void onClick(View view) {
        String str;
        ClearableOutLineEditText clearableOutLineEditText = this.MediaBrowserCompat$CustomActionResultReceiver.editTextRegistrationNo;
        if (clearableOutLineEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextRegistrationNo");
        }
        String obj = clearableOutLineEditText.inputEditText.getText().toString().toString();
        ClearableOutLineEditText clearableOutLineEditText2 = this.MediaBrowserCompat$CustomActionResultReceiver.editTextPin;
        if (clearableOutLineEditText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("editTextPin");
        }
        String obj2 = clearableOutLineEditText2.inputEditText.getText().toString().toString();
        DocumentBaseOverlayView documentBaseOverlayView = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        if (documentBaseOverlayView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Utils.C39323.C12941 write = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
        if (write != null) {
            str = write.write;
        } else {
            str = null;
        }
        onGetStartedClick.write((Object) obj, "taxId");
        onGetStartedClick.write((Object) obj2, "pinInput");
        if (str == null) {
            return;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "PRE_REGISTERED")) {
            documentBaseOverlayView.write(obj, str, (String) null, obj2);
        } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "DEVICE_NOT_REGISTERED")) {
            documentBaseOverlayView.write(obj, str, obj2, (String) null);
        }
    }
}
