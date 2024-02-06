package com.thunderhead.android.infrastructure.features.pokerchip;

import kotlin.NoWhenBranchMatchedException;
import p040o.C6866x2d3b32b9;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindTopUpFavouriteTargetFragment;
import p040o.FragmentBuilder_BindVerifyIdentityFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;

final class StateConnectedPokerchipPresenter$MediaBrowserCompat$MediaItem extends CheckEligibilityActivity implements FundActionsSuccessActivity<Object> {
    private /* synthetic */ StateConnectedPokerchipPresenter write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StateConnectedPokerchipPresenter$MediaBrowserCompat$MediaItem(StateConnectedPokerchipPresenter stateConnectedPokerchipPresenter) {
        super(0);
        this.write = stateConnectedPokerchipPresenter;
    }

    public final Object invoke() {
        FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = (FragmentBuilder_BindVerifyIdentityFragment) this.write.currentSdkMode.MediaBrowserCompat$CustomActionResultReceiver();
        if (fragmentBuilder_BindVerifyIdentityFragment == null) {
            return Boolean.valueOf(MyECouponActivity_ViewBinding.write("Null Sdk Mode"));
        }
        switch (FragmentBuilder_BindTermsAndConditionsFragment.write[fragmentBuilder_BindVerifyIdentityFragment.ordinal()]) {
            case 1:
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            case 2:
                Object MediaBrowserCompat$ItemReceiver = this.write.store.MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9(FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_ON));
                onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver, "store.dispatch(changeSdk…(SdkMode.DESIGN_TIME_ON))");
                return MediaBrowserCompat$ItemReceiver;
            case 3:
                Object MediaBrowserCompat$ItemReceiver2 = this.write.store.MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9(FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF));
                onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, "store.dispatch(changeSdk…SdkMode.DESIGN_TIME_OFF))");
                return MediaBrowserCompat$ItemReceiver2;
            case 4:
                Object MediaBrowserCompat$ItemReceiver3 = this.write.store.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindTopUpFavouriteTargetFragment.write.MediaBrowserCompat$ItemReceiver);
                onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver3, "store.dispatch(PreviewAction.OpenPreviewPanel)");
                return MediaBrowserCompat$ItemReceiver3;
            case 5:
                Object MediaBrowserCompat$ItemReceiver4 = this.write.store.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindTopUpFavouriteTargetFragment.write.MediaBrowserCompat$ItemReceiver);
                onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver4, "store.dispatch(PreviewAction.OpenPreviewPanel)");
                return MediaBrowserCompat$ItemReceiver4;
            case 6:
                Object MediaBrowserCompat$ItemReceiver5 = this.write.store.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindTopUpFavouriteTargetFragment.write.MediaBrowserCompat$ItemReceiver);
                onGetStartedClick.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver5, "store.dispatch(PreviewAction.OpenPreviewPanel)");
                return MediaBrowserCompat$ItemReceiver5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
