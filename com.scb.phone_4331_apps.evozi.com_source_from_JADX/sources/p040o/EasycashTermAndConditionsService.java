package p040o;

import com.scb.phone.view.fragment.debitcard.DebitCardLandingFragment;

/* renamed from: o.EasycashTermAndConditionsService */
public final class EasycashTermAndConditionsService implements MileageQuantitySelectionActivity<DebitCardLandingFragment> {
    public static void write(DebitCardLandingFragment debitCardLandingFragment, getRows getrows) {
        debitCardLandingFragment.presenter = getrows;
    }

    public static void write(DebitCardLandingFragment debitCardLandingFragment, FragmentBuilder_BindCurrentCycleInfoFragmentt fragmentBuilder_BindCurrentCycleInfoFragmentt) {
        debitCardLandingFragment.mapper = fragmentBuilder_BindCurrentCycleInfoFragmentt;
    }
}
