package p040o;

import com.scb.phone.view.fragment.hml.HmlCompanyNameFragment;
import p040o.ExtractionParameters;

/* renamed from: o.ActivityBuilder_BindDiscoverDisclaimerActivity */
public final class ActivityBuilder_BindDiscoverDisclaimerActivity implements MileageQuantitySelectionActivity<HmlCompanyNameFragment> {
    public static void write(HmlCompanyNameFragment hmlCompanyNameFragment, getUserEmailAddress<ExtractionParameters.ExtractionType> getuseremailaddress) {
        hmlCompanyNameFragment.presenter = getuseremailaddress;
    }
}
