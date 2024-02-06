package p040o;

import com.scb.phone.view.custom.common.BubbleSelector;
import com.scb.phone.view.fragment.investment.schedule.SetupScheduleMonthlyFragment;

/* renamed from: o.ActivityBuilder_ContributeChequeAnnouncementActivity */
public final /* synthetic */ class ActivityBuilder_ContributeChequeAnnouncementActivity implements BubbleSelector.read {
    private final /* synthetic */ SetupScheduleMonthlyFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeChequeAnnouncementActivity(SetupScheduleMonthlyFragment setupScheduleMonthlyFragment) {
        this.IconCompatParcelizer = setupScheduleMonthlyFragment;
    }

    public final void write(String str, boolean z) {
        this.IconCompatParcelizer.presenter.write(str, z);
    }
}
