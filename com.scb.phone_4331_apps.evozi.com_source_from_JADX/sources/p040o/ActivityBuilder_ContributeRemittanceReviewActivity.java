package p040o;

import com.scb.phone.view.fragment.sme.gifting.GiftRecipientFromFavouriteFragment;

/* renamed from: o.ActivityBuilder_ContributeRemittanceReviewActivity */
public final class ActivityBuilder_ContributeRemittanceReviewActivity implements MileageQuantitySelectionActivity<GiftRecipientFromFavouriteFragment> {
    public static void read(GiftRecipientFromFavouriteFragment giftRecipientFromFavouriteFragment, startCenterMessage startcentermessage) {
        giftRecipientFromFavouriteFragment.selectRecipientFromFavouritePresenter = startcentermessage;
    }
}
