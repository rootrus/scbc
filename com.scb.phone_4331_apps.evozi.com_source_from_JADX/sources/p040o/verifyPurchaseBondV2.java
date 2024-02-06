package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.findus.ATMTabFragment;
import com.scb.phone.view.fragment.findus.BranchTabFragment;

/* renamed from: o.verifyPurchaseBondV2 */
public final class verifyPurchaseBondV2 extends setCardElevation {
    private int[] read = {R.string.branch, R.string.atm};
    private Context write;

    public verifyPurchaseBondV2(setTitleMarginStart settitlemarginstart, Context context) {
        super(settitlemarginstart);
        this.write = context;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return new BranchTabFragment();
        }
        if (i != 1) {
            return null;
        }
        return new ATMTabFragment();
    }

    public final int getCount() {
        return this.read.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.write.getString(this.read[i]);
    }
}
