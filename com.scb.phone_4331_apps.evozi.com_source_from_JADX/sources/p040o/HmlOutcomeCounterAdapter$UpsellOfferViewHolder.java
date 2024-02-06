package p040o;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* renamed from: o.HmlOutcomeCounterAdapter$UpsellOfferViewHolder */
public final class HmlOutcomeCounterAdapter$UpsellOfferViewHolder implements GiftMoneySelectThemeAdapter$GiftMoneySelectThemeViewHolder {
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlDocumentsUploadedAdapter$DocumentViewHolder write;

    HmlOutcomeCounterAdapter$UpsellOfferViewHolder(int i, HmlDocumentsUploadedAdapter$DocumentViewHolder hmlDocumentsUploadedAdapter$DocumentViewHolder) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.write = hmlDocumentsUploadedAdapter$DocumentViewHolder;
    }

    public final C10402xc503e64f read() throws IOException {
        return new HmlOutcomeCounterAdapter$CounterOfferViewHolder(this.MediaBrowserCompat$CustomActionResultReceiver, this.write.write());
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        try {
            return read();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
