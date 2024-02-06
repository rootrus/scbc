package p040o;

import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMCoachMarkActivity;

/* renamed from: o.setOnTabReselectListener */
public final class setOnTabReselectListener implements MileageQuantitySelectionActivity<CardlessATMCoachMarkActivity> {
    public static void read(CardlessATMCoachMarkActivity cardlessATMCoachMarkActivity, inject_permissionChecker inject_permissionchecker) {
        cardlessATMCoachMarkActivity.presenter = inject_permissionchecker;
    }
}
