package p040o;

import com.scb.phone.view.fragment.bankingagent.BankingAgentTCFragment;

/* renamed from: o.postPartnerConsent */
public final class postPartnerConsent implements MileageQuantitySelectionActivity<BankingAgentTCFragment> {
    public static void write(BankingAgentTCFragment bankingAgentTCFragment, UpdateAppSpiCall updateAppSpiCall) {
        bankingAgentTCFragment.presenter = updateAppSpiCall;
    }
}
