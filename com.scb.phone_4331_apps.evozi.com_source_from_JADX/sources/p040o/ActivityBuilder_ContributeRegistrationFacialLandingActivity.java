package p040o;

import android.view.View;
import com.scb.phone.view.fragment.scheduledtransaction.ScheduleMonthlyFragment;

/* renamed from: o.ActivityBuilder_ContributeRegistrationFacialLandingActivity */
public final /* synthetic */ class ActivityBuilder_ContributeRegistrationFacialLandingActivity implements View.OnClickListener {
    private final /* synthetic */ ScheduleMonthlyFragment write;

    public /* synthetic */ ActivityBuilder_ContributeRegistrationFacialLandingActivity(ScheduleMonthlyFragment scheduleMonthlyFragment) {
        this.write = scheduleMonthlyFragment;
    }

    public final void onClick(View view) {
        this.write.write();
    }
}
