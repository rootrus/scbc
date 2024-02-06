package p040o;

import java.io.IOException;

/* renamed from: o.InvestmentDetailsClientListAdapter$SingleViewHolder */
public final class InvestmentDetailsClientListAdapter$SingleViewHolder extends C10402xc503e64f implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding {
    private final byte[] IconCompatParcelizer;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    InvestmentDetailsClientListAdapter$SingleViewHolder(byte[] bArr) {
        this.IconCompatParcelizer = bArr;
    }

    public final String MediaMetadataCompat() {
        return MoneyActionAdapter$CustomViewHolder.read(this.IconCompatParcelizer);
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.IconCompatParcelizer.length) + 1 + this.IconCompatParcelizer.length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.IconCompatParcelizer;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(19);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    public final int hashCode() {
        return C6958xd50139e8.read(this.IconCompatParcelizer);
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof InvestmentDetailsClientListAdapter$SingleViewHolder)) {
            return false;
        }
        return C6958xd50139e8.write(this.IconCompatParcelizer, ((InvestmentDetailsClientListAdapter$SingleViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).IconCompatParcelizer);
    }

    public final String toString() {
        return MediaMetadataCompat();
    }
}
