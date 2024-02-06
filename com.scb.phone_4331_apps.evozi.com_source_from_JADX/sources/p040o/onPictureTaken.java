package p040o;

import p040o.CustomConcurrentHashMap;
import p040o.LocalProjectProvider;

/* renamed from: o.onPictureTaken */
public final class onPictureTaken extends IndoorBuilding {
    private final LocalProjectProvider.C69375 MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public onPictureTaken(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r4) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) r4, "easycashRepositoryContractor");
        this.MediaBrowserCompat$CustomActionResultReceiver = r4;
    }

    public final DebitCardResetOtpActivity<Object> read(CustomConcurrentHashMap.EntryFactory.C32913 r2) {
        onGetStartedClick.write((Object) r2, "request");
        return write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(r2));
    }

    public final DebitCardResetOtpActivity<?> write() {
        DebitCardResetOtpActivity<?> write = write(this.MediaBrowserCompat$CustomActionResultReceiver.read());
        onGetStartedClick.IconCompatParcelizer((Object) write, "withObservable(easycashR…actor.creditPowerLanding)");
        return write;
    }
}
