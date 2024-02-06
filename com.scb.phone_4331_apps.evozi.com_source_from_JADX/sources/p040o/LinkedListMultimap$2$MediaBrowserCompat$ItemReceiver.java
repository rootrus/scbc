package p040o;

/* renamed from: o.LinkedListMultimap$2$MediaBrowserCompat$ItemReceiver */
public final class LinkedListMultimap$2$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ FundActionsSuccessActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ FundFactSheetActivity read;

    public LinkedListMultimap$2$MediaBrowserCompat$ItemReceiver(FundFactSheetActivity fundFactSheetActivity, FundActionsSuccessActivity fundActionsSuccessActivity) {
        this.read = fundFactSheetActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = fundActionsSuccessActivity;
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        this.read.invoke(th);
    }

    public final void onComplete() {
        super.onComplete();
        this.MediaBrowserCompat$CustomActionResultReceiver.invoke();
    }
}
