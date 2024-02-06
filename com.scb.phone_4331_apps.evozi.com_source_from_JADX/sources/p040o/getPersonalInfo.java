package p040o;

import com.scb.phone.view.adapter.ccrredemption.product.OPRRewardAdapter;
import com.scb.phone.view.fragment.ccrredemption.product.OPRRewardsFragment;

/* renamed from: o.getPersonalInfo */
public final class getPersonalInfo implements MileageQuantitySelectionActivity<OPRRewardsFragment> {
    public static void write(OPRRewardsFragment oPRRewardsFragment, OPRRewardAdapter oPRRewardAdapter) {
        oPRRewardsFragment.oprRewardAdapter = oPRRewardAdapter;
    }

    public static void read(OPRRewardsFragment oPRRewardsFragment, setExclusionStrategies setexclusionstrategies) {
        oPRRewardsFragment.presenter = setexclusionstrategies;
    }
}
