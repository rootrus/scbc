package p040o;

import java.io.IOException;

/* renamed from: o.ScbsProductAdapter$ScbsProductViewHolder */
public final class ScbsProductAdapter$ScbsProductViewHolder extends C10402xc503e64f implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding {
    private final byte[] read;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    ScbsProductAdapter$ScbsProductViewHolder(byte[] bArr) {
        this.read = bArr;
    }

    public final String MediaMetadataCompat() {
        return MoneyActionAdapter$CustomViewHolder.IconCompatParcelizer(this.read);
    }

    public final String toString() {
        return MediaMetadataCompat();
    }

    public final int hashCode() {
        return C6958xd50139e8.read(this.read);
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof ScbsProductAdapter$ScbsProductViewHolder)) {
            return false;
        }
        return C6958xd50139e8.write(this.read, ((ScbsProductAdapter$ScbsProductViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read);
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.read.length) + 1 + this.read.length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.read;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(12);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }
}
