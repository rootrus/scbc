package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.investment.schedule.SetupScheduleMonthlyFragment;

/* renamed from: o.ActivityBuilder_ContributeChubbReviewActivity */
public final /* synthetic */ class ActivityBuilder_ContributeChubbReviewActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ SetupScheduleMonthlyFragment read;

    public /* synthetic */ ActivityBuilder_ContributeChubbReviewActivity(SetupScheduleMonthlyFragment setupScheduleMonthlyFragment) {
        this.read = setupScheduleMonthlyFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        isAnimationTutorEnable isanimationtutorenable = this.read.presenter;
        addAboutToCaptureListener addabouttocapturelistener = new addAboutToCaptureListener(z);
        if (isanimationtutorenable.RatingCompat != null) {
            addabouttocapturelistener.IconCompatParcelizer(isanimationtutorenable.RatingCompat);
        }
        for (Integer put : isanimationtutorenable.MediaBrowserCompat$ItemReceiver.keySet()) {
            isanimationtutorenable.MediaBrowserCompat$ItemReceiver.put(put, Boolean.valueOf(z));
        }
        isanimationtutorenable.write();
    }
}
