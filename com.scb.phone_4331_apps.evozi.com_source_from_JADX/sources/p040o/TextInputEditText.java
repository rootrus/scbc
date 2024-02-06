package p040o;

/* renamed from: o.TextInputEditText */
public final class TextInputEditText extends frequency<setIvAvatar, TextInputEditText$MediaBrowserCompat$ItemReceiver> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public TextInputEditText(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final LocalProjectProvider_Factory localProjectProvider_Factory) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<TextInputEditText$MediaBrowserCompat$ItemReceiver, BScanCNotificationDeepLinkActivity<setIvAvatar>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                onGetStartedClick.write((Object) (TextInputEditText$MediaBrowserCompat$ItemReceiver) obj, "it");
                return localProjectProvider_Factory.write();
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) localProjectProvider_Factory, "fundDiscoverRepositoryContractor");
    }
}
