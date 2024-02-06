package p040o;

import android.app.Activity;
import android.content.Intent;
import com.thunderhead.android.infrastructure.configuration.InvalidConfigurationAlertDialogActivity;
import p040o.FragmentBuilder_BindSuitabilityQuestionsPart2Fragment;

/* renamed from: o.FragmentBuilder_BindTakePhotoFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6823xe2944757<S> implements onSeeInstructionsClicked<OnBoardingTutorialActivity> {
    public static final C6823xe2944757 read = new C6823xe2944757();

    C6823xe2944757() {
    }

    public final /* synthetic */ Object write(FragmentBuilder_BindJuristicRequestFormFragment fragmentBuilder_BindJuristicRequestFormFragment, FundActionsSuccessActivity fundActionsSuccessActivity) {
        Activity invoke;
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicRequestFormFragment, "dispatcher");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "getState");
        try {
            OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) fundActionsSuccessActivity.invoke();
            if (onBoardingTutorialActivity == null) {
                onBoardingTutorialActivity = new OnBoardingTutorialActivity((byte) 0);
            }
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) FragmentBuilder_BindTempLimitConfirmationFragment.MediaBrowserCompat$CustomActionResultReceiver().invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE) && (invoke = FragmentBuilder_BindModifyQuickBalanceFragment.MediaBrowserCompat$ItemReceiver().invoke(onBoardingTutorialActivity)) != null) {
                fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindSuitabilityQuestionsPart2Fragment.MediaMetadataCompat.IconCompatParcelizer);
                invoke.startActivity(new Intent(invoke, InvalidConfigurationAlertDialogActivity.class));
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindSuccessFragment.SHOW_INVALID_ERROR);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
