package p040o;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.FragmentBuilder_BindFundPurchaseReviewFragment */
public final /* synthetic */ class FragmentBuilder_BindFundPurchaseReviewFragment implements Runnable {
    private final /* synthetic */ FragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment IconCompatParcelizer;

    public /* synthetic */ FragmentBuilder_BindFundPurchaseReviewFragment(FragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment;
    }

    public final void run() {
        C6680xb8275b2c fragmentBuilder_BindPromptPayQRSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment;
        FragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment = this.IconCompatParcelizer;
        try {
            fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new C6680xb8275b2c(true));
            if (fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.write.get() != null) {
                FragmentBuilder_BindHmlDocumentCropTutorialFragment.MediaBrowserCompat$ItemReceiver((ViewGroup) fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.write.get().findViewById(16908290), fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment, (C6548x820c5aab) null);
            } else {
                MyECouponActivity_ViewBinding.write("Lost Tracking activity, BaseInteractionsTracker::runTracking()");
            }
            if (!fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.MediaBrowserCompat$ItemReceiver) {
                fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.read.MediaBrowserCompat$CustomActionResultReceiver();
                if (fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.write.get() != null) {
                    View childAt = ((ViewGroup) fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.write.get().findViewById(16908290)).getChildAt(0);
                    if (childAt != null) {
                        FragmentBuilder_BindHmlBusinessURLInfoFragment.IconCompatParcelizer(fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.write.get(), childAt);
                    }
                    fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
                } else {
                    MyECouponActivity_ViewBinding.write("Lost Tracking activity, BaseInteractionsTracker::runTracking()");
                }
            }
            fragmentBuilder_BindJuristicOnboardingLandingFragment = fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.MediaBrowserCompat$CustomActionResultReceiver;
            fragmentBuilder_BindPromptPayQRSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver = new C6680xb8275b2c(false);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            fragmentBuilder_BindJuristicOnboardingLandingFragment = fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.MediaBrowserCompat$CustomActionResultReceiver;
            fragmentBuilder_BindPromptPayQRSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver = new C6680xb8275b2c(false);
        } catch (Throwable th) {
            fragmentBuilder_BindHmlApiBasedDocumentInstructionsFragment.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new C6680xb8275b2c(false));
            throw th;
        }
        fragmentBuilder_BindJuristicOnboardingLandingFragment.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindPromptPayQRSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver);
    }
}
