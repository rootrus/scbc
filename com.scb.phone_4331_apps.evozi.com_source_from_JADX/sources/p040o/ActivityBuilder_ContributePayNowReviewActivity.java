package p040o;

import android.content.SharedPreferences;
import com.scb.phone.view.fragment.registration.preregistration.PreregistrationLandingFragment;

/* renamed from: o.ActivityBuilder_ContributePayNowReviewActivity */
public final class ActivityBuilder_ContributePayNowReviewActivity implements MileageQuantitySelectionActivity<PreregistrationLandingFragment> {
    public static void IconCompatParcelizer(PreregistrationLandingFragment preregistrationLandingFragment, C5074nv nvVar) {
        preregistrationLandingFragment.presenter = nvVar;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(PreregistrationLandingFragment preregistrationLandingFragment, SharedPreferences sharedPreferences) {
        preregistrationLandingFragment.sharedPreferences = sharedPreferences;
    }
}
