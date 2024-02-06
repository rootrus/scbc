package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.IOException;
import okhttp3.internal.cache.DiskLruCache;
import org.ksoap2.repackaged.SoapFault;
import org.ksoap2.repackaged.SoapFault12;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;

/* renamed from: o.LendingIssuerAdapter$IssuerViewHolder_ViewBinding */
public class LendingIssuerAdapter$IssuerViewHolder_ViewBinding {
    public Object IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver = "http://schemas.xmlsoap.org/soap/encoding/";
    public Object MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    private SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding[] MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat = "http://www.w3.org/2001/XMLSchema-instance";
    public int MediaMetadataCompat = 110;
    public String RatingCompat = "http://www.w3.org/2001/XMLSchema";
    public String read = "http://schemas.xmlsoap.org/soap/envelope/";
    public SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding[] write;

    public static boolean IconCompatParcelizer(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.equals(DiskLruCache.VERSION_1) || lowerCase.equals("true")) {
            return true;
        }
        return false;
    }

    public LendingIssuerAdapter$IssuerViewHolder_ViewBinding(int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(p040o.HistoryAdapter$GroupErrorViewHolder_ViewBinding r13) throws java.io.IOException, org.xmlpull.repackaged.p103v1.XmlPullParserException {
        /*
            r12 = this;
            r13.MediaSessionCompat$QueueItem()
            java.lang.String r0 = r12.read
            java.lang.String r1 = "Envelope"
            r2 = 2
            r13.MediaBrowserCompat$CustomActionResultReceiver(r2, r0, r1)
            java.lang.String r0 = r12.read
            java.lang.String r3 = "encodingStyle"
            java.lang.String r0 = r13.MediaBrowserCompat$ItemReceiver(r0, r3)
            r12.MediaBrowserCompat$MediaItem = r0
            r13.MediaSessionCompat$QueueItem()
            int r0 = r13.write()
            r4 = 3
            if (r0 != r2) goto L_0x0099
            java.lang.String r0 = r13.MediaBrowserCompat$MediaItem()
            java.lang.String r5 = r12.read
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = r13.MediaDescriptionCompat()
            java.lang.String r5 = "Header"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0099
            r13.MediaSessionCompat$QueueItem()
            o.DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding r0 = new o.DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding
            r0.<init>()
            r0.MediaBrowserCompat$ItemReceiver(r13)
            r6 = 0
            r7 = r6
            r8 = r7
        L_0x0045:
            java.util.Vector r9 = r0.write
            if (r9 != 0) goto L_0x004b
            r9 = r6
            goto L_0x004f
        L_0x004b:
            int r9 = r9.size()
        L_0x004f:
            r10 = 0
            if (r7 >= r9) goto L_0x0066
            java.util.Vector r9 = r0.write
            java.lang.Object r9 = r9.elementAt(r7)
            boolean r11 = r9 instanceof p040o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding
            if (r11 == 0) goto L_0x005f
            r10 = r9
            o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding r10 = (p040o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding) r10
        L_0x005f:
            if (r10 == 0) goto L_0x0063
            int r8 = r8 + 1
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x0045
        L_0x0066:
            o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding[] r7 = new p040o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding[r8]
            r12.MediaBrowserCompat$SearchResultReceiver = r7
            r7 = r6
            r8 = r7
        L_0x006c:
            java.util.Vector r9 = r0.write
            if (r9 != 0) goto L_0x0072
            r9 = r6
            goto L_0x0076
        L_0x0072:
            int r9 = r9.size()
        L_0x0076:
            if (r7 >= r9) goto L_0x0091
            java.util.Vector r9 = r0.write
            java.lang.Object r9 = r9.elementAt(r7)
            boolean r11 = r9 instanceof p040o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding
            if (r11 == 0) goto L_0x0085
            o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding r9 = (p040o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding) r9
            goto L_0x0086
        L_0x0085:
            r9 = r10
        L_0x0086:
            if (r9 == 0) goto L_0x008e
            o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding[] r11 = r12.MediaBrowserCompat$SearchResultReceiver
            r11[r8] = r9
            int r8 = r8 + 1
        L_0x008e:
            int r7 = r7 + 1
            goto L_0x006c
        L_0x0091:
            java.lang.String r0 = r12.read
            r13.MediaBrowserCompat$CustomActionResultReceiver(r4, r0, r5)
            r13.MediaSessionCompat$QueueItem()
        L_0x0099:
            java.lang.String r0 = r12.read
            java.lang.String r5 = "Body"
            r13.MediaBrowserCompat$CustomActionResultReceiver(r2, r0, r5)
            java.lang.String r0 = r12.read
            java.lang.String r0 = r13.MediaBrowserCompat$ItemReceiver(r0, r3)
            r12.MediaBrowserCompat$MediaItem = r0
            r12.write(r13)
            java.lang.String r0 = r12.read
            r13.MediaBrowserCompat$CustomActionResultReceiver(r4, r0, r5)
            r13.MediaSessionCompat$QueueItem()
            java.lang.String r0 = r12.read
            r13.MediaBrowserCompat$CustomActionResultReceiver(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.LendingIssuerAdapter$IssuerViewHolder_ViewBinding.IconCompatParcelizer(o.HistoryAdapter$GroupErrorViewHolder_ViewBinding):void");
    }

    public void write(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding) throws IOException, XmlPullParserException {
        SoapFault soapFault;
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$QueueItem();
        if (historyAdapter$GroupErrorViewHolder_ViewBinding.write() != 2 || !historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$MediaItem().equals(this.read) || !historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat().equals("Fault")) {
            Object obj = this.IconCompatParcelizer;
            DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding = obj instanceof DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding ? (DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding) obj : new DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding();
            depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding);
            this.IconCompatParcelizer = depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding;
            return;
        }
        if (this.MediaMetadataCompat < 120) {
            soapFault = new SoapFault((byte) 0);
        } else {
            soapFault = new SoapFault12((byte) 0);
        }
        soapFault.MediaBrowserCompat$CustomActionResultReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding);
        this.IconCompatParcelizer = soapFault;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding) throws IOException {
        historyAdapter$GroupItemViewHolder_ViewBinding.IconCompatParcelizer("i", this.MediaDescriptionCompat);
        historyAdapter$GroupItemViewHolder_ViewBinding.IconCompatParcelizer(KtaJsonExactionHelper.OBJECT, this.RatingCompat);
        historyAdapter$GroupItemViewHolder_ViewBinding.IconCompatParcelizer("c", this.MediaBrowserCompat$CustomActionResultReceiver);
        historyAdapter$GroupItemViewHolder_ViewBinding.IconCompatParcelizer("v", this.read);
        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.read, "Envelope");
        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.read, "Header");
        if (this.write != null) {
            int i = 0;
            while (true) {
                SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding[] selectProvinceOrDistrictAdapter$ViewHolder_ViewBindingArr = this.write;
                if (i >= selectProvinceOrDistrictAdapter$ViewHolder_ViewBindingArr.length) {
                    break;
                }
                selectProvinceOrDistrictAdapter$ViewHolder_ViewBindingArr[i].write(historyAdapter$GroupItemViewHolder_ViewBinding);
                i++;
            }
        }
        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(this.read, "Header");
        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.read, "Body");
        MediaBrowserCompat$ItemReceiver(historyAdapter$GroupItemViewHolder_ViewBinding);
        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(this.read, "Body");
        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(this.read, "Envelope");
    }

    public void MediaBrowserCompat$ItemReceiver(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding) throws IOException {
        String str = this.MediaBrowserCompat$MediaItem;
        if (str != null) {
            historyAdapter$GroupItemViewHolder_ViewBinding.read(this.read, "encodingStyle", str);
        }
        ((DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding) this.MediaBrowserCompat$ItemReceiver).write(historyAdapter$GroupItemViewHolder_ViewBinding);
    }
}
