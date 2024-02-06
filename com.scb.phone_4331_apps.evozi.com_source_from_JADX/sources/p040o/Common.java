package p040o;

import com.scb.phone.view.fragment.mailingaddress.BaseMailingAddressFragment;
import java.util.List;

/* renamed from: o.Common */
public final /* synthetic */ class Common implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ BaseMailingAddressFragment.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ Common(BaseMailingAddressFragment.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(requestGoogleAccountsAccess.MediaBrowserCompat$CustomActionResultReceiver((List) obj));
    }
}
