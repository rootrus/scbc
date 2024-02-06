package p040o;

import com.scb.phone.view.fragment.bankingagent.BankingAgentsFragment;

/* renamed from: o.PartnerConsentService */
public final class PartnerConsentService implements MileageQuantitySelectionActivity<BankingAgentsFragment> {
    public static void IconCompatParcelizer(BankingAgentsFragment bankingAgentsFragment, SettingsSpiCall settingsSpiCall) {
        bankingAgentsFragment.presenter = settingsSpiCall;
    }
}
