package p040o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p040o.FragmentBuilder_BindMwEditCreateQrFragment;

/* renamed from: o.FragmentBuilder_BindMoneyActionFragment */
public final class FragmentBuilder_BindMoneyActionFragment implements Application.ActivityLifecycleCallbacks {
    private final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> MediaBrowserCompat$ItemReceiver;

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public FragmentBuilder_BindMoneyActionFragment(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment, "store");
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindJuristicOnboardingLandingFragment;
    }

    public final void onActivityPaused(Activity activity) {
        try {
            FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment = this.MediaBrowserCompat$ItemReceiver;
            FragmentBuilder_BindMwShopAddressDepartmentFragment fragmentBuilder_BindMwShopAddressDepartmentFragment = FragmentBuilder_BindMwShopAddressDepartmentFragment.PAUSED;
            onGetStartedClick.write((Object) fragmentBuilder_BindMwShopAddressDepartmentFragment, "activityState");
            fragmentBuilder_BindJuristicOnboardingLandingFragment.MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindMwEditCreateQrFragment.read(activity, fragmentBuilder_BindMwShopAddressDepartmentFragment));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindModifyQuickPromptPayFragment.ACTIVITY_PAUSE_ERROR);
        }
    }

    public final void onActivityResumed(Activity activity) {
        try {
            FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment = this.MediaBrowserCompat$ItemReceiver;
            FragmentBuilder_BindMwShopAddressDepartmentFragment fragmentBuilder_BindMwShopAddressDepartmentFragment = FragmentBuilder_BindMwShopAddressDepartmentFragment.RESUMED;
            onGetStartedClick.write((Object) fragmentBuilder_BindMwShopAddressDepartmentFragment, "activityState");
            fragmentBuilder_BindJuristicOnboardingLandingFragment.MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindMwEditCreateQrFragment.read(activity, fragmentBuilder_BindMwShopAddressDepartmentFragment));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindModifyQuickPromptPayFragment.ACTIVITY_RESUME_ERROR);
        }
    }

    public final void onActivityStarted(Activity activity) {
        try {
            FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment = this.MediaBrowserCompat$ItemReceiver;
            FragmentBuilder_BindMwShopAddressDepartmentFragment fragmentBuilder_BindMwShopAddressDepartmentFragment = FragmentBuilder_BindMwShopAddressDepartmentFragment.STARTED;
            onGetStartedClick.write((Object) fragmentBuilder_BindMwShopAddressDepartmentFragment, "activityState");
            fragmentBuilder_BindJuristicOnboardingLandingFragment.MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindMwEditCreateQrFragment.read(activity, fragmentBuilder_BindMwShopAddressDepartmentFragment));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindModifyQuickPromptPayFragment.ACTIVITY_START_ERROR);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        try {
            FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment = this.MediaBrowserCompat$ItemReceiver;
            FragmentBuilder_BindMwShopAddressDepartmentFragment fragmentBuilder_BindMwShopAddressDepartmentFragment = FragmentBuilder_BindMwShopAddressDepartmentFragment.DESTROYED;
            onGetStartedClick.write((Object) fragmentBuilder_BindMwShopAddressDepartmentFragment, "activityState");
            fragmentBuilder_BindJuristicOnboardingLandingFragment.MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindMwEditCreateQrFragment.read(activity, fragmentBuilder_BindMwShopAddressDepartmentFragment));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindModifyQuickPromptPayFragment.ACTIVITY_DESTROY_ERROR);
        }
    }

    public final void onActivityStopped(Activity activity) {
        try {
            FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment = this.MediaBrowserCompat$ItemReceiver;
            FragmentBuilder_BindMwShopAddressDepartmentFragment fragmentBuilder_BindMwShopAddressDepartmentFragment = FragmentBuilder_BindMwShopAddressDepartmentFragment.STOPPED;
            onGetStartedClick.write((Object) fragmentBuilder_BindMwShopAddressDepartmentFragment, "activityState");
            fragmentBuilder_BindJuristicOnboardingLandingFragment.MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindMwEditCreateQrFragment.read(activity, fragmentBuilder_BindMwShopAddressDepartmentFragment));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindModifyQuickPromptPayFragment.ACTIVITY_STOP_ERROR);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment = this.MediaBrowserCompat$ItemReceiver;
            FragmentBuilder_BindMwShopAddressDepartmentFragment fragmentBuilder_BindMwShopAddressDepartmentFragment = FragmentBuilder_BindMwShopAddressDepartmentFragment.CREATED;
            onGetStartedClick.write((Object) fragmentBuilder_BindMwShopAddressDepartmentFragment, "activityState");
            fragmentBuilder_BindJuristicOnboardingLandingFragment.MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindMwEditCreateQrFragment.read(activity, fragmentBuilder_BindMwShopAddressDepartmentFragment));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindModifyQuickPromptPayFragment.ACTIVITY_CREATE_ERROR);
        }
    }
}
