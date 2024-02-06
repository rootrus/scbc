package com.thunderhead.android.infrastructure.features.pokerchip;

import android.app.Activity;
import com.thunderhead.android.infrastructure.p057ui.mvp.BasePresenter;
import p040o.C6752x41f3bcab;
import p040o.C6823xe2944757;
import p040o.C6824x2cfc9a66;
import p040o.C7322x2fdbba73;
import p040o.CheckEligibilityActivity;
import p040o.CheckEligibilityActivity_ViewBinding;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.FragmentBuilder_BindModifyQuickBalanceFragment;
import p040o.FragmentBuilder_BindMyFundsFragment;
import p040o.FragmentBuilder_BindOnboardingInputAddressFragment;
import p040o.FragmentBuilder_BindSuccessFragment;
import p040o.FragmentBuilder_BindTempLimitConfirmationFragment;
import p040o.FragmentBuilder_BindTempLimitHomeFragment;
import p040o.FragmentBuilder_BindTempLimitReviewFragment;
import p040o.FragmentBuilder_BindTransferToOthersStep1Fragment;
import p040o.FragmentBuilder_BindVerifyIdentityFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundAppFormActivity_ViewBinding;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.FundPurchaseReviewActivity;
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

public final class StateConnectedPokerchipPresenter extends BasePresenter<FragmentBuilder_BindTempLimitReviewFragment> implements FragmentBuilder_BindTempLimitHomeFragment {
    static final /* synthetic */ clickNext[] $$delegatedProperties;
    private final ReviewSuccessfulActivity<Activity> activity;
    /* access modifiers changed from: private */
    public final ReviewSuccessfulActivity<FragmentBuilder_BindVerifyIdentityFragment> currentSdkMode;
    private final ReviewSuccessfulActivity<Boolean> isLoading;
    private final FundPurchaseReviewActivity isLoggedIn$delegate;
    private final ReviewSuccessfulActivity<Boolean> isVisible;
    private final FundPurchaseReviewActivity lastDesignTimeMode$delegate = new onNextTutorialButtonClick.IconCompatParcelizer(this.store, FragmentBuilder_BindTransferToOthersStep1Fragment.IconCompatParcelizer());
    private final ReviewSuccessfulActivity<Boolean> pokerchipDetached;
    /* access modifiers changed from: private */
    public final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> store;
    private final FundPurchaseReviewActivity validConfiguration$delegate = new onNextTutorialButtonClick.IconCompatParcelizer(this.store, FragmentBuilder_BindOnboardingInputAddressFragment.MediaSessionCompat$ResultReceiverWrapper());

