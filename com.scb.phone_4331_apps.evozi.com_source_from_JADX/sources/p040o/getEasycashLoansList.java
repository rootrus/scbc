package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.billpayment.BillPaymentHistoryFragment;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerListFragment;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.EBillPaymentBillerListFragment;

/* renamed from: o.getEasycashLoansList */
public final class getEasycashLoansList extends setCardElevation {
    private int[] IconCompatParcelizer = {R.string.new_payment, R.string.e_bill, R.string.auto_regen_repeat_top_up_history};
    private Context MediaBrowserCompat$ItemReceiver;

    public getEasycashLoansList(setTitleMarginStart settitlemarginstart, Context context) {
        super(settitlemarginstart);
        this.MediaBrowserCompat$ItemReceiver = context;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return BillPaymentBillerListFragment.MediaMetadataCompat();
        }
        if (i == 1) {
            return new EBillPaymentBillerListFragment();
        }
        if (i != 2) {
            return null;
        }
        return new BillPaymentHistoryFragment();
    }

    public final int getCount() {
        return this.IconCompatParcelizer.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$ItemReceiver.getString(this.IconCompatParcelizer[i]);
    }
}
