package p040o;

import com.scb.phone.view.fragment.common.PrintSlipWebFragment;
import p040o.TreeTypeAdapter;

/* renamed from: o.getPerformQuickTopUp */
public final class getPerformQuickTopUp implements MileageQuantitySelectionActivity<PrintSlipWebFragment> {
    public static void write(PrintSlipWebFragment printSlipWebFragment, TreeTypeAdapter.SingleTypeFactory singleTypeFactory) {
        printSlipWebFragment.mPresenter = singleTypeFactory;
    }
}
