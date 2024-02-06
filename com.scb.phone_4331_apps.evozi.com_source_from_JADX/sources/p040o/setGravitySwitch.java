package p040o;

import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingConsentActivity;

/* renamed from: o.setGravitySwitch */
public final class setGravitySwitch implements MileageQuantitySelectionActivity<ScbsOnboardingConsentActivity> {
    public static void read(ScbsOnboardingConsentActivity scbsOnboardingConsentActivity, getCaptureCriteria getcapturecriteria) {
        scbsOnboardingConsentActivity.presenter = getcapturecriteria;
    }
}
