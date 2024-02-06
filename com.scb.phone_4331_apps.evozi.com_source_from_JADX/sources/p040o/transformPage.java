package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.registration.RegistrationPersonalInformationActivity;
import p040o.C10178z;

/* renamed from: o.transformPage */
public final /* synthetic */ class transformPage implements DialogInterface.OnClickListener {
    private final /* synthetic */ RegistrationPersonalInformationActivity write;

    public /* synthetic */ transformPage(RegistrationPersonalInformationActivity registrationPersonalInformationActivity) {
        this.write = registrationPersonalInformationActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RegistrationPersonalInformationActivity registrationPersonalInformationActivity = this.write;
        dialogInterface.dismiss();
        extractData extractdata = registrationPersonalInformationActivity.registrationPersonalInformationPresenter;
        C10178z.C101832 r3 = C10178z.C101832.IconCompatParcelizer;
        if (extractdata.RatingCompat != null) {
            r3.IconCompatParcelizer(extractdata.RatingCompat);
        }
    }
}
