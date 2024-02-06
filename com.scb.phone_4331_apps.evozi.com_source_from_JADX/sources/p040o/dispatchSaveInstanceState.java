package p040o;

import com.scb.phone.view.activity.personallimit.PersonalLimitActivity;
import p040o.setTitleMarginStart;

/* renamed from: o.dispatchSaveInstanceState */
public final /* synthetic */ class dispatchSaveInstanceState implements setTitleMarginStart.IconCompatParcelizer {
    private final /* synthetic */ PersonalLimitActivity IconCompatParcelizer;

    public /* synthetic */ dispatchSaveInstanceState(PersonalLimitActivity personalLimitActivity) {
        this.IconCompatParcelizer = personalLimitActivity;
    }

    public final void write() {
        PersonalLimitActivity personalLimitActivity = this.IconCompatParcelizer;
        if (personalLimitActivity.getSupportFragmentManager().write() > 0) {
            personalLimitActivity.mo11B_();
            personalLimitActivity.mo11B_().MediaBrowserCompat$CustomActionResultReceiver(true);
            return;
        }
        personalLimitActivity.setStackedBackground();
    }
}
