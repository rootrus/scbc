package com.thunderhead.android.infrastructure.features.pokerchip;

import android.content.Intent;
import android.os.Build;
import android.provider.Settings;
import androidx.appcompat.app.AppCompatActivity;
import p040o.C6555xdccae8ee;
import p040o.C6821x269f889b;
import p040o.CheckEligibilityActivity;
import p040o.CheckEligibilityActivity_ViewBinding;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.FragmentBuilder_BindSuitabilityQuestionsPart2Fragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundAppFormActivity_ViewBinding;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnBoardingTutorialActivity;
import p040o.PlaybackStateCompat;
import p040o.clickNext;
import p040o.onAccountSummaryClick;
import p040o.onGetStartedClick;

public final class RequestDrawOverPermissionsActivity extends AppCompatActivity {
    /* access modifiers changed from: private */
    @Deprecated
    public static IconCompatParcelizer write = new IconCompatParcelizer((byte) 0);
    private final HmlVerifyEmailActivity IconCompatParcelizer;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    private onAccountSummaryClick MediaBrowserCompat$ItemReceiver;

    static {
        clickNext[] clicknextArr = new clickNext[1];
        clickNext write2 = FundOnboardingLandingActivity_ViewBinding.write((CheckEligibilityActivity_ViewBinding) new FundAppFormActivity_ViewBinding(FundOnboardingLandingActivity_ViewBinding.write(RequestDrawOverPermissionsActivity.class), "store", "getStore()Lcom/thunderhead/android/domain/state/Store;"));
    }

    public RequestDrawOverPermissionsActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.write;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.IconCompatParcelizer = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onStart() {
        super.onStart();
        try {
            String string = getResources().getString(C6555xdccae8ee.th_permission_required);
            onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…g.th_permission_required)");
            String string2 = getResources().getString(C6555xdccae8ee.th_draw_over_permission_required);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(R.st…over_permission_required)");
            String string3 = getResources().getString(C6555xdccae8ee.th_allow);
            onGetStartedClick.IconCompatParcelizer((Object) string3, "resources.getString(R.string.th_allow)");
            String string4 = getResources().getString(C6555xdccae8ee.th_deny);
            onGetStartedClick.IconCompatParcelizer((Object) string4, "resources.getString(R.string.th_deny)");
            onAccountSummaryClick onaccountsummaryclick = new onAccountSummaryClick(string, string2, string3, string4);
            setFinishOnTouchOutside(false);
            onaccountsummaryclick.MediaBrowserCompat$CustomActionResultReceiver = new C6233xdd1f3bf9(this);
            onaccountsummaryclick.IconCompatParcelizer = new C6234x26bd7288(this);
            this.MediaBrowserCompat$ItemReceiver = onaccountsummaryclick;
            onaccountsummaryclick.MediaBrowserCompat$CustomActionResultReceiver(this);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1000) {
            try {
                onAccountSummaryClick onaccountsummaryclick = this.MediaBrowserCompat$ItemReceiver;
                if (onaccountsummaryclick != null) {
                    PlaybackStateCompat.CustomAction customAction = onaccountsummaryclick.read;
                    if (customAction != null) {
                        customAction.dismiss();
                        onaccountsummaryclick.read = null;
                    }
                    onaccountsummaryclick.MediaBrowserCompat$MediaItem = null;
                }
                this.MediaBrowserCompat$ItemReceiver = null;
                if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(this)) {
                    ((FragmentBuilder_BindJuristicOnboardingLandingFragment) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindSuitabilityQuestionsPart2Fragment.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
                }
                ((FragmentBuilder_BindJuristicOnboardingLandingFragment) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(C6821x269f889b.read);
                finish();
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        try {
            if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(this)) {
                ((FragmentBuilder_BindJuristicOnboardingLandingFragment) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindSuitabilityQuestionsPart2Fragment.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
            }
            ((FragmentBuilder_BindJuristicOnboardingLandingFragment) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(C6821x269f889b.read);
            onAccountSummaryClick onaccountsummaryclick = this.MediaBrowserCompat$ItemReceiver;
            if (onaccountsummaryclick != null) {
                PlaybackStateCompat.CustomAction customAction = onaccountsummaryclick.read;
                if (customAction != null) {
                    customAction.dismiss();
                    onaccountsummaryclick.read = null;
                }
                onaccountsummaryclick.MediaBrowserCompat$MediaItem = null;
            }
            this.MediaBrowserCompat$ItemReceiver = null;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        try {
            onAccountSummaryClick onaccountsummaryclick = this.MediaBrowserCompat$ItemReceiver;
            if (onaccountsummaryclick != null) {
                PlaybackStateCompat.CustomAction customAction = onaccountsummaryclick.read;
                if (customAction != null) {
                    customAction.dismiss();
                    onaccountsummaryclick.read = null;
                }
                onaccountsummaryclick.MediaBrowserCompat$MediaItem = null;
            }
            this.MediaBrowserCompat$ItemReceiver = null;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity>> {
        public static final read write = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView();
        }
    }

    public static final /* synthetic */ FragmentBuilder_BindJuristicOnboardingLandingFragment read(RequestDrawOverPermissionsActivity requestDrawOverPermissionsActivity) {
        return (FragmentBuilder_BindJuristicOnboardingLandingFragment) requestDrawOverPermissionsActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
