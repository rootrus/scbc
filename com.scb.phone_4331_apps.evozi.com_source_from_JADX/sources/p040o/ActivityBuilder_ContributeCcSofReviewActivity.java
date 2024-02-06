package p040o;

import android.view.View;
import com.scb.phone.view.fragment.investment.schedule.DayPickerDialog;

/* renamed from: o.ActivityBuilder_ContributeCcSofReviewActivity */
public final /* synthetic */ class ActivityBuilder_ContributeCcSofReviewActivity implements View.OnClickListener {
    private final /* synthetic */ DayPickerDialog read;

    public /* synthetic */ ActivityBuilder_ContributeCcSofReviewActivity(DayPickerDialog dayPickerDialog) {
        this.read = dayPickerDialog;
    }

    public final void onClick(View view) {
        DayPickerDialog dayPickerDialog = this.read;
        dayPickerDialog.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(dayPickerDialog.numberPicker.getValue());
        dayPickerDialog.dismiss();
    }
}
