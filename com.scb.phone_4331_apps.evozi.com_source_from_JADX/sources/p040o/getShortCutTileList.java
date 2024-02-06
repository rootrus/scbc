package p040o;

import com.scb.phone.view.fragment.bulktransfer.AddNewRecipientFragment;

/* renamed from: o.getShortCutTileList */
public final class getShortCutTileList implements MileageQuantitySelectionActivity<AddNewRecipientFragment> {
    public static void write(AddNewRecipientFragment addNewRecipientFragment, isRegistered isregistered) {
        addNewRecipientFragment.addNewRecipientPresenter = isregistered;
    }
}
