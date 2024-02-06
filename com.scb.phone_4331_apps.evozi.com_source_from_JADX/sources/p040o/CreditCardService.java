package p040o;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.investment.schedule.SetupScheduleMonthlyFragment;
import com.scb.phone.view.fragment.investment.schedule.SetupScheduleOnceFragment;
import com.scb.phone.view.fragment.investment.schedule.SetupScheduleWeeklyFragment;
import java.util.List;

/* renamed from: o.CreditCardService */
public final class CreditCardService extends setCardElevation {
    private boolean IconCompatParcelizer;
    private List<String> MediaBrowserCompat$ItemReceiver;

    public CreditCardService(setTitleMarginStart settitlemarginstart, List<String> list, boolean z) {
        super(settitlemarginstart);
        this.MediaBrowserCompat$ItemReceiver = list;
        this.IconCompatParcelizer = z;
    }

    public final Fragment read(int i) {
        if (i == 1) {
            return new SetupScheduleWeeklyFragment();
        }
        if (i != 2) {
            return new SetupScheduleOnceFragment();
        }
        return new SetupScheduleMonthlyFragment();
    }

    public final int getCount() {
        if (this.IconCompatParcelizer) {
            return 1;
        }
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$ItemReceiver.get(i);
    }
}
