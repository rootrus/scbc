package p040o;

import com.scb.phone.view.fragment.closeaccount.CloseAccountSelectionOwnFragment;

/* renamed from: o.getHistory */
public final class getHistory implements MileageQuantitySelectionActivity<CloseAccountSelectionOwnFragment> {
    public static void write(CloseAccountSelectionOwnFragment closeAccountSelectionOwnFragment, TimeTypeAdapter timeTypeAdapter) {
        closeAccountSelectionOwnFragment.presenter = timeTypeAdapter;
    }
}
