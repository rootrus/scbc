package org.ksoap2.repackaged;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.io.IOException;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;
import p040o.DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding;
import p040o.HistoryAdapter$GroupErrorViewHolder_ViewBinding;

public class SoapFault extends IOException {
    public DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String write;

    public SoapFault() {
    }

    public SoapFault(byte b) {
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding) throws IOException, XmlPullParserException {
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(2, "http://schemas.xmlsoap.org/soap/envelope/", "Fault");
        while (historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem() == 2) {
            String MediaDescriptionCompat = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat();
            if (MediaDescriptionCompat.equals(ProductAction.ACTION_DETAIL)) {
                DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding = new DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding();
                this.IconCompatParcelizer = depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding;
                depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding);
                if (historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$MediaItem().equals("http://schemas.xmlsoap.org/soap/envelope/") && historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat().equals("Fault")) {
                    break;
                }
            } else {
                if (MediaDescriptionCompat.equals("faultcode")) {
                    this.write = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper();
                } else if (MediaDescriptionCompat.equals("faultstring")) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper();
                } else if (MediaDescriptionCompat.equals("faultactor")) {
                    this.MediaBrowserCompat$ItemReceiver = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected tag:");
                    sb.append(MediaDescriptionCompat);
                    throw new RuntimeException(sb.toString());
                }
                historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(3, (String) null, MediaDescriptionCompat);
            }
        }
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(3, "http://schemas.xmlsoap.org/soap/envelope/", "Fault");
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
    }

    public String getMessage() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SoapFault - faultcode: '");
        sb.append(this.write);
        sb.append("' faultstring: '");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("' faultactor: '");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("' detail: ");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }
}
