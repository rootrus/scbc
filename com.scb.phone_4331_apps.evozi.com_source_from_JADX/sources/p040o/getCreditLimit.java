package p040o;

import com.scb.phone.view.fragment.ccrredemption.oprredemption.CurrentCycleInfoFragment;

/* renamed from: o.getCreditLimit */
public final class getCreditLimit implements MileageQuantitySelectionActivity<CurrentCycleInfoFragment> {
    public static void write(CurrentCycleInfoFragment currentCycleInfoFragment, zaz zaz) {
        currentCycleInfoFragment.picassoFactory = zaz;
    }

    public static void write(CurrentCycleInfoFragment currentCycleInfoFragment, setDateFormat setdateformat) {
        currentCycleInfoFragment.presenter = setdateformat;
    }
}
