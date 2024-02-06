package p040o;

import com.scb.phone.view.fragment.accountsummary.MerchantWalletFragment;

/* renamed from: o.getNotifications */
public final class getNotifications implements MileageQuantitySelectionActivity<MerchantWalletFragment> {
    public static void read(MerchantWalletFragment merchantWalletFragment, SettingsCacheBehavior settingsCacheBehavior) {
        merchantWalletFragment.merchantWalletPresenter = settingsCacheBehavior;
    }
}
