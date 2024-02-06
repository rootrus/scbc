package com.scb.phone.domain.interactor.emailverification;

import com.scb.phone.domain.ScbException;
import com.scb.phone.domain.errors.RetrofitException;
import p040o.CloseAccountReviewActivity;
import p040o.Contour;
import p040o.DebitCardResetOtpActivity;
import p040o.DebitCardResetPinSuccessActivity_ViewBinding;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.ImmutableListMultimap;
import p040o.IndoorBuilding;
import p040o.getEulerZ;
import p040o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver;
import p040o.zzbc;

public class UpdateEmailUseCase extends IndoorBuilding {
    private getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    public static class Error1047 extends ScbException {
    }

    public static class Error3000 extends ScbException {
    }

    @HmlPinActivity
    public UpdateEmailUseCase(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.MediaBrowserCompat$CustomActionResultReceiver = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
    }

    public final DebitCardResetOtpActivity<zzbc.zzf> read(String str) {
        ImmutableListMultimap.Builder builder = new ImmutableListMultimap.Builder();
        builder.IconCompatParcelizer = str;
        return write(this.MediaBrowserCompat$CustomActionResultReceiver.write(builder).onErrorResumeNext(getEulerZ.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public static /* synthetic */ DebitCardResetPinSuccessActivity_ViewBinding read(Throwable th) throws Exception {
        if (th instanceof RetrofitException) {
            String str = ((RetrofitException) th).IconCompatParcelizer.write.IconCompatParcelizer;
            if ("1047".equals(str)) {
                return DebitCardResetOtpActivity.error((Throwable) new Error1047());
            }
            if ("3000".equals(str)) {
                return DebitCardResetOtpActivity.error((Throwable) new Error3000());
            }
        }
        return DebitCardResetOtpActivity.error(th);
    }

    public final DebitCardResetOtpActivity<Boolean> read() {
        return write(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer().onErrorResumeNext(Contour.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public static /* synthetic */ DebitCardResetPinSuccessActivity_ViewBinding MediaBrowserCompat$ItemReceiver(Throwable th) throws Exception {
        String str;
        if (th instanceof RetrofitException) {
            RetrofitException retrofitException = (RetrofitException) th;
            if (retrofitException == null || retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null) {
                str = "";
            } else {
                str = retrofitException.IconCompatParcelizer.write.IconCompatParcelizer;
            }
            if ("1047".equals(str)) {
                return DebitCardResetOtpActivity.error((Throwable) new Error1047());
            }
            if ("3000".equals(str)) {
                return DebitCardResetOtpActivity.error((Throwable) new Error3000());
            }
        }
        return DebitCardResetOtpActivity.error(th);
    }
}
