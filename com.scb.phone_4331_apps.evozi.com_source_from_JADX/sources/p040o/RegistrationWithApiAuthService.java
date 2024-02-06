package p040o;

import com.scb.phone.view.adapter.easycash.LendingIssuerAdapter;
import com.scb.phone.view.fragment.easycash.issuer.EasycashIssuerLandingFragment;

/* renamed from: o.RegistrationWithApiAuthService */
public final /* synthetic */ class RegistrationWithApiAuthService implements LendingIssuerAdapter.IconCompatParcelizer {
    private final /* synthetic */ EasycashIssuerLandingFragment write;

    public /* synthetic */ RegistrationWithApiAuthService(EasycashIssuerLandingFragment easycashIssuerLandingFragment) {
        this.write = easycashIssuerLandingFragment;
    }

    public final void read(String str) {
        EasycashIssuerLandingFragment.write(this.write, str);
    }
}
