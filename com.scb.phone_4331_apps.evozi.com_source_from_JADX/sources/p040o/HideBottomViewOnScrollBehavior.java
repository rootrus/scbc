package p040o;

/* renamed from: o.HideBottomViewOnScrollBehavior */
public final class HideBottomViewOnScrollBehavior extends frequency<zzwe, IconCompatParcelizer> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public HideBottomViewOnScrollBehavior(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final getAncestor getancestor) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<IconCompatParcelizer, BScanCNotificationDeepLinkActivity<zzwe>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                onGetStartedClick.write((Object) iconCompatParcelizer, "it");
                int i = setBackgroundTint.read[iconCompatParcelizer.write.ordinal()];
                if (i == 1) {
                    BScanCNotificationDeepLinkActivity<zzwe> MediaMetadataCompat = getancestor.MediaMetadataCompat(iconCompatParcelizer.read);
                    onGetStartedClick.IconCompatParcelizer((Object) MediaMetadataCompat, "hmlRepository.getDocumen…WithDeepLink(it.deepLink)");
                    return MediaMetadataCompat;
                } else if (i != 2) {
                    BScanCNotificationDeepLinkActivity read = BScanCNotificationDeepLinkActivity.read(null);
                    onGetStartedClick.IconCompatParcelizer((Object) read, "Single.just(null)");
                    return read;
                } else {
                    BScanCNotificationDeepLinkActivity<zzwe> MediaMetadataCompat2 = getancestor.MediaMetadataCompat();
                    onGetStartedClick.IconCompatParcelizer((Object) MediaMetadataCompat2, "hmlRepository.documentsWithDeepLinkByList");
                    return MediaMetadataCompat2;
                }
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getancestor, "hmlRepository");
    }

    /* renamed from: o.HideBottomViewOnScrollBehavior$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements C4602xca7af99c {
        final String read;
        final VisibilityAwareImageButton write;

        public IconCompatParcelizer(String str, VisibilityAwareImageButton visibilityAwareImageButton) {
            onGetStartedClick.write((Object) str, "deepLink");
            onGetStartedClick.write((Object) visibilityAwareImageButton, "type");
            this.read = str;
            this.write = visibilityAwareImageButton;
        }
    }
}
