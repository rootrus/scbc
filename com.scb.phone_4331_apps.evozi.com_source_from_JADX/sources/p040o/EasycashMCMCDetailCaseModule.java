package p040o;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import p040o.EasycashCommercialInfoCaseModule;

/* renamed from: o.EasycashMCMCDetailCaseModule */
public final class EasycashMCMCDetailCaseModule implements ComponentCallbacks2 {
    private final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> MediaBrowserCompat$CustomActionResultReceiver;

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
    }

    public EasycashMCMCDetailCaseModule(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindJuristicOnboardingLandingFragment, "store");
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindJuristicOnboardingLandingFragment;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        EasycashFeatureAccountCaseModule easycashFeatureAccountCaseModule;
        if (configuration != null) {
            try {
                FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.write((Object) configuration, "$this$getOrientation");
                if (configuration.orientation == 2) {
                    easycashFeatureAccountCaseModule = EasycashFeatureAccountCaseModule.LANDSCAPE;
                } else {
                    easycashFeatureAccountCaseModule = EasycashFeatureAccountCaseModule.PORTRAIT;
                }
                fragmentBuilder_BindJuristicOnboardingLandingFragment.MediaBrowserCompat$ItemReceiver(new EasycashCommercialInfoCaseModule.read(easycashFeatureAccountCaseModule));
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        }
    }
}
