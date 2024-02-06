package p040o;

import p040o.FragmentBuilder_HmlConsumerETBPersonalInfoFragment;

/* renamed from: o.FragmentBuilder_PhotoTakingDetailsFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6874x87d095dd<S> implements onSeeInstructionsClicked<OnBoardingTutorialActivity> {
    public static final C6874x87d095dd IconCompatParcelizer = new C6874x87d095dd();

    C6874x87d095dd() {
    }

    public final Object write(FragmentBuilder_BindJuristicRequestFormFragment fragmentBuilder_BindJuristicRequestFormFragment, FundActionsSuccessActivity<OnBoardingTutorialActivity> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicRequestFormFragment, "dispatcher");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "getState");
        try {
            OnBoardingTutorialActivity invoke = fundActionsSuccessActivity.invoke();
            boolean z = false;
            if (invoke == null) {
                invoke = new OnBoardingTutorialActivity((byte) 0);
            }
            FragmentBuilder_BindVerifyIdentityFragment invoke2 = FragmentBuilder_BindTransferToOthersStep1Fragment.write().invoke(invoke);
            if (invoke2 == null) {
                invoke2 = FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF;
            }
            if (FragmentBuilder_BindUnbilledTabFragment.read().contains(invoke2)) {
                Boolean invoke3 = FragmentBuilder_BindMyFundsFragment.MediaMetadataCompat().invoke(invoke);
                if (invoke3 != null) {
                    z = invoke3.booleanValue();
                }
                if (!z) {
                    new C6866x2d3b32b9(FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF).write(fragmentBuilder_BindJuristicRequestFormFragment, fundActionsSuccessActivity);
                }
            }
            return fragmentBuilder_BindJuristicRequestFormFragment.MediaBrowserCompat$ItemReceiver(FragmentBuilder_HmlConsumerETBPersonalInfoFragment.write.MediaBrowserCompat$ItemReceiver);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }
}
