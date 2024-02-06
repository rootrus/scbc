package p040o;

import p040o.AbstractMultimap;

/* renamed from: o.SignInOptions */
public final class SignInOptions implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_HmlBusinessOwnerETBPersonalInfoFragment> {
    private static final SignInOptions MediaBrowserCompat$ItemReceiver = new SignInOptions();

    /* renamed from: o.SignInOptions$zaa */
    public final class zaa extends any<SignInOptions$zaa$MediaBrowserCompat$ItemReceiver> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public zaa(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final AbstractMultimap.RandomAccessWrappedList randomAccessWrappedList) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<SignInOptions$zaa$MediaBrowserCompat$ItemReceiver, DebitCardCoachMarkActivity>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    SignInOptions$zaa$MediaBrowserCompat$ItemReceiver signInOptions$zaa$MediaBrowserCompat$ItemReceiver = (SignInOptions$zaa$MediaBrowserCompat$ItemReceiver) obj;
                    onGetStartedClick.write((Object) signInOptions$zaa$MediaBrowserCompat$ItemReceiver, "param");
                    RemittanceTransactionsDeepLinkActivity remittanceTransactionsDeepLinkActivity = new RemittanceTransactionsDeepLinkActivity(randomAccessWrappedList.write(signInOptions$zaa$MediaBrowserCompat$ItemReceiver.read));
                    onGetStartedClick.IconCompatParcelizer((Object) remittanceTransactionsDeepLinkActivity, "contractor.updatePrivacy….request).ignoreElement()");
                    return remittanceTransactionsDeepLinkActivity;
                }
            });
            onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
            onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
            onGetStartedClick.write((Object) randomAccessWrappedList, "contractor");
        }
    }

    /* renamed from: o.SignInOptions$Builder */
    public final class Builder implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_FundAddressDetailFragment> {
        private static final Builder read = new Builder();

        public static Builder write() {
            return read;
        }

        public final /* synthetic */ Object get() {
            return new FragmentBuilder_FundAddressDetailFragment();
        }
    }

    public static SignInOptions MediaBrowserCompat$ItemReceiver() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public final /* synthetic */ Object get() {
        return new FragmentBuilder_HmlBusinessOwnerETBPersonalInfoFragment();
    }
}
