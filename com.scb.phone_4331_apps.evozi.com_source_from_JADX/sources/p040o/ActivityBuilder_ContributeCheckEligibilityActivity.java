package p040o;

import android.view.View;
import com.scb.phone.view.fragment.investment.schedule.DayPickerDialog;

/* renamed from: o.ActivityBuilder_ContributeCheckEligibilityActivity */
public final /* synthetic */ class ActivityBuilder_ContributeCheckEligibilityActivity implements View.OnClickListener {
    private final /* synthetic */ DayPickerDialog MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeCheckEligibilityActivity(DayPickerDialog dayPickerDialog) {
        this.MediaBrowserCompat$ItemReceiver = dayPickerDialog;
    }

    public final void onClick(View view) {
        DayPickerDialog dayPickerDialog = this.MediaBrowserCompat$ItemReceiver;
        dayPickerDialog.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(dayPickerDialog.numberPicker.getValue());
        dayPickerDialog.dismiss();
    }
}
