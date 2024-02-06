package com.scb.phone.view.fragment.scheduledtransaction;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ScheduleDate;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class ScheduleMonthlyFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ScheduleMonthlyFragment MediaBrowserCompat$CustomActionResultReceiver;

    public ScheduleMonthlyFragment_ViewBinding(ScheduleMonthlyFragment scheduleMonthlyFragment, View view) {
        super(scheduleMonthlyFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = scheduleMonthlyFragment;
        scheduleMonthlyFragment.startDate = (ScheduleDate) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.start_date, "field 'startDate'", ScheduleDate.class);
        scheduleMonthlyFragment.endDate = (ScheduleDate) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.end_date, "field 'endDate'", ScheduleDate.class);
        scheduleMonthlyFragment.everyDate = (ScheduleDate) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.every_date, "field 'everyDate'", ScheduleDate.class);
    }

    public final void read() {
        ScheduleMonthlyFragment scheduleMonthlyFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (scheduleMonthlyFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            scheduleMonthlyFragment.startDate = null;
            scheduleMonthlyFragment.endDate = null;
            scheduleMonthlyFragment.everyDate = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
