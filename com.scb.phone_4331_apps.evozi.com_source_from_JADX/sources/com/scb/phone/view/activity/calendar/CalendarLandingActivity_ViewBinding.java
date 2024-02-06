package com.scb.phone.view.activity.calendar;

import android.view.View;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class CalendarLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private CalendarLandingActivity MediaBrowserCompat$CustomActionResultReceiver;

    public CalendarLandingActivity_ViewBinding(CalendarLandingActivity calendarLandingActivity, View view) {
        super(calendarLandingActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = calendarLandingActivity;
        calendarLandingActivity.emptyScheduleMessageContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.empty_schedule_message_container, "field 'emptyScheduleMessageContainer'", LinearLayout.class);
        calendarLandingActivity.fragmentContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fragment_container, "field 'fragmentContainer'", LinearLayout.class);
    }

    public final void read() {
        CalendarLandingActivity calendarLandingActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (calendarLandingActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            calendarLandingActivity.emptyScheduleMessageContainer = null;
            calendarLandingActivity.fragmentContainer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
