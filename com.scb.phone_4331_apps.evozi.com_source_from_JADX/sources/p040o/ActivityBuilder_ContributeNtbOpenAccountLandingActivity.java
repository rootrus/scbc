package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.registration.preregistration.PreregistrationInformationFragment;

/* renamed from: o.ActivityBuilder_ContributeNtbOpenAccountLandingActivity */
public final /* synthetic */ class ActivityBuilder_ContributeNtbOpenAccountLandingActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ PreregistrationInformationFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeNtbOpenAccountLandingActivity(PreregistrationInformationFragment preregistrationInformationFragment) {
        this.IconCompatParcelizer = preregistrationInformationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C5072nu nuVar = this.IconCompatParcelizer.presenter;
        C5088od odVar = C5088od.read;
        if (nuVar.RatingCompat != null) {
            odVar.IconCompatParcelizer(nuVar.RatingCompat);
        }
    }
}
