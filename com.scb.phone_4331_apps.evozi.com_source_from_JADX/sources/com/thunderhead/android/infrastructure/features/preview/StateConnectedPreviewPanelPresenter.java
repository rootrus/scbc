package com.thunderhead.android.infrastructure.features.preview;

import android.app.Activity;
import com.thunderhead.android.infrastructure.p057ui.mvp.BasePresenter;
import p040o.C6866x2d3b32b9;
import p040o.CheckEligibilityActivity;
import p040o.CheckEligibilityActivity_ViewBinding;
import p040o.EasycashNcbCaseModule;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.FragmentBuilder_BindModifyQuickBalanceFragment;
import p040o.FragmentBuilder_BindPrepaidTravelConversionSuccessFragment;
import p040o.FragmentBuilder_BindTopUpFavouriteTargetFragment;
import p040o.FragmentBuilder_BindTouchPointInputCidFragment;
import p040o.FragmentBuilder_BindTouchPointPinFragment;
import p040o.FragmentBuilder_BindTouchPointWifiSettingsFragment;
import p040o.FragmentBuilder_BindTransferHistoryFragment;
import p040o.FragmentBuilder_BindTransferTabFragment;
import p040o.FragmentBuilder_BindTransferToMeStep1Fragment;
import p040o.FragmentBuilder_BindTransferToOthersStep1Fragment;
import p040o.FragmentBuilder_BindVerifyIdentityFragment;
import p040o.FundAppFormActivity_ViewBinding;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.FundPurchaseReviewActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.HomeActivity_ViewBinding;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnBoardingTutorialActivity;
import p040o.OnBoardingTutorialActivity_ViewBinding;
import p040o.ReviewSuccessfulActivity;
import p040o.clickNext;
import p040o.onGetStartedClick;
import p040o.onNextTutorialButtonClick;
import p040o.onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver;

