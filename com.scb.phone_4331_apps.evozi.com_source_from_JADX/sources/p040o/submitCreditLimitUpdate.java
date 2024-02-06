package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.investment.purchase.AccountTabFragment;
import com.scb.phone.view.fragment.investment.purchase.CreditCardTabFragment;

/* renamed from: o.submitCreditLimitUpdate */
public final class submitCreditLimitUpdate extends setCardElevation {
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    private FragmentBuilder_BindBulkTransferSuccessFragment read;
    private int[] write = {R.string.account_no, R.string.credit_card};

    public submitCreditLimitUpdate(setTitleMarginStart settitlemarginstart, Context context, FragmentBuilder_BindBulkTransferSuccessFragment fragmentBuilder_BindBulkTransferSuccessFragment) {
        super(settitlemarginstart);
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.read = fragmentBuilder_BindBulkTransferSuccessFragment;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return AccountTabFragment.write(this.read, i);
        }
        if (i != 1) {
            return null;
        }
        return CreditCardTabFragment.write(this.read, i);
    }

    public final int getCount() {
        return this.write.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getString(this.write[i]);
    }
}
