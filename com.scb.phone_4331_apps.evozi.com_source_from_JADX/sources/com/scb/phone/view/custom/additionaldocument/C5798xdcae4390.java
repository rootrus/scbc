package com.scb.phone.view.custom.additionaldocument;

import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.Futures;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.custom.additionaldocument.DocumentsUploadedSectionCustomView$MediaBrowserCompat$CustomActionResultReceiver */
final class C5798xdcae4390 extends CheckEligibilityActivity implements FundFactSheetActivity<Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ FundFactSheetActivity read;
    private /* synthetic */ Futures.ListenableFutureAdapter.C34161.read write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5798xdcae4390(Futures.ListenableFutureAdapter.C34161.read read2, FundFactSheetActivity fundFactSheetActivity) {
        super(1);
        this.write = read2;
        this.read = fundFactSheetActivity;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        onGetStartedClick.write((Object) (Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer) obj, "it");
        this.read.invoke(this.write);
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
