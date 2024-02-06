package p040o;

import com.scb.phone.view.fragment.prepaid.request.PrepaidRequestMailingAddressFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlSensitiveConsentActivity */
public final class ActivityBuilder_ContributeHmlSensitiveConsentActivity implements MileageQuantitySelectionActivity<PrepaidRequestMailingAddressFragment> {
    public static void write(PrepaidRequestMailingAddressFragment prepaidRequestMailingAddressFragment, DataUnit dataUnit) {
        prepaidRequestMailingAddressFragment.mailingPresenter = dataUnit;
    }
}
