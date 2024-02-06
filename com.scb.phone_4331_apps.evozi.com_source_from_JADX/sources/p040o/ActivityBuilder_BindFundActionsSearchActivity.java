package p040o;

import com.scb.phone.view.fragment.hml.HmlSummaryFragment;

/* renamed from: o.ActivityBuilder_BindFundActionsSearchActivity */
public final class ActivityBuilder_BindFundActionsSearchActivity implements MileageQuantitySelectionActivity<HmlSummaryFragment> {
    public static void IconCompatParcelizer(HmlSummaryFragment hmlSummaryFragment, getScanSettings getscansettings) {
        hmlSummaryFragment.presenter = getscansettings;
    }
}
