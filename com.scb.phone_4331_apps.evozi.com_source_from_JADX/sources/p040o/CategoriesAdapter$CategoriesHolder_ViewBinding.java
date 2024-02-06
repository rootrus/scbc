package p040o;

import java.io.IOException;

/* renamed from: o.CategoriesAdapter$CategoriesHolder_ViewBinding */
public final class CategoriesAdapter$CategoriesHolder_ViewBinding extends C10402xc503e64f implements HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding {
    private final byte[] MediaBrowserCompat$CustomActionResultReceiver;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    CategoriesAdapter$CategoriesHolder_ViewBinding(byte[] bArr) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bArr;
    }

    public final String MediaMetadataCompat() {
        return MoneyActionAdapter$CustomViewHolder.read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final String toString() {
        return MediaMetadataCompat();
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(this.MediaBrowserCompat$CustomActionResultReceiver.length) + 1 + this.MediaBrowserCompat$CustomActionResultReceiver.length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(26);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof CategoriesAdapter$CategoriesHolder_ViewBinding)) {
            return false;
        }
        return C6958xd50139e8.write(this.MediaBrowserCompat$CustomActionResultReceiver, ((CategoriesAdapter$CategoriesHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        return C6958xd50139e8.read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
