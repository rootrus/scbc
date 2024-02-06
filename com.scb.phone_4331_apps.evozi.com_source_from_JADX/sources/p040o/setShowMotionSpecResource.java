package p040o;

/* renamed from: o.setShowMotionSpecResource */
public final class setShowMotionSpecResource extends IndoorBuilding {
    final getAncestor read;

    /* renamed from: o.setShowMotionSpecResource$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, BillerDeepLinkActivity<? extends R>> {
        private /* synthetic */ setShowMotionSpecResource IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(setShowMotionSpecResource setshowmotionspecresource, String str, String str2) {
            this.IconCompatParcelizer = setshowmotionspecresource;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
        }

        public final /* synthetic */ Object write(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "it");
            return this.IconCompatParcelizer.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, "BRANCH", str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setShowMotionSpecResource(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getancestor, "hmlRepositoryContractor");
        this.read = getancestor;
    }

    public final DebitCardResetOtpActivity<moveCamera> IconCompatParcelizer(String str, String str2) {
        onGetStartedClick.write((Object) str, "otp");
        onGetStartedClick.write((Object) str2, "tokenUuid");
        BScanCNotificationDeepLinkActivity<String> IconCompatParcelizer2 = this.read.IconCompatParcelizer();
        DirectDebitDeepLinkActivity iconCompatParcelizer = new IconCompatParcelizer(this, str, str2);
        HmlLatestPersonalInformationDeepLinkActivity.write(iconCompatParcelizer, "mapper is null");
        FriendsLandingActivity_ViewBinding friendsLandingActivity_ViewBinding = new FriendsLandingActivity_ViewBinding(new ReviewDeviceActivity(IconCompatParcelizer2, iconCompatParcelizer));
        write(friendsLandingActivity_ViewBinding);
        onGetStartedClick.IconCompatParcelizer((Object) friendsLandingActivity_ViewBinding, "hmlRepositoryContractor.…so { withObservable(it) }");
        return friendsLandingActivity_ViewBinding;
    }
}
