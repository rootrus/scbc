package p040o;

import com.scb.phone.view.fragment.hml.HmlBaseAccountSetupFragment;
import p040o.FieldType;
import p040o.FieldType.DataType;

/* renamed from: o.ActivityBuilder_BindDeejungTransferLandingActivity */
public final class ActivityBuilder_BindDeejungTransferLandingActivity<T extends FieldType.DataType> implements MileageQuantitySelectionActivity<HmlBaseAccountSetupFragment<T>> {
    public static <T extends FieldType.DataType> void write(HmlBaseAccountSetupFragment<T> hmlBaseAccountSetupFragment, T t) {
        hmlBaseAccountSetupFragment.presenter = t;
    }
}
