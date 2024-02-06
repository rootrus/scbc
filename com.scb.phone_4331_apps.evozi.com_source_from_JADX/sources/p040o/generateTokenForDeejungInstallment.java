package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.investment.AwaitingTransactionsTabFragment;
import com.scb.phone.view.fragment.investment.TodayTransactionsTabFragment;

/* renamed from: o.generateTokenForDeejungInstallment */
public final class generateTokenForDeejungInstallment extends setCardElevation {
    private Context MediaBrowserCompat$ItemReceiver;
    private int[] write = {R.string.TODAY, R.string.AWAITING};

    public generateTokenForDeejungInstallment(setTitleMarginStart settitlemarginstart, Context context) {
        super(settitlemarginstart);
        this.MediaBrowserCompat$ItemReceiver = context;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return TodayTransactionsTabFragment.IconCompatParcelizer();
        }
        if (i != 1) {
            return null;
        }
        return AwaitingTransactionsTabFragment.IconCompatParcelizer();
    }

    public final int getCount() {
        return this.write.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$ItemReceiver.getString(this.write[i]);
    }
}
