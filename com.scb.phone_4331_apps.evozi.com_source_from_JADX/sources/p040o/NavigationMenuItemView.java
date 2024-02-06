package p040o;

import com.google.android.gms.common.Scopes;

/* renamed from: o.NavigationMenuItemView */
public final class NavigationMenuItemView extends IndoorBuilding {
    final getAncestor IconCompatParcelizer;
    final refreshIfEmpty write;

    /* renamed from: o.NavigationMenuItemView$read */
    static final class read<T, R> implements DirectDebitDeepLinkActivity<String, DebitCardProductCatalogActivity> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ NavigationMenuItemView read;
        private /* synthetic */ String write;

        read(NavigationMenuItemView navigationMenuItemView, String str, String str2, String str3) {
            this.read = navigationMenuItemView;
            this.IconCompatParcelizer = str;
            this.write = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        }

        public final /* synthetic */ Object write(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "applicationUuid");
            return this.read.write.MediaBrowserCompat$CustomActionResultReceiver(str, this.IconCompatParcelizer, this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public NavigationMenuItemView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor, refreshIfEmpty refreshifempty) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getancestor, "hmlRepositoryContractor");
        onGetStartedClick.write((Object) refreshifempty, "hmlBusinessOwnerRepositoryContractor");
        this.IconCompatParcelizer = getancestor;
        this.write = refreshifempty;
    }

    public final DebitCardResetOtpActivity<HmlVerifyPhoneValidateOtpActivity> write(String str, String str2, String str3) {
        FriendsLandingActivity friendsLandingActivity;
        onGetStartedClick.write((Object) str, Scopes.EMAIL);
        onGetStartedClick.write((Object) str2, "uuid");
        onGetStartedClick.write((Object) str3, "otp");
        if (setNeedsEmptyIcon.write[this.write.MediaBrowserCompat$SearchResultReceiver().ordinal()] != 1) {
            BScanCNotificationDeepLinkActivity<String> IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer();
            DirectDebitDeepLinkActivity navigationMenuItemView$MediaBrowserCompat$CustomActionResultReceiver = new C9789xb4bf7c78(this, str, str2, str3);
            HmlLatestPersonalInformationDeepLinkActivity.write(navigationMenuItemView$MediaBrowserCompat$CustomActionResultReceiver, "mapper is null");
            friendsLandingActivity = new FriendsLandingActivity(IconCompatParcelizer2, navigationMenuItemView$MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            BScanCNotificationDeepLinkActivity<String> IconCompatParcelizer3 = this.IconCompatParcelizer.IconCompatParcelizer();
            DirectDebitDeepLinkActivity read2 = new read(this, str, str2, str3);
            HmlLatestPersonalInformationDeepLinkActivity.write(read2, "mapper is null");
            friendsLandingActivity = new FriendsLandingActivity(IconCompatParcelizer3, read2);
        }
        RtpInputDeepLinkActivity rtpInputDeepLinkActivity = new RtpInputDeepLinkActivity(friendsLandingActivity);
        write(rtpInputDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) rtpInputDeepLinkActivity, "when (hmlBusinessOwnerRe…so { withObservable(it) }");
        return rtpInputDeepLinkActivity;
    }
}
