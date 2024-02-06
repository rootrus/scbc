package p040o;

import java.io.IOException;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1ParsingException;

/* renamed from: o.DiscoverFundFilterListAdapter$CheckListHolder_ViewBinding */
final class DiscoverFundFilterListAdapter$CheckListHolder_ViewBinding implements Enumeration {
    private Object MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
    private CompanyItemViewHolder write;

    public DiscoverFundFilterListAdapter$CheckListHolder_ViewBinding(byte[] bArr) {
        this.write = new CompanyItemViewHolder(bArr, (byte) 0);
    }

    public final boolean hasMoreElements() {
        return this.MediaBrowserCompat$CustomActionResultReceiver != null;
    }

    public final Object nextElement() {
        Object obj = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver();
        return obj;
    }

    private Object MediaBrowserCompat$CustomActionResultReceiver() {
        try {
            return this.write.MediaBrowserCompat$ItemReceiver();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("malformed DER construction: ");
            sb.append(e);
            throw new ASN1ParsingException(sb.toString(), e);
        }
    }
}
