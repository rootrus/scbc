package p040o;

import org.apache.http.HttpException;
import org.apache.http.ProtocolException;

/* renamed from: o.DeejungInstallmentsReviewAdapter$ReviewBottomViewHolder */
public final class DeejungInstallmentsReviewAdapter$ReviewBottomViewHolder implements ThirdPartyConsentFragment_ViewBinding {
    private final int MediaBrowserCompat$CustomActionResultReceiver;

    private DeejungInstallmentsReviewAdapter$ReviewBottomViewHolder(byte b) {
        this.MediaBrowserCompat$CustomActionResultReceiver = -1;
    }

    public DeejungInstallmentsReviewAdapter$ReviewBottomViewHolder() {
        this((byte) 0);
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver(PrivacyManagementLandingActivity privacyManagementLandingActivity) throws HttpException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingActivity, "HTTP message");
        PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver2 = privacyManagementLandingActivity.MediaBrowserCompat$CustomActionResultReceiver("Transfer-Encoding");
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            String MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver();
            if ("chunked".equalsIgnoreCase(MediaBrowserCompat$ItemReceiver)) {
                if (!privacyManagementLandingActivity.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver(ManageAccountInboundActivity.write)) {
                    return -2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Chunked transfer encoding not allowed for ");
                sb.append(privacyManagementLandingActivity.MediaBrowserCompat$ItemReceiver());
                throw new ProtocolException(sb.toString());
            } else if ("identity".equalsIgnoreCase(MediaBrowserCompat$ItemReceiver)) {
                return -1;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unsupported transfer encoding: ");
                sb2.append(MediaBrowserCompat$ItemReceiver);
                throw new ProtocolException(sb2.toString());
            }
        } else {
            PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver3 = privacyManagementLandingActivity.MediaBrowserCompat$CustomActionResultReceiver("Content-Length");
            if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                return -1;
            }
            String MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$ItemReceiver();
            try {
                long parseLong = Long.parseLong(MediaBrowserCompat$ItemReceiver2);
                if (parseLong >= 0) {
                    return parseLong;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Negative content length: ");
                sb3.append(MediaBrowserCompat$ItemReceiver2);
                throw new ProtocolException(sb3.toString());
            } catch (NumberFormatException unused) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Invalid content length: ");
                sb4.append(MediaBrowserCompat$ItemReceiver2);
                throw new ProtocolException(sb4.toString());
            }
        }
    }
}
