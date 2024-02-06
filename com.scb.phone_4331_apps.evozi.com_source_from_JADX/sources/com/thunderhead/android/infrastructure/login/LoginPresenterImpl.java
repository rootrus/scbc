package com.thunderhead.android.infrastructure.login;

import com.google.android.gms.analytics.ecommerce.Promotion;
import com.thunderhead.android.domain.authentication.ClientCredentials;
import com.thunderhead.android.infrastructure.p057ui.mvp.BasePresenter;
import p040o.C6566x26069d33;
import p040o.C6874x87d095dd;
import p040o.C7322x2fdbba73;
import p040o.CheckEligibilityActivity;
import p040o.CheckEligibilityActivity_ViewBinding;
import p040o.EasycashBusinessAndMaritalInfoCaseModule;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlOperatingBankFragment;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.FragmentBuilder_BindMyFundsFragment;
import p040o.FragmentBuilder_BindOnboardingInputAddressFragment;
import p040o.FragmentBuilder_HmlBusinessOwnerSubmissionReviewStep2Fragment;
import p040o.FragmentBuilder_MutualFundAddressMainFragment;
import p040o.FragmentBuilder_MutualFundPersonalInfoFragment;
import p040o.FundAppFormActivity_ViewBinding;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.FundPurchaseReviewActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.HomeActivity_ViewBinding;
import p040o.MwBusinessDetailsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnBoardingTutorialActivity;
import p040o.ReviewSuccessfulActivity;
import p040o.clickNext;
import p040o.onGetStartedClick;
import p040o.onNextTutorialButtonClick;
import p040o.onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver;

public final class LoginPresenterImpl extends BasePresenter<FragmentBuilder_MutualFundPersonalInfoFragment> implements FragmentBuilder_MutualFundAddressMainFragment {
    static final /* synthetic */ clickNext[] $$delegatedProperties;
    private final ReviewSuccessfulActivity<ClientCredentials> clientCredentials;
    private final FundPurchaseReviewActivity hasInternet$delegate = new onNextTutorialButtonClick.IconCompatParcelizer(this.store, EasycashBusinessAndMaritalInfoCaseModule.MediaBrowserCompat$ItemReceiver());
    private final ReviewSuccessfulActivity<Boolean> isLoading;
    private final ReviewSuccessfulActivity<Boolean> isOpen;
    private final ReviewSuccessfulActivity<HmlVerifyEmailSuccessfulActivity<Integer, Throwable>> loginError;
    private final ReviewSuccessfulActivity<Boolean> rememberMe;
    private final FundPurchaseReviewActivity siteKey$delegate = new onNextTutorialButtonClick.IconCompatParcelizer(this.store, FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$ItemReceiver());
    private final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> store;
    private final FundPurchaseReviewActivity thinstance$delegate = new onNextTutorialButtonClick.IconCompatParcelizer(this.store, FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$MediaItem());

