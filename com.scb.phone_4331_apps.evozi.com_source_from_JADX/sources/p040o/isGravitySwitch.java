package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingConsentActivity;

/* renamed from: o.isGravitySwitch */
public final /* synthetic */ class isGravitySwitch implements DialogInterface.OnClickListener {
    private final /* synthetic */ ScbsOnboardingConsentActivity read;

    public /* synthetic */ isGravitySwitch(ScbsOnboardingConsentActivity scbsOnboardingConsentActivity) {
        this.read = scbsOnboardingConsentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        getCaptureCriteria getcapturecriteria = this.read.presenter;
        removeLicenseFoundEventListener removelicensefoundeventlistener = removeLicenseFoundEventListener.read;
        if (getcapturecriteria.RatingCompat != null) {
            removelicensefoundeventlistener.IconCompatParcelizer(getcapturecriteria.RatingCompat);
        }
    }
}
