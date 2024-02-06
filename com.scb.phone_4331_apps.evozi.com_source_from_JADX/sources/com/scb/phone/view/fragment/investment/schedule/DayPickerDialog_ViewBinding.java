package com.scb.phone.view.fragment.investment.schedule;

import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class DayPickerDialog_ViewBinding implements Unbinder {
    private DayPickerDialog write;

    public DayPickerDialog_ViewBinding(DayPickerDialog dayPickerDialog, View view) {
        this.write = dayPickerDialog;
        dayPickerDialog.numberPicker = (NumberPicker) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.number_picker, "field 'numberPicker'", NumberPicker.class);
        dayPickerDialog.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title, "field 'title'", TextView.class);
        dayPickerDialog.clickableLeft = onStart.IconCompatParcelizer(view, R.id.view_clickable_left, "field 'clickableLeft'");
        dayPickerDialog.clickableRight = onStart.IconCompatParcelizer(view, R.id.view_clickable_right, "field 'clickableRight'");
    }

    public final void read() {
        DayPickerDialog dayPickerDialog = this.write;
        if (dayPickerDialog != null) {
            this.write = null;
            dayPickerDialog.numberPicker = null;
            dayPickerDialog.title = null;
            dayPickerDialog.clickableLeft = null;
            dayPickerDialog.clickableRight = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
