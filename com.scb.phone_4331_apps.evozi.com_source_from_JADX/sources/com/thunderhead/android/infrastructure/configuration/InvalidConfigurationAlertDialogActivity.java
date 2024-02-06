package com.thunderhead.android.infrastructure.configuration;

import androidx.appcompat.app.AppCompatActivity;
import p040o.C6555xdccae8ee;
import p040o.CheckEligibilityActivity;
import p040o.CheckEligibilityActivity_ViewBinding;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.FragmentBuilder_BindOnboardingInputAddressFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundAppFormActivity_ViewBinding;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnBoardingTutorialActivity;
import p040o.PlaybackStateCompat;
import p040o.clickNext;
import p040o.onAccountSummaryClick;
import p040o.onGetStartedClick;

public final class InvalidConfigurationAlertDialogActivity extends AppCompatActivity {
    private final HmlVerifyEmailActivity IconCompatParcelizer;
    private onAccountSummaryClick MediaBrowserCompat$ItemReceiver;

    static {
        clickNext[] clicknextArr = new clickNext[1];
        clickNext write = FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write(InvalidConfigurationAlertDialogActivity.class), "store", "getStore()Lcom/thunderhead/android/domain/state/Store;"));
    }

    public InvalidConfigurationAlertDialogActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.IconCompatParcelizer = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onStart() {
        String str;
        String str2;
        super.onStart();
        try {
            String string = getResources().getString(C6555xdccae8ee.th_button_ok);
            onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.string.th_button_ok)");
            FundFactSheetActivity<OnBoardingTutorialActivity, Boolean> IconCompatParcelizer2 = FragmentBuilder_BindOnboardingInputAddressFragment.IconCompatParcelizer();
            FragmentBuilder_BindJuristicOnboardingLandingFragment fragmentBuilder_BindJuristicOnboardingLandingFragment = (FragmentBuilder_BindJuristicOnboardingLandingFragment) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            onGetStartedClick.IconCompatParcelizer((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment, "store");
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) IconCompatParcelizer2.invoke(fragmentBuilder_BindJuristicOnboardingLandingFragment.MediaBrowserCompat$ItemReceiver()), (Object) Boolean.TRUE)) {
                str2 = getResources().getString(C6555xdccae8ee.th_missing_initialization_parameters_title);
                onGetStartedClick.IconCompatParcelizer((Object) str2, "resources.getString(R.st…ization_parameters_title)");
                str = getResources().getString(C6555xdccae8ee.th_missing_initialization_parameters_message);
                onGetStartedClick.IconCompatParcelizer((Object) str, "resources.getString(R.st…ation_parameters_message)");
            } else {
                str2 = getResources().getString(C6555xdccae8ee.th_invalid_initialization_parameters_title);
                onGetStartedClick.IconCompatParcelizer((Object) str2, "resources.getString(R.st…ization_parameters_title)");
                str = getResources().getString(C6555xdccae8ee.th_invalid_initialization_parameters_message);
                onGetStartedClick.IconCompatParcelizer((Object) str, "resources.getString(R.st…ation_parameters_message)");
            }
            onAccountSummaryClick onaccountsummaryclick = new onAccountSummaryClick(str2, str, string, "");
            setFinishOnTouchOutside(false);
            onaccountsummaryclick.MediaBrowserCompat$CustomActionResultReceiver = new C6232x15000030(this);
            this.MediaBrowserCompat$ItemReceiver = onaccountsummaryclick;
            onaccountsummaryclick.MediaBrowserCompat$CustomActionResultReceiver(this);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        onAccountSummaryClick onaccountsummaryclick = this.MediaBrowserCompat$ItemReceiver;
        if (onaccountsummaryclick != null) {
            PlaybackStateCompat.CustomAction customAction = onaccountsummaryclick.read;
            if (customAction != null) {
                customAction.dismiss();
                onaccountsummaryclick.read = null;
            }
            onaccountsummaryclick.MediaBrowserCompat$MediaItem = null;
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        onAccountSummaryClick onaccountsummaryclick = this.MediaBrowserCompat$ItemReceiver;
        if (onaccountsummaryclick != null) {
            PlaybackStateCompat.CustomAction customAction = onaccountsummaryclick.read;
            if (customAction != null) {
                customAction.dismiss();
                onaccountsummaryclick.read = null;
            }
            onaccountsummaryclick.MediaBrowserCompat$MediaItem = null;
        }
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity>> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView();
        }
    }

    public static final /* synthetic */ FragmentBuilder_BindJuristicOnboardingLandingFragment IconCompatParcelizer(InvalidConfigurationAlertDialogActivity invalidConfigurationAlertDialogActivity) {
        return (FragmentBuilder_BindJuristicOnboardingLandingFragment) invalidConfigurationAlertDialogActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
