package com.scb.phone.view.fragment.scheduledtransaction;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ScheduleDate;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class ScheduleOnceFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ScheduleOnceFragment IconCompatParcelizer;

    public ScheduleOnceFragment_ViewBinding(ScheduleOnceFragment scheduleOnceFragment, View view) {
        super(scheduleOnceFragment, view);
        this.IconCompatParcelizer = scheduleOnceFragment;
        scheduleOnceFragment.paymentDate = (ScheduleDate) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.payment_date, "field 'paymentDate'", ScheduleDate.class);
    }

    public final void read() {
        ScheduleOnceFragment scheduleOnceFragment = this.IconCompatParcelizer;
        if (scheduleOnceFragment != null) {
            this.IconCompatParcelizer = null;
            scheduleOnceFragment.paymentDate = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
