package p040o;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* renamed from: o.RiskLevelsAdapter$RiskLevelHolder */
public final class RiskLevelsAdapter$RiskLevelHolder implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder {
    private HmlDocumentsUploadedAdapter$DocumentViewHolder write;

    RiskLevelsAdapter$RiskLevelHolder(HmlDocumentsUploadedAdapter$DocumentViewHolder hmlDocumentsUploadedAdapter$DocumentViewHolder) {
        this.write = hmlDocumentsUploadedAdapter$DocumentViewHolder;
    }

    public final C10402xc503e64f read() throws IOException {
        return new BasicAssetAllocationAdapter$BaaHolder_ViewBinding(this.write.write(), (byte) 0);
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        try {
            return read();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
