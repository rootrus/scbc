package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.registration.preregistration.PreregistrationInformationFragment;

/* renamed from: o.ActivityBuilder_ContributePartnerLandingActivity */
public final /* synthetic */ class ActivityBuilder_ContributePartnerLandingActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ PreregistrationInformationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributePartnerLandingActivity(PreregistrationInformationFragment preregistrationInformationFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = preregistrationInformationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C5072nu nuVar = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        C10085oe oeVar = C10085oe.MediaBrowserCompat$CustomActionResultReceiver;
        if (nuVar.RatingCompat != null) {
            oeVar.IconCompatParcelizer(nuVar.RatingCompat);
        }
    }
}
