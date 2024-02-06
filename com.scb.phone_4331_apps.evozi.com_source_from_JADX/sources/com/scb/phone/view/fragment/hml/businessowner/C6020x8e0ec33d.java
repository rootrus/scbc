package com.scb.phone.view.fragment.hml.businessowner;

import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.LookAndFeelParameters;
import p040o.UserLogoutResponse;
import p040o.onGetStartedClick;
import p040o.onUncaughtException;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

/* renamed from: com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaBrowserCompat$MediaItem */
final class C6020x8e0ec33d extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ onUncaughtException.IconCompatParcelizer read;
    private /* synthetic */ HmlBusinessOwnerSubmissionReviewStepTwoFragment write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6020x8e0ec33d(onUncaughtException.IconCompatParcelizer iconCompatParcelizer, HmlBusinessOwnerSubmissionReviewStepTwoFragment hmlBusinessOwnerSubmissionReviewStepTwoFragment) {
        super(1);
        this.read = iconCompatParcelizer;
        this.write = hmlBusinessOwnerSubmissionReviewStepTwoFragment;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        UserLogoutResponse<LookAndFeelParameters.TorchMode> userLogoutResponse = this.write.presenter;
        if (userLogoutResponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        zzfe.zza zza = this.read.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) zza, "documentType");
        userLogoutResponse.read.put(zza, booleanValue ? onUncaughtException.IconCompatParcelizer.C10756IconCompatParcelizer.ACCEPTED : onUncaughtException.IconCompatParcelizer.C10756IconCompatParcelizer.DECLINED);
        writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new UserLogoutResponse.MediaDescriptionCompat(userLogoutResponse);
        if (userLogoutResponse.RatingCompat != null) {
            mediaDescriptionCompat.IconCompatParcelizer(userLogoutResponse.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
