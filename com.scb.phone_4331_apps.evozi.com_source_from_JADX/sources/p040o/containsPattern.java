package p040o;

import p040o.LocalProjectProvider;

/* renamed from: o.containsPattern */
public final class containsPattern extends frequency<getProjection, containsPattern$MediaBrowserCompat$CustomActionResultReceiver> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public containsPattern(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final LocalProjectProvider.C69386 r4) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<containsPattern$MediaBrowserCompat$CustomActionResultReceiver, BScanCNotificationDeepLinkActivity<getProjection>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                containsPattern$MediaBrowserCompat$CustomActionResultReceiver containspattern_mediabrowsercompat_customactionresultreceiver = (containsPattern$MediaBrowserCompat$CustomActionResultReceiver) obj;
                onGetStartedClick.write((Object) containspattern_mediabrowsercompat_customactionresultreceiver, "param");
                BScanCNotificationDeepLinkActivity<getProjection> read = r4.read(containspattern_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver);
                onGetStartedClick.IconCompatParcelizer((Object) read, "mEkycRepositoryContracto…mitConsent(param.request)");
                return read;
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) r4, "mEkycRepositoryContractor");
    }
}
