package p040o;

import java.util.List;
import p040o.Barcode;

/* renamed from: o.BarcodeDetector */
public final /* synthetic */ class BarcodeDetector implements HmlBaseDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ BarcodeDetector(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return ((zzvo) obj).write.equalsIgnoreCase(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.BarcodeDetector$Builder */
    public final /* synthetic */ class Builder implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ List IconCompatParcelizer;

        public /* synthetic */ Builder(List list) {
            this.IconCompatParcelizer = list;
        }

        public final Object write(Object obj) {
            String str = (String) obj;
            BScanCNotificationDeepLinkActivity firstOrError = DebitCardResetOtpActivity.fromIterable(this.IconCompatParcelizer).filter(new BarcodeDetector(str)).firstOrError();
            Barcode.WiFi wiFi = new Barcode.WiFi(str);
            HmlLatestPersonalInformationDeepLinkActivity.write(wiFi, "mapper is null");
            return new onCopy(firstOrError, wiFi);
        }
    }
}
