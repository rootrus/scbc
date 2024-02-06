package p040o;

import com.scb.phone.view.fragment.mailingaddress.MailingAddressDetailsFragment;

/* renamed from: o.ActivityBuilder_ContributeETBWelcomeAboardActivity */
public final class ActivityBuilder_ContributeETBWelcomeAboardActivity implements MileageQuantitySelectionActivity<MailingAddressDetailsFragment> {
    public static void read(MailingAddressDetailsFragment mailingAddressDetailsFragment, getEnvDeviceID getenvdeviceid) {
        mailingAddressDetailsFragment.presenter = getenvdeviceid;
    }
}
