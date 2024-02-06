package com.scb.phone.domain.interactor.emailverification;

import com.scb.phone.domain.ScbException;
import p040o.CloseAccountReviewActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.IndoorBuilding;
import p040o.ServerProjectProvider;
import p040o.tryAcquire;
import p040o.zzdy;

public final class EmailMeVerificationCodeUseCase extends IndoorBuilding {
    private ServerProjectProvider.C70695 MediaBrowserCompat$CustomActionResultReceiver;

    public static class EmailVerificationCodeNotSendException extends ScbException {
    }

    @HmlPinActivity
    public EmailMeVerificationCodeUseCase(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, ServerProjectProvider.C70695 r3) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.MediaBrowserCompat$CustomActionResultReceiver = r3;
    }

    public final DebitCardResetOtpActivity<zzdy.zzb> MediaBrowserCompat$ItemReceiver() {
        return write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().onErrorResumeNext(tryAcquire.read));
    }
}
