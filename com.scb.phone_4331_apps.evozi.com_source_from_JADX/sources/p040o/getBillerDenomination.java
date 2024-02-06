package p040o;

import com.scb.phone.view.fragment.closeaccount.CloseAccountSelectionFragment;
import p040o.ReflectiveTypeAdapterFactory;

/* renamed from: o.getBillerDenomination */
public final class getBillerDenomination implements MileageQuantitySelectionActivity<CloseAccountSelectionFragment> {
    public static void write(CloseAccountSelectionFragment closeAccountSelectionFragment, ReflectiveTypeAdapterFactory.BoundField boundField) {
        closeAccountSelectionFragment.presenter = boundField;
    }
}
