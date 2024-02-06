package p040o;

import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMTutorialActivity;

/* renamed from: o.setTabSelectionInterceptor */
public final class setTabSelectionInterceptor implements MileageQuantitySelectionActivity<CardlessATMTutorialActivity> {
    public static void write(CardlessATMTutorialActivity cardlessATMTutorialActivity, ContextImageStorage_Factory contextImageStorage_Factory) {
        cardlessATMTutorialActivity.cardlessAtmTutorialPresenter = contextImageStorage_Factory;
    }
}
