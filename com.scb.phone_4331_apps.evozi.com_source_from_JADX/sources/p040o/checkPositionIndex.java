package p040o;

/* renamed from: o.checkPositionIndex */
public final class checkPositionIndex extends frequency<onCameraIdle, checkPositionIndex$MediaBrowserCompat$ItemReceiver> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public checkPositionIndex(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final getDelegateListIterator getdelegatelistiterator) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<checkPositionIndex$MediaBrowserCompat$ItemReceiver, BScanCNotificationDeepLinkActivity<onCameraIdle>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                checkPositionIndex$MediaBrowserCompat$ItemReceiver checkpositionindex_mediabrowsercompat_itemreceiver = (checkPositionIndex$MediaBrowserCompat$ItemReceiver) obj;
                onGetStartedClick.write((Object) checkpositionindex_mediabrowsercompat_itemreceiver, "param");
                return getdelegatelistiterator.write(checkpositionindex_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getdelegatelistiterator, "prepaidRequestRepositoryContractor");
    }
}
