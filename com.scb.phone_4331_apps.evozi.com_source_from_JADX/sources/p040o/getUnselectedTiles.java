package p040o;

import com.scb.phone.view.fragment.closeaccount.CloseAccountSelectionOtherFragment;

/* renamed from: o.getUnselectedTiles */
public final class getUnselectedTiles implements MileageQuantitySelectionActivity<CloseAccountSelectionOtherFragment> {
    public static void IconCompatParcelizer(CloseAccountSelectionOtherFragment closeAccountSelectionOtherFragment, SqlDateTypeAdapter sqlDateTypeAdapter) {
        closeAccountSelectionOtherFragment.presenter = sqlDateTypeAdapter;
    }
}