    static {
        Class<StateConnectedPokerchipPresenter> cls = StateConnectedPokerchipPresenter.class;
        $$delegatedProperties = new clickNext[]{FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write((Class) cls), "isLoggedIn", "isLoggedIn()Lcom/thunderhead/android/infrastructure/state/connect/ConnectedStateProperty;")), FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write((Class) cls), "validConfiguration", "getValidConfiguration()Lcom/thunderhead/android/infrastructure/state/connect/ConnectedStateProperty;")), FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write((Class) cls), "lastDesignTimeMode", "getLastDesignTimeMode()Lcom/thunderhead/android/infrastructure/state/connect/ConnectedStateProperty;"))};
    }

    /* access modifiers changed from: private */
    public final HomeActivity_ViewBinding<FragmentBuilder_BindVerifyIdentityFragment> getLastDesignTimeMode() {
        return (HomeActivity_ViewBinding) this.lastDesignTimeMode$delegate.MediaBrowserCompat$ItemReceiver($$delegatedProperties[2]);
    }

    private final HomeActivity_ViewBinding<Boolean> getValidConfiguration() {
        return (HomeActivity_ViewBinding) this.validConfiguration$delegate.MediaBrowserCompat$ItemReceiver($$delegatedProperties[1]);
    }

    private final HomeActivity_ViewBinding<Boolean> isLoggedIn() {
        return (HomeActivity_ViewBinding) this.isLoggedIn$delegate.MediaBrowserCompat$ItemReceiver($$delegatedProperties[0]);
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ StateConnectedPokerchipPresenter IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(StateConnectedPokerchipPresenter stateConnectedPokerchipPresenter) {
            super(1);
            this.IconCompatParcelizer = stateConnectedPokerchipPresenter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                FragmentBuilder_BindTempLimitReviewFragment access$getView$p = StateConnectedPokerchipPresenter.access$getView$p(this.IconCompatParcelizer);
                if (access$getView$p != null) {
                    access$getView$p.MediaBrowserCompat$ItemReceiver(booleanValue);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ StateConnectedPokerchipPresenter read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(StateConnectedPokerchipPresenter stateConnectedPokerchipPresenter) {
            super(1);
            this.read = stateConnectedPokerchipPresenter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj, (Object) Boolean.TRUE)) {
                FragmentBuilder_BindTempLimitReviewFragment access$getView$p = StateConnectedPokerchipPresenter.access$getView$p(this.read);
                if (access$getView$p != null) {
                    access$getView$p.write();
                }
            } else {
                FragmentBuilder_BindTempLimitReviewFragment access$getView$p2 = StateConnectedPokerchipPresenter.access$getView$p(this.read);
                if (access$getView$p2 != null) {
                    access$getView$p2.IconCompatParcelizer();
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Activity, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ StateConnectedPokerchipPresenter MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(StateConnectedPokerchipPresenter stateConnectedPokerchipPresenter) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = stateConnectedPokerchipPresenter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindTempLimitReviewFragment access$getView$p;
            Activity activity = (Activity) obj;
            if (!(activity == null || (access$getView$p = StateConnectedPokerchipPresenter.access$getView$p(this.MediaBrowserCompat$CustomActionResultReceiver)) == null)) {
                access$getView$p.MediaBrowserCompat$CustomActionResultReceiver(activity);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindVerifyIdentityFragment, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ StateConnectedPokerchipPresenter MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(StateConnectedPokerchipPresenter stateConnectedPokerchipPresenter) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = stateConnectedPokerchipPresenter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindTempLimitReviewFragment access$getView$p;
            FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = (FragmentBuilder_BindVerifyIdentityFragment) obj;
            if (!(fragmentBuilder_BindVerifyIdentityFragment == null || (access$getView$p = StateConnectedPokerchipPresenter.access$getView$p(this.MediaBrowserCompat$ItemReceiver)) == null)) {
                access$getView$p.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindVerifyIdentityFragment);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ FragmentBuilder_BindTempLimitReviewFragment access$getView$p(StateConnectedPokerchipPresenter stateConnectedPokerchipPresenter) {
        return (FragmentBuilder_BindTempLimitReviewFragment) stateConnectedPokerchipPresenter.getView();
    }

    public StateConnectedPokerchipPresenter(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment, "store");
        this.store = fragmentBuilder_BindJuristicOnboardingLandingFragment;
        this.isLoggedIn$delegate = new onNextTutorialButtonClick.IconCompatParcelizer(fragmentBuilder_BindJuristicOnboardingLandingFragment, FragmentBuilder_BindMyFundsFragment.MediaMetadataCompat());
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment2 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment2, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment2), FragmentBuilder_BindTempLimitConfirmationFragment.MediaBrowserCompat$ItemReceiver());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver, "$this$distinct");
        this.pokerchipDetached = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver).read(new MediaMetadataCompat(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment3 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment3, "$this$connectObservable");
        this.activity = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment3), FragmentBuilder_BindModifyQuickBalanceFragment.MediaBrowserCompat$ItemReceiver()).read(new read(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment4 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment4, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver2 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment4), FragmentBuilder_BindTransferToOthersStep1Fragment.write());
        MwBusinessDetailsActivity MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$Token().MediaBrowserCompat$ItemReceiver();
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver2, "$this$debounce");
        onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver, "dispatcher");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver = new C7322x2fdbba73(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver2, 100, MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver, "$this$distinct");
        this.currentSdkMode = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver).read(new write(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment5 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment5, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver3 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment5), FragmentBuilder_BindTempLimitConfirmationFragment.write());
        MwBusinessDetailsActivity MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$Token().MediaBrowserCompat$ItemReceiver();
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver3, "$this$debounce");
        onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver2, "dispatcher");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver2 = new C7322x2fdbba73(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver3, 100, MediaBrowserCompat$ItemReceiver2);
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver2, "$this$distinct");
        this.isLoading = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver2).read(new IconCompatParcelizer(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment6 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment6, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver4 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment6), FragmentBuilder_BindTempLimitConfirmationFragment.RatingCompat());
        MwBusinessDetailsActivity MediaBrowserCompat$ItemReceiver3 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$Token().MediaBrowserCompat$ItemReceiver();
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver4, "$this$debounce");
        onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver3, "dispatcher");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver3 = new C7322x2fdbba73(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver4, 100, MediaBrowserCompat$ItemReceiver3);
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver3, "$this$distinct");
        this.isVisible = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_customactionresultreceiver3).read(new StateConnectedPokerchipPresenter$MediaBrowserCompat$ItemReceiver(this));
    }

    public final void tap() {
        try {
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.isLoading.MediaBrowserCompat$CustomActionResultReceiver(), (Object) Boolean.TRUE)) {
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) isLoggedIn().read(), (Object) Boolean.TRUE)) {
                    FundActionsSuccessActivity stateConnectedPokerchipPresenter$MediaBrowserCompat$MediaItem = new StateConnectedPokerchipPresenter$MediaBrowserCompat$MediaItem(this);
                    onGetStartedClick.write((Object) stateConnectedPokerchipPresenter$MediaBrowserCompat$MediaItem, "block");
                    stateConnectedPokerchipPresenter$MediaBrowserCompat$MediaItem.invoke();
                } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getValidConfiguration().read(), (Object) Boolean.FALSE)) {
                    onGetStartedClick.IconCompatParcelizer(this.store.MediaBrowserCompat$ItemReceiver(C6823xe2944757.read), "store.dispatch(showInvalidConfigurationMessage())");
                } else {
                    onGetStartedClick.IconCompatParcelizer(this.store.MediaBrowserCompat$ItemReceiver(C6752x41f3bcab.read), "store.dispatch(openLoginScreen())");
                }
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.TAP_ERROR);
        }
    }

    public final void longTap() {
        try {
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.isLoading.MediaBrowserCompat$CustomActionResultReceiver(), (Object) Boolean.TRUE)) {
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) isLoggedIn().read(), (Object) Boolean.TRUE)) {
                    FundActionsSuccessActivity stateConnectedPokerchipPresenter$MediaBrowserCompat$CustomActionResultReceiver = new C6235xd0287168(this);
                    onGetStartedClick.write((Object) stateConnectedPokerchipPresenter$MediaBrowserCompat$CustomActionResultReceiver, "block");
                    stateConnectedPokerchipPresenter$MediaBrowserCompat$CustomActionResultReceiver.invoke();
                } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getValidConfiguration().read(), (Object) Boolean.FALSE)) {
                    onGetStartedClick.IconCompatParcelizer(this.store.MediaBrowserCompat$ItemReceiver(C6823xe2944757.read), "store.dispatch(showInvalidConfigurationMessage())");
                } else {
                    onGetStartedClick.IconCompatParcelizer(this.store.MediaBrowserCompat$ItemReceiver(C6752x41f3bcab.read), "store.dispatch(openLoginScreen())");
                }
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.LONG_TAP_ERROR);
        }
    }

    public final void requestRequiredPermissions() {
        try {
            this.store.MediaBrowserCompat$ItemReceiver(C6824x2cfc9a66.IconCompatParcelizer);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.REQUEST_PERMISSION_ERROR);
        }
    }

    public final void detach() {
        super.detach();
        try {
            this.currentSdkMode.IconCompatParcelizer();
            this.isLoading.IconCompatParcelizer();
            this.isVisible.IconCompatParcelizer();
            isLoggedIn().MediaBrowserCompat$CustomActionResultReceiver();
            getValidConfiguration().MediaBrowserCompat$CustomActionResultReceiver();
            getLastDesignTimeMode().MediaBrowserCompat$CustomActionResultReceiver();
            this.activity.IconCompatParcelizer();
            this.pokerchipDetached.IconCompatParcelizer();
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }
}
