package p040o;

/* renamed from: o.setFacing */
public final class setFacing extends frequency<Boolean, setFacing$MediaBrowserCompat$CustomActionResultReceiver> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setFacing(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final comparator comparator) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<setFacing$MediaBrowserCompat$CustomActionResultReceiver, BScanCNotificationDeepLinkActivity<Boolean>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                setFacing$MediaBrowserCompat$CustomActionResultReceiver setfacing_mediabrowsercompat_customactionresultreceiver = (setFacing$MediaBrowserCompat$CustomActionResultReceiver) obj;
                onGetStartedClick.write((Object) setfacing_mediabrowsercompat_customactionresultreceiver, "param");
                return comparator.MediaBrowserCompat$CustomActionResultReceiver(setfacing_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) comparator, "easycashCardInfoContractor");
    }
}
