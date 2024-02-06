package p040o;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* renamed from: o.FundClientListAdapter$ItemViewHolder_ViewBinding */
public final class FundClientListAdapter$ItemViewHolder_ViewBinding implements GiftMoneySelectThemeAdapter$GiftMoneySelectThemeViewHolder {
    private boolean IconCompatParcelizer;
    private int MediaBrowserCompat$ItemReceiver;
    private HmlDocumentsUploadedAdapter$DocumentViewHolder write;

    FundClientListAdapter$ItemViewHolder_ViewBinding(boolean z, int i, HmlDocumentsUploadedAdapter$DocumentViewHolder hmlDocumentsUploadedAdapter$DocumentViewHolder) {
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.write = hmlDocumentsUploadedAdapter$DocumentViewHolder;
    }

    public final C10402xc503e64f read() throws IOException {
        return this.write.write(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        try {
            return read();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }
}
