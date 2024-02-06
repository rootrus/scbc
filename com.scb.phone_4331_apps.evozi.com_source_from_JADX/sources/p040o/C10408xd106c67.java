package p040o;

import java.io.IOException;

/* renamed from: o.InvestmentDetailsTransactionAdapter$TransactionHolder_ViewBinding */
public final class C10408xd106c67 implements HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder {
    private HmlDocumentsUploadedAdapter$DocumentViewHolder read;

    C10408xd106c67(HmlDocumentsUploadedAdapter$DocumentViewHolder hmlDocumentsUploadedAdapter$DocumentViewHolder) {
        this.read = hmlDocumentsUploadedAdapter$DocumentViewHolder;
    }

    public final C10402xc503e64f read() throws IOException {
        return new InvestmentDetailsTransactionAdapter$TransactionHolder(this.read.write());
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        try {
            return read();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
