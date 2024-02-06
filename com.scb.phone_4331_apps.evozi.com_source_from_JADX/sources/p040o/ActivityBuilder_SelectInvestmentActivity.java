package p040o;

import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessReviewFragment;

/* renamed from: o.ActivityBuilder_SelectInvestmentActivity */
public final class ActivityBuilder_SelectInvestmentActivity implements MileageQuantitySelectionActivity<CardlessReviewFragment> {
    public static void read(CardlessReviewFragment cardlessReviewFragment, getImageByBitmapId getimagebybitmapid) {
        cardlessReviewFragment.cardlessATMReviewPresenter = getimagebybitmapid;
    }
}
