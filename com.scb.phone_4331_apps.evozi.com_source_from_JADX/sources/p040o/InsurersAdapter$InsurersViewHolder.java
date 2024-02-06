package p040o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ParsingException;

/* renamed from: o.InsurersAdapter$InsurersViewHolder */
public final class InsurersAdapter$InsurersViewHolder implements HmlDocumentListAdapter$DocumentViewHolder {
    private HmlDocumentsUploadedAdapter$DocumentViewHolder IconCompatParcelizer;

    InsurersAdapter$InsurersViewHolder(HmlDocumentsUploadedAdapter$DocumentViewHolder hmlDocumentsUploadedAdapter$DocumentViewHolder) {
        this.IconCompatParcelizer = hmlDocumentsUploadedAdapter$DocumentViewHolder;
    }

    public final InputStream MediaBrowserCompat$ItemReceiver() {
        return new PolicyCardAdapter$PolicyCardViewHolder_ViewBinding(this.IconCompatParcelizer);
    }

    public final C10402xc503e64f read() throws IOException {
        PolicyCardAdapter$PolicyCardViewHolder_ViewBinding policyCardAdapter$PolicyCardViewHolder_ViewBinding = new PolicyCardAdapter$PolicyCardViewHolder_ViewBinding(this.IconCompatParcelizer);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6961xbba4702b.read(policyCardAdapter$PolicyCardViewHolder_ViewBinding, byteArrayOutputStream);
        return new HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding(byteArrayOutputStream.toByteArray());
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
