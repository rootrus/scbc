package p040o;

import android.view.View;
import com.scb.phone.view.fragment.investment.schedule.DayPickerDialog;

/* renamed from: o.ActivityBuilder_ContributeCcSofSuccessActivity */
public final /* synthetic */ class ActivityBuilder_ContributeCcSofSuccessActivity implements View.OnClickListener {
    private final /* synthetic */ DayPickerDialog MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeCcSofSuccessActivity(DayPickerDialog dayPickerDialog) {
        this.MediaBrowserCompat$ItemReceiver = dayPickerDialog;
    }

    public final void onClick(View view) {
        DayPickerDialog dayPickerDialog = this.MediaBrowserCompat$ItemReceiver;
        dayPickerDialog.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(dayPickerDialog.numberPicker.getValue());
        dayPickerDialog.dismiss();
    }
}
