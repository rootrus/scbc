package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.easycash.issuer.EasycashIssuerLandingFragment;

/* renamed from: o.RegistrationService */
public final /* synthetic */ class RegistrationService implements DialogInterface.OnClickListener {
    private final /* synthetic */ EasycashIssuerLandingFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ RegistrationService(EasycashIssuerLandingFragment easycashIssuerLandingFragment, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashIssuerLandingFragment;
        this.write = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.write);
    }
}
