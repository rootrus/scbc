package p040o;

import com.scb.phone.view.fragment.registration.RegistrationNewPinFragment;
import p040o.KtaServiceCaller;

/* renamed from: o.ActivityBuilder_ContributeNTBBankingServiceActivity */
public final class ActivityBuilder_ContributeNTBBankingServiceActivity implements MileageQuantitySelectionActivity<RegistrationNewPinFragment> {
    public static void read(RegistrationNewPinFragment registrationNewPinFragment, KtaServiceCaller.JOB_TYPE job_type) {
        registrationNewPinFragment.presenter = job_type;
    }
}
