package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.investment.InvestmentDetailsFragment;
import com.scb.phone.view.fragment.investment.discover.DiscoverFragment;

/* renamed from: o.getDeejungInstallmentAmortizationList */
public final class getDeejungInstallmentAmortizationList extends setCardElevation {
    private Context IconCompatParcelizer;
    private int[] write = {R.string.portfolio, R.string.discover};

    public getDeejungInstallmentAmortizationList(setTitleMarginStart settitlemarginstart, Context context) {
        super(settitlemarginstart);
        this.IconCompatParcelizer = context;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return InvestmentDetailsFragment.write();
        }
        if (i != 1) {
            return null;
        }
        return DiscoverFragment.MediaBrowserCompat$MediaItem();
    }

    public final int getCount() {
        return this.write.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.IconCompatParcelizer.getString(this.write[i]);
    }
}
