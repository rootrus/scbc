package p040o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.scb.phone.view.fragment.ntb.selectaccount.DepositProductDetailFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlNTBAccountSuccessActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlNTBAccountSuccessActivity implements Runnable {
    private final /* synthetic */ DepositProductDetailFragment read;

    public /* synthetic */ ActivityBuilder_ContributeHmlNTBAccountSuccessActivity(DepositProductDetailFragment depositProductDetailFragment) {
        this.read = depositProductDetailFragment;
    }

    public final void run() {
        DepositProductDetailFragment depositProductDetailFragment = this.read;
        ViewGroup.LayoutParams layoutParams = depositProductDetailFragment.imageDetail.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            layoutParams.height = (int) (((double) depositProductDetailFragment.getResources().getDisplayMetrics().widthPixels) * 0.3875d);
        }
        depositProductDetailFragment.imageDetail.setLayoutParams(layoutParams);
    }
}
