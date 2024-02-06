package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.privacymanagement.PrivacyManagementService;
import java.util.List;
import p040o.GoogleMap;

/* renamed from: o.zzkw */
public final class zzkw implements AsynchronousComputationException {
    final Response MediaBrowserCompat$ItemReceiver;
    private final String read;
    private final PrivacyManagementService write;

    @HmlPinActivity
    public zzkw(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, PrivacyManagementService privacyManagementService, Response response) {
        onGetStartedClick.write((Object) str, "tileVersion");
        onGetStartedClick.write((Object) privacyManagementService, "mService");
        onGetStartedClick.write((Object) response, "mMapper");
        this.read = str;
        this.write = privacyManagementService;
        this.MediaBrowserCompat$ItemReceiver = response;
    }

    public final BScanCNotificationDeepLinkActivity<List<GoogleMap.OnCircleClickListener>> read() {
        BScanCNotificationDeepLinkActivity<SingleDataEntity<TSnackbar$SnackbarLayout>> privacyList = this.write.getPrivacyList(this.read);
        DirectDebitDeepLinkActivity zzkw_mediabrowsercompat_customactionresultreceiver = new zzkw$MediaBrowserCompat$CustomActionResultReceiver(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(zzkw_mediabrowsercompat_customactionresultreceiver, "mapper is null");
        onCopy oncopy = new onCopy(privacyList, zzkw_mediabrowsercompat_customactionresultreceiver);
        onGetStartedClick.IconCompatParcelizer((Object) oncopy, "mService.getPrivacyList(…pper.transform(it.data) }");
        return oncopy;
    }
}
