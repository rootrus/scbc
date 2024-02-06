package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment;
import com.scb.phone.view.fragment.transferandpay.TopUpTabFragment;
import com.scb.phone.view.fragment.transferandpay.TransferTabFragment;
import p040o.StreetViewPanoramaFragment;

/* renamed from: o.getOccupationInfo */
public final class getOccupationInfo extends setCardElevation {
    private Context IconCompatParcelizer;
    private int[] read = {R.string.transfer_tab, R.string.top_up_tab, R.string.bill_payment_tab};

    public getOccupationInfo(setTitleMarginStart settitlemarginstart, Context context) {
        super(settitlemarginstart);
        this.IconCompatParcelizer = context;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return new TransferTabFragment();
        }
        if (i == 1) {
            return new TopUpTabFragment();
        }
        if (i != 2) {
            return null;
        }
        return BillPaymentTabFragment.write(StreetViewPanoramaFragment.zzb.PROFILE, "");
    }

    public final int getCount() {
        return this.read.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.IconCompatParcelizer.getString(this.read[i]);
    }
}
