package p040o;

import p040o.LatLngBounds;

/* renamed from: o.NavigationMenuView */
public final class NavigationMenuView extends LatLngBounds.Builder {
    final ProjectProviderException MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.NavigationMenuView$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ NavigationMenuView read;

        write(NavigationMenuView navigationMenuView, String str) {
            this.read = navigationMenuView;
            this.IconCompatParcelizer = str;
        }

        public final /* synthetic */ Object write(Object obj) {
            PlaceBuffer placeBuffer = (PlaceBuffer) obj;
            onGetStartedClick.write((Object) placeBuffer, "it");
            NavigationMenuView navigationMenuView = this.read;
            String str = this.IconCompatParcelizer;
            String str2 = placeBuffer.read;
            onGetStartedClick.IconCompatParcelizer((Object) str2, "it.e2eeSid");
            ProjectProviderException projectProviderException = navigationMenuView.MediaBrowserCompat$ItemReceiver;
            String write = navigationMenuView.write(str);
            onGetStartedClick.IconCompatParcelizer((Object) write, "encrypt(pin)");
            DebitCardCoachMarkActivity write2 = projectProviderException.write(write, str2);
            if (write2 instanceof HmlLatestLoanOfferStatusDeepLinkActivity) {
                return ((HmlLatestLoanOfferStatusDeepLinkActivity) write2).MediaBrowserCompat$CustomActionResultReceiver();
            }
            return new RtpInputDeepLinkActivity(write2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public NavigationMenuView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, C7514tY tYVar, ProjectProviderException projectProviderException) {
        super(tYVar, closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) tYVar, "sprintRepositoryContractor");
        onGetStartedClick.write((Object) projectProviderException, "pinRepository");
        this.MediaBrowserCompat$ItemReceiver = projectProviderException;
    }

    public final DebitCardResetOtpActivity<HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "pin");
        DebitCardResetOtpActivity<R> flatMap = this.IconCompatParcelizer.read(new findSubsetIndex("10XMB")).flatMap(new write(this, str));
        write(flatMap);
        onGetStartedClick.IconCompatParcelizer((Object) flatMap, "iSprintRepositoryContrac…so { withObservable(it) }");
        return flatMap;
    }
}
