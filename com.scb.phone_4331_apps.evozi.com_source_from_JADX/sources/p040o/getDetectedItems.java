package p040o;

/* renamed from: o.getDetectedItems */
public final class getDetectedItems extends frequency<Boolean, getDetectedItems$MediaBrowserCompat$ItemReceiver> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getDetectedItems(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final headSet headset) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<getDetectedItems$MediaBrowserCompat$ItemReceiver, BScanCNotificationDeepLinkActivity<Boolean>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                getDetectedItems$MediaBrowserCompat$ItemReceiver getdetecteditems_mediabrowsercompat_itemreceiver = (getDetectedItems$MediaBrowserCompat$ItemReceiver) obj;
                onGetStartedClick.write((Object) getdetecteditems_mediabrowsercompat_itemreceiver, "param");
                return headset.MediaBrowserCompat$CustomActionResultReceiver(getdetecteditems_mediabrowsercompat_itemreceiver.IconCompatParcelizer);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) headset, "easycashloanFeatureInfoContractor");
    }
}
