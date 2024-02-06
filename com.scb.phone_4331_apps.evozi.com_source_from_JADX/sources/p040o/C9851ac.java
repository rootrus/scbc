package p040o;

import com.scb.phone.view.activity.deeplink.OprRenewDeepLinkActivity;
import com.scb.phone.view.activity.deeplink.PayNowTransactionsDeepLinkActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.ac */
public final /* synthetic */ class C9851ac implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFileSHA MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C9851ac(getFileSHA getfilesha) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getfilesha;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getPassportNumber) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.ac$1 */
    public final class C70961 implements MileageQuantitySelectionActivity<PayNowTransactionsDeepLinkActivity> {
        public static void IconCompatParcelizer(PayNowTransactionsDeepLinkActivity payNowTransactionsDeepLinkActivity, isGuidanceAvailable isguidanceavailable) {
            payNowTransactionsDeepLinkActivity.presenter = isguidanceavailable;
        }
    }

    /* renamed from: o.ac$a */
    public final class C7097a implements MileageQuantitySelectionActivity<OprRenewDeepLinkActivity> {
        public static void MediaBrowserCompat$CustomActionResultReceiver(OprRenewDeepLinkActivity oprRenewDeepLinkActivity, getInfoWindowAnchorU getinfowindowanchoru) {
            oprRenewDeepLinkActivity.deepLinkCase = getinfowindowanchoru;
        }

        public static void MediaBrowserCompat$CustomActionResultReceiver(OprRenewDeepLinkActivity oprRenewDeepLinkActivity, setFieldNamingStrategy setfieldnamingstrategy) {
            oprRenewDeepLinkActivity.presenter = setfieldnamingstrategy;
        }
    }
}
