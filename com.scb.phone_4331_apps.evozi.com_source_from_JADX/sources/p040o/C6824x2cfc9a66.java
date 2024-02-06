package p040o;

import android.app.Activity;
import android.content.Intent;
import com.thunderhead.android.infrastructure.features.pokerchip.RequestDrawOverPermissionsActivity;

/* renamed from: o.FragmentBuilder_BindTakePhotoFragment$MediaBrowserCompat$ItemReceiver */
public final class C6824x2cfc9a66<S> implements onSeeInstructionsClicked<OnBoardingTutorialActivity> {
    public static final C6824x2cfc9a66 IconCompatParcelizer = new C6824x2cfc9a66();

    C6824x2cfc9a66() {
    }

    public final /* synthetic */ Object write(FragmentBuilder_BindJuristicRequestFormFragment fragmentBuilder_BindJuristicRequestFormFragment, FundActionsSuccessActivity fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicRequestFormFragment, "dispatcher");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "getState");
        try {
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) fundActionsSuccessActivity.invoke();
            if (onBoardingTutorialActivity == null) {
                onBoardingTutorialActivity = new OnBoardingTutorialActivity((byte) 0);
            }
            boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) FragmentBuilder_BindTempLimitConfirmationFragment.IconCompatParcelizer().invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
            boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) FragmentBuilder_BindTempLimitConfirmationFragment.read().invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
            boolean MediaBrowserCompat$ItemReceiver3 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) FragmentBuilder_BindTransferToOthersStep1Fragment.read().invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
            if (!MediaBrowserCompat$ItemReceiver && !MediaBrowserCompat$ItemReceiver2 && !MediaBrowserCompat$ItemReceiver3) {
                fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(C6822x612da2aa.MediaBrowserCompat$CustomActionResultReceiver);
                Activity invoke = FragmentBuilder_BindModifyQuickBalanceFragment.MediaBrowserCompat$ItemReceiver().invoke(onBoardingTutorialActivity);
                if (invoke != null) {
                    invoke.startActivity(new Intent(invoke, RequestDrawOverPermissionsActivity.class));
                }
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.SHOW_PERMISSION_ERROR);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
