package p040o;

import com.scb.phone.view.fragment.ccrredemption.product.OPRRegistrationLandingFragment;

/* renamed from: o.getOnboardingOccupationList */
public final class getOnboardingOccupationList implements MileageQuantitySelectionActivity<OPRRegistrationLandingFragment> {
    public static void MediaBrowserCompat$CustomActionResultReceiver(OPRRegistrationLandingFragment oPRRegistrationLandingFragment, C$Gson$Preconditions _gson_preconditions) {
        oPRRegistrationLandingFragment.presenter = _gson_preconditions;
    }

    public static void MediaBrowserCompat$ItemReceiver(OPRRegistrationLandingFragment oPRRegistrationLandingFragment, zaz zaz) {
        oPRRegistrationLandingFragment.picassoFactory = zaz;
    }
}
