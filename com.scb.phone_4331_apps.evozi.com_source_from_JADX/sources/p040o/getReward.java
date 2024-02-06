package p040o;

import com.scb.phone.view.fragment.easycash.creditpower.EasycashCreditPowerSummaryFragment;

/* renamed from: o.getReward */
public final class getReward implements MileageQuantitySelectionActivity<EasycashCreditPowerSummaryFragment> {
    public static void read(EasycashCreditPowerSummaryFragment easycashCreditPowerSummaryFragment, forEachClear foreachclear) {
        easycashCreditPowerSummaryFragment.tracker = foreachclear;
    }

    public static void read(EasycashCreditPowerSummaryFragment easycashCreditPowerSummaryFragment, doQuickAnalysis doquickanalysis) {
        easycashCreditPowerSummaryFragment.presenter = doquickanalysis;
    }
}
