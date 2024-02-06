package p040o;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Exception;
import org.spongycastle.asn1.ASN1ParsingException;

/* renamed from: o.InvestmentDetailsAssetGroupListAdapter$AssetGroupView_ViewBinding */
public final class C10405x15015106 implements HmlAboutAdapter$HmlAboutViewHolder_ViewBinding, DiscoverFundFilterAdapter$SubTitleHolder_ViewBinding {
    private HmlDocumentsUploadedAdapter$DocumentViewHolder write;

    public C10405x15015106(HmlDocumentsUploadedAdapter$DocumentViewHolder hmlDocumentsUploadedAdapter$DocumentViewHolder) {
        this.write = hmlDocumentsUploadedAdapter$DocumentViewHolder;
    }

    public final C10402xc503e64f read() throws IOException {
        try {
            return new InvestmentContextualAdsAdapter$AdViewHolder_ViewBinding(this.write.write());
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        try {
            return read();
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        }
    }
}
