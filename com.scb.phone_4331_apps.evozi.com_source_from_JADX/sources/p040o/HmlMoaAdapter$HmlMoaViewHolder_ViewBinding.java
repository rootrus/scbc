package p040o;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* renamed from: o.HmlMoaAdapter$HmlMoaViewHolder_ViewBinding */
public final class HmlMoaAdapter$HmlMoaViewHolder_ViewBinding implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder {
    private HmlDocumentsUploadedAdapter$DocumentViewHolder MediaBrowserCompat$ItemReceiver;

    HmlMoaAdapter$HmlMoaViewHolder_ViewBinding(HmlDocumentsUploadedAdapter$DocumentViewHolder hmlDocumentsUploadedAdapter$DocumentViewHolder) {
        this.MediaBrowserCompat$ItemReceiver = hmlDocumentsUploadedAdapter$DocumentViewHolder;
    }

    public final C10402xc503e64f read() throws IOException {
        return new SimulatorTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding(this.MediaBrowserCompat$ItemReceiver.write());
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        try {
            return read();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
