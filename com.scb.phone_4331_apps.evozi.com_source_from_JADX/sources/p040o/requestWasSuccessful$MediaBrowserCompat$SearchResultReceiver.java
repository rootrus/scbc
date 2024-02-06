package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.requestWasSuccessful$MediaBrowserCompat$SearchResultReceiver */
final class requestWasSuccessful$MediaBrowserCompat$SearchResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ requestWasSuccessful write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    requestWasSuccessful$MediaBrowserCompat$SearchResultReceiver(requestWasSuccessful requestwassuccessful) {
        super(1);
        this.write = requestwassuccessful;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        onGetStartedClick.write((Object) (Throwable) obj, "<anonymous parameter 0>");
        requestWasSuccessful requestwassuccessful = this.write;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C52354.MediaBrowserCompat$ItemReceiver;
        if (requestwassuccessful.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(requestwassuccessful.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
