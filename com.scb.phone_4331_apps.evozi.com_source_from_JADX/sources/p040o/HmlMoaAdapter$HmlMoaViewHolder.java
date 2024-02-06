package p040o;

import java.io.IOException;

/* renamed from: o.HmlMoaAdapter$HmlMoaViewHolder */
public final class HmlMoaAdapter$HmlMoaViewHolder implements HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder {
    private HmlDocumentsUploadedAdapter$DocumentViewHolder IconCompatParcelizer;

    HmlMoaAdapter$HmlMoaViewHolder(HmlDocumentsUploadedAdapter$DocumentViewHolder hmlDocumentsUploadedAdapter$DocumentViewHolder) {
        this.IconCompatParcelizer = hmlDocumentsUploadedAdapter$DocumentViewHolder;
    }

    public final C10402xc503e64f read() throws IOException {
        return new InsurersAdapter$InsurersViewHolder_ViewBinding(this.IconCompatParcelizer.write());
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        try {
            return read();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
