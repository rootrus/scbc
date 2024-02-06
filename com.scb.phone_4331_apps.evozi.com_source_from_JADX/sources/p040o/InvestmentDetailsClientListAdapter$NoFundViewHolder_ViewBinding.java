package p040o;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ParsingException;

/* renamed from: o.InvestmentDetailsClientListAdapter$NoFundViewHolder_ViewBinding */
public final class InvestmentDetailsClientListAdapter$NoFundViewHolder_ViewBinding implements HmlDocumentListAdapter$DocumentViewHolder {
    private DiscoverFundFilterAdapter$SelectListHolder_ViewBinding IconCompatParcelizer;

    InvestmentDetailsClientListAdapter$NoFundViewHolder_ViewBinding(DiscoverFundFilterAdapter$SelectListHolder_ViewBinding discoverFundFilterAdapter$SelectListHolder_ViewBinding) {
        this.IconCompatParcelizer = discoverFundFilterAdapter$SelectListHolder_ViewBinding;
    }

    public final InputStream MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer;
    }

    public final C10402xc503e64f read() throws IOException {
        return new C10407x3ea8e030(this.IconCompatParcelizer.write());
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        try {
            return read();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("IOException converting stream to byte array: ");
            sb.append(e.getMessage());
            throw new ASN1ParsingException(sb.toString(), e);
        }
    }
}
