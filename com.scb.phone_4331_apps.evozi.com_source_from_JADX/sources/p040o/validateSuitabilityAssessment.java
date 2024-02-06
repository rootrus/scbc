package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.chequemanagement.ChequeSuccessFragment;

/* renamed from: o.validateSuitabilityAssessment */
public final /* synthetic */ class validateSuitabilityAssessment implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ ChequeSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ validateSuitabilityAssessment(ChequeSuccessFragment chequeSuccessFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = chequeSuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        ChequeSuccessFragment.write(this.MediaBrowserCompat$CustomActionResultReceiver, (Uri) obj);
    }
}
