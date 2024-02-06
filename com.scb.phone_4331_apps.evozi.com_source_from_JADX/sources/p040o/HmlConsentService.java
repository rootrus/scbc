package p040o;

import android.net.Uri;
import com.scb.phone.view.fragment.donations.SharingMomentsPreviewFragment;

/* renamed from: o.HmlConsentService */
public final /* synthetic */ class HmlConsentService implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ SharingMomentsPreviewFragment write;

    public /* synthetic */ HmlConsentService(SharingMomentsPreviewFragment sharingMomentsPreviewFragment) {
        this.write = sharingMomentsPreviewFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        SharingMomentsPreviewFragment.read(this.write, (Uri) obj);
    }
}
