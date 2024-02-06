package p040o;

import android.app.Activity;
import android.content.Intent;
import com.thunderhead.android.infrastructure.login.LoginActivity;
import p040o.FragmentBuilder_HmlConsumerETBPersonalInfoFragment;

/* renamed from: o.FragmentBuilder_BindSCBSproductDetailFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6752x41f3bcab<S> implements onSeeInstructionsClicked<OnBoardingTutorialActivity> {
    public static final C6752x41f3bcab read = new C6752x41f3bcab();

    C6752x41f3bcab() {
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
            boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) FragmentBuilder_BindOnboardingInputAddressFragment.MediaSessionCompat$ResultReceiverWrapper().invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
            boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) FragmentBuilder_BindTransferToOthersStep1Fragment.read().invoke(onBoardingTutorialActivity), (Object) Boolean.FALSE);
            boolean MediaBrowserCompat$ItemReceiver3 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) FragmentBuilder_HmlBusinessOwnerSubmissionReviewStep2Fragment.IconCompatParcelizer().invoke(onBoardingTutorialActivity), (Object) Boolean.FALSE);
            if (MediaBrowserCompat$ItemReceiver && MediaBrowserCompat$ItemReceiver2 && MediaBrowserCompat$ItemReceiver3 && (invoke = FragmentBuilder_BindModifyQuickBalanceFragment.MediaBrowserCompat$ItemReceiver().invoke(onBoardingTutorialActivity)) != null) {
                fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(FragmentBuilder_HmlConsumerETBPersonalInfoFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
                invoke.startActivity(new Intent(invoke, LoginActivity.class));
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
