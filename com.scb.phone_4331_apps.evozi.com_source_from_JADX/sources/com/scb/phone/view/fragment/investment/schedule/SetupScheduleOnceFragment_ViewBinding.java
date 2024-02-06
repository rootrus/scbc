package com.scb.phone.view.fragment.investment.schedule;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ScheduleDate;
import p040o.onStart;

public class SetupScheduleOnceFragment_ViewBinding extends BaseSetupScheduleFragment_ViewBinding {
    private SetupScheduleOnceFragment IconCompatParcelizer;

    public SetupScheduleOnceFragment_ViewBinding(SetupScheduleOnceFragment setupScheduleOnceFragment, View view) {
        super(setupScheduleOnceFragment, view);
        this.IconCompatParcelizer = setupScheduleOnceFragment;
        setupScheduleOnceFragment.paymentDate = (ScheduleDate) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.payment_date, "field 'paymentDate'", ScheduleDate.class);
    }

    public final void read() {
        SetupScheduleOnceFragment setupScheduleOnceFragment = this.IconCompatParcelizer;
        if (setupScheduleOnceFragment != null) {
            this.IconCompatParcelizer = null;
            setupScheduleOnceFragment.paymentDate = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
