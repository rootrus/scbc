package p040o;

import com.scb.phone.view.activity.mwpartner.MwOnboardInfoActivity;
import p040o.TaskRunner;

/* renamed from: o.getDay */
public final /* synthetic */ class getDay implements C6992x633f693d {
    private final /* synthetic */ MwOnboardInfoActivity IconCompatParcelizer;

    public /* synthetic */ getDay(MwOnboardInfoActivity mwOnboardInfoActivity) {
        this.IconCompatParcelizer = mwOnboardInfoActivity;
    }

    public final boolean read(String str) {
        TaskRunner.TaskCompletedEvent taskCompletedEvent = this.IconCompatParcelizer.presenter;
        getErrorRecommendation geterrorrecommendation = new getErrorRecommendation(str);
        if (taskCompletedEvent.RatingCompat != null) {
            geterrorrecommendation.IconCompatParcelizer(taskCompletedEvent.RatingCompat);
        }
        return true;
    }
}
