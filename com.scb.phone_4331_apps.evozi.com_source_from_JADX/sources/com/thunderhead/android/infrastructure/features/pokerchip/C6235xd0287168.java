package com.thunderhead.android.infrastructure.features.pokerchip;

import kotlin.NoWhenBranchMatchedException;
import p040o.C6866x2d3b32b9;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindVerifyIdentityFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;

/* renamed from: com.thunderhead.android.infrastructure.features.pokerchip.StateConnectedPokerchipPresenter$MediaBrowserCompat$CustomActionResultReceiver */
final class C6235xd0287168 extends CheckEligibilityActivity implements FundActionsSuccessActivity<Object> {
    private /* synthetic */ StateConnectedPokerchipPresenter read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6235xd0287168(StateConnectedPokerchipPresenter stateConnectedPokerchipPresenter) {
        super(0);
        this.read = stateConnectedPokerchipPresenter;
    }

    public final Object invoke() {
        FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = (FragmentBuilder_BindVerifyIdentityFragment) this.read.currentSdkMode.MediaBrowserCompat$CustomActionResultReceiver();
        if (fragmentBuilder_BindVerifyIdentityFragment == null) {
            return Boolean.valueOf(MyECouponActivity_ViewBinding.write("Null Sdk Mode"));
        }
        switch (FragmentBuilder_BindTermsAndConditionsFragment.MediaBrowserCompat$CustomActionResultReceiver[fragmentBuilder_BindVerifyIdentityFragment.ordinal()]) {
            case 1:
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            case 2:
                Object MediaBrowserCompat$ItemReceiver = this.read.store.MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9(FragmentBuilder_BindVerifyIdentityFragment.PREVIEW_WORKS));
                onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver, "store.dispatch(changeSdk…e(SdkMode.PREVIEW_WORKS))");
                return MediaBrowserCompat$ItemReceiver;
            case 3:
                Object MediaBrowserCompat$ItemReceiver2 = this.read.store.MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9(FragmentBuilder_BindVerifyIdentityFragment.PREVIEW_WORKS));
                onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, "store.dispatch(changeSdk…e(SdkMode.PREVIEW_WORKS))");
                return MediaBrowserCompat$ItemReceiver2;
            case 4:
                Object MediaBrowserCompat$ItemReceiver3 = this.read.store.MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9((FragmentBuilder_BindVerifyIdentityFragment) this.read.getLastDesignTimeMode().read()));
                onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver3, "store.dispatch(changeSdk…astDesignTimeMode.value))");
                return MediaBrowserCompat$ItemReceiver3;
            case 5:
                Object MediaBrowserCompat$ItemReceiver4 = this.read.store.MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9((FragmentBuilder_BindVerifyIdentityFragment) this.read.getLastDesignTimeMode().read()));
                onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver4, "store.dispatch(changeSdk…astDesignTimeMode.value))");
                return MediaBrowserCompat$ItemReceiver4;
            case 6:
                Object MediaBrowserCompat$ItemReceiver5 = this.read.store.MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9((FragmentBuilder_BindVerifyIdentityFragment) this.read.getLastDesignTimeMode().read()));
                onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver5, "store.dispatch(changeSdk…astDesignTimeMode.value))");
                return MediaBrowserCompat$ItemReceiver5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
