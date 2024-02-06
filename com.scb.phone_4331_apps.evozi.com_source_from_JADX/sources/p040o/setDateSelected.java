package p040o;

import com.scb.phone.view.activity.mwpartner.MwOnboardInfoActivity;
import p040o.TaskRunner;

/* renamed from: o.setDateSelected */
public final class setDateSelected implements MileageQuantitySelectionActivity<MwOnboardInfoActivity> {
    public static void write(MwOnboardInfoActivity mwOnboardInfoActivity, TaskRunner.TaskCompletedEvent taskCompletedEvent) {
        mwOnboardInfoActivity.presenter = taskCompletedEvent;
    }
}
