package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.is */
public final class C4809is extends frequency<PlaceFilter, getLastInNonemptyList$MediaBrowserCompat$ItemReceiver> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4809is(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final AbstractMultimap.WrappedList wrappedList) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<getLastInNonemptyList$MediaBrowserCompat$ItemReceiver, BScanCNotificationDeepLinkActivity<PlaceFilter>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                onGetStartedClick.write((Object) (getLastInNonemptyList$MediaBrowserCompat$ItemReceiver) obj, "it");
                BScanCNotificationDeepLinkActivity<PlaceFilter> singleOrError = wrappedList.read().singleOrError();
                onGetStartedClick.IconCompatParcelizer((Object) singleOrError, "repository.insightsHeader().singleOrError()");
                return singleOrError;
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) wrappedList, "repository");
    }
}
