package com.scb.phone.view.fragment.hml.businessowner;

import android.widget.CompoundButton;
import p040o.LookAndFeelParameters;
import p040o.UserLogoutResponse;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaBrowserCompat$SearchResultReceiver */
final class C6021xcb20ab0e implements CompoundButton.OnCheckedChangeListener {
    private /* synthetic */ HmlBusinessOwnerSubmissionReviewStepTwoFragment MediaBrowserCompat$ItemReceiver;

    C6021xcb20ab0e(HmlBusinessOwnerSubmissionReviewStepTwoFragment hmlBusinessOwnerSubmissionReviewStepTwoFragment) {
        this.MediaBrowserCompat$ItemReceiver = hmlBusinessOwnerSubmissionReviewStepTwoFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        UserLogoutResponse<LookAndFeelParameters.TorchMode> userLogoutResponse = this.MediaBrowserCompat$ItemReceiver.presenter;
        if (userLogoutResponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        userLogoutResponse.MediaBrowserCompat$ItemReceiver = z;
        writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new UserLogoutResponse.MediaDescriptionCompat(userLogoutResponse);
        if (userLogoutResponse.RatingCompat != null) {
            mediaDescriptionCompat.IconCompatParcelizer(userLogoutResponse.RatingCompat);
        }
    }
}