public final class StateConnectedPreviewPanelPresenter extends BasePresenter<FragmentBuilder_BindTouchPointInputCidFragment> implements FragmentBuilder_BindTouchPointPinFragment, OnBoardingTutorialActivity_ViewBinding {
    static final /* synthetic */ clickNext[] $$delegatedProperties = {FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write(StateConnectedPreviewPanelPresenter.class), "activity", "getActivity()Lcom/thunderhead/android/infrastructure/state/connect/ConnectedStateProperty;"))};
    private final FundPurchaseReviewActivity activity$delegate;
    private final ReviewSuccessfulActivity<Integer> displayHeight;
    private final ReviewSuccessfulActivity<Boolean> isOpen;
    /* access modifiers changed from: private */
    public final ReviewSuccessfulActivity<FragmentBuilder_BindTransferToMeStep1Fragment> launchpadData;
    /* access modifiers changed from: private */
    public final ReviewSuccessfulActivity<FragmentBuilder_BindTransferToMeStep1Fragment> liveReleaseData;
    /* access modifiers changed from: private */
    public final ReviewSuccessfulActivity<FragmentBuilder_BindVerifyIdentityFragment> mode;
    /* access modifiers changed from: private */
    public final ReviewSuccessfulActivity<String> monitorUrl;
    /* access modifiers changed from: private */
    public final ReviewSuccessfulActivity<FragmentBuilder_BindTransferHistoryFragment> panelVisibleInformation;
    private final ReviewSuccessfulActivity<Boolean> showLoading;
    private final ReviewSuccessfulActivity<Integer> statusBarHeight;
    private final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> store;
    /* access modifiers changed from: private */
    public final ReviewSuccessfulActivity<String> tid;

    /* access modifiers changed from: private */
    public final HomeActivity_ViewBinding<Activity> getActivity() {
        return (HomeActivity_ViewBinding) this.activity$delegate.MediaBrowserCompat$ItemReceiver($$delegatedProperties[0]);
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ StateConnectedPreviewPanelPresenter read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(StateConnectedPreviewPanelPresenter stateConnectedPreviewPanelPresenter) {
            super(1);
            this.read = stateConnectedPreviewPanelPresenter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindTouchPointInputCidFragment access$getView$p;
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (Boolean) obj, (Object) Boolean.TRUE) || this.read.getActivity().read() == null) {
                FragmentBuilder_BindTouchPointInputCidFragment access$getView$p2 = StateConnectedPreviewPanelPresenter.access$getView$p(this.read);
                if (access$getView$p2 != null) {
                    access$getView$p2.write();
                }
            } else {
                Activity activity = (Activity) this.read.getActivity().read();
                if (!(activity == null || (access$getView$p = StateConnectedPreviewPanelPresenter.access$getView$p(this.read)) == null)) {
                    onGetStartedClick.IconCompatParcelizer((Object) activity, "onScreenActivity");
                    access$getView$p.MediaBrowserCompat$CustomActionResultReceiver(activity);
                    String str = (String) this.read.tid.MediaBrowserCompat$CustomActionResultReceiver();
                    if (str == null) {
                        str = "";
                    }
                    access$getView$p.IconCompatParcelizer(str);
                    access$getView$p.write((String) this.read.monitorUrl.MediaBrowserCompat$CustomActionResultReceiver());
                    FragmentBuilder_BindTransferHistoryFragment fragmentBuilder_BindTransferHistoryFragment = (FragmentBuilder_BindTransferHistoryFragment) this.read.panelVisibleInformation.MediaBrowserCompat$CustomActionResultReceiver();
                    if (fragmentBuilder_BindTransferHistoryFragment == null) {
                        fragmentBuilder_BindTransferHistoryFragment = new FragmentBuilder_BindTransferHistoryFragment((byte) 0);
                    }
                    access$getView$p.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindTransferHistoryFragment);
                    FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = (FragmentBuilder_BindVerifyIdentityFragment) this.read.mode.MediaBrowserCompat$CustomActionResultReceiver();
                    if (fragmentBuilder_BindVerifyIdentityFragment == null) {
                        fragmentBuilder_BindVerifyIdentityFragment = FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF;
                    }
                    access$getView$p.read(fragmentBuilder_BindVerifyIdentityFragment);
                    FragmentBuilder_BindTransferToMeStep1Fragment fragmentBuilder_BindTransferToMeStep1Fragment = (FragmentBuilder_BindTransferToMeStep1Fragment) this.read.liveReleaseData.MediaBrowserCompat$CustomActionResultReceiver();
                    if (fragmentBuilder_BindTransferToMeStep1Fragment != null) {
                        String str2 = fragmentBuilder_BindTransferToMeStep1Fragment.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.IconCompatParcelizer((Object) str2, "live.name");
                        access$getView$p.MediaBrowserCompat$ItemReceiver(str2, FragmentBuilder_BindTransferTabFragment.read(fragmentBuilder_BindTransferToMeStep1Fragment.MediaBrowserCompat$ItemReceiver));
                    }
                    FragmentBuilder_BindTransferToMeStep1Fragment fragmentBuilder_BindTransferToMeStep1Fragment2 = (FragmentBuilder_BindTransferToMeStep1Fragment) this.read.launchpadData.MediaBrowserCompat$CustomActionResultReceiver();
                    if (fragmentBuilder_BindTransferToMeStep1Fragment2 != null) {
                        String str3 = fragmentBuilder_BindTransferToMeStep1Fragment2.MediaBrowserCompat$CustomActionResultReceiver;
                        onGetStartedClick.IconCompatParcelizer((Object) str3, "launchpad.name");
                        access$getView$p.read(str3, FragmentBuilder_BindTransferTabFragment.read(fragmentBuilder_BindTransferToMeStep1Fragment2.MediaBrowserCompat$ItemReceiver));
                    }
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ StateConnectedPreviewPanelPresenter IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(StateConnectedPreviewPanelPresenter stateConnectedPreviewPanelPresenter) {
            super(1);
            this.IconCompatParcelizer = stateConnectedPreviewPanelPresenter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            FragmentBuilder_BindTouchPointInputCidFragment access$getView$p = StateConnectedPreviewPanelPresenter.access$getView$p(this.IconCompatParcelizer);
            if (access$getView$p != null) {
                access$getView$p.write(str);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Boolean, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ StateConnectedPreviewPanelPresenter MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(StateConnectedPreviewPanelPresenter stateConnectedPreviewPanelPresenter) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = stateConnectedPreviewPanelPresenter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                FragmentBuilder_BindTouchPointInputCidFragment access$getView$p = StateConnectedPreviewPanelPresenter.access$getView$p(this.MediaBrowserCompat$CustomActionResultReceiver);
                if (access$getView$p != null) {
                    access$getView$p.MediaBrowserCompat$CustomActionResultReceiver(booleanValue, (Activity) this.MediaBrowserCompat$CustomActionResultReceiver.getActivity().read());
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class RatingCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ StateConnectedPreviewPanelPresenter IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RatingCompat(StateConnectedPreviewPanelPresenter stateConnectedPreviewPanelPresenter) {
            super(1);
            this.IconCompatParcelizer = stateConnectedPreviewPanelPresenter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Integer num = (Integer) obj;
            FragmentBuilder_BindTouchPointInputCidFragment access$getView$p = StateConnectedPreviewPanelPresenter.access$getView$p(this.IconCompatParcelizer);
            if (access$getView$p != null) {
                access$getView$p.read(num != null ? num.intValue() : 0);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindVerifyIdentityFragment, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ StateConnectedPreviewPanelPresenter write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(StateConnectedPreviewPanelPresenter stateConnectedPreviewPanelPresenter) {
            super(1);
            this.write = stateConnectedPreviewPanelPresenter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindTouchPointInputCidFragment access$getView$p;
            FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = (FragmentBuilder_BindVerifyIdentityFragment) obj;
            if (!(fragmentBuilder_BindVerifyIdentityFragment == null || (access$getView$p = StateConnectedPreviewPanelPresenter.access$getView$p(this.write)) == null)) {
                access$getView$p.read(fragmentBuilder_BindVerifyIdentityFragment);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<FragmentBuilder_BindTransferToMeStep1Fragment, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ StateConnectedPreviewPanelPresenter IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(StateConnectedPreviewPanelPresenter stateConnectedPreviewPanelPresenter) {
            super(1);
            this.IconCompatParcelizer = stateConnectedPreviewPanelPresenter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindTouchPointInputCidFragment access$getView$p;
            FragmentBuilder_BindTransferToMeStep1Fragment fragmentBuilder_BindTransferToMeStep1Fragment = (FragmentBuilder_BindTransferToMeStep1Fragment) obj;
            if (!(fragmentBuilder_BindTransferToMeStep1Fragment == null || (access$getView$p = StateConnectedPreviewPanelPresenter.access$getView$p(this.IconCompatParcelizer)) == null)) {
                String str = fragmentBuilder_BindTransferToMeStep1Fragment.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.IconCompatParcelizer((Object) str, "it.name");
                access$getView$p.read(str, FragmentBuilder_BindTransferTabFragment.read(fragmentBuilder_BindTransferToMeStep1Fragment.MediaBrowserCompat$ItemReceiver));
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ FragmentBuilder_BindTouchPointInputCidFragment access$getView$p(StateConnectedPreviewPanelPresenter stateConnectedPreviewPanelPresenter) {
        return (FragmentBuilder_BindTouchPointInputCidFragment) stateConnectedPreviewPanelPresenter.getView();
    }

    public StateConnectedPreviewPanelPresenter(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment, "store");
        this.store = fragmentBuilder_BindJuristicOnboardingLandingFragment;
        this.activity$delegate = new onNextTutorialButtonClick.IconCompatParcelizer(fragmentBuilder_BindJuristicOnboardingLandingFragment, FragmentBuilder_BindModifyQuickBalanceFragment.MediaBrowserCompat$ItemReceiver());
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment2 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment2, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment2), EasycashNcbCaseModule.MediaBrowserCompat$ItemReceiver());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver, "$this$distinct");
        this.statusBarHeight = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver).read(new RatingCompat(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment3 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment3, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver2 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment3), EasycashNcbCaseModule.write());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver2, "$this$distinct");
        this.displayHeight = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver2).read(new C6237xaed44a50(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment4 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment4, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver3 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment4), FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$MediaItem());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver3, "$this$distinct");
        this.showLoading = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver3).read(new MediaMetadataCompat(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment5 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment5, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver4 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment5), FragmentBuilder_BindTouchPointWifiSettingsFragment.IconCompatParcelizer());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver4, "$this$distinct");
        this.monitorUrl = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver4).read(new MediaDescriptionCompat(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment6 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment6, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver5 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment6), FragmentBuilder_BindPrepaidTravelConversionSuccessFragment.read());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver5, "$this$distinct");
        this.tid = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver5).read(new StateConnectedPreviewPanelPresenter$MediaBrowserCompat$MediaItem(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment7 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment7, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver6 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment7), FragmentBuilder_BindTouchPointWifiSettingsFragment.write());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver6, "$this$distinct");
        this.panelVisibleInformation = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver6).read(new C6238xa3720b22(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment8 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment8, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver7 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment8), FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver7, "$this$distinct");
        this.launchpadData = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver7).read(new write(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment9 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment9, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver8 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment9), FragmentBuilder_BindTouchPointWifiSettingsFragment.read());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver8, "$this$distinct");
        this.liveReleaseData = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver8).read(new C6236x5cd5c1(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment10 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment10, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver9 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment10), FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaMetadataCompat());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver9, "$this$distinct");
        this.isOpen = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver9).read(new IconCompatParcelizer(this));
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment11 = this.store;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment11, "$this$connectObservable");
        ReviewSuccessfulActivity onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver10 = new onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(new onNextTutorialButtonClick.write(fragmentBuilder_BindJuristicOnboardingLandingFragment11), FragmentBuilder_BindTransferToOthersStep1Fragment.write());
        onGetStartedClick.write((Object) onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver10, "$this$distinct");
        this.mode = new onNextTutorialButtonClick.read(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver10).read(new read(this));
    }

    public final void dismiss() {
        try {
            this.store.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindTopUpFavouriteTargetFragment.read.MediaBrowserCompat$ItemReceiver);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void exit() {
        try {
            this.store.MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9(FragmentBuilder_BindTransferToOthersStep1Fragment.IconCompatParcelizer().invoke(this.store.MediaBrowserCompat$ItemReceiver())));
            this.store.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindTopUpFavouriteTargetFragment.read.MediaBrowserCompat$ItemReceiver);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void selectLaunchpad() {
        try {
            this.store.MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9(FragmentBuilder_BindVerifyIdentityFragment.PREVIEW_LAUNCHPAD));
            this.store.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindTopUpFavouriteTargetFragment.read.MediaBrowserCompat$ItemReceiver);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void selectInTheWorks() {
        try {
            this.store.MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9(FragmentBuilder_BindVerifyIdentityFragment.PREVIEW_WORKS));
            this.store.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindTopUpFavouriteTargetFragment.read.MediaBrowserCompat$ItemReceiver);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void selectLive() {
        try {
            this.store.MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9(FragmentBuilder_BindVerifyIdentityFragment.PREVIEW_LIVE));
            this.store.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindTopUpFavouriteTargetFragment.read.MediaBrowserCompat$ItemReceiver);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void disconnect() {
        try {
            this.monitorUrl.IconCompatParcelizer();
            this.tid.IconCompatParcelizer();
            this.panelVisibleInformation.IconCompatParcelizer();
            this.launchpadData.IconCompatParcelizer();
            this.liveReleaseData.IconCompatParcelizer();
            this.isOpen.IconCompatParcelizer();
            getActivity().MediaBrowserCompat$CustomActionResultReceiver();
            this.mode.IconCompatParcelizer();
            this.showLoading.IconCompatParcelizer();
            this.statusBarHeight.IconCompatParcelizer();
            this.displayHeight.IconCompatParcelizer();
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void detach() {
        super.detach();
        disconnect();
    }
}
