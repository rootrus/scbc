package p040o;

/* renamed from: o.Text */
public final class Text extends IndoorBuilding {
    final refreshIfEmpty MediaBrowserCompat$ItemReceiver;
    final getAncestor read;

    /* renamed from: o.Text$read */
    static final class read<T, R> implements DirectDebitDeepLinkActivity<String, DebitCardProductCatalogActivity> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ String read;
        private /* synthetic */ Text write;

        read(Text text, String str, String str2) {
            this.write = text;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.read = str2;
        }

        public final /* synthetic */ Object write(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "applicationUuid");
            refreshIfEmpty refreshifempty = this.write.MediaBrowserCompat$ItemReceiver;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str3 = this.read;
            if (str3 == null) {
                str3 = "";
            }
            return refreshifempty.MediaBrowserCompat$ItemReceiver(str, str2, str3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public Text(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor, refreshIfEmpty refreshifempty) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getancestor, "hmlRepositoryContractor");
        onGetStartedClick.write((Object) refreshifempty, "hmlBusinessOwnerRepositoryContractor");
        this.read = getancestor;
        this.MediaBrowserCompat$ItemReceiver = refreshifempty;
    }

    public final DebitCardResetOtpActivity<HmlVerifyPhoneValidateOtpActivity> read(String str, String str2) {
        FriendsLandingActivity friendsLandingActivity;
        onGetStartedClick.write((Object) str, "receivingAccount");
        if (TextBlock.MediaBrowserCompat$CustomActionResultReceiver[this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver().ordinal()] != 1) {
            BScanCNotificationDeepLinkActivity<String> IconCompatParcelizer = this.read.IconCompatParcelizer();
            DirectDebitDeepLinkActivity text$MediaBrowserCompat$CustomActionResultReceiver = new Text$MediaBrowserCompat$CustomActionResultReceiver(this, str, str2);
            HmlLatestPersonalInformationDeepLinkActivity.write(text$MediaBrowserCompat$CustomActionResultReceiver, "mapper is null");
            friendsLandingActivity = new FriendsLandingActivity(IconCompatParcelizer, text$MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            BScanCNotificationDeepLinkActivity<String> IconCompatParcelizer2 = this.read.IconCompatParcelizer();
            DirectDebitDeepLinkActivity read2 = new read(this, str, str2);
            HmlLatestPersonalInformationDeepLinkActivity.write(read2, "mapper is null");
            friendsLandingActivity = new FriendsLandingActivity(IconCompatParcelizer2, read2);
        }
        DebitCardProductCatalogActivity backgroundResource = this.read.setBackgroundResource(str);
        HmlLatestPersonalInformationDeepLinkActivity.write(backgroundResource, "next is null");
        PayNowTransactionsDeepLinkActivity payNowTransactionsDeepLinkActivity = new PayNowTransactionsDeepLinkActivity(friendsLandingActivity, backgroundResource);
        DebitCardProductCatalogActivity contentView = this.read.setContentView(str2);
        HmlLatestPersonalInformationDeepLinkActivity.write(contentView, "next is null");
        RtpInputDeepLinkActivity rtpInputDeepLinkActivity = new RtpInputDeepLinkActivity(new PayNowTransactionsDeepLinkActivity(payNowTransactionsDeepLinkActivity, contentView));
        write(rtpInputDeepLinkActivity);
        onGetStartedClick.IconCompatParcelizer((Object) rtpInputDeepLinkActivity, "when (hmlBusinessOwnerRe…so { withObservable(it) }");
        return rtpInputDeepLinkActivity;
    }
}
