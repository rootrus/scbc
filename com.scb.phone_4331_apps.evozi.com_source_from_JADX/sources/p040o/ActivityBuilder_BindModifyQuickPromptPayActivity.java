package p040o;

import com.scb.phone.view.fragment.investment.discover.DiscoverFundFilterFragment;

/* renamed from: o.ActivityBuilder_BindModifyQuickPromptPayActivity */
public final class ActivityBuilder_BindModifyQuickPromptPayActivity implements MileageQuantitySelectionActivity<DiscoverFundFilterFragment> {
    public static void read(DiscoverFundFilterFragment discoverFundFilterFragment, UserLogout userLogout) {
        discoverFundFilterFragment.presenter = userLogout;
    }
}
