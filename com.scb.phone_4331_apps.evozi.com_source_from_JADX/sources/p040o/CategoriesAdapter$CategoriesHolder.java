package p040o;

import java.io.IOException;

/* renamed from: o.CategoriesAdapter$CategoriesHolder */
public final class CategoriesAdapter$CategoriesHolder extends C10402xc503e64f implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding {
    private final byte[] read;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public CategoriesAdapter$CategoriesHolder(byte[] bArr) {
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = null;
        } else {
            byte[] bArr3 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            bArr2 = bArr3;
        }
        this.read = bArr2;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.read.length) + 1 + this.read.length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.read;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(21);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    public final int hashCode() {
        return C6958xd50139e8.read(this.read);
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof CategoriesAdapter$CategoriesHolder)) {
            return false;
        }
        return C6958xd50139e8.write(this.read, ((CategoriesAdapter$CategoriesHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).read);
    }

    public final String MediaMetadataCompat() {
        return MoneyActionAdapter$CustomViewHolder.read(this.read);
    }
}
