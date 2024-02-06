package com.scb.phone.view.fragment.investment.schedule;

import android.view.View;
import android.widget.CheckBox;
import androidx.gridlayout.widget.GridLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ScheduleDate;
import p040o.onStart;

public class SetupScheduleMonthlyFragment_ViewBinding extends BaseSetupScheduleFragment_ViewBinding {
    private SetupScheduleMonthlyFragment MediaBrowserCompat$ItemReceiver;

    public SetupScheduleMonthlyFragment_ViewBinding(SetupScheduleMonthlyFragment setupScheduleMonthlyFragment, View view) {
        super(setupScheduleMonthlyFragment, view);
        this.MediaBrowserCompat$ItemReceiver = setupScheduleMonthlyFragment;
        setupScheduleMonthlyFragment.grid = (GridLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.grid, "field 'grid'", GridLayout.class);
        setupScheduleMonthlyFragment.selectAllCheckBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.select_all_checkbox, "field 'selectAllCheckBox'", CheckBox.class);
        setupScheduleMonthlyFragment.dateSelector = (ScheduleDate) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.date_selector, "field 'dateSelector'", ScheduleDate.class);
    }

    public final void read() {
        SetupScheduleMonthlyFragment setupScheduleMonthlyFragment = this.MediaBrowserCompat$ItemReceiver;
        if (setupScheduleMonthlyFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            setupScheduleMonthlyFragment.grid = null;
            setupScheduleMonthlyFragment.selectAllCheckBox = null;
            setupScheduleMonthlyFragment.dateSelector = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
