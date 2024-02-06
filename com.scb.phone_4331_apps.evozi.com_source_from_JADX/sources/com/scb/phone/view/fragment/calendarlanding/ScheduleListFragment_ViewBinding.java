package com.scb.phone.view.fragment.calendarlanding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class ScheduleListFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ScheduleListFragment write;

    public ScheduleListFragment_ViewBinding(ScheduleListFragment scheduleListFragment, View view) {
        super(scheduleListFragment, view);
        this.write = scheduleListFragment;
        scheduleListFragment.listContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_list_container, "field 'listContainer'", LinearLayout.class);
        scheduleListFragment.emptyListMessageContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_list_message_container, "field 'emptyListMessageContainer'", LinearLayout.class);
        scheduleListFragment.errorMessageContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.error_message_container, "field 'errorMessageContainer'", LinearLayout.class);
        scheduleListFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scheduled_transactions_recycler_view, "field 'recyclerView'", RecyclerView.class);
        scheduleListFragment.selectedDateTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.selected_date_text_view, "field 'selectedDateTextView'", TextView.class);
    }

    public final void read() {
        ScheduleListFragment scheduleListFragment = this.write;
        if (scheduleListFragment != null) {
            this.write = null;
            scheduleListFragment.listContainer = null;
            scheduleListFragment.emptyListMessageContainer = null;
            scheduleListFragment.errorMessageContainer = null;
            scheduleListFragment.recyclerView = null;
            scheduleListFragment.selectedDateTextView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
