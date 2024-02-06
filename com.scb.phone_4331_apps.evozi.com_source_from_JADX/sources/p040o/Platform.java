package p040o;

import p040o.GoogleMap;

/* renamed from: o.Platform */
public final class Platform extends frequency<GoogleMap.CancelableCallback, Platform$MediaBrowserCompat$ItemReceiver> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public Platform(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final getListDelegate getlistdelegate) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<Platform$MediaBrowserCompat$ItemReceiver, BScanCNotificationDeepLinkActivity<GoogleMap.CancelableCallback>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                Platform$MediaBrowserCompat$ItemReceiver platform$MediaBrowserCompat$ItemReceiver = (Platform$MediaBrowserCompat$ItemReceiver) obj;
                onGetStartedClick.write((Object) platform$MediaBrowserCompat$ItemReceiver, "param");
                return getlistdelegate.read(platform$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, platform$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, platform$MediaBrowserCompat$ItemReceiver.write);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getlistdelegate, "prepaidActivationRepositoryContractor");
    }
}