    static {
        Class<LoginPresenterImpl> cls = LoginPresenterImpl.class;
        $$delegatedProperties = new clickNext[]{FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write((Class) cls), "siteKey", "getSiteKey()Lcom/thunderhead/android/infrastructure/state/connect/ConnectedStateProperty;")), FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write((Class) cls), "hasInternet", "getHasInternet()Lcom/thunderhead/android/infrastructure/state/connect/ConnectedStateProperty;")), FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write((Class) cls), "thinstance", "getThinstance()Lcom/thunderhead/android/infrastructure/state/connect/ConnectedStateProperty;"))};
    }

    private final HomeActivity_ViewBinding<Boolean> getHasInternet() {
        return (HomeActivity_ViewBinding) this.hasInternet$delegate.MediaBrowserCompat$ItemReceiver($$delegatedProperties[1]);
    }

    private final HomeActivity_ViewBinding<String> getSiteKey() {
        return (HomeActivity_ViewBinding) this.siteKey$delegate.MediaBrowserCompat$ItemReceiver($$delegatedProperties[0]);
    }

    private final HomeActivity_ViewBinding<FragmentBuilder_BindHmlOperatingBankFragment> getThinstance() {
        return (HomeActivity_ViewBinding) this.thinstance$delegate.MediaBrowserCompat$ItemReceiver($$delegatedProperties[2]);
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<ClientCredentials, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ LoginPresenterImpl read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(LoginPresenterImpl loginPresenterImpl) {
            super(1);
            this.read = loginPresenterImpl;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_MutualFundPersonalInfoFragment access$getView$p;
            ClientCredentials clientCredentials = (ClientCredentials) obj;
            if (!(clientCredentials == null || (access$getView$p = LoginPresenterImpl.access$getView$p(this.read)) == null)) {
                access$getView$p.read(clientCredentials);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ LoginPresenterImpl MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(LoginPresenterImpl loginPresenterImpl) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = loginPresenterImpl;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                FragmentBuilder_MutualFundPersonalInfoFragment access$getView$p = LoginPresenterImpl.access$getView$p(this.MediaBrowserCompat$ItemReceiver);
                if (access$getView$p != null) {
                    access$getView$p.MediaBrowserCompat$ItemReceiver(booleanValue);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ LoginPresenterImpl read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(LoginPresenterImpl loginPresenterImpl) {
            super(1);
            this.read = loginPresenterImpl;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_MutualFundPersonalInfoFragment access$getView$p;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj, (Object) Boolean.FALSE) && (access$getView$p = LoginPresenterImpl.access$getView$p(this.read)) != null) {
                access$getView$p.MediaDescriptionCompat();
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ FragmentBuilder_MutualFundPersonalInfoFragment access$getView$p(LoginPresenterImpl loginPresenterImpl) {
        return (FragmentBuilder_MutualFundPersonalInfoFragment) loginPresenterImpl.getView();
    }

    public LoginPresenterImpl(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment, "store");
        this.store = fragmentBuilder_BindJuristicOnboardingLandingFragment;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment), FragmentBuilder_BindMyFundsFragment.MediaDescriptionCompat());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver, "$this$distinct");
        this.rememberMe = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver).read(new LoginPresenterImpl$MediaBrowserCompat$CustomActionResultReceiver(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment2 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment2, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver2 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment2), FragmentBuilder_HmlBusinessOwnerSubmissionReviewStep2Fragment.MediaBrowserCompat$ItemReceiver());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver2, "$this$distinct");
        this.isLoading = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver2).read(new read(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment3 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment3, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver3 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment3), FragmentBuilder_HmlBusinessOwnerSubmissionReviewStep2Fragment.IconCompatParcelizer());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver3, "$this$distinct");
        this.isOpen = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver3).read(new write(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment4 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment4, "$this$connectObservable");
        this.loginError = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment4), FragmentBuilder_HmlBusinessOwnerSubmissionReviewStep2Fragment.read()).read(new LoginPresenterImpl$MediaBrowserCompat$ItemReceiver(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment5 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment5, "$this$connectObservable");
        ReviewSuccessfulActivity mediaDescriptionCompat = new onNextTutorialButtonClick.MediaDescriptionCompat(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment5), FragmentBuilder_BindMyFundsFragment.MediaBrowserCompat$CustomActionResultReceiver());
        MwBusinessDetailsActivity MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$Token().MediaBrowserCompat$ItemReceiver();
        onGetStartedClick.write((Object) mediaDescriptionCompat, "$this$debounce");
        onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "dispatcher");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver = new C7322x2fdbba73(mediaDescriptionCompat, 100, MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver, "$this$distinct");
        this.clientCredentials = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver).read(new IconCompatParcelizer(this));
    }

    public final void attach(FragmentBuilder_MutualFundPersonalInfoFragment fragmentBuilder_MutualFundPersonalInfoFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_MutualFundPersonalInfoFragment, Promotion.ACTION_VIEW);
        super.attach(fragmentBuilder_MutualFundPersonalInfoFragment);
        try {
            FragmentBuilder_MutualFundPersonalInfoFragment fragmentBuilder_MutualFundPersonalInfoFragment2 = (FragmentBuilder_MutualFundPersonalInfoFragment) getView();
            if (fragmentBuilder_MutualFundPersonalInfoFragment2 != null) {
                Boolean MediaBrowserCompat$CustomActionResultReceiver = this.rememberMe.MediaBrowserCompat$CustomActionResultReceiver();
                fragmentBuilder_MutualFundPersonalInfoFragment2.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver != null ? MediaBrowserCompat$CustomActionResultReceiver.booleanValue() : false);
                ClientCredentials MediaBrowserCompat$CustomActionResultReceiver2 = this.clientCredentials.MediaBrowserCompat$CustomActionResultReceiver();
                if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                    fragmentBuilder_MutualFundPersonalInfoFragment2.read(MediaBrowserCompat$CustomActionResultReceiver2);
                }
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void detach() {
        super.detach();
        try {
            this.loginError.IconCompatParcelizer();
            this.isLoading.IconCompatParcelizer();
            this.rememberMe.IconCompatParcelizer();
            this.isOpen.IconCompatParcelizer();
            this.clientCredentials.IconCompatParcelizer();
            getSiteKey().MediaBrowserCompat$CustomActionResultReceiver();
            getHasInternet().MediaBrowserCompat$CustomActionResultReceiver();
            getThinstance().MediaBrowserCompat$CustomActionResultReceiver();
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void acknowledgeError() {
        try {
            this.store.MediaBrowserCompat$ItemReceiver(C6566x26069d33.write);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0013 A[Catch:{ Exception -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001f A[Catch:{ Exception -> 0x0097 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void login(java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0097 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            int r0 = r0.length()     // Catch:{ Exception -> 0x0097 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            if (r0 == 0) goto L_0x001f
            com.thunderhead.android.infrastructure.ui.mvp.UiView r4 = r3.getView()     // Catch:{ Exception -> 0x0097 }
            o.FragmentBuilder_MutualFundPersonalInfoFragment r4 = (p040o.FragmentBuilder_MutualFundPersonalInfoFragment) r4     // Catch:{ Exception -> 0x0097 }
            if (r4 == 0) goto L_0x009b
            r4.MediaBrowserCompat$MediaItem()     // Catch:{ Exception -> 0x0097 }
            return
        L_0x001f:
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x002a
            int r0 = r0.length()     // Catch:{ Exception -> 0x0097 }
            if (r0 != 0) goto L_0x002b
        L_0x002a:
            r1 = r2
        L_0x002b:
            if (r1 == 0) goto L_0x0039
            com.thunderhead.android.infrastructure.ui.mvp.UiView r4 = r3.getView()     // Catch:{ Exception -> 0x0097 }
            o.FragmentBuilder_MutualFundPersonalInfoFragment r4 = (p040o.FragmentBuilder_MutualFundPersonalInfoFragment) r4     // Catch:{ Exception -> 0x0097 }
            if (r4 == 0) goto L_0x009b
            r4.RatingCompat()     // Catch:{ Exception -> 0x0097 }
            return
        L_0x0039:
            o.HomeActivity_ViewBinding r0 = r3.getHasInternet()     // Catch:{ Exception -> 0x0097 }
            java.lang.Object r0 = r0.read()     // Catch:{ Exception -> 0x0097 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0097 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0097 }
            boolean r0 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r0, (java.lang.Object) r1)     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x0057
            com.thunderhead.android.infrastructure.ui.mvp.UiView r4 = r3.getView()     // Catch:{ Exception -> 0x0097 }
            o.FragmentBuilder_MutualFundPersonalInfoFragment r4 = (p040o.FragmentBuilder_MutualFundPersonalInfoFragment) r4     // Catch:{ Exception -> 0x0097 }
            if (r4 == 0) goto L_0x009b
            r4.MediaMetadataCompat()     // Catch:{ Exception -> 0x0097 }
            return
        L_0x0057:
            o.HomeActivity_ViewBinding r0 = r3.getSiteKey()     // Catch:{ Exception -> 0x0097 }
            java.lang.Object r0 = r0.read()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0097 }
            o.HomeActivity_ViewBinding r1 = r3.getThinstance()     // Catch:{ Exception -> 0x0097 }
            java.lang.Object r1 = r1.read()     // Catch:{ Exception -> 0x0097 }
            o.FragmentBuilder_BindHmlOperatingBankFragment r1 = (p040o.FragmentBuilder_BindHmlOperatingBankFragment) r1     // Catch:{ Exception -> 0x0097 }
            if (r1 == 0) goto L_0x0070
            java.net.URI r1 = r1.write     // Catch:{ Exception -> 0x0097 }
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0097 }
            com.thunderhead.android.domain.authentication.ClientCredentials r4 = com.thunderhead.android.domain.authentication.AuthenticationUtilsKt.clientCredentials(r4, r5, r0, r1)     // Catch:{ Exception -> 0x0097 }
            if (r4 == 0) goto L_0x0089
            o.FragmentBuilder_BindJuristicOnboardingLandingFragment<o.OnBoardingTutorialActivity> r5 = r3.store     // Catch:{ Exception -> 0x0097 }
            o.FragmentBuilder_BindMwShopAddressOnlineFragment$MediaDescriptionCompat r0 = new o.FragmentBuilder_BindMwShopAddressOnlineFragment$MediaDescriptionCompat     // Catch:{ Exception -> 0x0097 }
            r0.<init>(r4, r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.Object r4 = r5.MediaBrowserCompat$ItemReceiver(r0)     // Catch:{ Exception -> 0x0097 }
            if (r4 == 0) goto L_0x0089
            return
        L_0x0089:
            com.thunderhead.android.infrastructure.ui.mvp.UiView r4 = r3.getView()     // Catch:{ Exception -> 0x0097 }
            o.FragmentBuilder_MutualFundPersonalInfoFragment r4 = (p040o.FragmentBuilder_MutualFundPersonalInfoFragment) r4     // Catch:{ Exception -> 0x0097 }
            if (r4 == 0) goto L_0x009b
            r4.MediaBrowserCompat$SearchResultReceiver()     // Catch:{ Exception -> 0x0097 }
            o.HmlVerifyPhoneValidateOtpActivity r4 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0097 }
            return
        L_0x0097:
            r4 = move-exception
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(r4)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thunderhead.android.infrastructure.login.LoginPresenterImpl.login(java.lang.String, java.lang.String, boolean):void");
    }

    public final void close() {
        try {
            this.store.MediaBrowserCompat$ItemReceiver(C6874x87d095dd.IconCompatParcelizer);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }
}
