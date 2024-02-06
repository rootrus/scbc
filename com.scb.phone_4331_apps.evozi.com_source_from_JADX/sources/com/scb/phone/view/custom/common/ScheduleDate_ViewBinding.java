package com.scb.phone.view.custom.common;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class ScheduleDate_ViewBinding implements Unbinder {
    private View IconCompatParcelizer;
    private ScheduleDate MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public ScheduleDate_ViewBinding(final ScheduleDate scheduleDate, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = scheduleDate;
        scheduleDate.dateLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_label, "field 'dateLabel'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.edit_date_field, "field 'dateField' and method 'onFieldClick'");
        scheduleDate.dateField = (EditText) onStart.write(IconCompatParcelizer2, R.id.edit_date_field, "field 'dateField'", EditText.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ScheduleDate.this.onFieldClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.calendar, "field 'calendarButton' and method 'onCalendarClick'");
        scheduleDate.calendarButton = (ImageButton) onStart.write(IconCompatParcelizer3, R.id.calendar, "field 'calendarButton'", ImageButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ScheduleDate.this.onCalendarClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.edit_input_field2, "field 'paymentField' and method 'onPaymentFieldClick'");
        scheduleDate.paymentField = (EditText) onStart.write(IconCompatParcelizer4, R.id.edit_input_field2, "field 'paymentField'", EditText.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ScheduleDate.this.onPaymentFieldClick();
            }
        });
        scheduleDate.arrowIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.arrow, "field 'arrowIcon'", ImageView.class);
    }

    public final void read() {
        ScheduleDate scheduleDate = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (scheduleDate != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            scheduleDate.dateLabel = null;
            scheduleDate.dateField = null;
            scheduleDate.calendarButton = null;
            scheduleDate.paymentField = null;
            scheduleDate.arrowIcon = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
