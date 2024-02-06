package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.scheduledtransaction.ScheduleMonthlyFragment;
import com.scb.phone.view.fragment.scheduledtransaction.ScheduleOnceFragment;

/* renamed from: o.selectAccountValidation */
public final class selectAccountValidation extends setCardElevation {
    private Context IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private int[] write = {R.string.schedule_setup_002, R.string.schedule_setup_003};

    public selectAccountValidation(setTitleMarginStart settitlemarginstart, Context context, boolean z) {
        super(settitlemarginstart);
        this.IconCompatParcelizer = context;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return new ScheduleOnceFragment();
        }
        if (i != 1) {
            return null;
        }
        return new ScheduleMonthlyFragment();
    }

    public final int getCount() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            return 1;
        }
        return this.write.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.IconCompatParcelizer.getString(this.write[i]);
    }
}
