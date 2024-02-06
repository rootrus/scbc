package p040o;

import com.scb.phone.view.fragment.TermsAndConditionsFragment;

/* renamed from: o.requestRiskAssessment */
public final class requestRiskAssessment implements MileageQuantitySelectionActivity<TermsAndConditionsFragment> {
    public static void write(TermsAndConditionsFragment termsAndConditionsFragment, getSessionDeviceSize getsessiondevicesize) {
        termsAndConditionsFragment.presenter = getsessiondevicesize;
    }
}
