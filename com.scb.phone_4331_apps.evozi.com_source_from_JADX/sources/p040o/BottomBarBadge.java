package p040o;

import com.scb.phone.view.activity.transferandpay.topup.TopUpActivity;

/* renamed from: o.BottomBarBadge */
public final class BottomBarBadge implements MileageQuantitySelectionActivity<TopUpActivity> {
    public static void IconCompatParcelizer(TopUpActivity topUpActivity, getIBillDeserializerRtti getibilldeserializerrtti) {
        topUpActivity.topUpActivityPresenter = getibilldeserializerrtti;
    }
}
