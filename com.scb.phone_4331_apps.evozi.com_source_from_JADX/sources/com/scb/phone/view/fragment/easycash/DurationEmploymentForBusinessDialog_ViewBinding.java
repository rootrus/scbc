package com.scb.phone.view.fragment.easycash;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomTwoPicker;
import p040o.onStart;

public final class DurationEmploymentForBusinessDialog_ViewBinding implements Unbinder {
    private DurationEmploymentForBusinessDialog MediaBrowserCompat$ItemReceiver;

    public DurationEmploymentForBusinessDialog_ViewBinding(DurationEmploymentForBusinessDialog durationEmploymentForBusinessDialog, View view) {
        this.MediaBrowserCompat$ItemReceiver = durationEmploymentForBusinessDialog;
        durationEmploymentForBusinessDialog.twoPickerView = (CustomTwoPicker) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pickerView, "field 'twoPickerView'", CustomTwoPicker.class);
        durationEmploymentForBusinessDialog.positiveButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.dialog_positive_button, "field 'positiveButton'", Button.class);
    }

    public final void read() {
        DurationEmploymentForBusinessDialog durationEmploymentForBusinessDialog = this.MediaBrowserCompat$ItemReceiver;
        if (durationEmploymentForBusinessDialog != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            durationEmploymentForBusinessDialog.twoPickerView = null;
            durationEmploymentForBusinessDialog.positiveButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
