package p040o;

import android.view.View;
import com.scb.phone.view.fragment.scheduledtransaction.ScheduleMonthlyFragment;

/* renamed from: o.ActivityBuilder_ContributeRegistrationDeadCardActivity */
public final /* synthetic */ class ActivityBuilder_ContributeRegistrationDeadCardActivity implements View.OnClickListener {
    private final /* synthetic */ ScheduleMonthlyFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeRegistrationDeadCardActivity(ScheduleMonthlyFragment scheduleMonthlyFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = scheduleMonthlyFragment;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver.write();
    }
}
