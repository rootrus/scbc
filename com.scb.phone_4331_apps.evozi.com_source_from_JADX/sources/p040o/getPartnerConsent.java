package p040o;

import com.scb.phone.view.fragment.bankingagent.BankingEnterAmountFragment;

/* renamed from: o.getPartnerConsent */
public final class getPartnerConsent implements MileageQuantitySelectionActivity<BankingEnterAmountFragment> {
    public static void write(BankingEnterAmountFragment bankingEnterAmountFragment, requestWasSuccessful requestwassuccessful) {
        bankingEnterAmountFragment.presenter = requestwassuccessful;
    }
}
