package p040o;

import com.scb.phone.view.adapter.ccrredemption.product.OPRRewardTiersAdapter;
import com.scb.phone.view.fragment.ccrredemption.product.OPRRewardsTabFragment;

/* renamed from: o.getRegistrationAccounts */
public final class getRegistrationAccounts implements MileageQuantitySelectionActivity<OPRRewardsTabFragment> {
    public static void read(OPRRewardsTabFragment oPRRewardsTabFragment, setPrettyPrinting setprettyprinting) {
        oPRRewardsTabFragment.presenter = setprettyprinting;
    }

    public static void IconCompatParcelizer(OPRRewardsTabFragment oPRRewardsTabFragment, OPRRewardTiersAdapter oPRRewardTiersAdapter) {
        oPRRewardsTabFragment.tiersAdapter = oPRRewardTiersAdapter;
    }
}
