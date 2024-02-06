package p040o;

import p040o.AbstractMultimap;
import p040o.GoogleMap;

/* renamed from: o.access$700 */
public final class access$700 extends frequency<GoogleMap.OnCameraMoveStartedListener, access$700$MediaBrowserCompat$ItemReceiver> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public access$700(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final AbstractMultimap.WrappedSet wrappedSet) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<access$700$MediaBrowserCompat$ItemReceiver, BScanCNotificationDeepLinkActivity<GoogleMap.OnCameraMoveStartedListener>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                access$700$MediaBrowserCompat$ItemReceiver access_700_mediabrowsercompat_itemreceiver = (access$700$MediaBrowserCompat$ItemReceiver) obj;
                onGetStartedClick.write((Object) access_700_mediabrowsercompat_itemreceiver, "param");
                return wrappedSet.write(access_700_mediabrowsercompat_itemreceiver.read);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) wrappedSet, "prepaidTravelWalletDisplayRateRepositoryContractor");
    }
}
