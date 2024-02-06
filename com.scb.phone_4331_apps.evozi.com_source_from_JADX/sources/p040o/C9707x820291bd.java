package p040o;

import org.apache.http.HttpException;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;

/* renamed from: o.DeejungInstallmentsReviewAdapter$PaymentDetailsViewHolder_ViewBinding */
public final class C9707x820291bd implements ThirdPartyConsentFragment_ViewBinding {
    private final int MediaBrowserCompat$CustomActionResultReceiver;

    private C9707x820291bd(byte b) {
        this.MediaBrowserCompat$CustomActionResultReceiver = -1;
    }

    public C9707x820291bd() {
        this((byte) 0);
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver(PrivacyManagementLandingActivity privacyManagementLandingActivity) throws HttpException {
        long j;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingActivity, "HTTP message");
        PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver2 = privacyManagementLandingActivity.MediaBrowserCompat$CustomActionResultReceiver("Transfer-Encoding");
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            try {
                PrepaidTravelConversionLandingActivity_ViewBinding[] MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver();
                int length = MediaBrowserCompat$CustomActionResultReceiver3.length;
                if (!"identity".equalsIgnoreCase(MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver()) && length > 0 && "chunked".equalsIgnoreCase(MediaBrowserCompat$CustomActionResultReceiver3[length - 1].read())) {
                    return -2;
                }
                return -1;
            } catch (ParseException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid Transfer-Encoding header value: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2);
                throw new ProtocolException(sb.toString(), e);
            }
        } else if (privacyManagementLandingActivity.MediaBrowserCompat$CustomActionResultReceiver("Content-Length") == null) {
            return -1;
        } else {
            PrepaidRequestMarketConductActivity[] MediaBrowserCompat$ItemReceiver = privacyManagementLandingActivity.MediaBrowserCompat$ItemReceiver("Content-Length");
            int length2 = MediaBrowserCompat$ItemReceiver.length - 1;
            while (true) {
                if (length2 < 0) {
                    j = -1;
                    break;
                }
                try {
                    j = Long.parseLong(MediaBrowserCompat$ItemReceiver[length2].MediaBrowserCompat$ItemReceiver());
                    break;
                } catch (NumberFormatException unused) {
                    length2--;
                }
            }
            if (j >= 0) {
                return j;
            }
            return -1;
        }
    }
}
