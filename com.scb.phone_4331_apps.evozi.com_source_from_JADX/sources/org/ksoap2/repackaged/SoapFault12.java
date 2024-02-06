package org.ksoap2.repackaged;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.IOException;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;
import p040o.DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding;
import p040o.HistoryAdapter$GroupErrorViewHolder_ViewBinding;
import p040o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding;

public class SoapFault12 extends SoapFault {
    private DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding MediaBrowserCompat$SearchResultReceiver;
    private DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding MediaDescriptionCompat;
    private DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding read;

    public SoapFault12() {
    }

    public SoapFault12(byte b) {
    }

    public String getMessage() {
        SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding read2 = this.MediaBrowserCompat$SearchResultReceiver.read("http://www.w3.org/2003/05/soap-envelope", "Text");
        if (read2.IconCompatParcelizer(0)) {
            return (String) read2.write.elementAt(0);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r6 = this;
            o.DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding r0 = r6.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r1 = "http://www.w3.org/2003/05/soap-envelope"
            java.lang.String r2 = "Text"
            o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding r0 = r0.read(r1, r2)
            r2 = 0
            boolean r3 = r0.IconCompatParcelizer(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001b
            java.util.Vector r0 = r0.write
            java.lang.Object r0 = r0.elementAt(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x001c
        L_0x001b:
            r0 = r4
        L_0x001c:
            o.DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding r3 = r6.read
            java.lang.String r5 = "Value"
            o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding r1 = r3.read(r1, r5)
            boolean r3 = r1.IconCompatParcelizer(r2)
            if (r3 == 0) goto L_0x0033
            java.util.Vector r1 = r1.write
            java.lang.Object r1 = r1.elementAt(r2)
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
        L_0x0033:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Code: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", Reason: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.ksoap2.repackaged.SoapFault12.toString():java.lang.String");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding) throws IOException, XmlPullParserException {
        String str;
        String str2;
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(2, "http://www.w3.org/2003/05/soap-envelope", "Fault");
        while (historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem() == 2) {
            String MediaDescriptionCompat2 = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat();
            String MediaBrowserCompat$MediaItem = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
            historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
            if (MediaDescriptionCompat2.toLowerCase().equals("Code".toLowerCase())) {
                DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding = new DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding();
                this.read = depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding;
                depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding);
            } else if (MediaDescriptionCompat2.toLowerCase().equals("Reason".toLowerCase())) {
                DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding2 = new DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding();
                this.MediaBrowserCompat$SearchResultReceiver = depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding2;
                depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding2.MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding);
            } else if (MediaDescriptionCompat2.toLowerCase().equals("Node".toLowerCase())) {
                new DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding().MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding);
            } else if (MediaDescriptionCompat2.toLowerCase().equals("Role".toLowerCase())) {
                new DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding().MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding);
            } else if (MediaDescriptionCompat2.toLowerCase().equals("Detail".toLowerCase())) {
                DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding3 = new DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding();
                this.MediaDescriptionCompat = depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding3;
                depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding3.MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected tag:");
                sb.append(MediaDescriptionCompat2);
                throw new RuntimeException(sb.toString());
            }
            historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(3, MediaBrowserCompat$MediaItem, MediaDescriptionCompat2);
        }
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(3, "http://www.w3.org/2003/05/soap-envelope", "Fault");
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
        SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding read2 = this.read.read("http://www.w3.org/2003/05/soap-envelope", KtaJsonExactionHelper.VALUE);
        if (read2.IconCompatParcelizer(0)) {
            str = (String) read2.write.elementAt(0);
        } else {
            str = null;
        }
        this.write = str;
        SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding read3 = this.MediaBrowserCompat$SearchResultReceiver.read("http://www.w3.org/2003/05/soap-envelope", "Text");
        if (read3.IconCompatParcelizer(0)) {
            str2 = (String) read3.write.elementAt(0);
        } else {
            str2 = null;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = this.MediaDescriptionCompat;
        this.MediaBrowserCompat$ItemReceiver = null;
    }
}
