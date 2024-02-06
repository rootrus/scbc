package p040o;

import com.scb.phone.view.fragment.profilemanagement.accounts.AddAccountsFragment;
import p040o.C9852ad;
import p040o.QuickExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.ActivityBuilder_ContributeJuristicOnboardingLandingActivity */
public final /* synthetic */ class ActivityBuilder_ContributeJuristicOnboardingLandingActivity implements C7101xb11ee437 {
    private final /* synthetic */ AddAccountsFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeJuristicOnboardingLandingActivity(AddAccountsFragment addAccountsFragment) {
        this.IconCompatParcelizer = addAccountsFragment;
    }

    public final void write(C3077xfe724d07 autoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage) {
        C4915ks ksVar = this.IconCompatParcelizer.addAccountsPresenter;
        C9852ad.C40062 r1 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                ((QuickExtractor.C70184) obj).read(new notifyBackgroundStateChangeListeners(C3077xfe724d07.this.write, C3077xfe724d07.this.IconCompatParcelizer, C3077xfe724d07.this.MediaBrowserCompat$ItemReceiver));
            }
        };
        if (ksVar.RatingCompat != null) {
            r1.IconCompatParcelizer(ksVar.RatingCompat);
        }
    }
}
