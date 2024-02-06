package p040o;

import com.scb.phone.view.fragment.bulktransfer.SelectRecipientFromFavouriteFragment;

/* renamed from: o.setMaskAccount */
public final class setMaskAccount implements MileageQuantitySelectionActivity<SelectRecipientFromFavouriteFragment> {
    public static void write(SelectRecipientFromFavouriteFragment selectRecipientFromFavouriteFragment, getUri geturi) {
        selectRecipientFromFavouriteFragment.selectRecipientFromFavouritePresenter = geturi;
    }
}
