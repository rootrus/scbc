package p040o;

import com.scb.phone.view.fragment.registration.preregistration.PreregistrationInformationFragment;

/* renamed from: o.ActivityBuilder_ContributePartnerConsentActivity */
public final /* synthetic */ class ActivityBuilder_ContributePartnerConsentActivity implements C6992x633f693d {
    private final /* synthetic */ PreregistrationInformationFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributePartnerConsentActivity(PreregistrationInformationFragment preregistrationInformationFragment) {
        this.MediaBrowserCompat$ItemReceiver = preregistrationInformationFragment;
    }

    public final boolean read(String str) {
        C5072nu nuVar = this.MediaBrowserCompat$ItemReceiver.presenter;
        C5063nj njVar = new C5063nj(str);
        if (nuVar.RatingCompat != null) {
            njVar.IconCompatParcelizer(nuVar.RatingCompat);
        }
        return true;
    }
}
