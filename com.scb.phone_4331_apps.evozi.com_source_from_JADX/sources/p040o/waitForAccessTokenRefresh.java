package p040o;

import java.util.List;
import p040o.AbstractMultimap;

/* renamed from: o.waitForAccessTokenRefresh */
public final class waitForAccessTokenRefresh extends frequency<List<? extends setJointType>, waitForAccessTokenRefresh$MediaBrowserCompat$ItemReceiver> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public waitForAccessTokenRefresh(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final AbstractMultimap.RandomAccessWrappedList randomAccessWrappedList) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<waitForAccessTokenRefresh$MediaBrowserCompat$ItemReceiver, BScanCNotificationDeepLinkActivity<List<? extends setJointType>>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                waitForAccessTokenRefresh$MediaBrowserCompat$ItemReceiver waitforaccesstokenrefresh_mediabrowsercompat_itemreceiver = (waitForAccessTokenRefresh$MediaBrowserCompat$ItemReceiver) obj;
                onGetStartedClick.write((Object) waitforaccesstokenrefresh_mediabrowsercompat_itemreceiver, "param");
                return randomAccessWrappedList.read(waitforaccesstokenrefresh_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) randomAccessWrappedList, "mCSentRepositoryContractor");
    }
}
