package p040o;

import com.scb.phone.view.fragment.moneyaction.MoneyActionFragment;

/* renamed from: o.ActivityBuilder_ContributeEasycashLoanTrackActivity */
public final class ActivityBuilder_ContributeEasycashLoanTrackActivity implements MileageQuantitySelectionActivity<MoneyActionFragment> {
    public static void write(MoneyActionFragment moneyActionFragment, AppstatsThresholdReachedListener appstatsThresholdReachedListener) {
        moneyActionFragment.moneyActionPresenter = appstatsThresholdReachedListener;
    }

    public static void read(MoneyActionFragment moneyActionFragment, getIdType getidtype) {
        moneyActionFragment.iDeviceCompatibilityHelper = getidtype;
    }
}
