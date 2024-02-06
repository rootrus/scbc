package p040o;

import com.scb.phone.view.fragment.landingpage.LandingFragment;
import p040o.C10829Sizeof;

/* renamed from: o.ActivityBuilder_ContributeDebitCardRequestSuccessActivity */
public final /* synthetic */ class ActivityBuilder_ContributeDebitCardRequestSuccessActivity implements C6992x633f693d {
    private final /* synthetic */ LandingFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeDebitCardRequestSuccessActivity(LandingFragment landingFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = landingFragment;
    }

    public final boolean read(String str) {
        C10829Sizeof.C37931 r0 = this.MediaBrowserCompat$CustomActionResultReceiver.landingPagePresenter;
        nativeGetPermissions nativegetpermissions = new nativeGetPermissions(str);
        if (r0.RatingCompat != null) {
            nativegetpermissions.IconCompatParcelizer(r0.RatingCompat);
        }
        return true;
    }
}
