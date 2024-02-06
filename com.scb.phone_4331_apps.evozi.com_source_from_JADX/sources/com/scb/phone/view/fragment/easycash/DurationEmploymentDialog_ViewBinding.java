package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomTwoPicker;
import p040o.onStart;

public final class DurationEmploymentDialog_ViewBinding implements Unbinder {
    private DurationEmploymentDialog write;

    public DurationEmploymentDialog_ViewBinding(DurationEmploymentDialog durationEmploymentDialog, View view) {
        this.write = durationEmploymentDialog;
        durationEmploymentDialog.twoPickerView = (CustomTwoPicker) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pickerView, "field 'twoPickerView'", CustomTwoPicker.class);
        durationEmploymentDialog.positiveButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_positive_button, "field 'positiveButton'", Button.class);
    }

    public final void read() {
        DurationEmploymentDialog durationEmploymentDialog = this.write;
        if (durationEmploymentDialog != null) {
            this.write = null;
            durationEmploymentDialog.twoPickerView = null;
            durationEmploymentDialog.positiveButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
