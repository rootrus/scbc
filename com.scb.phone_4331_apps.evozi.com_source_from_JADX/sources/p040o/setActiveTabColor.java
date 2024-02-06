package p040o;

import com.scb.phone.view.activity.transferandpay.PullSlipActivity;
import p040o.C4054b;
import p040o.Iterables;

/* renamed from: o.setActiveTabColor */
public final class setActiveTabColor implements MileageQuantitySelectionActivity<PullSlipActivity> {
    public static void write(PullSlipActivity pullSlipActivity, C4054b.C40572 r1) {
        pullSlipActivity.mPresenter = r1;
    }

    public static void read(PullSlipActivity pullSlipActivity, Iterables.C352414 r1) {
        pullSlipActivity.mComponentFactory = r1;
    }
}
