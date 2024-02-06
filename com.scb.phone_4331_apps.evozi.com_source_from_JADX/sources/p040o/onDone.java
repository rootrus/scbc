package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.onDone */
public final class onDone extends frequency<Boolean, onDone$MediaBrowserCompat$ItemReceiver> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public onDone(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final AbstractMultimap.SortedKeySet sortedKeySet) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<onDone$MediaBrowserCompat$ItemReceiver, BScanCNotificationDeepLinkActivity<Boolean>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                onDone$MediaBrowserCompat$ItemReceiver ondone_mediabrowsercompat_itemreceiver = (onDone$MediaBrowserCompat$ItemReceiver) obj;
                onGetStartedClick.write((Object) ondone_mediabrowsercompat_itemreceiver, "param");
                return sortedKeySet.MediaBrowserCompat$ItemReceiver(ondone_mediabrowsercompat_itemreceiver.read);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) sortedKeySet, "easycashFeatureAccountRepositoryContractor");
    }
}
