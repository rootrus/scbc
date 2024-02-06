package p040o;

import com.scb.phone.view.custom.common.BubbleSelector;
import com.scb.phone.view.fragment.investment.schedule.SetupScheduleWeeklyFragment;

/* renamed from: o.ActivityBuilder_ContributeCloseAccountDetailsActivity */
public final /* synthetic */ class ActivityBuilder_ContributeCloseAccountDetailsActivity implements BubbleSelector.read {
    private final /* synthetic */ SetupScheduleWeeklyFragment read;

    public /* synthetic */ ActivityBuilder_ContributeCloseAccountDetailsActivity(SetupScheduleWeeklyFragment setupScheduleWeeklyFragment) {
        this.read = setupScheduleWeeklyFragment;
    }

    public final void write(String str, boolean z) {
        removePageDetectionListener removepagedetectionlistener = this.read.presenter;
        boolean z2 = true;
        if (z) {
            initBase initbase = new initBase(str);
            if (removepagedetectionlistener.RatingCompat != null) {
                initbase.IconCompatParcelizer(removepagedetectionlistener.RatingCompat);
            }
        } else {
            getZoomOutMessage getzoomoutmessage = getZoomOutMessage.IconCompatParcelizer;
            if (removepagedetectionlistener.RatingCompat != null) {
                getzoomoutmessage.IconCompatParcelizer(removepagedetectionlistener.RatingCompat);
            }
        }
        removepagedetectionlistener.read = z;
        if (removepagedetectionlistener.read) {
            getZoomInMessage getzoominmessage = getZoomInMessage.read;
            if (removepagedetectionlistener.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                getzoominmessage.IconCompatParcelizer(removepagedetectionlistener.RatingCompat);
                return;
            }
            return;
        }
        getHoldSteadyMessage getholdsteadymessage = getHoldSteadyMessage.IconCompatParcelizer;
        if (removepagedetectionlistener.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            getholdsteadymessage.IconCompatParcelizer(removepagedetectionlistener.RatingCompat);
        }
    }
}
