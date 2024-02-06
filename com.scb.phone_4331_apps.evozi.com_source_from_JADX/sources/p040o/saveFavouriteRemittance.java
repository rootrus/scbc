package p040o;

import com.scb.phone.view.fragment.bulktransfer.CreateGroupFragment;

/* renamed from: o.saveFavouriteRemittance */
public final class saveFavouriteRemittance implements MileageQuantitySelectionActivity<CreateGroupFragment> {
    public static void IconCompatParcelizer(CreateGroupFragment createGroupFragment, getResponseCode getresponsecode) {
        createGroupFragment.createRecipientGroupPresenter = getresponsecode;
    }
}
