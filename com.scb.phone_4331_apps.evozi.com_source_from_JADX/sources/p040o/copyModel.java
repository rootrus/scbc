package p040o;

import com.scb.phone.view.activity.merchant.MerchantWalletDetailActivity;

/* renamed from: o.copyModel */
public final class copyModel implements MileageQuantitySelectionActivity<MerchantWalletDetailActivity> {
    public static void read(MerchantWalletDetailActivity merchantWalletDetailActivity, AppStatsSessionEvent appStatsSessionEvent) {
        merchantWalletDetailActivity.merchantWalletDetailPresenter = appStatsSessionEvent;
    }
}
