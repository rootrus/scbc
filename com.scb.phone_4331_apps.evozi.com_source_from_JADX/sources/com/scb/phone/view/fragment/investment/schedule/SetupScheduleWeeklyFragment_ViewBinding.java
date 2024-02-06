package com.scb.phone.view.fragment.investment.schedule;

import android.view.View;
import androidx.gridlayout.widget.GridLayout;
import com.scb.phone.R;
import p040o.onStart;

public class SetupScheduleWeeklyFragment_ViewBinding extends BaseSetupScheduleFragment_ViewBinding {
    private SetupScheduleWeeklyFragment IconCompatParcelizer;

    public SetupScheduleWeeklyFragment_ViewBinding(SetupScheduleWeeklyFragment setupScheduleWeeklyFragment, View view) {
        super(setupScheduleWeeklyFragment, view);
        this.IconCompatParcelizer = setupScheduleWeeklyFragment;
        setupScheduleWeeklyFragment.grid = (GridLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.grid, "field 'grid'", GridLayout.class);
    }

    public final void read() {
        SetupScheduleWeeklyFragment setupScheduleWeeklyFragment = this.IconCompatParcelizer;
        if (setupScheduleWeeklyFragment != null) {
            this.IconCompatParcelizer = null;
            setupScheduleWeeklyFragment.grid = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
