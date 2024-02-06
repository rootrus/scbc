package p040o;

import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;
import p040o.setDomain;

/* renamed from: o.ActivityBuilder_BindDeejungTransferMinFullConfirmationActivity */
public final class ActivityBuilder_BindDeejungTransferMinFullConfirmationActivity<T extends setDomain> implements MileageQuantitySelectionActivity<HmlCalculatorFragment<T>> {
    public static <T extends setDomain> void read(HmlCalculatorFragment<T> hmlCalculatorFragment, T t) {
        hmlCalculatorFragment.presenter = t;
    }

    public static <T extends setDomain> void read(HmlCalculatorFragment<T> hmlCalculatorFragment, toCollection tocollection) {
        hmlCalculatorFragment.productCatalogueFactory = tocollection;
    }
}
