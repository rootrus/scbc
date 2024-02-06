package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomScheduleView_ViewBinding implements Unbinder {
    private CustomScheduleView MediaBrowserCompat$ItemReceiver;

    public CustomScheduleView_ViewBinding(CustomScheduleView customScheduleView, View view) {
        this.MediaBrowserCompat$ItemReceiver = customScheduleView;
        customScheduleView.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title, "field 'title'", TextView.class);
        customScheduleView.effectiveTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.effectiveTitle, "field 'effectiveTitle'", TextView.class);
        customScheduleView.scheduleTypeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_type, "field 'scheduleTypeTextView'", TextView.class);
        customScheduleView.schedueleTypeLine1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_date_line1, "field 'schedueleTypeLine1'", TextView.class);
        customScheduleView.schedueleTypeLine2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_date_line2, "field 'schedueleTypeLine2'", TextView.class);
        customScheduleView.editButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_button, "field 'editButton'", ImageView.class);
        customScheduleView.calendarIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.calendar_icon, "field 'calendarIcon'", ImageView.class);
        customScheduleView.nextArrow = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_next_arrow, "field 'nextArrow'", ImageView.class);
    }

    public final void read() {
        CustomScheduleView customScheduleView = this.MediaBrowserCompat$ItemReceiver;
        if (customScheduleView != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customScheduleView.title = null;
            customScheduleView.effectiveTitle = null;
            customScheduleView.scheduleTypeTextView = null;
            customScheduleView.schedueleTypeLine1 = null;
            customScheduleView.schedueleTypeLine2 = null;
            customScheduleView.editButton = null;
            customScheduleView.calendarIcon = null;
            customScheduleView.nextArrow = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
