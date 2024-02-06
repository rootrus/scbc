package p040o;

import android.view.View;
import com.scb.phone.view.fragment.scheduledtransaction.ScheduleMonthlyFragment;

/* renamed from: o.ActivityBuilder_ContributeRegistrationLivenessCheckActivity */
public final /* synthetic */ class ActivityBuilder_ContributeRegistrationLivenessCheckActivity implements View.OnClickListener {
    private final /* synthetic */ ScheduleMonthlyFragment write;

    public /* synthetic */ ActivityBuilder_ContributeRegistrationLivenessCheckActivity(ScheduleMonthlyFragment scheduleMonthlyFragment) {
        this.write = scheduleMonthlyFragment;
    }

    public final void onClick(View view) {
        this.write.write();
    }
}
