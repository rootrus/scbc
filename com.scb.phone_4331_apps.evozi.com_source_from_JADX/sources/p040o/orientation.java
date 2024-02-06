package p040o;

import p040o.OnDeviceIdExtractor;

/* renamed from: o.orientation */
public final class orientation extends IndoorBuilding {
    private final OnDeviceIdExtractor.C6966a MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public orientation(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, OnDeviceIdExtractor.C6966a aVar) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) aVar, "googleSigninContractor");
        this.MediaBrowserCompat$CustomActionResultReceiver = aVar;
    }

    public final DebitCardResetOtpActivity<Object> MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "authToken");
        onGetStartedClick.write((Object) str2, "clientId");
        DebitCardResetOtpActivity<Object> write = write(this.MediaBrowserCompat$CustomActionResultReceiver.read(str, str2));
        onGetStartedClick.IconCompatParcelizer((Object) write, "withObservable(googleSig…nin(authToken, clientId))");
        return write;
    }
}
